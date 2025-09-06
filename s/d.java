package S;

import com.google.android.gms.ads.nativead.NativeAd;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

public final class d {
    @l
    public static final d a;

    static {
        d.a = new d();
    }

    @m
    @n
    public static final b a(@l Object object0) {
        L.p(object0, "ad");
        return object0 instanceof NativeAd ? new c(((NativeAd)object0)) : null;
    }
}

