package jpabank;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Controller;

public class Start {

	@Test
	public void testTest() {
		Controller c = new Controller();
		assert(c.test());
	}

}
