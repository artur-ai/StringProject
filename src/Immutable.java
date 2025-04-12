import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Immutable {
//    class FinancialReport {
//    String reportName;
//    Map<String, BigDecimal> categoryTotals; // наприклад: "Food" -> 123.45
//    List<String> notes;
//    String totalAmount;// загальна сума
//    }

    static class FinancialReport {
        private final String reportName;
        private final Map<String, BigDecimal> categoryTotals;
        private final List<String> notes;
        private final String totalAmount;

        FinancialReport(String reportName, Map<String, BigDecimal> categoryTotals, List<String> notes, String totalAmount) {
            this.reportName = reportName;
            this.categoryTotals = Collections.unmodifiableMap(categoryTotals);
            this.notes = Collections.unmodifiableList(notes);
            this.totalAmount = totalAmount;
        }

        public String getReportName() {
            return reportName;
        }

        public Map<String, BigDecimal> getCategoryTotals() {
            return categoryTotals;
        }

        public List<String> getNotes() {
            return notes;
        }

        public String getTotalAmount() {
            return totalAmount;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Map<String, BigDecimal> totals = Map.of("Food", new BigDecimal("123.45"), "Transport", new BigDecimal("67.89"));
            List<String> notes = List.of("Monthly report", "Verified by accountant");
            FinancialReport report = new FinancialReport("March report", totals, notes, "191.34");

            System.out.println(report.getReportName());
            System.out.println(report.getCategoryTotals());
            System.out.println(report.getNotes());
            System.out.println(report.getTotalAmount());
        }
    }
}
