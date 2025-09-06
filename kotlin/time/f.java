package kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class f {
    private static final boolean a = false;
    @l
    private static final ThreadLocal[] b;

    static {
        ThreadLocal[] arr_threadLocal = new ThreadLocal[4];
        for(int v = 0; v < 4; ++v) {
            arr_threadLocal[v] = new ThreadLocal();
        }
        f.b = arr_threadLocal;
    }

    private static final DecimalFormat a(int v) {
        DecimalFormat decimalFormat0 = new DecimalFormat("0");
        if(v > 0) {
            decimalFormat0.setMinimumFractionDigits(v);
        }
        decimalFormat0.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat0;
    }

    @l
    public static final String b(double f, int v) {
        DecimalFormat decimalFormat1;
        ThreadLocal[] arr_threadLocal = f.b;
        if(v < arr_threadLocal.length) {
            ThreadLocal threadLocal0 = arr_threadLocal[v];
            DecimalFormat decimalFormat0 = threadLocal0.get();
            if(decimalFormat0 == null) {
                decimalFormat0 = f.a(v);
                threadLocal0.set(decimalFormat0);
            }
            else {
                L.m(decimalFormat0);
            }
            decimalFormat1 = decimalFormat0;
        }
        else {
            decimalFormat1 = f.a(v);
        }
        String s = decimalFormat1.format(f);
        L.o(s, "format(...)");
        return s;
    }

    public static final boolean c() [...] // 潜在的解密器
}

