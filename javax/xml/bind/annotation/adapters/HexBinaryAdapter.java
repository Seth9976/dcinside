package javax.xml.bind.annotation.adapters;

import javax.xml.bind.DatatypeConverter;

public final class HexBinaryAdapter extends XmlAdapter {
    @Override  // javax.xml.bind.annotation.adapters.XmlAdapter
    public Object marshal(Object object0) throws Exception {
        return this.marshal(((byte[])object0));
    }

    public String marshal(byte[] arr_b) {
        return arr_b == null ? null : DatatypeConverter.printHexBinary(arr_b);
    }

    @Override  // javax.xml.bind.annotation.adapters.XmlAdapter
    public Object unmarshal(Object object0) throws Exception {
        return this.unmarshal(((String)object0));
    }

    public byte[] unmarshal(String s) {
        return s == null ? null : DatatypeConverter.parseHexBinary(s);
    }
}

