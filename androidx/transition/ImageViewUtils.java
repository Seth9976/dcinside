package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

class ImageViewUtils {
    @RequiresApi(29)
    static class Api29Impl {
        @DoNotInline
        static void a(ImageView imageView0, Matrix matrix0) {
            imageView0.animateTransform(matrix0);
        }
    }

    private static boolean a = true;
    private static Field b;
    private static boolean c;

    static {
    }

    static void a(@NonNull ImageView imageView0, @Nullable Matrix matrix0) {
        if(Build.VERSION.SDK_INT >= 29) {
            Api29Impl.a(imageView0, matrix0);
            return;
        }
        if(matrix0 == null) {
            Drawable drawable0 = imageView0.getDrawable();
            if(drawable0 != null) {
                drawable0.setBounds(0, 0, imageView0.getWidth() - imageView0.getPaddingLeft() - imageView0.getPaddingRight(), imageView0.getHeight() - imageView0.getPaddingTop() - imageView0.getPaddingBottom());
                imageView0.invalidate();
            }
        }
        else {
            ImageViewUtils.c(imageView0, matrix0);
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    private static void b() {
        if(!ImageViewUtils.c) {
            try {
                Field field0 = ImageView.class.getDeclaredField("mDrawMatrix");
                ImageViewUtils.b = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException unused_ex) {
            }
            ImageViewUtils.c = true;
        }
    }

    @SuppressLint({"NewApi"})
    @RequiresApi(21)
    private static void c(@NonNull ImageView imageView0, @Nullable Matrix matrix0) {
        if(ImageViewUtils.a) {
            try {
                Api29Impl.a(imageView0, matrix0);
            }
            catch(NoSuchMethodError unused_ex) {
                ImageViewUtils.a = false;
            }
        }
    }
}

