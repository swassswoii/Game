public class Naga extends Musuh implements BisaTerbang, BisaLoot {
    public Naga() {
        super("Naga Bonar", 500);
    }

    @Override
    public void serangPemain() {

        System.out.println(this.namaMusuh + " menyemburkan api panas dari udara! Player -50 HP");
    }
    @Override
    public void suaraKhas() {
        System.out.println(this.namaMusuh + " RAWWWRRRRRRR");
    }
    @Override
    public void lepasLandas() {
        System.out.println(this.namaMusuh + " Terbang tinggi! Sulit diserang.");
    }
    @Override
    public void seranganUdara() {
        System.out.println(this.namaMusuh + " Menyemburkan api sangat panas! Pemain -80 HP.");
    }
    @Override
    public void jatuhkanItem() {
        System.out.println(this.namaMusuh + " Naga yang dikalahkan menjatuhkan Dragon Head." );
    }
}