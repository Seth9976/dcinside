package javax.xml.bind.helpers;

import java.text.MessageFormat;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventLocator;

public class ValidationEventImpl implements ValidationEvent {
    private Throwable linkedException;
    private ValidationEventLocator locator;
    private String message;
    private int severity;

    public ValidationEventImpl(int v, String s, ValidationEventLocator validationEventLocator0) {
        this(v, s, validationEventLocator0, null);
    }

    public ValidationEventImpl(int v, String s, ValidationEventLocator validationEventLocator0, Throwable throwable0) {
        this.setSeverity(v);
        this.message = s;
        this.locator = validationEventLocator0;
        this.linkedException = throwable0;
    }

    @Override  // javax.xml.bind.ValidationEvent
    public Throwable getLinkedException() {
        return this.linkedException;
    }

    @Override  // javax.xml.bind.ValidationEvent
    public ValidationEventLocator getLocator() {
        return this.locator;
    }

    @Override  // javax.xml.bind.ValidationEvent
    public String getMessage() {
        return this.message;
    }

    @Override  // javax.xml.bind.ValidationEvent
    public int getSeverity() {
        return this.severity;
    }

    public void setLinkedException(Throwable throwable0) {
        this.linkedException = throwable0;
    }

    public void setLocator(ValidationEventLocator validationEventLocator0) {
        this.locator = validationEventLocator0;
    }

    public void setMessage(String s) {
        this.message = s;
    }

    public void setSeverity(int v) {
        if(v != 0 && v != 1 && v != 2) {
            throw new IllegalArgumentException(Messages.format("ValidationEventImpl.IllegalSeverity"));
        }
        this.severity = v;
    }

    @Override
    public String toString() {
        switch(this.getSeverity()) {
            case 0: {
                return MessageFormat.format("[severity={0},message={1},locator={2}]", new Object[]{"WARNING", this.getMessage(), this.getLocator()});
            }
            case 1: {
                return MessageFormat.format("[severity={0},message={1},locator={2}]", new Object[]{"ERROR", this.getMessage(), this.getLocator()});
            }
            case 2: {
                return MessageFormat.format("[severity={0},message={1},locator={2}]", new Object[]{"FATAL_ERROR", this.getMessage(), this.getLocator()});
            }
            default: {
                return MessageFormat.format("[severity={0},message={1},locator={2}]", new Object[]{String.valueOf(this.getSeverity()), this.getMessage(), this.getLocator()});
            }
        }
    }
}

