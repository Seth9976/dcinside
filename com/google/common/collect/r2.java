package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;

@b(emulated = true)
@C1
abstract class R2 extends a3 {
    @c
    @d
    static class a implements Serializable {
        final Q2 a;
        private static final long b;

        a(Q2 q20) {
            this.a = q20;
        }

        Object a() {
            return this.a.m();
        }
    }

    static final class com.google.common.collect.R2.b extends R2 {
        private final transient Q2 h;
        private final transient O2 i;

        com.google.common.collect.R2.b(Q2 q20, O2 o20) {
            this.h = q20;
            this.i = o20;
        }

        com.google.common.collect.R2.b(Q2 q20, Map.Entry[] arr_map$Entry) {
            this(q20, O2.l(arr_map$Entry));
        }

        @Override  // com.google.common.collect.R2
        Q2 K() {
            return this.h;
        }

        @Override  // com.google.common.collect.K2
        @c("not used in GWT")
        int b(Object[] arr_object, int v) {
            return this.i.b(arr_object, v);
        }

        @Override  // com.google.common.collect.a3
        public u5 i() {
            return this.i.i();
        }

        @Override  // com.google.common.collect.a3
        public Iterator iterator() {
            return this.i();
        }

        @Override  // com.google.common.collect.R2
        @c
        @d
        Object k() {
            return super.k();
        }

        @Override  // com.google.common.collect.a3
        O2 z() {
            return this.i;
        }
    }

    @Override  // com.google.common.collect.a3
    @c
    boolean A() {
        return this.K().o();
    }

    abstract Q2 K();

    @Override  // com.google.common.collect.K2
    public boolean contains(@o3.a Object object0) {
        if(object0 instanceof Map.Entry) {
            Object object1 = this.K().get(((Map.Entry)object0).getKey());
            return object1 != null && object1.equals(((Map.Entry)object0).getValue());
        }
        return false;
    }

    @Override  // com.google.common.collect.K2
    boolean h() {
        return this.K().q();
    }

    @Override  // com.google.common.collect.a3
    public int hashCode() {
        return this.K().hashCode();
    }

    @c
    @d
    private void j(ObjectInputStream objectInputStream0) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override  // com.google.common.collect.a3
    @c
    @d
    Object k() {
        return new a(this.K());
    }

    @Override
    public int size() {
        return this.K().size();
    }
}

