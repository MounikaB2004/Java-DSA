import java.util.*;
public class InsertAtMid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LL list=new LL();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.insert(val);
        }
        System.out.print("Enter data u want to add in middle: ");
        int data=sc.nextInt();
        list.insertAtMid(data,n/2);
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
    void insertAtMid(int data,int position){
        Node newn=new Node(data);
        int count=0;
        Node temp=head;
        while(temp!=null && count<position-1){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            System.out.print("out of range");
            return;
        }
        newn.next=temp.next;
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
}
/*
6
23 78 11 89 90 67
Enter data u want to add in middle: 5
23->78->11->5->89->90->67->null
*/
