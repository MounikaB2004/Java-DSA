import java.util.*;
public class LengthByIter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LL list=new LL();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.insert(val);
        }
        list.display();
        System.out.println();
        System.out.print(list.getLengthIter());
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
    int getLengthIter(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}
/*
6
34 89 76 54 12 10
34->89->76->54->12->10->null
6
*/