import java.util.*;
public class LevelOrder {
    public static void main(String args[]){
        BT t=new BT();
        t.root=t.create();
        t.levelOrder(t.root);
    }
}
class Node{
    int data;
    Node left,right;
    Node(int d){
        this.data=d;
        left=null;
        right=null;
    }
}
class BT{
    Node root=null;
    Node create(){
        Scanner sc=new Scanner(System.in);
        int rt=sc.nextInt();
        if(rt==-1){
            return null;
        }
        Node newn=new Node(rt);
        root=newn;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            int rl=sc.nextInt();
            if(rl!=-1){
                Node lnode=new Node(rl);
                curr.left=lnode;
                q.add(curr.left);
            }
            int rr=sc.nextInt();
            if(rr!=-1){
                Node rnode=new Node(rr);
                curr.right=rnode;
                q.add(curr.right);
            }
        }
        return root;
    }
    void levelOrder(Node root){
        if(root==null) return;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
}
/*
8 7 6 -1 5 4 -1 -1 -1 -1 -1
8 7 6 5 4 
*/