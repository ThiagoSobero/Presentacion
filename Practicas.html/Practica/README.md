# Practica formulario complejo

Este formulario consiste en crear un html y un css que hagan parecer a un formulario simple con sus requisitos

## html

El html tendra varías partes las cuales compondran los diferentes apartados que exige el programa

1. Cuerpo
    en esta metemos todo el cuerpo del html dentro de una etiqueta form con la cual nos resultara más facil hacer esta practica
    ```
    <form action="Formulariodealta">
    <!-- contenido -->
    </form>
    ```

2. Titulo
    esta es la parte más facil debido a que solo tendras que poner la etiqueta h1 y el nombre de tu titulo
    ```
    <h1>Formulario de alta</h1>
    ```
3. Contenido
    Esta parte estara compuesta por varías etiquetas que compondran la estructura de nuestro html, siendo una de estas etiquetas div(para esta parte es mejor usar article)
    Ejemplo:
    ```
    <div id="mov">
            <input type="text" name="Nombre" />
            <p>Nombre</p>
            <input name="Apellidos" required />
            <p>Primer Apellido</p>
            <input name="Apellidos" required />
            <p>Segundo Apellido</p>
        </div>
    ```
    estos div tendran varios id con los que podremos diferenciar a la hora de hacer un css
4. Contenido div
    Estas son las etiquetas que comprondar el div siendo estas:
    **Input:**
    sirviendo como cuadros de diferentes tipos siendo estos los que nos ayudaran a que el usuario pueda escribir en el formulario
    Ejemplo:
    ```
    <input type="text" name="Nombre" />
    ```
    **select**
    Esta siendo un menu de opciones en el que tendras que establecer sus debidas opciones a escoger
    Ejemplo:
    ```
    <select>
        <option>España</option>
        <option>Andorra</option>
        <option>Portugal</option>
    </select>
    ```
    **option**
    Esta es el contenido de los select, son las opciones que establecemos para esta casilla
    Ejemplo:
    ```
    <option>España</option>
    ```

## css
En esta parte editaremos el html para que se parezca lo maximo posible a las imagenes que nos piden, por lo cual usaremos los debidos id que hemos puesto en las diferentes etiquetas de nuestro html
ejemplo:
```
form #palabra{
    float: right;
    width: 200px;
    margin-top: -10px;
    color: #fff;
}
```
tambien tenemos que hacer cuando el raton este pasando por ciertas casillas se ponga de otro color (en este caso tendremos que meter una imagen de fondo), por lo que añadiremos a nuestra etiqueta el **:hover**, esta siendo la que nos ayudara con el ejercicio
Etiqueta normal
```
#cubo1{
    background-color: #fff;
}
```
Etiqueta con hover
```
#cubo1:hover{
    background-image: url(fondo\ cubo.jpg);
}
```