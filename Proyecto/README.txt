El programa tiene una estructura cliente-servidor y se basa en una simulación de una ruta de autobuses de la capital de Costa Rica, 
tenemos 10 Buses(Hilos) que corren simultaneamente sobre un mapa, pasando por 20 paradas de forma constante(como un circuito) hasta que 
se haya desconectado el cliente, cada vez que los buses lleguen a una parada se detendrán por 2 segundos, el tiempo que tardan los buses en moverse es
aleatorio, por lo que en algún momento van a coincidir en una parada, cuando esto pasa el programa nos va a notificar y se va a adelantar una parada
al bus que se atrasó y sentar 2 segundos más al bus que estaba en la parada.

Para utilizar el programa se debe correr el programa ServidorL1 y luego ClienteL1, el servidor no hará nada hasta que el cliente esté conectado,
en la parte del cliente se nos abrirá una ventana donde tendremos que escoger el bus que deseamos monitorear, cuando escojamos el bus, el cliente le 
enviará al servidor el número del bus que quiere monitorear, el servidor lo recibe y empieza a hacer el recorrido de los buses hasta que se desconecte
el cliente, en la ventana del cliente podemos consultar alguna información de interés mientras se van imprimiendo las ultimas paradas
donde estuvo el bus y la hora en la que estuvo ahí, el programa se terminará de ejecutar cuando el reloj que del cliente llegue a las 12 MN.
En el servidor podremos abrir una ventana que nos mostrará la ultima parada en que estuvieron todos los buses.


NOTA: Probar el programa también corriendo la clase ServidorPrueba que está en el paquete prueba, y luego corriendo el cliente, para comprobar el 
funcionamiento del cliente. El programa no funcionó del todo, al usar ventanas, la ventana del mapa y los hilos corriendo 
interfieren con el proceso de envío de datos al cliente, si corremos el programa vemos que el cliente funciona a la perfección. Y corriendo el programa con 
el servidor principal veremos que los buses sí se van actualizando y que se notifica y maneja el problema con la llegada simultanea a las paradas.