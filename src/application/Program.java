package application;

import java.util.Locale;
import java.util.Scanner;

import etities.Champion;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Champion championA;
		Champion championB;
		
	           
		 System.out.println("Digite os dados do primeiro campeão:");
		 System.out.print("Nome: ");
		 String name = sc.nextLine();
		 System.out.print("Vida inicial: ");
		 int life = sc.nextInt();
		 System.out.print("Ataque: ");
		 int attack = sc.nextInt();
		 System.out.print("Armadura: ");
		 int armor = sc.nextInt();
		 
		 
		 championA = new Champion(name, life, attack, armor);
		 System.out.println();
			
		 System.out.println("Digite os dados do primeiro campeão:");
		 System.out.print("Nome:");
		 sc.nextLine();
		 name = sc.nextLine();
	     System.out.print("Vida inicial: ");
		 life = sc.nextInt();
		 System.out.print("Ataque: ");
		 attack = sc.nextInt();
		 System.out.print("Armadura: ");
		 armor = sc.nextInt();	
			
	     championB = new Champion(name, life, attack, armor);	
	     
	     
		 
	     System.out.println();
		 System.out.println("Quantos turnos você deseja executar?");
		 int  n = sc.nextInt();
		 
		 for ( int i = 0; i < n; i++) {
			 championA.takeDamage(championB);
			 championB.takeDamage(championA);
			 
			 System.out.printf("Resultado do turno: %d\n", i + 1);
			 System.out.println(championA.status());
			 System.out.println(championB.status()); 
			 
			 if (championA.getLife() <= 0 || championB.getLife() <= 0){
				 
				 break;
				 
			 }
			 
		 }
		 
		 System.out.println();
		
		System.out.println("FIM DO COMBATE");
		 
		 
			
			
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

		
		
		
		
		
		
		
		
	}

}
