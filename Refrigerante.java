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
		String retornavel = "";// DECLARA UMA VARIAVEL VAZIA PARA ATRIBUIR SE O THIS.RETORNAVEL � TRUE OU FALSE
		if(this.retornavel) {
			retornavel = "� retorn�vel";
		}else if(this.retornavel == false) {
			retornavel ="N�o � retorn�vel";
		}
		return "Nome: " + this.getNome() + " \nPre�o: R$" + this.getPreco()  + "\n " + retornavel;
	}//O GetNome e o GetPreco sao herdados da classe Bebida, por isso � usado o Get e n�o o Set

	@Override
	public boolean verificarPreco(double preco) {
		if(preco<5) {
			return true;
		}else {
			return false;

		}
	}
	
	
	
}
