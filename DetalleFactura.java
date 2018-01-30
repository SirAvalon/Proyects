package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class DetalleFactura extends Model {
	public int cantidad = 0;	
	
	@ManyToOne
	public Producto producto;
	
	public float total = 0;
	public float precio = 0;
	
	public DetalleFactura(int cantidad, Producto producto, float total, float precio) {
		super();
		
		this.cantidad = cantidad;
		this.producto = producto;
		this.precio = precio;
		this.total = total;

		
	}
}
