package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ViewGroupUtils {
    @RequiresApi(29)
    static class Api29Impl {
        @DoNotInline
        static int a(ViewGroup viewGroup0, int v) {
            return viewGroup0.getChildDrawingOrder(v);
        }

        @DoNotInline
        static void b(ViewGroup viewGroup0, boolean z) {
            viewGroup0.suppressLayout(z);
        }
    }

    private static boolean a = true;
    private static Method b;
    private static boolean c;

    static {
    }

    static int a(@NonNull ViewGroup viewGroup0, int v) {
        if(Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.a(viewGroup0, v);
        }
        if(!ViewGroupUtils.c) {
            try {
                Method method0 = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", Integer.TYPE, Integer.TYPE);
                ViewGroupUtils.b = method0;
                method0.setAccessible(true);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            ViewGroupUtils.c = true;
        }
        Method method1 = ViewGroupUtils.b;
        if(method1 != null) {
            try {
                return (int)(((Integer)method1.invoke(viewGroup0, viewGroup0.getChildCount(), v)));
            }
            catch(IllegalAccessException | InvocationTargetException unused_ex) {
            }
        }
        return v;
    }

    @SuppressLint({"NewApi"})
    private static void b(@NonNull ViewGroup viewGroup0, boolean z) {
        if(ViewGroupUtils.a) {
            try {
                Api29Impl.b(viewGroup0, z);
            }
            catch(NoSuchMethodError unused_ex) {
                ViewGroupUtils.a = false;
            }
        }
    }

    static void c(@NonNull ViewGroup viewGroup0, boolean z) {
        if(Build.VERSION.SDK_INT >= 29) {
            Api29Impl.b(viewGroup0, z);
            return;
        }
        ViewGroupUtils.b(viewGroup0, z);
    }
}

