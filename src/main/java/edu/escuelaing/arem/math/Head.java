package edu.escuelaing.arem.math;

public class Head<T> {

    public Nodo<T> firstNodo;
    public Nodo<T> lastNodo;

    Head(Nodo<T> first, Nodo<T> last) {
        firstNodo = first;
        lastNodo = last;
    }

    /**
     * Metodo que retorna el ultimo nodo del head
     * @return Nodo
     */
    public Nodo<T> getLast() {
        return lastNodo;
    }

    /**
     * Metodo que retorna el primer nodo del head
     * @return Nodo
     */
    public Nodo<T> getFirst() {
        return firstNodo;
    }

    /**
     * Metodo que agrega el primer nodo del head
     */
    public void setFirst(Nodo<T> nodo){
        firstNodo = nodo;
    }

    /**
     * Metodo que agrega el ultimo nodo del head
     */
    public void setLast(Nodo<T> nodo){
        if(lastNodo != null){
            lastNodo.setNextNode(nodo);
        }
        lastNodo = nodo;
    }

    /**
     * Metodo que elimina la conexion del primer y segundo nodo del head
     */
    public void ClearHead(){
        firstNodo = null;
        lastNodo = null;
        System.gc();
        System.runFinalization();
    }

}