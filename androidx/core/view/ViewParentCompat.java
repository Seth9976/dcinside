package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;

public final class ViewParentCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static boolean a(ViewParent viewParent0, View view0, float f, float f1, boolean z) {
            return viewParent0.onNestedFling(view0, f, f1, z);
        }

        static boolean b(ViewParent viewParent0, View view0, float f, float f1) {
            return viewParent0.onNestedPreFling(view0, f, f1);
        }

        static void c(ViewParent viewParent0, View view0, int v, int v1, int[] arr_v) {
            viewParent0.onNestedPreScroll(view0, v, v1, arr_v);
        }

        static void d(ViewParent viewParent0, View view0, int v, int v1, int v2, int v3) {
            viewParent0.onNestedScroll(view0, v, v1, v2, v3);
        }

        static void e(ViewParent viewParent0, View view0, View view1, int v) {
            viewParent0.onNestedScrollAccepted(view0, view1, v);
        }

        static boolean f(ViewParent viewParent0, View view0, View view1, int v) {
            return viewParent0.onStartNestedScroll(view0, view1, v);
        }

        static void g(ViewParent viewParent0, View view0) {
            viewParent0.onStopNestedScroll(view0);
        }
    }

    private static final String a = "ViewParentCompat";
    private static int[] b;

    private static int[] a() {
        int[] arr_v = ViewParentCompat.b;
        if(arr_v == null) {
            ViewParentCompat.b = new int[2];
            return ViewParentCompat.b;
        }
        arr_v[0] = 0;
        arr_v[1] = 0;
        return ViewParentCompat.b;
    }

    @ReplaceWith(expression = "parent.notifySubtreeAccessibilityStateChanged(child, source, changeType)")
    @Deprecated
    public static void b(ViewParent viewParent0, View view0, View view1, int v) {
        viewParent0.notifySubtreeAccessibilityStateChanged(view0, view1, v);
    }

    public static boolean c(ViewParent viewParent0, View view0, float f, float f1, boolean z) {
        try {
            return Api21Impl.a(viewParent0, view0, f, f1, z);
        }
        catch(AbstractMethodError abstractMethodError0) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedFling", abstractMethodError0);
            return false;
        }
    }

    public static boolean d(ViewParent viewParent0, View view0, float f, float f1) {
        try {
            return Api21Impl.b(viewParent0, view0, f, f1);
        }
        catch(AbstractMethodError abstractMethodError0) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedPreFling", abstractMethodError0);
            return false;
        }
    }

    public static void e(ViewParent viewParent0, View view0, int v, int v1, int[] arr_v) {
        ViewParentCompat.f(viewParent0, view0, v, v1, arr_v, 0);
    }

    public static void f(ViewParent viewParent0, View view0, int v, int v1, int[] arr_v, int v2) {
        if(viewParent0 instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2)viewParent0).p(view0, v, v1, arr_v, v2);
            return;
        }
        if(v2 == 0) {
            try {
                Api21Impl.c(viewParent0, view0, v, v1, arr_v);
            }
            catch(AbstractMethodError abstractMethodError0) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedPreScroll", abstractMethodError0);
            }
        }
    }

    public static void g(ViewParent viewParent0, View view0, int v, int v1, int v2, int v3) {
        ViewParentCompat.i(viewParent0, view0, v, v1, v2, v3, 0, ViewParentCompat.a());
    }

    public static void h(ViewParent viewParent0, View view0, int v, int v1, int v2, int v3, int v4) {
        ViewParentCompat.i(viewParent0, view0, v, v1, v2, v3, v4, ViewParentCompat.a());
    }

    public static void i(ViewParent viewParent0, View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        if(viewParent0 instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3)viewParent0).s(view0, v, v1, v2, v3, v4, arr_v);
            return;
        }
        arr_v[0] += v2;
        arr_v[1] += v3;
        if(viewParent0 instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2)viewParent0).n(view0, v, v1, v2, v3, v4);
            return;
        }
        if(v4 == 0) {
            try {
                Api21Impl.d(viewParent0, view0, v, v1, v2, v3);
            }
            catch(AbstractMethodError abstractMethodError0) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedScroll", abstractMethodError0);
            }
        }
    }

    public static void j(ViewParent viewParent0, View view0, View view1, int v) {
        ViewParentCompat.k(viewParent0, view0, view1, v, 0);
    }

    public static void k(ViewParent viewParent0, View view0, View view1, int v, int v1) {
        if(viewParent0 instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2)viewParent0).a(view0, view1, v, v1);
            return;
        }
        if(v1 == 0) {
            try {
                Api21Impl.e(viewParent0, view0, view1, v);
            }
            catch(AbstractMethodError abstractMethodError0) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedScrollAccepted", abstractMethodError0);
            }
        }
    }

    public static boolean l(ViewParent viewParent0, View view0, View view1, int v) {
        return ViewParentCompat.m(viewParent0, view0, view1, v, 0);
    }

    public static boolean m(ViewParent viewParent0, View view0, View view1, int v, int v1) {
        if(viewParent0 instanceof NestedScrollingParent2) {
            return ((NestedScrollingParent2)viewParent0).u(view0, view1, v, v1);
        }
        if(v1 == 0) {
            try {
                return Api21Impl.f(viewParent0, view0, view1, v);
            }
            catch(AbstractMethodError abstractMethodError0) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onStartNestedScroll", abstractMethodError0);
            }
        }
        return false;
    }

    public static void n(ViewParent viewParent0, View view0) {
        ViewParentCompat.o(viewParent0, view0, 0);
    }

    public static void o(ViewParent viewParent0, View view0, int v) {
        if(viewParent0 instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2)viewParent0).l(view0, v);
            return;
        }
        if(v == 0) {
            try {
                Api21Impl.g(viewParent0, view0);
            }
            catch(AbstractMethodError abstractMethodError0) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onStopNestedScroll", abstractMethodError0);
            }
        }
    }

    @ReplaceWith(expression = "parent.requestSendAccessibilityEvent(child, event)")
    @Deprecated
    public static boolean p(ViewParent viewParent0, View view0, AccessibilityEvent accessibilityEvent0) {
        return viewParent0.requestSendAccessibilityEvent(view0, accessibilityEvent0);
    }
}

