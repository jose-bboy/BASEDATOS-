package tata.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosListar {
	 private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base= new BaseDeDatos();
	}

	@Test
	public void CuandononoAgregaListaSize0() {
		int largo= this.base.listar().size();
		assertTrue("es"+ largo +" pero deberia ser 0", largo ==0);
		
	}
	@Test
	public void CuandoAgrega1ListaSize1() {
		this.base.agregar(new Dato("C1","DATA C1"));
		int largo= this.base.listar().size();
		assertTrue("es"+ largo +" pero deberia ser 0", largo ==1);
		
	}

}
