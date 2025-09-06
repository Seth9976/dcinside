package javax.xml.bind;

import java.net.URL;
import org.w3c.dom.Node;

public interface ValidationEventLocator {
    int getColumnNumber();

    int getLineNumber();

    Node getNode();

    Object getObject();

    int getOffset();

    URL getURL();
}

