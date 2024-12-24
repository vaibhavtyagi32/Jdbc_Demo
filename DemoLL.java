public class DemoLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void print(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void addInMiddle(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void removeFirst(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        head=head.next;
        size--;
    }
    public static void removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return;
        }else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }
    public static void reverse(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        DemoLL ll=new DemoLL();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addInMiddle(2,10);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        ll.reverse();
        ll.print();
    }

}
