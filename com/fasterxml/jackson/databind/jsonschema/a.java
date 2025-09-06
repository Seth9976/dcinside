package com.fasterxml.jackson.databind.jsonschema;

import com.fasterxml.jackson.annotation.K;
import com.fasterxml.jackson.annotation.k;
import com.fasterxml.jackson.databind.node.m;
import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.p;

@Deprecated
public class a {
    private final u a;

    @k
    public a(u u0) {
        this.a = u0;
    }

    public static p a() {
        p p0 = m.d.y();
        ((u)p0).T2("type", "any");
        return p0;
    }

    @K
    public u b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        return this.a == null ? ((a)object0).a == null : this.a.equals(((a)object0).a);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

