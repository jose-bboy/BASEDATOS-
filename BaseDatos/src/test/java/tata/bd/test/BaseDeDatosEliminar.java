package tata.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosEliminar {
	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base= new BaseDeDatos();
		this.base.agregar(new Dato("C1","DATA C1"));
		this.base.agregar(new Dato("A1","DATA A1"));
		this.base.agregar(new Dato("J1","DATA J1"));
		this.base.agregar(new Dato("F1","DATA J1"));
	}

	@Test
	public void cuandoeliminaundatoellargodelalistaes3() {
		this.base.eliminar("A1");
		int largo= this.base.listar().size();
		assertTrue("es"+ largo +" pero deberia ser 3", largo ==3);
	}
	@Test
	public void cuandoeliminaentoncestrue() {
		boolean respuesta =this.base.eliminar("A1");
		
		assertTrue(respuesta);
	}
	@Test
	public void cuandoNoeliminaentoncesfalse() {
		boolean respuesta =this.base.eliminar("App1");
		
		assertTrue("Deberia retornar falso por que no elimino",respuesta== false);
	}

}
