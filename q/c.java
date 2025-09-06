package Q;

import com.dcinside.app.ad.util.s;
import com.dcinside.app.model.Q;
import com.dcinside.app.type.m;
import com.dcinside.app.util.uk;
import com.google.android.gms.ads.AdRequest;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final String b(String s, Integer integer0, m m0) {
            String s1;
            if(integer0 == null) {
                if(m0 == null) {
                    m0 = m.g;
                }
                s1 = uk.VG(s, m0);
                L.m(s1);
                return s1;
            }
            int v = (int)integer0;
            if(m0 == null) {
                m0 = m.g;
            }
            s1 = uk.TG(s, v, m0);
            L.m(s1);
            return s1;
        }
    }

    @y4.m
    private final String a;
    @l
    public static final a b;

    static {
        c.b = new a(null);
    }

    public c(@l Q q0) {
        L.p(q0, "postInfo");
        this(q0.G0(), q0.c1(), q0.F0());
    }

    public c(@y4.m String s) {
        this.a = s;
    }

    public c(@l String s, int v, @y4.m m m0) {
        L.p(s, "galleryId");
        this(c.b.b(s, v, m0));
    }

    public c(@l String s, @y4.m m m0) {
        L.p(s, "galleryId");
        this(c.b.b(s, null, m0));
    }

    public c(boolean z) {
        this((z ? "https://m.dcinside.com" : null));
    }

    private final String a() {
        return this.a;
    }

    @l
    public final c b(@y4.m String s) {
        return new c(s);
    }

    public static c c(c c0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = c0.a;
        }
        return c0.b(s);
    }

    @l
    public final AdRequest d() {
        return this.a == null ? s.a() : s.b(this.a);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c ? L.g(this.a, ((c)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "AdHost(url=" + this.a + ")";
    }
}

