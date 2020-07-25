package Factory;

public class Elephant extends Animal {

    @Override
    String getSound() {
        return "trumpets";
    }

    @Override
    String getFoodType() {
        return "herbivore";
    }

    @Override
    String getSize() {
        return "big";
    }
}