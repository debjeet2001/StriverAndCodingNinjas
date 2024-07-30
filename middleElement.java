//the approach is pretty simple, first i am counting total nodes present in the LinkedList.
//Secondly, i am findig the middle element and traversing the linkedlist agin to return the middle data.
//video link --> https://www.youtube.com/watch?v=7LjQ57RqgEc
public class middleElement{
    public static int findMiddleElement(node<Integer> head){
        //first we will count the total number of nodes.
        int count = 0;
        node<Integer> temp = head;
        if(head==null)return -1;
        while(temp != null){
            count++;
            temp = temp.next; 
        }
        temp = head;
        //Now calculating the middle index.
        // if count == even
        
            int mid = count/2;
            int i = 0;
            while(i != mid ){
                temp = temp.next;
                i++;
            } 
        return temp.data;
    }
    public static void main(String[] args){
        //declaring and initailizing the data values of nodes of linkedlist.
        node<Integer> n1 = new node<>(1);
        node<Integer> n2 = new node<>(2);
        node<Integer> n3 = new node<>(3);
        node<Integer> n4 = new node<>(4);
        node<Integer> n5 = new node<>(5);
        
        //Connecting the nodes.
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(findMiddleElement(n1));
    }
}