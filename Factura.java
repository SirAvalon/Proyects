package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Entity
public class Factura extends Model {
	public Date fecha;
	
	public boolean finalizado;
	
	public int numero;
	
	@ManyToMany
	public List<DetalleFactura> producto;
	
	@ManyToOne
	public Cliente cliente;
	
	public float subTotal;
	
	public float iva;
	
	public float total;
	
	public int estado;
	// 0 
	// 1 completo
	public Factura()  throws ParseException {
		super();
		this.finalizado = false;
		this.estado = 0;
		java.util.Date fechaIn = new Date();
		Format formatter = new SimpleDateFormat("yyyy-MM-dd");
		String Fecha = formatter.format(fechaIn);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		this.fecha = df.parse(Fecha);
	}

	public Factura(Date fecha, boolean finalizado, Cliente cliente, float subTotal, float iva, float total){
		super();
		
		this.fecha = fecha;
		this.finalizado = finalizado;
		this.cliente = cliente;
		this.subTotal = subTotal;
		this.iva = iva;
		this.total = total;
	}

	public void actualizarFactura(Date fecha, Cliente cliente, int estado) {
		this.fecha = fecha;
		this.cliente = cliente;
		this.estado = estado;
	}
	
	public void actualizarFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	

}
