package BuilderPattern;

public class ChocolateBuilder {
    public ChocolateType buildCadburyChocolate(){
        ChocolateType chocolates=new ChocolateType();
        chocolates.addItem(new Cadbury());
        return chocolates;
    }
    public ChocolateType buildNestleChocolate(){
        ChocolateType chocolates=new ChocolateType();
        chocolates.addItem(new Nestle());
        return chocolates;
    }
}