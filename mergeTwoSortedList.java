//i created an array of size list1+list2. inserted elements into array from list1 and list2.
//then sorted the array.
//then joined list1 and list2.
//then copied the elements from the array to the combined/joined list !
//video --> https://www.youtube.com/watch?v=Xb4slcp1U38&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=30
import java.util.Arrays;

public class mergeTwoSortedList {

    public node<Integer> mergeTwoLists(node<Integer> list1, node<Integer> list2) {
        //counting the nodes in list1 and list2
        if(list1 == null)return list2;
        if(list2 == null)return list1;
        int countlist1=0;
        int countlist2=0;
        node<Integer> temp1 = list1;
        node<Integer> temp2 = list2;
        if(list1 == null)return list2;
        if(list2 == null)return list1;
        while(temp1 != null){
            countlist1++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            countlist2++;
            temp2 = temp2.next;
        }
        temp1 = list1;
        temp2 = list2;
        //now a new array of size countlist1 + countlist2
        int[] arr = new int[countlist1+countlist2];
        //inserting elements in the array.
        if(countlist1 <= countlist2){
            for(int i=0; i<countlist1; i++){
                arr[i] = temp1.data;
                temp1 = temp1.next;
            }
            for(int i = countlist1; i<countlist1+countlist2; i++){
                arr[i] = temp2.data;
                temp2 = temp2.next;
            }
        }else{
            for(int i=0; i<countlist2; i++){
                arr[i] = temp2.data;
                temp2 = temp2.next;
            }
            for(int i = countlist2; i<countlist1+countlist2; i++){
                arr[i] = temp1.data;
                temp1 = temp1.next;
            }

        }

        Arrays.sort(arr);

        //now creating the linkedList
        temp1 = list1;
        while(temp1.next != null){
            temp1 = temp1.next;
        }
        temp1.next = list2;
        //
        //now traversing the whole list to do the changes.
        temp1 = list1;
        for(int i=0; i<countlist1+countlist2; i++){
            temp1.data = arr[i];
            temp1 = temp1.next;
        }

        return list1;
    }
    public static void main(String[] args){
        
        //driver code

    }
}
