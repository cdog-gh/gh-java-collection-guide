import java.util.*;
class Counter{
    /*
    Integer 는 Comparable 이 정의되어 있고, Counter 는 equal query 가 주된 연산이다.
    따라서 TreeMap 보다는 HashMap 이 적합하다.
     */
    private final Map <Integer, Integer> hm = new HashMap<>();
    /*
    key 가 없는 경우 DefaultValue(2번째 인자) 값을 리턴한다.
    Key 가 없다면, 빈도 수가 0이기 때문.
     */
    public void add(int x){
        hm.put(x, hm.getOrDefault(x, 0) + 1);
    }
    public int getFreq(int x){
        return hm.getOrDefault(x, 0);
    }
    public void del(int x){
        /*
        computeIfPresent 메서드는 key 값이 있다면, 2번째 lambda 식을 평가한다.
        apply 결과가 null 이라면 key 값이 제거되게 된다.
        기존 value 값이 1 이라면 null 을 넣어주고, 그렇지 않으면 freq 를 하나 감소시킨 v-1을 넣는다.
         */
        hm.computeIfPresent(x, (k, v)->(v==1)? null: v-1);
    }
}
public class Main {
    public static void main(String []args) {
        Counter c = new Counter();
        c.add(5); c.add(3);
        System.out.println(c.getFreq(5)); //1
        System.out.println(c.getFreq(3)); //1
        System.out.println(c.getFreq(1)); //0
        
        c.del(3);
        System.out.println(c.getFreq(5)); //1
        System.out.println(c.getFreq(3)); //0
    }
}

