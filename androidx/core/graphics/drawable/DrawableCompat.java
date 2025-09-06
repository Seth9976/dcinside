package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class DrawableCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static void a(Drawable drawable0, Resources.Theme resources$Theme0) {
            drawable0.applyTheme(resources$Theme0);
        }

        static boolean b(Drawable drawable0) {
            return drawable0.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable0) {
            return drawable0.getColorFilter();
        }

        static void d(Drawable drawable0, Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
            drawable0.inflate(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        }

        static void e(Drawable drawable0, float f, float f1) {
            drawable0.setHotspot(f, f1);
        }

        static void f(Drawable drawable0, int v, int v1, int v2, int v3) {
            drawable0.setHotspotBounds(v, v1, v2, v3);
        }

        static void g(Drawable drawable0, int v) {
            drawable0.setTint(v);
        }

        static void h(Drawable drawable0, ColorStateList colorStateList0) {
            drawable0.setTintList(colorStateList0);
        }

        static void i(Drawable drawable0, PorterDuff.Mode porterDuff$Mode0) {
            drawable0.setTintMode(porterDuff$Mode0);
        }
    }

    @RequiresApi(23)
    static class Api23Impl {
        static int a(Drawable drawable0) {
            return drawable0.getLayoutDirection();
        }

        static boolean b(Drawable drawable0, int v) {
            return drawable0.setLayoutDirection(v);
        }
    }

    private static final String a = "DrawableCompat";
    private static Method b;
    private static boolean c;
    private static Method d;
    private static boolean e;

    public static void a(Drawable drawable0, Resources.Theme resources$Theme0) {
        Api21Impl.a(drawable0, resources$Theme0);
    }

    public static boolean b(Drawable drawable0) {
        return Api21Impl.b(drawable0);
    }

    public static void c(Drawable drawable0) {
        if(Build.VERSION.SDK_INT >= 23) {
            drawable0.clearColorFilter();
            return;
        }
        drawable0.clearColorFilter();
        if(drawable0 instanceof InsetDrawable) {
            DrawableCompat.c(((InsetDrawable)drawable0).getDrawable());
            return;
        }
        if(drawable0 instanceof WrappedDrawable) {
            DrawableCompat.c(((WrappedDrawable)drawable0).b());
            return;
        }
        if(drawable0 instanceof DrawableContainer) {
            DrawableContainer.DrawableContainerState drawableContainer$DrawableContainerState0 = (DrawableContainer.DrawableContainerState)((DrawableContainer)drawable0).getConstantState();
            if(drawableContainer$DrawableContainerState0 != null) {
                int v = drawableContainer$DrawableContainerState0.getChildCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    Drawable drawable1 = drawableContainer$DrawableContainerState0.getChild(v1);
                    if(drawable1 != null) {
                        DrawableCompat.c(drawable1);
                    }
                }
            }
        }
    }

    @ReplaceWith(expression = "drawable.getAlpha()")
    @Deprecated
    public static int d(Drawable drawable0) {
        return drawable0.getAlpha();
    }

    public static ColorFilter e(Drawable drawable0) {
        return Api21Impl.c(drawable0);
    }

    public static int f(Drawable drawable0) {
        if(Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.a(drawable0);
        }
        if(!DrawableCompat.e) {
            try {
                Method method0 = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                DrawableCompat.d = method0;
                method0.setAccessible(true);
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", noSuchMethodException0);
            }
            DrawableCompat.e = true;
        }
        Method method1 = DrawableCompat.d;
        if(method1 != null) {
            try {
                return (int)(((Integer)method1.invoke(drawable0, null)));
            }
            catch(Exception exception0) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", exception0);
                DrawableCompat.d = null;
            }
        }
        return 0;
    }

    public static void g(Drawable drawable0, Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        Api21Impl.d(drawable0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
    }

    @ReplaceWith(expression = "drawable.isAutoMirrored()")
    @Deprecated
    public static boolean h(Drawable drawable0) {
        return drawable0.isAutoMirrored();
    }

    @ReplaceWith(expression = "drawable.jumpToCurrentState()")
    @Deprecated
    public static void i(Drawable drawable0) {
        drawable0.jumpToCurrentState();
    }

    @ReplaceWith(expression = "drawable.setAutoMirrored(mirrored)")
    @Deprecated
    public static void j(Drawable drawable0, boolean z) {
        drawable0.setAutoMirrored(z);
    }

    public static void k(Drawable drawable0, float f, float f1) {
        Api21Impl.e(drawable0, f, f1);
    }

    public static void l(Drawable drawable0, int v, int v1, int v2, int v3) {
        Api21Impl.f(drawable0, v, v1, v2, v3);
    }

    public static boolean m(Drawable drawable0, int v) {
        if(Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.b(drawable0, v);
        }
        if(!DrawableCompat.c) {
            try {
                Method method0 = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                DrawableCompat.b = method0;
                method0.setAccessible(true);
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", noSuchMethodException0);
            }
            DrawableCompat.c = true;
        }
        Method method1 = DrawableCompat.b;
        if(method1 != null) {
            try {
                method1.invoke(drawable0, v);
                return true;
            }
            catch(Exception exception0) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", exception0);
                DrawableCompat.b = null;
            }
        }
        return false;
    }

    public static void n(Drawable drawable0, @ColorInt int v) {
        Api21Impl.g(drawable0, v);
    }

    public static void o(Drawable drawable0, ColorStateList colorStateList0) {
        Api21Impl.h(drawable0, colorStateList0);
    }

    public static void p(Drawable drawable0, PorterDuff.Mode porterDuff$Mode0) {
        Api21Impl.i(drawable0, porterDuff$Mode0);
    }

    // 去混淆评级： 低(20)
    public static Drawable q(Drawable drawable0) {
        return drawable0 instanceof WrappedDrawable ? ((WrappedDrawable)drawable0).b() : drawable0;
    }

    public static Drawable r(Drawable drawable0) {
        if(Build.VERSION.SDK_INT >= 23) {
            return drawable0;
        }
        return !(drawable0 instanceof TintAwareDrawable) ? new WrappedDrawableApi21(drawable0) : drawable0;
    }
}

