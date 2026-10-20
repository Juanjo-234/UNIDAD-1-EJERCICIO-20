Este programa está diseñado para modelar y gestionar el seguimiento y desarrollo de un **partido de fútbol** utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `PartidoFutbol`:** Modela un encuentro deportivo conteniendo sus atributos principales: el nombre del equipo local (`equipoLocal`), el nombre del equipo visitante (`equipoVisitante`), la cantidad de goles anotados por el local (`golesLocal`) y la cantidad de goles anotados por el visitante (`golesVisitante`).
* **Incorpora el constructor:** Permite inicializar el partido recibiendo los nombres de ambas escuadras y asegurando que ambos marcadores comiencen estrictamente en cero (`0`) al momento de instanciar el objeto.
* **Registra las anotaciones (`golLocal` y `golVisitante`):** Implementa métodos específicos para incrementar en uno (`1`) el marcador del equipo correspondiente cada vez que se produce una anotación.
* **Muestra el desarrollo (`mostrarResultado`):** Proporciona un método encargado de imprimir en formato claro el estado actual del marcador entre ambos equipos.
* **Ejecuta la prueba (`main`):** Instancia un objeto de tipo `PartidoFutbol` (por ejemplo, un encuentro decisivo de la Copa del Mundo), simula varias anotaciones consecutivas para ambos lados e imprime el marcador final del partido por consola.
