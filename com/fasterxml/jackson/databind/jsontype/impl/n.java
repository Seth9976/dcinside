package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.H.b;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.e;
import com.fasterxml.jackson.databind.jsontype.d;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.type.q;
import java.io.IOException;

public class n extends l {
    protected final String e;
    protected final String f;

    protected n(m m0, q q0, d d0) {
        super(m0, q0, d0);
        String s = m0.g().getName();
        int v = s.lastIndexOf(46);
        if(v < 0) {
            this.e = "";
            this.f = ".";
            return;
        }
        this.f = s.substring(0, v + 1);
        this.e = s.substring(0, v);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.l
    public String a(Object object0) {
        String s = object0.getClass().getName();
        return s.startsWith(this.f) ? s.substring(this.f.length() - 1) : s;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.l
    public b g() {
        return b.d;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.l
    protected m i(String s, e e0) throws IOException {
        if(s.startsWith(".")) {
            StringBuilder stringBuilder0 = new StringBuilder(s.length() + this.e.length());
            if(this.e.isEmpty()) {
                stringBuilder0.append(s.substring(1));
            }
            else {
                stringBuilder0.append(this.e);
                stringBuilder0.append(s);
            }
            s = stringBuilder0.toString();
        }
        return super.i(s, e0);
    }

    public static n l(m m0, t t0, d d0) {
        return new n(m0, t0.S(), d0);
    }
}

