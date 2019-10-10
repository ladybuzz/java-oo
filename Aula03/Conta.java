class Conta{
	private String titular; //Variável de instância
	private String agencia;
	private int numero;
	private double saldo;
	private String dataDeAbertura;
	int identificador;
	static int contador;

//Construtor:
	Conta(String titular){
		this();
		setTitular(titular);
	}

	Conta(){
		contador++;
		this.identificador=contador;
	}

//Métodos:

	public String getTitular(){
		return this.titular;
	}
	
	public String getAgencia(){
		return this.agencia;
	}
	
	public int getNumero(){
		return this.numero;	
	}
	
	public double getSaldo(){
		return this.saldo;	
	}
	
	public String getDataDeAbertura(){
		return this.dataDeAbertura;
	}
	
	public void setTitular(String titular){
		this.titular = titular;
	}
	
	public void setAgencia(String agencia){
		this.agencia = agencia;
	}
	
	public void setNumero(int numero){
		this.numero = numero;	
	}

	public void setDataDeAbertura(String dataDeAbertura){
		this.dataDeAbertura = dataDeAbertura;
	}

	void saca(double valor){
		this.saldo-=valor;
	}

	void deposita(double valor){
		this.saldo+=valor;
	}

	double calculaRendimento(){
		return this.saldo*0.1;
	}
	
	String recuperaDadosParaImpressao(){
		String dados = "Titular: "+this.titular;
		dados+="\nAg.: "+this.agencia;
		dados+="\nConta: "+ this.numero;
		dados+="\nData de Abertura: "+this.dataDeAbertura;
		dados+="\nSaldo: "+this.saldo;
		return dados;
	}
}
