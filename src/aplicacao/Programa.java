package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Conta;
import entidades.ContaJuridica;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		List<Conta> list = new ArrayList<>();

		list.add(new ContaPoupanca(1001, "Alex", 500.00, 0.01));
		list.add(new ContaJuridica(1002, "Maria", 1000.0, 400.0));
		list.add(new ContaPoupanca(1004, "Bob", 300.0, 0.01));
		list.add(new ContaJuridica(1005, "Anna", 500.0, 500.0));

		double soma = 0.0;
		for (Conta acc : list) {
			soma += acc.getSaldo();
		}

		System.out.printf("Saldo Total: %.2f%n", soma);

		for (Conta cc : list) {
			cc.deposito(10.0);
		}
		for (Conta cc : list) {
			System.out.printf("Atualização do saldo da conta %d: %.2f%n", cc.getNumero(), cc.getSaldo());
		}
	}
}
