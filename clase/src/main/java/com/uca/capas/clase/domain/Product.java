package com.uca.capas.clase.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {
	
	@Size(min=1, max=12)
	private String codigo;
	@Size(min=1, max=100)
	private String nombre;
	@Size(min=1, max=100)
	private String marca;
	@Size(min=1, max=500)
	private String desc;
	@Pattern(regexp = "^[1-9]\\d*$", message="Solo puede ingresar números enteros positivos.")
	private String cant;
	@Pattern(regexp = "^([0-2][1-9]|(3)[0-1])(\\/)(((0)[1-9])|((1)[0-2]))(\\/)\\d{4}$", message="El formato de la fecha debe ser dd/mm/yyyy")
	private String fechaIngreso;
	
	public Product() {
		
	}
	

	public Product(String codigo, String nombre, String marca, String desc, String cant, String fechaIngreso) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.desc = desc;
		this.cant = cant;
		this.fechaIngreso = fechaIngreso;
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCant() {
		return cant;
	}

	public void setCant(String cant) {
		this.cant = cant;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	

}
