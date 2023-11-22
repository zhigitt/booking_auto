public class Bank {
    public double bank = 10000000;

    public double getBank() {
        return bank;
    }

    public void credit(User currentUser, double money){
        if (money <= bank) {
            bank -= money;
            currentUser.setChek(currentUser.getChek() + money);
            System.out.println("Вы успешно получили кредит: $" + currentUser.getChek());
        } else if (money < 0) {
            System.out.println("Не правильная сумма!");
        } else {
            System.out.println("В банке нету такой суммы!");
        }
    }
}
