public class BonusMilesService {
    public int calculate(int price) {
        int milesPrice = 20;
        int miles = price / milesPrice;
        return miles;
    }
}
