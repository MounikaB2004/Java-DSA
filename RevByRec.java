import java.util.*;
public class RevByRec {
    public static void main(String rags[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LL list=new LL();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.insert(val);
        }
        System.out.println("reversed list:");
        list.revRec();
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
    void revRec(){
        head=reverseRec(head);
    }
    Node reverseRec(Node curr){
        if(curr==null || curr.next==null){
            return curr;
        }
        Node rest=reverseRec(curr.next);
        curr.next.next=curr;
        curr.next=null;
        return rest;
    }
}
