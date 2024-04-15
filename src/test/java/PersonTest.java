import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void setMother() {

        Person person = new Person("John", "Doe", 'M', 30);
        Person mother = new Person("Jane", "Doe", 'F', 30);

        person.setMother(mother);

        assertEquals(mother, person.mother);
    }

    @Test
    void setFather() {
        Person person = new Person("John", "Doe", 'M', 30);
        Person father = new Person("Jacob", "Dwayne", 'M', 60);

        person.setFather(father);

        assertEquals(father, person.father);
    }

    @Test
    void addChild() {
        Person person = new Person("John", "Doe", 'M', 30);
        Person child = new Person("Jane", "Doe", 'F', 5);

        person.addChild(child);

        assertEquals(1, person.children.size());
        assertEquals(child, person.children.get(0));
    }

    @Test
    void addPet() {
        Person person = new Person("John", "Doe", 'M', 30);
        Pet pet = new Pet("Fluffy", 5, "Cat");

        person.addPet(pet);

        assertEquals(1, person.pets.size());
        assertEquals(pet, person.pets.get(0));
    }

    @Test
    void addParents() {
        Person person = new Person("John", "Doe", 'M', 30);
        Person mother = new Person("Jane", "Doe", 'F', 30);
        Person father = new Person("Jacob", "Dwayne", 'M', 60);

        person.addParents(mother, father);

        assertEquals(mother, person.mother);
        assertEquals(father, person.father);
    }

    @Test
    void getFullName() {
        Person person = new Person("John", "Doe", 'M', 30);

        assertEquals("John Doe", person.getFullName());

        Person person2 = new Person("John", "Dwayne", "Doe", 'M', 30);

        assertEquals("John Dwayne Doe", person2.getFullName());
    }

    @Test
    void addSibling() {
        Person person = new Person("John", "Doe", 'M', 30);
        Person sibling = new Person("Jane", "Doe", 'F', 30);

        person.addSibling(sibling);

        assertEquals(1, person.siblings.size());
        assertEquals(sibling, person.siblings.get(0));
    }

    @Test
    void getGrandChildren() {
        Person person = new Person("John", "Doe", 'M', 30);
        Person child = new Person("Jane", "Doe", 'F', 18);
        Person grandChild = new Person("Jenny", "Doe", 'F', 2);

        child.addChild(grandChild);
        person.addChild(child);

        assertEquals(1, person.getGrandChildren().size());
        assertEquals(grandChild, person.getGrandChildren().get(0));
    }
}