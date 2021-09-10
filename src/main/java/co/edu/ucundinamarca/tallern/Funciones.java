package co.edu.ucundinamarca.tallern;

public class Funciones {

    

    //  Recursivo fac
    public static int fact(int n) {
        if (n > 0) {
            int val = n * fact(n - 1);
            return val;
        }
        return 1;
    }
    // iterativo fac

    public static int factiter(int numero) {
        int val = 1;
        for (int i = 1; 1 <= numero; i++) {
            val = val * i;
        }
        return val;
    }
    // Recursivo Pot

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }

    }
    
   // Iterartivo pot 
    
    public static int potenciaiter (int base, int exponente ) {
    int valor = 1;
    for (int i = 1; i <= exponente; i++) {
      valor = valor * base;
    }
    return valor;
  }
    
       
    
    
    
}
