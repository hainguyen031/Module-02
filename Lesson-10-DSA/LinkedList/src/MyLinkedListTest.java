public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList<>(1);
        list.add(1,"2");
        list.add(1,"3");
        list.addLast("4");
        list.addLast("4");
        //list.clear();
        System.out.println(list.getLast());
        for (int i = 0; i < list.size()-1;i++) {
            System.out.println(list);
        }
        //MyLinkedList a=list.clone();
        //System.out.println(a);
    }
}
