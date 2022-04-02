package aula04;


import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		
		Suco meuSuco = new Suco();//declarando objeto meuSuco da classe Suco
		Vinho meuVinho = new Vinho();//declarando objeto meuVinho da classe Vinho
		Refrigerante meuRefri = new Refrigerante();//declarando objeto meuRefri da classe Refrigerante
		
		
	
		String opcMenu [] = {"Cadastrar bebida", "Verificar pre�o", "Mostrar bebida", "Sair"};//OPCOES DO MENU
		
		String opcBebida[] = {"Vinho", "Suco", "Refrigerante", "Sair"};//OPCOES DE BEBIDA
		
		String opcRetornavel [] = {"Sim", "N�o"};//OPCOES DE MENU  DO REFRI RETORN�VEL OU N�O
		
		int opcPrin,opcBeb;//MENU PRINCIPAL E MENU BEBIDAS
		
		int retornavel; //RECEBE A OPCAO SIM OU N�O SE O REFRI � RETORNAVEL DENTRO DO JOPTIONPANE
		
		double promocao;// ESSA VARI�VEL ATRIBUI O PRE�O DA BEBIDA COM O GET 
		
		do {
			
			opcPrin = JOptionPane.showOptionDialog(null, "Selecione uma op��o","Menu Principal", 0, JOptionPane.WARNING_MESSAGE, null, opcMenu, opcMenu[0]);
		
		switch(opcPrin){
		case 0: //PARTE DO CADASTRO DA BEBIDA
			do {
				opcBeb = JOptionPane.showOptionDialog(null, "Selecione uma bebida","Menu Bebida", 0, JOptionPane.WARNING_MESSAGE, null, opcBebida, opcBebida[0]);	
				
				switch(opcBeb) {
				case 0: 
					meuVinho.setNome(JOptionPane.showInputDialog(null, "Digite o nome do vinho: ", "Vinho", JOptionPane.QUESTION_MESSAGE));
					meuVinho.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o pre�o do vinho: ", "Vinho", JOptionPane.QUESTION_MESSAGE)));
					meuVinho.setTipo(JOptionPane.showInputDialog(null, "Digite o tipo do vinho: ", "Vinho", JOptionPane.QUESTION_MESSAGE));
					meuVinho.setSafra(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a safra do vinho: ", "Vinho", JOptionPane.QUESTION_MESSAGE)));
					
				break;
				case 1:
					meuSuco.setNome(JOptionPane.showInputDialog(null, "Digite o nome do suco: ", "Suco", JOptionPane.QUESTION_MESSAGE));
					meuSuco.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o pre�o do vinho: ", "Suco", JOptionPane.QUESTION_MESSAGE)));
					meuSuco.setSabor(JOptionPane.showInputDialog(null, "Digite o sabor do suco: ", "Suco", JOptionPane.QUESTION_MESSAGE));
				
				break;
				
				case 2: 
					meuRefri.setNome(JOptionPane.showInputDialog(null, "Digite o nome do refri: ", "Refrigerante", JOptionPane.QUESTION_MESSAGE));
					meuRefri.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o pre�o do refri: ", "Refrigerante", JOptionPane.QUESTION_MESSAGE)));
					retornavel =JOptionPane.showOptionDialog(null, "� retorn�vel? ", "Refrigerante", 0, JOptionPane.QUESTION_MESSAGE, null, opcRetornavel, opcRetornavel[0]);
					if (retornavel == 0) {
						meuRefri.setRetornavel(true);
					}else {
						meuRefri.setRetornavel(false);
					}
					
				break;
				}	
			}while(opcBeb !=3);//final da parte do cadastro
			
			
			
		case 1: //OPCAO DA VERIFICA��O DOS PRE�OS
			do {
				opcBeb = JOptionPane.showOptionDialog(null, "Selecione uma bebida","Menu Bebida", 0, JOptionPane.WARNING_MESSAGE, null, opcBebida, opcBebida[0]);	
				switch(opcBeb) {
				case 0: //VERIFICAR VINHO
					promocao = meuVinho.getPreco();
					if(promocao<25) {
						JOptionPane.showMessageDialog(null, "Produto em promo��o", "Vinho",JOptionPane.INFORMATION_MESSAGE);	
					}else {
						JOptionPane.showMessageDialog(null, "Produto com pre�o normal", "Vinho",JOptionPane.INFORMATION_MESSAGE);	
					}
					break;
					
				case 1: //VERIFICAR SUCO
					promocao = meuSuco.getPreco();
					if(promocao <2.5) {
						JOptionPane.showMessageDialog(null, "Produto em promo��o", "Suco",JOptionPane.INFORMATION_MESSAGE);	
					}else {
						JOptionPane.showMessageDialog(null, "Produto com pre�o normal", "Suco",JOptionPane.INFORMATION_MESSAGE);	
					}
					break;
					
				case 2: //VERIFICAR REFRI
					promocao = meuRefri.getPreco();
					if(promocao<5) {
						JOptionPane.showMessageDialog(null, "Produto em promo��o", "Refrigerante",JOptionPane.INFORMATION_MESSAGE);	
					}else {
						JOptionPane.showMessageDialog(null, "Produto com pre�o normal", "Refrigerante",JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				}
			}while(opcBeb!=3);
			
			
			
			
		case 2: //OPCAO DE MOSTRAR DADOS
			do {
				opcBeb = JOptionPane.showOptionDialog(null, "Selecione uma bebida","Menu Bebida", 0, JOptionPane.WARNING_MESSAGE, null, opcBebida, opcBebida[0]);
				
				switch(opcBeb) {
				case 0:
					JOptionPane.showMessageDialog(null,meuVinho.mostrarBebida(),"Vinho",JOptionPane.INFORMATION_MESSAGE);
					break;
				
				case 1: 
					JOptionPane.showMessageDialog(null,meuSuco.mostrarBebida(),"Suco",JOptionPane.INFORMATION_MESSAGE);
					break;
					
				case 2: 
					JOptionPane.showMessageDialog(null,meuRefri.mostrarBebida(),"Refrigerante",JOptionPane.INFORMATION_MESSAGE);
					break;		
				}
			}while(opcBeb!=3);
			
			
			
			
			
			}//FINAL SWITCH
		
			
			
		}while(opcPrin !=3);
	}

}
