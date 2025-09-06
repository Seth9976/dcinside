package com.google.gson;

import com.google.gson.internal.h;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class m extends j {
    private final h a;

    public m() {
        this.a = new h(false);
    }

    public void A(String s, Boolean boolean0) {
        l l0 = boolean0 == null ? l.a : new p(boolean0);
        this.z(s, l0);
    }

    public void B(String s, Character character0) {
        l l0 = character0 == null ? l.a : new p(character0);
        this.z(s, l0);
    }

    public void C(String s, Number number0) {
        l l0 = number0 == null ? l.a : new p(number0);
        this.z(s, l0);
    }

    public void D(String s, String s1) {
        l l0 = s1 == null ? l.a : new p(s1);
        this.z(s, l0);
    }

    public Map E() {
        return this.a;
    }

    public m F() {
        m m0 = new m();
        for(Object object0: this.a.entrySet()) {
            m0.z(((String)((Map.Entry)object0).getKey()), ((j)((Map.Entry)object0).getValue()).a());
        }
        return m0;
    }

    public j G(String s) {
        return (j)this.a.get(s);
    }

    public g H(String s) {
        return (g)this.a.get(s);
    }

    public m I(String s) {
        return (m)this.a.get(s);
    }

    public p J(String s) {
        return (p)this.a.get(s);
    }

    public boolean K(String s) {
        return this.a.containsKey(s);
    }

    public Set M() {
        return this.a.keySet();
    }

    public j N(String s) {
        return (j)this.a.remove(s);
    }

    @Override  // com.google.gson.j
    public j a() {
        return this.F();
    }

    public Set entrySet() {
        return this.a.entrySet();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 == this || object0 instanceof m && ((m)object0).a.equals(this.a);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isEmpty() {
        return this.a.size() == 0;
    }

    public int size() {
        return this.a.size();
    }

    public void z(String s, j j0) {
        h h0 = this.a;
        if(j0 == null) {
            j0 = l.a;
        }
        h0.put(s, j0);
    }
}

