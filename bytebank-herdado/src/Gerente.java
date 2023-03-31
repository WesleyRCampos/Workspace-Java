
//Gerente eh um Funcionario extens, passa a herdar tudo da classe Funcionario
public class Gerente extends Funcionario {
	

	public double getBonificacao() {
		
		return super.getSalario();
	}
		
		
	
}

