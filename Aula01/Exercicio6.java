class Exercicio6{
	public static void main(String[]args){
		int fibo = 0;		
		int n1 = 0;
		int n2 = 1;
		while(fibo<=100){
			fibo = n1+n2;
			n1=n2;
			n2=fibo;
			System.out.println(fibo);
		}

	}		
}
