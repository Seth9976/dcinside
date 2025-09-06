package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Stable
public interface GridCells {
    @StabilityInferred(parameters = 0)
    @s0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,493:1\n154#2:494\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n*L\n272#1:494\n*E\n"})
    public static final class Adaptive implements GridCells {
        private final float a;
        public static final int b;

        static {
        }

        private Adaptive(float f) {
            this.a = f;
            if(Dp.f(f, 0.0f) <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }

        public Adaptive(float f, w w0) {
            this(f);
        }

        @Override  // androidx.compose.foundation.lazy.grid.GridCells
        @l
        public List a(@l Density density0, int v, int v1) {
            L.p(density0, "<this>");
            return LazyGridDslKt.d(v, Math.max((v + v1) / (density0.b1(this.a) + v1), 1), v1);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@m Object object0) {
            return object0 instanceof Adaptive && Dp.l(this.a, ((Adaptive)object0).a);
        }

        @Override
        public int hashCode() {
            return Dp.n(this.a);
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Fixed implements GridCells {
        private final int a;
        public static final int b;

        static {
        }

        public Fixed(int v) {
            this.a = v;
            if(v <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }

        @Override  // androidx.compose.foundation.lazy.grid.GridCells
        @l
        public List a(@l Density density0, int v, int v1) {
            L.p(density0, "<this>");
            return LazyGridDslKt.d(v, this.a, v1);
        }

        @Override
        public boolean equals(@m Object object0) {
            return object0 instanceof Fixed && this.a == ((Fixed)object0).a;
        }

        @Override
        public int hashCode() {
            return -this.a;
        }
    }

    @l
    List a(@l Density arg1, int arg2, int arg3);
}

