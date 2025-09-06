package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;

public final class CheckedTextViewCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static ColorStateList a(CheckedTextView checkedTextView0) {
            return checkedTextView0.getCheckMarkTintList();
        }

        static PorterDuff.Mode b(CheckedTextView checkedTextView0) {
            return checkedTextView0.getCheckMarkTintMode();
        }

        static void c(CheckedTextView checkedTextView0, ColorStateList colorStateList0) {
            checkedTextView0.setCheckMarkTintList(colorStateList0);
        }

        static void d(CheckedTextView checkedTextView0, PorterDuff.Mode porterDuff$Mode0) {
            checkedTextView0.setCheckMarkTintMode(porterDuff$Mode0);
        }
    }

    @ReplaceWith(expression = "textView.getCheckMarkDrawable()")
    @Deprecated
    public static Drawable a(CheckedTextView checkedTextView0) {
        return checkedTextView0.getCheckMarkDrawable();
    }

    public static ColorStateList b(CheckedTextView checkedTextView0) {
        return Api21Impl.a(checkedTextView0);
    }

    public static PorterDuff.Mode c(CheckedTextView checkedTextView0) {
        return Api21Impl.b(checkedTextView0);
    }

    public static void d(CheckedTextView checkedTextView0, ColorStateList colorStateList0) {
        Api21Impl.c(checkedTextView0, colorStateList0);
    }

    public static void e(CheckedTextView checkedTextView0, PorterDuff.Mode porterDuff$Mode0) {
        Api21Impl.d(checkedTextView0, porterDuff$Mode0);
    }
}

