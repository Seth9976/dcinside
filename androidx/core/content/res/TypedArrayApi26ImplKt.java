package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

@RequiresApi(26)
final class TypedArrayApi26ImplKt {
    @l
    public static final TypedArrayApi26ImplKt a;

    static {
        TypedArrayApi26ImplKt.a = new TypedArrayApi26ImplKt();
    }

    @l
    @n
    public static final Typeface a(@l TypedArray typedArray0, @StyleableRes int v) {
        Typeface typeface0 = typedArray0.getFont(v);
        L.m(typeface0);
        return typeface0;
    }
}

