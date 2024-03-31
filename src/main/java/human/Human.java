package family_tree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Human {
    String name;
    LocalDate dob, dod;
    Gender gender;
    Human father, mother;
    List<Human> children;

    public Human(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        children = new ArrayList<>();
    }

}

