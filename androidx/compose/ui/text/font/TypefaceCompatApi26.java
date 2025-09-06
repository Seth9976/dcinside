package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.TempListUtilsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(26)
final class TypefaceCompatApi26 {
    @l
    public static final TypefaceCompatApi26 a;
    @l
    private static ThreadLocal b;

    static {
        TypefaceCompatApi26.a = new TypefaceCompatApi26();
        TypefaceCompatApi26.b = new ThreadLocal();
    }

    @ExperimentalTextApi
    @m
    public final Typeface a(@m Typeface typeface0, @l Settings fontVariation$Settings0, @l Context context0) {
        L.p(fontVariation$Settings0, "variationSettings");
        L.p(context0, "context");
        if(typeface0 == null) {
            return null;
        }
        if(fontVariation$Settings0.b().isEmpty()) {
            return typeface0;
        }
        Paint paint0 = (Paint)TypefaceCompatApi26.b.get();
        if(paint0 == null) {
            paint0 = new Paint();
            TypefaceCompatApi26.b.set(paint0);
        }
        paint0.setTypeface(typeface0);
        paint0.setFontVariationSettings(this.b(fontVariation$Settings0, context0));
        return paint0.getTypeface();
    }

    @ExperimentalTextApi
    private final String b(Settings fontVariation$Settings0, Context context0) {
        return TempListUtilsKt.l(fontVariation$Settings0.b(), null, null, null, 0, null, new Function1() {
            final Density e;

            {
                this.e = density0;
                super(1);
            }

            @l
            public final CharSequence a(@l Setting fontVariation$Setting0) {
                L.p(fontVariation$Setting0, "setting");
                return '\'' + fontVariation$Setting0.a() + "\' " + fontVariation$Setting0.c(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Setting)object0));
            }
        }, 0x1F, null);
    }
}

