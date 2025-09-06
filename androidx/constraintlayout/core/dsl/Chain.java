package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Chain extends Helper {
    public class Anchor {
        final Side a;
        androidx.constraintlayout.core.dsl.Constraint.Anchor b;
        int c;
        int d;
        final Chain e;

        Anchor(Side constraint$Side0) {
            this.b = null;
            this.d = 0x80000000;
            this.a = constraint$Side0;
        }

        public void a(StringBuilder stringBuilder0) {
            if(this.b != null) {
                stringBuilder0.append(this.a.toString().toLowerCase());
                stringBuilder0.append(":");
                stringBuilder0.append(this);
                stringBuilder0.append(",\n");
            }
        }

        public String b() {
            return Chain.this.a;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("[");
            if(this.b != null) {
                stringBuilder0.append("\'");
                stringBuilder0.append(this.b.b());
                stringBuilder0.append("\',");
                stringBuilder0.append("\'");
                stringBuilder0.append(this.b.a.toString().toLowerCase());
                stringBuilder0.append("\'");
            }
            if(this.c != 0) {
                stringBuilder0.append(",");
                stringBuilder0.append(this.c);
            }
            if(this.d != 0x80000000) {
                if(this.c == 0) {
                    stringBuilder0.append(",0,");
                }
                else {
                    stringBuilder0.append(",");
                }
                stringBuilder0.append(this.d);
            }
            stringBuilder0.append("]");
            return stringBuilder0.toString();
        }
    }

    public static enum Style {
        PACKED,
        SPREAD,
        SPREAD_INSIDE;

        private static Style[] a() [...] // Inlined contents
    }

    private Style g;
    protected ArrayList h;
    protected static final Map i;

    static {
        HashMap hashMap0 = new HashMap();
        Chain.i = hashMap0;
        hashMap0.put(Style.b, "\'spread\'");
        hashMap0.put(Style.c, "\'spread_inside\'");
        hashMap0.put(Style.a, "\'packed\'");
    }

    public Chain(String s) {
        super(s, new HelperType(""));
        this.g = null;
        this.h = new ArrayList();
    }

    public Chain g(Ref ref0) {
        this.h.add(ref0);
        this.d.put("contains", this.j());
        return this;
    }

    public Chain h(String s) {
        return this.g(Ref.g(s));
    }

    public Style i() {
        return this.g;
    }

    public String j() {
        if(this.h.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder("[");
        for(Object object0: this.h) {
            stringBuilder0.append(((Ref)object0).toString());
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public void k(Style chain$Style0) {
        this.g = chain$Style0;
        this.d.put("style", ((String)Chain.i.get(chain$Style0)));
    }
}

