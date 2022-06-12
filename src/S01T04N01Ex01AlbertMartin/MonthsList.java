package S01T04N01Ex01AlbertMartin;

import java.util.ArrayList;
import java.util.List;

public class MonthList {

    ArrayList<Month> monthList;

    public MonthList(ArrayList<Month> monthList) {
        this.monthList = monthList;
    }


    public List<Month> monthsList() {
        List<String> monthsOfYear = new ArrayList<>();
        monthsOfYear.add("Gener");
        monthsOfYear.add("Febrer");
        monthsOfYear.add("Mars");
        monthsOfYear.add("Abril");
        monthsOfYear.add("Maig");
        monthsOfYear.add("Juny");
        monthsOfYear.add("Juliol");
        monthsOfYear.add("Agost");
        monthsOfYear.add("Setembre");
        monthsOfYear.add("Octubre");
        monthsOfYear.add("Novembre");
        monthsOfYear.add("Decembre");
        return monthsOfYear;
}
