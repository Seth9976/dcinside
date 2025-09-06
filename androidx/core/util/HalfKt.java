package androidx.core.util;

import android.util.Half;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nHalf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n1#1,55:1\n40#1:56\n*S KotlinDebug\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n47#1:56\n*E\n"})
public final class HalfKt {
    @RequiresApi(26)
    @l
    public static final Half a(double f) {
        return Half.valueOf(((float)f));
    }

    @RequiresApi(26)
    @l
    public static final Half b(float f) {
        return Half.valueOf(f);
    }

    @RequiresApi(26)
    @l
    public static final Half c(@l String s) {
        return Half.valueOf(s);
    }

    @RequiresApi(26)
    @l
    public static final Half d(short v) {
        return Half.valueOf(v);
    }
}

