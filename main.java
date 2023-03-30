public class main {
    public static void main(String [] args) {
        
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        System.out.println();

        myLinkedList.getHead();
        System.out.println();

        myLinkedList.getTail();
        System.out.println();


        myLinkedList.getLength();
        System.out.println();


        myLinkedList.printList();
        System.out.println();


        myLinkedList.printAll();

        
        myLinkedList.makeEmpty();
        myLinkedList.printList();
        System.out.println();


        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.printList();
        System.out.println();


        myLinkedList.removeLast();
        myLinkedList.printList();
        System.out.println();

        
        myLinkedList.prepend(5);
        myLinkedList.printList();
        System.out.println();


        myLinkedList.removeFirst();
        myLinkedList.printList();
        System.out.println();


        myLinkedList.get(1);
        System.out.println();


        myLinkedList.insert(2, 5);
        myLinkedList.printList();
        System.out.println();


        myLinkedList.remove(2);
        myLinkedList.printList();
        System.out.println();


        myLinkedList.reverse();
        myLinkedList.printList();
        System.out.println();


        myLinkedList.set(1, 8);
        myLinkedList.printList();
        System.out.println();

    }
}