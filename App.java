public class App {
    public static void main(String[] args) {

        int section = 5;

        if (section == 1) {
            //Variables
            String firstName = "Ibrahim";
            String lastName = "Alibrahim";
            int age = 24;
            double amount = 20;

            System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(age);
            System.out.println(amount);
        } else if (section == 2) {
            //Booleans
            boolean married = false;
            System.out.println(married);
        } else if (section == 3) {
            //String Interpolation
            double amount = 20;

            String deposit = "Deposit";
            String withdraw = "Withdraw";

            System.out.println("The amount is " + amount + " KD");

            System.out.println("Would you like to " + deposit + " or " + withdraw + " the amount?");

            amount = 30;
            System.out.println("The amount is " + amount + " KD");

        } else if (section == 4) {
            //Arithmetic spice
            int amount = 5;
            System.out.println(amount + " plus " + amount + " makes " + (amount + amount));

        } else if (section == 5) {
            //String Methods
            String fullName = "vin diesel";
            String[] splitName = fullName.split(" ");

            System.out.println("My name is "+splitName[0]+" and my last name length is "+(splitName[1].length())+"\n");

            //Does My Last Name Starts With The Letter d?
            System.out.println("Does last name starts with letter d: "+(splitName[1].charAt(0)=='d'));


        }

    }
}

