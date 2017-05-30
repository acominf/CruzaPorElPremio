### Objetivo del juego/aplicación
El objetivo de este juego es que el jugador cruze los escenarios sin ser arrollado o sin caer (dependiendo el nivel en que se encuentre) y a la vez atrapar los premios en el camino para conseguir la mayor cantidad de puntos posible.

### Descripción del juego/aplicación
El juego consta de dos niveles diferentes:

**Nivel 1:** El objetivo de este nivel consta de cruzar una calle sin ser arrollado.

**Nivel 2:** Para este nivel se tiene un rio, hay que cruzarlo arriba de los troncos que pasan sin caer al agua.


En el camino se pueden recoger las monedas que aparezcan para sumar mas puntos, tambien habra oportunidad para obtener vidas extras tomando los corazones que aparezcan.
Se cuenta con 5 vidas iniciales, si se terminan comienzan de nuevo desde el primer nivel.

### Clases principales y sus características
1. Personajes
* Inicializa los personajes del juego.
* Muestra una pantalla para escoger el personaje deseado.
* Dibuja el personaje seleccionado en el nivel.

2. Jugador
* Mueve el personaje por el juego.
* Guarda los puntos que se vayan acumulando.
* Cuenta las vidas restantes.

3. Nivel 1
* Dibuja el escenario del primer nivel.
* Verifica cuando se toma alguna moneda o vida.

4. Nivel 2
* Dibuja el escenario del segundo nivel.
* Verifica cuando se obtiene alguna moneda o vida.

5. Autos
* Inicializa los autos.
* Dibuja los autos en el escenario.
* Verifica si toca al jugador.

### Diagrama de clases
![Diagrama de clases](https://github.com/acominf/CruzaPorElPremio/blob/master/imagenes/CruzaPorElPremio.png)

### Personajes
![Ardilla](https://github.com/acominf/CruzaPorElPremio/blob/master/imagenes/Ardilla3.png)

![Cerdo](https://github.com/acominf/CruzaPorElPremio/blob/master/imagenes/Cerdo3.png)

![Pato](https://github.com/acominf/CruzaPorElPremio/blob/master/imagenes/Patito3.png)

![Pato2](https://github.com/acominf/CruzaPorElPremio/blob/master/imagenes/Pato_Salvaje3.png)

![Perro](https://github.com/acominf/CruzaPorElPremio/blob/master/imagenes/Perro3.png)

![Rana](https://github.com/acominf/CruzaPorElPremio/blob/master/imagenes/Rana3.png)

### Obstaculos

![Auto](https://github.com/acominf/CruzaPorElPremio/blob/master/imagenes/carro2.png)
Los autos aparecen el el nivel numero 1, se mueven en diferentes direcciones 
y se necesita esquivarlos, si un auto te toca pierdes una vida y regresas al inicio
del nivel.

![Tronco](https://github.com/acominf/CruzaPorElPremio/blob/master/imagenes/tronco2.png)
Estos objetos aparecen el el nivel 2, los troncos van por el agua y el objetivo 
es subir en ellos para intentar cruzar el rio, si caes de alguno de ellos pierdes
una vida y regresas al inicio del nivel.


### Ayudas

![Monedas](https://github.com/acominf/CruzaPorElPremio/blob/master/imagenes/moneda2.png)
Las monedas aparecen a lo largo del juego, al atraparlas se aumentan 
100 puntos a tu puntaje total.

![Corazones](https://github.com/acominf/CruzaPorElPremio/blob/master/imagenes/corazon2.png)
Los corazones son vidas extra que aparecen dentro del juego, al
atraparlas se incrementa una vida a tu marcador.


### Nivel 1

![Nivel1](https://github.com/acominf/CruzaPorElPremio/blob/master/imagenes/nivel_1.png)


### Nivel 2

![Nivel2](https://github.com/acominf/CruzaPorElPremio/blob/master/imagenes/nivel_2.png)

### Video
<iframe width="560" height="315" src="https://www.youtube.com/embed/2dvw_6O51AE" frameborder="0" allowfullscreen></iframe>


### Autor(es)
El autor(es) del proyecto son:
- Sonia Virginia Hernandez Huerta (@SoniaHernandez2010)

### Materia(s)
- Programación Orientada a Objetos

### Semestre
- 2016-2017/II

### Markdown
El contenido de esta página está escrito en un lenguaje de marcado sencillo llamado *Markdown*. Para más detalles consulta la página de [Markdown para GitHub](https://guides.github.com/features/mastering-markdown/).

### Temas de Jekyll
El estilo y presentación de esta página utiliza el tema de Jekyll seleccionado en la configuración del repositorio. El nombre de este tema está almacenado en el archivo de configuración `_config.yml`. Para más información acerca de los temas de Jekyll soportados por GitHub [haz click en este enlace](https://pages.github.com/themes/).
