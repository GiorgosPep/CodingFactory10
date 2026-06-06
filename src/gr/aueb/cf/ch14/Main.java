package gr.aueb.cf.ch14;

public class Main {

    public static void main(String[] args) {


        Animal azor = new Dog();
        Animal wiki = new Cat();
        Animal crocodilo = new Animal();

        doSpeak(azor);
        doSpeak(wiki);
        doSpeak(crocodilo);
    }


    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
