package co.edu.ucundinamarca.tallern;

/**
 *
 * @author Dell
 */
public class MCD {

    public static int mcd(int a, int b) {
        if (b == 0 ) {
            return a ;
        }
        return mcd(b, a%b);
    }

    public static void main(String args[]) {
        int a = 96, b = 36;
        System.out.println("Inicio del Metodo"+ " " + "Val 1: " + a +"," + "Val 2:" + b );
        System.out.println("Fin del Metodo" +" " + "Val 1: " + a + "," + "Val 2:" + b );
        System.out.println("mcd(" + a + ", " + b + ")= " + mcd(a, b));
        

    }
}
