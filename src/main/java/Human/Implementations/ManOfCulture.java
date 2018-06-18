package Human.Implementations;

import Human.Abstracts.Human;

public class ManOfCulture extends Human {

    public String sayHello() {
        return "Nice to see you!";
    }

    private ManOfCulture(ManOfCultureBuilder manOfCulture){
        this.name = manOfCulture.name;
        this.surName = manOfCulture.surName;
        this.age = manOfCulture.age;
    }

    // builder
    public static class ManOfCultureBuilder{
        private String name;
        private String surName;
        private int age;

        public ManOfCultureBuilder(String name){
            this.name = name;
        }
        public ManOfCultureBuilder(){};

        public ManOfCultureBuilder withName (String name){
            this.name = name;
            return this;
        }

        public ManOfCultureBuilder withSurName(String surName){
            this.surName = surName;
            return this;
        }

        public ManOfCultureBuilder withAge(int age){
            this.age = age;
            return this;
        }

        public ManOfCulture CreateHuman(){
            if(name.isEmpty() || surName.isEmpty()){
                return null;
            }
            else return new ManOfCulture(this);
        }
    }
}
