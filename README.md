# JAX-WS
Web Service
Primero creo la interfaz ICalculadora con el método public double opracion y parámetros int opcion, double valor1 y double valor2. A la clase le puse la anotación @WebService y al método @WebMethod.
Luego creé la clase calbuladoraImpl con la lógica. A la clase ponerle anotación @WebService(endpointInterfase = "com.jb.ws.calculadora.ICalculadora".
Luego creé la clase calculadoraPublish con método main y Endpoint con el nombre que quiero dar al ws con el q es llamado (hpps://localhost:8080/WS/Calculadora).
Después probé todo ejecutando la clase CalculadoraPublish. Luego en el Browser pongo http://localhost:8080/WS/Calculadora?wsdl, esto me tiene que traer el wsdl.
Si lo anterior funciona, ejecuto en cmd parado en la carpeta .../src/main/java lo siguiente: wsimport -s . http://localhost:8080/WS/Calculadora?wsdl, esto me generó las clases para el cliente que va a consumir el servicio y me modificó la interfaz ICalculadora agregándole cosas. 
Luego creé la clase CalculadoraConsumer con método main. A esta hay que ejecutarla para que consuma el servicio.
