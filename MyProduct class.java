public class MyProduct extends Product{
public MyProduct()
{
 super();
}

NumberFormat nf;

public String getPrice(NumberFormat nf) {

    this.nf = NumberFormat.getCurrencyInstance();
    String priceFormatted = nf.format(price);
    return priceFormatted;
}
