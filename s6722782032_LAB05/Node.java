package s6722782032_LAB05;
public class Node<T> {

    T element;
    Node<T> next;

    Node(T element) {
        this.element = element;
        next = null;
    }
}