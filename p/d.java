package P;

import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Build;
import android.view.WindowManager;
import kotlin.jvm.internal.L;
import y4.l;

public final class d {
    @l
    public static final d a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;

    static {
        d.a = new d();
        d.b = Build.MANUFACTURER;
        d.c = Build.BRAND;
        d.d = Build.MODEL;
        d.e = Build.VERSION.RELEASE;
    }

    public final String a() {
        return d.c;
    }

    public final String b() {
        return d.d;
    }

    @l
    public final Point c(@l Context context0, boolean z) {
        L.p(context0, "context");
        Point point0 = new Point();
        Object object0 = context0.getSystemService("window");
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        if(z) {
            ((WindowManager)object0).getDefaultDisplay().getRealSize(point0);
        }
        else {
            ((WindowManager)object0).getDefaultDisplay().getSize(point0);
        }
        int v = point0.x;
        int v1 = point0.y;
        if(v1 > v) {
            point0.x = v;
            point0.y = v1;
            return point0;
        }
        point0.x = v1;
        point0.y = v;
        return point0;
    }

    public static Point d(d d0, Context context0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return d0.c(context0, z);
    }

    public final String e() {
        return d.b;
    }

    public final String f() {
        return d.e;
    }
}

