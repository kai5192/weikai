package ProgramExercise.OrderSystem;

import java.util.Map;
import java.util.Set;

//属性：名字
//方法1获取详细信息与返回价格
public class Foods {
    private String name;

    public Foods() {
    }

    public Foods(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showDetail(){
    }

}
class ShuiJiao extends Foods{
    private Map type;

    public ShuiJiao(String name, Map type) {
        super(name);
        this.type = type;
    }

    public Map getType() {
        return type;
    }

    @Override
    public void showDetail() {
        String strings = "水饺：";
        Set keyset = type.keySet();
        for (Object key:keyset){
            strings += key + "\t"+type.get(key)+"元/斤\n\t\t";
        }
        System.out.println(strings);
    }

}
class ChaoMian extends Foods{
    private Map type;

    public ChaoMian(String name, Map type) {
        super(name);
        this.type = type;
    }

    @Override
    public void showDetail() {
        Set keyset = type.keySet();
        for (Object key:keyset){
            System.out.println(key + "\t\t\t"+type.get(key)+"元/盘");
        }
    }

    public Map getType() {
        return type;
    }
}

class MianTiao extends Foods{
    private Map type;

    @Override
    public void showDetail() {
        String strings = "面条：";
        Set keyset = type.keySet();
        for (Object key:keyset){
            strings += key + ""+type.get(key)+"元"+"\t";
        }
        System.out.println(strings);
    }

    public Map getMap() {
        return type;
    }

    public MianTiao(String name, Map map) {
        super(name);
        this.type = map;
    }
}