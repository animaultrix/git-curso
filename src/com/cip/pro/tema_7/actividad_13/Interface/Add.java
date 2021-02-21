package com.cip.pro.tema_7.actividad_13.Interface;

public class Add implements IAdd{

	@Override
	public int add(int a, int b) {
		int result = a+b;
		return result;
	}

}
