package Poo.linked_list;
public class Main
{
    public static void main(String[] args) 
    {
        LinkedList linkedList = new LinkedList();
        linkedList.push(1);
        // linkedList.pop();
        System.out.println(linkedList.tail.getValue());
        System.out.println(linkedList.head.getValue());


    }    
}
