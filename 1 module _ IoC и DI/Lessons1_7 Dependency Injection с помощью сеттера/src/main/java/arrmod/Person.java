package arrmod;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Person bean is created");
    }

    /*public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }*/

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely Pet");
        pet.say();
    }
}
