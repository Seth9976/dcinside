package com.fsn.cauly.blackdragoncore.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.fsn.cauly.Logger.LogLevel;
import com.fsn.cauly.Logger;
import com.fsn.cauly.Y.i0.a;
import com.fsn.cauly.Y.i0.c;
import com.fsn.cauly.Y.i0;
import java.util.HashMap;

public class d {
    public static boolean a;

    public static float a(Context context0, int v) {
        return context0 == null ? 0.0f : ((float)v) / context0.getResources().getDisplayMetrics().density;
    }

    public static int a(Context context0) {
        if(context0 == null) {
            return 0;
        }
        Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        display0.getMetrics(displayMetrics0);
        return displayMetrics0.heightPixels;
    }

    public static int a(Context context0, float f) {
        return context0 == null ? 0 : ((int)(f * context0.getResources().getDisplayMetrics().density));
    }

    public static int a(Window window0) {
        if(window0 == null) {
            return 0;
        }
        Rect rect0 = new Rect();
        window0.getDecorView().getWindowVisibleDisplayFrame(rect0);
        int v = rect0.top;
        return window0.findViewById(0x1020002).getTop() - v;
    }

    public static Point a(float f, float f1, Point point0) {
        Point point1 = new Point();
        if(f1 > 0.0f && f > 0.0f) {
            int v = (int)(((double)point0.y) * 0.15);
            float f2 = ((float)point0.x) / f;
            float f3 = (float)(((int)(f * f2)));
            float f4 = (float)(((int)(f1 * f2)));
            if(f4 < 50.0f) {
                f2 = 50.0f / f4;
                f3 = (float)(((int)(f3 * f2)));
                f4 = (float)(((int)(50.0f * f2)));
            }
            if(f4 > ((float)v)) {
                f2 = ((float)v) / f4;
                f3 = (float)(((int)(f3 * f2)));
                f4 = (float)(((int)(f4 * f2)));
            }
            point1.x = (int)f3;
            point1.y = (int)f4;
            Logger.writeLog(LogLevel.Info, "ADAPTIVE1 ratio:" + f2);
            return point1;
        }
        Logger.writeLog(LogLevel.Error, "Banner height or width should not be less than 0.");
        return point1;
    }

    public static Point a(Context context0, ViewGroup viewGroup0) {
        Point point0 = d.b(context0);
        viewGroup0.getLayoutParams();
        point0.y = viewGroup0.getLayoutParams().height;
        point0.x = viewGroup0.getLayoutParams().width;
        return point0;
    }

    public static Point a(Context context0, String s) {
        Point point0 = d.b(context0);
        String s1 = s.split("x")[0];
        String s2 = s.split("x")[1];
        point0.x = Integer.parseInt(s1);
        point0.y = Integer.parseInt(s2);
        return point0;
    }

