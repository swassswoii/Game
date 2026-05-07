public class Slime extends Musuh {
    public Slime() {
        super("Slime Hijau", 50);
    }

    @Override
    public void serangPemain(){
        System.out.println(this.namaMusuh + " melompat dan menyiram cairan asam! Player -15 HP");
    }
    public void suaraKhas(){
        System.out.println(this.namaMusuh + " pluk pluk");
    }
}