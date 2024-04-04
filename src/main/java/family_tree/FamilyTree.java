package family_tree;

import human.Human;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    List<Human> humanList;

    public FamilyTree() {
        humanList = new ArrayList<>();
    }
    public void add(Human human){
        humanList.add(human);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Human human: humanList) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
