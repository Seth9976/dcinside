package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

@RequiresApi(19)
public abstract class EmojiSpan extends ReplacementSpan {
    private final Paint.FontMetricsInt a;
    @NonNull
    private final TypefaceEmojiRasterizer b;
    private short c;
    private short d;
    private float e;

    @RestrictTo({Scope.a})
    EmojiSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
        this.a = new Paint.FontMetricsInt();
        this.c = -1;
        this.d = -1;
        this.e = 1.0f;
        Preconditions.m(typefaceEmojiRasterizer0, "rasterizer cannot be null");
        this.b = typefaceEmojiRasterizer0;
    }

    @RestrictTo({Scope.e})
    public final int a() {
        return this.d;
    }

    @RestrictTo({Scope.e})
    public final int b() {
        return this.d().g();
    }

    @RestrictTo({Scope.a})
    final float c() {
        return this.e;
    }

    @NonNull
    public final TypefaceEmojiRasterizer d() {
        return this.b;
    }

    @RestrictTo({Scope.a})
    final int e() {
        return this.c;
    }

    @Override  // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint0, @SuppressLint({"UnknownNullness"}) CharSequence charSequence0, int v, int v1, @Nullable Paint.FontMetricsInt paint$FontMetricsInt0) {
        paint0.getFontMetricsInt(this.a);
        this.e = ((float)Math.abs(this.a.descent - this.a.ascent)) * 1.0f / ((float)this.b.f());
        this.d = (short)(((int)(((float)this.b.f()) * this.e)));
        short v2 = (short)(((int)(((float)this.b.k()) * this.e)));
        this.c = v2;
        if(paint$FontMetricsInt0 != null) {
            paint$FontMetricsInt0.ascent = this.a.ascent;
            paint$FontMetricsInt0.descent = this.a.descent;
            paint$FontMetricsInt0.top = this.a.top;
            paint$FontMetricsInt0.bottom = this.a.bottom;
        }
        return v2;
    }
}

