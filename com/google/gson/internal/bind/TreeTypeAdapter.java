package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.reflect.a;
import com.google.gson.stream.d;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Type;

public final class TreeTypeAdapter extends SerializationDelegatingTypeAdapter {
    static final class SingleTypeFactory implements y {
        private final a a;
        private final boolean b;
        private final Class c;
        private final r d;
        private final i e;

        SingleTypeFactory(Object object0, a a0, boolean z, Class class0) {
            i i0 = null;
            r r0 = object0 instanceof r ? ((r)object0) : null;
            this.d = r0;
            if(object0 instanceof i) {
                i0 = (i)object0;
            }
            this.e = i0;
            com.google.gson.internal.a.a(r0 != null || i0 != null);
            this.a = a0;
            this.b = z;
            this.c = class0;
        }

        @Override  // com.google.gson.y
        public TypeAdapter a(Gson gson0, a a0) {
            boolean z;
            a a1 = this.a;
            if(a1 == null) {
                z = this.c.isAssignableFrom(a0.f());
            }
            else if(!a1.equals(a0) && (!this.b || this.a.g() != a0.f())) {
                z = false;
            }
            else {
                z = true;
            }
            return z ? new TreeTypeAdapter(this.d, this.e, gson0, a0, this) : null;
        }
    }

    static class com.google.gson.internal.bind.TreeTypeAdapter.a {
    }

    final class b implements h, q {
        final TreeTypeAdapter a;

        private b() {
        }

        b(com.google.gson.internal.bind.TreeTypeAdapter.a treeTypeAdapter$a0) {
        }

        @Override  // com.google.gson.q
        public j a(Object object0, Type type0) {
            return TreeTypeAdapter.this.c.L(object0, type0);
        }

        @Override  // com.google.gson.h
        public Object b(j j0, Type type0) throws n {
            return TreeTypeAdapter.this.c.k(j0, type0);
        }

        @Override  // com.google.gson.q
        public j c(Object object0) {
            return TreeTypeAdapter.this.c.K(object0);
        }
    }

    private final r a;
    private final i b;
    final Gson c;
    private final a d;
    private final y e;
    private final b f;
    private final boolean g;
    private volatile TypeAdapter h;

    public TreeTypeAdapter(r r0, i i0, Gson gson0, a a0, y y0) {
        this(r0, i0, gson0, a0, y0, true);
    }

    public TreeTypeAdapter(r r0, i i0, Gson gson0, a a0, y y0, boolean z) {
        this.f = new b(this, null);
        this.a = r0;
        this.b = i0;
        this.c = gson0;
        this.d = a0;
        this.e = y0;
        this.g = z;
    }

    @Override  // com.google.gson.TypeAdapter
    public Object e(com.google.gson.stream.a a0) throws IOException {
        if(this.b == null) {
            return this.k().e(a0);
        }
        j j0 = com.google.gson.internal.n.a(a0);
        return this.b.a(j0, this.d.g(), this.f);
    }

    @Override  // com.google.gson.TypeAdapter
    public void i(d d0, Object object0) throws IOException {
        r r0 = this.a;
        if(r0 == null) {
            this.k().i(d0, object0);
            return;
        }
        if(this.g && object0 == null) {
            d0.v();
            return;
        }
        com.google.gson.internal.n.b(r0.a(object0, this.d.g(), this.f), d0);
    }

    @Override  // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter j() {
        return this.a != null ? this : this.k();
    }

    private TypeAdapter k() {
        TypeAdapter typeAdapter0 = this.h;
        if(typeAdapter0 == null) {
            typeAdapter0 = this.c.v(this.e, this.d);
            this.h = typeAdapter0;
        }
        return typeAdapter0;
    }

    public static y l(a a0, Object object0) {
        return new SingleTypeFactory(object0, a0, false, null);
    }

    public static y m(a a0, Object object0) {
        return a0.g() == a0.f() ? new SingleTypeFactory(object0, a0, true, null) : new SingleTypeFactory(object0, a0, false, null);
    }

    public static y n(Class class0, Object object0) {
        return new SingleTypeFactory(object0, null, false, class0);
    }
}

