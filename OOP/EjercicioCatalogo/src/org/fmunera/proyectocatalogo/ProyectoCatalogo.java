package org.fmunera.proyectocatalogo;

import org.fmunera.proyectocatalogo.modelo.*;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        IProducto iphone = new Iphone(1000, "Apple", "iPhone 13", "Negro");
        IProducto tvLcd = new TvLcd(800, "Samsung", 55);
        IProducto libro = new Libro(300, new Date(), "Gabriel García Márquez", "Cien años de soledad", "Editorial XYZ");
        IProducto comics = new Comics(200, new Date(), "Stan Lee", "Spider-Man", "Marvel", "Spider-Man");


        IProducto[] productos = new Producto[4];

        productos[0] = iphone;
        productos[1] = tvLcd;
        productos[2] = libro;
        productos[3] = comics;

        for(IProducto producto: productos){

            System.out.print("Tipo de: " + producto.getClass().getName());
            System.out.print(" - ");
            System.out.print("Precio: " + producto.getPrecio());
            System.out.print(" - ");
            System.out.print("Precio final: " + producto.getPrecioVenta());

            // Para los Electronicos
            if (producto instanceof IElectronico) {
                System.out.print(" - ");
                System.out.print("Fabricante: " + ((IElectronico) producto).getFabricante());

                // Para los IPhone
                if (producto instanceof Iphone) {
                    System.out.print(" - ");
                    System.out.print("Modelo: " + ((Iphone) producto).getModelo());
                    System.out.print(" - ");
                    System.out.print("Color: " + ((Iphone) producto).getColor());
                }

                // Para los LCD
                if (producto instanceof TvLcd) {
                    System.out.print(" - ");
                    System.out.print("Pulgadas: " + ((TvLcd) producto).getPulgadas());
                }
            }

            // Para los Libros
            if (producto instanceof ILibro) {
                System.out.print(" - ");
                System.out.print("Titulo: " + ((ILibro) producto).getTitulo());
                System.out.print(" - ");
                System.out.print("Autor: " + ((ILibro) producto).getAutor());
                System.out.print(" - ");
                System.out.print("Editorial: " + ((ILibro) producto).getEditorial());
                System.out.print(" - ");
                System.out.print("Fecha de publicación: " + ((ILibro) producto).getFechaPublicacion());

                // Para los Comics
                if (producto instanceof Comics) {
                    System.out.print(" - ");
                    System.out.print("Personaje: " + ((Comics) producto).getPersonaje());
                }

            }

            System.out.println();
        }
    }
}
