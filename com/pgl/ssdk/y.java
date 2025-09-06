package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager.DisplayListener;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Display;

public class y {
    private static volatile DisplayManager.DisplayListener a = null;
    private static volatile boolean b = false;
    private static String c;
    private static String d;
    private static String e;
    private static DisplayManager f;

    static {
    }

    private static String a(int v) {
        Display display0 = y.f.getDisplay(v);
        return display0 == null ? "pd" : y.a(display0);
    }

    public static String a(Context context0) {
        if(y.f == null) {
            y.f = (DisplayManager)context0.getSystemService("display");
        }
        DisplayManager displayManager0 = y.f;
        if(displayManager0 != null) {
            Display[] arr_display = displayManager0.getDisplays();
            if(arr_display != null) {
                StringBuffer stringBuffer0 = new StringBuffer();
                for(int v = 0; v < arr_display.length; ++v) {
                    Display display0 = arr_display[v];
                    if(display0 != null && display0.getDisplayId() != 0) {
                        stringBuffer0.append(y.a(arr_display[v]));
                        if(v != arr_display.length - 1) {
                            stringBuffer0.append(",");
                        }
                    }
                }
                return stringBuffer0.toString();
            }
        }
        return "";
    }

    private static String a(Display display0) {
        String s = display0.getName();
        Object object0 = t0.a(display0, display0.getClass(), "getType", new Class[0], new Object[0]);
        Object object1 = t0.a(display0, display0.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object object2 = t0.a(null, display0.getClass(), "TYPE_VIRTUAL", null);
        return object0 == null || object2 == null || ((int)(((Integer)object0))) != ((int)(((Integer)object2))) ? String.format("%s#%s#%b", object1, s, Boolean.FALSE) : String.format("%s#%s#%b", object1, s, Boolean.TRUE);
    }

    private static void b(int v, int v1) {
        if(v == 0) {
            return;
        }
        try {
            String s = y.a(v);
            switch(v1) {
                case 1: {
                    if(!s.equals(y.c)) {
                        y.c = s;
                        return;
                    }
                    break;
                }
                case 2: {
                    if(!s.equals(y.d)) {
                        y.d = s;
                        return;
                    }
                    break;
                }
                case 3: {
                    if(!s.equals(y.e)) {
                        y.e = s;
                        return;
                    }
                    break;
                }
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    // 去混淆评级： 低(20)
    public static boolean b(Context context0) {
        return y.c != null || y.d != null || y.e != null || context0 != null && !TextUtils.isEmpty(y.a(context0));
    }

    public static void c(Context context0) {
        static final class a implements DisplayManager.DisplayListener {
            @Override  // android.hardware.display.DisplayManager$DisplayListener
            public void onDisplayAdded(int v) {
                y.b(v, 1);
            }

            @Override  // android.hardware.display.DisplayManager$DisplayListener
            public void onDisplayChanged(int v) {
                y.b(v, 3);
            }

            @Override  // android.hardware.display.DisplayManager$DisplayListener
            public void onDisplayRemoved(int v) {
                y.b(v, 2);
            }
        }

        if(y.b) {
            return;
        }
        y.b = true;
        if(y.a == null) {
            y.a = new a();
        }
        if(y.f == null) {
            y.f = (DisplayManager)context0.getSystemService("display");
        }
        if(y.f != null) {
            Handler handler0 = p0.b();
            if(handler0 != null) {
                try {
                    y.f.registerDisplayListener(y.a, handler0);
                }
                catch(Exception unused_ex) {
                }
            }
        }
    }
}

