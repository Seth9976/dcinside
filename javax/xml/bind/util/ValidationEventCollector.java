package javax.xml.bind.util;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

public class ValidationEventCollector implements ValidationEventHandler {
    private final List events;

    public ValidationEventCollector() {
        this.events = new ArrayList();
    }

    private static void _assert(boolean z, String s) {
        if(!z) {
            throw new InternalError(s);
        }
    }

    public ValidationEvent[] getEvents() {
        return (ValidationEvent[])this.events.toArray(new ValidationEvent[this.events.size()]);
    }

    @Override  // javax.xml.bind.ValidationEventHandler
    public boolean handleEvent(ValidationEvent validationEvent0) {
        this.events.add(validationEvent0);
        int v = validationEvent0.getSeverity();
        if(v != 0 && v != 1) {
            if(v != 2) {
                ValidationEventCollector._assert(false, Messages.format("ValidationEventCollector.UnrecognizedSeverity", validationEvent0.getSeverity()));
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean hasEvents() {
        return !this.events.isEmpty();
    }

    public void reset() {
        this.events.clear();
    }
}

