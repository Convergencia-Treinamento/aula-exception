package aulaexception;

public class ExemploTryFinallyNovo {

	public static void main(String[] args) {
		
		try(TesteFechavel tf = new TesteFechavel()){
			System.out.println("execucao qualquer");
		}catch(Exception e){
			System.out.println("Erro");
		}
		
	}
	
}
