public class ConstructorTest1 {
    String name = "Jerry";
    String sex = "man";
    int age = 24;
    String count = "count";
    static int i = 1;
    //String name;
    //String sex;
    //int age;
    public ConstructorTest1(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public ConstructorTest1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setCount(){
        int i = 1;
        while(i < 5){
            System.out.println("i:" + count + String.valueOf(i));
            i++;
        }

    }
    public String eat(String food){
        return "我在吃" + food;
    }
    public void tea(){
        System.out.println("我在喝茶");
    }
    public static void main(String[] args){
        ConstructorTest1 con = new ConstructorTest1("Tom", "female", 30);
        //ConstructorTest1 con = new ConstructorTest1();
        //con.test("Tom", "female", 30);
        //System.out.println("姓名的初始值：" + con.name);
        //System.out.println("性别的初始值：" + con.sex);
        //System.out.println("年龄的初始值：" + con.age);
        //ConstructorTest1 con2 = new ConstructorTest1("Rose", 18);
        //System.out.println("姓名的初始值：" + con2.name);
        ////System.out.println("性别的初始值：" + con2.sex);
        //System.out.println("年龄的初始值：" + con2.age);
        con.setCount();
        i = i + 1;
        System.out.println("i:" + i);

    }
}
