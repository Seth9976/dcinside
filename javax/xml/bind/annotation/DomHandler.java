package javax.xml.bind.annotation;

import javax.xml.bind.ValidationEventHandler;
import javax.xml.transform.Result;
import javax.xml.transform.Source;

public interface DomHandler {
    Result createUnmarshaller(ValidationEventHandler arg1);

    Object getElement(Result arg1);

    Source marshal(Object arg1, ValidationEventHandler arg2);
}

