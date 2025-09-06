package javax.xml.bind.annotation.adapters;

public class CollapsedStringAdapter extends XmlAdapter {
    protected static boolean isWhiteSpace(char c) {
        return c <= 0x20 ? c == 9 || c == 10 || (c == 13 || c == 0x20) : false;
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
        int v = s.length();
        int v2;
        for(v2 = 0; v2 < v && !CollapsedStringAdapter.isWhiteSpace(s.charAt(v2)); ++v2) {
        }
        if(v2 == v) {
            return s;
        }
        StringBuilder stringBuilder0 = new StringBuilder(v);
        if(v2 != 0) {
            for(int v1 = 0; v1 < v2; ++v1) {
                stringBuilder0.append(s.charAt(v1));
            }
            stringBuilder0.append(' ');
        }
        int v3 = v2 + 1;
        boolean z = true;
        while(v3 < v) {
            int v4 = s.charAt(v3);
            boolean z1 = CollapsedStringAdapter.isWhiteSpace(((char)v4));
            if(!z || !z1) {
                if(z1) {
                    stringBuilder0.append(' ');
                }
                else {
                    stringBuilder0.append(((char)v4));
                }
                z = z1;
            }
            ++v3;
        }
        int v5 = stringBuilder0.length();
        if(v5 > 0 && stringBuilder0.charAt(v5 - 1) == 0x20) {
            stringBuilder0.setLength(v5 - 1);
        }
        return stringBuilder0.toString();
    }
}

