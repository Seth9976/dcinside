package androidx.compose.ui.node;

import A3.a;
import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.b0;
import y4.l;

@b0
public interface ComposeUiNode {
    public static final class Companion {
        static final Companion a;
        @l
        private static final a b;
        @l
        private static final a c;
        @l
        private static final o d;
        @l
        private static final o e;
        @l
        private static final o f;
        @l
        private static final o g;
        @l
        private static final o h;

        static {
            Companion.a = new Companion();
            Companion.b = LayoutNode.P.a();
            Companion.c = ComposeUiNode.Companion.VirtualConstructor.1.e;
            Companion.d = ComposeUiNode.Companion.SetModifier.1.e;
            Companion.e = ComposeUiNode.Companion.SetDensity.1.e;
            Companion.f = ComposeUiNode.Companion.SetMeasurePolicy.1.e;
            Companion.g = ComposeUiNode.Companion.SetLayoutDirection.1.e;
            Companion.h = ComposeUiNode.Companion.SetViewConfiguration.1.e;
        }

        @l
        public final a a() {
            return Companion.b;
        }

        @l
        public final o b() {
            return Companion.e;
        }

        @l
        public final o c() {
            return Companion.g;
        }

        @l
        public final o d() {
            return Companion.f;
        }

        @l
        public final o e() {
            return Companion.d;
        }

        @l
        public final o f() {
            return Companion.h;
        }

        @l
        public final a g() {
            return Companion.c;
        }
    }

    @l
    public static final Companion p0;

    static {
        ComposeUiNode.p0 = Companion.a;
    }

    void a(@l LayoutDirection arg1);

    @l
    Modifier b();

    @l
    Density getDensity();

    @l
    LayoutDirection getLayoutDirection();

    @l
    ViewConfiguration getViewConfiguration();

    void l(@l MeasurePolicy arg1);

    void m(@l Modifier arg1);

    void n(@l Density arg1);

    void q(@l ViewConfiguration arg1);

    @l
    MeasurePolicy t();
}

