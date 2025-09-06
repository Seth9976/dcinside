package kotlinx.coroutines.internal;

import kotlin.f0;
import kotlin.jvm.internal.s0;

@s0({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
public final class s {
    private static final boolean a;

    static {
        try {
            Class.forName("android.os.Build");
        }
        catch(Throwable throwable0) {
            f0.a(throwable0);
        }
    }

    public static final boolean a() [...] // Inlined contents
}

