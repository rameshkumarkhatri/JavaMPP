package lesson5.labs.prob1.rulesets;

import java.awt.Component;
import java.math.BigDecimal;

import lesson5.labs.prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places
 * 6. Price must be a number greater than 0.49.
 */
public class BookRuleSet extends CommonRules implements RuleSet {
    BookWindow bookWindow;


    @Override
    public void applyRules(Component ob) throws RuleException {
        // TODO Auto-generated method stub

        bookWindow = (BookWindow) ob;

        fieldsNotEmpty();
        isbnCheck();
        priceFloatingPointCheck(bookWindow.getPriceValue().trim());
        priceMinCheck(bookWindow.getPriceValue().trim());
    }

    public void fieldsNotEmpty() throws RuleException {
        if (bookWindow.getIsbnValue().trim().isEmpty() || bookWindow.getPriceValue().trim().isEmpty() || bookWindow.getTitleValue().isEmpty())
            throw new RuleException("Fields must not be empty.");
    }

    public void isbnCheck() throws RuleException {
        try {
//            long num = Integer.parseInt(bookWindow.getIsbnValue().trim()); // Parse string into number
//            if (bookWindow.getIsbnValue().trim().length() == 10 || bookWindow.getIsbnValue().trim().length() == 13)
//                return;

            if (bookWindow.getIsbnValue().trim().matches(".*\\d{13}.*")) {
                isbnLength13Check();
            } else if (bookWindow.getIsbnValue().trim().matches(".*\\d{10}.*")) {
                isbnLength10Check();
                return;

            } else
                throw new RuleException("Isbn must be 10 or 13 digit long.");
        } catch (NumberFormatException e) {
            e.printStackTrace();

            throw new RuleException("Isbn must be number.");
        }
    }

    public void isbnLength10Check() throws RuleException {
        int subNum = Integer.parseInt(bookWindow.getIsbnValue().charAt(0) + ""); // Parse string into number
        if (subNum == 0 || subNum == 1)
            return;
        throw new RuleException("Invalid number with length 10.");

    }

    public void isbnLength13Check() throws RuleException {
        String sub = bookWindow.getIsbnValue().trim().substring(0, 3);
        int subNum = Integer.parseInt(sub); // Parse string into number
        if (subNum == 978 || subNum == 979)
            return;
        throw new RuleException("Invalid number with length 13.");
    }


}

