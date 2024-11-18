import java.util.Calendar;
import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {


        OrdenCompra orden1 = new OrdenCompra("Orden de tecnología personal");

        Calendar calendario = Calendar.getInstance();
        calendario.set(2024, Calendar.JULY, 15, 9, 30, 17);
        Date fechaOrden1 = calendario.getTime();

        orden1.setFecha(fechaOrden1);
        orden1.setCliente(new Cliente("María", "Gómez"));
        orden1.addProducto(new Producto("Dell","Laptop Dell XPS 13",1200))
                .addProducto(new Producto("Logitech", "Ratón Inalámbrico Logitech MX Master 3", 100))
                .addProducto(new Producto("Targus", "Mochila para Laptop Targus", 80))
                .addProducto(new Producto("Corsair", "Teclado Mecánico Corsair K95", 200));


        OrdenCompra orden2 = new OrdenCompra("Orden de dispositivos móviles");
        calendario.set(2024, Calendar.JULY, 16, 11, 45, 18);
        Date fechaOrden2 = calendario.getTime();

        orden2.setFecha(fechaOrden2);
        orden2.setCliente(new Cliente("Juan", "Perez"));
        orden2.addProducto(new Producto("Apple", "iPhone 14 Pro", 999))
                .addProducto(new Producto("Sony", "Auriculares Sony WH-1000XM4", 350))
                .addProducto(new Producto("Anker", "Cargador Rápido Anker", 40))
                .addProducto(new Producto("OtterBox", "Funda para iPhone OtterBox", 50));


        OrdenCompra orden3 = new OrdenCompra("Orden de accesorios para el hogar");
        calendario.set(2024, Calendar.JULY, 17, 21, 12, 19);
        Date fechaOrden3 = calendario.getTime();

        orden3.setFecha(fechaOrden3);
        orden3.setCliente(new Cliente("Laura", "Martínez"));
        orden3.addProducto(new Producto("iRobot", "Aspiradora Robot Roomba", 500))
                .addProducto(new Producto("Dyson", "Purificador de Aire Dyson", 600))
                .addProducto(new Producto("Nespresso", "Cafetera Nespresso", 200))
                .addProducto(new Producto("Samsung", "Microondas Samsung", 150));


        System.out.println(orden1.verDetalles());
        System.out.println(orden2.verDetalles());
        System.out.println(orden3.verDetalles());
    }
}
