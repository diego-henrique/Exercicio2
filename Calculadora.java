	package calculadora;
	
	import java.math.BigInteger;;
	/**
	 * 
	 * @param numero
	 */
	public class Calculadora {
	
		private  BigInteger num; 
	
		public Calculadora (){
			this.num = BigInteger.ZERO;
		}
	
	/***
	 * 
	 * @param numero
	 */
	public  void soma(BigInteger numero){
		this.num=this.num.add(numero);
	
	}
	/***
	 * 
	 * @param numero
	 */ 
	public void subtrair(BigInteger numero){
		this.num=this.num.subtract(numero);
	}
	/***
	 * 
	 * @param numero
	 */
	public void multiplica (BigInteger numero){
		this.num=this.num.multiply(numero);	}
	/***
	 * 
	 * @param numero
	 */
	public void divide(BigInteger numero){
		this.num=this.num.divide(numero);
	}
	/***
	 * 
	 * @param num1
	 */
	public void potencia(BigInteger num1){
		int n = num1.intValue();
		this.num=this.num.pow(n);
	}
	
	public String toString() {
		return "\t\n Resultado Calculadora [num=" + num + "] \n";
		 }
		
	}//final da class