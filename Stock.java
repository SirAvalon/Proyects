package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Stock extends Model {
	public float cantidad;
	
	@ManyToOne
	public Producto producto;

	public Stock(float cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}
}
