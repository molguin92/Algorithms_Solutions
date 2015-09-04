package helloworld; //Paquete Java, nos sirve para organizar clases.
					//Tambien nos permite tener clases con el mismo 
					//nombre, diferenciadas por sus paquetes:
					//helloworld.HelloWorld y byeworld.HelloWorld

public class HelloWorld {
	/*
	 * En Java, todo debe estar contenido en clases.
	 * Ademas, cada archivo .java debe contener a lo mas
	 * una clase top-level con el mismo nombre que el
	 * archivo.
	 * HelloWorld -> HelloWorld.java
	 */
	
	private int pri = 1; //Esta es una variable global privada.
					 //Acceso: Esta clase.
	
	public int pub = 2; //Esta es una variable global publica.
					//Acceso: Todo el mundo.
	
	protected int pro = 3; //Variable global protegida.
					   //Acceso: Paquete y subclases.
	
	int pac; //Variable por defecto.
			 //Acceso: Paquete}
	
	
	static int stat = 4; //Variable statica (no instanciable)
	final int fin = 0; //Variable final (no modificable)
	
	public void sayHello()
	{
		System.out.println("Hello World! " + pri);
	}
	
	public static void sayHelloStat()
	{
		System.out.println("Hello World! " + stat);
	}
	

	/**
	 * main() es el punto de entrada al programa al ser ejecutado.
	 * Si el programa no tiene main(), es simplemente una clase
	 * que debe ser ejecutada desde otro programa.
	 * 
	 * @param args El parametro args corresponde a los argumentos
	 * de ejecucion entregados al invocar el programa.
	 */
	public static void main(String[] args) {
		
		HelloWorld hello = new HelloWorld();
		hello.sayHello();
		
		HelloWorld.sayHelloStat();

	}

}
