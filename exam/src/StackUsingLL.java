public class StackUsingLL {
    private class Node {
        int data;
        Node link;
    }

    Node top;

    StackUsingLL() {
        this.top = null;
    }
public int peek(){
        if(top!=null){
          return top.data;
        } else System.out.println("stack is empty");
        return -1;
}

public void push(int x){
        if(top==null){
            top.data=x;
            top.link=null;
        }else {
            Node temp=new Node();
            temp.link=top;
            temp.data=x;
            top=temp;
        }

}
}

