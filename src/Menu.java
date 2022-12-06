//Denna kod har är för göra de två huvud menyer som min bank har
public class Menu {
    //Denna kod gör för att printa ut den första menyn där man får välja mellan att registera, loga in eller att exita banken.
    //Allt är under en println där man kan svara. Genom att trycka 1, 2 eller 3.
    public static void printMenu() {
        System.out.println("Hello, press: " + "\n" +
                "\r" + "1.Register" + "\n" +
                "\r" + "2.Log in" + "\n" +
                "\r" + "3.Exit");
    }
    // Detta är meny två som poppar upp när man har logat in på banken. Denna meny fungerar på samma sätt som meny 1 men denna gång så är det skillnad mellan de olika tabsen
    // Man reagerar med menyn med out.println och genom att trycka på 1, 2, 3, 4 eller 5.
    public static void existAccountMenu(){
        System.out.println("What would you like to do?" + "\n" +
                "\r" + "1.Info" + "\n" +
                "\r" + "2.Deposit money" + "\n" +
                "\r" + "3.Withdrawal money" + "\n" +
                "\r" + "4.Money transferring" + "\n" +
                "\r" + "5.Exit");
    }
}
