package entidades;

public class ContaPoupanca extends Conta{
	private Double taxaJuro;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuro) {
		super(numero, titular, saldo);
		this.taxaJuro = taxaJuro;
	}

	public Double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(Double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaJuro;
	}
	
	@Override
	public void saque(Double valor) {
		saldo -= valor;
	}
}
