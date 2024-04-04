import family_tree.FamilyTree;
import human.Gender;
import human.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        Human alexandr = new Human("Александр", LocalDate.of(1960,5,9),Gender.Male);
        Human nadezda = new Human("Надежда", LocalDate.of(1965,1,1),Gender.Female);

        familyTree.add(alexandr);
        familyTree.add(nadezda);

        Human alice = new Human("Алиса", LocalDate.of(1985, 3, 8), Gender.Female);
        Human kamila = new Human("Камила", LocalDate.of(1990, 8, 21), Gender.Female);

        alexandr.addChildren(alice);
        alexandr.addChildren(kamila);

        System.out.println(familyTree);

    }
}
