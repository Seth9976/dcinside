package javax.xml.bind.annotation.adapters;

public abstract class XmlAdapter {
    public abstract Object marshal(Object arg1) throws Exception;

    public abstract Object unmarshal(Object arg1) throws Exception;
}

