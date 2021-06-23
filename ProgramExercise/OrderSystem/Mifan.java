package ProgramExercise.OrderSystem;

import java.util.Map;
import java.util.Set;

public class Mifan extends Shuangpin{
    public Mifan(String name, Map type) {
        super(name, type);
    }
    @Override
    public void showDetail() {
        String strings = "米饭：";
        Set keyset = getType().keySet();
        for (Object key:keyset){
            strings += key + ""+getType().get(key)+"元"+"\t";
        }
        System.out.println(strings);
    }
}
