public class Naga extends Musuh {
    public Naga() {
        super("Naga Bonar", 500);
    }

    @Override
    public void serangPemain() {

        System.out.println(this.namaMusuh + " menyemburkan api panas dari udara! Player -50 HP");
    }
    public void suaraKhas() {
        System.out.println(this.namaMusuh + " RAWWWRRRRRRR");
    }
}
