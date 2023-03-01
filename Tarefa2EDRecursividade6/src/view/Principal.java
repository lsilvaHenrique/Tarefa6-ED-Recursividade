package view;

import controller.NFatorialController;

public class Principal {
	
	public static void main(String[] args) {
		NFatorialController somatoria = new NFatorialController();
	    
	    float soma = somatoria.somaN(1, 3, 0);
	    System.out.println(soma);
	}
	}
