package S;

import com.google.android.gms.ads.nativead.NativeAd;
import kotlin.jvm.internal.L;
import y4.l;

public final class c extends a {
    @l
    private NativeAd a;

    public c(@l NativeAd nativeAd0) {
        L.p(nativeAd0, "ad");
        super();
        this.a = nativeAd0;
    }

    @Override  // S.b
    public Object b() {
        return this.c();
    }

    @l
    public NativeAd c() {
        return this.a;
    }

    @Override  // S.b
    public void destroy() {
        this.a.destroy();
    }
}

