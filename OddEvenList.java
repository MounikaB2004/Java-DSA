import java.util.*;
public class OddEvenList {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LL list=new LL();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.insert(val);
        }
        list.head=list.oddevenlist(list.head);
        list.display();
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
class LL{
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
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    Node oddevenlist(Node head){
        if(head==null || head.next==null) return head;
        Node odd=head;
        Node even=head.next;
        Node evenHead=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
/*
5
2 4 5 6 8
2->5->8->4->6->null
*/