import java.util.ArrayList;

public class Person {
    String name;
    String middleName;
    String lastName;
    char sex;
    int age;
    Person mother;
    Person father;
    ArrayList<Person> children;
    ArrayList<Person> siblings;
    ArrayList<Pet> pets;

    public Person(String name, String lastName, char sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, char sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void addChild(Person child) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(child);
    }

    public void addPet(Pet pet) {
        if (pets == null) {
            pets = new ArrayList<>();
        }
        pets.add(pet);
    }

    public void addParents(Person mother, Person father) {
        this.mother = mother;
        this.father = father;
    }

    public String getFullName() {
        if (middleName == null) {
            return name + " " + lastName;
        } else {
            return name + " " + middleName + " " + lastName;
        }
    }

    public void addSibling(Person sibling) {
        if (siblings == null) {
            siblings = new ArrayList<>();
        }
        siblings.add(sibling);
    }

    public ArrayList<Person> getGrandChildren() {
        ArrayList<Person> grandChildren = new ArrayList<>();
        if (children != null) {
            for (Person child : children) {
                if (child.children != null) {
                    grandChildren.addAll(child.children);
                }
            }
        }
        return grandChildren;
    }


}
