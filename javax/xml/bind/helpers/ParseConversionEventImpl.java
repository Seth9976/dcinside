package javax.xml.bind.helpers;

import javax.xml.bind.ParseConversionEvent;
import javax.xml.bind.ValidationEventLocator;

public class ParseConversionEventImpl extends ValidationEventImpl implements ParseConversionEvent {
    public ParseConversionEventImpl(int v, String s, ValidationEventLocator validationEventLocator0) {
        super(v, s, validationEventLocator0);
    }

    public ParseConversionEventImpl(int v, String s, ValidationEventLocator validationEventLocator0, Throwable throwable0) {
        super(v, s, validationEventLocator0, throwable0);
    }
}

