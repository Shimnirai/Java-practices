class Person1{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

public class This1 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.setName("Shimni");
        p.setAge(22);

        System.out.println("Name: " + p.getName());
        System.out.println("Age : " + p.getAge());
    }
}
