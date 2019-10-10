class Conta{
	String titular; //Variável de instância
	String agencia;
	int numero;
	double saldo;
	String dataDeAbertura;

	void saca(double valor){
		this.saldo-=valor;
	}

	void deposita(double valor){
		this.saldo+=valor;
	}

	double calculaRendimento(){
		return this.saldo*0.1;
	}

	String pegaDadosConta(){
		return "Ag.: "+ this.agencia+" - Conta: "+ this.numero;
	}

	String recuperaDadosParaImpressao(){
		return "Titular: "+this.titular+"\nAg.: "+this.agencia+"\nConta: "+ this.numero+"\nData de Abertura: "+this.dataDeAbertura +"\nSaldo: "+this.saldo;
	}
}
