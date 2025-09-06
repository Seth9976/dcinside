package com.coupang.ads.tools;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import y4.l;
import y4.m;

public final class d {
    public static final float a(@m Context context0, float f) {
        if(context0 != null) {
            try {
                return TypedValue.applyDimension(1, f, context0.getResources().getDisplayMetrics());
            }
            catch(Exception unused_ex) {
            }
        }
        return f;
    }

    public static final int b(@m Context context0, int v) {
        if(context0 != null) {
            try {
                float f = TypedValue.applyDimension(1, ((float)v), context0.getResources().getDisplayMetrics());
                return f > 0.0f ? ((int)(f + 0.5f)) : ((int)(f - 0.5f));
            }
            catch(Exception unused_ex) {
            }
        }
        return v;
    }

    public static final float c(@m Context context0, int v) {
        if(context0 == null) {
            throw new NullPointerException();
        }
        try {
            return TypedValue.applyDimension(1, ((float)v), context0.getResources().getDisplayMetrics());
        }
        catch(Exception unused_ex) {
            Float float0 = (float)v;
            return float0 == null ? ((float)v) : ((float)float0);
        }
    }

    @m
    public static final Activity d(@m Context context0) {
        if(context0 instanceof Activity) {
            return (Activity)context0;
        }
        return context0 instanceof ContextWrapper ? d.d(((ContextWrapper)context0).getBaseContext()) : null;
    }

    public static final int e(@m Context context0) {
        return d.f(context0)[1];
    }

    @l
    public static final int[] f(@m Context context0) {
        int[] arr_v = new int[2];
        Point point0 = new Point();
        Object object0 = context0 == null ? null : context0.getSystemService("window");
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        ((WindowManager)object0).getDefaultDisplay().getSize(point0);
        int v = point0.x;
        int v1 = point0.y;
        if(v1 > v) {
            arr_v[0] = v;
            arr_v[1] = v1;
            return arr_v;
        }
        arr_v[0] = v1;
        arr_v[1] = v;
        return arr_v;
    }

    public static final int g(@m Context context0) {
        return d.f(context0)[0];
    }

    public static final int h(@m Context context0) {
        int v;
        if(context0 == null) {
            v = 0;
        }
        else {
            Resources resources0 = context0.getResources();
            v = resources0 == null ? 0 : resources0.getIdentifier("status_bar_height", "dimen", "android");
        }
        if(v > 0 && context0 != null) {
            Resources resources1 = context0.getResources();
            return resources1 == null ? 0 : resources1.getDimensionPixelSize(v);
        }
        return 0;
    }

    public static final int i(@m Context context0, int v) {
        DisplayMetrics displayMetrics0;
        float f = 1.0f;
        if(context0 != null) {
            try {
                Resources resources0 = context0.getResources();
                if(resources0 != null) {
                    displayMetrics0 = resources0.getDisplayMetrics();
                    goto label_7;
                }
                return (int)(((float)v) / f);
            }
            catch(Exception unused_ex) {
                return v;
            }
        label_7:
            if(displayMetrics0 != null) {
                f = ((float)displayMetrics0.densityDpi) / 160.0f;
            }
        }
        return (int)(((float)v) / f);
    }

    @SuppressLint({"NewApi"})
    @m
    public static final Bitmap j(@m Context context0, @DrawableRes int v) {
        Bitmap bitmap0 = null;
        if(context0 != null && v != 0) {
            Drawable drawable0 = AppCompatResources.b(context0, v);
            if(drawable0 instanceof BitmapDrawable) {
                return ((BitmapDrawable)drawable0).getBitmap();
            }
            if(drawable0 instanceof VectorDrawableCompat || drawable0 instanceof VectorDrawable) {
                bitmap0 = Bitmap.createBitmap(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas0 = new Canvas(bitmap0);
                drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
                drawable0.draw(canvas0);
            }
        }
        return bitmap0;
    }

    @ColorInt
    public static final int k(@m Context context0, @ColorRes int v) {
        if(context0 != null && v != 0) {
            try {
                return ResourcesCompat.e(context0.getResources(), v, context0.getTheme());
            }
            catch(Exception unused_ex) {
            }
        }
        return 0;
    }

    @m
    public static final ColorStateList l(@m Context context0, @ColorRes int v) {
        if(context0 != null && v != 0) {
            try {
                return ResourcesCompat.f(context0.getResources(), v, context0.getTheme());
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    public static final int m(@m Context context0, @DimenRes int v, int v1) {
        if(context0 != null && v != 0) {
            try {
                return context0.getResources().getDimensionPixelSize(v);
            }
            catch(Exception unused_ex) {
            }
        }
        return v1;
    }

    public static int n(Context context0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return d.m(context0, v, v1);
    }

    public static final float o(@m Context context0, @DimenRes int v, float f) {
        if(context0 != null && v != 0) {
            try {
                return context0.getResources().getDimension(v);
            }
            catch(Exception unused_ex) {
            }
        }
        return f;
    }

    public static float p(Context context0, int v, float f, int v1, Object object0) {
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        return d.o(context0, v, f);
    }

    @m
    public static final Drawable q(@m Context context0, @DrawableRes int v) {
        if(context0 != null && v != 0) {
            try {
                return ResourcesCompat.g(context0.getResources(), v, context0.getTheme());
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    @m
    public static final Drawable r(@m Context context0, @DrawableRes int v, int v1, int v2) {
        if(context0 != null && v != 0) {
            try {
                Drawable drawable0 = ContextCompat.getDrawable(context0, v);
                if(drawable0 != null) {
                    Bitmap bitmap0 = Bitmap.createBitmap(v1, v2, Bitmap.Config.ARGB_8888);
                    Canvas canvas0 = new Canvas(bitmap0);
                    canvas0.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                    drawable0.setBounds(0, 0, v1, v2);
                    drawable0.draw(canvas0);
                    return new BitmapDrawable(context0.getResources(), bitmap0);
                }
                return null;
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    public static final int s(@m Context context0, int v) {
        if(context0 != null) {
            try {
                return (int)TypedValue.applyDimension(2, ((float)v), context0.getResources().getDisplayMetrics());
            }
            catch(Exception unused_ex) {
            }
        }
        return v;
    }
}

