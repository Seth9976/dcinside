package P;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import j..util.Objects;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class c {
    @l
    public static final c a;

    static {
        c.a = new c();
    }

    private final boolean a(Context context0) {
        if(context0 instanceof Activity) {
            Window window0 = ((Activity)context0).getWindow();
            if(window0 != null) {
                View view0 = window0.getDecorView();
                L.o(view0, "window.decorView");
                return (view0.getSystemUiVisibility() & 4) == 4;
            }
        }
        return false;
    }

    private final boolean b(Context context0) {
        return context0 instanceof Activity && (((Activity)context0).getWindow().getAttributes().flags & 0x400) == 0x400;
    }

    private final boolean c(Context context0) {
        Resources.Theme resources$Theme0 = context0.getTheme();
        if(resources$Theme0 != null) {
            TypedValue typedValue0 = new TypedValue();
            if(resources$Theme0.resolveAttribute(0x101020D, typedValue0, false)) {
                typedValue0.coerceToString();
                return typedValue0.type == 18 && typedValue0.data != 0;
            }
        }
        return false;
    }

    public final int d(@l Context context0, float f) {
        L.p(context0, "context");
        return (int)(f * context0.getResources().getDisplayMetrics().density + 0.5f);
    }

    public final float e(@l Context context0) {
        L.p(context0, "context");
        return context0.getResources().getDisplayMetrics().density;
    }

    public final int f(@l Context context0) {
        L.p(context0, "context");
        return context0.getResources().getDisplayMetrics().densityDpi;
    }

    @m
    public final String g(@l Context context0) {
        L.p(context0, "context");
        double f = (double)context0.getResources().getDisplayMetrics().density;
        int v = Double.compare(f, 1.0);
        if(v < 0) {
            return "ldpi";
        }
        if(v <= 0) {
            return "mdpi";
        }
        if(f <= 1.5) {
            return "hdpi";
        }
        if(f <= 2.0) {
            return "xhdpi";
        }
        return f <= 3.0 ? "xxhdpi" : "xxxhdpi";
    }

    public final int h(@l Context context0) {
        L.p(context0, "context");
        Resources resources0 = context0.getResources();
        return resources0.getDimensionPixelSize(resources0.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public final int i(@l Activity activity0) {
        L.p(activity0, "activity");
        return (int)activity0.getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    public final int j(@l Context context0) {
        L.p(context0, "context");
        return context0.getResources().getDisplayMetrics().heightPixels;
    }

    public final int k(@l Context context0) {
        L.p(context0, "context");
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        return (int)(((float)displayMetrics0.heightPixels) / displayMetrics0.density + 0.5f);
    }

    public final int l(@l Context context0) {
        L.p(context0, "context");
        return context0.getResources().getDisplayMetrics().widthPixels;
    }

    public final int m(@l Context context0) {
        L.p(context0, "context");
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        return (int)(((float)displayMetrics0.widthPixels) / displayMetrics0.density + 0.5f);
    }

    public final int n(@l Context context0) {
        L.p(context0, "context");
        Resources resources0 = context0.getResources();
        return resources0.getDimensionPixelSize(resources0.getIdentifier("status_bar_height", "dimen", "android"));
    }

    private final int o(Context context0) {
        try {
            Class class0 = Class.forName("com.android.internal.R$dimen");
            Object object0 = class0.getField("status_bar_height").get(class0.newInstance());
            Objects.requireNonNull(object0);
            int v = Integer.parseInt(object0.toString());
            return context0.getResources().getDimensionPixelSize(v);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            return -1;
        }
    }

    public final boolean p(@m Context context0) {
        if(context0 instanceof Activity) {
            Display display0 = ((Activity)context0).getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics0 = new DisplayMetrics();
            display0.getRealMetrics(displayMetrics0);
            int v = displayMetrics0.heightPixels;
            int v1 = displayMetrics0.widthPixels;
            DisplayMetrics displayMetrics1 = new DisplayMetrics();
            display0.getMetrics(displayMetrics1);
            return v1 - displayMetrics1.widthPixels > 0 || v - displayMetrics1.heightPixels > 0;
        }
        return false;
    }

    public final boolean q(@l Context context0) {
        L.p(context0, "context");
        return this.c(context0) || this.a(context0) || this.b(context0);
    }

    public final int r(@l Context context0, float f) {
        L.p(context0, "context");
        return (int)(f / context0.getResources().getDisplayMetrics().density + 0.5f);
    }

    public final int s(@l Context context0, int v) {
        L.p(context0, "context");
        return (int)(((float)v) / context0.getResources().getDisplayMetrics().density + 0.5f);
    }
}

