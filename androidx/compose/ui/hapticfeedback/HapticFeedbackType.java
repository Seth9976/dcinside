package androidx.compose.ui.hapticfeedback;

import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class HapticFeedbackType {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final int a() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int b() [...] // 潜在的解密器

        // 去混淆评级： 低(40)
        @l
        public final List c() {
            return u.O(new HapticFeedbackType[]{HapticFeedbackType.a(0), HapticFeedbackType.a(9)});
        }
    }

    private final int a;
    @l
    public static final Companion b;

    static {
        HapticFeedbackType.b = new Companion(null);
    }

    private HapticFeedbackType(int v) {
        this.a = v;
    }

    public static final HapticFeedbackType a(int v) {
        return new HapticFeedbackType(v);
    }

    public static int b(int v) [...] // Inlined contents

    public static boolean c(int v, Object object0) {
        return object0 instanceof HapticFeedbackType ? v == ((HapticFeedbackType)object0).g() : false;
    }

    public static final boolean d(int v, int v1) {
        return v == v1;
    }

    public static int e(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return HapticFeedbackType.c(this.a, object0);
    }

    // 去混淆评级： 低(23)
    @l
    public static String f(int v) {
        if(HapticFeedbackType.d(v, 0)) {
            return "LongPress";
        }
        return HapticFeedbackType.d(v, 9) ? "TextHandleMove" : "Invalid";
    }

    public final int g() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return HapticFeedbackType.f(this.a);
    }
}

