package ar.com.lafabrica.domain;

public class Sucursal {

	private Long idSucursal;
	private String nombreFantasia;
	private String telefono;
	private String direccion;
	private String cbu;
	private String horarioAtencion;

	// para cargar
	// Constructor SIN ID ya que tiene el auto increment.
	public Sucursal(String nombreFantasia, String telefono, String direccion, String cbu, String horarioAtencion) {
		super();
		this.nombreFantasia = nombreFantasia;
		this.telefono = telefono;
		this.direccion = direccion;
		this.cbu = cbu;
		this.horarioAtencion = horarioAtencion;
	}

	// para consultar
	// Constructor completo con todos los campos --> cuando obtenga el dato de la db
	public Sucursal(Long idSucursal, String nombreFantasia, String telefono, String direccion, String cbu,
			String horarioAtencion) {
		super();
		this.idSucursal = idSucursal;
		this.nombreFantasia = nombreFantasia;
		this.telefono = telefono;
		this.direccion = direccion;
		this.cbu = cbu;
		this.horarioAtencion = horarioAtencion;
	}

	public Long getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Long idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getNombreFantasia() {
		return nombreFantasia;
	}

	public void setNombreFantasia(String nombreFantasia) {
		this.nombreFantasia = nombreFantasia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public String getHorarioAtencion() {
		return horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

}
