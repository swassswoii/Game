public class Slime extends Musuh implements BisaLoot {
    public Slime() {
        super("Slime Hijau", 50);
    }

    @Override
    public void serangPemain(){
        System.out.println(this.namaMusuh + " melompat dan menyiram cairan asam! Player -15 HP");
    }
    @Override
    public void suaraKhas(){
        System.out.println(this.namaMusuh + " pluk pluk");
    }
    @Override
    public void jatuhkanItem() {
        System.out.println(this.namaMusuh + " Slime yang dikalahkan menjatuhkan crystal." );
    }
}