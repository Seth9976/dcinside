package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Px;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.text.PrecomputedTextCompat.Params.Builder;
import androidx.core.text.PrecomputedTextCompat.Params;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class TextViewCompat {
    @RequiresApi(23)
    static class Api23Impl {
        static int a(TextView textView0) {
            return textView0.getBreakStrategy();
        }

        static ColorStateList b(TextView textView0) {
            return textView0.getCompoundDrawableTintList();
        }

        static PorterDuff.Mode c(TextView textView0) {
            return textView0.getCompoundDrawableTintMode();
        }

        static int d(TextView textView0) {
            return textView0.getHyphenationFrequency();
        }

        static void e(TextView textView0, int v) {
            textView0.setBreakStrategy(v);
        }

        static void f(TextView textView0, ColorStateList colorStateList0) {
            textView0.setCompoundDrawableTintList(colorStateList0);
        }

        static void g(TextView textView0, PorterDuff.Mode porterDuff$Mode0) {
            textView0.setCompoundDrawableTintMode(porterDuff$Mode0);
        }

        static void h(TextView textView0, int v) {
            textView0.setHyphenationFrequency(v);
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        static DecimalFormatSymbols a(Locale locale0) {
            return DecimalFormatSymbols.getInstance(locale0);
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        static int a(TextView textView0) {
            return textView0.getAutoSizeMaxTextSize();
        }

        static int b(TextView textView0) {
            return textView0.getAutoSizeMinTextSize();
        }

        static int c(TextView textView0) {
            return textView0.getAutoSizeStepGranularity();
        }

        static int[] d(TextView textView0) {
            return textView0.getAutoSizeTextAvailableSizes();
        }

        static int e(TextView textView0) {
            return textView0.getAutoSizeTextType();
        }

        static void f(TextView textView0, int v, int v1, int v2, int v3) {
            textView0.setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
        }

        static void g(TextView textView0, int[] arr_v, int v) {
            textView0.setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
        }

        static void h(TextView textView0, int v) {
            textView0.setAutoSizeTextTypeWithDefaults(v);
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static CharSequence a(PrecomputedText precomputedText0) {
            return precomputedText0;
        }

        static String[] b(DecimalFormatSymbols decimalFormatSymbols0) {
            return decimalFormatSymbols0.getDigitStrings();
        }

        static PrecomputedText.Params c(TextView textView0) {
            return textView0.getTextMetricsParams();
        }

        static void d(TextView textView0, int v) {
            textView0.setFirstBaselineToTopHeight(v);
        }
    }

    @RequiresApi(34)
    static class Api34Impl {
        public static void a(TextView textView0, int v, @FloatRange(from = 0.0) float f) {
            textView0.setLineHeight(v, f);
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AutoSizeTextType {
    }

    @RequiresApi(26)
    static class OreoCallback implements ActionMode.Callback {
        private final ActionMode.Callback a;
        private final TextView b;
        private Class c;
        private Method d;
        private boolean e;
        private boolean f;
        private static final int g = 100;

        OreoCallback(ActionMode.Callback actionMode$Callback0, TextView textView0) {
            this.a = actionMode$Callback0;
            this.b = textView0;
            this.f = false;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo0, TextView textView0) {
            return this.a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !this.e(textView0)).setClassName(resolveInfo0.activityInfo.packageName, resolveInfo0.activityInfo.name);
        }

        private List c(Context context0, PackageManager packageManager0) {
            List list0 = new ArrayList();
            if(!(context0 instanceof Activity)) {
                return list0;
            }
            for(Object object0: packageManager0.queryIntentActivities(this.a(), 0)) {
                ResolveInfo resolveInfo0 = (ResolveInfo)object0;
                if(this.f(resolveInfo0, context0)) {
                    list0.add(resolveInfo0);
                }
            }
            return list0;
        }

        ActionMode.Callback d() {
            return this.a;
        }

        // 去混淆评级： 低(30)
        private boolean e(TextView textView0) {
            return textView0 instanceof Editable && textView0.onCheckIsTextEditor() && textView0.isEnabled();
        }

        private boolean f(ResolveInfo resolveInfo0, Context context0) {
            if("com.dcinside.app.android".equals(resolveInfo0.activityInfo.packageName)) {
                return true;
            }
            return resolveInfo0.activityInfo.exported ? resolveInfo0.activityInfo.permission == null || context0.checkSelfPermission(resolveInfo0.activityInfo.permission) == 0 : false;
        }

        private void g(Menu menu0) {
            Context context0 = this.b.getContext();
            PackageManager packageManager0 = context0.getPackageManager();
            if(!this.f) {
                try {
                    this.f = true;
                    Class class0 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.c = class0;
                    this.d = class0.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.e = true;
                }
                catch(ClassNotFoundException | NoSuchMethodException unused_ex) {
                    this.c = null;
                    this.d = null;
                    this.e = false;
                }
            }
            try {
                Method method0 = !this.e || !this.c.isInstance(menu0) ? menu0.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE) : this.d;
                for(int v = menu0.size() - 1; v >= 0; --v) {
                    MenuItem menuItem0 = menu0.getItem(v);
                    if(menuItem0.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(menuItem0.getIntent().getAction())) {
                        method0.invoke(menu0, v);
                    }
                }
            }
            catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException unused_ex) {
                return;
            }
            List list0 = this.c(context0, packageManager0);
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ResolveInfo resolveInfo0 = (ResolveInfo)list0.get(v1);
                menu0.add(0, 0, v1 + 100, resolveInfo0.loadLabel(packageManager0)).setIntent(this.b(resolveInfo0, this.b)).setShowAsAction(1);
            }
        }

        @Override  // android.view.ActionMode$Callback
        public boolean onActionItemClicked(ActionMode actionMode0, MenuItem menuItem0) {
            return this.a.onActionItemClicked(actionMode0, menuItem0);
        }

        @Override  // android.view.ActionMode$Callback
        public boolean onCreateActionMode(ActionMode actionMode0, Menu menu0) {
            return this.a.onCreateActionMode(actionMode0, menu0);
        }

        @Override  // android.view.ActionMode$Callback
        public void onDestroyActionMode(ActionMode actionMode0) {
            this.a.onDestroyActionMode(actionMode0);
        }

        @Override  // android.view.ActionMode$Callback
        public boolean onPrepareActionMode(ActionMode actionMode0, Menu menu0) {
            this.g(menu0);
            return this.a.onPrepareActionMode(actionMode0, menu0);
        }
    }

    public static final int a = 0;
    public static final int b = 1;

    public static void A(TextView textView0, @IntRange(from = 0L) @Px int v) {
        Preconditions.i(v);
        int v1 = textView0.getPaint().getFontMetricsInt(null);
        if(v != v1) {
            textView0.setLineSpacing(((float)(v - v1)), 1.0f);
        }
    }

    public static void B(TextView textView0, int v, @FloatRange(from = 0.0) float f) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.a(textView0, v, f);
            return;
        }
        TextViewCompat.A(textView0, Math.round(TypedValue.applyDimension(v, f, textView0.getResources().getDisplayMetrics())));
    }

    public static void C(TextView textView0, PrecomputedTextCompat precomputedTextCompat0) {
        if(Build.VERSION.SDK_INT >= 29) {
            textView0.setText(Api28Impl.a(precomputedTextCompat0.f()));
            return;
        }
        if(!TextViewCompat.o(textView0).a(precomputedTextCompat0.e())) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView0.setText(precomputedTextCompat0);
    }

    public static void D(TextView textView0, @StyleRes int v) {
        if(Build.VERSION.SDK_INT >= 23) {
            textView0.setTextAppearance(v);
            return;
        }
        textView0.setTextAppearance(textView0.getContext(), v);
    }

    public static void E(TextView textView0, Params precomputedTextCompat$Params0) {
        textView0.setTextDirection(TextViewCompat.m(precomputedTextCompat$Params0.d()));
        if(Build.VERSION.SDK_INT < 23) {
            float f = precomputedTextCompat$Params0.e().getTextScaleX();
            textView0.getPaint().set(precomputedTextCompat$Params0.e());
            if(f == textView0.getTextScaleX()) {
                textView0.setTextScaleX(f / 2.0f + 1.0f);
            }
            textView0.setTextScaleX(f);
            return;
        }
        textView0.getPaint().set(precomputedTextCompat$Params0.e());
        Api23Impl.e(textView0, precomputedTextCompat$Params0.b());
        Api23Impl.h(textView0, precomputedTextCompat$Params0.c());
    }

    @RestrictTo({Scope.c})
    public static ActionMode.Callback F(ActionMode.Callback actionMode$Callback0) {
        return !(actionMode$Callback0 instanceof OreoCallback) || Build.VERSION.SDK_INT < 26 ? actionMode$Callback0 : ((OreoCallback)actionMode$Callback0).d();
    }

    @RestrictTo({Scope.c})
    public static ActionMode.Callback G(TextView textView0, ActionMode.Callback actionMode$Callback0) {
        return Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 27 && !(actionMode$Callback0 instanceof OreoCallback) && actionMode$Callback0 != null ? new OreoCallback(actionMode$Callback0, textView0) : actionMode$Callback0;
    }

    public static int a(TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return Api26Impl.a(textView0);
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeMaxTextSize() : -1;
    }

    public static int b(TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return Api26Impl.b(textView0);
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeMinTextSize() : -1;
    }

    public static int c(TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return Api26Impl.c(textView0);
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeStepGranularity() : -1;
    }

    public static int[] d(TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return Api26Impl.d(textView0);
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeTextAvailableSizes() : new int[0];
    }

    public static int e(TextView textView0) {
        if(Build.VERSION.SDK_INT >= 27) {
            return Api26Impl.e(textView0);
        }
        return textView0 instanceof AutoSizeableTextView ? ((AutoSizeableTextView)textView0).getAutoSizeTextType() : 0;
    }

    public static ColorStateList f(TextView textView0) {
        Preconditions.l(textView0);
        if(Build.VERSION.SDK_INT >= 24) {
            return Api23Impl.b(textView0);
        }
        return textView0 instanceof TintableCompoundDrawablesView ? ((TintableCompoundDrawablesView)textView0).getSupportCompoundDrawablesTintList() : null;
    }

    public static PorterDuff.Mode g(TextView textView0) {
        Preconditions.l(textView0);
        if(Build.VERSION.SDK_INT >= 24) {
            return Api23Impl.c(textView0);
        }
        return textView0 instanceof TintableCompoundDrawablesView ? ((TintableCompoundDrawablesView)textView0).getSupportCompoundDrawablesTintMode() : null;
    }

    @ReplaceWith(expression = "textView.getCompoundDrawablesRelative()")
    @Deprecated
    public static Drawable[] h(TextView textView0) {
        return textView0.getCompoundDrawablesRelative();
    }

    public static int i(TextView textView0) {
        return textView0.getPaddingTop() - textView0.getPaint().getFontMetricsInt().top;
    }

    public static int j(TextView textView0) {
        return textView0.getPaddingBottom() + textView0.getPaint().getFontMetricsInt().bottom;
    }

    @ReplaceWith(expression = "textView.getMaxLines()")
    @Deprecated
    public static int k(TextView textView0) {
        return textView0.getMaxLines();
    }

    @ReplaceWith(expression = "textView.getMinLines()")
    @Deprecated
    public static int l(TextView textView0) {
        return textView0.getMinLines();
    }

    private static int m(TextDirectionHeuristic textDirectionHeuristic0) {
        TextDirectionHeuristic textDirectionHeuristic1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if(textDirectionHeuristic0 == textDirectionHeuristic1) {
            return 1;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if(textDirectionHeuristic0 == textDirectionHeuristic2) {
            return 1;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if(textDirectionHeuristic0 == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if(textDirectionHeuristic0 == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic0 == textDirectionHeuristic1 ? 7 : 1;
    }

    private static TextDirectionHeuristic n(TextView textView0) {
        boolean z = true;
        if(textView0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if(Build.VERSION.SDK_INT >= 28 && (textView0.getInputType() & 15) == 3) {
            switch(Character.getDirectionality(Api28Impl.b(Api24Impl.a(textView0.getTextLocale()))[0].codePointAt(0))) {
                case 1: 
                case 2: {
                    return TextDirectionHeuristics.RTL;
                }
                default: {
                    return TextDirectionHeuristics.LTR;
                }
            }
        }
        if(textView0.getLayoutDirection() != 1) {
            z = false;
        }
        switch(textView0.getTextDirection()) {
            case 2: {
                return TextDirectionHeuristics.ANYRTL_LTR;
            }
            case 3: {
                return TextDirectionHeuristics.LTR;
            }
            case 4: {
                return TextDirectionHeuristics.RTL;
            }
            case 5: {
                return TextDirectionHeuristics.LOCALE;
            }
            case 6: {
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            case 7: {
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            }
            default: {
                return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        }
    }

    public static Params o(TextView textView0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 28) {
            return new Params(Api28Impl.c(textView0));
        }
        Builder precomputedTextCompat$Params$Builder0 = new Builder(new TextPaint(textView0.getPaint()));
        if(v >= 23) {
            precomputedTextCompat$Params$Builder0.b(Api23Impl.a(textView0));
            precomputedTextCompat$Params$Builder0.c(Api23Impl.d(textView0));
        }
        precomputedTextCompat$Params$Builder0.d(TextViewCompat.n(textView0));
        return precomputedTextCompat$Params$Builder0.a();
    }

    public static void p(TextView textView0, int v, int v1, int v2, int v3) throws IllegalArgumentException {
        if(Build.VERSION.SDK_INT >= 27) {
            Api26Impl.f(textView0, v, v1, v2, v3);
            return;
        }
        if(textView0 instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView)textView0).setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
        }
    }

    public static void q(TextView textView0, int[] arr_v, int v) throws IllegalArgumentException {
        if(Build.VERSION.SDK_INT >= 27) {
            Api26Impl.g(textView0, arr_v, v);
            return;
        }
        if(textView0 instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView)textView0).setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
        }
    }

    public static void r(TextView textView0, int v) {
        if(Build.VERSION.SDK_INT >= 27) {
            Api26Impl.h(textView0, v);
            return;
        }
        if(textView0 instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView)textView0).setAutoSizeTextTypeWithDefaults(v);
        }
    }

    public static void s(TextView textView0, ColorStateList colorStateList0) {
        Preconditions.l(textView0);
        if(Build.VERSION.SDK_INT >= 24) {
            Api23Impl.f(textView0, colorStateList0);
            return;
        }
        if(textView0 instanceof TintableCompoundDrawablesView) {
            ((TintableCompoundDrawablesView)textView0).setSupportCompoundDrawablesTintList(colorStateList0);
        }
    }

    public static void t(TextView textView0, PorterDuff.Mode porterDuff$Mode0) {
        Preconditions.l(textView0);
        if(Build.VERSION.SDK_INT >= 24) {
            Api23Impl.g(textView0, porterDuff$Mode0);
            return;
        }
        if(textView0 instanceof TintableCompoundDrawablesView) {
            ((TintableCompoundDrawablesView)textView0).setSupportCompoundDrawablesTintMode(porterDuff$Mode0);
        }
    }

    @ReplaceWith(expression = "textView.setCompoundDrawablesRelative(start, top, end, bottom)")
    @Deprecated
    public static void u(TextView textView0, Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        textView0.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
    }

    @ReplaceWith(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @Deprecated
    public static void v(TextView textView0, @DrawableRes int v, @DrawableRes int v1, @DrawableRes int v2, @DrawableRes int v3) {
        textView0.setCompoundDrawablesRelativeWithIntrinsicBounds(v, v1, v2, v3);
    }

    @ReplaceWith(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @Deprecated
    public static void w(TextView textView0, Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        textView0.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
    }

    @ReplaceWith(expression = "textView.setCustomSelectionActionModeCallback(callback)")
    @Deprecated
    public static void x(TextView textView0, ActionMode.Callback actionMode$Callback0) {
        textView0.setCustomSelectionActionModeCallback(TextViewCompat.G(textView0, actionMode$Callback0));
    }

    public static void y(TextView textView0, @IntRange(from = 0L) @Px int v) {
        Preconditions.i(v);
        if(Build.VERSION.SDK_INT >= 28) {
            Api28Impl.d(textView0, v);
            return;
        }
        Paint.FontMetricsInt paint$FontMetricsInt0 = textView0.getPaint().getFontMetricsInt();
        int v1 = textView0.getIncludeFontPadding() ? paint$FontMetricsInt0.top : paint$FontMetricsInt0.ascent;
        if(v > Math.abs(v1)) {
            textView0.setPadding(textView0.getPaddingLeft(), v + v1, textView0.getPaddingRight(), textView0.getPaddingBottom());
        }
    }

    public static void z(TextView textView0, @IntRange(from = 0L) @Px int v) {
        Preconditions.i(v);
        Paint.FontMetricsInt paint$FontMetricsInt0 = textView0.getPaint().getFontMetricsInt();
        int v1 = textView0.getIncludeFontPadding() ? paint$FontMetricsInt0.bottom : paint$FontMetricsInt0.descent;
        if(v > Math.abs(v1)) {
            textView0.setPadding(textView0.getPaddingLeft(), textView0.getPaddingTop(), textView0.getPaddingRight(), v - v1);
        }
    }
}

