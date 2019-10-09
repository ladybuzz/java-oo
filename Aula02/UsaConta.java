class UsaConta{
	public static void main(String args[]){
		Conta c = new Conta(); //c = variável de referência local
		c.titular = "Zé";
		c.numero = 123;
		c.agencia = 77;
		c.saldo = 1000;
		System.out.println(c.titular+" - "+c.saldo);
		System.out.println(c);
		Conta c1 = new Conta();//Instância
		c1=c;
		System.out.println(c1.titular);
	}
}
