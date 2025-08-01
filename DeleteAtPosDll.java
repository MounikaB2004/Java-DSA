import java.util.*;
public class DeleteAtPosDll {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LL list=new LL();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.insert(val);
        }
        System.out.print("Enter pos at which u want to delete: ");
        int pos=sc.nextInt();
        list.deleteAtPos(pos);
        list.display();
    }
}
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
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
        newn.prev=temp;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    void deleteAtPos(int pos){
        if(pos==0){
            head=head.next;
            if(head!=null) head.prev=null;
            return;
        }
        Node temp=head;
        int count=0;
        while(temp!=null && count<pos){
            temp=temp.next;
            count++;
        }
        if(temp==null) return;

        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        if(temp.prev!=null){
            temp.prev.next=temp.next;
        }
    }
}
/*
5
12 23 34 45 56
Enter pos at which u want to delete: 3
12 <-> 23 <-> 34 <-> 56 <-> null
*/