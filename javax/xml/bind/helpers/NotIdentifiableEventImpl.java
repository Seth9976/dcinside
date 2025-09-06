package javax.xml.bind.helpers;

import javax.xml.bind.NotIdentifiableEvent;
import javax.xml.bind.ValidationEventLocator;

public class NotIdentifiableEventImpl extends ValidationEventImpl implements NotIdentifiableEvent {
    public NotIdentifiableEventImpl(int v, String s, ValidationEventLocator validationEventLocator0) {
        super(v, s, validationEventLocator0);
    }

    public NotIdentifiableEventImpl(int v, String s, ValidationEventLocator validationEventLocator0, Throwable throwable0) {
        super(v, s, validationEventLocator0, throwable0);
    }
}

