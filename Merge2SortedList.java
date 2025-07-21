import java.util.*;
public class Merge2SortedList {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LL list1=new LL();
        LL list2=new LL();
        System.out.print("Enter no. of elements in list1: ");
        int n1=sc.nextInt();
        System.out.println("Enter sorted elements for 1st list: ");
        for(int i=0;i<n1;i++){
            int val1=sc.nextInt();
            list1.insert(val1);
        }
        System.out.print("Enter no. of elements in list2: ");
        int n2=sc.nextInt();
        System.out.println("Enter sorted elements for 2nd list: ");
        for(int i=0;i<n2;i++){
            int val2=sc.nextInt();
            list2.insert(val2);
        }

        LL merged=new LL();
        merged.head=mergeSorted(list1.head,list2.head);
        System.out.print("Final Merged list: ");
        merged.display();
    }
    static Node mergeSorted(Node h1,Node h2){
        Node dummy=new Node(-1);
        Node tail=dummy;
        while(h1!=null && h2!=null){
            if(h1.data<h2.data){
                tail.next=h1;
                h1=h1.next;
            }else{
                tail.next=h2;
                h2=h2.next;
            }
            tail=tail.next;
        }
        if(h1!=null) tail.next=h1;
        else tail.next=h2;
        return dummy.next;
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
}
/*
Enter no. of elements in list1: 3
Enter sorted elements for 1st list: 
23 56 89
Enter no. of elements in list2: 5
Enter sorted elements for 2nd list: 
12 45 78 90 96
Final Merged list: 12->23->45->56->78->89->90->96->null
*/