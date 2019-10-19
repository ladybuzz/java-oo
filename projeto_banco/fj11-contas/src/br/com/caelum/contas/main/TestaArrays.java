package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		Conta contas[]=new Conta[10];
		for (int i=0;i<10;i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i*100.0);
			contas[i]=conta;
		}
		
		double totalSaldo = 0.0;
		for (int i=0;i<10;i++) {
			totalSaldo+=contas[i].getSaldo();
			System.out.println(contas[i].getSaldo());
		}
		double mediaSaldos = totalSaldo/10;
		System.out.println(totalSaldo);
		System.out.println(mediaSaldos);
		
	}
}
