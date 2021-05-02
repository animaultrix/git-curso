package com.cip.pro.tema_7.actividad_13.Interface;

public class Div implements IDiv{

	@Override
	public double div(int a, int b) {
		double result = (double)a/(double)b;
		return result;
	}

}
