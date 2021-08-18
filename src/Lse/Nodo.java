package Lse;

public  class Nodo {
    public Nodo(Object dato, Nodo siguiente) {
        this.setDato(dato);
        this.setSiguiente(siguiente);
    }

    private Object dato;
    private Nodo siguiente;

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}