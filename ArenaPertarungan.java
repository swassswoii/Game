import java.util.Scanner;

public class ArenaPertarungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Musuh monster1 = new Slime();
        Musuh monster2 = new Naga();

        System.out.println("=====");
        System.out.println(" SELAMAT DATANG DI ARENA RPG 2D ");
        System.out.println("=====\n");

        boolean isBermain = true;
        while (isBermain) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Serang Slime");
            System.out.println("2. Serang Naga");
            System.out.println("3. Kabur (Keluar)");
            System.out.println("Pilih target serangan (1/2/3): ");
            int pilihanTarget = input.nextInt();

            if (pilihanTarget == 3) {
                System.out.println("\nAnda melarikan diri dari pertarungan...");
                isBermain = false;
                continue;
            }

            System.out.print("Masukkan kekuatan serangan Anda (10-100): ");
            int power = input.nextInt();

            System.out.println("\nPilih tipe balasan monster:");
            System.out.println("1. Serangan Fisik (Default)");
            System.out.println("2. Serangan Sihir");
            System.out.print("Pilihan (1/2): ");
            int tipeBalasan = input.nextInt();

            System.out.println("\n>>> HASIL PERTARUNGAN <<<");

            if (pilihanTarget == 1) {
                monster1.terimaDamage(power);

                if (tipeBalasan == 2) {
                    monster1.serang("Semburan Asam");
                } else {
                    monster1.serang();
                }
            } else if (pilihanTarget == 2) {
                monster2.terimaDamage(power);
                if (tipeBalasan == 2) {
                    monster2.serang("Api Panas");
                } else {
                    monster2.serang();
                }
            } else {
                System.out.println("Target tidak valid! Serangan Anda meleset. ");
            }
            System.out.println("\n------------------------");
        }
        input.close();
        System.out.println("Permainan Berakhir. " + "Sampai jumpa di petualangan berikutnya!");

    }
}
