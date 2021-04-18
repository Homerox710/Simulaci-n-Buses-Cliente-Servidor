# Simulacion Buses

---

- Este proyecto simula un día de operación de una ruta de buses de San José.
- El proyecto lo realicé para practicar la estructura cliente-servidor, protocolos TCP y UDP y también los hilos. 

---

El programa se basa en 10 buses (hilos) que corren sobre un mapa, en el que hay 20 paradas por las cuales los buses van pasando, haciendo un circuito, cada vez que los buses lleguen a una parada se detendrán por 2 segundos, el tiempo que tardan los buses en moverse es aleatorio, por lo que en algún momento van a coincidir en una parada, cuando esto pasa el programa nos va a notificar y se va a adelantar una parada al bus que se atrasó y sentar 2 segundos más al bus que estaba en la parada.

Para utilizar el programa se debe correr el programa **ServidorL1** y luego **ClienteL1**, el servidor no hará nada hasta que el cliente esté conectado.

En la parte del cliente se nos abrirá una ventana donde tendremos que escoger el bus que deseamos monitorear, cuando escojamos el bus, el cliente le enviará al servidor el número del bus que quiere monitorear, el servidor lo recibe y empieza a hacer el recorrido de los buses hasta que se desconecte el cliente, en la ventana del cliente podemos consultar alguna información de interés mientras se van imprimiendo las ultimas paradas donde estuvo el bus y la hora en la que estuvo ahí, el programa se terminará de ejecutar cuando el reloj que del cliente llegue a las 12 MN.
En el servidor podremos abrir una ventana que nos mostrará la ultima parada en que estuvieron todos los buses.

![Simulacion%20Buses/Untitled.png](Simulacion%20Buses/Untitled.png)

![Simulacion%20Buses/Untitled%201.png](Simulacion%20Buses/Untitled%201.png)

![Simulacion%20Buses/Untitled%202.png](Simulacion%20Buses/Untitled%202.png)
