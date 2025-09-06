package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets.Builder;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({Scope.c})
public class ViewUtils {
    @RequiresApi(29)
    static class Api29Impl {
        @DoNotInline
        static void a(@NonNull View view0, @NonNull Rect rect0, @NonNull Rect rect1) {
            Insets insets0 = view0.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect0)).build(), rect1).getSystemWindowInsets();
            rect0.set(insets0.left, insets0.top, insets0.right, insets0.bottom);
        }
    }

    private static final String a = "ViewUtils";
    private static boolean b;
    private static Method c;
    @ChecksSdkIntAtLeast(api = 27)
    @RestrictTo({Scope.a})
    static final boolean d;

    static {
        ViewUtils.d = Build.VERSION.SDK_INT >= 27;
    }

    public static void a(@NonNull View view0, @NonNull Rect rect0, @NonNull Rect rect1) {
        if(Build.VERSION.SDK_INT >= 29) {
            Api29Impl.a(view0, rect0, rect1);
            return;
        }
        if(!ViewUtils.b) {
            try {
                ViewUtils.b = true;
                Method method0 = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                ViewUtils.c = method0;
                if(!method0.isAccessible()) {
                    ViewUtils.c.setAccessible(true);
                }
            }
            catch(NoSuchMethodException unused_ex) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
        Method method1 = ViewUtils.c;
        if(method1 != null) {
            try {
                method1.invoke(view0, rect0, rect1);
            }
            catch(Exception exception0) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", exception0);
            }
        }
    }

    public static boolean b(View view0) {
        return view0.getLayoutDirection() == 1;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static void c(View view0) {
        try {
            Method method0 = view0.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if(!method0.isAccessible()) {
                method0.setAccessible(true);
            }
            method0.invoke(view0, null);
            return;
        }
        catch(NoSuchMethodException unused_ex) {
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", invocationTargetException0);
            return;
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", illegalAccessException0);
            return;
        }
        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
    }
}

