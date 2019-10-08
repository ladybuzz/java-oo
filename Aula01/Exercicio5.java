class Exercicio5{
	public static void main(String[]args){
		long fatorial = 1;
		for(int n = 1; n<=20;n++){
			fatorial*=n;
			System.out.println(fatorial);	
		}	
	}
}

//Resposta: Quando aumentamos o valor de n para 20 estouramos o valor máximo suportado pelo tipo int.

//Quando alteramos para long o problema não ocorre porque aumentamos a capacidade de representação dos números. Long tem uma faixa maior.
