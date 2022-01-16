public class Card {
    private String nameCard;
    private int numberCard;
    private int totalMoneyCard;

    public Card(String nameCard, int numberCard, int totalMoneyCard) {
        this.nameCard = nameCard;
        this.numberCard = numberCard;
        this.totalMoneyCard = totalMoneyCard;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public int getTotalMoneyCard() {
        return totalMoneyCard;
    }

    public void setTotalMoneyCard(int totalMoneyCard) {
        this.totalMoneyCard = totalMoneyCard;
    }



}
