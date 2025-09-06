package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import z3.n;

public interface WindowMetricsCalculator {
    public static final class Companion {
        static final Companion a;
        @l
        private static Function1 b;

        static {
            Companion.a = new Companion();
            Companion.b = WindowMetricsCalculator.Companion.decorator.1.e;
        }

        @l
        @n
        public final WindowMetricsCalculator a() {
            return (WindowMetricsCalculator)Companion.b.invoke(WindowMetricsCalculatorCompat.b);
        }

        @RestrictTo({Scope.e})
        @ExperimentalWindowApi
        @n
        public final void b(@l WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator0) {
            L.p(windowMetricsCalculatorDecorator0, "overridingDecorator");
            Companion.b = new Function1() {
                {
                    super(1, object0, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
                }

                @l
                public final WindowMetricsCalculator a(@l WindowMetricsCalculator windowMetricsCalculator0) {
                    L.p(windowMetricsCalculator0, "p0");
                    return ((WindowMetricsCalculatorDecorator)this.receiver).a(windowMetricsCalculator0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((WindowMetricsCalculator)object0));
                }
            };
        }

        @RestrictTo({Scope.e})
        @ExperimentalWindowApi
        @n
        public final void c() {
            Companion.b = androidx.window.layout.WindowMetricsCalculator.Companion.reset.1.e;

            final class androidx.window.layout.WindowMetricsCalculator.Companion.reset.1 extends N implements Function1 {
                public static final androidx.window.layout.WindowMetricsCalculator.Companion.reset.1 e;

                static {
                    androidx.window.layout.WindowMetricsCalculator.Companion.reset.1.e = new androidx.window.layout.WindowMetricsCalculator.Companion.reset.1();
                }

                androidx.window.layout.WindowMetricsCalculator.Companion.reset.1() {
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

        }
    }

    @l
    public static final Companion a;

    static {
        WindowMetricsCalculator.a = Companion.a;
    }

    @l
    WindowMetrics a(@l Activity arg1);

    @l
    WindowMetrics b(@l Activity arg1);
}

