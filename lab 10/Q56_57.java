
import java.util.Scanner;

class Node {
    int info;
    Node link;

    public Node(int data){
        this.info=data;
        this.link =null;

    }

   
}

class LinkeedList {
    Node first;

    LinkeedList() {
        this.first = null;

    }


    public void insertAtFirst(int data) {

        // created a linkedlist
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;

        }
        // new node points first node
        newNode.link = first;
        // first node is now the new node
        first = newNode;

    }

    public int deleteFirst() {
        if (first == null) {
            System.out.println("Linked list is empty");
            return -1;
        }
        int val = first.info;
        first = first.link;
        return val;
    }

    public void display() {
        if (first == null) {
            System.out.println("Linked list is Empty");
        }

        // new temp variable where we assign first ll
        Node temp = first;
        // while loop for temp variable to be assign to each of the linked list so can be printed
        while (temp != null) {
            System.out.print(temp.info + "-->");
            temp = temp.link;
        }
        System.out.println("null");
    }


    public void insertAtLast(int data) {
        Node n1 = new Node(data);
        if (first == null) {
            first = n1;

        }
        Node tail = first;
        while (tail.link != null) {
            tail = tail.link;
        }
        tail.link = n1;
    }

    public int deleteLast() {
        // we need to find previous of last node so that previous link can be assigned null
        Node prev = first;
        int val = prev.info;


        while (prev.link.link != null) {
            prev = prev.link;
        }
        prev.link = null;

        return val;

    }

    public void
    deleteAtPosition(int value) {
        Node current = first;
        Node previous = null;

        // Traverse the list to find the node with the value
        while (current != null && current.info != value) {
            previous = current;
            current = current.link;
        }

        // If node with value was found, delete it
        if (current != null) {
            // Adjust pointers to skip the node
            if (previous == null) { // If the node to be deleted is the head
                first = current.link;
            } else {
                previous.link = current.link;
            }
        } else {
            System.out.println("Node with value " + value + " not found");
        }
    }


    }

    public class Q56_57 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            LinkeedList list = new LinkeedList();

            int choice, data, position;

            while (true) {
                System.out.println("\nLinked List Operations:");
                System.out.println("1. Insert a node at the front");
                System.out.println("2. Display all nodes");
                System.out.println("3. Delete the first node");
                System.out.println("4. Insert a node at the end");
                System.out.println("5. Delete the last node");
                System.out.println("6. Delete a node from specified position");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter data to insert at the front: ");
                        data = scanner.nextInt();
                        list.insertAtFirst(data);
                        break;
                    case 2:
                        list.display();
                        break;
                    case 3:
                        list.deleteFirst();
                        break;
                    case 4:
                        System.out.print("Enter data to insert at the end: ");
                        data = scanner.nextInt();
                        list.insertAtLast(data);
                        break;
                    case 5:
                        list.deleteLast();
                        break;
                    case 6:
                        System.out.print("Enter position to delete node: ");
                        position = scanner.nextInt();
                        list.deleteAtPosition(position);
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid choice.");
                        break;
                }
            }
        }
    }

