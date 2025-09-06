package W0;

import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class i implements e {
    @l
    private final e a;
    @l
    private final e b;
    @m
    private final Map c;

    public i(@l e e0, @l e e1, @m Map map0) {
        L.p(e0, "lowResSource");
        L.p(e1, "highResSource");
        super();
        this.a = e0;
        this.b = e1;
        this.c = map0;
    }

    public i(e e0, e e1, Map map0, int v, w w0) {
        if((v & 4) != 0) {
            map0 = null;
        }
        this(e0, e1, map0);
    }

    @l
    public final e b() {
        return this.a;
    }

    @m
    public final String d(@l String s) {
        L.p(s, "key");
        Object object0 = this.i(s);
        return object0 instanceof String ? ((String)object0) : null;
    }

    @l
    public final e e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(i.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.facebook.fresco.vito.source.IncreasingQualityImageSource");
        return L.g(this.a, ((i)object0).a) && L.g(this.b, ((i)object0).b) && L.g(this.c, ((i)object0).c);
    }

    @m
    public final Map f() {
        return this.c;
    }

    @l
    public final i g(@l e e0, @l e e1, @m Map map0) {
        L.p(e0, "lowResSource");
        L.p(e1, "highResSource");
        return new i(e0, e1, map0);
    }

    @m
    public final Map getExtras() {
        return this.c;
    }

    public static i h(i i0, e e0, e e1, Map map0, int v, Object object0) {
        if((v & 1) != 0) {
            e0 = i0.a;
        }
        if((v & 2) != 0) {
            e1 = i0.b;
        }
        if((v & 4) != 0) {
            map0 = i0.c;
        }
        return i0.g(e0, e1, map0);
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        return this.c == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.c.hashCode();
    }

    @m
    public final Object i(@l String s) {
        L.p(s, "key");
        return this.c == null ? null : this.c.get(s);
    }

    @l
    public final e j() {
        return this.b;
    }

    @l
    public final e k() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "IncreasingQualityImageSource(lowResSource=" + this.a + ", highResSource=" + this.b + ", extras=" + this.c + ")";
    }
}

