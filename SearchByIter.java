import java.util.*;
public class SearchByIter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LL list=new LL();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.insert(val);
        }
        System.out.print("Enter key that u want to search: ");
        int key=sc.nextInt();
        boolean found=list.searchIter(key);
        System.out.print(found? "Found" : "Not Found");
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        Node next=null;
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
    boolean searchIter(int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}
/*6
34 28 90 76 54 12
Enter key that u want to search: 54
Found
*/