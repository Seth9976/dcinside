package androidx.core.view;

import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.ReplaceWith;

@Deprecated
public final class MarginLayoutParamsCompat {
    @Deprecated
    public static int a(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        int v = viewGroup$MarginLayoutParams0.getLayoutDirection();
        return v == 0 || v == 1 ? v : 0;
    }

    @ReplaceWith(expression = "lp.getMarginEnd()")
    @Deprecated
    public static int b(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.getMarginEnd();
    }

    @ReplaceWith(expression = "lp.getMarginStart()")
    @Deprecated
    public static int c(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.getMarginStart();
    }

    @ReplaceWith(expression = "lp.isMarginRelative()")
    @Deprecated
    public static boolean d(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.isMarginRelative();
    }

    @ReplaceWith(expression = "lp.resolveLayoutDirection(layoutDirection)")
    @Deprecated
    public static void e(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        viewGroup$MarginLayoutParams0.resolveLayoutDirection(v);
    }

    @ReplaceWith(expression = "lp.setLayoutDirection(layoutDirection)")
    @Deprecated
    public static void f(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        viewGroup$MarginLayoutParams0.setLayoutDirection(v);
    }

    @ReplaceWith(expression = "lp.setMarginEnd(marginEnd)")
    @Deprecated
    public static void g(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        viewGroup$MarginLayoutParams0.setMarginEnd(v);
    }

    @ReplaceWith(expression = "lp.setMarginStart(marginStart)")
    @Deprecated
    public static void h(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        viewGroup$MarginLayoutParams0.setMarginStart(v);
    }
}

