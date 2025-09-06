package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.core.util.Supplier;
import j..util.Objects;
import java.lang.reflect.Method;

public final class ViewConfigurationCompat {
    @RequiresApi(26)
    static class Api26Impl {
        static float a(ViewConfiguration viewConfiguration0) {
            return viewConfiguration0.getScaledHorizontalScrollFactor();
        }

        static float b(ViewConfiguration viewConfiguration0) {
            return viewConfiguration0.getScaledVerticalScrollFactor();
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static int a(ViewConfiguration viewConfiguration0) {
            return viewConfiguration0.getScaledHoverSlop();
        }

        static boolean b(ViewConfiguration viewConfiguration0) {
            return viewConfiguration0.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    @RequiresApi(34)
    static class Api34Impl {
        static int a(ViewConfiguration viewConfiguration0, int v, int v1, int v2) {
            return viewConfiguration0.getScaledMaximumFlingVelocity(v, v1, v2);
        }

        static int b(ViewConfiguration viewConfiguration0, int v, int v1, int v2) {
            return viewConfiguration0.getScaledMinimumFlingVelocity(v, v1, v2);
        }
    }

    private static final String a = "ViewConfigCompat";
    private static final int b = 0x7FFFFFFF;
    private static final int c = 0x80000000;
    private static final int d = 0;
    private static final int e = -1;
    private static Method f;

    static {
        if(Build.VERSION.SDK_INT == 25) {
            try {
                ViewConfigurationCompat.f = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            }
            catch(Exception unused_ex) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    private static int a(Resources resources0, int v, Supplier supplier0, int v1) {
        switch(v) {
            case -1: {
                return (int)(((Integer)supplier0.get()));
            }
            case 0: {
                return v1;
            }
            default: {
                int v2 = resources0.getDimensionPixelSize(v);
                return v2 < 0 ? v1 : v2;
            }
        }
    }

    private static float b(ViewConfiguration viewConfiguration0, Context context0) {
        if(Build.VERSION.SDK_INT >= 25) {
            Method method0 = ViewConfigurationCompat.f;
            if(method0 != null) {
                try {
                    return (float)(((int)(((Integer)method0.invoke(viewConfiguration0, null)))));
                }
                catch(Exception unused_ex) {
                    Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
                }
            }
        }
        TypedValue typedValue0 = new TypedValue();
        return context0.getTheme().resolveAttribute(0x101004D, typedValue0, true) ? typedValue0.getDimension(context0.getResources().getDisplayMetrics()) : 0.0f;
    }

    private static int c(Resources resources0, String s, String s1) {
        return resources0.getIdentifier(s, s1, "android");
    }

    private static int d(Resources resources0, int v, int v1) {
        return v != 0x400000 || v1 != 26 ? -1 : ViewConfigurationCompat.c(resources0, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
    }

    private static int e(Resources resources0, int v, int v1) {
        return v != 0x400000 || v1 != 26 ? -1 : ViewConfigurationCompat.c(resources0, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
    }

    public static float f(ViewConfiguration viewConfiguration0, Context context0) {
        return Build.VERSION.SDK_INT < 26 ? ViewConfigurationCompat.b(viewConfiguration0, context0) : Api26Impl.a(viewConfiguration0);
    }

    public static int g(ViewConfiguration viewConfiguration0) {
        return Build.VERSION.SDK_INT < 28 ? viewConfiguration0.getScaledTouchSlop() / 2 : Api28Impl.a(viewConfiguration0);
    }

    public static int h(Context context0, ViewConfiguration viewConfiguration0, int v, int v1, int v2) {
        if(Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.a(viewConfiguration0, v, v1, v2);
        }
        if(!ViewConfigurationCompat.m(v, v1, v2)) {
            return 0x80000000;
        }
        Resources resources0 = context0.getResources();
        int v3 = ViewConfigurationCompat.d(resources0, v2, v1);
        Objects.requireNonNull(viewConfiguration0);
        return ViewConfigurationCompat.a(resources0, v3, new I(viewConfiguration0), 0x80000000);
    }

    public static int i(Context context0, ViewConfiguration viewConfiguration0, int v, int v1, int v2) {
        if(Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.b(viewConfiguration0, v, v1, v2);
        }
        if(!ViewConfigurationCompat.m(v, v1, v2)) {
            return 0x7FFFFFFF;
        }
        Resources resources0 = context0.getResources();
        int v3 = ViewConfigurationCompat.e(resources0, v2, v1);
        Objects.requireNonNull(viewConfiguration0);
        return ViewConfigurationCompat.a(resources0, v3, new J(viewConfiguration0), 0x7FFFFFFF);
    }

    @ReplaceWith(expression = "config.getScaledPagingTouchSlop()")
    @Deprecated
    public static int j(ViewConfiguration viewConfiguration0) {
        return viewConfiguration0.getScaledPagingTouchSlop();
    }

    public static float k(ViewConfiguration viewConfiguration0, Context context0) {
        return Build.VERSION.SDK_INT < 26 ? ViewConfigurationCompat.b(viewConfiguration0, context0) : Api26Impl.b(viewConfiguration0);
    }

    @ReplaceWith(expression = "config.hasPermanentMenuKey()")
    @Deprecated
    public static boolean l(ViewConfiguration viewConfiguration0) {
        return viewConfiguration0.hasPermanentMenuKey();
    }

    private static boolean m(int v, int v1, int v2) {
        InputDevice inputDevice0 = InputDevice.getDevice(v);
        return inputDevice0 != null && inputDevice0.getMotionRange(v1, v2) != null;
    }

    public static boolean n(ViewConfiguration viewConfiguration0, Context context0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.b(viewConfiguration0);
        }
        Resources resources0 = context0.getResources();
        int v = ViewConfigurationCompat.c(resources0, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return v != 0 && resources0.getBoolean(v);
    }
}

