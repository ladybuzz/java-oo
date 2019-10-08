class UmaClasse{
	public static void main(String [] args){
	System.out.println("Oi Java"); 
	int x,y=30;
	x=10;
	int z = 20;
	String s = "oi";
	char letra = 's';
	float altura = 1.57f;	
	double salario = 13578.27; //Por padrão todo ponto flutuante é double, por isso temos que colocar um f no float para diferenciar
	byte idade = 12; 
	short idade2 = idade; //Casting automático (faz porque byte cabe em short). Se você tentar fazer o contrário ele não deixa, para forçar vc faz byte idade2=byte(idade); - Casting por coerção
	Boolean resposta = true;		
	System.out.println(s); 
	}
}
