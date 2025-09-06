package com.google.android.material.drawable;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.b})
public final class f {
    @RequiresApi(21)
    static class a {
        @DoNotInline
        static void a(@NonNull Outline outline0, @NonNull Path path0) {
            outline0.setConvexPath(path0);
        }
    }

    @RequiresApi(30)
    static class b {
        @DoNotInline
        static void a(@NonNull Outline outline0, @NonNull Path path0) {
            outline0.setPath(path0);
        }
    }

    public static final int a = -1;
    private static final int b = -1;
    private static final int c = -1;

    @Nullable
    public static Drawable a(@Nullable Drawable drawable0, @Nullable Drawable drawable1) {
        return f.b(drawable0, drawable1, -1, -1);
    }

    @Nullable
    public static Drawable b(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Px int v, @Px int v1) {
        if(drawable0 == null) {
            return drawable1;
        }
        if(drawable1 == null) {
            return drawable0;
        }
        boolean z = v != -1 && v1 != -1;
        if(v == -1) {
            v = f.i(drawable0, drawable1);
        }
        if(v1 == -1) {
            v1 = f.h(drawable0, drawable1);
        }
        if(v > drawable0.getIntrinsicWidth() || v1 > drawable0.getIntrinsicHeight()) {
            float f = ((float)v) / ((float)v1);
            if(f >= ((float)drawable0.getIntrinsicWidth()) / ((float)drawable0.getIntrinsicHeight())) {
                int v2 = drawable0.getIntrinsicWidth();
                v1 = (int)(((float)v2) / f);
                v = v2;
            }
            else {
                v1 = drawable0.getIntrinsicHeight();
                v = (int)(f * ((float)v1));
            }
        }
        if(Build.VERSION.SDK_INT >= 23) {
            Drawable drawable2 = new LayerDrawable(new Drawable[]{drawable0, drawable1});
            ((LayerDrawable)drawable2).setLayerSize(1, v, v1);
            ((LayerDrawable)drawable2).setLayerGravity(1, 17);
            return drawable2;
        }
        if(z) {
            drawable1 = new g(drawable1, v, v1);
        }
        LayerDrawable layerDrawable0 = new LayerDrawable(new Drawable[]{drawable0, drawable1});
        int v3 = Math.max((drawable0.getIntrinsicWidth() - v) / 2, 0);
        int v4 = Math.max((drawable0.getIntrinsicHeight() - v1) / 2, 0);
        layerDrawable0.setLayerInset(1, v3, v4, v3, v4);
        return layerDrawable0;
    }

    @Nullable
    public static Drawable c(@Nullable Drawable drawable0, @Nullable ColorStateList colorStateList0, @Nullable PorterDuff.Mode porterDuff$Mode0) {
        return f.e(drawable0, colorStateList0, porterDuff$Mode0, false);
    }

    @Nullable
    public static Drawable d(@Nullable Drawable drawable0, @Nullable ColorStateList colorStateList0, @Nullable PorterDuff.Mode porterDuff$Mode0) {
        return Build.VERSION.SDK_INT >= 23 ? f.e(drawable0, colorStateList0, porterDuff$Mode0, false) : f.e(drawable0, colorStateList0, porterDuff$Mode0, true);
    }

    @Nullable
    private static Drawable e(@Nullable Drawable drawable0, @Nullable ColorStateList colorStateList0, @Nullable PorterDuff.Mode porterDuff$Mode0, boolean z) {
        if(drawable0 == null) {
            return null;
        }
        if(colorStateList0 != null) {
            drawable0 = DrawableCompat.r(drawable0).mutate();
            if(porterDuff$Mode0 != null) {
                DrawableCompat.p(drawable0, porterDuff$Mode0);
                return drawable0;
            }
        }
        else if(z) {
            drawable0.mutate();
        }
        return drawable0;
    }

