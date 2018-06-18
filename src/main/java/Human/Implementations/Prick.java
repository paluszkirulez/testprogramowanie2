package Human.Implementations;

import Human.Abstracts.Human;

public class Prick extends Human {
    public String sayHello() {
        return "Do not disturb me!";
    }

    private Prick(PrickBuilder prick){
        this.name = prick.name;
        this.surName = prick.surName;
        this.age = prick.age;
    }

    // builder
    public static class PrickBuilder {
        private String name;
        private String surName;
        private int age;

        public PrickBuilder(String name){
            this.name = name;
        }
        public PrickBuilder(){};

        public PrickBuilder withName (String name){
            this.name = name;
            return this;
        }

        public PrickBuilder withSurName(String surName){
            this.surName = surName;
            return this;
        }

        public PrickBuilder withAge(int age){
            this.age = age;
            return this;
        }

        public Prick CreateHuman(){
            if(name.isEmpty() || surName.isEmpty()){
                return null;
            }
            else return new Prick(this);
        }
    }
}
