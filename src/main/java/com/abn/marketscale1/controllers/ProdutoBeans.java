package com.abn.marketscale1.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ProdutoBeans implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public String teste() {
		System.out.println("teste");
		return null;
	}

}
