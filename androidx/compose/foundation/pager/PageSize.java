package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

@ExperimentalFoundationApi
@Stable
public interface PageSize {
    @ExperimentalFoundationApi
    @StabilityInferred(parameters = 0)
    public static final class Fill implements PageSize {
        @l
        public static final Fill a;
        public static final int b;

        static {
            Fill.a = new Fill();
        }

        @Override  // androidx.compose.foundation.pager.PageSize
        public int a(@l Density density0, int v, int v1) {
            L.p(density0, "<this>");
            return v;
        }
    }

    @ExperimentalFoundationApi
    @StabilityInferred(parameters = 0)
    public static final class Fixed implements PageSize {
        private final float a;
        public static final int b;

        static {
        }

        private Fixed(float f) {
            this.a = f;
        }

        public Fixed(float f, w w0) {
            this(f);
        }

        @Override  // androidx.compose.foundation.pager.PageSize
        public int a(@l Density density0, int v, int v1) {
            L.p(density0, "<this>");
            return density0.b1(this.a);
        }

        public final float b() {
            return this.a;
        }
    }

    int a(@l Density arg1, int arg2, int arg3);
}

