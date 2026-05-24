package gr.aueb.cf.ch11.ex1;

public class Main {
    public static void main(String[] args) {
        User george = new User(1,"Georgios", "Peppas");

        george.setId(1);
        george.setFirstname("Georgios");
        george.setLastname("Peppas");

        System.out.println("George Id: " + george.getId());
        System.out.println("George Firstname: " + george.getFirstname());
        System.out.println("George Lastname: " + george.getLastname());



    }


}
