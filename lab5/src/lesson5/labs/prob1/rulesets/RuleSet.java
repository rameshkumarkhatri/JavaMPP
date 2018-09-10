package lesson5.labs.prob1.rulesets;

import java.awt.Component;
import java.math.BigDecimal;

public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
