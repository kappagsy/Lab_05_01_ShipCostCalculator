public class Main
{
    public static void main(String[] args)
    {
       double itemPrice = 50.00;
       double shippingCost = 0.00;
       double totalCost;

        System.out.println("What is the price of your item?");

        if (itemPrice < 100.00)
        {
            System.out.println("Your shipping cost is: " + shippingCost + ". Your total cost is: " + itemPrice);
        }
        else
        {
          shippingCost = itemPrice * 0.02;
          totalCost = itemPrice + shippingCost;
            System.out.println("Your shipping cost is: " + shippingCost + ". Your total cost is: " + totalCost);
        }
    }
}