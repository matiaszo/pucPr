package Poo.linked_list;
public class LinkedList
{
    public Node head = null;
    public Node tail = null;
    public int length = 0;

    public boolean push(int value)
    {
        Node node = new Node(value);     
        if (head == null) 
        {
            this.head = node;
            this.tail = node;
        }else{
            this.tail.setNext(node);
            node.setPrev(tail);
            this.tail = node;
        }
        this.length++;
        return true;
    }

    public boolean pop()
    {
        if (this.length == 1) 
        {
            this.head = null;    
            this.tail = null;
            this.length = 0;
            return true;    
        }
        this.tail = this.tail.getPrev();
        this.tail.setNext(null);
        length--;
        return true;
    }
}