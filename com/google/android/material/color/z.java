package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

@RestrictTo({Scope.b})
public final class z {
    public static void a(@NonNull Context context0, @StyleRes int v) {
        context0.getTheme().applyStyle(v, true);
        if(context0 instanceof Activity) {
            Resources.Theme resources$Theme0 = z.b(((Activity)context0));
            if(resources$Theme0 != null) {
                resources$Theme0.applyStyle(v, true);
            }
        }
    }

    @Nullable
    private static Resources.Theme b(@NonNull Activity activity0) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            View view0 = window0.peekDecorView();
            if(view0 != null) {
                Context context0 = view0.getContext();
                return context0 == null ? null : context0.getTheme();
            }
        }
        return null;
    }
}

