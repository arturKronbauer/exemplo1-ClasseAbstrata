package entidades;

public class ContaJuridica extends Conta{

	private Double limiteCredito;
	
	public ContaJuridica() {
		super();
	}

	public ContaJuridica(Integer numero, String titular, Double saldo, Double limiteCredito) {
		super(numero, titular, saldo);
		this.limiteCredito = limiteCredito;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public void emprestimo(Double valor) {
		if (valor <= this.limiteCredito) {
			saldo +=valor;   // saldo deve ser protected para permitir a atualização
		}                    // se saldo for private dara um erro 
	}
	
	@Override
	public void saque(Double valor) {
		super.saque(valor);
		saldo -= 2.0;
	}
}
