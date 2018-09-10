package lesson6.labs.Rules;

import java.awt.Component;


public interface CommonRules {

    public void applyRules(Object component) throws RuleException;
    public void nullCheckRule() throws RuleException;

}
