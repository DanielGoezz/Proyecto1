
public class Sistema 
{
	public Sistema() 
	{
		
	}
	
	int promedio (Estudiante [] est)
	{
		int promedio = 0;
		
		for (int i = 0 ; i <= est.length - 1 ; i++)
		{
			promedio += est[i].pago;
		}
		
		promedio = promedio / est.length;
		
		return promedio;
	}
	
	int mejorPago (Estudiante [] est)
	{
		int mejorPago = 0;
		
		for (int i = 0 ; i <= est.length - 1 ; i++)
		{
			if (est[i].pago > mejorPago)
			{
				mejorPago = est[i].pago;
			}
		}
		
		return mejorPago;
	}
	
	int getDiffAvg(int mejorPago , int promedio)
	{
		int diferencia = promedio - mejorPago ;
		return diferencia;
	}
}
