package W0;

import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.m;

public final class l implements k {
    @y4.l
    private final Uri a;
    @m
    private final Map b;
    @y4.l
    private final Uri c;

    public l(@y4.l Uri uri0, @m Map map0) {
        L.p(uri0, "uri");
        super();
        this.a = uri0;
        this.b = map0;
        this.c = this.c();
    }

    public l(Uri uri0, Map map0, int v, w w0) {
        if((v & 2) != 0) {
            map0 = null;
        }
        this(uri0, map0);
    }

    @Override  // W0.m
    @y4.l
    public Uri a() {
        return this.c;
    }

    @y4.l
    public final Uri b() {
        return this.a;
    }

    @Override  // W0.k
    @y4.l
    public Uri c() {
        return this.a;
    }

    @Override  // W0.k
    @m
    public String d(@y4.l String s) {
        L.p(s, "key");
        Object object0 = this.h(s);
        return object0 instanceof String ? ((String)object0) : null;
    }

    @m
    public final Map e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(l.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.facebook.fresco.vito.source.SingleImageSourceImpl");
        return L.g(this.a(), ((l)object0).a()) && L.g(this.getExtras(), ((l)object0).getExtras());
    }

    @y4.l
    public final l f(@y4.l Uri uri0, @m Map map0) {
        L.p(uri0, "uri");
        return new l(uri0, map0);
    }

    public static l g(l l0, Uri uri0, Map map0, int v, Object object0) {
        if((v & 1) != 0) {
            uri0 = l0.a;
        }
        if((v & 2) != 0) {
            map0 = l0.b;
        }
        return l0.f(uri0, map0);
    }

    @Override  // W0.m
    @m
    public Map getExtras() {
        return this.b;
    }

    @m
    public final Object h(@y4.l String s) {
        L.p(s, "key");
        Map map0 = this.getExtras();
        return map0 == null ? null : map0.get(s);
    }

    @Override
    public int hashCode() {
        int v = this.a().hashCode();
        Map map0 = this.getExtras();
        return map0 == null ? v * 0x1F : v * 0x1F + map0.hashCode();
    }

    @Override
    @y4.l
    public String toString() {
        return "SingleImageSourceImpl(uri=" + this.a + ", extras=" + this.b + ")";
    }
}

