package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;

@SuppressLint({"LogConditional"})
public class Debug {
    public static void a(ViewGroup.LayoutParams viewGroup$LayoutParams0, String s) {
        StackTraceElement stackTraceElement0 = new Throwable().getStackTrace()[1];
        String s1 = ".(" + stackTraceElement0.getFileName() + ":" + stackTraceElement0.getLineNumber() + ") " + s + "  ";
        System.out.println(" >>>>>>>>>>>>>>>>>>. dump " + s1 + "  " + viewGroup$LayoutParams0.getClass().getName());
        Field[] arr_field = viewGroup$LayoutParams0.getClass().getFields();
        for(int v = 0; v < arr_field.length; ++v) {
            Field field0 = arr_field[v];
            try {
                Object object0 = field0.get(viewGroup$LayoutParams0);
                String s2 = field0.getName();
                if(s2.contains("To") && !object0.toString().equals("-1")) {
                    System.out.println(s1 + "       " + s2 + " " + object0);
                }
            }
            catch(IllegalAccessException unused_ex) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + s1);
    }

    public static void b(ViewGroup viewGroup0, String s) {
        StackTraceElement stackTraceElement0 = new Throwable().getStackTrace()[1];
        String s1 = ".(" + stackTraceElement0.getFileName() + ":" + stackTraceElement0.getLineNumber() + ") " + s + "  ";
        int v = viewGroup0.getChildCount();
        System.out.println(s + " children " + v);
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            System.out.println(s1 + "     " + Debug.k(view0));
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            Field[] arr_field = viewGroup$LayoutParams0.getClass().getFields();
            for(int v2 = 0; v2 < arr_field.length; ++v2) {
                Field field0 = arr_field[v2];
                try {
                    Object object0 = field0.get(viewGroup$LayoutParams0);
                    if(field0.getName().contains("To") && !object0.toString().equals("-1")) {
                        System.out.println(s1 + "       " + field0.getName() + " " + object0);
                    }
                }
                catch(IllegalAccessException unused_ex) {
                }
            }
        }
    }

    public static void c(Object object0) {
        StackTraceElement stackTraceElement0 = new Throwable().getStackTrace()[1];
        String s = ".(" + stackTraceElement0.getFileName() + ":" + stackTraceElement0.getLineNumber() + ")";
        Class class0 = object0.getClass();
        System.out.println(s + "------------- " + class0.getName() + " --------------------");
        Field[] arr_field = class0.getFields();
        for(int v = 0; v < arr_field.length; ++v) {
            Field field0 = arr_field[v];
            try {
                Object object1 = field0.get(object0);
                if(field0.getName().startsWith("layout_constraint") && (!(object1 instanceof Integer) || !object1.toString().equals("-1")) && (!(object1 instanceof Integer) || !object1.toString().equals("0")) && (!(object1 instanceof Float) || !object1.toString().equals("1.0")) && (!(object1 instanceof Float) || !object1.toString().equals("0.5"))) {
                    System.out.println(s + "    " + field0.getName() + " " + object1);
                }
            }
            catch(IllegalAccessException unused_ex) {
            }
        }
        System.out.println(s + "------------- " + class0.getSimpleName() + " --------------------");
    }

    public static String d(MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        Field[] arr_field = MotionEvent.class.getFields();
        for(int v1 = 0; v1 < arr_field.length; ++v1) {
            Field field0 = arr_field[v1];
            try {
                if(Modifier.isStatic(field0.getModifiers()) && field0.getType().equals(Integer.TYPE) && field0.getInt(null) == v) {
                    return field0.getName();
                }
            }
            catch(IllegalAccessException unused_ex) {
            }
        }
        return "---";
    }

    public static String e(int v) {
        StackTraceElement stackTraceElement0 = new Throwable().getStackTrace()[v + 2];
        return ".(" + stackTraceElement0.getFileName() + ":" + stackTraceElement0.getLineNumber() + ")";
    }

    public static String f() [...] // 潜在的解密器

    public static String g() [...] // 潜在的解密器

    public static String h() {
        StackTraceElement stackTraceElement0 = new Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement0.getFileName() + ":" + stackTraceElement0.getLineNumber() + ")";
    }

    public static String i(Context context0, int v) {
        if(v != -1) {
            try {
                return context0.getResources().getResourceEntryName(v);
            }
            catch(Exception unused_ex) {
                return "?" + v;
            }
        }
        return "UNKNOWN";
    }

    public static String j(Context context0, int[] arr_v) {
        String s1;
        try {
            String s = arr_v.length + "[";
            for(int v = 0; true; ++v) {
                if(v >= arr_v.length) {
                    return s + "]";
                }
                try {
                    s1 = context0.getResources().getResourceEntryName(arr_v[v]);
                }
                catch(Resources.NotFoundException unused_ex) {
                    s1 = "? " + arr_v[v] + " ";
                }
                s = s + (v == 0 ? "" : " ") + s1;
            }
        }
        catch(Exception exception0) {
        }
        Log.v("DEBUG", exception0.toString());
        return "UNKNOWN";
    }

    public static String k(View view0) {
        try {
            return view0.getContext().getResources().getResourceEntryName(view0.getId());
        }
        catch(Exception unused_ex) {
            return "UNKNOWN";
        }
    }

    public static String l(MotionLayout motionLayout0, int v) {
        return Debug.m(motionLayout0, v, -1);
    }

    public static String m(MotionLayout motionLayout0, int v, int v1) {
        if(v == -1) {
            return "UNDEFINED";
        }
        String s = motionLayout0.getContext().getResources().getResourceEntryName(v);
        if(v1 != -1) {
            if(s.length() > v1) {
                s = s.replaceAll("([^_])[aeiou]+", "$1");
            }
            if(s.length() > v1) {
                int v2 = s.replaceAll("[^_]", "").length();
                return v2 <= 0 ? s : s.replaceAll(CharBuffer.allocate((s.length() - v1) / v2).toString().replace('\u0000', '.') + "_", "_");
            }
        }
        return s;
    }

    public static void n(String s, String s1, int v) {
        StackTraceElement[] arr_stackTraceElement = new Throwable().getStackTrace();
        int v2 = Math.min(v, arr_stackTraceElement.length - 1);
        String s2 = " ";
        for(int v1 = 1; v1 <= v2; ++v1) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v1];
            s2 = s2 + " ";
            Log.v(s, s1 + s2 + (".(" + arr_stackTraceElement[v1].getFileName() + ":" + arr_stackTraceElement[v1].getLineNumber() + ") " + arr_stackTraceElement[v1].getMethodName()) + s2);
        }
    }

    public static void o(String s, int v) {
        StackTraceElement[] arr_stackTraceElement = new Throwable().getStackTrace();
        int v2 = Math.min(v, arr_stackTraceElement.length - 1);
        String s1 = " ";
        for(int v1 = 1; v1 <= v2; ++v1) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v1];
            s1 = s1 + " ";
            System.out.println(s + s1 + (".(" + arr_stackTraceElement[v1].getFileName() + ":" + arr_stackTraceElement[v1].getLineNumber() + ") ") + s1);
        }
    }
}

