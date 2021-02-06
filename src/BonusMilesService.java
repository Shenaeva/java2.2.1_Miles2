public class BonusMilesService {
    public int calculate(int cost) {
        int milesPrice = 20;
        int miles = cost / milesPrice;
        return miles;
    }
}
