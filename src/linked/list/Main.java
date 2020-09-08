package linked.list;

/**
 * Created by Owner on 2020-09-07
 * Package linked.list from project LinkedList
 */
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 1; i < 10; i++) {
            list = LinkedList.insert(list, i);
        }

        LinkedList.printList(list);
        LinkedList.deleteByKey(list, 4);
        LinkedList.printList(list);
        LinkedList.deleteByIndex(list, 5);
        LinkedList.printList(list);
        LinkedList.lengthOfList(list);
        LinkedList.deleteEndNode(list);
        LinkedList.printList(list);
        LinkedList.deleteHeadNode(list);
        LinkedList.printList(list);

    }
}
