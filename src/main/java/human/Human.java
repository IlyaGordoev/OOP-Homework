package human;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Human {
    String name;
    LocalDate dateOfBirthday, dateOfDeath;
    Gender gender;
    Human father, mother;
    List<Human> childrenList;

    public Human(String name, LocalDate dateOfBirthday, LocalDate dateOfDeath, Gender gender, Human father, Human mother, List<Human> children) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        this.dateOfDeath = dateOfDeath;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        childrenList = new ArrayList<>();
    }

    public Human(String name, LocalDate dateOfBirthday, LocalDate dateOfDeath, Gender gender) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        this.dateOfDeath = dateOfDeath;
        this.gender = gender;
//        childrenList = new ArrayList<>();
    }
    public Human(String name, LocalDate dateOfBirthday, Gender gender) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        this.gender = gender;
//        childrenList = new ArrayList<>();
    }

    public void addChildren(Human human){
        childrenList.add(human);
    }

    public int getAge() {
        Period period = Period.between(this.dateOfBirthday, LocalDate.now());
        return period.getYears();
    }
    public String getChildren(){
        StringBuilder stringBuilder = new StringBuilder();
        if (childrenList != null){
            for (Human human: childrenList){
                stringBuilder.append(human.name);
                stringBuilder.append(" ");
            }
            return stringBuilder.toString();
        } else
            return "отсутствуют";
    };

    @Override
    public String toString() {

        return "Имя: " + name +
                ", Возраст: " + getAge() +
                ", пол: " + gender +
                ", отец: " + father +
                ", мать: " + mother +
                ", дети: " + getChildren();
    }
}

