package javax.xml.bind;

import java.security.PrivilegedAction;

final class GetPropertyAction implements PrivilegedAction {
    private final String propertyName;

    public GetPropertyAction(String s) {
        this.propertyName = s;
    }

    @Override
    public Object run() {
        return this.run();
    }

    public String run() {
        return System.getProperty(this.propertyName);
    }
}

