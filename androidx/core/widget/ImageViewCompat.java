package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;

public class ImageViewCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static ColorStateList a(ImageView imageView0) {
            return imageView0.getImageTintList();
        }

        static PorterDuff.Mode b(ImageView imageView0) {
            return imageView0.getImageTintMode();
        }

        static void c(ImageView imageView0, ColorStateList colorStateList0) {
            imageView0.setImageTintList(colorStateList0);
        }

        static void d(ImageView imageView0, PorterDuff.Mode porterDuff$Mode0) {
            imageView0.setImageTintMode(porterDuff$Mode0);
        }
    }

    public static ColorStateList a(ImageView imageView0) {
        return Api21Impl.a(imageView0);
    }

    public static PorterDuff.Mode b(ImageView imageView0) {
        return Api21Impl.b(imageView0);
    }

    public static void c(ImageView imageView0, ColorStateList colorStateList0) {
        int v = Build.VERSION.SDK_INT;
        Api21Impl.c(imageView0, colorStateList0);
        if(v == 21) {
            Drawable drawable0 = imageView0.getDrawable();
            if(drawable0 != null && Api21Impl.a(imageView0) != null) {
                if(drawable0.isStateful()) {
                    drawable0.setState(imageView0.getDrawableState());
                }
                imageView0.setImageDrawable(drawable0);
            }
        }
    }

    public static void d(ImageView imageView0, PorterDuff.Mode porterDuff$Mode0) {
        int v = Build.VERSION.SDK_INT;
        Api21Impl.d(imageView0, porterDuff$Mode0);
        if(v == 21) {
            Drawable drawable0 = imageView0.getDrawable();
            if(drawable0 != null && Api21Impl.a(imageView0) != null) {
                if(drawable0.isStateful()) {
                    drawable0.setState(imageView0.getDrawableState());
                }
                imageView0.setImageDrawable(drawable0);
            }
        }
    }
}

