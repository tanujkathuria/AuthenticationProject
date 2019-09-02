package com.tanuj.exceptions;

/**
 * @author Tanuj Kathuria
 * @version 1.0
 */
public class RiskNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 2305130525843722470L;

    private String exceptionMessage;

    public RiskNotFoundException(int roleId,String exceptionMessage) {
        super();
        this.exceptionMessage = roleId+""+exceptionMessage;
    }

    @Override
    public String getMessage() {
        return exceptionMessage;
    }

    @Override
    public String toString() {
        return exceptionMessage;
    }
}
