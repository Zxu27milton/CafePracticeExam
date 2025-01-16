public class MenuItem {

    String itemName;
    double price;
    boolean isHot;

    public static void main(String[] args) {

    }

    public MenuItem(String paramitemname, double paramprice, boolean paramishot){
        itemName = paramitemname;
        price = paramprice;
        isHot = paramishot;
        PrintInfo();
    }

    public void PrintInfo(){
        if (isHot == true) {
            System.out.println("\nThe " + itemName + " is priced at " +
                    price + " dollars, and is hot");
        }
        else {
            System.out.println("\nThe "+ itemName + " is priced at " +
                    price + " dollars, and is cold");
        }
    }
}
