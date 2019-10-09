class TestaConta{
	public static void main(String[]args){
		Conta c1 = new Conta();
		c1.titular = "Hugo";
		c1.numero = 123;
		c1.agencia = "45678-9";
		c1.saldo = 50.0;
		c1.dataDeAbertura = "04/06/2015";
		c1.deposita(200.0);
		c1.saca(53.0);
		System.out.println("saldo atual: R$ "+c1.saldo);
		System.out.println("rendimento mensal: R$  "+c1.calculaRendimento());
		System.out.println(c1.pegaDadosConta());

		double rend = c1.calculaRendimento();
	System.out.println(rend);
	}
}
