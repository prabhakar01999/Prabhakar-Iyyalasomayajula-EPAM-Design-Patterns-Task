package Factory;

public class GetAnimalCharacteriticsFactory {
    public Animal getAnimal(String animal){
        if(animal == null){
            return null;
        }
        if(animal.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        else if(animal.equalsIgnoreCase("dog")){
            return new Dog();
        }
        else if(animal.equalsIgnoreCase("elephant")) {
            return new Elephant();
        }
        return null;
    }
}