class TestaConta{
	public static void main(String[]args){
		Conta c1 = new Conta();
		c1.setTitular("Hugo");
		c1.setNumero(123);
		c1.setAgencia("45678-9");
		c1.deposita(50.0);
		c1.setDataDeAbertura("04/06/2015");
		c1.deposita(200.0);
		c1.saca(53.0);
		System.out.println("saldo atual: R$ "+c1.getSaldo());
		System.out.println("rendimento mensal: R$  "+c1.calculaRendimento());

	System.out.println(c1.recuperaDadosParaImpressao());
	Conta c2 = new Conta("Jo");
	System.out.println(c2.getTitular());
	System.out.println(c1.identificador);
	System.out.println(c2.identificador);
	}	
}
