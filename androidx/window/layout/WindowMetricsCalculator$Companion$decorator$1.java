package androidx.window.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class WindowMetricsCalculator.Companion.decorator.1 extends N implements Function1 {
    public static final WindowMetricsCalculator.Companion.decorator.1 e;

    static {
        WindowMetricsCalculator.Companion.decorator.1.e = new WindowMetricsCalculator.Companion.decorator.1();
    }

    WindowMetricsCalculator.Companion.decorator.1() {
        super(1);
    }

    @l
    public final WindowMetricsCalculator a(@l WindowMetricsCalculator windowMetricsCalculator0) {
        L.p(windowMetricsCalculator0, "it");
        return windowMetricsCalculator0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((WindowMetricsCalculator)object0));
    }
}

