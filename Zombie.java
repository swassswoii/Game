public class Zombie extends Musuh{
     public Zombie() {
        super("Zombie GangnamStyle", 150);
    }

    @Override
    public void serangPemain(){
        System.out.println(this.namaMusuh + " mmelompat dan menggigit! Player -20 HP");
    }
    public void suaraKhas(){
        System.out.println(this.namaMusuh + " Grrrrr...Hungryyyy...");
    }
}
