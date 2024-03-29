package entities;

public class PessoaJuridica extends Pessoa {
	
	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	//Getters and setters:
	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	//M�todos:
	@Override
	public Double calcImposto() {
		Double valorImposto;
		if(numFuncionarios > 10) {
			valorImposto = getRendaAnual() * 0.14;
		}else {
			valorImposto = getRendaAnual() * 0.16;
		}
		return valorImposto;
	}
}
