package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.util.H;
import java.io.IOException;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class c extends h {
    private final Map o;
    private final Map p;
    private static final long q = 1L;
    private static final BitSet r;

    static {
        c.r = new BitSet(0);
    }

    public c(c c0, d d0) {
        super(c0, d0);
        this.o = c0.o;
        this.p = c0.p;
    }

    public c(m m0, g g0, m m1, com.fasterxml.jackson.databind.g g1, Collection collection0) {
        super(m0, g0, null, false, m1, null, true);
        this.o = new HashMap();
        this.p = this.C(g1, collection0);
    }

    protected Map C(com.fasterxml.jackson.databind.g g0, Collection collection0) {
        boolean z = g0.a0(t.y);
        Map map0 = new HashMap();
        int v = 0;
        for(Object object0: collection0) {
            com.fasterxml.jackson.databind.jsontype.c c0 = (com.fasterxml.jackson.databind.jsontype.c)object0;
            List list0 = g0.o1(g0.S().f0(c0.a())).u();
            BitSet bitSet0 = new BitSet(list0.size() + v);
            for(Object object1: list0) {
                String s = ((v)object1).getName();
                if(z) {
                    s = s.toLowerCase();
                }
                Integer integer0 = (Integer)this.o.get(s);
                if(integer0 == null) {
                    integer0 = v;
                    this.o.put(s, v);
                    ++v;
                }
                bitSet0.set(((int)integer0));
            }
            String s1 = (String)map0.put(bitSet0, c0.a().getName());
            if(s1 != null) {
                throw new IllegalStateException(String.format("Subtypes %s and %s have the same signature and cannot be uniquely deduced.", s1, c0.a().getName()));
            }
            if(false) {
                break;
            }
        }
        return map0;
    }

    private static void D(List list0, int v) {
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!((BitSet)object0).get(v)) {
                iterator0.remove();
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.h
    public Object e(n n0, com.fasterxml.jackson.databind.h h0) throws IOException {
        r r0 = n0.Y();
        if(r0 == r.k) {
            r0 = n0.m4();
        }
        else if(r0 != r.o) {
            return this.B(n0, h0, null, "Unexpected input");
        }
        if(r0 == r.l) {
            String s = (String)this.p.get(c.r);
            if(s != null) {
                return this.z(n0, h0, null, s);
            }
        }
        LinkedList linkedList0 = new LinkedList(this.p.keySet());
        H h1 = h0.O(n0);
        boolean z = h0.z(t.y);
        while(r0 == r.o) {
            String s1 = n0.T();
            if(z) {
                s1 = s1.toLowerCase();
            }
            h1.T(n0);
            Integer integer0 = (Integer)this.o.get(s1);
            if(integer0 != null) {
                c.D(linkedList0, ((int)integer0));
                if(linkedList0.size() == 1) {
                    Object object0 = linkedList0.get(0);
                    return this.z(n0, h0, h1, ((String)this.p.get(object0)));
                }
            }
            r0 = n0.m4();
        }
        return this.B(n0, h0, h1, String.format("Cannot deduce unique subtype of %s (%d candidates match)", com.fasterxml.jackson.databind.util.h.Q(this.b), linkedList0.size()));
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.h
    public f g(d d0) {
        return d0 == this.c ? this : new c(this, d0);
    }
}

