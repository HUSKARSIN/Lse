package Lse;

public class ListaSimplementeEnlazada {
     protected Nodo primero;

    public ListaSimplementeEnlazada(){
        primero = null;
    }

    public boolean estaVacia(){
        return primero == null;
    }

    public void  insertar(Object dato){
        if (estaVacia()){
            Nodo nuevo = new Nodo(dato,null);
            primero = nuevo;
        } else {
            Nodo nuevo = new Nodo(dato,primero);
            primero = nuevo;
        }
    }

    public void éliminar(){
        if (!estaVacia()){
            primero = primero.getSiguiente();
        }
    }

    public void mostrar(){
        Nodo tmp = primero;
        while (tmp != null){
            System.out.println();
        }
        System.out.println();
    }
}
