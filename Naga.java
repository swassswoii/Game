public class Naga extends Musuh {
    public Naga() {
        this.namaMusuh = "Naga Bonar";
        this.healthPoint = 500;
    }

    @Override
    public void terimaDamage(int damage) {
        int damageMasuk = damage - 15;
        if (damageMasuk < 0)
            damageMasuk = 0;

        this.healthPoint -= damageMasuk;
        System.out.println("Armor Sisik: " + this.namaMusuh + " menahan serangan! Hanya menerima " + damageMasuk
                + " damage. Sisa HP: " + this.healthPoint);
    }
}
