package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class Main {
    
    static Logger log = Logger.getLogger(Main.class.getName());
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        log.info("Ingrese el numero para calcular su factorial:");
        int numero = entrada.nextInt();
        log.info("La factorizacion es:" + Funciones.fact(numero) + "\n");
        
        Scanner potenciaA = new Scanner(System.in);
        log.info("ingrese el valor de la base");
        int base = potenciaA.nextInt();
        log.info("ingrese el valor del exponente");
        int exponente = potenciaA.nextInt();
        log.info("el resultado de la potencia es: " + Funciones.potencia(base, exponente) + "\n");
        
        log.info("---------Pruebas---------");
        log.info("Prueba Factorial :" + Funciones.fact(3));
        log.info("Prueba Potencia :" + Funciones.potencia(2, 3));
        
        
     
        
    }
    
}
