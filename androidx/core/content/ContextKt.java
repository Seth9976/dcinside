package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ContextKt {
    public static final Object a(Context context0) {
        L.y(4, "T");
        return ContextCompat.getSystemService(context0, Object.class);
    }

    public static final void b(@l Context context0, @StyleRes int v, @l int[] arr_v, @l Function1 function10) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, arr_v);
        function10.invoke(typedArray0);
        typedArray0.recycle();
    }

    public static final void c(@l Context context0, @m AttributeSet attributeSet0, @l int[] arr_v, @AttrRes int v, @StyleRes int v1, @l Function1 function10) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, arr_v, v, v1);
        function10.invoke(typedArray0);
        typedArray0.recycle();
    }

    public static void d(Context context0, AttributeSet attributeSet0, int[] arr_v, int v, int v1, Function1 function10, int v2, Object object0) {
        if((v2 & 1) != 0) {
            attributeSet0 = null;
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, arr_v, v, v1);
        function10.invoke(typedArray0);
        typedArray0.recycle();
    }
}

