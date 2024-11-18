package com.fmunera.app.ejemplo;

import com.fmunera.app.datos.*;


public class Ejemplo {
    public static void main(String[] args) {

        Lacteo lacteo1 = new Lacteo("Leche Entera", 1.99, 1, 8);
        Lacteo lacteo2 = new Lacteo("Yogur Natural", 2.49, 2, 10);

        Fruta fruta1 = new Fruta("Manzana", 1.50, 150.0, "Rojo");
        Fruta fruta2 = new Fruta("Plátano", 0.99, 120.0, "Amarillo");

        Limpieza limpieza1 = new Limpieza("Detergente Líquido", 5.99, "Tensioactivos, fragancia", 2.0);
        Limpieza limpieza2 = new Limpieza("Limpiador Multiusos", 4.20, "Ácidos, alcohol", 1.5);

        NoPerecible noPerecible1 = new NoPerecible("Arroz", 2.50, 1000, 350);
        NoPerecible noPerecible2 = new NoPerecible("Lentejas", 3.75, 500, 280);

        Producto[] productos = {lacteo1,lacteo2,fruta1,fruta2,limpieza1,limpieza2,noPerecible1,noPerecible2};


        for(Producto producto : productos){
            System.out.println("=============================================");
            System.out.println(producto);
        }


    }
}
