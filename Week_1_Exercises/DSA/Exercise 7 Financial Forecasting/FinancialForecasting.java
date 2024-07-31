public class FinancialForecasting {

        // Method to calculate future value recursively
        public double predictFutureValue(double currentValue, double growthRate, int periods) {
            // Base case: No more periods left
            if (periods == 0) {
                return currentValue;
            }
            // Recursive step: Apply growth rate and reduce the number of periods
            return predictFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
        }

        public static void main(String[] args) {
            FinancialForecasting forecasting = new FinancialForecasting();
            double initialValue = 1000; // Initial value
            double growthRate = 0.05; // 5% growth rate
            int periods = 10; // Predict for 10 periods

            double futureValue = forecasting.predictFutureValue(initialValue, growthRate, periods);
            System.out.println("Predicted Future Value: $" + futureValue);
        }
    public double predictFutureValueIterative(double currentValue, double growthRate, int periods) {
        for (int i = 0; i < periods; i++) {
            currentValue *= (1 + growthRate);
        }
        return currentValue;
    }
}
