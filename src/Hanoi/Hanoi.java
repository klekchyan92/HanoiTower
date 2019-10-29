package Hanoi;

public class Hanoi {
	
	public static void main(String[] args) 
	{
		int number = 10;
		THanoi(number,'A','B','C');
	}
	
	public static void THanoi(int n, char A, char B, char C) 
    { 
        if (n == 1) 
        { 
            System.out.println(n + " From " +  A + " to " + B); 
            return; 
        } 
        THanoi(n-1, A, C, B); 
        System.out.println(n + " From " +  A + " to " + B); 
        THanoi(n-1, C, B, A); 
    } 
}

