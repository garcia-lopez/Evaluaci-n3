package modelos;


/**
 * @author lopez
 * @version 1.0
 * @created 22-nov.-2022 18:31:45
 */
public class Factura {

	private int codigo;
	private int fecha;
	private Producto m_Producto;
	private Vendedor m_Vendedor;
	private Cliente m_Cliente;



	public void finalize() throws Throwable {

	}
	public void Factura(){

	}

	public void finalized(){

	}

	/**
	 * 
	 * @param List
	 */
	public double calcTotal(List<Producto> List){
		return 0;
	}

	/**
	 * 
	 * @param double, double
	 */
	public double aplicarIVA(double double, double){
		return 0;
	}

	/**
	 * 
	 * @param double
	 */
	public double calcMonto(double, double double){
		return 0;
	}

	/**
	 * 
	 * @param double
	 */
	public double agregarProducto(double, double double){
		return 0;
	}
}//end Factura