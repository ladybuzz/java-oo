package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override // Avisa ao compilador que eu quero sobrescrever (previne que você esqueça e
				// crie um novo método ex. overload) - é o mesmo método, o filho só muda a forma
				// de se comportar

	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		this.saldo -= (valor + 0.10);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
}