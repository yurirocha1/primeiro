package primeiro1;

import javax.swing.JOptionPane;

public class primeiro2 {

	private static final int case1 = 0;

	public static void main(String[] args) {
	
	
    String carros = JOptionPane.showInputDialog("informe o numero de carros?");
    String pessoas =JOptionPane.showInputDialog("infoeme o numero de pessoas?");
    
    double carroNumero = Double.parseDouble(carros);
    double pessoaNumero = Double.parseDouble(pessoas);

    int divisao =(int) (carroNumero / pessoaNumero);
    
    double resto = carroNumero % pessoaNumero;
   
    System.out.println("Divisão para pessoas deu?" + divisao + "Carros e sobrou" + resto + "carro");
		
		
		
		
	
	
	
	
	
	}	
}