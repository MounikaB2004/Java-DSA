import java.util.*;
public class InsertAtPosInDLL {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LL list=new LL();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.insert(val);
        }
        System.out.println("Enter position(0 based): ");
        int pos=sc.nextInt();
        System.out.println("Enter data: ");
        int data=sc.nextInt();
        list.insertAtPos(pos,data);
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
    void insertAtPos(int pos,int data){
        Node newn=new Node(data);
        if(pos==0){
            newn.next=head;
            if(head!=null) head.prev=newn;
            head=newn;
            return;
        }
        Node temp=head;
        int count=0;
        while(temp!=null && count<pos-1){
            temp=temp.next;
            count++;
        }
        if(temp==null) return;
        newn.next=temp.next;
        newn.prev=temp;
        if(temp.next!=null) temp.next.prev=newn;
        temp.next=newn;
    }
}
/*
6
89 87 76 65 54 34
Enter position(0 based): 
2
Enter data: 
100
89 <-> 87 <-> 100 <-> 76 <-> 65 <-> 54 <-> 34 <-> null
*/
