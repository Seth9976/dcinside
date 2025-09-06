package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Stable
public interface PaddingValues {
    @Immutable
    @s0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n*L\n218#1:437\n220#1:438\n222#1:439\n224#1:440\n*E\n"})
    public static final class Absolute implements PaddingValues {
        private final float a;
        private final float b;
        private final float c;
        private final float d;
        public static final int e;

        static {
        }

        private Absolute(float f, float f1, float f2, float f3) {
            this.a = f;
            this.b = f1;
            this.c = f2;
            this.d = f3;
        }

        public Absolute(float f, float f1, float f2, float f3, int v, w w0) {
            if((v & 1) != 0) {
                f = 0.0f;
            }
            if((v & 2) != 0) {
                f1 = 0.0f;
            }
            if((v & 4) != 0) {
                f2 = 0.0f;
            }
            if((v & 8) != 0) {
                f3 = 0.0f;
            }
            this(f, f1, f2, f3, null);
        }

        public Absolute(float f, float f1, float f2, float f3, w w0) {
            this(f, f1, f2, f3);
        }

        @Override  // androidx.compose.foundation.layout.PaddingValues
        public float a() {
            return this.d;
        }

        @Override  // androidx.compose.foundation.layout.PaddingValues
        public float b(@l LayoutDirection layoutDirection0) {
            L.p(layoutDirection0, "layoutDirection");
            return this.a;
        }

        @Override  // androidx.compose.foundation.layout.PaddingValues
        public float c(@l LayoutDirection layoutDirection0) {
            L.p(layoutDirection0, "layoutDirection");
            return this.c;
        }

        @Override  // androidx.compose.foundation.layout.PaddingValues
        public float d() {
            return this.b;
        }

        @Stable
        private static void e() {
        }

        // 去混淆评级： 中等(50)
        @Override
        public boolean equals(@m Object object0) {
            return object0 instanceof Absolute ? Dp.l(this.a, ((Absolute)object0).a) && Dp.l(this.b, ((Absolute)object0).b) && Dp.l(this.c, ((Absolute)object0).c) && Dp.l(this.d, ((Absolute)object0).d) : false;
        }

        @Stable
        private static void f() {
        }

        @Stable
        private static void g() {
        }

        @Stable
        private static void h() {
        }

        @Override
        public int hashCode() {
            return ((Dp.n(this.a) * 0x1F + Dp.n(this.b)) * 0x1F + Dp.n(this.c)) * 0x1F + Dp.n(this.d);
        }

        @Override
        @l
        public String toString() {
            return "PaddingValues.Absolute(left=" + Dp.u(this.a) + ", top=" + Dp.u(this.b) + ", right=" + Dp.u(this.c) + ", bottom=" + Dp.u(this.d) + ')';
        }
    }

    float a();

    float b(@l LayoutDirection arg1);

    float c(@l LayoutDirection arg1);

    float d();
}

