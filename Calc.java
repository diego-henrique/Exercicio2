	package calculadora;
	
	import java.math.BigInteger;
	import java.util.Scanner;
	
	//import java.math.BigInteger;
	
	public class Calc {
	
		public static void main(String[] args) {	
		
			System.out.println("\n\t CALCULADORA\n");
			Scanner input = new Scanner(System.in);	
			Calculadora num = new Calculadora();
			
	BigInteger num1;
	int op;
	int loop=0;
	do{
		
	System.out.printf("\t [ 1 ] ADIÇÃO  ========> [ + ] \n");
	System.out.printf("\t [ 2 ] SUBTRAÇÃO ======> [ - ] \n");
	System.out.printf("\t [ 3 ] MULTIPLICAÇÃO ==> [ * ] \n ");
	System.out.printf("\t [ 4 ] DIVISÃO ========> [ / ] \n");
	System.out.printf("\t [ 5 ] POTÊNCIA =======> [ ^ ] \n");
	System.out.printf("\t [ 6 ] SAIR ===========> [ QUIT ] \n");
	System.out.printf("\t INFORME NÚMERO DA OPERAÇÃO DESEJADA:  ");
	
	while(!input.hasNextInt()){
		input.nextLine();
	}
	 	op = input.nextInt();
	 	
	switch (op) {
	 case 1:
		System.out.printf("\t\n [ 1 ] ADIÇÃO [ + ] \n");
	
		System.out.printf("DIGITE NUMERO: ");
			while(!input.hasNextBigInteger()){
				input.nextBigInteger();
			}
			num1 = input.nextBigInteger();
			 num.soma(num1);
			System.out.println(num.toString());		
	 break;
	 
	 case 2: 
		 System.out.printf("\t\n [ 2 ] SUBTRAÇÃO [ - ] \n");
	
		 System.out.printf("DIGITE NUMERO: ");
		 while(!input.hasNextBigInteger()){
				input.nextBigInteger();
			}
		 
		 num1 = input.nextBigInteger();
		 num.subtrair(num1);
		 System.out.println(num.toString());
	 break;
	 
	 case 3:
		 System.out.printf("\t\n [ 3 ] MULTIPLICAÇÃO [ * ] \n");
		
		 System.out.printf("DIGITE NUMERO: ");
		 while(!input.hasNextBigInteger()){
				input.nextBigInteger();
			}
		 num1 = input.nextBigInteger();
		 num.multiplica(num1);
		 System.out.println(num.toString());
	 break;
	
	 case 4:
		BigInteger teste = BigInteger.ZERO;
		 System.out.printf("\t\n [ 4 ] DIVISÃO [ / ] \n");
		
		 System.out.printf("DIGITE NUMERO: ");
		 while(!input.hasNextBigInteger()){
			 input.nextBigInteger();
		 }
	 
		 num1 = input.nextBigInteger();
	 
		 while(num1.equals(teste)){
		 System.out.printf("VOCÊ NÃO PODE DIVIDIR POR { 0 - ZERO }");
		 System.out.printf("DIGITE NUMERO NOVAMENTE: ");
			 input.nextLine();
			 num1 = input.nextBigInteger();
		 }
		 num.divide(num1);
		 System.out.println(num.toString());
	 break;
	 
	 case 5:
		 System.out.printf("\t\n [ 5 ] POTÊNCIA [ ^ ] \n");
	
		 System.out.printf("DIGITE NUMERO: ");
			 while(!input.hasNextBigInteger()){
					input.nextBigInteger();
				}
			 num1 = input.nextBigInteger();
			 num.potencia(num1);
			 System.out.println(num.toString());
	 break;
		  
	 case 6: 
		loop = op;
	 break;
	 
		default:
			System.out.printf("\t \n OPÇÃO INVÁLIDA !!\n");
		break;
	}
   }while(loop != 6);
		input.close();
  }//final do main
}
