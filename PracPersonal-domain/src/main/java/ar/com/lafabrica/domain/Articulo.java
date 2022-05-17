package ar.com.lafabrica.domain;



public class Articulo {
	//Atributos tal cual estan en la tabla y mismo orden
	private Long idArticulo;
	private Long idSucursal;
	private String nombre;
	private String descripcion;
	private Double precio;	
	private String codigoBar;	
	private Long stock;
	private Long idProveedor;
	
	
	
	
	//Constructor completo con todos los campos --> cuando obtenga el dato de la db
	public Articulo(Long idArticulo, Long idSucursal, String nombre, String descripcion, Double precio,
			String codigoBar, Long stock, Long idProveedor) {
		super();
		this.idArticulo = idArticulo;
		this.idSucursal = idSucursal;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigoBar = codigoBar;
		this.stock = stock;
		this.idProveedor = idProveedor;
	}
	
	
	//Constructor SIN ID ya que tiene el auto increment. 
	public Articulo(Long idSucursal, String nombre, String descripcion, Double precio, String codigoBar, Long stock,
			Long idProveedor) {
		super();
		this.idSucursal = idSucursal;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigoBar = codigoBar;
		this.stock = stock;
		this.idProveedor = idProveedor;
	}





	public Long getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(Long idArticulo) {
		this.idArticulo = idArticulo;
	}
	public Long getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(Long idSucursal) {
		this.idSucursal = idSucursal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getCodigoBar() {
		return codigoBar;
	}
	public void setCodigoBar(String codigoBar) {
		this.codigoBar = codigoBar;
	}
	public Long getStock() {
		return stock;
	}
	public void setStock(Long stock) {
		this.stock = stock;
	}
	public Long getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}
	@Override
	public String toString() {
		return "Articulo [idArticulo=" + idArticulo + ", idSucursal=" + idSucursal + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + ", precio=" + precio + ", codigoBar=" + codigoBar + ", stock="
				+ stock + ", idProveedor=" + idProveedor + "]";
	}

	
	

}
