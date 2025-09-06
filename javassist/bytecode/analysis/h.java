package javassist.bytecode.analysis;

import java.util.HashMap;
import java.util.Map;
import javassist.l;

public class h extends k {
    private Map u;
    private k v;
    private k w;
    private h x;
    private boolean y;

    public h(Map map0) {
        this(map0, null);
    }

    public h(Map map0, k k0) {
        super(null);
        this.y = false;
        this.u = map0;
        this.w = k0;
    }

    private boolean A(h h0) {
        while(h0 != null) {
            if(h0 == this) {
                return true;
            }
            h0 = h0.x;
        }
        return false;
    }

    public boolean B(k k0) {
        k k1 = this.v;
        if(k1 != null) {
            return k0.r(k1);
        }
        if(k.q.equals(k0)) {
            return true;
        }
        if(this.w != null && !k0.r(this.w)) {
            this.w = null;
        }
        Map map0 = this.C(this, k0);
        if(map0.size() == 1 && this.w == null) {
            Object object0 = map0.values().iterator().next();
            this.v = k.h(((l)object0));
            this.E();
            return true;
        }
        if(map0.size() >= 1) {
            this.u = map0;
            this.F();
            return true;
        }
        k k2 = this.w;
        if(k2 != null) {
            this.v = k2;
            this.E();
            return true;
        }
        return false;
    }

    private Map C(h h0, k k0) {
        return this.d(this.z(h0), this.i(k0.l(), null));
    }

    private Map D(h h0, h h1) {
        return this.d(this.z(h0), this.z(h1));
    }

    private void E() {
        for(h h0 = this.x; h0 != null; h0 = h0.x) {
            h0.v = this.v;
        }
    }

    private void F() {
        for(h h0 = this.x; h0 != null; h0 = h0.x) {
            h0.u = this.u;
            h0.w = this.w;
        }
    }

    @Override  // javassist.bytecode.analysis.k
    public boolean equals(Object object0) {
        if(!(object0 instanceof h)) {
            return false;
        }
        k k0 = this.v;
        if(k0 != null) {
            return k0.equals(((h)object0).v);
        }
        return ((h)object0).v == null ? this.u.keySet().equals(((h)object0).u.keySet()) : false;
    }

    @Override  // javassist.bytecode.analysis.k
    public int hashCode() {
        k k0 = this.v;
        return k0 == null ? this.u.keySet().hashCode() : k0.hashCode();
    }

    @Override  // javassist.bytecode.analysis.k
    public k k() {
        return null;
    }

    @Override  // javassist.bytecode.analysis.k
    public l l() {
        k k0 = this.v;
        return k0 == null ? k.q.l() : k0.l();
    }

    @Override  // javassist.bytecode.analysis.k
    public int p() {
        return 1;
    }

    @Override  // javassist.bytecode.analysis.k
    public boolean q() {
        return false;
    }

    @Override  // javassist.bytecode.analysis.k
    public boolean r(k k0) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override  // javassist.bytecode.analysis.k
    public boolean s() {
        return true;
    }

    @Override  // javassist.bytecode.analysis.k
    public String toString() {
        k k0 = this.v;
        if(k0 != null) {
            return k0.toString();
        }
        StringBuffer stringBuffer0 = new StringBuffer("{");
        for(Object object0: this.u.keySet()) {
            stringBuffer0.append(((String)object0));
            stringBuffer0.append(", ");
        }
        if(this.w == null) {
            stringBuffer0.setLength(stringBuffer0.length() - 2);
        }
        else {
            stringBuffer0.append("*");
            stringBuffer0.append(this.w.toString());
        }
        stringBuffer0.append("}");
        return stringBuffer0.toString();
    }

    @Override  // javassist.bytecode.analysis.k
    public k v(k k0) {
        Map map0;
        if(this == k0) {
            return this;
        }
        if(k0 == k.m) {
            return this;
        }
        k k1 = k.p;
        if(k0 == k1) {
            return k1;
        }
        if(k0 == null) {
            return this;
        }
        k k2 = this.v;
        if(k2 != null) {
            return k2.v(k0);
        }
        k k3 = this.w;
        if(k3 != null) {
            k k4 = k3.v(k0);
            if(!k4.equals(this.w) || k4.y()) {
                if(k.q.equals(k4)) {
                    k4 = null;
                }
                this.w = k4;
                this.y = true;
            }
        }
        if(k0 instanceof h) {
            k k5 = ((h)k0).v;
            if(k5 == null) {
                Map map1 = this.D(((h)k0), this);
                if(!this.A(((h)k0))) {
                    this.x = (h)k0;
                }
                map0 = map1;
            }
            else {
                map0 = this.C(this, k5);
            }
        }
        else {
            map0 = this.C(this, k0);
        }
        if(map0.size() <= 1 && (map0.size() != 1 || this.w == null)) {
            if(map0.size() == 1) {
                Object object0 = map0.values().iterator().next();
                this.v = k.h(((l)object0));
            }
            else {
                k k6 = this.w;
                this.v = k6 == null ? k.q : k6;
            }
            this.E();
            return this.v;
        }
        if(map0.size() != this.u.size()) {
            this.y = true;
        }
        else if(!this.y) {
            for(Object object1: map0.keySet()) {
                if(!this.u.containsKey(((String)object1))) {
                    this.y = true;
                }
            }
        }
        this.u = map0;
        this.F();
        return this;
    }

    @Override  // javassist.bytecode.analysis.k
    boolean y() {
        boolean z = this.y;
        this.y = false;
        return z;
    }

    private Map z(h h0) {
        Map map0 = new HashMap();
        for(Object object0: h0.u.values()) {
            map0.put(((l)object0).X(), ((l)object0));
            this.i(((l)object0), map0);
        }
        return map0;
    }
}

