package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({Scope.c})
public class DrawableUtils {
    static class Api18Impl {
        private static final boolean a;
        private static final Method b;
        private static final Field c;
        private static final Field d;
        private static final Field e;
        private static final Field f;

        static {
            boolean z;
            Field field3;
            Field field1;
            Field field0;
            Method method0;
            Class class0;
            try {
                class0 = Insets.class;
                method0 = null;
                method0 = Drawable.class.getMethod("getOpticalInsets", null);
            }
            catch(NoSuchMethodException unused_ex) {
                field0 = null;
                field1 = null;
                goto label_20;
            }
            catch(ClassNotFoundException unused_ex) {
                field0 = null;
                field1 = null;
                goto label_20;
            }
            catch(NoSuchFieldException unused_ex) {
                field0 = null;
                field1 = null;
                goto label_20;
            }
            try {
                field0 = null;
                field0 = class0.getField("left");
                field1 = null;
                field1 = class0.getField("top");
                goto label_22;
            }
            catch(NoSuchMethodException | ClassNotFoundException unused_ex) {
                field1 = null;
                goto label_20;
            }
            catch(NoSuchFieldException unused_ex) {
            }
            field1 = null;
            goto label_20;
            try {
                field1 = null;
                field1 = class0.getField("top");
                goto label_22;
            }
            catch(NoSuchMethodException | ClassNotFoundException | NoSuchFieldException unused_ex) {
            }
        label_20:
            Field field2 = null;
            goto label_29;
            try {
            label_22:
                field2 = class0.getField("right");
            }
            catch(NoSuchMethodException | ClassNotFoundException | NoSuchFieldException unused_ex) {
                field2 = null;
                goto label_29;
            }
            try {
                field3 = class0.getField("bottom");
                z = true;
                goto label_31;
            }
            catch(NoSuchMethodException | ClassNotFoundException | NoSuchFieldException unused_ex) {
            }
        label_29:
            field3 = null;
            z = false;
        label_31:
            if(z) {
                Api18Impl.b = method0;
                Api18Impl.c = field0;
                Api18Impl.d = field1;
                Api18Impl.e = field2;
                Api18Impl.f = field3;
                Api18Impl.a = true;
                return;
            }
            Api18Impl.b = null;
            Api18Impl.c = null;
            Api18Impl.d = null;
            Api18Impl.e = null;
            Api18Impl.f = null;
            Api18Impl.a = false;
        }

        @NonNull
        static Rect a(@NonNull Drawable drawable0) {
            if(Build.VERSION.SDK_INT < 29 && Api18Impl.a) {
                try {
                    Object object0 = Api18Impl.b.invoke(drawable0, null);
                    return object0 == null ? DrawableUtils.c : new Rect(Api18Impl.c.getInt(object0), Api18Impl.d.getInt(object0), Api18Impl.e.getInt(object0), Api18Impl.f.getInt(object0));
                }
                catch(IllegalAccessException | InvocationTargetException unused_ex) {
                }
            }
            return DrawableUtils.c;
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        @DoNotInline
        static Insets a(Drawable drawable0) {
            return drawable0.getOpticalInsets();
        }
    }

    private static final int[] a;
    private static final int[] b;
    public static final Rect c;

    static {
        DrawableUtils.a = new int[]{0x10100A0};
        DrawableUtils.b = new int[0];
        DrawableUtils.c = new Rect();
    }

    @Deprecated
    public static boolean a(@NonNull Drawable drawable0) [...] // Inlined contents

    static void b(@NonNull Drawable drawable0) {
        String s = drawable0.getClass().getName();
        int v = Build.VERSION.SDK_INT;
        if(v == 21 && "android.graphics.drawable.VectorDrawable".equals(s)) {
            DrawableUtils.c(drawable0);
            return;
        }
        if(v >= 29 && v < 0x1F && "android.graphics.drawable.ColorStateListDrawable".equals(s)) {
            DrawableUtils.c(drawable0);
        }
    }

    private static void c(Drawable drawable0) {
        int[] arr_v = drawable0.getState();
        if(arr_v == null || arr_v.length == 0) {
            drawable0.setState(DrawableUtils.a);
        }
        else {
            drawable0.setState(DrawableUtils.b);
        }
        drawable0.setState(arr_v);
    }

    @NonNull
    public static Rect d(@NonNull Drawable drawable0) {
        if(Build.VERSION.SDK_INT >= 29) {
            Insets insets0 = Api29Impl.a(drawable0);
            return new Rect(insets0.left, insets0.top, insets0.right, insets0.bottom);
        }
        return Api18Impl.a(DrawableCompat.q(drawable0));
    }

    public static PorterDuff.Mode e(int v, PorterDuff.Mode porterDuff$Mode0) {
        switch(v) {
            case 3: {
                return PorterDuff.Mode.SRC_OVER;
            }
            case 5: {
                return PorterDuff.Mode.SRC_IN;
            }
            case 9: {
                return PorterDuff.Mode.SRC_ATOP;
            }
            case 14: {
                return PorterDuff.Mode.MULTIPLY;
            }
            case 15: {
                return PorterDuff.Mode.SCREEN;
            }
            case 16: {
                return PorterDuff.Mode.ADD;
            }
            default: {
                return porterDuff$Mode0;
            }
        }
    }
}

