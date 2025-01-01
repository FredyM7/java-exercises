# Java Exercises

Para la tarea se requiere crear un proyecto llamado `ProyectoMantenedorUsuariosJDBC`  para administrar a los usuarios de la Base de Datos, con las operaciones: actualizar, eliminar, crear, listar y salir.

La tabla usuarios la pueden crear a partir del siguiente esquema DDL:
~~~~
1.  CREATE TABLE `usuarios`  (
2.    `id`  int NOT NULL AUTO_INCREMENT,
3.    `username` varchar(12) DEFAULT NULL,
4.    `password` varchar(60) DEFAULT NULL,
5.    `email` varchar(45) DEFAULT NULL,
6.   PRIMARY KEY (`id`)
7.  ) ENGINE=InnoDB
~~~~
  
Se pide crear e implementar las clases: modelo `Usuario`, de conexión a la BBDD `ConexionBaseDatos` y la clase `UsuarioRepositorioImpl` implementada a partir de la interface `Repositorio` (con generic).

Para la clase de aplicación con el método `main` vamos a contar con un menú para poder seleccionar el tipo de operación, puede ser con la clase `Scanner` indicando una lista con las opciones, cada opción con un numero.

O bien! otra forma seria usando la clase `JOptionPane` para un menú con interfaces graficas de la siguiente forma:

```java
1.  int opcionIndice =  0;
2.  ...

4.  Map<String,  Integer> operaciones =  new  HashMap();
5.  operaciones.put("Actualizar",  1);
6.  operaciones.put("Eliminar",  2);
7.  operaciones.put("Agregar",  3);
8.  operaciones.put("Listar",  4);
9.  operaciones.put("Salir",  5);
10.
11.  Object[] opArreglo = operaciones.keySet().toArray();
12.
13.  Object opcion =  JOptionPane.showInputDialog(null,
14.    "Seleccione un Operación",  
15.    "Mantenedor de Usuarios",  
16.    JOptionPane.INFORMATION_MESSAGE,  null, opArreglo, opArreglo[0]);
17.
18.  if  (opcion ==  null)  {
19.    JOptionPane.showMessageDialog(null,  "Debe seleccionar una operación");
20.  }  else  {
21.   opcionIndice = operaciones.get(opcion.toString());
22.
23.    // aca un if o switch para las distintas operaciones.
24.  }
```
  

Según el numero ingresado usar un `if` o `switch` para implementar cada una de las 4 operaciones y 5 para salir.

Todos los datos se deben ingresar mediante el teclado como parámetros.

Usar un `do while` para iterar hasta que la operación sea salir, cada vez que se selecciona una operación distinta a salir, al finalizar con dicha operación debe volver al menú para continuar con otra, al finalizar con la opción salir (5) se debe cerrar la conexión a la base de datos y finalizar el programa.