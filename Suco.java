package aula04;

public class Suco extends Bebida {
	
	private String sabor;
	

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public String mostrarBebida() {
		return "Nome: " + this.getNome() + " \nPre�o: R$" + this.getPreco()   +    "\nSabor: " + this.sabor;
	}//O GetNome e o GetPreco sao herdados da classe Bebida, por isso � usado o Get e n�o o Set

	@Override
	public boolean verificarPreco(double preco) {
		if(preco<2.5) {
			return true;
		}else {
			return false;

		}
	}
	
	
	
	
}
