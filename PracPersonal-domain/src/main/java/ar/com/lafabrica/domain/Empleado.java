package ar.com.lafabrica.domain;

import java.util.Date;

public class Empleado {
	
	private Long idEmpleado;
	private Long idSucursal;
	private int dni;
	private Date fechaNacimiento;
	private String nombre;
	private String apellido;
	private String telefono;
	private String telefonoContacto;
	private Date ingreso;
	private Date egreso;
	private String cargo; //podria ser un enum para poner sueldos basicos segun cargo
	private Double sueldo;
	
	
	
	//Constructor SIN ID ya que tiene el auto increment. 
	public Empleado(Long idSucursal, int dni, Date fechaNacimiento, String nombre, String apellido, String telefono,
			String telefonoContacto, Date ingreso, Date egreso, String cargo, Double sueldo) {
		super();
		this.idSucursal = idSucursal;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.telefonoContacto = telefonoContacto;
		this.ingreso = ingreso;
		this.egreso = egreso;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	//Constructor completo con todos los campos --> cuando obtenga el dato de la db
	public Empleado(Long idEmpleado, Long idSucursal, int dni, Date fechaNacimiento, String nombre, String apellido,
			String telefono, String telefonoContacto, Date ingreso, Date egreso, String cargo, Double sueldo) {
		super();
		this.idEmpleado = idEmpleado;
		this.idSucursal = idSucursal;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.telefonoContacto = telefonoContacto;
		this.ingreso = ingreso;
		this.egreso = egreso;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	public Long getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public Long getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(Long idSucursal) {
		this.idSucursal = idSucursal;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTelefonoContacto() {
		return telefonoContacto;
	}
	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}
	public Date getIngreso() {
		return ingreso;
	}
	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}
	public Date getEgreso() {
		return egreso;
	}
	public void setEgreso(Date egreso) {
		this.egreso = egreso;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}	
	
	

	
}
