package g1;

import android.graphics.Bitmap;
import com.facebook.cache.common.l;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class e extends com.facebook.imagepipeline.request.a {
    @h
    private com.facebook.cache.common.e c;

    @Override  // com.facebook.imagepipeline.request.a
    @h
    public com.facebook.cache.common.e a() {
        if(this.c == null) {
            this.c = new l("RoundedCornersPostprocessor");
        }
        return this.c;
    }

    @Override  // com.facebook.imagepipeline.request.a
    public void e(Bitmap bitmap0) {
        int v = Math.min(bitmap0.getHeight(), bitmap0.getWidth());
        NativeRoundingFilter.a(bitmap0, v / 2, v / 3, v / 4, v / 5);
    }
}

