package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Producto extends Model {
	public String codigo;
	public String nombre;
	public String categoria;
	public float precioCompra;
	public float precioVenta;
	public float stock;
	public Date fechaIn;
	//<p>${(producto.fechaIn).format('yyyy-MM-dd')}</p> 
	public void actualizarStock( float stock) {
		this.stock = stock;
	}

	public Producto(String codigo, String nombre, String categoria,
			float precioCompra, float precioVenta, float stock, Date fechaIn) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
		this.fechaIn = fechaIn;
	}
	
	public void actualizarProducto(String codigo, String nombre, String categoria,
			float precioCompra, float precioVenta, float stock, Date fechaIn) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
		this.fechaIn = fechaIn;
	}
	
	
	
	
	
}
