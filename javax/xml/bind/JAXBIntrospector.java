package javax.xml.bind;

import javax.xml.namespace.QName;

public abstract class JAXBIntrospector {
    public abstract QName getElementName(Object arg1);

    // 去混淆评级： 低(20)
    public static Object getValue(Object object0) {
        return object0 instanceof JAXBElement ? ((JAXBElement)object0).getValue() : object0;
    }

    public abstract boolean isElement(Object arg1);
}

