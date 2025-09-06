package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.google.android.material.R.style;
import java.util.HashMap;
import java.util.Map;

public class s {
    private static final String a = "s";

    static {
    }

    @RequiresApi(api = 30)
    private static void a(@NonNull Map map0, @NonNull TypedArray typedArray0, @Nullable TypedArray typedArray1, @ColorInt int v) {
        if(typedArray1 == null) {
            typedArray1 = typedArray0;
        }
        for(int v1 = 0; v1 < typedArray0.getIndexCount(); ++v1) {
            int v2 = typedArray1.getResourceId(v1, 0);
            if(v2 != 0 && typedArray0.hasValue(v1) && y.b(typedArray0.getType(v1))) {
                map0.put(v2, v.o(typedArray0.getColor(v1, 0), v));
            }
        }
    }

    @NonNull
    public static void b(@NonNull Context context0, @NonNull t t0) {
        Map map0 = s.c(context0, t0);
        int v = t0.e(0);
        if(y.a(context0, map0) && v != 0) {
            z.a(context0, v);
        }
    }

    @RequiresApi(api = 30)
    private static Map c(Context context0, t t0) {
        Map map0 = new HashMap();
        int v = v.c(context0, t0.b(), "s");
        int[] arr_v = t0.d();
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            map0.put(v2, v.o(ContextCompat.getColor(context0, v2), v));
        }
        r r0 = t0.c();
        if(r0 != null) {
            int[] arr_v1 = r0.d();
            if(arr_v1.length > 0) {
                int v3 = r0.e();
                TypedArray typedArray0 = context0.obtainStyledAttributes(arr_v1);
                TypedArray typedArray1 = v3 == 0 ? null : new ContextThemeWrapper(context0, v3).obtainStyledAttributes(arr_v1);
                s.a(map0, typedArray0, typedArray1, v);
                typedArray0.recycle();
                if(typedArray1 != null) {
                    typedArray1.recycle();
                }
            }
        }
        return map0;
    }

    @ChecksSdkIntAtLeast(api = 30)
    public static boolean d() [...] // 潜在的解密器

    @NonNull
    public static Context e(@NonNull Context context0, @NonNull t t0) {
        Map map0 = s.c(context0, t0);
        ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, t0.e(style.ThemeOverlay_Material3_HarmonizedColors_Empty));
        contextThemeWrapper0.applyOverrideConfiguration(new Configuration());
        return y.a(contextThemeWrapper0, map0) ? contextThemeWrapper0 : context0;
    }
}

