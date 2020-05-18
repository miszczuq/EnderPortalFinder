public class Prosta {
    private double a;
    private double b;
    private int x;
    private int y;
    private double katAlfa;


    public Prosta(int y, int x,double katAlfa){
        this.setX(x);
        this.setY(y);
        this.setKatAlfa(katAlfa);
        this.setA(Math.tan(Math.toRadians(-katAlfa)));
        this.setB(getY()-(getA() *getX()));
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getKatAlfa() {
        return katAlfa;
    }

    public void setKatAlfa(double katAlfa) {
        this.katAlfa = katAlfa;
    }
}
