
package co.edu.ucundinamarca.tallern;


public class sucesion {
    
    public static void main(String[] args){
        sucesion objBaj = new sucesion();
        objBaj.bajar(20);
        
        
    }
    
    
    public void bajar(int entrada){
        if(entrada  == 0){
            System.out.println("Finalizado");
        }else{
            System.out.println("Dismunullendo:" + entrada);
             bajar(entrada - 1);
        }
    }
            
            
}
