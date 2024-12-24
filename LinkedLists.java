public class LinkedLists {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addInMiddle(int index,int data){
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
    public void removeFirst(){
        if(size==0){
            System.out.print("ll is empty");
        }else if(size==1){
            head=tail=null;
            size=0;
        }
        head=head.next;
        size--;
    }
    public void removeLast(){
        if(size==0){
            System.out.println("ll is empty");
        }else if(size==1){
            head=tail=null;
            size=0;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        size--;

    }
    public void reverseLL(){
        Node prev=null;
        Node curr=head;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }
    public void removeNthFromEnd(int n){
        int k=0;
        if(n==size){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=1;i<size-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return;

    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        //1 find middle node
        Node mid=findMid(head);
        //2 reverse 2 half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        // 3 check left and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args) {
        LinkedLists ll=new LinkedLists();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addInMiddle(2,8);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();

        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.removeNthFromEnd(5);
        ll.print();
        ll.removeLast();
        ll.removeLast();
        ll.removeLast();
        ll.print();
        ll.addLast(3);
        ll.addLast(2);
        ll.print();
        System.out.println(ll.isPalindrome());
    }
}
