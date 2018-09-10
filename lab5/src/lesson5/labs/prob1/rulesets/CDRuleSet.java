package lesson5.labs.prob1.rulesets;

import java.awt.Component;
import java.math.BigDecimal;

import lesson5.labs.prob1.gui.CDWindow;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Price must be a floating point number with two decimal places
 * 3. Price must be a number greater than 0.49.
 */

public class CDRuleSet extends CommonRules implements RuleSet {
    CDWindow cdWindow;

    @Override
    public void applyRules(Component ob) throws RuleException {
        // TODO Auto-generated method stub
        cdWindow = (CDWindow) ob;
        fieldsNotEmpty();
        priceFloatingPointCheck(cdWindow.getPriceValue().trim());
        priceMinCheck(cdWindow.getPriceValue().trim());
    }

    public void fieldsNotEmpty() throws RuleException {
        if (cdWindow.getArtistValue().trim().isEmpty() || cdWindow.getPriceValue().trim().isEmpty() || cdWindow.getTitleValue().isEmpty())
            throw new RuleException("Fields must not be empty.");
    }


}
