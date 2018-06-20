package Human.Implementations;
import Human.Abstracts.Human;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CulturalCensus {
    private List<Human> censusList;
    private static CulturalCensus culturalCensus;

    public void addHumanToCultural(String People){
        //culturalCensus = culturalCensus();
        String name ="";
        String surName="";
        int age=0;

        String[] tempListOfMembers = People.split(";");
        for(String PersonData: tempListOfMembers){
            String[] tempListofPersonData = PersonData.split(",");
            age = 0;
            name = tempListofPersonData[1];
            surName = tempListofPersonData[2];
            if(tempListofPersonData.length>3){
                age = Integer.parseInt(tempListofPersonData[3]);
            }
            if(tempListofPersonData[0].equals("N")){
                censusList.add(new ManOfCulture.ManOfCultureBuilder().withName(name).withSurName(surName).withAge(age).CreateHuman());
            }
            else if(tempListofPersonData[0].equals("P")){
                censusList.add(new Prick.PrickBuilder().withName(name).withSurName(surName).withAge(age).CreateHuman());
            }

        }



    }
    public int numberOfPeopleWithName(String name){
        return (int) this.getCensusList().stream().filter(x->x.getName().equals(name)).count();

    }
    public int numberOfPeopleWithsurName(String name){
        return (int) this.getCensusList().stream().filter(x->x.getSurName().equals(name)).count();

    }
    public int numberOfPeopleWithAge(int age){
        return (int) this.getCensusList().stream().filter(x->x.getAge()==age).count();

    }

    public List<Human> listOfPeaopleBelowGienAge(int age){
        return this.getCensusList().stream().filter(x->x.getAge()<age).collect(Collectors.toList());
    }

    private CulturalCensus(){
        censusList = new ArrayList<>();
    };
    public static CulturalCensus culturalCensus(){
        if(culturalCensus==null){
            culturalCensus = new CulturalCensus();

        }
        return culturalCensus;
    }

    public List<Human> getCensusList() {
        return censusList;
    }
}
