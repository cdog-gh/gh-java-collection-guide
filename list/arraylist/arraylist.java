import java.util.*;
class Main {
    public static void main(String[] args){
        List <Integer> li = new ArrayList<>();
        for(int i=0;i<5;i++)
            li.add(2*i);
        //so list [0, 2, 4, 6, 8]
        li.remove(new Integer(6));
        //so list [0, 2, 4, 8]
        li.remove(2);
        //so list [0, 2, 8]
        for(int x : li)
            System.out.println(x);
    }
}
