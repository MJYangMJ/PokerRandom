import java.util.*;

public class Main {
    
    public Map<Integer,String> initialMap(){
        Map<Integer,String> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=13;i++){
            list.add(i);
        }
        Collections.shuffle(list);
        for(int i=0;i<13;i++){
            if(i<5){
                map.put(list.get(i),"A");
            }
            else if(i>=5&&i<9){
                map.put(list.get(i),"B");
            }
            else if(i>=9) {
                map.put(list.get(i),"C");
            }
        }
        return map;
    }


    public static void main(String[] args) {
        Main m = new Main();
        Map<Integer,String> map = m.initialMap();
        for(int i=0;i<13;i++){
            System.out.println(map.get(i+1)+(i+1));
        }
    }
}
