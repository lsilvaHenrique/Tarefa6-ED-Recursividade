package controller;

public class NFatorialController {
	public NFatorialController() {}

	
	public static int fatorial (int num) {
		int n = 1;
		for (int i=1;i<=num;i++)
			n = (n*i);
		return n;
	}
	
	public float somaN(int i, int num, float s) {
		// Condicao de parada --> Quando num chegar em n
	    if (i > num)
	        return s;
	    else
	    {
	        if (i % 2 == 0)
	            s -= (float)1 / fatorial(i);
	        else
	            s += (float)1 / fatorial(i);
	             
	        return somaN(i + 1, num, s);
	        /*
	         5x
	         1 + 1 / 1!
	         1 + 1 / 2!
	         1 + 1 / 3!
	         1 + 1 / 4!
	         1 + 1 / 5!
	         1 + 1 / 6! = num > n = 0
	         */
	    }
	}
}


