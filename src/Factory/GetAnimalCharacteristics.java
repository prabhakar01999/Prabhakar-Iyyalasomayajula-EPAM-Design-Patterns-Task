package Factory;
import java.util.*;
import java.io.*;
public class GetAnimalCharacteristics {
    public static void main(String args[])throws IOException{
        GetAnimalCharacteriticsFactory animalFactory = new GetAnimalCharacteriticsFactory();
        Scanner sc=new Scanner(System.in);
        System.out.print("out of elephant , dog and cat choose one\nEnter the name of animal whose characteristics you want:");
        String animalName=sc.next();
        Animal p = animalFactory.getAnimal(animalName);
        System.out.println(animalName+" is a "+p.getFoodType()+" ,it is "+p.getSize()+" in size and it "+p.getSound());
    }
}