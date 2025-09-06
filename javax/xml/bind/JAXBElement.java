package javax.xml.bind;

import java.io.Serializable;
import javax.xml.namespace.QName;

public class JAXBElement implements Serializable {
    public static final class GlobalScope {
    }

    protected final Class declaredType;
    protected final QName name;
    protected boolean nil;
    protected final Class scope;
    private static final long serialVersionUID = 1L;
    protected Object value;

    public JAXBElement(QName qName0, Class class0, Class class1, Object object0) {
        this.nil = false;
        if(class0 == null || qName0 == null) {
            throw new IllegalArgumentException();
        }
        this.declaredType = class0;
        if(class1 == null) {
            class1 = GlobalScope.class;
        }
        this.scope = class1;
        this.name = qName0;
        this.setValue(object0);
    }

    public JAXBElement(QName qName0, Class class0, Object object0) {
        this(qName0, class0, GlobalScope.class, object0);
    }

    public Class getDeclaredType() {
        return this.declaredType;
    }

    public QName getName() {
        return this.name;
    }

    public Class getScope() {
        return this.scope;
    }

    public Object getValue() {
        return this.value;
    }

    public boolean isGlobalScope() {
        return this.scope == GlobalScope.class;
    }

    public boolean isNil() {
        return this.value == null || this.nil;
    }

    public boolean isTypeSubstituted() {
        return this.value == null ? false : this.value.getClass() != this.declaredType;
    }

    public void setNil(boolean z) {
        this.nil = z;
    }

    public void setValue(Object object0) {
        this.value = object0;
    }
}

