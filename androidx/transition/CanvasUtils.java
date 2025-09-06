package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CanvasUtils {
    @RequiresApi(29)
    static class Api29Impl {
        @DoNotInline
        static void a(Canvas canvas0) {
            canvas0.disableZ();
        }

        @DoNotInline
        static void b(Canvas canvas0) {
            canvas0.enableZ();
        }
    }

    private static Method a;
    private static Method b;
    private static boolean c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    static void a(@NonNull Canvas canvas0, boolean z) {
        Class class0 = Canvas.class;
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            if(z) {
                Api29Impl.b(canvas0);
                return;
            }
            Api29Impl.a(canvas0);
            return;
        }
        if(v == 28) {
            throw new IllegalStateException("This method doesn\'t work on Pie!");
        }
        if(!CanvasUtils.c) {
            try {
                Method method0 = class0.getDeclaredMethod("insertReorderBarrier", null);
                CanvasUtils.a = method0;
                method0.setAccessible(true);
                Method method1 = class0.getDeclaredMethod("insertInorderBarrier", null);
                CanvasUtils.b = method1;
                method1.setAccessible(true);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            CanvasUtils.c = true;
        }
        try {
            if(z) {
                Method method2 = CanvasUtils.a;
                if(method2 != null) {
                    method2.invoke(canvas0, null);
                }
            }
            if(!z) {
                Method method3 = CanvasUtils.b;
                if(method3 != null) {
                    method3.invoke(canvas0, null);
                    return;
                }
            }
            return;
        }
        catch(IllegalAccessException unused_ex) {
            return;
        }
        catch(InvocationTargetException invocationTargetException0) {
        }
        throw new RuntimeException(invocationTargetException0.getCause());
    }
}

