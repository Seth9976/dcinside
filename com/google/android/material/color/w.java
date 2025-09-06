package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.R.style;
import java.util.Map;

@RequiresApi(api = 30)
class w implements m {
    static class a {
    }

    static class b {
        private static final w a;

        static {
            b.a = new w(null);
        }
    }

    private w() {
    }

    w(a w$a0) {
    }

    @Override  // com.google.android.material.color.m
    @NonNull
    public Context a(Context context0, Map map0) {
        ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper0.applyOverrideConfiguration(new Configuration());
        return y.a(contextThemeWrapper0, map0) ? contextThemeWrapper0 : context0;
    }

    @Override  // com.google.android.material.color.m
    public boolean b(Context context0, Map map0) {
        if(y.a(context0, map0)) {
            z.a(context0, style.ThemeOverlay_Material3_PersonalizedColors);
            return true;
        }
        return false;
    }

    static m c() {
        return b.a;
    }
}

