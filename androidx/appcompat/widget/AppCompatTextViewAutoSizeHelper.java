package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewCompat;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class AppCompatTextViewAutoSizeHelper {
    @RequiresApi(23)
    static final class Api23Impl {
        @DoNotInline
        @NonNull
        static StaticLayout a(@NonNull CharSequence charSequence0, @NonNull Layout.Alignment layout$Alignment0, int v, int v1, @NonNull TextView textView0, @NonNull TextPaint textPaint0, @NonNull Impl appCompatTextViewAutoSizeHelper$Impl0) {
            StaticLayout.Builder staticLayout$Builder0 = StaticLayout.Builder.obtain(charSequence0, 0, charSequence0.length(), textPaint0, v);
            StaticLayout.Builder staticLayout$Builder1 = staticLayout$Builder0.setAlignment(layout$Alignment0).setLineSpacing(textView0.getLineSpacingExtra(), textView0.getLineSpacingMultiplier()).setIncludePad(textView0.getIncludeFontPadding()).setBreakStrategy(textView0.getBreakStrategy()).setHyphenationFrequency(textView0.getHyphenationFrequency());
            if(v1 == -1) {
                v1 = 0x7FFFFFFF;
            }
            staticLayout$Builder1.setMaxLines(v1);
            try {
                appCompatTextViewAutoSizeHelper$Impl0.a(staticLayout$Builder0, textView0);
                return staticLayout$Builder0.build();
            }
            catch(ClassCastException unused_ex) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                return staticLayout$Builder0.build();
            }
        }
    }

    @RequiresApi(23)
    static class Impl23 extends Impl {
        @Override  // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl
        void a(StaticLayout.Builder staticLayout$Builder0, TextView textView0) {
            staticLayout$Builder0.setTextDirection(((TextDirectionHeuristic)AppCompatTextViewAutoSizeHelper.m(textView0, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR)));
        }
    }

    @RequiresApi(29)
    static class Impl29 extends Impl23 {
        @Override  // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl23
        void a(StaticLayout.Builder staticLayout$Builder0, TextView textView0) {
            staticLayout$Builder0.setTextDirection(textView0.getTextDirectionHeuristic());
        }

        @Override  // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl
        boolean b(TextView textView0) {
            return textView0.isHorizontallyScrollable();
        }
    }

    static class Impl {
        void a(StaticLayout.Builder staticLayout$Builder0, TextView textView0) {
        }

        boolean b(TextView textView0) {
            return ((Boolean)AppCompatTextViewAutoSizeHelper.m(textView0, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    private int a;
    private boolean b;
    private float c;
    private float d;
    private float e;
    private int[] f;
    private boolean g;
    private TextPaint h;
    @NonNull
    private final TextView i;
    private final Context j;
    private final Impl k;
    private static final String l = "ACTVAutoSizeHelper";
    private static final RectF m = null;
    private static final int n = 12;
    private static final int o = 0x70;
    private static final int p = 1;
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap q = null;
    static final float r = -1.0f;
    private static final int s = 0x100000;

    static {
        AppCompatTextViewAutoSizeHelper.m = new RectF();
        AppCompatTextViewAutoSizeHelper.q = new ConcurrentHashMap();
    }

    AppCompatTextViewAutoSizeHelper(@NonNull TextView textView0) {
        this.a = 0;
        this.b = false;
        this.c = -1.0f;
        this.d = -1.0f;
        this.e = -1.0f;
        this.f = new int[0];
        this.g = false;
        this.i = textView0;
        this.j = textView0.getContext();
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            this.k = new Impl29();
            return;
        }
        if(v >= 23) {
            this.k = new Impl23();
            return;
        }
        this.k = new Impl();
    }

    @RestrictTo({Scope.c})
    void a() {
        if(!this.n()) {
            return;
        }
        if(this.b) {
            if(this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                int v = this.k.b(this.i) ? 0x100000 : this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft() - this.i.getTotalPaddingRight();
                int v1 = this.i.getHeight() - this.i.getCompoundPaddingBottom() - this.i.getCompoundPaddingTop();
                if(v > 0 && v1 > 0) {
                    RectF rectF0 = AppCompatTextViewAutoSizeHelper.m;
                    synchronized(rectF0) {
                        rectF0.setEmpty();
                        rectF0.right = (float)v;
                        rectF0.bottom = (float)v1;
                        float f = (float)this.e(rectF0);
                        if(f != this.i.getTextSize()) {
                            this.t(0, f);
                        }
                    }
                    this.b = true;
                    return;
                }
            }
            return;
        }
        this.b = true;
    }

    private int[] b(int[] arr_v) {
        if(arr_v.length == 0) {
            return arr_v;
        }
        Arrays.sort(arr_v);
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            if(v2 > 0 && Collections.binarySearch(arrayList0, v2) < 0) {
                arrayList0.add(v2);
            }
        }
        if(arr_v.length == arrayList0.size()) {
            return arr_v;
        }
        int v3 = arrayList0.size();
        int[] arr_v1 = new int[v3];
        for(int v = 0; v < v3; ++v) {
            arr_v1[v] = (int)(((Integer)arrayList0.get(v)));
        }
        return arr_v1;
    }

    private void c() {
        this.a = 0;
        this.d = -1.0f;
        this.e = -1.0f;
        this.c = -1.0f;
        this.f = new int[0];
        this.b = false;
    }

    @NonNull
    @VisibleForTesting
    StaticLayout d(@NonNull CharSequence charSequence0, @NonNull Layout.Alignment layout$Alignment0, int v, int v1) {
        if(Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.a(charSequence0, layout$Alignment0, v, v1, this.i, this.h, this.k);
        }
        float f = this.i.getLineSpacingMultiplier();
        float f1 = this.i.getLineSpacingExtra();
        boolean z = this.i.getIncludeFontPadding();
        return new StaticLayout(charSequence0, this.h, v, layout$Alignment0, f, f1, z);
    }

    private int e(RectF rectF0) {
        int v = this.f.length;
        if(v == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int v1 = 1;
        int v2 = v - 1;
        int v3 = 0;
        while(v1 <= v2) {
            int v4 = (v1 + v2) / 2;
            if(this.x(this.f[v4], rectF0)) {
                v3 = v1;
                v1 = v4 + 1;
            }
            else {
                v3 = v4 - 1;
                v2 = v3;
            }
        }
        return this.f[v3];
    }

    @RestrictTo({Scope.c})
    int f() {
        return Math.round(this.e);
    }

    @RestrictTo({Scope.c})
    int g() {
        return Math.round(this.d);
    }

    @RestrictTo({Scope.c})
    int h() {
        return Math.round(this.c);
    }

    @RestrictTo({Scope.c})
    int[] i() {
        return this.f;
    }

    @RestrictTo({Scope.c})
    int j() {
        return this.a;
    }

    @Nullable
    private static Method k(@NonNull String s) {
        try {
            Method method0 = (Method)AppCompatTextViewAutoSizeHelper.q.get(s);
            if(method0 == null) {
                method0 = TextView.class.getDeclaredMethod(s, null);
                if(method0 != null) {
                    method0.setAccessible(true);
                    AppCompatTextViewAutoSizeHelper.q.put(s, method0);
                    return method0;
                }
            }
            return method0;
        }
        catch(Exception exception0) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + s + "() method", exception0);
            return null;
        }
    }

    @VisibleForTesting
    void l(int v) {
        TextPaint textPaint0 = this.h;
        if(textPaint0 == null) {
            this.h = new TextPaint();
        }
        else {
            textPaint0.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize(((float)v));
    }

    @SuppressLint({"BanUncheckedReflection"})
    static Object m(@NonNull Object object0, @NonNull String s, @NonNull Object object1) {
        try {
            return AppCompatTextViewAutoSizeHelper.k(s).invoke(object0, null);
        }
        catch(Exception exception0) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + s + "() method", exception0);
            return object1;
        }
    }

    @RestrictTo({Scope.c})
    boolean n() {
        return this.y() && this.a != 0;
    }

    void o(@Nullable AttributeSet attributeSet0, int v) {
        TypedArray typedArray0 = this.j.obtainStyledAttributes(attributeSet0, styleable.AppCompatTextView, v, 0);
        Context context0 = this.i.getContext();
        ViewCompat.H1(this.i, context0, styleable.AppCompatTextView, attributeSet0, typedArray0, v, 0);
        if(typedArray0.hasValue(styleable.AppCompatTextView_autoSizeTextType)) {
            this.a = typedArray0.getInt(5, 0);
        }
        float f = typedArray0.hasValue(styleable.AppCompatTextView_autoSizeStepGranularity) ? typedArray0.getDimension(4, -1.0f) : -1.0f;
        float f1 = typedArray0.hasValue(styleable.AppCompatTextView_autoSizeMinTextSize) ? typedArray0.getDimension(2, -1.0f) : -1.0f;
        float f2 = typedArray0.hasValue(styleable.AppCompatTextView_autoSizeMaxTextSize) ? typedArray0.getDimension(1, -1.0f) : -1.0f;
        if(typedArray0.hasValue(styleable.AppCompatTextView_autoSizePresetSizes)) {
            int v1 = typedArray0.getResourceId(3, 0);
            if(v1 > 0) {
                TypedArray typedArray1 = typedArray0.getResources().obtainTypedArray(v1);
                this.v(typedArray1);
                typedArray1.recycle();
            }
        }
        typedArray0.recycle();
        if(!this.y()) {
            this.a = 0;
        }
        else if(this.a == 1) {
            if(!this.g) {
                DisplayMetrics displayMetrics0 = this.j.getResources().getDisplayMetrics();
                if(f1 == -1.0f) {
                    f1 = TypedValue.applyDimension(2, 12.0f, displayMetrics0);
                }
                if(f2 == -1.0f) {
                    f2 = TypedValue.applyDimension(2, 112.0f, displayMetrics0);
                }
                if(f == -1.0f) {
                    f = 1.0f;
                }
                this.z(f1, f2, f);
            }
            this.u();
        }
    }

    @RestrictTo({Scope.c})
    void p(int v, int v1, int v2, int v3) throws IllegalArgumentException {
        if(this.y()) {
            DisplayMetrics displayMetrics0 = this.j.getResources().getDisplayMetrics();
            this.z(TypedValue.applyDimension(v3, ((float)v), displayMetrics0), TypedValue.applyDimension(v3, ((float)v1), displayMetrics0), TypedValue.applyDimension(v3, ((float)v2), displayMetrics0));
            if(this.u()) {
                this.a();
            }
        }
    }

    @RestrictTo({Scope.c})
    void q(@NonNull int[] arr_v, int v) throws IllegalArgumentException {
        if(this.y()) {
            if(arr_v.length > 0) {
                int[] arr_v1 = new int[arr_v.length];
                if(v == 0) {
                    arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
                }
                else {
                    DisplayMetrics displayMetrics0 = this.j.getResources().getDisplayMetrics();
                    for(int v1 = 0; v1 < arr_v.length; ++v1) {
                        arr_v1[v1] = Math.round(TypedValue.applyDimension(v, ((float)arr_v[v1]), displayMetrics0));
                    }
                }
                this.f = this.b(arr_v1);
                if(!this.w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(arr_v));
                }
            }
            else {
                this.g = false;
            }
            if(this.u()) {
                this.a();
            }
        }
    }

    @RestrictTo({Scope.c})
    void r(int v) {
        if(this.y()) {
            switch(v) {
                case 0: {
                    this.c();
                    return;
                }
                case 1: {
                    DisplayMetrics displayMetrics0 = this.j.getResources().getDisplayMetrics();
                    this.z(TypedValue.applyDimension(2, 12.0f, displayMetrics0), TypedValue.applyDimension(2, 112.0f, displayMetrics0), 1.0f);
                    if(this.u()) {
                        this.a();
                        return;
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown auto-size text type: " + v);
                }
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private void s(float f) {
        if(f != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f);
            boolean z = this.i.isInLayout();
            if(this.i.getLayout() != null) {
                try {
                    this.b = false;
                    Method method0 = AppCompatTextViewAutoSizeHelper.k("nullLayouts");
                    if(method0 != null) {
                        method0.invoke(this.i, null);
                    }
                }
                catch(Exception exception0) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", exception0);
                }
                if(z) {
                    this.i.forceLayout();
                }
                else {
                    this.i.requestLayout();
                }
                this.i.invalidate();
            }
        }
    }

    @RestrictTo({Scope.c})
    void t(int v, float f) {
        this.s(TypedValue.applyDimension(v, f, (this.j == null ? Resources.getSystem() : this.j.getResources()).getDisplayMetrics()));
    }

    private boolean u() {
        if(this.y() && this.a == 1) {
            if(!this.g || this.f.length == 0) {
                int v1 = ((int)Math.floor((this.e - this.d) / this.c)) + 1;
                int[] arr_v = new int[v1];
                for(int v = 0; v < v1; ++v) {
                    arr_v[v] = Math.round(this.d + ((float)v) * this.c);
                }
                this.f = this.b(arr_v);
            }
            this.b = true;
            return true;
        }
        this.b = false;
        return false;
    }

    private void v(TypedArray typedArray0) {
        int v = typedArray0.length();
        int[] arr_v = new int[v];
        if(v > 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                arr_v[v1] = typedArray0.getDimensionPixelSize(v1, -1);
            }
            this.f = this.b(arr_v);
            this.w();
        }
    }

    private boolean w() {
        int[] arr_v = this.f;
        boolean z = arr_v.length > 0;
        this.g = z;
        if(z) {
            this.a = 1;
            this.d = (float)arr_v[0];
            this.e = (float)arr_v[arr_v.length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    private boolean x(int v, RectF rectF0) {
        CharSequence charSequence0 = this.i.getText();
        TransformationMethod transformationMethod0 = this.i.getTransformationMethod();
        if(transformationMethod0 != null) {
            CharSequence charSequence1 = transformationMethod0.getTransformation(charSequence0, this.i);
            if(charSequence1 != null) {
                charSequence0 = charSequence1;
            }
        }
        int v1 = this.i.getMaxLines();
        this.l(v);
        StaticLayout staticLayout0 = this.d(charSequence0, ((Layout.Alignment)AppCompatTextViewAutoSizeHelper.m(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)), Math.round(rectF0.right), v1);
        return v1 == -1 || staticLayout0.getLineCount() <= v1 && staticLayout0.getLineEnd(staticLayout0.getLineCount() - 1) == charSequence0.length() ? ((float)staticLayout0.getHeight()) <= rectF0.bottom : false;
    }

    private boolean y() {
        return !(this.i instanceof AppCompatEditText);
    }

    private void z(float f, float f1, float f2) throws IllegalArgumentException {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if(f1 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f1 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if(f2 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f2 + "px) is less or equal to (0px)");
        }
        this.a = 1;
        this.d = f;
        this.e = f1;
        this.c = f2;
        this.g = false;
    }
}

