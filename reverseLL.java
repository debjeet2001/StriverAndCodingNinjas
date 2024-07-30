import java.util.*;
public class reverseLL{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
    
        Stack<Integer> stack = new Stack<>();
        //pushinh the elements from linkedList to the stack.
        for(int elem : ll){
            stack.push(elem);
        }

        //inserting the elements from stack to the linkedList for reversing purpose.
        while(!stack.isEmpty()){
            ll.add(stack.pop());
        }
        //printing the linkedList.
       for(int i = 0; i < ll.size(); i++){
        System.out.println(ll.get(i));
       }

    }
}