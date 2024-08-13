package Poo.linked_list;
public class Node 
{
    private Node next;    
    private Node prev;
    private int value;

    public Node(int value)
    {
        this.value = value;
    }

    public Node getNext() {return this.next;}
    public void setNext(Node next) {this.next = next;}

    public Node getPrev() {return this.prev;}
    public void setPrev(Node prev) {this.prev = prev;}

    public int getValue() {return this.value;}
    public void setValue(int value) {this.value = value;}
}
