package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.CompoundButton;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

public final class CompoundButtonCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static ColorStateList a(CompoundButton compoundButton0) {
            return compoundButton0.getButtonTintList();
        }

        static PorterDuff.Mode b(CompoundButton compoundButton0) {
            return compoundButton0.getButtonTintMode();
        }

        static void c(CompoundButton compoundButton0, ColorStateList colorStateList0) {
            compoundButton0.setButtonTintList(colorStateList0);
        }

        static void d(CompoundButton compoundButton0, PorterDuff.Mode porterDuff$Mode0) {
            compoundButton0.setButtonTintMode(porterDuff$Mode0);
        }
    }

    @RequiresApi(23)
    static class Api23Impl {
        static Drawable a(CompoundButton compoundButton0) {
            return compoundButton0.getButtonDrawable();
        }
    }

    private static final String a = "CompoundButtonCompat";
    private static Field b;
    private static boolean c;

    public static Drawable a(CompoundButton compoundButton0) {
        if(Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.a(compoundButton0);
        }
        if(!CompoundButtonCompat.c) {
            try {
                Field field0 = CompoundButton.class.getDeclaredField("mButtonDrawable");
                CompoundButtonCompat.b = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", noSuchFieldException0);
            }
            CompoundButtonCompat.c = true;
        }
        Field field1 = CompoundButtonCompat.b;
        if(field1 != null) {
            try {
                return (Drawable)field1.get(compoundButton0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", illegalAccessException0);
                CompoundButtonCompat.b = null;
            }
        }
        return null;
    }

    public static ColorStateList b(CompoundButton compoundButton0) {
        return Api21Impl.a(compoundButton0);
    }

    public static PorterDuff.Mode c(CompoundButton compoundButton0) {
        return Api21Impl.b(compoundButton0);
    }

    public static void d(CompoundButton compoundButton0, ColorStateList colorStateList0) {
        Api21Impl.c(compoundButton0, colorStateList0);
    }

    public static void e(CompoundButton compoundButton0, PorterDuff.Mode porterDuff$Mode0) {
        Api21Impl.d(compoundButton0, porterDuff$Mode0);
    }
}

