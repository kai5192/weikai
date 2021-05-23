package Chapter08.Homework01;
//定义一个Person类，初始化Person对象组，有三个Person对象
//并按照age从大到小进行排序
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("lili",51,"老司机");
        Person person2 = new Person("gaga",41,"中司机");
        Person person3= new Person("niuniu",61,"大司机");
        Person[] people = {person1,person2,person3};
        people = (new Arraysort()).arrayMaopao(people);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName()+"\t"+people[i].getAge());
        }
    }
}
class Arraysort{
    //定义一个方法进行排序
    //思路：每次符合要求就进行一次排序，排序后返回0的位置
    //当进行到最后一位时停止
    int count = 0;//记录排序的位数
    public Person[] arrayMaopao(Person[] people){
        int i = 0;
        for (; i < people.length; ) {
            if(i == people.length - 1){
                break;
            }
            if(people[i].getAge()>people[i+1].getAge()){
                //创建一个中间对象进行替换
//                Person people1 = new Person(people[i].getName(),people[i].getAge(),people[i].getJob());
//                people[i] = people[i+1];
//                people[i+1] = people1;
                this.replace(people,i);
                i = 0;
            }
            i++;//没有符合条件的加1
        }
        return people;
    }
    //将替换部分封装
    public void replace(Person[]people,int i){
        Person people1 = new Person(people[i].getName(),people[i].getAge(),people[i].getJob());
        people[i] = people[i+1];
        people[i+1] = people1;
    }
}