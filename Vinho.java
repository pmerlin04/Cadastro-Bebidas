package aula04;

public class Vinho extends Bebida {
	private int safra;
	private String tipo;
	
	
	public int getSafra() {
		return safra;
	}
	public void setSafra(int safra) {
		this.safra = safra;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	@Override
	public String mostrarBebida() {
		return  "Nome: " + this.getNome() + "\nPre�o: R$" + this.getPreco() + "\nTipo: " + this.tipo + "\nSafra: " + this.safra;
	}//O GetNome e o GetPreco sao herdados da classe Bebida, por isso � usado o Get e n�o o Set
	
	@Override
	public boolean verificarPreco(double preco) {
		if(preco<25) {
			return true;
		}else {
			return false;	
		}
		
	}
	
	
	

}
