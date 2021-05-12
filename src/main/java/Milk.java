public class Milk {

    int litres;
    double pricePerLitre;
    String brandName;

    public Milk(String brandName, int litres, double pricePerLitre) {
        this.brandName=brandName;
        this.litres=litres;
        this.pricePerLitre=pricePerLitre;
    }

    public int getLitres()
    {
        return litres;
    }

    public double getPricePerLitre()
    {
        return pricePerLitre;
    }

    public String getBrandName()
    {
        return brandName;
    }
}
