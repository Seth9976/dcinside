package androidx.compose.ui.graphics;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidImageBitmap implements ImageBitmap {
    @l
    private final Bitmap b;

    public AndroidImageBitmap(@l Bitmap bitmap0) {
        L.p(bitmap0, "bitmap");
        super();
        this.b = bitmap0;
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public void a(@l int[] arr_v, int v, int v1, int v2, int v3, int v4, int v5) {
        boolean z;
        L.p(arr_v, "buffer");
        Bitmap bitmap0 = AndroidImageBitmap_androidKt.b(this);
        if(Build.VERSION.SDK_INT < 26 || bitmap0.getConfig() != Bitmap.Config.HARDWARE) {
            z = false;
        }
        else {
            bitmap0 = bitmap0.copy(Bitmap.Config.ARGB_8888, false);
            z = true;
        }
        bitmap0.getPixels(arr_v, v4, v5, v, v1, v2, v3);
        if(z) {
            bitmap0.recycle();
        }
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public void b() {
        this.b.prepareToDraw();
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public boolean c() {
        return this.b.hasAlpha();
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public int d() {
        Bitmap.Config bitmap$Config0 = this.b.getConfig();
        L.o(bitmap$Config0, "bitmap.config");
        return AndroidImageBitmap_androidKt.e(bitmap$Config0);
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    @l
    public ColorSpace e() {
        return Build.VERSION.SDK_INT >= 26 ? Api26Bitmap.a(this.b) : ColorSpaces.a.x();
    }

    @l
    public final Bitmap f() {
        return this.b;
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public int getWidth() {
        return this.b.getWidth();
    }
}

