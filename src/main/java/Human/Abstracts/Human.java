package Human.Abstracts;

public abstract class Human {
    protected String name;
    protected String surName;
    protected int age;

    public abstract String sayHello();

    public String introduceYourself(){
        String tempString = "My name is "+name+" "+"surName" + (age!=0 ? ". My age is " + age : "") + ".";
        return tempString;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
