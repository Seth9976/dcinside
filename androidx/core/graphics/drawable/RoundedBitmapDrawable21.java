package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class RoundedBitmapDrawable21 extends RoundedBitmapDrawable {
    protected RoundedBitmapDrawable21(Resources resources0, Bitmap bitmap0) {
        super(resources0, bitmap0);
    }

    @Override  // androidx.core.graphics.drawable.RoundedBitmapDrawable
    void f(int v, int v1, int v2, Rect rect0, Rect rect1) {
        Gravity.apply(v, v1, v2, rect0, rect1, 0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void getOutline(Outline outline0) {
        this.t();
        outline0.setRoundRect(this.h, this.c());
    }

    @Override  // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public boolean h() {
        return this.a != null && this.a.hasMipMap();
    }

    @Override  // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public void o(boolean z) {
        Bitmap bitmap0 = this.a;
        if(bitmap0 != null) {
            bitmap0.setHasMipMap(z);
            this.invalidateSelf();
        }
    }
}

