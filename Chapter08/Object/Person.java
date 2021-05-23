package Chapter08.Object;
//判断两个Person对象的内容是否相等，如果两个对象的属性值都一样
//则返回true,反之返回false
public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public boolean equals(Object obj){
        //如果比较的两个对象是同一个对象，则直接返回true
        if(this == obj){
            return true;
        }
        //类型判断
        if(obj instanceof Person){
            Person person = (Person) obj;
            return person.age == age && person.gender == gender && person.name.equals(this.name);
        }return false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
