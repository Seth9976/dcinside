package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class h {
    static class a {
        final Object a;
        private List b;
        a c;
        a d;

        a() {
            this(null);
        }

        a(Object object0) {
            this.d = this;
            this.c = this;
            this.a = object0;
        }

        public void a(Object object0) {
            if(this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(object0);
        }

        @Nullable
        public Object b() {
            int v = this.c();
            return v <= 0 ? null : this.b.remove(v - 1);
        }

        public int c() {
            return this.b == null ? 0 : this.b.size();
        }
    }

    private final a a;
    private final Map b;

    h() {
        this.a = new a();
        this.b = new HashMap();
    }

    @Nullable
    public Object a(m m0) {
        a h$a0 = (a)this.b.get(m0);
        if(h$a0 == null) {
            h$a0 = new a(m0);
            this.b.put(m0, h$a0);
        }
        else {
            m0.a();
        }
        this.b(h$a0);
        return h$a0.b();
    }

    private void b(a h$a0) {
        h.e(h$a0);
        h$a0.d = this.a;
        h$a0.c = this.a.c;
        h.g(h$a0);
    }

    private void c(a h$a0) {
        h.e(h$a0);
        h$a0.d = this.a.d;
        h$a0.c = this.a;
        h.g(h$a0);
    }

    public void d(m m0, Object object0) {
        a h$a0 = (a)this.b.get(m0);
        if(h$a0 == null) {
            h$a0 = new a(m0);
            this.c(h$a0);
            this.b.put(m0, h$a0);
        }
        else {
            m0.a();
        }
        h$a0.a(object0);
    }

    private static void e(a h$a0) {
        h$a0.d.c = h$a0.c;
        h$a0.c.d = h$a0.d;
    }

    @Nullable
    public Object f() {
        for(a h$a0 = this.a.d; !h$a0.equals(this.a); h$a0 = h$a0.d) {
            Object object0 = h$a0.b();
            if(object0 != null) {
                return object0;
            }
            h.e(h$a0);
            this.b.remove(h$a0.a);
            ((m)h$a0.a).a();
        }
        return null;
    }

    private static void g(a h$a0) {
        h$a0.c.d = h$a0;
        h$a0.d.c = h$a0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("GroupedLinkedMap( ");
        a h$a0 = this.a.c;
        boolean z;
        for(z = false; !h$a0.equals(this.a); z = true) {
            stringBuilder0.append('{');
            stringBuilder0.append(h$a0.a);
            stringBuilder0.append(':');
            stringBuilder0.append(h$a0.c());
            stringBuilder0.append("}, ");
            h$a0 = h$a0.c;
        }
        if(z) {
            stringBuilder0.delete(stringBuilder0.length() - 2, stringBuilder0.length());
        }
        stringBuilder0.append(" )");
        return stringBuilder0.toString();
    }
}

