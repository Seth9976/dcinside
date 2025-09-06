package javax.xml.bind.helpers;

import java.net.URL;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.ValidationEventLocator;
import org.w3c.dom.Node;

public class DefaultValidationEventHandler implements ValidationEventHandler {
    static final boolean $assertionsDisabled;

    static {
    }

    private String getLocation(ValidationEvent validationEvent0) {
        StringBuffer stringBuffer0 = new StringBuffer();
        ValidationEventLocator validationEventLocator0 = validationEvent0.getLocator();
        if(validationEventLocator0 == null) {
            stringBuffer0.append(Messages.format("DefaultValidationEventHandler.LocationUnavailable"));
        }
        else {
            URL uRL0 = validationEventLocator0.getURL();
            Object object0 = validationEventLocator0.getObject();
            Node node0 = validationEventLocator0.getNode();
            int v = validationEventLocator0.getLineNumber();
            if(uRL0 != null || v != -1) {
                stringBuffer0.append("line " + v);
                if(uRL0 != null) {
                    stringBuffer0.append(" of " + uRL0);
                    return stringBuffer0.toString();
                }
            }
            else {
                if(object0 != null) {
                    stringBuffer0.append(" obj: " + object0.toString());
                    return stringBuffer0.toString();
                }
                if(node0 != null) {
                    stringBuffer0.append(" node: " + node0.toString());
                    return stringBuffer0.toString();
                }
            }
        }
        return stringBuffer0.toString();
    }

    @Override  // javax.xml.bind.ValidationEventHandler
    public boolean handleEvent(ValidationEvent validationEvent0) {
        String s;
        if(validationEvent0 == null) {
            throw new IllegalArgumentException();
        }
        boolean z = true;
        switch(validationEvent0.getSeverity()) {
            case 0: {
                s = Messages.format("DefaultValidationEventHandler.Warning");
                break;
            }
            case 1: {
                s = Messages.format("DefaultValidationEventHandler.Error");
                z = false;
                break;
            }
            case 2: {
                s = Messages.format("DefaultValidationEventHandler.FatalError");
                z = false;
                break;
            }
            default: {
                s = null;
                z = false;
            }
        }
        String s1 = this.getLocation(validationEvent0);
        System.out.println(Messages.format("DefaultValidationEventHandler.SeverityMessage", s, validationEvent0.getMessage(), s1));
        return z;
    }
}

