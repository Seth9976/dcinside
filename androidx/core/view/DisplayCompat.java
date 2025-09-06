package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display.Mode;
import android.view.Display;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

public final class DisplayCompat {
    @RequiresApi(23)
    static class Api23Impl {
        static ModeCompat a(Context context0, Display display0) {
            Display.Mode display$Mode0 = display0.getMode();
            Point point0 = DisplayCompat.a(context0, display0);
            return point0 == null || Api23Impl.d(display$Mode0, point0) ? new ModeCompat(display$Mode0, true) : new ModeCompat(display$Mode0, point0);
        }

        @SuppressLint({"ArrayReturn"})
        public static ModeCompat[] b(Context context0, Display display0) {
            Display.Mode[] arr_display$Mode = display0.getSupportedModes();
            ModeCompat[] arr_displayCompat$ModeCompat = new ModeCompat[arr_display$Mode.length];
            Display.Mode display$Mode0 = display0.getMode();
            Point point0 = DisplayCompat.a(context0, display0);
            if(point0 != null && !Api23Impl.d(display$Mode0, point0)) {
                for(int v1 = 0; v1 < arr_display$Mode.length; ++v1) {
                    arr_displayCompat$ModeCompat[v1] = Api23Impl.e(arr_display$Mode[v1], display$Mode0) ? new ModeCompat(arr_display$Mode[v1], point0) : new ModeCompat(arr_display$Mode[v1], false);
                }
                return arr_displayCompat$ModeCompat;
            }
            for(int v = 0; v < arr_display$Mode.length; ++v) {
                boolean z = Api23Impl.e(arr_display$Mode[v], display$Mode0);
                arr_displayCompat$ModeCompat[v] = new ModeCompat(arr_display$Mode[v], z);
            }
            return arr_displayCompat$ModeCompat;
        }

        static boolean c(Display display0) {
            Display.Mode display$Mode0 = display0.getMode();
            Display.Mode[] arr_display$Mode = display0.getSupportedModes();
            int v = 0;
            while(v < arr_display$Mode.length) {
                Display.Mode display$Mode1 = arr_display$Mode[v];
                if(display$Mode0.getPhysicalHeight() >= display$Mode1.getPhysicalHeight() && display$Mode0.getPhysicalWidth() >= display$Mode1.getPhysicalWidth()) {
                    ++v;
                    continue;
                }
                return false;
            }
            return true;
        }

        // 去混淆评级： 低(20)
        static boolean d(Display.Mode display$Mode0, Point point0) {
            return display$Mode0.getPhysicalWidth() == point0.x && display$Mode0.getPhysicalHeight() == point0.y || display$Mode0.getPhysicalWidth() == point0.y && display$Mode0.getPhysicalHeight() == point0.x;
        }

        static boolean e(Display.Mode display$Mode0, Display.Mode display$Mode1) {
            return display$Mode0.getPhysicalWidth() == display$Mode1.getPhysicalWidth() && display$Mode0.getPhysicalHeight() == display$Mode1.getPhysicalHeight();
        }
    }

    public static final class ModeCompat {
        @RequiresApi(23)
        static class androidx.core.view.DisplayCompat.ModeCompat.Api23Impl {
            static int a(Display.Mode display$Mode0) {
                return display$Mode0.getPhysicalHeight();
            }

            static int b(Display.Mode display$Mode0) {
                return display$Mode0.getPhysicalWidth();
            }
        }

        private final Display.Mode a;
        private final Point b;
        private final boolean c;

        ModeCompat(Point point0) {
            Preconditions.m(point0, "physicalSize == null");
            this.b = point0;
            this.a = null;
            this.c = true;
        }

        @RequiresApi(23)
        ModeCompat(Display.Mode display$Mode0, Point point0) {
            Preconditions.m(display$Mode0, "mode == null, can\'t wrap a null reference");
            Preconditions.m(point0, "physicalSize == null");
            this.b = point0;
            this.a = display$Mode0;
            this.c = true;
        }

        @RequiresApi(23)
        ModeCompat(Display.Mode display$Mode0, boolean z) {
            Preconditions.m(display$Mode0, "mode == null, can\'t wrap a null reference");
            this.b = new Point(androidx.core.view.DisplayCompat.ModeCompat.Api23Impl.b(display$Mode0), androidx.core.view.DisplayCompat.ModeCompat.Api23Impl.a(display$Mode0));
            this.a = display$Mode0;
            this.c = z;
        }

        public int a() {
            return this.b.y;
        }

        public int b() {
            return this.b.x;
        }

        @Deprecated
        public boolean c() {
            return this.c;
        }

        @RequiresApi(23)
        public Display.Mode d() {
            return this.a;
        }
    }

    private static final int a = 0xF00;
    private static final int b = 0x870;

    static Point a(Context context0, Display display0) {
        Point point0 = Build.VERSION.SDK_INT >= 28 ? DisplayCompat.j("vendor.display-size", display0) : DisplayCompat.j("sys.display-size", display0);
        if(point0 != null) {
            return point0;
        }
        return !DisplayCompat.g(context0) || !DisplayCompat.f(display0) ? null : new Point(0xF00, 0x870);
    }

    private static Point b(Context context0, Display display0) {
        Point point0 = DisplayCompat.a(context0, display0);
        if(point0 != null) {
            return point0;
        }
        Point point1 = new Point();
        display0.getRealSize(point1);
        return point1;
    }

    public static ModeCompat c(Context context0, Display display0) {
        return Build.VERSION.SDK_INT < 23 ? new ModeCompat(DisplayCompat.b(context0, display0)) : Api23Impl.a(context0, display0);
    }

    @SuppressLint({"ArrayReturn"})
    public static ModeCompat[] d(Context context0, Display display0) {
        return Build.VERSION.SDK_INT < 23 ? new ModeCompat[]{DisplayCompat.c(context0, display0)} : Api23Impl.b(context0, display0);
    }

    private static String e(String s) {
        try {
            Class class0 = Class.forName("android.os.SystemProperties");
            return (String)class0.getMethod("get", String.class).invoke(class0, s);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    static boolean f(Display display0) {
        return Build.VERSION.SDK_INT < 23 ? true : Api23Impl.c(display0);
    }

    // 去混淆评级： 低(40)
    private static boolean g(Context context0) {
        return DisplayCompat.h(context0) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context0.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    private static boolean h(Context context0) {
        UiModeManager uiModeManager0 = (UiModeManager)context0.getSystemService("uimode");
        return uiModeManager0 != null && uiModeManager0.getCurrentModeType() == 4;
    }

    private static Point i(String s) throws NumberFormatException {
        String[] arr_s = s.trim().split("x", -1);
        if(arr_s.length == 2) {
            int v = Integer.parseInt(arr_s[0]);
            int v1 = Integer.parseInt(arr_s[1]);
            if(v > 0 && v1 > 0) {
                return new Point(v, v1);
            }
        }
        throw new NumberFormatException();
    }

    private static Point j(String s, Display display0) {
        if(display0.getDisplayId() != 0) {
            return null;
        }
        String s1 = DisplayCompat.e(s);
        if(!TextUtils.isEmpty(s1) && s1 != null) {
            try {
                return DisplayCompat.i(s1);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return null;
    }
}

