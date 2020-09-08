package linked.list;

/**
 * Created by Owner on 2020-09-07
 * Package linked.list from project LinkedList
 */

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        /**
         * Node class
         * @param data data within node
         */
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Print input list
     * @param list linked list object
     */
    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.println("LinkedList:");

        while (currNode != null) {
            if (currNode.next == null) {
                System.out.print(currNode.data);
            } else {
                System.out.print(currNode.data + ", ");
            }
            currNode = currNode.next;
        }
        System.out.println();
    }

    /**
     * Insert data into list. If list is empty, initialize empty list with head node
     * @param list linked list object
     * @param data data to be added to list
     * @return new linked list with inserted node
     */
    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    /**
     * Deletion of data by key
     * @param list linked list object
     * @param key data to be deleted
     * @return updated list with deleted key
     */
    public static LinkedList deleteByKey(LinkedList list, int key) {
        Node currNode = list.head, prevNode = null;

        // case 1 - key is at head
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println("Deletion: " + key + " found and deleted");
            return list;
        }

        // case 2 - key is in middle or end
        while (currNode != null && currNode.data != key) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        if (currNode != null) {
            prevNode.next = currNode.next;
            System.out.println("Deletion: " + key + " found and deleted");
        }

        // case 3 - key is not in list
        if (currNode == null) {
            System.out.println("Deletion: " + key + " not found in list");
        }
        return list;
    }

    /**
     * Deletion of data by position
     * @param list linked list object
     * @param index position of data to be deleted
     * @return updated list with deleted data
     */
    public static LinkedList deleteByIndex(LinkedList list, int index) {
        Node currNode = list.head, prevNode = null;

        // case 1 - index is 0
        if (index == 0 && currNode != null) {
            list.head = currNode.next;
            System.out.println("Deletion: element at index " + index + " deleted");
            return list;
        }

        // case 2 - index > 0, index < size of list
        int counter = 0;
        while (currNode != null) {
            if (counter == index) {
                prevNode.next = currNode.next;
                System.out.println("Deletion: element at index " + index + " deleted");
                break;
            } else {
                prevNode = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        // case 3 - index > size of list
        if (currNode == null) {
            System.out.println("Deletion: index out of bounds");
        }
        return list;
    }

    /**
     * Find length of linked list
     * @param list linked list object
     * @return integer length
     */
    public static int lengthOfList(LinkedList list) {
        int counter = 0;
        Node currNode = list.head;

        while (currNode != null) {
            counter++;
            currNode = currNode.next;
        }
        System.out.println("Length of list: " + counter);
        return counter;
    }

    public static LinkedList deleteEndNode(LinkedList list) {
        Node currNode = list.head, prevNode = null;

        while (currNode != null) {
            if (currNode.next != null) {
                prevNode = currNode;
                currNode = currNode.next;
            } else {
                prevNode.next = null;
                break;
            }
        }
        return list;
    }
}
