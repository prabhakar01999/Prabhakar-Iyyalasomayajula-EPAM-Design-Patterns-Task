package BuilderPattern;

public class BuilderDemo {

    public static void main(String args[]){
        ChocolateBuilder chocBuilder=new ChocolateBuilder();
        ChocolateType chocType1=chocBuilder.buildCadburyChocolate();
        chocType1.showItems();

        ChocolateType chocType2=chocBuilder.buildNestleChocolate();
        chocType2.showItems();
    }
}