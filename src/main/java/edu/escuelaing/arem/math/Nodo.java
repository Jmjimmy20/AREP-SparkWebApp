package edu.escuelaing.arem.math;

public class Nodo<T> {

    public T data;
    public Nodo<T> next;

    Nodo(T data, Nodo<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Metodo que agrega la conecxion del siguiente nodo al actualo
     * @param n siguiente nodo
     */
    public void setNextNode(Nodo<T> n) {
        next = n;
    }

    /**
     * Metodo que obtiene el siguiente nodo 
     * @return nodo
     */
    public Nodo<T> getNextNode(){
        return next;
    }


    /**
     * Metodo que agreda el dato al nodo
     * @param d dato
     */
    public void setData(T d){
        data =d;
    }

    /**
     * Metodo que obtiene el datod de un nodo
     * @return dato
     */
    public T getData(){
        return data;
    }
}
