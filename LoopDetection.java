import java.util.*;
public class LoopDetection {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LL list=new LL();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.insert(val);
        }
        int pos=sc.nextInt();
        if(pos!=-1){
            list.createCycle(pos);
        }
        if(list.hasCycle())
            System.out.println("yes, it has cycle");
        else
            System.out.println("No cycle");
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
    void createCycle(int pos){
        Node tail=head;
        Node cycleNode=null;
        int index=0;
        while(tail.next!=null){
            if(index==pos)
                cycleNode=tail;
            tail=tail.next;
            index++;
        }
        tail.next=cycleNode;
    }
    boolean hasCycle(){
        if(head==null || head.next==null) return false;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}
/*
Input1:
5
2 7 9 5 3
2
yes, it has cycle

Input2:
5
6 8 9 4 3
-1
No cycle
*/