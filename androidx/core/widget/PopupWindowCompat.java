package androidx.core.widget;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class PopupWindowCompat {
    @RequiresApi(23)
    static class Api23Impl {
        static boolean a(PopupWindow popupWindow0) {
            return popupWindow0.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow0) {
            return popupWindow0.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow0, boolean z) {
            popupWindow0.setOverlapAnchor(z);
        }

        static void d(PopupWindow popupWindow0, int v) {
            popupWindow0.setWindowLayoutType(v);
        }
    }

    private static final String a = "PopupWindowCompatApi21";
    private static Method b;
    private static boolean c;
    private static Method d;
    private static boolean e;
    private static Field f;
    private static boolean g;

    public static boolean a(PopupWindow popupWindow0) {
        if(Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.a(popupWindow0);
        }
        if(!PopupWindowCompat.g) {
            try {
                Field field0 = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                PopupWindowCompat.f = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", noSuchFieldException0);
            }
            PopupWindowCompat.g = true;
        }
        Field field1 = PopupWindowCompat.f;
        if(field1 != null) {
            try {
                return ((Boolean)field1.get(popupWindow0)).booleanValue();
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.i("PopupWindowCompatApi21", "Could not get overlap anchor field in PopupWindow", illegalAccessException0);
            }
        }
        return false;
    }

    public static int b(PopupWindow popupWindow0) {
        if(Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.b(popupWindow0);
        }
        if(!PopupWindowCompat.e) {
            try {
                Method method0 = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", null);
                PopupWindowCompat.d = method0;
                method0.setAccessible(true);
            }
            catch(Exception unused_ex) {
            }
            PopupWindowCompat.e = true;
        }
        Method method1 = PopupWindowCompat.d;
        if(method1 != null) {
            try {
                return (int)(((Integer)method1.invoke(popupWindow0, null)));
            }
            catch(Exception unused_ex) {
            }
        }
        return 0;
    }

    public static void c(PopupWindow popupWindow0, boolean z) {
        if(Build.VERSION.SDK_INT >= 23) {
            Api23Impl.c(popupWindow0, z);
            return;
        }
        if(!PopupWindowCompat.g) {
            try {
                Field field0 = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                PopupWindowCompat.f = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", noSuchFieldException0);
            }
            PopupWindowCompat.g = true;
        }
        Field field1 = PopupWindowCompat.f;
        if(field1 != null) {
            try {
                field1.set(popupWindow0, Boolean.valueOf(z));
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", illegalAccessException0);
            }
        }
    }

    public static void d(PopupWindow popupWindow0, int v) {
        if(Build.VERSION.SDK_INT >= 23) {
            Api23Impl.d(popupWindow0, v);
            return;
        }
        if(!PopupWindowCompat.c) {
            try {
                Method method0 = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                PopupWindowCompat.b = method0;
                method0.setAccessible(true);
            }
            catch(Exception unused_ex) {
            }
            PopupWindowCompat.c = true;
        }
        Method method1 = PopupWindowCompat.b;
        if(method1 != null) {
            try {
                method1.invoke(popupWindow0, v);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    @ReplaceWith(expression = "popup.showAsDropDown(anchor, xoff, yoff, gravity)")
    @Deprecated
    public static void e(PopupWindow popupWindow0, View view0, int v, int v1, int v2) {
        popupWindow0.showAsDropDown(view0, v, v1, v2);
    }
}

