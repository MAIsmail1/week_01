public class Main {

    public static void main(String[] args) {
        int priceOfBook = 50;
        int amountInWallet = 50;
        int booksInStock = 0;

        if (amountInWallet >= priceOfBook && booksInStock > 0){
            System.out.println("You've got enough to pay for the book.");
            System.out.println("Thanks for shopping with us");
        } else {
            System.out.println("Sorry, you can't afford that.");
        }


    }

}
