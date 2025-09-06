package androidx.emoji2.text;

import android.os.Build.VERSION;
import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PaintCompat;

@AnyThread
@RestrictTo({Scope.a})
class DefaultGlyphChecker implements GlyphChecker {
    private final TextPaint a;
    private static final int b = 10;
    private static final ThreadLocal c;

    static {
        DefaultGlyphChecker.c = new ThreadLocal();
    }

    DefaultGlyphChecker() {
        TextPaint textPaint0 = new TextPaint();
        this.a = textPaint0;
        textPaint0.setTextSize(10.0f);
    }

    @Override  // androidx.emoji2.text.EmojiCompat$GlyphChecker
    public boolean a(@NonNull CharSequence charSequence0, int v, int v1, int v2) {
        if(Build.VERSION.SDK_INT < 23 && v2 > Build.VERSION.SDK_INT) {
            return false;
        }
        StringBuilder stringBuilder0 = DefaultGlyphChecker.b();
        stringBuilder0.setLength(0);
        while(v < v1) {
            stringBuilder0.append(charSequence0.charAt(v));
            ++v;
        }
        return PaintCompat.a(this.a, stringBuilder0.toString());
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal0 = DefaultGlyphChecker.c;
        if(threadLocal0.get() == null) {
            threadLocal0.set(new StringBuilder());
        }
        return (StringBuilder)threadLocal0.get();
    }
}

