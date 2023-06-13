public class Main {
    public static void main(String[] args) {


        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertBeginning(5);
        list.insertAtEnd(30);
        list.insertBeginning(2);

        System.out.println("Linked List: ");
        list.printList();

        System.out.println();
        System.out.println("Search 20: " + list.search(list.head,20));
        System.out.println("Search 15: " + list.search(list.head,15));

        list.deleteNode(0);
        list.deleteNode(2);

        System.out.println("Linked List after deletion: ");
        list.printList();
    }

}