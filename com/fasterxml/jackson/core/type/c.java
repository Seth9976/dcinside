package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.r;

public class c {
    public static enum a {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean a() [...] // 潜在的解密器
    }

    public Object a;
    public Class b;
    public Object c;
    public String d;
    public a e;
    public r f;
    public boolean g;
    public Object h;

    public c() {
    }

    public c(Object object0, r r0) {
        this(object0, r0, null);
    }

    public c(Object object0, r r0, Object object1) {
        this.a = object0;
        this.c = object1;
        this.f = r0;
    }

    public c(Object object0, Class class0, r r0) {
        this(object0, r0, null);
        this.b = class0;
    }
}

