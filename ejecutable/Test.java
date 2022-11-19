package ejecutable;

import modelo.Fecha;

public class Test 
{
    public static void main(String[] args) 
    {
        Fecha f = new Fecha(2,10,1970);
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);

        Fecha f2 = new Fecha(15,12,2003);
        f2.setDia(15);
        f2.setMes(12);
        f2.setAnio(2003);

        Fecha f4 = new Fecha(15,12,2004);
     

        System.out.println("Día: " + f.getDia());
        System.out.println("Mes: " + f.getMes());
        System.out.println("Año: " + f.getAnio());
        System.out.println(f.toString());
        System.out.println(f2.toString());
        System.out.println(f4.toString());

        
        if (f.equals(f2))
        {
            System.out.println("Las fechas son iguales");
        }
        else
        {
            System.out.println("Las fechas son diferentes");
        }         

        f.addDias(360);
        System.out.println(f.toString());

    }
}