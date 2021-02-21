package com.cip.pro.tema_7.actividad_13.Interface;

public class Calculadora implements IAdd,ISub,IMul,IDiv {
public int add(int a,int b)
{
Add A = new Add();
return A.add(a, b);
}
public int sub(int a,int b)
{
Sub S = new Sub();
return S.sub(a, b);
}
public int mul(int a,int b)
{
Mul M = new Mul();
return M.mul(a, b);
}
public double div(int a,int b)
{
Div D = new Div();
return D.div(a, b);
}
}