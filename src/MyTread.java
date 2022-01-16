public class MyTread implements Runnable{
private Card card;
private ATM atm;

    public MyTread(Card card, ATM atm) {
        this.card = card;
        this.atm = atm;
    }

    @Override
    public void run() {
        if (!atm.isWorkAtm()) {
            System.out.println("АТМ не работает");
        } else  {
//            for (int i = 0; i < 3; i++) {
//
//                atm.getMoney(card, 600);
//                ///atm.addMoney(card, 200);
//            }
            atm.getMoney(card, 600);
        }
    }

}
