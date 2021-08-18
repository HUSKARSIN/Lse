import Lse.ListaSimplementeEnlazada;
import PC.cola;

public class Main  {
    public static void main(String[] args) {
       /* ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();*/

        cola cola = new cola();
        System.out.println(cola.estaVacia());

        for (int i = 0; i < 5; i++) {
            cola.insertar(i);
        }
        cola.mostrar();
    }
}
