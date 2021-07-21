
package vezbe03menjacnica;

import java.util.Scanner;


public class Vezbe03Menjacnica {

  
    public static void main(String[] args) { 
        
        
        Scanner s = new Scanner(System.in);
       
        double eurProdajni = 118.16; 
        double eurKupovni = 119.23; 
        
        double usdProdajni = 101.56; 
        double usdKupovina = 102.45; 
        
        int opcija; 
        int drugaOpcija; 
        int iznos;  
        
        do { 
            
            System.out.println("1. Kupovina");
            System.out.println("2. Prodaja");
            System.out.println("3. Kraj rada"); 
            
            opcija = s.nextInt(); 
           
            
            switch(opcija) {
                case 1: 
                    System.out.println("1. Eur");
                    System.out.println("2. Usd");
                    drugaOpcija = s.nextInt(); 
                    System.out.println("Unesite Vas iznos"); 
                    iznos = s.nextInt(); 
                    if(drugaOpcija == 1){
                        System.out.println("Vas racun je " + (iznos * eurKupovni));
                    
                    }else if(drugaOpcija == 2){
                        System.out.println("Vas racun je " + (iznos * usdKupovina));
                    }else {
                        System.out.println("Greska");
                    } 
                    break; 
                case 2: 
                    System.out.println("1. Eur");
                    System.out.println("2. Usd");  
                    drugaOpcija = s.nextInt(); 
                    System.out.println("Unesite Vas iznos"); 
                    iznos = s.nextInt();  
                    
                    if(drugaOpcija == 1){
                        System.out.println("Vas racun je " + (iznos * eurProdajni));
                    }else if(drugaOpcija == 2){
                        System.out.println("Vas racun je " + (iznos * usdProdajni));
                    
                    }else {
                        System.out.println("Greska");
                    } 
                    break; 
                    
                case 3: 
                    System.out.println("Kraj rada! Hvala na paznji!"); 
                    break;
                default: 
                    System.out.println("Pogresan unos");
            
            }
        
        
        }while(opcija!=3);
    }
    
}
