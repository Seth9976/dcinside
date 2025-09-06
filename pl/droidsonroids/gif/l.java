package pl.droidsonroids.gif;

import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RawRes;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

final class l {
    static class a extends b {
        final int c;
        final int d;

        a() {
            this.c = 0;
            this.d = 0;
        }

        a(ImageView imageView0, AttributeSet attributeSet0, int v, int v1) {
            super(imageView0, attributeSet0, v, v1);
            this.c = a.a(imageView0, attributeSet0, true);
            this.d = a.a(imageView0, attributeSet0, false);
        }

        private static int a(ImageView imageView0, AttributeSet attributeSet0, boolean z) {
            int v = attributeSet0.getAttributeResourceValue("http://schemas.android.com/apk/res/android", (z ? "src" : "background"), 0);
            if(v > 0) {
                String s = imageView0.getResources().getResourceTypeName(v);
                return !l.b.contains(s) || l.e(imageView0, z, v) ? 0 : v;
            }
            return 0;
        }
    }

    static class b {
        boolean a;
        final int b;

        b() {
            this.a = false;
            this.b = -1;
        }

        b(View view0, AttributeSet attributeSet0, int v, int v1) {
            TypedArray typedArray0 = view0.getContext().obtainStyledAttributes(attributeSet0, styleable.GifView, v, v1);
            this.a = typedArray0.getBoolean(styleable.GifView_freezesAnimation, false);
            this.b = typedArray0.getInt(styleable.GifView_loopCount, -1);
            typedArray0.recycle();
        }
    }

    static final String a = "http://schemas.android.com/apk/res/android";
    static final List b;

    static {
        l.b = Arrays.asList(new String[]{"raw", "drawable", "mipmap"});
    }

    static void a(int v, Drawable drawable0) {
        if(drawable0 instanceof e) {
            ((e)drawable0).I(v);
        }
    }

    static float b(@NonNull Resources resources0, @DrawableRes @RawRes int v) {
        TypedValue typedValue0 = new TypedValue();
        resources0.getValue(v, typedValue0, true);
        int v1 = typedValue0.density;
        if(v1 == 0) {
            v1 = 0xA0;
        }
        else if(v1 == 0xFFFF) {
            v1 = 0;
        }
        int v2 = resources0.getDisplayMetrics().densityDpi;
        return v1 <= 0 || v2 <= 0 ? 1.0f : ((float)v2) / ((float)v1);
    }

    static a c(ImageView imageView0, AttributeSet attributeSet0, int v, int v1) {
        if(attributeSet0 != null && !imageView0.isInEditMode()) {
            a l$a0 = new a(imageView0, attributeSet0, v, v1);
            int v2 = l$a0.b;
            if(v2 >= 0) {
                l.a(v2, imageView0.getDrawable());
                l.a(v2, imageView0.getBackground());
            }
            return l$a0;
        }
        return new a();
    }

    static boolean d(ImageView imageView0, Uri uri0) {
        if(uri0 != null) {
            try {
                imageView0.setImageDrawable(new e(imageView0.getContext().getContentResolver(), uri0));
                return true;
            }
            catch(IOException unused_ex) {
            }
        }
        return false;
    }

    static boolean e(ImageView imageView0, boolean z, int v) {
        Resources resources0 = imageView0.getResources();
        if(resources0 != null) {
            try {
                String s = resources0.getResourceTypeName(v);
                if(!l.b.contains(s)) {
                    return false;
                }
                e e0 = new e(resources0, v);
                if(z) {
                    imageView0.setImageDrawable(e0);
                    return true;
                }
                imageView0.setBackground(e0);
                return true;
            }
            catch(IOException | Resources.NotFoundException unused_ex) {
            }
        }
        return false;
    }
}

