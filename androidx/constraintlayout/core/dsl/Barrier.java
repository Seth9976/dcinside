package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Map;

public class Barrier extends Helper {
    private Side g;
    private int h;
    private ArrayList i;

    public Barrier(String s) {
        super(s, new HelperType("barrier"));
        this.g = null;
        this.h = 0x80000000;
        this.i = new ArrayList();
    }

    public Barrier(String s, String s1) {
        super(s, new HelperType("barrier"), s1);
        this.g = null;
        this.h = 0x80000000;
        this.i = new ArrayList();
        Map map0 = this.b();
        this.d = map0;
        if(map0.containsKey("contains")) {
            Ref.a(((String)this.d.get("contains")), this.i);
        }
    }

    public Barrier g(Ref ref0) {
        this.i.add(ref0);
        this.d.put("contains", this.k());
        return this;
    }

    public Barrier h(String s) {
        return this.g(Ref.g(s));
    }

    public Side i() {
        return this.g;
    }

    public int j() {
        return this.h;
    }

    public String k() {
        if(this.i.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder("[");
        for(Object object0: this.i) {
            stringBuilder0.append(((Ref)object0).toString());
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public void l(Side constraint$Side0) {
        this.g = constraint$Side0;
        this.d.put("direction", ((String)Helper.e.get(constraint$Side0)));
    }

    public void m(int v) {
        this.h = v;
        this.d.put("margin", String.valueOf(v));
    }
}

