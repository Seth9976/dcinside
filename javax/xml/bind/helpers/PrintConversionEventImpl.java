package javax.xml.bind.helpers;

import javax.xml.bind.PrintConversionEvent;
import javax.xml.bind.ValidationEventLocator;

public class PrintConversionEventImpl extends ValidationEventImpl implements PrintConversionEvent {
    public PrintConversionEventImpl(int v, String s, ValidationEventLocator validationEventLocator0) {
        super(v, s, validationEventLocator0);
    }

    public PrintConversionEventImpl(int v, String s, ValidationEventLocator validationEventLocator0, Throwable throwable0) {
        super(v, s, validationEventLocator0, throwable0);
    }
}

