package S1_04_N3;

public class Person {
    private String name;
    private int age;

    public Person() {    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void throeExceptionMethod(){
        throw new ArrayIndexOutOfBoundsException();
    }
}
