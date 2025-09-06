package androidx.compose.ui.graphics;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nCanvasUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,101:1\n26#2:102\n26#2:103\n*S KotlinDebug\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n*L\n54#1:102\n59#1:103\n*E\n"})
public final class CanvasUtils {
    @l
    public static final CanvasUtils a;
    @m
    private static Method b;
    @m
    private static Method c;
    private static boolean d;

    static {
        CanvasUtils.a = new CanvasUtils();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void a(@l Canvas canvas0, boolean z) {
        L.p(canvas0, "canvas");
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            CanvasZHelper.a.a(canvas0, z);
            return;
        }
        if(!CanvasUtils.d) {
            try {
                Class class0 = Canvas.class;
                if(v == 28) {
                    Class class1 = new Class[0].getClass();
                    Method method0 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, class1);
                    CanvasUtils.b = (Method)method0.invoke(class0, "insertReorderBarrier");
                    CanvasUtils.c = (Method)method0.invoke(class0, "insertInorderBarrier");
                }
                else {
                    CanvasUtils.b = class0.getDeclaredMethod("insertReorderBarrier", null);
                    CanvasUtils.c = class0.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method1 = CanvasUtils.b;
                if(method1 != null) {
                    method1.setAccessible(true);
                }
                Method method2 = CanvasUtils.c;
                if(method2 != null) {
                    method2.setAccessible(true);
                }
            }
            catch(IllegalAccessException | InvocationTargetException | NoSuchMethodException unused_ex) {
            }
            CanvasUtils.d = true;
        }
        try {
            if(z) {
                Method method3 = CanvasUtils.b;
                if(method3 != null) {
                    L.m(method3);
                    method3.invoke(canvas0, null);
                }
            }
            if(!z) {
                Method method4 = CanvasUtils.c;
                if(method4 != null) {
                    L.m(method4);
                    method4.invoke(canvas0, null);
                }
            }
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
        }
    }
}

