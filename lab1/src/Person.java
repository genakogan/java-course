public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }
    public Person(Person Other) {
       this.age= Other.age;

    }


    public void setName(String name) {

        this.name = name;
    }
    public String getName() {


        return this.name ;
    }

    public int getAge() {

        return this.age ;
    }

    public void setAge(int age) {

        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be non-negative");
        }
    }
}