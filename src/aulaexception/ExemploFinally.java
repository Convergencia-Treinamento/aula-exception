package aulaexception;

public class ExemploFinally {

	public static int dividir(int a, int b){
		try{
			if(b == 0){
				System.out.println("Não é possível dividir");
				return 99999999;
			}else{
				return a / b;
			}
		}finally{
			System.out.println("Sempre executado");
		}
	}
	
	public static void main(String[] args) {
		int v = dividir(8, 2);
		System.out.println(v);
	}
}
