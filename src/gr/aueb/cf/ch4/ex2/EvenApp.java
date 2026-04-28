package gr.aueb.cf.ch4.ex2;

public class EvenApp {
    public static void main(String[] args) {
        //Ακραία καρφωτική αλλά δεν ήθελα να μπλέξω με boolean
        for(int i=1;i<=20;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
