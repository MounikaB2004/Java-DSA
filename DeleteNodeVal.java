import java.util.*;
public class DeleteNodeVal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LL list=new LL();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.insert(val);
        }
        System.out.print("Enter node value that u ant to delete: ");
        int value=sc.nextInt();
        list.deleteNodeVal(value);
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
    void deleteNodeVal(int value){
        if(head==null){
            System.out.print("Nothing is there to delete");
            return;
        }
        if(head.data==value){
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.data!=value){
            temp=temp.next;
        }
        temp.next=temp.next.next;
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
5
34 78 65 12 90
Enter node value that u ant to delete: 12
34->78->65->90->null
*/