    public static Point a(i0 i00, a i0$a0) {
        d.a = i00.r.D;
        HashMap hashMap0 = i00.C;
        String s = (String)hashMap0.get("bannerViewClass");
        Point point0 = d.b(i00.b);
        if(!TextUtils.isEmpty(((String)hashMap0.get("bannerViewClass")))) {
            if(i0$a0 == a.a) {
                c i0$c2 = i00.q;
                c i0$c3 = c.a;
                if(i0$c2 == i0$c3 || i0$c2 == c.c) {
                    int v3 = i00.V;
                    if(v3 < 1) {
                        point0.y = d.a(i00.b, 50.0f);
                        i00.H = "320x50";
                    }
                    else {
                        point0.y = d.a(i00.b, ((float)v3));
                    }
                    i00.q = i0$c3;
                }
                else if(i0$c2 != c.d) {
                    if(i0$c2 != c.b) {
                        if(i0$c2 == c.e) {
                            Point point4 = d.b(i00);
                            point0.x = point4.x;
                            point0.y = point4.y;
                        }
                        else {
                            point0.y = d.a(i00.b, 50.0f);
                            i00.H = "320x50";
                        }
                    }
                    else if(d.a) {
                        int v2 = i00.V;
                        if(v2 < 1) {
                            point0.y = point0.x >= point0.y ? point0.x / 10 : point0.y / 10;
                        }
                        else {
                            i00.q = i0$c3;
                            point0.y = d.a(i00.b, ((float)v2));
                        }
                    }
                    else {
                        Point point3 = d.b(i00);
                        point0.x = point3.x;
                        point0.y = point3.y;
                        i00.q = c.e;
                    }
                }
                else if(i00.V < 1) {
                    point0.x = d.a(i00.b, 320.0f);
                    point0.y = d.a(i00.b, 50.0f);
                    i00.H = "320x50";
                }
                else {
                    point0.x = d.a(i00.b, ((float)i00.U));
                    point0.y = d.a(i00.b, ((float)i00.V));
                }
            }
        }
        else if(i0$a0 == a.a) {
            c i0$c0 = i00.q;
            if(i0$c0 != c.b) {
                c i0$c1 = c.a;
                if(i0$c0 == i0$c1 || i0$c0 == c.c) {
                    int v1 = i00.V;
                    point0.y = v1 < 1 ? d.a(i00.b, 50.0f) : d.a(i00.b, ((float)v1));
                    i00.q = i0$c1;
                }
                else if(i0$c0 != c.d) {
                    if(i0$c0 == c.e) {
                        Point point2 = d.b(i00);
                        point0.x = point2.x;
                        point0.y = point2.y;
                    }
                    else {
                        point0.y = d.a(i00.b, 50.0f);
                    }
                }
                else if(i00.V < 1) {
                    point0.x = d.a(i00.b, 320.0f);
                    point0.y = d.a(i00.b, 50.0f);
                    i00.H = "320x50";
                }
                else {
                    point0.x = d.a(i00.b, ((float)i00.U));
                    point0.y = d.a(i00.b, ((float)i00.V));
                }
            }
            else if(d.a) {
                int v = i00.V;
                if(v < 1) {
                    point0.y = point0.x >= point0.y ? point0.x / 10 : point0.y / 10;
                }
                else {
                    i00.q = c.a;
                    point0.y = d.a(i00.b, ((float)v));
                }
            }
            else {
                Point point1 = d.b(i00);
                point0.x = point1.x;
                point0.y = point1.y;
                i00.q = c.e;
            }
        }
        if(i00.H == null || i00.H.isEmpty()) {
            i00.H = "320x50";
        }
        return point0;
    }

    public static boolean a(i0 i00) {
        if(i00 == null) {
            return false;
        }
        if(i00.s) {
            return false;
        }
        Object object0 = i00.a();
        if(object0 == null) {
            return false;
        }
        return !(object0 instanceof View) || ((View)object0).isShown() ? i00.b == null || ((PowerManager)i00.b.getSystemService("power")).isScreenOn() : false;
    }

    public static Point b(Context context0) {
        if(context0 == null) {
            return new Point(0, 0);
        }
        Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        display0.getMetrics(displayMetrics0);
        return new Point(displayMetrics0.widthPixels, displayMetrics0.heightPixels);
    }

    public static Point b(i0 i00) {
        int v = i00.U;
        if(v >= 1) {
            int v1 = i00.V;
            if(v1 >= 1) {
                return d.a(v, v1, d.b(i00.b));
            }
        }
        i00.H = "320x50";
        return d.a(320.0f, 50.0f, d.b(i00.b));
    }

    public static boolean b(Context context0, int v) {
        if(context0 == null) {
            return false;
        }
        if(context0 instanceof Activity) {
            Activity activity0 = (Activity)context0;
            int v1 = ((WindowManager)activity0.getSystemService("window")).getDefaultDisplay().getOrientation();
            Point point0 = d.b(context0);
            if(v1 == 0 || v1 == 1) {
                if(v == 1 && point0.x < point0.y) {
                    return true;
                }
                if(v == 0 && point0.x > point0.y) {
                    return true;
                }
            }
            try {
                PackageManager packageManager0 = activity0.getPackageManager();
                int v2 = activity0.getApplicationInfo() == null ? 0xB0 : 1200;
                return (packageManager0.getActivityInfo(activity0.getComponentName(), 0x10000).configChanges & v2) == v2;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
        }
        return false;
    }

    public static int c(Context context0) {
        if(context0 == null) {
            return 0;
        }
        Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        display0.getMetrics(displayMetrics0);
        return displayMetrics0.widthPixels;
    }

    public static void d(Context context0) {
        if(!(context0 instanceof Activity)) {
            return;
        }
        int v = ((WindowManager)((Activity)context0).getSystemService("window")).getDefaultDisplay().getOrientation();
        Point point0 = d.b(context0);
        int v1 = 0;
        boolean z = point0.x > point0.y;
        switch(v) {
            case 1: {
                if(!z) {
                    v1 = 9;
                }
                break;
            }
            case 2: {
                v1 = z ? 8 : 9;
                break;
            }
            case 3: {
                v1 = z ? 8 : 1;
                break;
            }
            default: {
                if(!z) {
                    v1 = 1;
                }
            }
        }
        ((Activity)context0).setRequestedOrientation(v1);
    }
}

