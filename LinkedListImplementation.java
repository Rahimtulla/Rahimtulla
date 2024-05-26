package practicejava;

public class LinkedListImplementation {
    Node head;

    static class Node{
        int data;
        Node next;
         public Node(int d){
             data= d;
             next=null;
         }
    }

    public static void insert(LinkedListImplementation linkedListImplementation,int data){
         Node node = new Node(data);
         if(linkedListImplementation.head==null){
             linkedListImplementation.head=node;
         }
         else{
             Node last =linkedListImplementation.head;
             while (last.next != null) {
                 last = last.next;
             }
             last.next = node;
         }


    }

    public static void printList(LinkedListImplementation list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
        insert(linkedListImplementation,1);
        insert(linkedListImplementation,2);
        printList(linkedListImplementation);
    }


}
