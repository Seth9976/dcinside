package g1;

import android.graphics.Bitmap;
import com.facebook.cache.common.e;
import com.facebook.imagepipeline.request.a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.j;

public final class d extends a {
    private final boolean c;
    @l
    private final e d;

    @j
    public d() {
        this(false, 1, null);
    }

    @j
    public d(boolean z) {
        this.c = z;
        this.d = new com.facebook.cache.common.l("XferRoundFilter");
    }

    public d(boolean z, int v, w w0) {
        if((v & 1) != 0) {
            z = true;
        }
        this(z);
    }

    @Override  // com.facebook.imagepipeline.request.a
    @l
    public e a() {
        return this.d;
    }

    @Override  // com.facebook.imagepipeline.request.a
    public void f(@l Bitmap bitmap0, @l Bitmap bitmap1) {
        L.p(bitmap0, "destBitmap");
        L.p(bitmap1, "sourceBitmap");
        d1.d.a(bitmap0, bitmap1, this.c);
    }
}

