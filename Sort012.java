import java.util.*;
public class Sort012 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LL list=new LL();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.insert(val);
        }
        list.head=list.sort012(list.head);
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
    Node sort012(Node head){
        Node zeroD=new Node(-1);
        Node oneD=new Node(-1);
        Node twoD=new Node(-1);

        Node zero=zeroD;
        Node one=oneD;
        Node two=twoD;

        Node curr=head;

        while(curr!=null){
            if(curr.data==0){
                zero.next=curr;
                zero=zero.next;
            }else if(curr.data==1){
                one.next=curr;
                one=one.next;
            }else{
                two.next=curr;
                two=two.next;
            }
            curr=curr.next;
        }
        zero.next=oneD.next!=null?oneD.next:twoD.next;
        one.next=twoD.next;
        two.next=null;
        return zeroD.next;
    }
}
/*
7
2 1 2 0 0 1 0 
0->0->0->1->1->2->2->null
*/