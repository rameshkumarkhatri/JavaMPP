package lesson6.labs.Rules;

import lesson6.labs.prob1.MainJavaFX;

import java.awt.*;

public class RuleJavaFX implements CommonRules {

    MainJavaFX mainJavaFX;
    @Override
    public void applyRules(Object component) throws RuleException {
        if(component != null && component instanceof MainJavaFX)
            mainJavaFX = (MainJavaFX) component;
        else throw new RuleException("Component mismatch");
        nullCheckRule();


    }

    @Override
    public void nullCheckRule() throws RuleException {
    }
}
