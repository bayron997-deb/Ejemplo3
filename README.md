Tareas a realizar en base al ejemplo 3 visto en clase:

- implemente un prototipo de su propuesta en código Java que permita "ejecutar" su modelo UML.
- incorpore elementos de JFrame y gestión de eventos de usuario que permita interactuar con su prototipo.
- considere el uso de packages, para separar la funcionalidad de su prototipo, aplicando lo revisado la clase anterior.

Ejemplo 3: Administracion de alumnos y profesores de un colegio.
Analisis:
3 packages que contienen diversas clases.

funciones: tendra el funcionamiento del programa

guis: relacionado a las guis que llevara el programa.

ejecutor: ejecutara el programa

Modelo a resolver:

hacer un entorno para registrar profesores y alumnos en un colegio.

Cada alumno tendra tiene un ID y un promedio de notas

Cada profesor se le asignara un salario

La clase Person tendra 2 clases hijas que son professor y Student, que cada una tiene atributos para registrar datos,
las Clase colegio crea 2 array para cada objeto de clase professor y Student, tiene metodos para crear objetos
y añadir sus datos a los array creados previamente.

En el entorno grafico MenuColegio se encarga desplegar el menu principal y cada 
boton tiene una funcion diferente. donde se podra ingresar datos por una interfaz depende el caso,
si es para profesor o estudiante y luego los botones para ver la lista desplegaran un mensaje en 
consola con la llista de profesores o estudiantes creados.