    @NonNull
    public static int[] f(@NonNull int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(v1 == 0x10100A0) {
                return arr_v;
            }
            if(v1 == 0) {
                int[] arr_v1 = (int[])arr_v.clone();
                arr_v1[v] = 0x10100A0;
                return arr_v1;
            }
        }
        int[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + 1);
        arr_v2[arr_v.length] = 0x10100A0;
        return arr_v2;
    }

    @Nullable
    public static ColorStateList g(@Nullable Drawable drawable0) {
        if(drawable0 instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable)drawable0).getColor());
        }
        return Build.VERSION.SDK_INT < 29 || !c.a(drawable0) ? null : ((ColorStateListDrawable)drawable0).getColorStateList();
    }

    private static int h(@NonNull Drawable drawable0, @NonNull Drawable drawable1) {
        int v = drawable1.getIntrinsicHeight();
        return v == -1 ? drawable0.getIntrinsicHeight() : v;
    }

    private static int i(@NonNull Drawable drawable0, @NonNull Drawable drawable1) {
        int v = drawable1.getIntrinsicWidth();
        return v == -1 ? drawable0.getIntrinsicWidth() : v;
    }

    @NonNull
    public static int[] j(@NonNull int[] arr_v) {
        int[] arr_v1 = new int[arr_v.length];
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            int v2 = arr_v[v];
            if(v2 != 0x10100A0) {
                arr_v1[v1] = v2;
                ++v1;
            }
        }
        return arr_v1;
    }

    @NonNull
    public static AttributeSet k(@NonNull Context context0, @XmlRes int v, @NonNull CharSequence charSequence0) {
        try {
            XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
            do {
                int v1 = xmlResourceParser0.next();
            }
            while(v1 != 1 && v1 != 2);
            if(v1 != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if(!TextUtils.equals(xmlResourceParser0.getName(), charSequence0)) {
                throw new XmlPullParserException("Must have a <" + charSequence0 + "> start tag");
            }
            return Xml.asAttributeSet(xmlResourceParser0);
        }
        catch(XmlPullParserException | IOException xmlPullParserException0) {
        }
        Resources.NotFoundException resources$NotFoundException0 = new Resources.NotFoundException("Can\'t load badge resource ID #0x" + Integer.toHexString(v));
        resources$NotFoundException0.initCause(xmlPullParserException0);
        throw resources$NotFoundException0;
    }

    public static void l(@NonNull Outline outline0, @NonNull Path path0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            b.a(outline0, path0);
            return;
        }
        if(v >= 29) {
            try {
                a.a(outline0, path0);
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        else if(path0.isConvex()) {
            a.a(outline0, path0);
        }
    }

    @TargetApi(21)
    public static void m(@Nullable RippleDrawable rippleDrawable0, int v) {
        if(Build.VERSION.SDK_INT >= 23) {
            rippleDrawable0.setRadius(v);
            return;
        }
        try {
            RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE).invoke(rippleDrawable0, v);
        }
        catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException noSuchMethodException0) {
            throw new IllegalStateException("Couldn\'t set RippleDrawable radius", noSuchMethodException0);
        }
    }

    public static void n(@NonNull Drawable drawable0, @ColorInt int v) {
        if(Build.VERSION.SDK_INT == 21) {
            if(v != 0) {
                drawable0.setColorFilter(v, PorterDuff.Mode.SRC_IN);
                return;
            }
            drawable0.setColorFilter(null);
            return;
        }
        if(v != 0) {
            DrawableCompat.n(drawable0, v);
            return;
        }
        DrawableCompat.o(drawable0, null);
    }

    @Nullable
    public static PorterDuffColorFilter o(@NonNull Drawable drawable0, @Nullable ColorStateList colorStateList0, @Nullable PorterDuff.Mode porterDuff$Mode0) {
        return colorStateList0 == null || porterDuff$Mode0 == null ? null : new PorterDuffColorFilter(colorStateList0.getColorForState(drawable0.getState(), 0), porterDuff$Mode0);
    }
}

