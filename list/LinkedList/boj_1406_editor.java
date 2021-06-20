import java.util.*;
import java.io.*;
class Editor{
    /*
    LinkedList 는 삭제하려는 위치와 삽입하려는 위치를 알면
    빠르게 연산을 수행할 수 있다.
     */
    private final LinkedList<Character> str;
    /*
    현재 List 의 어떤 원소를 가리키고 있는지 판단하기 위함.
     */
    private final ListIterator<Character> itr;
    Editor(String ret){
        str = new LinkedList<>();
        for(int i=0;i<ret.length();i++)
            str.addLast(ret.charAt(i));
        //iter 는 처음에 맨 끝을 가리킨다.
        itr = str.listIterator(str.size());
    }

    public void moveCursorLeft(){
        if(itr.hasPrevious())
            itr.previous();
    }
    public void moveCursorRight(){
        if(itr.hasNext())
            itr.next();
    }
    public void removeCh(){
        if(!itr.hasPrevious())
            return;
        itr.previous();
        itr.remove();
    }
    public void addCh(Character ch){
        itr.add(ch);
    }
    public void print(){
        StringBuilder sb = new StringBuilder();
        for(Character ch:str)
            sb.append(ch);
        System.out.println(sb.toString());
    }
}
public class Main {
    public static void main(String []args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            Editor editor = new Editor(bf.readLine());
            int Q = Integer.parseInt(bf.readLine());
            for(int i=0;i<Q;i++){
                String query = bf.readLine();
                switch(query) {
                    case "L": editor.moveCursorLeft(); break;
                    case "D": editor.moveCursorRight(); break;
                    case "B": editor.removeCh(); break;
                    default:
                        editor.addCh(query.charAt(2));
                }
            }
            editor.print();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
