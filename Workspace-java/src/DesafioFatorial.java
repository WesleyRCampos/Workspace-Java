
public class DesafioFatorial {
	public static void main(String[] args) {
		int fatorial = 1;
		for (int linha = 1; linha <= 10; linha++) {
			
			fatorial *= linha;
			for (int coluna = 1; coluna <= 10; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print(coluna+"x");
				
			}
			System.out.println(" Fatorial de " + linha + " = " + fatorial);
		}
	}
}
