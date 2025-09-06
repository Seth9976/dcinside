package androidx.core.splashscreen;

import android.content.res.Resources.Theme;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import z3.j;
import z3.n;

@RequiresApi(0x1F)
public final class ThemeUtils {
    public static final class Api31 {
        @l
        public static final Api31 a;

        static {
            Api31.a = new Api31();
        }

        @DoNotInline
        @j
        @n
        public static final void a(@l Resources.Theme resources$Theme0, @l View view0) {
            L.p(resources$Theme0, "theme");
            L.p(view0, "decor");
            Api31.c(resources$Theme0, view0, null, 4, null);
        }

        @DoNotInline
        @j
        @n
        public static final void b(@l Resources.Theme resources$Theme0, @l View view0, @l TypedValue typedValue0) {
            L.p(resources$Theme0, "theme");
            L.p(view0, "decor");
            L.p(typedValue0, "tv");
            int v = !resources$Theme0.resolveAttribute(0x10104E0, typedValue0, true) || typedValue0.data == 0 ? 0 : 8;
            if(resources$Theme0.resolveAttribute(0x101056C, typedValue0, true) && typedValue0.data != 0) {
                v |= 16;
            }
            WindowInsetsController windowInsetsController0 = view0.getWindowInsetsController();
            L.m(windowInsetsController0);
            windowInsetsController0.setSystemBarsAppearance(v, 24);
        }

        public static void c(Resources.Theme resources$Theme0, View view0, TypedValue typedValue0, int v, Object object0) {
            if((v & 4) != 0) {
                typedValue0 = new TypedValue();
            }
            Api31.b(resources$Theme0, view0, typedValue0);
        }
    }

    @l
    public static final ThemeUtils a;

    static {
        ThemeUtils.a = new ThemeUtils();
    }
}

