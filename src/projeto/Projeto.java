package projeto;
import java.util.Scanner;

public class Projeto extends dados {
   
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in); 
       dados dado = new dados();
       
        int opc = 0;          
        while(opc != 9){
        System.out.println("------MENU------");
        System.out.println("................");
        System.out.println("Escolha uma opção");
        System.out.println("1: Calculadora");
        System.out.println("2: Cálculo do IMC");
        System.out.println("3: Média");
        System.out.println("4: Desconto");
        System.out.println("5: Matriz");
        System.out.println("6: Digite 9º para Sair, se não digite qualquer outro numero");
        System.out.println("................");
        opc = leia.nextInt();
        
        switch(opc){
            //CALCULADORA
            case 1:{
                dado.calculadora();
                break;
                }                            
            //CALCULAR IMC
            case 2:{
                dado.imc();
                break;
                }
            //CALCULAR A MEDIA
            case 3:{                
                dado.media();
                break;
                }                
            //DESCONTO
            case 4:{            
                dado.desconto();
                break;
                }               
            //MATRIZ
            case 5:{
                dado.matriz();
                break;
                }
            default:{
                System.out.print("opção invalidar"); 
                break;
                }
            }
        }    
    }    
}
