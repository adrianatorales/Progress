package com.progress.cursojavaee.service;

import javax.annotation.PostConstruct;

public class CalculadoraPrecio {
	
	@PostConstruct
	public void init(){
		System.out.println("Init CalculadoraPrecio");
	}
	public double calcularPrecio(int cantidad, double precioUnitario){
		return cantidad*precioUnitario;
	}
}
