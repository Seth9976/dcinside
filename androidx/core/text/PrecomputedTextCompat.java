package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Trace;
import android.text.Layout.Alignment;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class PrecomputedTextCompat implements Spannable {
    @RequiresApi(28)
    static class Api28Impl {
        static Spannable a(PrecomputedText precomputedText0) [...] // Inlined contents
    }

    public static final class Params {
        public static class Builder {
            private final TextPaint a;
            private TextDirectionHeuristic b;
            private int c;
            private int d;

            public Builder(TextPaint textPaint0) {
                this.a = textPaint0;
                if(Build.VERSION.SDK_INT >= 23) {
                    this.c = 1;
                    this.d = 1;
                }
                else {
                    this.d = 0;
                    this.c = 0;
                }
                this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public Params a() {
                return new Params(this.a, this.b, this.c, this.d);
            }

            @RequiresApi(23)
            public Builder b(int v) {
                this.c = v;
                return this;
            }

            @RequiresApi(23)
            public Builder c(int v) {
                this.d = v;
                return this;
            }

            public Builder d(TextDirectionHeuristic textDirectionHeuristic0) {
                this.b = textDirectionHeuristic0;
                return this;
            }
        }

        private final TextPaint a;
        private final TextDirectionHeuristic b;
        private final int c;
        private final int d;
        final PrecomputedText.Params e;

        @RequiresApi(28)
        public Params(PrecomputedText.Params precomputedText$Params0) {
            this.a = precomputedText$Params0.getTextPaint();
            this.b = precomputedText$Params0.getTextDirection();
            this.c = precomputedText$Params0.getBreakStrategy();
            this.d = precomputedText$Params0.getHyphenationFrequency();
            if(Build.VERSION.SDK_INT < 29) {
                precomputedText$Params0 = null;
            }
            this.e = precomputedText$Params0;
        }

        Params(TextPaint textPaint0, TextDirectionHeuristic textDirectionHeuristic0, int v, int v1) {
            this.e = Build.VERSION.SDK_INT >= 29 ? k.a(textPaint0).setBreakStrategy(v).setHyphenationFrequency(v1).setTextDirection(textDirectionHeuristic0).build() : null;
            this.a = textPaint0;
            this.b = textDirectionHeuristic0;
            this.c = v;
            this.d = v1;
        }

        @RestrictTo({Scope.c})
        public boolean a(Params precomputedTextCompat$Params0) {
            int v = Build.VERSION.SDK_INT;
            if(v >= 23) {
                if(this.c != precomputedTextCompat$Params0.b()) {
                    return false;
                }
                if(this.d != precomputedTextCompat$Params0.c()) {
                    return false;
                }
            }
            if(this.a.getTextSize() != precomputedTextCompat$Params0.e().getTextSize()) {
                return false;
            }
            if(this.a.getTextScaleX() != precomputedTextCompat$Params0.e().getTextScaleX()) {
                return false;
            }
            if(this.a.getTextSkewX() != precomputedTextCompat$Params0.e().getTextSkewX()) {
                return false;
            }
            if(this.a.getLetterSpacing() != precomputedTextCompat$Params0.e().getLetterSpacing()) {
                return false;
            }
            if(!TextUtils.equals(this.a.getFontFeatureSettings(), precomputedTextCompat$Params0.e().getFontFeatureSettings())) {
                return false;
            }
            if(this.a.getFlags() != precomputedTextCompat$Params0.e().getFlags()) {
                return false;
            }
            if(v >= 24) {
                if(!this.a.getTextLocales().equals(precomputedTextCompat$Params0.e().getTextLocales())) {
                    return false;
                }
            }
            else if(!this.a.getTextLocale().equals(precomputedTextCompat$Params0.e().getTextLocale())) {
                return false;
            }
            return this.a.getTypeface() == null ? precomputedTextCompat$Params0.e().getTypeface() == null : this.a.getTypeface().equals(precomputedTextCompat$Params0.e().getTypeface());
        }

        @RequiresApi(23)
        public int b() {
            return this.c;
        }

        @RequiresApi(23)
        public int c() {
            return this.d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.a;
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(!(object0 instanceof Params)) {
                return false;
            }
            return this.a(((Params)object0)) ? this.b == ((Params)object0).d() : false;
        }

        @Override
        public int hashCode() {
            return Build.VERSION.SDK_INT < 24 ? ObjectsCompat.b(new Object[]{this.a.getTextSize(), this.a.getTextScaleX(), this.a.getTextSkewX(), this.a.getLetterSpacing(), this.a.getFlags(), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, this.c, this.d}) : ObjectsCompat.b(new Object[]{this.a.getTextSize(), this.a.getTextScaleX(), this.a.getTextSkewX(), this.a.getLetterSpacing(), this.a.getFlags(), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, this.c, this.d});
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("{");
            stringBuilder0.append("textSize=" + this.a.getTextSize());
            stringBuilder0.append(", textScaleX=" + this.a.getTextScaleX());
            stringBuilder0.append(", textSkewX=" + this.a.getTextSkewX());
            int v = Build.VERSION.SDK_INT;
            stringBuilder0.append(", letterSpacing=" + this.a.getLetterSpacing());
            stringBuilder0.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            if(v >= 24) {
                stringBuilder0.append(", textLocale=" + this.a.getTextLocales());
            }
            else {
                stringBuilder0.append(", textLocale=" + this.a.getTextLocale());
            }
            stringBuilder0.append(", typeface=" + this.a.getTypeface());
            if(v >= 26) {
                stringBuilder0.append(", variationSettings=" + this.a.getFontVariationSettings());
            }
            stringBuilder0.append(", textDir=" + this.b);
            stringBuilder0.append(", breakStrategy=" + this.c);
            stringBuilder0.append(", hyphenationFrequency=" + this.d);
            stringBuilder0.append("}");
            return stringBuilder0.toString();
        }
    }

    static class PrecomputedTextFutureTask extends FutureTask {
        static class PrecomputedTextCallback implements Callable {
            private Params a;
            private CharSequence b;

            PrecomputedTextCallback(Params precomputedTextCompat$Params0, CharSequence charSequence0) {
                this.a = precomputedTextCompat$Params0;
                this.b = charSequence0;
            }

            public PrecomputedTextCompat a() throws Exception {
                return PrecomputedTextCompat.a(this.b, this.a);
            }

            @Override
            public Object call() throws Exception {
                return this.a();
            }
        }

        PrecomputedTextFutureTask(Params precomputedTextCompat$Params0, CharSequence charSequence0) {
            super(new PrecomputedTextCallback(precomputedTextCompat$Params0, charSequence0));
        }
    }

    private final Spannable a;
    private final Params b;
    private final int[] c;
    private final PrecomputedText d;
    private static final char e = '\n';
    private static final Object f;
    @GuardedBy("sLock")
    private static Executor g;

    static {
        PrecomputedTextCompat.f = new Object();
    }

    @RequiresApi(28)
    private PrecomputedTextCompat(PrecomputedText precomputedText0, Params precomputedTextCompat$Params0) {
        this.a = precomputedText0;
        this.b = precomputedTextCompat$Params0;
        this.c = null;
        if(Build.VERSION.SDK_INT < 29) {
            precomputedText0 = null;
        }
        this.d = precomputedText0;
    }

    private PrecomputedTextCompat(CharSequence charSequence0, Params precomputedTextCompat$Params0, int[] arr_v) {
        this.a = new SpannableString(charSequence0);
        this.b = precomputedTextCompat$Params0;
        this.c = arr_v;
        this.d = null;
    }

    @SuppressLint({"WrongConstant"})
    public static PrecomputedTextCompat a(CharSequence charSequence0, Params precomputedTextCompat$Params0) {
        Preconditions.l(charSequence0);
        Preconditions.l(precomputedTextCompat$Params0);
        try {
            Trace.beginSection("PrecomputedText");
            if(Build.VERSION.SDK_INT >= 29) {
                PrecomputedText.Params precomputedText$Params0 = precomputedTextCompat$Params0.e;
                if(precomputedText$Params0 != null) {
                    return new PrecomputedTextCompat(PrecomputedText.create(charSequence0, precomputedText$Params0), precomputedTextCompat$Params0);
                }
            }
            ArrayList arrayList0 = new ArrayList();
            int v1 = charSequence0.length();
            int v2 = 0;
            while(v2 < v1) {
                int v3 = TextUtils.indexOf(charSequence0, '\n', v2, v1);
                v2 = v3 >= 0 ? v3 + 1 : v1;
                arrayList0.add(v2);
            }
            int[] arr_v = new int[arrayList0.size()];
            for(int v4 = 0; v4 < arrayList0.size(); ++v4) {
                arr_v[v4] = (int)(((Integer)arrayList0.get(v4)));
            }
            if(Build.VERSION.SDK_INT >= 23) {
                StaticLayout.Builder.obtain(charSequence0, 0, charSequence0.length(), precomputedTextCompat$Params0.e(), 0x7FFFFFFF).setBreakStrategy(precomputedTextCompat$Params0.b()).setHyphenationFrequency(precomputedTextCompat$Params0.c()).setTextDirection(precomputedTextCompat$Params0.d()).build();
            }
            else {
                new StaticLayout(charSequence0, precomputedTextCompat$Params0.e(), 0x7FFFFFFF, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return new PrecomputedTextCompat(charSequence0, precomputedTextCompat$Params0, arr_v);
        }
        finally {
            Trace.endSection();
        }
    }

    @IntRange(from = 0L)
    public int b() {
        return Build.VERSION.SDK_INT < 29 ? this.c.length : this.d.getParagraphCount();
    }

    @IntRange(from = 0L)
    public int c(@IntRange(from = 0L) int v) {
        Preconditions.g(v, 0, this.b(), "paraIndex");
        return Build.VERSION.SDK_INT < 29 ? this.c[v] : this.d.getParagraphEnd(v);
    }

    @Override
    public char charAt(int v) {
        return this.a.charAt(v);
    }

    @IntRange(from = 0L)
    public int d(@IntRange(from = 0L) int v) {
        Preconditions.g(v, 0, this.b(), "paraIndex");
        if(Build.VERSION.SDK_INT >= 29) {
            return this.d.getParagraphStart(v);
        }
        return v == 0 ? 0 : this.c[v - 1];
    }

    public Params e() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    @RequiresApi(28)
    @RestrictTo({Scope.c})
    public PrecomputedText f() {
        return b.a(this.a) ? ((PrecomputedText)this.a) : null;
    }

    @UiThread
    public static Future g(CharSequence charSequence0, Params precomputedTextCompat$Params0, Executor executor0) {
        Future future0 = new PrecomputedTextFutureTask(precomputedTextCompat$Params0, charSequence0);
        if(executor0 == null) {
            synchronized(PrecomputedTextCompat.f) {
                if(PrecomputedTextCompat.g == null) {
                    PrecomputedTextCompat.g = Executors.newFixedThreadPool(1);
                }
                executor0 = PrecomputedTextCompat.g;
            }
        }
        executor0.execute(((Runnable)future0));
        return future0;
    }

    @Override  // android.text.Spanned
    public int getSpanEnd(Object object0) {
        return this.a.getSpanEnd(object0);
    }

    @Override  // android.text.Spanned
    public int getSpanFlags(Object object0) {
        return this.a.getSpanFlags(object0);
    }

    @Override  // android.text.Spanned
    public int getSpanStart(Object object0) {
        return this.a.getSpanStart(object0);
    }

    @Override  // android.text.Spanned
    public Object[] getSpans(int v, int v1, Class class0) {
        return Build.VERSION.SDK_INT < 29 ? this.a.getSpans(v, v1, class0) : this.d.getSpans(v, v1, class0);
    }

    @Override
    public int length() {
        return this.a.length();
    }

    @Override  // android.text.Spanned
    public int nextSpanTransition(int v, int v1, Class class0) {
        return this.a.nextSpanTransition(v, v1, class0);
    }

    @Override  // android.text.Spannable
    public void removeSpan(Object object0) {
        if(object0 instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if(Build.VERSION.SDK_INT >= 29) {
            this.d.removeSpan(object0);
            return;
        }
        this.a.removeSpan(object0);
    }

    @Override  // android.text.Spannable
    public void setSpan(Object object0, int v, int v1, int v2) {
        if(object0 instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if(Build.VERSION.SDK_INT >= 29) {
            this.d.setSpan(object0, v, v1, v2);
            return;
        }
        this.a.setSpan(object0, v, v1, v2);
    }

    @Override
    public CharSequence subSequence(int v, int v1) {
        return this.a.subSequence(v, v1);
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

