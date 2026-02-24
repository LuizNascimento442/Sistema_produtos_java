package Vetores_Array_8;
import java.util.Scanner;



public class Sistema_Produtos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String[] produtos = new String[5];
		
		double [] preco = new double[5];
		
		int contador =0;
		
		int opcao;
		
		do {
			
			System.out.println("\n === Menu === \n");
			System.out.println(" 1- Cadastrar produto");
			System.out.println(" 2- Listar produtos");
			System.out.println(" 3- Monstrar preço medio");
			System.out.println(" 4 - Produto mais caro");
			System.out.println(" 0 - Sair");
			
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			
			switch(opcao) {
			case 1: 
				
				if(contador <produtos.length){
					System.out.println("digite o nome do produto");
					produtos[contador] = entrada.nextLine();
					
					System.out.println("Digite o preco do produto: ");
					preco[contador] = entrada.nextDouble();
					
					entrada.nextLine();
					contador++;
				}
				
				break;
				
			case 2:
				
				if(contador == 0) {
					System.out.println("Nenhum produto listado");
					
				}
				
				else {
					for(int x =0; x<contador;x++) {
						System.out.println(produtos[x] + " Preco : " + preco[x]);
					}
				}
				
				break;
				
			case 3:
				
				double soma =0;
				
				
				if(contador > 0) {
					
					for(int b =0;b<contador;b++) {
						soma+=preco[b];
						
						
					}
					
					System.out.println(" Preco medio: " + soma / contador);
				}
				
				else {
					System.out.println("Nenhum produto Listado");
				}
				
				break;
				
			case 4 :
				
				
				
				
				if(contador > 0) {
					double  maior =  preco[0];
					String nomeMaior = produtos[0];
					
					for(int i =1;i<contador;i++) {
						
						if(preco[i] > maior) {
							maior = preco[i];
							nomeMaior=produtos[i];
						}
					}
					
					System.out.println(" Preço maior " + maior + " Produto mais caro " + nomeMaior);
				}
				
				else {
					System.out.println("Nenhum produto Cadastrado: ");
				}
		
				break;
				
			case 0:
				
				System.out.println("Saindo do sistema.... ");
				
				 break;
				 
				 default:
					 System.out.println(" Opcao invalida ");
				
				
			}
			
			
			
			
		}while(opcao!=0);
		
		entrada.close();

	}

}
