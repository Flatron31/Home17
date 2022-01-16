public class ATM {
    private int totalMoneyAtm;
    private boolean isWorkAtm;
    private String nameAtm;

    public ATM(int totalMoneyAtm, boolean isWorkAtm, String nameAtm) {
        this.totalMoneyAtm = totalMoneyAtm;
        this.isWorkAtm = isWorkAtm;
        this.nameAtm = nameAtm;
    }

    public int getTotalMoneyAtm() {
        return totalMoneyAtm;
    }

    public void setTotalMoneyAtm(int totalMoneyAtm) {
        this.totalMoneyAtm = totalMoneyAtm;
    }

    public boolean isWorkAtm() {
        return isWorkAtm;
    }

    public void setWorkAtm(boolean workAtm) {
        isWorkAtm = workAtm;
    }

    public String getNameAtm() {
        return nameAtm;
    }

    public void setNameAtm(String nameAtm) {
        this.nameAtm = nameAtm;
    }

    public void getMoney (Card card, int moneyTakeOff) {
        System.out.println("ATM - " + getNameAtm() + " " + getTotalMoneyAtm());
        System.out.println(card.getNameCard() + " " + card.getTotalMoneyCard() + " номер карты = " + card.getNumberCard());
        synchronized (card){
            if (moneyTakeOff > totalMoneyAtm) {
                System.out.println("В банкомате недостаточно средств");
            } else {
                if (moneyTakeOff > card.getTotalMoneyCard()) {
                    System.out.println("На карте недостаточно средств");
                } else {
                    card.setTotalMoneyCard(card.getTotalMoneyCard() - moneyTakeOff);
                    setTotalMoneyAtm(getTotalMoneyAtm() - moneyTakeOff);
                }
            }
        }
        System.out.println("После снятия");
        System.out.println(getNameAtm() + " " + getTotalMoneyAtm());
        System.out.println(card.getNameCard() + " " + card.getTotalMoneyCard() + " номер = " + card.getNumberCard());

    }

    public synchronized void addMoney (Card card, int moneyAdd) {
        card.setTotalMoneyCard(getTotalMoneyAtm() + moneyAdd );
        setTotalMoneyAtm(totalMoneyAtm += moneyAdd);
        System.out.println("После пополнения:");
        System.out.println(getNameAtm() + " " + getTotalMoneyAtm());
        System.out.println(card.getNameCard() + " " + card.getTotalMoneyCard() + " номер = " + card.getNumberCard());

    }


}
