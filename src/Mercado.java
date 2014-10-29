import java.util.*;

public class Mercado
{

    public static void main(String args[])
    {


	// Definir 5 instancias de la Clase Producto
        Producto m = new Producto("Pan", 6);
        Producto n = new Producto("Leche", 2);
        Producto o = new Producto("Manzanas", 5);
        Producto p = new Producto("Brocoli", 2);
        Producto q = new Producto("Carne", 2);

	// Definir un HashSet
        HashSet pedido = new HashSet();
        pedido.add(m);
        pedido.add(n);
        pedido.add(o);
        pedido.add(p);
        pedido.add(q);
	// Doble inserción de Objeto/referencia q
        pedido.add(q);

	// Imprimir contenido de HashSet
	// Aunque son insertados 6 elementos, el HashSet solo contiene 5
	// Lo anterior se debe a que un Set no permite elementos duplicados (q)

        System.out.println(" - Lista de mandado con " + pedido.size() + " elementos");

	// Definir Iterator para extraer/imprimir valores 

        for( Iterator it = pedido.iterator(); it.hasNext();) { 
	    Producto x = (Producto)it.next();
	    System.out.println(x.nombre + " : " + x.cantidad);

	}

	// No es posible eliminar elementos por indice
	// Un HashSet no ofrece este mecanismo, solo eliminación por valor de Objeto

	// Eliminar todos los valores del ArrayList
	pedido.clear();
        System.out.println(" - Lista de pedido final con " + pedido.size() + " elementos");
    }
}
