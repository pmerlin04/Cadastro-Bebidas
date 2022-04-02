package aula04;

public class Refrigerante extends Bebida {
	
	private boolean retornavel;
	

	public boolean isRetornavel() {
		return retornavel;
	}

	public void setRetornavel(boolean retornavel) {
		this.retornavel = retornavel;
	}

	@Override
	public String mostrarBebida() {
		String retornavel = "";// DECLARA UMA VARIAVEL VAZIA PARA ATRIBUIR SE O THIS.RETORNAVEL É TRUE OU FALSE
		if(this.retornavel) {
			retornavel = "É retornável";
		}else if(this.retornavel == false) {
			retornavel ="Não é retornável";
		}
		return "Nome: " + this.getNome() + " \nPreço: R$" + this.getPreco()  + "\n " + retornavel;
	}//O GetNome e o GetPreco sao herdados da classe Bebida, por isso é usado o Get e não o Set

	@Override
	public boolean verificarPreco(double preco) {
		if(preco<5) {
			return true;
		}else {
			return false;

		}
	}
	
	
	
}
