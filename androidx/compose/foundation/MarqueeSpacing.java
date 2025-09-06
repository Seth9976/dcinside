package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import kotlin.math.b;
import y4.l;

@ExperimentalFoundationApi
@Stable
public interface MarqueeSpacing {
    public static final class Companion {
        static final Companion a;

        static {
            Companion.a = new Companion();
        }

        @ExperimentalFoundationApi
        @l
        public final MarqueeSpacing a(float f) {
            return new MarqueeSpacing() {
                @Override  // androidx.compose.foundation.MarqueeSpacing
                public final int a(@l Density density0, int v, int v1) {
                    L.p(density0, "$this$MarqueeSpacing");
                    return b.L0(this.b * ((float)v1));
                }
            };
        }
    }

    @l
    public static final Companion a;

    static {
        MarqueeSpacing.a = Companion.a;
    }

    @ExperimentalFoundationApi
    int a(@l Density arg1, int arg2, int arg3);
}

