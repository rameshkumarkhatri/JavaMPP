package lesson5.labs.prob1.rulesets;

import java.math.BigDecimal;

public class CommonRules {

    public void priceFloatingPointCheck(String priceD) throws RuleException {
        try {
            double price = Double.parseDouble(priceD);
            boolean isGreaterThan2 = (BigDecimal.valueOf(price).scale() > 2);
            if (isGreaterThan2)
                throw new RuleException("Price must be in 2 decimal points.");

        } catch (NumberFormatException e) {
            e.printStackTrace();

            throw new RuleException("Price must be number.");
        }
    }

    public void priceMinCheck(String priceD) throws RuleException {
        double price = Double.parseDouble(priceD);
        if (price <= 0.49)
            throw new RuleException("Price must be greater than 0.49.");

    }


}