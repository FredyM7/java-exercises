package org.fmunera.example.jdbc;

import org.fmunera.example.jdbc.model.User;
import org.fmunera.example.jdbc.repository.Repository;
import org.fmunera.example.jdbc.repository.UserRepository;
import org.fmunera.example.jdbc.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcExample {
    public static void main(String[] args) throws SQLException {

        try(Connection conn = DatabaseConnection.getInstance()) {

            boolean exit = false;
            while (!exit) {

                Scanner sc = new Scanner(System.in);

                System.out.println("===== GESTIÓN DE USUARIOS =====");
                System.out.println("1. Listar usuarios");
                System.out.println("2. Crear usuario");
                System.out.println("3. Modificar usuario");
                System.out.println("4. Eliminar usuario");
                System.out.println("5. Salir");
                System.out.print("Selecciona una opción (1-5): ");

                int option = Integer.parseInt(sc.nextLine());

                Repository<User> repository = new UserRepository();

                switch (option) {
                    case 1 -> repository.list().forEach(System.out::println);
                    case 2 -> {

                        System.out.print("Ingresar nombre: ");
                        String name = sc.nextLine();

                        System.out.print("Ingresar contraseña: ");
                        String password = sc.nextLine();

                        System.out.print("Ingresar correo: ");
                        String email = sc.nextLine();

                        User user = new User(name, password, email);
                        repository.save(user);
                    }
                    case 3 -> {

                        System.out.print("Ingresar ID: ");
                        Long id = Long.parseLong(sc.nextLine());
                        System.out.print("Ingresar nombre: ");
                        String name = sc.nextLine();
                        System.out.print("Ingresar contraseña: ");
                        String password = sc.nextLine();
                        System.out.print("Ingresar correo: ");
                        String email = sc.nextLine();

                        User user = new User(id, name, password, email);

                        repository.save(user);
                    }
                    case 4 -> {
                        System.out.print("Ingresar ID del usuario a eliminar: ");
                        repository.delete(sc.nextLong());
                    }
                    case 5 -> {
                        exit = true;
                        System.out.println("Saliendo del programa...");
                    }
                    default -> System.out.println("Opción no válida, por favor selecciona una opción entre 1 y 5");
                }
                ;

            }
        }

    }
}
