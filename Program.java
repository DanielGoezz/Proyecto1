
public class Program 
{
	public static void main(String[] args) 
	{
		Estudiante[] est = new Estudiante [3];
		Sistema Sys = new Sistema();
		
		est[0] = new Estudiante(); // Apilar * Desapila
		est[0].nombre = "Daniel";
		est[0].pago = 10000;

		est[1] = new Estudiante(); // Apilar * Desapila
		est[1].nombre = "Juan";
		est[1].pago = 20000;
		
		est[2] = new Estudiante(); // Apilar * Desapila
		est[2].nombre = "Pedro";
		est[2].pago = 15000;
		
		/*
		for (int i = 0 ; i <= est.length - 1 ; i++ )
		{
		
		}
		*/
		
		System.out.println("Promedio: " + Sys.promedio(est)); // Apilar *Procesos internos* Desapila
		System.out.println("Estudiante con mejor pago: " + Sys.mejorPago(est)); // Apilar *Procesos internos* Desapila
		
		System.out.println("La diferencia entre el promedio de pago y el estudiante con el mayor pago es: " + Sys.getDiffAvg(Sys.promedio(est),Sys.mejorPago(est))); // Promedio(Apliar *Procesos internos* Desapilar) mejorPago(Apliar *Procesos internos* Desapilar) 
		
	}
}
