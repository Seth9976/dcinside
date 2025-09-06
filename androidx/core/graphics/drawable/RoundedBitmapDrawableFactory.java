package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import androidx.core.graphics.BitmapCompat;
import androidx.core.view.GravityCompat;
import java.io.InputStream;

public final class RoundedBitmapDrawableFactory {
    static class DefaultRoundedBitmapDrawable extends RoundedBitmapDrawable {
        DefaultRoundedBitmapDrawable(Resources resources0, Bitmap bitmap0) {
            super(resources0, bitmap0);
        }

        @Override  // androidx.core.graphics.drawable.RoundedBitmapDrawable
        void f(int v, int v1, int v2, Rect rect0, Rect rect1) {
            GravityCompat.b(v, v1, v2, rect0, rect1, 0);
        }

        @Override  // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public boolean h() {
            return this.a != null && BitmapCompat.c(this.a);
        }

        @Override  // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public void o(boolean z) {
            Bitmap bitmap0 = this.a;
            if(bitmap0 != null) {
                BitmapCompat.d(bitmap0, z);
                this.invalidateSelf();
            }
        }
    }

    private static final String a = "RoundedBitmapDrawableFa";

    public static RoundedBitmapDrawable a(Resources resources0, Bitmap bitmap0) {
        return new RoundedBitmapDrawable21(resources0, bitmap0);
    }

    public static RoundedBitmapDrawable b(Resources resources0, InputStream inputStream0) {
        RoundedBitmapDrawable roundedBitmapDrawable0 = RoundedBitmapDrawableFactory.a(resources0, BitmapFactory.decodeStream(inputStream0));
        if(roundedBitmapDrawable0.b() == null) {
            Log.w("RoundedBitmapDrawableFa", "RoundedBitmapDrawable cannot decode " + inputStream0);
        }
        return roundedBitmapDrawable0;
    }

    public static RoundedBitmapDrawable c(Resources resources0, String s) {
        RoundedBitmapDrawable roundedBitmapDrawable0 = RoundedBitmapDrawableFactory.a(resources0, BitmapFactory.decodeFile(s));
        if(roundedBitmapDrawable0.b() == null) {
            Log.w("RoundedBitmapDrawableFa", "RoundedBitmapDrawable cannot decode " + s);
        }
        return roundedBitmapDrawable0;
    }
}

