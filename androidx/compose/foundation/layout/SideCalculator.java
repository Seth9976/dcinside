package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(30)
interface SideCalculator {
    public static final class Companion {
        static final Companion a;
        @l
        private static final SideCalculator.Companion.LeftSideCalculator.1 b;
        @l
        private static final SideCalculator.Companion.TopSideCalculator.1 c;
        @l
        private static final SideCalculator.Companion.RightSideCalculator.1 d;
        @l
        private static final SideCalculator.Companion.BottomSideCalculator.1 e;

        static {
            Companion.a = new Companion();
            Companion.b = new SideCalculator.Companion.LeftSideCalculator.1();
            Companion.c = new SideCalculator.Companion.TopSideCalculator.1();
            Companion.d = new SideCalculator.Companion.RightSideCalculator.1();
            Companion.e = new SideCalculator.Companion.BottomSideCalculator.1();
        }

        @l
        public final SideCalculator a(int v, @l LayoutDirection layoutDirection0) {
            L.p(layoutDirection0, "layoutDirection");
            if(WindowInsetsSides.p(v, 10)) {
                return Companion.b;
            }
            if(WindowInsetsSides.p(v, 16)) {
                return Companion.c;
            }
            if(WindowInsetsSides.p(v, 5)) {
                return Companion.d;
            }
            if(WindowInsetsSides.p(v, 0x20)) {
                return Companion.e;
            }
            if(WindowInsetsSides.p(v, 9)) {
                return layoutDirection0 == LayoutDirection.a ? Companion.b : Companion.d;
            }
            if(!WindowInsetsSides.p(v, 6)) {
                throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed");
            }
            return layoutDirection0 == LayoutDirection.a ? Companion.d : Companion.b;
        }
    }

    @l
    public static final Companion a;

    static {
        SideCalculator.a = Companion.a;
    }

    float a(float arg1, float arg2);

    float b(float arg1, float arg2);

    long c(long arg1);

    float d(float arg1, float arg2);

    @l
    Insets e(@l Insets arg1, int arg2);

    int f(@l Insets arg1);

    long g(long arg1, float arg2);
}

