package androidx.constraintlayout.core.dsl;

import java.util.HashMap;
import java.util.Map;

public class Helper {
    public static final class HelperType {
        final String a;

        public HelperType(String s) {
            this.a = s;
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    public static enum Type {
        VERTICAL_GUIDELINE,
        HORIZONTAL_GUIDELINE,
        VERTICAL_CHAIN,
        HORIZONTAL_CHAIN,
        BARRIER;

        private static Type[] a() [...] // Inlined contents
    }

    protected final String a;
    protected HelperType b;
    protected String c;
    protected Map d;
    protected static final Map e;
    protected static final Map f;

    static {
        HashMap hashMap0 = new HashMap();
        Helper.e = hashMap0;
        hashMap0.put(Side.a, "\'left\'");
        hashMap0.put(Side.b, "\'right\'");
        hashMap0.put(Side.c, "\'top\'");
        hashMap0.put(Side.d, "\'bottom\'");
        hashMap0.put(Side.e, "\'start\'");
        hashMap0.put(Side.f, "\'end\'");
        hashMap0.put(Side.g, "\'baseline\'");
        HashMap hashMap1 = new HashMap();
        Helper.f = hashMap1;
        hashMap1.put(Type.a, "vGuideline");
        hashMap1.put(Type.b, "hGuideline");
        hashMap1.put(Type.c, "vChain");
        hashMap1.put(Type.d, "hChain");
        hashMap1.put(Type.e, "barrier");
    }

    public Helper(String s, HelperType helper$HelperType0) {
        this.b = null;
        this.d = new HashMap();
        this.a = s;
        this.b = helper$HelperType0;
    }

    public Helper(String s, HelperType helper$HelperType0, String s1) {
        this.b = null;
        this.d = new HashMap();
        this.a = s;
        this.b = helper$HelperType0;
        this.c = s1;
        this.d = this.b();
    }

    public void a(Map map0, StringBuilder stringBuilder0) {
        if(map0.isEmpty()) {
            return;
        }
        for(Object object0: map0.keySet()) {
            stringBuilder0.append(((String)object0));
            stringBuilder0.append(":");
            stringBuilder0.append(((String)map0.get(((String)object0))));
            stringBuilder0.append(",\n");
        }
    }

    public Map b() {
        if(this.c != null && this.c.length() != 0) {
            Map map0 = new HashMap();
            StringBuilder stringBuilder0 = new StringBuilder();
            String s = "";
            int v1 = 0;
            int v2 = 0;
            for(int v = 0; v < this.c.length(); ++v) {
                int v3 = this.c.charAt(v);
                switch(v3) {
                    case 0x20: {
                        break;
                    }
                    case 44: {
                        if(v1 != 0 || v2 != 0) {
                            stringBuilder0.append(',');
                        }
                        else {
                            map0.put(s, stringBuilder0.toString());
                            stringBuilder0.setLength(0);
                            s = "";
                        }
                        break;
                    }
                    case 58: {
                        s = stringBuilder0.toString();
                        stringBuilder0.setLength(0);
                        break;
                    }
                    case 91: {
                        ++v1;
                        stringBuilder0.append('[');
                        break;
                    }
                    case 93: {
                        --v1;
                        stringBuilder0.append(']');
                        break;
                    }
                    case 0x7B: {
                        ++v2;
                        stringBuilder0.append('{');
                        break;
                    }
                    case 0x7D: {
                        --v2;
                        stringBuilder0.append('}');
                        break;
                    }
                    default: {
                        stringBuilder0.append(((char)v3));
                    }
                }
            }
            map0.put(s, stringBuilder0.toString());
            return map0;
        }
        return null;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.a;
    }

    public HelperType e() {
        return this.b;
    }

    public static void f(String[] arr_s) {
        new Barrier("abc", "[\'a1\', \'b2\']");
        System.out.println("abc:{\ntype:\'barrier\',\n:[\'a1\',\'b2\'],\n},\n");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.a + ":{\n");
        if(this.b != null) {
            stringBuilder0.append("type:\'");
            stringBuilder0.append(this.b.toString());
            stringBuilder0.append("\',\n");
        }
        Map map0 = this.d;
        if(map0 != null) {
            this.a(map0, stringBuilder0);
        }
        stringBuilder0.append("},\n");
        return stringBuilder0.toString();
    }
}

