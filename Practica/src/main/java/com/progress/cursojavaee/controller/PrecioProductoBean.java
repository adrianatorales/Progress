package com.progress.cursojavaee.controller;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import com.progress.cursojavaee.service.CalculadoraPrecio;

@Named("PrecioProductoBean")

public class PrecioProductoBean {
	
	@Inject
	private CalculadoraPrecio calculadora;
	
	@PostConstruct
	public void init(){
		System.out.println("Init PrecioProductoBean");
	}
	public double getPrecio(){
		return calculadora.calcularPrecio(12, 44.55);
		
	}
}
