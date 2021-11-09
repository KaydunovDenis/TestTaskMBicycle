package com.github.kaydunovdenis;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author Kaydunov Denis
 * 08.11.2021
 */
public class Calculator {

    public String evaluate(String expression) throws ScriptException {
        return new ScriptEngineManager()
                .getEngineByName("JavaScript")
                .eval(expression).toString();
    }
}
