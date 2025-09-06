package androidx.emoji2.text;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.text.b;
import j..util.stream.IntStream.Wrapper;
import j..util.stream.IntStream;

class UnprecomputeTextOnModificationSpannable implements Spannable {
    @RequiresApi(24)
    static class CharSequenceHelper_API24 {
        static IntStream a(CharSequence charSequence0) {
            return h.a(charSequence0);
        }

        static IntStream b(CharSequence charSequence0) {
            return g.a(charSequence0);
        }
    }

    static class PrecomputedTextDetector {
        boolean a(CharSequence charSequence0) {
            return charSequence0 instanceof PrecomputedTextCompat;
        }
    }

    @RequiresApi(28)
    static class PrecomputedTextDetector_28 extends PrecomputedTextDetector {
        // 去混淆评级： 低(20)
        @Override  // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector
        boolean a(CharSequence charSequence0) {
            return b.a(charSequence0) || charSequence0 instanceof PrecomputedTextCompat;
        }
    }

    private boolean a;
    @NonNull
    private Spannable b;

    UnprecomputeTextOnModificationSpannable(@NonNull Spannable spannable0) {
        this.a = false;
        this.b = spannable0;
    }

    UnprecomputeTextOnModificationSpannable(@NonNull Spanned spanned0) {
        this.a = false;
        this.b = new SpannableString(spanned0);
    }

    UnprecomputeTextOnModificationSpannable(@NonNull CharSequence charSequence0) {
        this.a = false;
        this.b = new SpannableString(charSequence0);
    }

    private void a() {
        Spannable spannable0 = this.b;
        if(!this.a && UnprecomputeTextOnModificationSpannable.c().a(spannable0)) {
            this.b = new SpannableString(spannable0);
        }
        this.a = true;
    }

    Spannable b() {
        return this.b;
    }

    static PrecomputedTextDetector c() {
        return Build.VERSION.SDK_INT < 28 ? new PrecomputedTextDetector() : new PrecomputedTextDetector_28();
    }

    @Override
    public char charAt(int v) {
        return this.b.charAt(v);
    }

    @NonNull
    @RequiresApi(api = 24)
    public IntStream chars() {
        return CharSequenceHelper_API24.a(this.b);
    }

    @Override
    public java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(this.chars());
    }

    @NonNull
    @RequiresApi(api = 24)
    public IntStream codePoints() {
        return CharSequenceHelper_API24.b(this.b);
    }

    @Override
    public java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(this.codePoints());
    }

    @Override  // android.text.Spanned
    public int getSpanEnd(Object object0) {
        return this.b.getSpanEnd(object0);
    }

    @Override  // android.text.Spanned
    public int getSpanFlags(Object object0) {
        return this.b.getSpanFlags(object0);
    }

    @Override  // android.text.Spanned
    public int getSpanStart(Object object0) {
        return this.b.getSpanStart(object0);
    }

    @Override  // android.text.Spanned
    public Object[] getSpans(int v, int v1, Class class0) {
        return this.b.getSpans(v, v1, class0);
    }

    @Override
    public int length() {
        return this.b.length();
    }

    @Override  // android.text.Spanned
    public int nextSpanTransition(int v, int v1, Class class0) {
        return this.b.nextSpanTransition(v, v1, class0);
    }

    @Override  // android.text.Spannable
    public void removeSpan(Object object0) {
        this.a();
        this.b.removeSpan(object0);
    }

    @Override  // android.text.Spannable
    public void setSpan(Object object0, int v, int v1, int v2) {
        this.a();
        this.b.setSpan(object0, v, v1, v2);
    }

    @Override
    @NonNull
    public CharSequence subSequence(int v, int v1) {
        return this.b.subSequence(v, v1);
    }

    @Override
    @NonNull
    public String toString() {
        return this.b.toString();
    }
}

