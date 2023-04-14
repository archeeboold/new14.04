public class ClassesAndObjects {

    public static void main(String[] args) {

        System.out.println("\u001B[1;30;41m START \u001B[0m \n");

        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 36;
        System.out.println("my name is "+person1.name+", and i am"+person1.age+" years old");

        Person person2 = new Person();
        person2.name = "Boris";
        person2.age = 36;
        System.out.println("my name is "+person2.name+", and i am"+person2.age+" years old");

        System.out.print("\u001B[1;30;41m END \u001B[0m");
    }
}

class Person{
        String name;
        int age;
}

