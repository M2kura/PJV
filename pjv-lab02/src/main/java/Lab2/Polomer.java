package Lab2;

public class Polomer {
    public void kruh (double r){
        System.out.printf("Obvod kruhu o polomeru %.3f je %.3f\n", r, 2 * Math.PI * r);
    }
    void start(String[] args) {
        kruh(5);
    }
}
