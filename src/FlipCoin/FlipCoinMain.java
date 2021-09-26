package FlipCoin;

public class FlipCoinMain {
    public static void main(String[] args) {
        FlipCoin flipCoin = new FlipCoin();
        int num = flipCoin.getNum();
        double headPercent = flipCoin.getHeadPercentage(num);
        double tailPercent = 100 - headPercent;
        System.out.println("Percenatage of Head is "+headPercent);
        System.out.println("Percenatage of Tail is "+tailPercent);
    }
}
