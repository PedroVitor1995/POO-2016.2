package app;

import java.util.HashMap;
import java.util.Map;

import domain.Conta;
import domain.ContaCorrente;

public class TestaMapa {

	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente();
		c1.deposita(10000);
		
		Conta c2 = new ContaCorrente();
		c2.deposita(3000);

		Map<String, Conta> mapaDeContas = new HashMap<>();

		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);

		Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
		Conta contaDoGerente = (Conta) mapaDeContas.get("gerente");
		System.out.println(contaDoDiretor.getSaldo());
		System.out.println(contaDoGerente.getSaldo());
	}
}
