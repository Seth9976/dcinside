package javax.xml.bind.annotation.adapters;

public final class NormalizedStringAdapter extends XmlAdapter {
    protected static boolean isWhiteSpaceExceptSpace(char c) {
        return c < 0x20 ? c == 9 || c == 10 || c == 13 : false;
    }

    @Override  // javax.xml.bind.annotation.adapters.XmlAdapter
    public Object marshal(Object object0) throws Exception {
        return this.marshal(((String)object0));
    }

    public String marshal(String s) {
        return s;
    }

    @Override  // javax.xml.bind.annotation.adapters.XmlAdapter
    public Object unmarshal(Object object0) throws Exception {
        return this.unmarshal(((String)object0));
    }

    public String unmarshal(String s) {
        if(s == null) {
            return null;
        }
        int v;
        for(v = s.length() - 1; v >= 0 && !NormalizedStringAdapter.isWhiteSpaceExceptSpace(s.charAt(v)); --v) {
        }
        if(v < 0) {
            return s;
        }
        char[] arr_c = s.toCharArray();
        int v1 = v - 1;
        arr_c[v] = ' ';
        while(v1 >= 0) {
            if(NormalizedStringAdapter.isWhiteSpaceExceptSpace(arr_c[v1])) {
                arr_c[v1] = ' ';
            }
            --v1;
        }
        return new String(arr_c);
    }
}

