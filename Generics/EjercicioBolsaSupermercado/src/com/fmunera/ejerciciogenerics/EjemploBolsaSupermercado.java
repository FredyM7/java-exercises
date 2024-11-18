package com.fmunera.ejerciciogenerics;

public class EjemploBolsaSupermercado {
    public static void main(String[] args) {


        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>(5);
        bolsaLimpieza.addProducto(new Limpieza("Detergente", 2.50, "Sulfato, Perfume", 1.5));
        bolsaLimpieza.addProducto(new Limpieza("Cloro", 1.20, "Cloro activo", 2.0));
        bolsaLimpieza.addProducto(new Limpieza("Jabón líquido", 3.00, "Glicerina, Fragancia", 1.0));
        bolsaLimpieza.addProducto(new Limpieza("Limpiavidrios", 2.80, "Alcohol isopropílico", 0.75));
        bolsaLimpieza.addProducto(new Limpieza("Desinfectante", 3.50, "Cloruro de benzalconio", 1.2));

        System.out.println("=========BOLSA DE LIMPIEZA======================================");
        for(Limpieza l: bolsaLimpieza.getProductos()){
            System.out.println("Nombre: "+l.getNombre() +" Precio: "+ l.getPrecio() +" Componentes: "+ l.getComponentes() + " Litros: "+l.getLitros());
        }

        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>(5);
        bolsaLacteos.addProducto(new Lacteo("Leche", 1.50, 1000, 8));
        bolsaLacteos.addProducto(new Lacteo("Yogur", 2.00, 500, 6));
        bolsaLacteos.addProducto(new Lacteo("Queso", 5.00, 300, 20));
        bolsaLacteos.addProducto(new Lacteo("Mantequilla", 2.50, 200, 1));
        bolsaLacteos.addProducto(new Lacteo("Crema", 3.00, 400, 3));

        System.out.println("=========BOLSA DE LACTEOS=======================================");
        for(Lacteo l: bolsaLacteos.getProductos()){
            System.out.println("Nombre: "+l.getNombre() +" Precio: "+ l.getPrecio() +" Cantidad: "+ l.getCantidad() + " Proteinas: "+l.getProteinas());
        }

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>(5);
        bolsaFrutas.addProducto(new Fruta("Manzana", 1.20, 0.3, "Rojo"));
        bolsaFrutas.addProducto(new Fruta("Plátano", 0.80, 0.25, "Amarillo"));
        bolsaFrutas.addProducto(new Fruta("Naranja", 1.00, 0.35, "Naranja"));
        bolsaFrutas.addProducto(new Fruta("Pera", 1.10, 0.3, "Verde"));
        bolsaFrutas.addProducto(new Fruta("Fresa", 1.50, 0.1, "Rojo"));

        System.out.println("=========BOLSA DE FRUTAS=========================================");
        for(Fruta f: bolsaFrutas.getProductos()){
            System.out.println("Nombre: "+f.getNombre() +" Precio: "+ f.getPrecio() +" Peso: "+ f.getPeso() + " Color: "+f.getColor());
        }

        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>(5);
        bolsaNoPerecibles.addProducto(new NoPerecible("Arroz", 1.50, 1000, 350));
        bolsaNoPerecibles.addProducto(new NoPerecible("Lentejas", 2.00, 500, 320));
        bolsaNoPerecibles.addProducto(new NoPerecible("Pasta", 1.80, 400, 310));
        bolsaNoPerecibles.addProducto(new NoPerecible("Atún", 3.00, 200, 250));
        bolsaNoPerecibles.addProducto(new NoPerecible("Harina", 1.20, 1000, 370));

        System.out.println("=========BOLSA DE NO PERECIBLES===================================");
        for(NoPerecible n: bolsaNoPerecibles.getProductos()){
            System.out.println("Nombre: "+n.getNombre() +" Precio: "+ n.getPrecio() +" Contenido: "+ n.getContenido() + " Calorias: "+n.getCalorias());
        }


    }
}
