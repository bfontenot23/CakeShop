//Student Name: Beau A Fontenot
//LSU ID: 896506087
//Lab Section: 002 (1:30pm F)

public class Cake {

    private String flavor;
    private int tiers;
    private double price;

    public Cake(String flavor, int tiers)
    {
        this.flavor = flavor;
        this.tiers = tiers;
    }

    public String getFlavor()
    {
        return flavor;
    }

    public void setFlavor(String flavor)
    {
        this.flavor = flavor;
    }

    public int getTiers()
    {
        return tiers;
    }

    public void setTiers(int tiers)
    {
        this.tiers = tiers;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void printCard()
    {
        System.out.printf("A %d tiers %s cake\t\t$%.2f\n",this.getTiers(),this.getFlavor(),this.getPrice());
    }

}
