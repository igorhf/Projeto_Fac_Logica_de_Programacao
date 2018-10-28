package projeto;
import java.util.Scanner;

public class Projeto extends dados {
   
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in); 
       dados dado = new dados();
       
        int opc = 0;          
        while(opc != 9){
        System.out.println("MENU");
        System.out.println("................");
        System.out.println("Escola uma opção");
        System.out.println("1: Calculadora");
        System.out.println("2: Cálculo do IMC");
        System.out.println("3: Média");
        System.out.println("4: Desconto");
        System.out.println("5: Matriz");
        System.out.println("Digite 9º para Sair, se não digite qualquer outro numero");
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
                int op = 0;
                int[][] array1 = new int[3][3];
                int[][] array2 = new int[3][3];
                int[][] array3 = new int[3][3];
                int valorMatriz = 0;
                while(op != 9){
                System.out.println("matriz (3x3), de valores inteiros em que os valores"
                        + " da diagonal principal sejam um número informado pelo"
                        + " usuário e os demais sejam zero");
                valorMatriz = 0;
                for(int linha = 0;linha<array1.length;linha++){
                    for(int coluna = 0;coluna<array1.length;coluna++){
                        array1[linha][coluna] = valorMatriz++;
                    }
                }
                valorMatriz = 0;
                for(int linha = 0;linha<array2.length;linha++){
                    for(int coluna = 0;coluna<array2.length;coluna++){
                        array2[linha][coluna] = valorMatriz++;
                    }
                }
                for(int linha = 0;linha<array3.length;linha++){
                    for(int coluna = 0;coluna<array3.length;coluna++){
                        array3[linha][coluna] = array1[linha][coluna] + array2[linha][coluna];
                    }
                }
                for(int linha = 0;linha<array3.length;linha++){
                    for(int coluna = 0;coluna<array3.length;coluna++){
                        System.out.print(array3[linha][coluna]);
                    }
                    System.out.println();
                }
                
                System.out.println("deseja sair");
                op = leia.nextInt();
                }
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
