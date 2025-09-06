package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.L;
import y4.l;

public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {
    @l
    public static final WindowMetricsCalculatorCompat b;
    @l
    private static final String c;

    static {
        WindowMetricsCalculatorCompat.b = new WindowMetricsCalculatorCompat();
        L.o("WindowMetricsCalculatorCompat", "WindowMetricsCalculatorC…at::class.java.simpleName");
        WindowMetricsCalculatorCompat.c = "WindowMetricsCalculatorCompat";
    }

    @Override  // androidx.window.layout.WindowMetricsCalculator
    @l
    public WindowMetrics a(@l Activity activity0) {
        L.p(activity0, "activity");
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            return new WindowMetrics(ActivityCompatHelperApi30.a.a(activity0));
        }
        if(v >= 29) {
            return new WindowMetrics(this.f(activity0));
        }
        if(v >= 28) {
            return new WindowMetrics(this.e(activity0));
        }
        return v < 24 ? new WindowMetrics(this.c(activity0)) : new WindowMetrics(this.d(activity0));
    }

    @Override  // androidx.window.layout.WindowMetricsCalculator
    @l
    public WindowMetrics b(@l Activity activity0) {
        L.p(activity0, "activity");
        if(Build.VERSION.SDK_INT >= 30) {
            return new WindowMetrics(ActivityCompatHelperApi30.a.b(activity0));
        }
        Display display0 = activity0.getWindowManager().getDefaultDisplay();
        L.o(display0, "display");
        Point point0 = this.i(display0);
        return new WindowMetrics(new Rect(0, 0, point0.x, point0.y));
    }

    @RequiresApi(14)
    @l
    public final Rect c(@l Activity activity0) {
        L.p(activity0, "activity");
        Display display0 = activity0.getWindowManager().getDefaultDisplay();
        L.o(display0, "defaultDisplay");
        Point point0 = this.i(display0);
        Rect rect0 = new Rect();
        int v = point0.x;
        if(v != 0) {
            int v1 = point0.y;
            if(v1 != 0) {
                rect0.right = v;
                rect0.bottom = v1;
                return rect0;
            }
        }
        display0.getRectSize(rect0);
        return rect0;
    }

    @RequiresApi(24)
    @l
    public final Rect d(@l Activity activity0) {
        L.p(activity0, "activity");
        Rect rect0 = new Rect();
        Display display0 = activity0.getWindowManager().getDefaultDisplay();
        display0.getRectSize(rect0);
        if(!ActivityCompatHelperApi24.a.a(activity0)) {
            L.o(display0, "defaultDisplay");
            Point point0 = this.i(display0);
            int v = this.h(activity0);
            int v1 = rect0.bottom;
            if(v1 + v == point0.y) {
                rect0.bottom = v1 + v;
                return rect0;
            }
            int v2 = rect0.right;
            if(v2 + v == point0.x) {
                rect0.right = v2 + v;
            }
        }
        return rect0;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @RequiresApi(28)
    @l
    public final Rect e(@l Activity activity0) {
        L.p(activity0, "activity");
        Rect rect0 = new Rect();
        Configuration configuration0 = activity0.getResources().getConfiguration();
        try {
            Field field0 = Configuration.class.getDeclaredField("windowConfiguration");
            field0.setAccessible(true);
            Object object0 = field0.get(configuration0);
            if(ActivityCompatHelperApi24.a.a(activity0)) {
                Object object1 = object0.getClass().getDeclaredMethod("getBounds", null).invoke(object0, null);
                if(object1 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect0.set(((Rect)object1));
            }
            else {
                Object object2 = object0.getClass().getDeclaredMethod("getAppBounds", null).invoke(object0, null);
                if(object2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect0.set(((Rect)object2));
            }
            goto label_35;
        }
        catch(NoSuchFieldException noSuchFieldException0) {
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.w("WindowMetricsCalculatorCompat", noSuchMethodException0);
            this.j(activity0, rect0);
            goto label_35;
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.w("WindowMetricsCalculatorCompat", illegalAccessException0);
            this.j(activity0, rect0);
            goto label_35;
        }
        catch(InvocationTargetException invocationTargetException0) {
            goto label_33;
        }
        Log.w("WindowMetricsCalculatorCompat", noSuchFieldException0);
        this.j(activity0, rect0);
        goto label_35;
    label_33:
        Log.w("WindowMetricsCalculatorCompat", invocationTargetException0);
        this.j(activity0, rect0);
    label_35:
        Display display0 = activity0.getWindowManager().getDefaultDisplay();
        Point point0 = new Point();
        L.o(display0, "currentDisplay");
        DisplayCompatHelperApi17.a.a(display0, point0);
        ActivityCompatHelperApi24 activityCompatHelperApi240 = ActivityCompatHelperApi24.a;
        if(!activityCompatHelperApi240.a(activity0)) {
            int v = this.h(activity0);
            int v1 = rect0.bottom;
            if(v1 + v == point0.y) {
                rect0.bottom = v1 + v;
            }
            else {
                int v2 = rect0.right;
                if(v2 + v == point0.x) {
                    rect0.right = v2 + v;
                }
                else if(rect0.left == v) {
                    rect0.left = 0;
                }
            }
        }
        if((rect0.width() < point0.x || rect0.height() < point0.y) && !activityCompatHelperApi240.a(activity0)) {
            DisplayCutout displayCutout0 = this.g(display0);
            if(displayCutout0 != null) {
                DisplayCompatHelperApi28 displayCompatHelperApi280 = DisplayCompatHelperApi28.a;
                if(rect0.left == displayCompatHelperApi280.b(displayCutout0)) {
                    rect0.left = 0;
                }
                if(point0.x - rect0.right == displayCompatHelperApi280.c(displayCutout0)) {
                    rect0.right += displayCompatHelperApi280.c(displayCutout0);
                }
                if(rect0.top == displayCompatHelperApi280.d(displayCutout0)) {
                    rect0.top = 0;
                }
                if(point0.y - rect0.bottom == displayCompatHelperApi280.a(displayCutout0)) {
                    rect0.bottom += displayCompatHelperApi280.a(displayCutout0);
                }
            }
        }
        return rect0;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @RequiresApi(29)
    @l
    public final Rect f(@l Activity activity0) {
        L.p(activity0, "activity");
        Configuration configuration0 = activity0.getResources().getConfiguration();
        try {
            Field field0 = Configuration.class.getDeclaredField("windowConfiguration");
            field0.setAccessible(true);
            Object object0 = field0.get(configuration0);
            Object object1 = object0.getClass().getDeclaredMethod("getBounds", null).invoke(object0, null);
            if(object1 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
            }
            return new Rect(((Rect)object1));
        }
        catch(NoSuchFieldException noSuchFieldException0) {
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.w("WindowMetricsCalculatorCompat", noSuchMethodException0);
            return this.e(activity0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.w("WindowMetricsCalculatorCompat", illegalAccessException0);
            return this.e(activity0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.w("WindowMetricsCalculatorCompat", invocationTargetException0);
            return this.e(activity0);
        }
        Log.w("WindowMetricsCalculatorCompat", noSuchFieldException0);
        return this.e(activity0);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @RequiresApi(28)
    private final DisplayCutout g(Display display0) {
        try {
            Constructor constructor0 = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor0.setAccessible(true);
            Object object0 = constructor0.newInstance(null);
            Method method0 = display0.getClass().getDeclaredMethod("getDisplayInfo", object0.getClass());
            method0.setAccessible(true);
            method0.invoke(display0, object0);
            Field field0 = object0.getClass().getDeclaredField("displayCutout");
            field0.setAccessible(true);
            Object object1 = field0.get(object0);
            if(m.a(object1)) {
                return (DisplayCutout)object1;
            }
        }
        catch(ClassNotFoundException classNotFoundException0) {
            Log.w("WindowMetricsCalculatorCompat", classNotFoundException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.w("WindowMetricsCalculatorCompat", noSuchMethodException0);
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            Log.w("WindowMetricsCalculatorCompat", noSuchFieldException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.w("WindowMetricsCalculatorCompat", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.w("WindowMetricsCalculatorCompat", invocationTargetException0);
        }
        catch(InstantiationException instantiationException0) {
            Log.w("WindowMetricsCalculatorCompat", instantiationException0);
        }
        return null;
    }

    private final int h(Context context0) {
        Resources resources0 = context0.getResources();
        int v = resources0.getIdentifier("navigation_bar_height", "dimen", "android");
        return v <= 0 ? 0 : resources0.getDimensionPixelSize(v);
    }

    @RequiresApi(14)
    @VisibleForTesting
    @l
    public final Point i(@l Display display0) {
        L.p(display0, "display");
        Point point0 = new Point();
        DisplayCompatHelperApi17.a.a(display0, point0);
        return point0;
    }

    private final void j(Activity activity0, Rect rect0) {
        activity0.getWindowManager().getDefaultDisplay().getRectSize(rect0);
    }
}

