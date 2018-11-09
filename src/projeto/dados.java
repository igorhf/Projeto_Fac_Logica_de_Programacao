package projeto;
import java.util.Scanner;

public class dados {
    Scanner leia = new Scanner(System.in);        

    public void calculadora(){
                int op = 0;
                int opn = 0;
                double valor1,valor2,resultado;
                while(op != 9){
                System.out.println("Calculadora");
                System.out.println(".................");
                System.out.println("Escola uma opção");
                System.out.println("1: soma");
                System.out.println("2: divisão");
                System.out.println("3: multiplicação");
                System.out.println("4: subtração"); 
                System.out.println(".................");                
                System.out.println("Digite 9º para Sair, se não digite qualquer outro numero");
                op = leia.nextInt();
                
                switch(op){
                    case 1:{                        
                        while(opn != 9){
                        System.out.println("soma");
                        System.out.println("...........");
                        System.out.println("informe seu primeiro valor: ");
                        valor1 = leia.nextDouble();
                        System.out.println("informe seu segundo valor:");
                        valor2 = leia.nextDouble();
                        resultado=valor1+valor2;
                        System.out.println("resultado da soma é: "+resultado);
                        System.out.println("..........."); 
                        System.out.println("digite 9º para sair, se não digite qualquer outro numero");
                        opn = leia.nextInt();                        
                        }
                        opn=0;
                    }
                    break;
                    case 2:{
                        while(opn !=9){
                        System.out.println("divisão");
                        System.out.println("...........");
                        System.out.println("informe seu primeiro valor: ");
                        valor1 = leia.nextDouble();
                        System.out.println("informe seu segundo valor:");
                        valor2 = leia.nextDouble();
                        resultado = valor1 / valor2;
                        System.out.println("resultado da divisão é: "+resultado);
                        System.out.println("..........."); 
                        System.out.println("digite 9º para sair, se não digite qualquer outro numero");
                        opn = leia.nextInt();                        
                        }
                        opn=0;
                    }
                    break;
                    case 3:{
                        while(opn !=9){
                        System.out.println("multiplicação");
                        System.out.println("...........");
                        System.out.println("informe seu primeiro valor: ");
                        valor1 = leia.nextDouble();
                        System.out.println("informe seu segundo valor:");
                        valor2 = leia.nextDouble();
                        resultado = valor1 * valor2;
                        System.out.println("resultado da multiplicação é: "+resultado);
                        System.out.println("..........."); 
                        System.out.println("digite 9º para sair, se não digite qualquer outro numero");
                        opn = leia.nextInt();    
                        }
                        opn=0;
                    } 
                    break;
                    case 4:{
                        while(opn !=9){
                        System.out.println("subtração");
                        System.out.println("...........");
                        System.out.println("informe seu primeiro valor: ");
                        valor1 = leia.nextDouble();
                        System.out.println("informe seu segundo valor:");
                        valor2 = leia.nextDouble();
                        resultado = valor1 - valor2;
                        System.out.println("resultado da subtração é: "+resultado);
                        System.out.println("..........."); 
                        System.out.println("digite 9º para sair, se não digite qualquer outro numero");
                        opn = leia.nextInt();    
                        }
                        opn=0;
                    }
                    break;
                    default:{
                    System.out.println("opção invalidar");                    
                    }
                    break;
                }
            }
    }
    public void imc(){
                int op = 0;
                float altura,peso,imc;
                while(op != 9){                    
                System.out.println("Cálculo do IMC");
                
                System.out.println("Informer a sua altura");
                altura = leia.nextFloat();
                
                System.out.println("Informer o seu peso");
                peso = leia.nextFloat();                
                
                imc = peso / (altura*altura);
                
                if (imc < 15){	    	
                System.out.println("Extremamente abaixo do peso, "+ "seu imc é: " +imc);
                }else if(imc >= 15 && imc<16){	    	
                System.out.println("Gravimente abaixo do peso, "+ "seu imc é: " +imc);
                }else if(imc >=16 && imc<18.5){	    	
                System.out.println("Abaixo do peso, "+ "seu imc é: " + imc);
                 }else if(imc >=18.5 && imc<25){	    
                System.out.println("Faixa de peso ideal, "+ "seu imc é: " +imc);
                }else if(imc >=25 && imc<30){	    	
                System.out.println("Sobrepeso, "+ "seu imc é: " + imc);        
                }else if(imc >=30 && imc<35){	    	
                System.out.println("Obesidade Grau 1, "+ "seu imc é: " +imc);
                 }else if(imc >=35 && imc<40){	    	
                System.out.println("Obesidade Grau 2 (Grave), "+ "seu imc é: " +imc);
                }else if(imc >=40){	    	
                System.out.println("Obesidade Grau 3 (Mórbida), "+ "seu imc é: " +imc);
                }
                System.out.println("Se deseja sair digite 9 se não qualquer outro numero");
                op = leia.nextInt();
            }
    }
    public void media(){
                int op = 0;
                double nota1,nota2,media;
                while(op != 9){ 
                System.out.println("----Calcular a Media----");
                System.out.println("------------------------");
                System.out.println("se informa nota menor que 0 a nota se igual a 0,\n se for maior que 10 a nota sera igual a 10");
                System.out.println("------------------------");
                System.out.println("informe uma nota de 0 a 10"); 
                System.out.println("Informe sua primeira nota");
                nota1 = leia.nextDouble();
                System.out.println("informe uma nota de 0 a 10");
                System.out.println("Informe a segunda nota");
                nota2 = leia.nextDouble();
                if(nota1 > 10){
                    nota1 = 10;
                }
                if(nota2 > 10){
                    nota2 = 10;
                }
                if(nota1 < 0){
                    nota1 = 0;
                }
                if(nota2 < 0){
                    nota2 = 0;
                }
                media = (nota1 + nota2) /2;
                
                if(media <3){
                System.out.println("reprovado, "+"sua media é: "+ media);
                }
                else if(media >=7){
                System.out.println("aprovado, "+"sua media é: "+ media);
                }
                else if(media <7 && media >=3){
                System.out.println("final, "+"sua media é: "+ media);
                }
                System.out.println("Se deseja sair digite 9 se não qualquer outro numero");
                op = leia.nextInt();
                }
    }
    public void desconto(){
                int op = 0;
                int sair = 0;
                double valor;
                double result;
                double desconto;
                while(op != 9){ 
                System.out.println("DESCONTO");
                System.out.println(".............................");
                System.out.println("1: A vista, desconto de (20%)");
                System.out.println("2: Débito, desconto de (10%)");
                System.out.println("3: Crédito, desconto de (5%)");
                System.out.println("4: valor sem desconto");
                System.out.println("Digite 9º para Sair, se não digite qualquer outro numero");
                System.out.println(".............................");
                op = leia.nextInt();
                
                switch(op){
                    case 1:{
                       while(sair != 9){
                       System.out.println("informe um valor");
                       valor = leia.nextDouble();
                       desconto = (20*valor)/100;
                       result=valor-desconto;
                       System.out.println("seu desconto: $"+ desconto +", valor a paga é: $"+ result);
                       System.out.println(".............................");
                       System.out.println("Digite 9 para Sair, se não digite qualquer outro numero");                       
                       sair = leia.nextInt();
                       } 
                       sair = 0;
                    break;
                    }
                    case 2:{
                       while(sair != 9){
                       System.out.println("informe um valor");
                       valor = leia.nextDouble();
                       desconto = (10*valor)/100;
                       result=valor-desconto;
                       System.out.println("seu desconto: $"+ desconto +", valor a paga é: $"+ result);
                       System.out.println(".............................");
                       System.out.println("Digite 9 para Sair, se não digite qualquer outro numero");                      
                       sair = leia.nextInt();
                        }
                       sair = 0;
                    break;
                    }
                    case 3:{
                       while(sair != 9){
                       System.out.println("informe um valor");
                       valor = leia.nextDouble();
                       desconto = (5*valor)/100;
                       result=valor-desconto;
                       System.out.println("seu desconto: $"+ desconto +", valor a paga é: $"+ result);
                       System.out.println(".............................");
                       System.out.println("Digite 9 para Sair, se não digite qualquer outro numero");                      
                       sair = leia.nextInt();
                       }
                       sair = 0;
                    break;
                    }
                    case 4:{
                       while(sair != 9){ 
                       System.out.println("informe um valor");
                       valor = leia.nextDouble();
                       System.out.println("valor sem desconto: "+ valor);
                       System.out.println(".............................");
                       System.out.println("Digite 9 para Sair, se não digite qualquer outro numero");                      
                       sair = leia.nextInt();
                       }
                       sair = 0;
                    break;
                    }
                }
            }
    }
    public void matriz(){
                int op = 0;
                int[][] array = new int[3][3];
                int respost;
              
                while(op != 9){
                System.out.println("matriz (3x3), de valores inteiros em que os valores"
                        + " da diagonal principal sejam um número informado pelo"
                        + " usuário e os demais sejam zero");
                System.out.print("informe um valor para matriz: ");
                respost = leia.nextInt();
                System.out.println();
                for(int coluna=0;coluna<array.length;coluna++){
                    for(int linha=0;linha<array.length;linha++){
                        if(linha==coluna){
                        array[coluna][linha] = respost;
                        }else{
                            array[coluna][linha]=0;
                        }
                    }
                }
                for(int coluna=0;coluna<array.length;coluna++){
                    for(int linha=0;linha<array.length;linha++){
                        System.out.print(array[coluna][linha]+"");
                    }
                    System.out.println();
                }    
                System.out.println("digite 9º para sair, se não digite qualquer outro numero");
                op = leia.nextInt();
                }
    }
    //##########################################################################
}
