public class Slime extends Musuh {
    public Slime() {
        this.namaMusuh = "Slime Hijau";
        this.healthPoint = 50;
    }

    @Override
    public void terimaDamage(int damage) {
        super.terimaDamage((damage));
        System.out.println("Efek Pasif: " + this.namaMusuh + " membelah diri menjadi dua karena diserang!");
    }

}
 