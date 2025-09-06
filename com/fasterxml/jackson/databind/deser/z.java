package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class z extends o {
    private com.fasterxml.jackson.databind.deser.impl.z i;
    private List j;
    private static final long k = 1L;

    public z(n n0, String s) {
        super(n0, s);
        this.j = new ArrayList();
    }

    public z(n n0, String s, l l0, com.fasterxml.jackson.databind.deser.impl.z z0) {
        super(n0, s, l0);
        this.i = z0;
    }

    public void E(Object object0, Class class0, l l0) {
        this.j.add(new A(object0, class0, l0));
    }

    public z F() {
        synchronized(this) {
        }
        return this;
    }

    public com.fasterxml.jackson.databind.deser.impl.z G() {
        return this.i;
    }

    public Object H() {
        return this.i.c().c;
    }

    public List I() {
        return this.j;
    }

    public z J() {
        super.fillInStackTrace();
        return this;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this.F();
    }

    @Override  // com.fasterxml.jackson.databind.o
    public String getMessage() {
        String s = super.getMessage();
        if(this.j == null) {
            return s;
        }
        StringBuilder stringBuilder0 = new StringBuilder(s);
        Iterator iterator0 = this.j.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(((A)object0).toString());
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append('.');
        return stringBuilder0.toString();
    }
}

