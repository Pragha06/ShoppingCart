public class Apple {

    String name;
    int kilograms;
    double pricePerKilo;

    public Apple(String name, int kilograms, double pricePerKilo) {
        this.name=name;
        this.kilograms=kilograms;
        this.pricePerKilo=pricePerKilo;
    }

    public int getQuantity()
    {
        return kilograms;
    }

    public double getPrice()
    {
        return pricePerKilo;
    }

    public String getName()
    {
        return name;
    }



}

