package ProgramExercise.OrderSystem;

import java.util.Map;
import java.util.Set;
//2.定义猪肉/炒面/炒饭/旦旦面
public class DanPin extends Foods{
    private Map type;

    public DanPin(Map type) {
        this.type = type;
    }
    @Override
    public void showDetail() {
        Set keyset = getType().keySet();
        for (Object key:keyset){
            System.out.println( key +"\t\t\t"+getType().get(key)+"元");
        }
    }

    public Map getType() {
        return type;
    }

    public void setType(Map type) {
        this.type = type;
    }
}
