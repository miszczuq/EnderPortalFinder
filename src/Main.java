public class Main {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Podaj kolejno x,z oraz kat pierwszego rzutu: ");
        int x=in.nextInt();
        int z=in.nextInt();
        double kat=in.nextDouble();
        System.out.println("\n------>Przesun sie w prawo o 300 blokow (pod katem ok 80 stopni)\n");
        System.out.println("Podaj kolejno x,z oraz kat drugiego rzutu: ");
        int x2=in.nextInt();
        int z2=in.nextInt();
        double kat2=in.nextDouble();
       /* int x=1515;
        int z=2993;
        double kat=-60;

        int x2=1520;
        int z2=3225;
        double kat2=-66;*/

        Prosta prosta3 = new Prosta(x,z,kat);
        Prosta prosta4 = new Prosta(x2,z2,kat2);
        punktPrzecieca(prosta3, prosta4);
    }
    public static void punktPrzecieca(Prosta prosta1, Prosta prosta2){
        double tmpA=prosta1.getA()-prosta2.getA();
        double z=(prosta2.getB()-prosta1.getB())/tmpA;
        double x=prosta1.getA()*z+prosta1.getB();

        System.out.println("Wspolrzedne spawnera: \n" +
                "X "+(int)x+
                "\nZ "+z);
        System.out.println("==========================================");

    }
}
