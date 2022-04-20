package model;

import dto.Leopardo_Lenins;
import dto.LeopardoAlans;
import dto.LeopardoCiros;
import dto.LeopardoJhobanys;

public class JLeninLeopardo {

	public static void main(String[] args) throws Exception {
		Thread L1 = new Leopardo_Lenins();
		L1.start();
		Thread L2 = new LeopardoAlans();
		L2.start();
		Thread L3 = new LeopardoCiros();
		L3.start();
		Thread L4 = new LeopardoJhobanys();
		L4.start();
		System.out.println("Empieza la carrera de Leopardos");

	}

}