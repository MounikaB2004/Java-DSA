import java.util.*;
public class SingleLinkedList {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList list=new LinkedList();
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        list.printList();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    void insert(int data){
        Node newn=new Node(data);
        if(head==null){
            head=newn;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newn;
    }
    void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
