package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RequiresApi(19)
@RestrictTo({Scope.b})
public final class TypefaceEmojiSpan extends EmojiSpan {
    @Nullable
    private TextPaint f;
    @Nullable
    private static Paint g;

    public TypefaceEmojiSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
        super(typefaceEmojiRasterizer0);
    }

    @Override  // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas0, @SuppressLint({"UnknownNullness"}) CharSequence charSequence0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, float f, int v2, int v3, int v4, @NonNull Paint paint0) {
        TextPaint textPaint0 = this.f(charSequence0, v, v1, paint0);
        if(textPaint0 != null && textPaint0.bgColor != 0) {
            this.g(canvas0, textPaint0, f, f + ((float)this.e()), ((float)v2), ((float)v4));
        }
        if(EmojiCompat.c().r()) {
            canvas0.drawRect(f, ((float)v2), f + ((float)this.e()), ((float)v4), TypefaceEmojiSpan.h());
        }
        TypefaceEmojiRasterizer typefaceEmojiRasterizer0 = this.d();
        if(textPaint0 != null) {
            paint0 = textPaint0;
        }
        typefaceEmojiRasterizer0.a(canvas0, f, ((float)v3), paint0);
    }

    @Nullable
    private TextPaint f(@Nullable CharSequence charSequence0, int v, int v1, Paint paint0) {
        if(charSequence0 instanceof Spanned) {
            CharacterStyle[] arr_characterStyle = (CharacterStyle[])((Spanned)charSequence0).getSpans(v, v1, CharacterStyle.class);
            if(arr_characterStyle.length != 0 && (arr_characterStyle.length != 1 || arr_characterStyle[0] != this)) {
                TextPaint textPaint0 = this.f;
                if(textPaint0 == null) {
                    textPaint0 = new TextPaint();
                    this.f = textPaint0;
                }
                textPaint0.set(paint0);
                for(int v2 = 0; v2 < arr_characterStyle.length; ++v2) {
                    arr_characterStyle[v2].updateDrawState(textPaint0);
                }
                return textPaint0;
            }
            return paint0 instanceof TextPaint ? ((TextPaint)paint0) : null;
        }
        return paint0 instanceof TextPaint ? ((TextPaint)paint0) : null;
    }

    void g(Canvas canvas0, TextPaint textPaint0, float f, float f1, float f2, float f3) {
        int v = textPaint0.getColor();
        Paint.Style paint$Style0 = textPaint0.getStyle();
        textPaint0.setColor(textPaint0.bgColor);
        textPaint0.setStyle(Paint.Style.FILL);
        canvas0.drawRect(f, f2, f1, f3, textPaint0);
        textPaint0.setStyle(paint$Style0);
        textPaint0.setColor(v);
    }

    @NonNull
    private static Paint h() {
        if(TypefaceEmojiSpan.g == null) {
            TextPaint textPaint0 = new TextPaint();
            TypefaceEmojiSpan.g = textPaint0;
            textPaint0.setColor(EmojiCompat.c().g());
            TypefaceEmojiSpan.g.setStyle(Paint.Style.FILL);
        }
        return TypefaceEmojiSpan.g;
    }
}

