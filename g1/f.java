package g1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import androidx.annotation.ColorInt;
import androidx.core.graphics.ColorUtils;
import com.facebook.cache.common.e;
import com.facebook.imagepipeline.request.a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

public final class f extends a {
    @m
    private final PorterDuff.Mode c;
    @ColorInt
    private final int d;
    @l
    private final e e;

    public f(@ColorInt int v, @m Float float0, @m PorterDuff.Mode porterDuff$Mode0) {
        this.c = porterDuff$Mode0;
        if(float0 != null) {
            v = ColorUtils.D(v, s.I(((int)(((float)float0) * 255.0f)), 0, 0xFF));
        }
        this.d = v;
        this.e = new com.facebook.cache.common.l("Tint. tintColor=" + v + ", mode=" + porterDuff$Mode0);
    }

    public f(int v, Float float0, PorterDuff.Mode porterDuff$Mode0, int v1, w w0) {
        if((v1 & 2) != 0) {
            float0 = null;
        }
        if((v1 & 4) != 0) {
            porterDuff$Mode0 = null;
        }
        this(v, float0, porterDuff$Mode0);
    }

    @Override  // com.facebook.imagepipeline.request.a
    @l
    public e a() {
        return this.e;
    }

    @Override  // com.facebook.imagepipeline.request.a
    public void e(@l Bitmap bitmap0) {
        L.p(bitmap0, "sourceBitmap");
        if(this.c == null) {
            new Canvas(bitmap0).drawColor(this.d);
            return;
        }
        new Canvas(bitmap0).drawColor(this.d, this.c);
    }

    @Override  // com.facebook.imagepipeline.request.a
    @l
    public String getName() {
        return m0.d(f.class).toString();
    }
}

