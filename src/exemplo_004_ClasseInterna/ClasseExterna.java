package exemplo_004_ClasseInterna;

/**
 * 
 * @author Diego Munhoz
 */
public class ClasseExterna {

	private double resultado;
	private ClasseInterna interna = new ClasseInterna();
	public void somar(double x, double y){
		resultado = interna.somar(x,y);
	}

	public void exibirResultado(){
		interna.exibirResultado();
	}


	public class ClasseInterna{
		private double resultadoInterno;
		public double somar(double x, double y){
			resultadoInterno = x + y;
			return x + y;
		}

		public void exibirResultado(){
			System.out.println(resultado);
		}
	}//fim da classe Interna


}//fim classe Externa