package atividade2;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
			int num;
			System.out.print("Digite um numero inteiro: ");
			num = ler.nextInt();
			
			boolean res = (num%2 == 0)? true : false;
			
			System.out.println(res);
		}
    }
    
}

