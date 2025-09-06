package J0;

import android.net.Uri;
import com.facebook.cache.common.e;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.j;

public final class a implements e {
    public static final class J0.a.a {
        private J0.a.a() {
        }

        public J0.a.a(w w0) {
        }
    }

    private final boolean a;
    @l
    private final String b;
    @l
    public static final J0.a.a c = null;
    @l
    private static final String d = "anim://";

    static {
        a.c = new J0.a.a(null);
    }

    @j
    public a(int v) {
        this(v, false, 2, null);
    }

    @j
    public a(int v, boolean z) {
        this.a = z;
        this.b = "anim://" + v;
    }

    public a(int v, boolean z, int v1, w w0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        this(v, z);
    }

    @Override  // com.facebook.cache.common.e
    @l
    public String a() {
        return this.b;
    }

    @Override  // com.facebook.cache.common.e
    public boolean b() {
        return false;
    }

    @Override  // com.facebook.cache.common.e
    public boolean c(@l Uri uri0) {
        L.p(uri0, "uri");
        String s = uri0.toString();
        L.o(s, "toString(...)");
        return v.v2(s, this.b, false, 2, null);
    }

    @Override  // com.facebook.cache.common.e
    public boolean equals(@m Object object0) {
        if(!this.a) {
            return super.equals(object0);
        }
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return L.g(a.class, class0) ? L.g(this.b, ((a)object0).b) : false;
        }
        return false;
    }

    @Override  // com.facebook.cache.common.e
    public int hashCode() {
        return this.a ? this.b.hashCode() : super.hashCode();
    }
}

