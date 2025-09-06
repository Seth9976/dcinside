package com.coupang.ads.tools;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import com.coupang.ads.a;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;

public final class o {
    @ColorInt
    public static final int a(@ColorRes int v) {
        return Build.VERSION.SDK_INT < 23 ? a.o.b().m().getResources().getColor(v) : a.o.b().m().getColor(v);
    }

    public static final int b(int v) {
        return (int)(((float)v) * a.o.b().m().getResources().getDisplayMetrics().density + 0.5f);
    }

    public static final float c(float f) {
        return f * a.o.b().m().getResources().getDisplayMetrics().density + 0.5f;
    }

    public static final int d(@l Context context0) {
        L.p(context0, "context");
        Object object0 = context0.getSystemService("window");
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        ((WindowManager)object0).getDefaultDisplay().getMetrics(displayMetrics0);
        return (int)(((float)displayMetrics0.widthPixels) / displayMetrics0.density);
    }

    public static final int e(float f) {
        return (int)(f * a.o.b().m().getResources().getDisplayMetrics().scaledDensity + 0.5f);
    }

    @l
    public static final String f(@StringRes int v) {
        String s = a.o.b().m().getString(v);
        L.o(s, "AdsContext.context.requi…AppContext.getString(res)");
        return s;
    }

    @l
    public static final String g(@StringRes int v, @l Object[] arr_object) {
        L.p(arr_object, "formatArgs");
        String s = a.o.b().m().getString(v, Arrays.copyOf(arr_object, arr_object.length));
        L.o(s, "AdsContext.context.requi…tString(res, *formatArgs)");
        return s;
    }
}

