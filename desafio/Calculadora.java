public class Calculadora {

	public static void main(String[] args) {
//		double valor1 = 10;
//		double valor2 = 20;
		try {
			Double valor1 = Double.parseDouble(args[0]);
			Double valor2 = Double.parseDouble(args[1]);
			
			System.out.println("Somando:"+ Operacao.somar(valor1,valor2));
			System.out.println("Dividindo:"+ Operacao.dividir(valor1,valor2));
			System.out.println("Multiplicando:"+ Operacao.multiplicar(valor1,valor2));
			System.out.println("Subtraindo:"+ Operacao.subtrair(valor1,valor2));
			System.out.println("Sucesso!!!");
			
		}catch(NumberFormatException e) {
			System.out.println("Só pode digitar número!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Tem que passar dois números");
		}
		
	}
}

