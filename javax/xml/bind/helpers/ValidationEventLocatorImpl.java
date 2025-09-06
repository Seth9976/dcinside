package javax.xml.bind.helpers;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import javax.xml.bind.ValidationEventLocator;
import org.w3c.dom.Node;
import org.xml.sax.Locator;
import org.xml.sax.SAXParseException;

public class ValidationEventLocatorImpl implements ValidationEventLocator {
    private int columnNumber;
    private int lineNumber;
    private Node node;
    private Object object;
    private int offset;
    private URL url;

    public ValidationEventLocatorImpl() {
        this.url = null;
        this.offset = -1;
        this.lineNumber = -1;
        this.columnNumber = -1;
        this.object = null;
        this.node = null;
    }

    public ValidationEventLocatorImpl(Object object0) {
        this.url = null;
        this.offset = -1;
        this.lineNumber = -1;
        this.columnNumber = -1;
        this.object = null;
        this.node = null;
        if(object0 == null) {
            throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "_object"));
        }
        this.object = object0;
    }

    public ValidationEventLocatorImpl(Node node0) {
        this.url = null;
        this.offset = -1;
        this.lineNumber = -1;
        this.columnNumber = -1;
        this.object = null;
        this.node = null;
        if(node0 == null) {
            throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "_node"));
        }
        this.node = node0;
    }

    public ValidationEventLocatorImpl(Locator locator0) {
        this.url = null;
        this.offset = -1;
        this.lineNumber = -1;
        this.columnNumber = -1;
        this.object = null;
        this.node = null;
        if(locator0 == null) {
            throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "loc"));
        }
        this.url = ValidationEventLocatorImpl.toURL(locator0.getSystemId());
        this.columnNumber = locator0.getColumnNumber();
        this.lineNumber = locator0.getLineNumber();
    }

    public ValidationEventLocatorImpl(SAXParseException sAXParseException0) {
        this.url = null;
        this.offset = -1;
        this.lineNumber = -1;
        this.columnNumber = -1;
        this.object = null;
        this.node = null;
        if(sAXParseException0 == null) {
            throw new IllegalArgumentException(Messages.format("Shared.MustNotBeNull", "e"));
        }
        this.url = ValidationEventLocatorImpl.toURL(sAXParseException0.getSystemId());
        this.columnNumber = sAXParseException0.getColumnNumber();
        this.lineNumber = sAXParseException0.getLineNumber();
    }

    @Override  // javax.xml.bind.ValidationEventLocator
    public int getColumnNumber() {
        return this.columnNumber;
    }

    @Override  // javax.xml.bind.ValidationEventLocator
    public int getLineNumber() {
        return this.lineNumber;
    }

    @Override  // javax.xml.bind.ValidationEventLocator
    public Node getNode() {
        return this.node;
    }

    @Override  // javax.xml.bind.ValidationEventLocator
    public Object getObject() {
        return this.object;
    }

    @Override  // javax.xml.bind.ValidationEventLocator
    public int getOffset() {
        return this.offset;
    }

    @Override  // javax.xml.bind.ValidationEventLocator
    public URL getURL() {
        return this.url;
    }

    public void setColumnNumber(int v) {
        this.columnNumber = v;
    }

    public void setLineNumber(int v) {
        this.lineNumber = v;
    }

    public void setNode(Node node0) {
        this.node = node0;
    }

    public void setObject(Object object0) {
        this.object = object0;
    }

    public void setOffset(int v) {
        this.offset = v;
    }

    public void setURL(URL uRL0) {
        this.url = uRL0;
    }

    @Override
    public String toString() {
        return MessageFormat.format("[node={0},object={1},url={2},line={3},col={4},offset={5}]", new Object[]{this.getNode(), this.getObject(), this.getURL(), String.valueOf(this.getLineNumber()), String.valueOf(this.getColumnNumber()), String.valueOf(this.getOffset())});
    }

    private static URL toURL(String s) {
        try {
            return new URL(s);
        }
        catch(MalformedURLException unused_ex) {
            return null;
        }
    }
}

