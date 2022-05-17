package ar.com.lafabrica.domain;

public class Proveedor {

	private Long idProveedor;
	private String nombre;
	private String cbu;
	private String direccion;
	private String telefono;
	private String condicionFiscal; // para ver si factura o no
	private String horarioAtencion;

	// para cargar
	// Constructor SIN ID ya que tiene el auto increment.
	public Proveedor(String nombre, String cbu, String direccion, String telefono, String condicionFiscal,
			String horarioAtencion) {
		super();
		this.nombre = nombre;
		this.cbu = cbu;
		this.direccion = direccion;
		this.telefono = telefono;
		this.condicionFiscal = condicionFiscal;
		this.horarioAtencion = horarioAtencion;
	}

	// para consultar
	// Constructor completo con todos los campos --> cuando obtenga el dato de la db
	public Proveedor(Long idProveedor, String nombre, String cbu, String direccion, String telefono,
			String condicionFiscal, String horarioAtencion) {
		super();
		this.idProveedor = idProveedor;
		this.nombre = nombre;
		this.cbu = cbu;
		this.direccion = direccion;
		this.telefono = telefono;
		this.condicionFiscal = condicionFiscal;
		this.horarioAtencion = horarioAtencion;
	}

	public Long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCondicionFiscal() {
		return condicionFiscal;
	}

	public void setCondicionFiscal(String condicionFiscal) {
		this.condicionFiscal = condicionFiscal;
	}

	public String getHorarioAtencion() {
		return horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

}
