public class LinkedList {

    // Head of LinkedList
    Node head;

    // create a Node Class
    class Node {
        int data;
        Node next;

        // Constructor to create
        // a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }


    public void insertBeginning(int new_data) {
        // insert data
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Insert at the beginning
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        // insert data
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    // Insert at the end
    public void insertAtEnd(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }

    // Delete a Node
    void deleteNode(int position) {
        if (head == null) {
            return;
        }

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }
        // Find the key to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If the key is not present
        if (temp == null || temp.next == null)
            return;

        // Remove the node
        Node next = temp.next.next;

        temp.next = next;
    }



    // Search a node
    boolean search(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }

    //print all the nodes
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }

    }


}
