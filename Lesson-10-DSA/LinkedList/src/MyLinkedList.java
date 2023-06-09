public class MyLinkedList<E> {
    private Node head, tail;
    private int numNodes = 0;
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public MyLinkedList(E e) {
        head = new Node(e);
    }
    public void add(int index, E e) {

            Node temp = head;
            Node holder;
            for (int i = 0; i < index; i++) {
                if (temp.next != null) {
                   temp = temp.next;
                }
            }
            holder = temp.next;
            temp.next = new Node(e);
            temp.next.next = holder;
            numNodes += 1;

    }
    public void addFirst(E e) {
        Node temp = new Node(e);
        temp.next = head;
        head = temp;
        numNodes += 1;
    }
    public void addLast(E e) {
        Node temp = new Node(e);
        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = tail.next;
        }
        numNodes += 1;
    }
    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            return null;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Object result = temp.next.getData();
            temp.next = temp.next.next;
            numNodes -= 1;
            return (E) result;
        }
    }
    public boolean remove(E e) {
        Node temp = head;
        boolean result = false;
        for (int i = 0; i < numNodes; i++) {
            if (temp.next.data == e) {
                result = true;
                break;
            }
            temp = temp.next;
        }
        if (result) {
            temp.next = temp.next.next;
            numNodes -= 1;
        }
        return result;
    }
    public int size() {
        return this.numNodes;
    }
    public MyLinkedList clone() {
        MyLinkedList result = new MyLinkedList(head.data);
        result.numNodes = this.numNodes;
        return (MyLinkedList) result;
    }
    public boolean container(E e) {
        Node temp = head;
        boolean result = false;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == e) {
                result = true;
                break;
            }
            temp = temp.next;
        }
        return result;
    }
    public int indexOf(E e) {
        Node temp = head;
        int result = -1;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == e) {
                result = i;
                break;
            }
            temp = temp.next;
        }
        return result;
    }
    public boolean add(E e){
        Node temp = head;
        boolean result=true;
        for (int i = 0; i < numNodes; i++) {
            if (temp.next != null) {
                temp = temp.next;
            }
        }
        temp.next = new Node(e);
        numNodes += 1;
        return result;
    }
    public E get(int index){
        Node temp=head;
        for (int i=0;i<index;i++){
            temp=temp.next;
        }
        return (E)temp.data;
    }
    public E getFirst(){
        return (E)head.data;
    }
    public E getLast(){
        Node temp=head;
        for (int i=0;i<numNodes;i++){
            if(temp.next!=null){
                temp=temp.next;
            }
        }
        return (E)temp.data;
    }
    public void clear(){
        Node temp=head;
        temp.next=null;
    }
    public void ensureCapacity(int minCapacity){

    }
}
