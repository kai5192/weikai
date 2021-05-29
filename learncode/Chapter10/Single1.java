package learncode.Chapter10;
//饿汉式单例模式
public class Single1 {
    public static void main(String[] args) {
        System.out.println(GirFriend.getInstance());
    }
}
class GirFriend{
    private String name ;
    private static GirFriend gf = new GirFriend("小杨");

    //如何保障只有一个GirFriend对象
    //1.将构造器私有化
    //2.在类内部直接创建
    //3.提供一个公共的static方法，返回gf对象
    private GirFriend(String name) {
        this.name = name;
    }
    public static GirFriend getInstance(){
        return gf;
    }

}

