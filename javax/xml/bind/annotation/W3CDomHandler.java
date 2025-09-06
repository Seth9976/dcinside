package javax.xml.bind.annotation;

import javax.xml.bind.ValidationEventHandler;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class W3CDomHandler implements DomHandler {
    private DocumentBuilder builder;

    public W3CDomHandler() {
        this.builder = null;
    }

    public W3CDomHandler(DocumentBuilder documentBuilder0) {
        if(documentBuilder0 == null) {
            throw new IllegalArgumentException();
        }
        this.builder = documentBuilder0;
    }

    @Override  // javax.xml.bind.annotation.DomHandler
    public Result createUnmarshaller(ValidationEventHandler validationEventHandler0) {
        return this.createUnmarshaller(validationEventHandler0);
    }

    public DOMResult createUnmarshaller(ValidationEventHandler validationEventHandler0) {
        return this.builder == null ? new DOMResult() : new DOMResult(this.builder.newDocument());
    }

    public DocumentBuilder getBuilder() {
        return this.builder;
    }

    @Override  // javax.xml.bind.annotation.DomHandler
    public Object getElement(Result result0) {
        return this.getElement(((DOMResult)result0));
    }

    public Element getElement(DOMResult dOMResult0) {
        Node node0 = dOMResult0.getNode();
        if(node0 instanceof Document) {
            return ((Document)node0).getDocumentElement();
        }
        if(node0 instanceof Element) {
            return (Element)node0;
        }
        if(!(node0 instanceof DocumentFragment)) {
            throw new IllegalStateException(node0.toString());
        }
        return (Element)node0.getChildNodes().item(0);
    }

    @Override  // javax.xml.bind.annotation.DomHandler
    public Source marshal(Object object0, ValidationEventHandler validationEventHandler0) {
        return this.marshal(((Element)object0), validationEventHandler0);
    }

    public Source marshal(Element element0, ValidationEventHandler validationEventHandler0) {
        return new DOMSource(element0);
    }

    public void setBuilder(DocumentBuilder documentBuilder0) {
        this.builder = documentBuilder0;
    }
}

