package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.h;
import kotlinx.serialization.i;
import y4.l;
import y4.m;

@h
public abstract class a implements i {
    private a() {
    }

    public a(w w0) {
    }

    protected abstract Object a();

    protected abstract int b(Object arg1);

    protected abstract void c(Object arg1, int arg2);

    @l
    protected abstract Iterator d(Object arg1);

    @Override  // kotlinx.serialization.d
    public Object deserialize(@l e e0) {
        L.p(e0, "decoder");
        return this.f(e0, null);
    }

    protected abstract int e(Object arg1);

    @h
    public final Object f(@l e e0, @m Object object0) {
        Object object1;
        L.p(e0, "decoder");
        if(object0 == null) {
            object1 = this.a();
        }
        else {
            object1 = this.k(object0);
            if(object1 == null) {
                object1 = this.a();
            }
        }
        int v = this.b(object1);
        c c0 = e0.b(this.getDescriptor());
        if(c0.k()) {
            this.g(c0, object1, v, this.j(c0, object1));
        }
        else {
            int v1;
            while((v1 = c0.w(this.getDescriptor())) != -1) {
                a.i(this, c0, v + v1, object1, false, 8, null);
            }
        }
        c0.c(this.getDescriptor());
        return this.l(object1);
    }

    protected abstract void g(@l c arg1, Object arg2, int arg3, int arg4);

    protected abstract void h(@l c arg1, int arg2, Object arg3, boolean arg4);

    public static void i(a a0, c c0, int v, Object object0, boolean z, int v1, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if((v1 & 8) != 0) {
            z = true;
        }
        a0.h(c0, v, object0, z);
    }

    private final int j(c c0, Object object0) {
        int v = c0.v(this.getDescriptor());
        this.c(object0, v);
        return v;
    }

    protected abstract Object k(Object arg1);

    protected abstract Object l(Object arg1);

    @Override  // kotlinx.serialization.w
    public abstract void serialize(@l g arg1, Object arg2);
}

