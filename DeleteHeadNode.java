import java.util.*;
public class DeleteHeadNode{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LL list=new LL();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.insert(val);
        }
        list.deleteHead();
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
    void deleteHead(){
        if(head==null){
            System.out.print("Nothing to delete");
        }else{
            head=head.next;
        }
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
34 67 89 90 23
67->89->90->23->null
*/