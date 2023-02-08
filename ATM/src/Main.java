interface ATM {
    void cashIn(int poundsIn);
    void cashOut(int poundsOut);

    default void bankConnection() {
        System.out.println("Connected");
    }
    static String theEnd(){
        return "Transaction ended";
    }


}
class ATMmpl implements ATM {
    public void cashIn(int poundsIn) {
        System.out.println("You have cashed in " + poundsIn + " pounds");
    }
    public void cashOut(int poundsOut) {
        System.out.println("You withdraw " + poundsOut + " pounds");
    }
   }
class Application {
    public static void main(String[] args) {
        ATMmpl a = new ATMmpl();

        a.bankConnection();
        a.cashIn(100);
        a.cashOut(200);

        System.out.println(ATM.theEnd());

    }
}
