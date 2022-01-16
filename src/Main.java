public class Main {
    public static void main(String[] args) {
        ATM belcard = new ATM(5000,true,"Belcard");
        ATM maestro = new ATM(7000,true,"Maestro");

        Card card = new Card("Belcard", 1233, 4000);
        Card card1 = new Card("Belcard", 1234, 6000);
        Card card2 = new Card("Maestro", 1124, 2000);

        MyTread myTread = new MyTread(card1, belcard);
        MyTread myTread1 = new MyTread(card1, belcard);
        MyTread myTread2 = new MyTread(card1, maestro);

        Thread thread = new Thread(myTread);
        Thread thread1 = new Thread(myTread1);
        Thread thread2 = new Thread(myTread2);

        thread.start();
        thread1.start();
        thread2.start();


    }
}
