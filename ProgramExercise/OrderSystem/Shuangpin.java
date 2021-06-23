package ProgramExercise.OrderSystem;

import java.util.Map;
import java.util.Set;

public class Shuangpin extends Foods{
    private Map type;

    public Shuangpin(String name, Map type) {
        super(name);
        this.type = type;
    }

    public Map getType() {
        return type;
    }

    public void setType(Map type) {
        this.type = type;
    }

    @Override
    public void showDetail() {
        Set keyset = getType().keySet();
        for (Object key:keyset){
            System.out.println(getName()+": "+key + "\t\t\t"+getType().get(key)+"元");
        }

    }
}
