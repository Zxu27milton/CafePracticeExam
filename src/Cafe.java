public class Cafe {
    String nameOfCafe;
    boolean isOpen;
    int numberOfSeats;

    public static void main(String[] args) {
        Cafe logicCafe = new Cafe();
    }

    public Cafe(){
        System.out.println("\nWelcome to the Cozy Cafe");

        nameOfCafe = "The Java Bean Cafe";
        isOpen = true;
        numberOfSeats = 30;

        System.out.println("\nWelcome to " + nameOfCafe + "! It is " +
                isOpen + " that we are open. We have " +
                numberOfSeats + " seats available.");

        numberOfSeats = 60;

        System.out.println("\nWelcome to " + nameOfCafe + "! It is " +
                isOpen + " that we are open. We have " +
                numberOfSeats + " seats available.");

        specialOfTheDay();
        orderCoffee("\nAlex");
        countCups();
        customerSuggestion();

        MenuItem houseSpecial;
        houseSpecial = new MenuItem("Java Chip Frappuccino", 5.99, false);

        MenuItem myFavorite;
        myFavorite = new MenuItem("Matcha Latte", 7.25, false);

    }

    public void specialOfTheDay() {
        System.out.println("\nToday's special is a Hazelnut Latte.");
    }

    public void orderCoffee(String paramCustomerName){
        String customerName = paramCustomerName;
        System.out.println(customerName + ", your coffee is ready!");
    }

    public void countCups(){
        for (int x=0; x<=4; x=x+1){
            System.out.println(x);
        }
        for (int x=2; x<=8; x=x+2){
            System.out.println(x);
        }
        for (int x=10; x>=0; x=x-2){
            System.out.println(x);
        }
    }

    public void customerSuggestion(){

//        double randomNum = 100;
//
//        while(randomNum>50){
//            randomNum=100*Math.random();
//            System.out.println("pick "+randomNum);
//        }
//        System.out.println(randomNum);

        double randomNum = Math.random() * 100;
        if (randomNum < 25){
            System.out.println("We recommend a cappuccino!");
        }
        else if (25 <= randomNum && randomNum <= 49){
            System.out.println("How about a matcha latte?");
        }
        else if (50 <= randomNum && randomNum <= 74){
            System.out.println("A classic espresso would be perfect.");
        }
        else {
            System.out.println("Treat yourself to an iced mocha!");
        }
    }
}
