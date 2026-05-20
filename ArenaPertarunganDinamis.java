import java.util.Scanner;
import java.util.ArrayList;

public class ArenaPertarunganDinamis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Musuh> gelombangMonster = new ArrayList<>();
        gelombangMonster.add(new Slime());
        gelombangMonster.add(new Naga());
        gelombangMonster.add(new Zombie());

        System.out.println("=======================");
        System.out.println(" ARENA RPG: GELOMBANG MONSTER ");
        System.out.println("=======================\n");
        System.out.println("AWAS! Sekelompok monster menghadang Anda!");

        boolean isBermain = true;

        while (isBermain && !gelombangMonster.isEmpty()) {

            System.out.println("\n=== STATUS MONSTER ===");

            for (int i = 0; i < gelombangMonster.size(); i++) {

                Musuh m = gelombangMonster.get(i);
                System.out.println((i + 1) + "." + m.namaMusuh + " (HP: " + m.healthPoint + ")");
            }
            System.out.println("0. Kabur dari pertarungan");
            System.out.println("\nPilih target monster: ");

            try {

                int pilihanTarget = input.nextInt();

                if (pilihanTarget == 0) {

                    System.out.println("Anda lari terbirit-birit dari arena....");
                    isBermain = false;
                    continue;
                }

                if (pilihanTarget < 1 || pilihanTarget > gelombangMonster.size()) {

                    System.out.println("Pilihan tidak valid! Anda membuang giliran.");
                    continue;
                }

                int indeksMonster = pilihanTarget - 1;
                Musuh target = gelombangMonster.get(indeksMonster);

                System.out.print("Masukkan kekuatan serangan Anda (10-100): ");
                int power = input.nextInt();

                if (power < 10 || power > 100) {

                    throw new SeranganTidakValidException(
                            "Kekuatan serangan harus di antara 10 sampai 100!");
                }

                System.out.println("\n>>> HASIL SERANGAN ANDA <<<");
                target.terimaDamage(power);
                if (target.healthPoint <= 0) {
                    System.out.println(target.namaMusuh + " hancur menjadi debu!");

                    if (target instanceof BisaLoot) {
                        BisaLoot loot = (BisaLoot) target;
                        loot.jatuhkanItem();
                    }
                    gelombangMonster.remove(indeksMonster);
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input, silahkan coba lagi");
                input.nextLine();
                continue;
            }
            if (gelombangMonster.isEmpty()) {
                System.out.println("\nSELAMAT! Semua monster sudah dikalahkan");
                break;
            }
        }
        System.out.println("\n<<< GILIRAN MONSTER MEMBALAS >>>");

        for (int i = 0; i < gelombangMonster.size(); i++) {

            Musuh monsterAktif = gelombangMonster.get(i);

            monsterAktif.suaraKhas();

            if (monsterAktif instanceof BisaTerbang) {

                System.out.println(
                        "[PERINGATAN! SERANGAN UDARA TERDETEKSI]");

                BisaTerbang monsterTerbang = (BisaTerbang) monsterAktif;

                monsterTerbang.lepasLandas();
                monsterTerbang.seranganUdara();

            } else {

                monsterAktif.serangPemain();
            }
        }
        System.out.println("-----------------------------------------");

        boolean semuaMati = true;
        for (int i = 0; i < gelombangMonster.size(); i++) {
            if (gelombangMonster.get(i).healthPoint > 0) {
                semuaMati = false;
                break;
            }
        }

        if (semuaMati)
            System.out.println("\nSELAMAT! Anda telah mengalahkan semua monster disini!");
        isBermain = false;

        input.close();
        System.out.println("Permainan Berakhir.");
    }
}
