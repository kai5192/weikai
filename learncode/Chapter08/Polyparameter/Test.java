package learncode.Chapter08.Polyparameter;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Smith",1000);
        Woker lili = new Woker("lili", 2000);
        Manager manager = new Manager("heiehi", 10000, 50000);
        Test test = new Test();
        test.showEmployeeAnnual(employee);
        test.showEmployeeAnnual(lili);
        test.showEmployeeAnnual(manager);
        test.testWork(employee);
        test.testWork(lili);
        test.testWork(manager);
        System.out.println("ll".equals("jj"));

    }
    public void showEmployeeAnnual(Employee e){
        System.out.println(e.getAnnual());//动态绑定
    }
    //添加一个方法，如果是普通员工，则调用work方法
    //如果是经理，则调用manage方法
    public void testWork(Employee e){
        if(e instanceof Woker){
            System.out.println(((Woker) e).work());
        }else if(e instanceof Manager){
            System.out.println(((Manager) e).manage());
        }else{
            System.out.println("不需要处理");
        }
    }
}
