package day03_branching_pull_request;

public class TestStocks {

    public static void main(String[] args) {
        Stock googleStock = new Stock("GOOGLE", "Google", 156.06);
        Stock teslaStock = new Stock("TESLA", "Tesla Inc", 263.55);

        System.out.println("teslaStock = " + teslaStock);
        System.out.println("googleStock = " + googleStock);
    }
}
