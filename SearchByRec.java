import java.util.*;
public class SearchByRec {
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
        boolean found=list.searchRec(list.head,key);
        System.out.print(found? "Found" : "Not Found");
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
    boolean searchRec(Node temp,int key){
        if(head==null) return false;
        if(temp.data==key) return true;
        return searchRec(temp.next,key);
    }
}
/*6
45 78 90 65 43 22
Enter key that u want to search: 78
Found
*/