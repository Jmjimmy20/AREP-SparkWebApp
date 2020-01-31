package edu.escuelaing.arem.math;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<T> implements List<T>, Iterable<T> {

    Head<T> head;
    int size;
    boolean wasCreated;

    public LinkedList() {
        this.head = new Head<T>(null, null);
        size = 0;
    }

    /***
     * Metodo encargado de agregar un nuevo nodo al LinkedList
     * @param data Dato que almacena el nodo al ser creado
     * @return Retorna true si fue posible agregar el nuevo nodo
     **/
    public boolean add(T data) {
        Nodo<T> nodo = new Nodo<T>(data, null);
        if (size == 0) {
            this.head.setFirst(nodo);
            this.head.setLast(nodo);
        } else{
            this.head.setLast(nodo);
        }
        size++;
        return true;
    }

    /***
     * Metodo encargado de agregar un nuevo nodo al LinkedList usando un index
     * @param index Es el indice que indica en que lugar de la LinkedList se va a agregar el nodo
     * @param data Dato que almacena el nodo al ser creado
     **/
    public void add(int index,T data) { 
        try{
            if (index >= size){
                wasCreated = false;
                throw new IndexOutOfBoundsException("El index ingresado es mayor al tamaño de la lista");
            }final Nodo<T> nodo = new Nodo<T>(data, null);
            if(index == 0){
                nodo.setNextNode(head.getFirst());
                head.setFirst(nodo);
                wasCreated = true;
                size ++;
            }else{
                int c =1;
                Nodo<T> lastNodo = head.getFirst();
                Nodo<T> actNodo = lastNodo.getNextNode();
                while(c != index){
                    lastNodo = actNodo;
                    actNodo =actNodo.getNextNode();
                    c++;
                }
                lastNodo.setNextNode(nodo);
                nodo.setNextNode(actNodo);
                size ++;
                wasCreated = true;
            }
    

        }catch(IndexOutOfBoundsException e){
            throw e;
        }
        
    }

    /***
     * Metodo encargado de agregar una coleccion de datos
     * @param c Coleccion  a agregar
     * @return  Retorna indicando la validez de la operacion
     **/
    public boolean addAll(Collection<? extends T> c) {
        for(T b:c){
            Nodo<T> agrega = new Nodo<T>(b, null);
            if(size == 0){
                head.setFirst(agrega);
                head.setLast(agrega);
            }else{
                head.getLast().setNextNode(agrega);
                head.setLast(agrega);
            }
            size ++;
        }
        return true;
    }


    public boolean addAll(int index,  Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }


    /***
     * Metodo encargado de limpiar el LinkedList y eleminar las conexiones del head
     * */
    public void clear() {
        head.ClearHead();
        size =0;
    }

    /**
     * Metodo encargado de capturar el dato de un nodo a usando un index
     * @param index indica la posicion del nodo a buscar
     * @return Retorna el dato del nodo
     */
    public T get(int index) {
        T dato = null;
        try{
            if(index>size) throw new IndexOutOfBoundsException("El index es mayor al tamaño de la estructura");
            Nodo<T> NodoBuscar = head.getFirst();
            int c =0;
            while(c != index){
                NodoBuscar = NodoBuscar.getNextNode();
                c++;
            }
            dato = NodoBuscar.getData();

        }catch(IndexOutOfBoundsException e){
            throw e;
        }
        return dato;
    }

    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    /***
     * Metodo encargado de verificar si la LinkedList esta vacia
     * @return Retorna si esta vacia o no
     */
    public boolean isEmpty() {
        boolean isEmpty;
        if(size ==0) isEmpty =true;
        else isEmpty = false;
        return isEmpty;
    }


    /***
     * Metodo encargado de usar un iterator que recorre la LinkedList de forma lineal
     * @return Iterator 
     */
    public Iterator<T> iterator() {
        Iterator<T> res = new Iterator<T>() {
            private Nodo<T> now = head.getFirst();
            public boolean hasNext() {
                if (now != null)
                    return true;
                return false;
            }

            public T next() {
                T data = now.getData();
                now = now.getNextNode();
                return data;
            }
        };
        return res;
    }

    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public ListIterator<T> listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public T remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public T set(int index, T element) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Metodo que indica el tamaño actual del LinkedList
     * @return El numero que representa el tamaño
     */
    public int size() {
        return size;
    }

    public List<T> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }


}
