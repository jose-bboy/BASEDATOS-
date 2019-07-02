package tata.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosModificar {

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
	public void cuandomodificaentoncestrue() {
	boolean modificado=	this.base.modificar(new Dato("C1","TAAATA C1"));
	assertTrue("Deberia retornar true por que modifico",modificado== true);
	}
	@Test
	public void cuandonomodificaentoncesfalse() {
	boolean modificado=	this.base.modificar(new Dato("Cpp1","TAAATA C1"));
	assertTrue("Deberia retornar false por que no modifico",modificado== false);
	}

}
