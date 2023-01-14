# Tarea Reservas de Aulas
## Profesor: Andrés Rubio del Río
## Alumno: Hugo Fdez-Vega Álvarez

<img src="https://i.postimg.cc/W1kmpH40/profesores.png" width="300">
<img src="https://i.postimg.cc/FRD3ntPX/reservas.png" width="300">
<img src="https://i.postimg.cc/wv6DVxQk/reserva.png" width="300">

Desde el IES Al-Ándalus nos acaban de comentar que por favor añadamos persistencia a los datos introducidos, ya que tal y como está ahora la aplicación no es funcional. Por tanto, en este cuarto spring añadiremos persistencia a los datos utilizando para ello ficheros de objetos, para lo que sustituiremos el modelo que teníamos de memoria, por un modelo de ficheros.

Por tanto, tu tarea va a consistir en completar los siguientes apartados:

1. Crea un nuevo repositorio remoto en github y llámalo reservasAulas-v5.
2. Actualiza el fichero `README.md` en tu proyecto Eclipse utilizando el que puedes descargar del enlace proporcionado por el profesor y añade tu nombre en el apartado "Alumno". Realiza un commit.
3. Haz que las clases de dominio (para las que sea necesario) sean serializables para que se puedan leer y escribir de ficheros de objetos. Realiza un commit.
4. Implementa los métodos de lectura y escritura para la clase `Aulas`. Realiza un commit.
5. Implementa los métodos de lectura y escritura para la clase `Profesores`. Realiza un commit.
5. Implementa los métodos de lectura y escritura para la clase `Reservas`. Realiza un commit.
6. Haz que estos métodos sean accesibles desde el controlador, por lo que deberías modificar la clase `Modelo` y la interfaz `IModelo`. Realiza un commit.
7. Actualiza la clase `FactoriaFuenteDatos` para que contemple la opción de ficheros. Realiza un commit.
8. Haz las modificaciones oportunas en la clase `Controlador` para que al comenzar se leen los diferentes ficheros y al salir se escriban los mismos. Realiza un commit y súbelo a tu nuevo repositorio remoto.
