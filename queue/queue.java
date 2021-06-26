import java.util.*;
public class Main {
    public static void main(String []args) {
        /*
        Queue is Interface.
        If use queue, use LinkedList or ArrayDeque
        
                Queue
                  |
                Deque
                  |
        LinkedList, ArrayDeque
         */
        Queue<Integer> st = new ArrayDeque<>();
        for(int i=0;i<100;i++)
            st.add(i);

        while(!st.isEmpty()){
            /*
            peek : retrieve
            poll : retrieve and remove
             */
            Integer x = st.poll();
            System.out.println(x);
        }
    }
}

