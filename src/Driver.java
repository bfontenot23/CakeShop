//Student Name: Beau A Fontenot
//LSU ID: 896506087
//Lab Section: 002 (1:30pm F)

public class Driver {

    public static void main(String[] args)
    {
        Cake birthdayCake = new Cake("Caramel", 1);
        birthdayCake.setPrice(30.50);

        Cake weddingCake = new Cake("Vanilla", 4);
        weddingCake.setPrice(299.99);

        Cake graduationCake = new Cake("Carrot", 2);
        graduationCake.setPrice(47.75);

        birthdayCake.printCard();
        weddingCake.printCard();
        graduationCake.printCard();

        double totalSales = birthdayCake.getPrice() + weddingCake.getPrice() + graduationCake.getPrice();
        System.out.printf("Total cake sales\t\t\t$%.2f\n",totalSales);
    }

}
