package androidx.compose.runtime;

import java.util.ArrayList;
import y4.l;

public final class Stack {
    @l
    private final ArrayList a;

    public Stack() {
        this.a = new ArrayList();
    }

    public final void a() {
        this.a.clear();
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    public final boolean d() {
        return !this.c();
    }

    public final Object e() {
        int v = this.b();
        return this.a.get(v - 1);
    }

    public final Object f(int v) {
        return this.a.get(v);
    }

    public final Object g() {
        int v = this.b();
        return this.a.remove(v - 1);
    }

    public final boolean h(Object object0) {
        return this.a.add(object0);
    }

    @l
    public final Object[] i() {
        int v = this.a.size();
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = this.a.get(v1);
        }
        return arr_object;
    }
}

