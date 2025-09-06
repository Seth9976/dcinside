package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.util.internal.c;
import java.io.Serializable;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class t implements w, Serializable {
    protected final int a;
    protected final int b;
    protected final transient c c;
    private static final long d = 2L;

    public t(int v, int v1) {
        this.a = v;
        this.b = v1;
        this.c = new com.fasterxml.jackson.databind.util.internal.c.c().c(v).d(((long)v1)).b(4).a();
    }

    @Override  // com.fasterxml.jackson.databind.util.w
    public void a(BiConsumer biConsumer0) {
        for(Object object0: this.c.entrySet()) {
            biConsumer0.accept(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    @Override  // com.fasterxml.jackson.databind.util.w
    public w b() {
        return new t(this.a, this.b);
    }

    protected Object c() {
        return new t(this.a, this.b);
    }

    @Override  // com.fasterxml.jackson.databind.util.w
    public void clear() {
        this.c.clear();
    }

    @Override  // com.fasterxml.jackson.databind.util.w
    public Object get(Object object0) {
        return this.c.get(object0);
    }

    @Override  // com.fasterxml.jackson.databind.util.w
    public Object put(Object object0, Object object1) {
        return this.c.put(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.util.w
    public Object putIfAbsent(Object object0, Object object1) {
        return this.c.putIfAbsent(object0, object1);
    }

    @Override  // com.fasterxml.jackson.databind.util.w
    public int size() {
        return this.c.size();
    }
}

