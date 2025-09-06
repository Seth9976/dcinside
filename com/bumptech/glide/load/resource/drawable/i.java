package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.res.ResourcesCompat;

public final class i {
    private static volatile boolean a = true;

    static {
    }

    public static Drawable a(Context context0, @DrawableRes int v, @Nullable Resources.Theme resources$Theme0) {
        return i.c(context0, context0, v, resources$Theme0);
    }

    public static Drawable b(Context context0, Context context1, @DrawableRes int v) {
        return i.c(context0, context1, v, null);
    }

    private static Drawable c(Context context0, Context context1, @DrawableRes int v, @Nullable Resources.Theme resources$Theme0) {
        if(i.a) {
            try {
                return i.e(context1, v, resources$Theme0);
            }
            catch(NoClassDefFoundError unused_ex) {
            }
            catch(IllegalStateException illegalStateException0) {
                throw illegalStateException0;
            }
            catch(Resources.NotFoundException unused_ex) {
                goto label_6;
            }
            i.a = false;
        }
    label_6:
        if(resources$Theme0 == null) {
            resources$Theme0 = context1.getTheme();
        }
        return i.d(context1, v, resources$Theme0);
    }

    private static Drawable d(Context context0, @DrawableRes int v, @Nullable Resources.Theme resources$Theme0) {
        return ResourcesCompat.g(context0.getResources(), v, resources$Theme0);
    }

    private static Drawable e(Context context0, @DrawableRes int v, @Nullable Resources.Theme resources$Theme0) {
        if(resources$Theme0 != null) {
            ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, resources$Theme0);
            contextThemeWrapper0.a(resources$Theme0.getResources().getConfiguration());
            context0 = contextThemeWrapper0;
        }
        return AppCompatResources.b(context0, v);
    }
}

