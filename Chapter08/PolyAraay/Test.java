package Chapter08.PolyAraay;
//一个Person对象、2个Student对象和两个Teacher对象
//统一放数组中、并调用say方法
public class Test {
    public static void main(String[] args){
        Person[] people = new Person[5];
        people[0] = new Person("jack",15);
        people[1] = new Students("小王",16,80);
        people[2] = new Students("小李",16,90);
        people[3] = new Teacher("老赵",50,99999);
        people[4] = new Teacher("老徐",50,666666);
        for (int i = 0; i < people.length; i++)
        {
            System.out.println(people[i].say());
            if (people[i] instanceof Teacher) {
                System.out.println(((Teacher)people[i]).teach());
            }
            else if (people[i] instanceof Students) {
                System.out.println(((Students)people[i]).study());
            }else {
                System.out.println("---------");
            }
        }
    }
}
