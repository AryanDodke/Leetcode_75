import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int Maxcandies = 0;
        for(int candy : candies){
            Maxcandies = Math.max(Maxcandies, candy);
        }

        List<Boolean> result = new ArrayList<>();
        for(int candy : candies){
            if (candy + extraCandies >= Maxcandies) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }
}
