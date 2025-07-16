import java.util.*;
public class DeleteAtPos {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LL list=new LL();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.insert(val);
        }
        System.out.print("Enter node position which u want to delete(1 based index): ");
        int pos=sc.nextInt();
        list.deleteAtpos(pos);
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
    void deleteAtpos(int pos){
        if(head==null){
            System.out.print("Nothing is there to delete");
            return;
        }
        if(pos==1){
            head.next=head;
            return;
        }
        Node temp=head;
        int count=1;
        while(temp!=null && count<pos-1){
            temp=temp.next;
            count++;
        }
        if(temp==null || temp.next==null){
            System.out.print("out of range");
            return;
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
6
23 78 65 45 31 10
Enter node position which u want to delete(1 based index): 5
23->78->65->45->10->null
*/