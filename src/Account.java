//Detta är det som behövs för att man ska ha ett konto på banken då allt som har med det att göra finns här.
public class Account {
    private final String firstName; //Detta är för att kontot ska ha ett förnamn att stå på.
    private final String lastName; //Detta är för att kontot ska ha ett efternamn att stå på.
    private double balance; //Detta är så att man kan koppla en mängd pengar till kontot. Gjorde det till en double så att man kan ha mer pengar i kontot än om det hade varit en int.
    private static int uid = 0;
    private final String phoneNumber; // Detta är samma sak som namnen bara att telefon nummret behövs senare för att loga in.
    private final int id;


    public Account(String firstName, String lastName, String phoneNumber){ //Detta drar in allting man har skrivit i själva "kontot" Vilket behövs när man trycker på info.
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.balance = 0.0;
        uid++;
        this.id = uid;
    }
    //
    public String getFirstName(){
        return this.firstName + "";
    }
    public String getLastName(){
        return this.lastName + "";
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
    public int getID(){
        return this.id;
    }
    public String getPhoneNumber(){
        return this.phoneNumber + "";
    }

    public void depositMoney(double depositAmount){
        this.balance += depositAmount;
        System.out.println("You have deposit " +depositAmount +" to your account." + "\n" +
                "Balance is now: " +this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance < withdrawalAmount) {
            System.out.println("You don't have enough funds.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("You have withdrawal " +withdrawalAmount + " from your account." + "\n" +
                    "Balance is now: " +this.balance);
        }
    }

    public void moneyTransfer(Account thisAccount, Account toAccount, double amountToTransfer){
        if(thisAccount.getBalance() > 0) {
            toAccount.setBalance(toAccount.balance += amountToTransfer);
            thisAccount.setBalance(this.balance -= amountToTransfer);
        } else {
            System.out.println("You don't have enough funds");
        }
    }

    @Override
    public String toString(){
        return "Name: " + getFirstName() + "\n" +
                "Last name: " +getLastName() +"\n" +
                "Balance: " + getBalance() + "\n" +
                "ID: " + getID();
    }
}
