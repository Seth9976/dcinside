package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(21)
class GhostViewPlatform implements GhostView {
    private final View a;
    private static final String b = "GhostViewApi21";
    private static Class c;
    private static boolean d;
    private static Method e;
    private static boolean f;
    private static Method g;
    private static boolean h;

    private GhostViewPlatform(@NonNull View view0) {
        this.a = view0;
    }

    @Override  // androidx.transition.GhostView
    public void a(ViewGroup viewGroup0, View view0) {
    }

    @SuppressLint({"BanUncheckedReflection"})
    static GhostView b(View view0, ViewGroup viewGroup0, Matrix matrix0) {
        GhostViewPlatform.c();
        Method method0 = GhostViewPlatform.e;
        if(method0 != null) {
            try {
                return new GhostViewPlatform(((View)method0.invoke(null, view0, viewGroup0, matrix0)));
            }
            catch(IllegalAccessException invocationTargetException0) {
            }
            catch(InvocationTargetException unused_ex) {
                return null;
            }
            throw new RuntimeException(invocationTargetException0.getCause());
        }
        return null;
    }

    private static void c() {
        if(!GhostViewPlatform.f) {
            try {
                GhostViewPlatform.d();
                Method method0 = GhostViewPlatform.c.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                GhostViewPlatform.e = method0;
                method0.setAccessible(true);
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", noSuchMethodException0);
            }
            GhostViewPlatform.f = true;
        }
    }

    private static void d() {
        if(!GhostViewPlatform.d) {
            try {
                GhostViewPlatform.c = Class.forName("android.view.GhostView");
            }
            catch(ClassNotFoundException classNotFoundException0) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", classNotFoundException0);
            }
            GhostViewPlatform.d = true;
        }
    }

    private static void e() {
        if(!GhostViewPlatform.h) {
            try {
                GhostViewPlatform.d();
                Method method0 = GhostViewPlatform.c.getDeclaredMethod("removeGhost", View.class);
                GhostViewPlatform.g = method0;
                method0.setAccessible(true);
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", noSuchMethodException0);
            }
            GhostViewPlatform.h = true;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    static void f(View view0) {
        GhostViewPlatform.e();
        Method method0 = GhostViewPlatform.g;
        if(method0 != null) {
            try {
                method0.invoke(null, view0);
                return;
            }
            catch(IllegalAccessException invocationTargetException0) {
            }
            catch(InvocationTargetException unused_ex) {
                return;
            }
            throw new RuntimeException(invocationTargetException0.getCause());
        }
    }

    @Override  // androidx.transition.GhostView
    public void setVisibility(int v) {
        this.a.setVisibility(v);
    }
}

