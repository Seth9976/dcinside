package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
@s0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,709:1\n700#1,2:715\n703#1,5:720\n700#1,2:725\n703#1,5:730\n700#1,2:738\n703#1,5:743\n700#1,2:751\n703#1,5:756\n700#1,2:764\n703#1,5:769\n700#1,2:777\n703#1,5:782\n155#2:710\n155#2:711\n13032#3,3:712\n13674#3,3:717\n13674#3,3:727\n13032#3,3:735\n13674#3,3:740\n13032#3,3:748\n13674#3,3:753\n13032#3,3:761\n13674#3,3:766\n13032#3,3:774\n13674#3,3:779\n13674#3,3:787\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n618#1:715,2\n618#1:720,5\n626#1:725,2\n626#1:730,5\n640#1:738,2\n640#1:743,5\n655#1:751,2\n655#1:756,5\n674#1:764,2\n674#1:769,5\n693#1:777,2\n693#1:782,5\n354#1:710\n366#1:711\n616#1:712,3\n618#1:717,3\n626#1:727,3\n638#1:735,3\n640#1:740,3\n652#1:748,3\n655#1:753,3\n667#1:761,3\n674#1:766,3\n686#1:774,3\n693#1:779,3\n701#1:787,3\n*E\n"})
public final class Arrangement {
    @Immutable
    @s0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n*L\n555#1:710\n*E\n"})
    public static final class Absolute {
        @l
        public static final Absolute a;
        @l
        private static final Horizontal b;
        @l
        private static final Horizontal c;
        @l
        private static final Horizontal d;
        @l
        private static final Horizontal e;
        @l
        private static final Horizontal f;
        @l
        private static final Horizontal g;
        public static final int h;

        static {
            Absolute.a = new Absolute();
            Absolute.b = new Arrangement.Absolute.Left.1();
            Absolute.c = new Arrangement.Absolute.Center.1();
            Absolute.d = new Arrangement.Absolute.Right.1();
            Absolute.e = new Arrangement.Absolute.SpaceBetween.1();
            Absolute.f = new Arrangement.Absolute.SpaceEvenly.1();
            Absolute.g = new Arrangement.Absolute.SpaceAround.1();
        }

        @Stable
        @l
        public final Horizontal a(@l androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0) {
            L.p(alignment$Horizontal0, "alignment");
            return new SpacedAligned(0.0f, false, new o() {
                final androidx.compose.ui.Alignment.Horizontal e;

                {
                    this.e = alignment$Horizontal0;
                    super(2);
                }

                @l
                public final Integer a(int v, @l LayoutDirection layoutDirection0) {
                    L.p(layoutDirection0, "layoutDirection");
                    return this.e.a(0, v, layoutDirection0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((Number)object0).intValue(), ((LayoutDirection)object1));
                }
            }, null);
        }

        @l
        public final Horizontal b() {
            return Absolute.c;
        }

        @Stable
        public static void c() {
        }

        @l
        public final Horizontal d() {
            return Absolute.b;
        }

        @Stable
        public static void e() {
        }

        @l
        public final Horizontal f() {
            return Absolute.d;
        }

        @Stable
        public static void g() {
        }

        @l
        public final Horizontal h() {
            return Absolute.g;
        }

        @Stable
        public static void i() {
        }

        @l
        public final Horizontal j() {
            return Absolute.e;
        }

        @Stable
        public static void k() {
        }

        @l
        public final Horizontal l() {
            return Absolute.f;
        }

        @Stable
        public static void m() {
        }

        @Stable
        @l
        public final HorizontalOrVertical n(float f) {
            return new SpacedAligned(f, false, null, null);
        }

        @Stable
        @l
        public final Horizontal o(float f, @l androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0) {
            L.p(alignment$Horizontal0, "alignment");
            return new SpacedAligned(f, false, new o() {
                final androidx.compose.ui.Alignment.Horizontal e;

                {
                    this.e = alignment$Horizontal0;
                    super(2);
                }

                @l
                public final Integer a(int v, @l LayoutDirection layoutDirection0) {
                    L.p(layoutDirection0, "layoutDirection");
                    return this.e.a(0, v, layoutDirection0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((Number)object0).intValue(), ((LayoutDirection)object1));
                }
            }, null);
        }

        @Stable
        @l
        public final Vertical p(float f, @l androidx.compose.ui.Alignment.Vertical alignment$Vertical0) {
            L.p(alignment$Vertical0, "alignment");
            return new SpacedAligned(f, false, new o() {
                final androidx.compose.ui.Alignment.Vertical e;

                {
                    this.e = alignment$Vertical0;
                    super(2);
                }

                @l
                public final Integer a(int v, @l LayoutDirection layoutDirection0) {
                    L.p(layoutDirection0, "<anonymous parameter 1>");
                    return this.e.a(0, v);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((Number)object0).intValue(), ((LayoutDirection)object1));
                }
            }, null);
        }
    }

    @Stable
    @s0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n50#1:710\n*E\n"})
    public interface Horizontal {
        public static final class DefaultImpls {
            @Deprecated
            public static float a(@l Horizontal arrangement$Horizontal0) {
                return a.a(arrangement$Horizontal0);
            }
        }

        float a();

        void b(@l Density arg1, int arg2, @l int[] arg3, @l LayoutDirection arg4, @l int[] arg5);
    }

    @Stable
    @s0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n107#1:710\n*E\n"})
    public interface HorizontalOrVertical extends Horizontal, Vertical {
        public static final class androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical.DefaultImpls {
            @Deprecated
            public static float a(@l HorizontalOrVertical arrangement$HorizontalOrVertical0) {
                return b.a(arrangement$HorizontalOrVertical0);
            }
        }

        @Override  // androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical
        float a();
    }

    @Immutable
    @s0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,709:1\n700#2,2:710\n703#2,5:715\n13674#3,3:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n585#1:710,2\n585#1:715,5\n585#1:712,3\n*E\n"})
    public static final class SpacedAligned implements HorizontalOrVertical {
        private final float a;
        private final boolean b;
        @m
        private final o c;
        private final float d;

        private SpacedAligned(float f, boolean z, o o0) {
            this.a = f;
            this.b = z;
            this.c = o0;
            this.d = f;
        }

        public SpacedAligned(float f, boolean z, o o0, w w0) {
            this(f, z, o0);
        }

        @Override  // androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical
        public float a() {
            return this.d;
        }

        @Override  // androidx.compose.foundation.layout.Arrangement$Horizontal
        public void b(@l Density density0, int v, @l int[] arr_v, @l LayoutDirection layoutDirection0, @l int[] arr_v1) {
            int v5;
            int v4;
            L.p(density0, "<this>");
            L.p(arr_v, "sizes");
            L.p(layoutDirection0, "layoutDirection");
            L.p(arr_v1, "outPositions");
            if(arr_v.length == 0) {
                return;
            }
            int v1 = density0.b1(this.a);
            if(!this.b || layoutDirection0 != LayoutDirection.b) {
                int v3 = 0;
                v4 = 0;
                v5 = 0;
                int v6 = 0;
                while(v3 < arr_v.length) {
                    int v7 = arr_v[v3];
                    int v8 = Math.min(v4, v - v7);
                    arr_v1[v6] = v8;
                    int v9 = Math.min(v1, v - v8 - v7);
                    int v10 = arr_v1[v6] + v7 + v9;
                    ++v3;
                    ++v6;
                    v5 = v9;
                    v4 = v10;
                }
            }
            else {
                int v11 = arr_v.length - 1;
                v4 = 0;
                v5 = 0;
                while(-1 < v11) {
                    int v12 = arr_v[v11];
                    int v13 = Math.min(v4, v - v12);
                    arr_v1[v11] = v13;
                    v5 = Math.min(v1, v - v13 - v12);
                    v4 = arr_v1[v11] + v12 + v5;
                    --v11;
                }
            }
            int v14 = v4 - v5;
            o o0 = this.c;
            if(o0 != null && v14 < v) {
                int v15 = ((Number)o0.invoke(((int)(v - v14)), layoutDirection0)).intValue();
                for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                    arr_v1[v2] += v15;
                }
            }
        }

        @Override  // androidx.compose.foundation.layout.Arrangement$Vertical
        public void c(@l Density density0, int v, @l int[] arr_v, @l int[] arr_v1) {
            L.p(density0, "<this>");
            L.p(arr_v, "sizes");
            L.p(arr_v1, "outPositions");
            this.b(density0, v, arr_v, LayoutDirection.a, arr_v1);
        }

        public final float d() {
            return this.a;
        }

        public final boolean e() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof SpacedAligned)) {
                return false;
            }
            if(!Dp.l(this.a, ((SpacedAligned)object0).a)) {
                return false;
            }
            return this.b == ((SpacedAligned)object0).b ? L.g(this.c, ((SpacedAligned)object0).c) : false;
        }

        @m
        public final o f() {
            return this.c;
        }

        @l
        public final SpacedAligned g(float f, boolean z, @m o o0) {
            return new SpacedAligned(f, z, o0, null);
        }

        public static SpacedAligned h(SpacedAligned arrangement$SpacedAligned0, float f, boolean z, o o0, int v, Object object0) {
            if((v & 1) != 0) {
                f = arrangement$SpacedAligned0.a;
            }
            if((v & 2) != 0) {
                z = arrangement$SpacedAligned0.b;
            }
            if((v & 4) != 0) {
                o0 = arrangement$SpacedAligned0.c;
            }
            return arrangement$SpacedAligned0.g(f, z, o0);
        }

        @Override
        public int hashCode() {
            int v = Dp.n(this.a);
            int v1 = this.b;
            if(v1) {
                v1 = 1;
            }
            return this.c == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.c.hashCode();
        }

        @m
        public final o i() {
            return this.c;
        }

        public final boolean j() {
            return this.b;
        }

        public final float k() {
            return this.a;
        }

        // 去混淆评级： 低(20)
        @Override
        @l
        public String toString() {
            return (this.b ? "" : "Absolute") + "Arrangement#spacedAligned(" + Dp.u(this.a) + ", " + this.c + ')';
        }
    }

    @Stable
    @s0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n79#1:710\n*E\n"})
    public interface Vertical {
        public static final class androidx.compose.foundation.layout.Arrangement.Vertical.DefaultImpls {
            @Deprecated
            public static float a(@l Vertical arrangement$Vertical0) {
                return c.a(arrangement$Vertical0);
            }
        }

        float a();

        void c(@l Density arg1, int arg2, @l int[] arg3, @l int[] arg4);
    }

    @l
    public static final Arrangement a;
    @l
    private static final Horizontal b;
    @l
    private static final Horizontal c;
    @l
    private static final Vertical d;
    @l
    private static final Vertical e;
    @l
    private static final HorizontalOrVertical f;
    @l
    private static final HorizontalOrVertical g;
    @l
    private static final HorizontalOrVertical h;
    @l
    private static final HorizontalOrVertical i;
    public static final int j;

    static {
        Arrangement.a = new Arrangement();
        Arrangement.b = new Arrangement.Start.1();
        Arrangement.c = new Arrangement.End.1();
        Arrangement.d = new Arrangement.Top.1();
        Arrangement.e = new Arrangement.Bottom.1();
        Arrangement.f = new Arrangement.Center.1();
        Arrangement.g = new Arrangement.SpaceEvenly.1();
        Arrangement.h = new Arrangement.SpaceBetween.1();
        Arrangement.i = new Arrangement.SpaceAround.1();
    }

    @Stable
    @l
    public final Horizontal A(float f, @l androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0) {
        L.p(alignment$Horizontal0, "alignment");
        return new SpacedAligned(f, true, new o() {
            final androidx.compose.ui.Alignment.Horizontal e;

            {
                this.e = alignment$Horizontal0;
                super(2);
            }

            @l
            public final Integer a(int v, @l LayoutDirection layoutDirection0) {
                L.p(layoutDirection0, "layoutDirection");
                return this.e.a(0, v, layoutDirection0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).intValue(), ((LayoutDirection)object1));
            }
        }, null);
    }

    @Stable
    @l
    public final Vertical B(float f, @l androidx.compose.ui.Alignment.Vertical alignment$Vertical0) {
        L.p(alignment$Vertical0, "alignment");
        return new SpacedAligned(f, false, new o() {
            final androidx.compose.ui.Alignment.Vertical e;

            {
                this.e = alignment$Vertical0;
                super(2);
            }

            @l
            public final Integer a(int v, @l LayoutDirection layoutDirection0) {
                L.p(layoutDirection0, "<anonymous parameter 1>");
                return this.e.a(0, v);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).intValue(), ((LayoutDirection)object1));
            }
        }, null);
    }

    @Stable
    @l
    public final Horizontal a(@l androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0) {
        L.p(alignment$Horizontal0, "alignment");
        return new SpacedAligned(0.0f, true, new o() {
            final androidx.compose.ui.Alignment.Horizontal e;

            {
                this.e = alignment$Horizontal0;
                super(2);
            }

            @l
            public final Integer a(int v, @l LayoutDirection layoutDirection0) {
                L.p(layoutDirection0, "layoutDirection");
                return this.e.a(0, v, layoutDirection0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).intValue(), ((LayoutDirection)object1));
            }
        }, null);
    }

    @Stable
    @l
    public final Vertical b(@l androidx.compose.ui.Alignment.Vertical alignment$Vertical0) {
        L.p(alignment$Vertical0, "alignment");
        return new SpacedAligned(0.0f, false, new o() {
            final androidx.compose.ui.Alignment.Vertical e;

            {
                this.e = alignment$Vertical0;
                super(2);
            }

            @l
            public final Integer a(int v, @l LayoutDirection layoutDirection0) {
                L.p(layoutDirection0, "<anonymous parameter 1>");
                return this.e.a(0, v);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).intValue(), ((LayoutDirection)object1));
            }
        }, null);
    }

    private final void c(int[] arr_v, boolean z, o o0) {
        if(!z) {
            int v = 0;
            for(int v1 = 0; v < arr_v.length; ++v1) {
                o0.invoke(v1, ((int)arr_v[v]));
                ++v;
            }
            return;
        }
        for(int v2 = arr_v.length - 1; -1 < v2; --v2) {
            o0.invoke(v2, ((int)arr_v[v2]));
        }
    }

    @l
    public final Vertical d() {
        return Arrangement.e;
    }

    @Stable
    public static void e() {
    }

    @l
    public final HorizontalOrVertical f() {
        return Arrangement.f;
    }

    @Stable
    public static void g() {
    }

    @l
    public final Horizontal h() {
        return Arrangement.c;
    }

    @Stable
    public static void i() {
    }

    @l
    public final HorizontalOrVertical j() {
        return Arrangement.i;
    }

    @Stable
    public static void k() {
    }

    @l
    public final HorizontalOrVertical l() {
        return Arrangement.h;
    }

    @Stable
    public static void m() {
    }

    @l
    public final HorizontalOrVertical n() {
        return Arrangement.g;
    }

    @Stable
    public static void o() {
    }

    @l
    public final Horizontal p() {
        return Arrangement.b;
    }

    @Stable
    public static void q() {
    }

    @l
    public final Vertical r() {
        return Arrangement.d;
    }

    @Stable
    public static void s() {
    }

    public final void t(int v, @l int[] arr_v, @l int[] arr_v1, boolean z) {
        L.p(arr_v, "size");
        L.p(arr_v1, "outPosition");
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v3 += arr_v[v2];
        }
        float f = ((float)(v - v3)) / 2.0f;
        if(!z) {
            for(int v4 = 0; v1 < arr_v.length; ++v4) {
                int v5 = arr_v[v1];
                arr_v1[v4] = kotlin.math.b.L0(f);
                f += (float)v5;
                ++v1;
            }
            return;
        }
        for(int v6 = arr_v.length - 1; -1 < v6; --v6) {
            int v7 = arr_v[v6];
            arr_v1[v6] = kotlin.math.b.L0(f);
            f += (float)v7;
        }
    }

    public final void u(@l int[] arr_v, @l int[] arr_v1, boolean z) {
        L.p(arr_v, "size");
        L.p(arr_v1, "outPosition");
        int v = 0;
        if(!z) {
            int v2 = 0;
            for(int v1 = 0; v < arr_v.length; ++v1) {
                int v3 = arr_v[v];
                arr_v1[v1] = v2;
                v2 += v3;
                ++v;
            }
            return;
        }
        for(int v4 = arr_v.length - 1; -1 < v4; --v4) {
            int v5 = arr_v[v4];
            arr_v1[v4] = v;
            v += v5;
        }
    }

    public final void v(int v, @l int[] arr_v, @l int[] arr_v1, boolean z) {
        L.p(arr_v, "size");
        L.p(arr_v1, "outPosition");
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v3 += arr_v[v2];
        }
        int v4 = v - v3;
        if(!z) {
            for(int v5 = 0; v1 < arr_v.length; ++v5) {
                int v6 = arr_v[v1];
                arr_v1[v5] = v4;
                v4 += v6;
                ++v1;
            }
            return;
        }
        for(int v7 = arr_v.length - 1; -1 < v7; --v7) {
            int v8 = arr_v[v7];
            arr_v1[v7] = v4;
            v4 += v8;
        }
    }

    public final void w(int v, @l int[] arr_v, @l int[] arr_v1, boolean z) {
        L.p(arr_v, "size");
        L.p(arr_v1, "outPosition");
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v3 += arr_v[v2];
        }
        float f = arr_v.length == 0 ? 0.0f : ((float)(v - v3)) / ((float)arr_v.length);
        float f1 = f / 2.0f;
        if(!z) {
            for(int v4 = 0; v1 < arr_v.length; ++v4) {
                int v5 = arr_v[v1];
                arr_v1[v4] = kotlin.math.b.L0(f1);
                f1 += ((float)v5) + f;
                ++v1;
            }
            return;
        }
        for(int v6 = arr_v.length - 1; -1 < v6; --v6) {
            int v7 = arr_v[v6];
            arr_v1[v6] = kotlin.math.b.L0(f1);
            f1 += ((float)v7) + f;
        }
    }

    public final void x(int v, @l int[] arr_v, @l int[] arr_v1, boolean z) {
        float f;
        L.p(arr_v, "size");
        L.p(arr_v1, "outPosition");
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; true; ++v2) {
            f = 0.0f;
            if(v2 >= arr_v.length) {
                break;
            }
            v3 += arr_v[v2];
        }
        float f1 = arr_v.length <= 1 ? 0.0f : ((float)(v - v3)) / ((float)(arr_v.length - 1));
        if(!z) {
            for(int v4 = 0; v1 < arr_v.length; ++v4) {
                int v5 = arr_v[v1];
                arr_v1[v4] = kotlin.math.b.L0(f);
                f += ((float)v5) + f1;
                ++v1;
            }
            return;
        }
        for(int v6 = arr_v.length - 1; -1 < v6; --v6) {
            int v7 = arr_v[v6];
            arr_v1[v6] = kotlin.math.b.L0(f);
            f += ((float)v7) + f1;
        }
    }

    public final void y(int v, @l int[] arr_v, @l int[] arr_v1, boolean z) {
        L.p(arr_v, "size");
        L.p(arr_v1, "outPosition");
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v3 += arr_v[v2];
        }
        float f = ((float)(v - v3)) / ((float)(arr_v.length + 1));
        if(!z) {
            float f1 = f;
            for(int v4 = 0; v1 < arr_v.length; ++v4) {
                int v5 = arr_v[v1];
                arr_v1[v4] = kotlin.math.b.L0(f1);
                f1 += ((float)v5) + f;
                ++v1;
            }
            return;
        }
        int v6 = arr_v.length - 1;
        float f2 = f;
        while(-1 < v6) {
            int v7 = arr_v[v6];
            arr_v1[v6] = kotlin.math.b.L0(f2);
            f2 += ((float)v7) + f;
            --v6;
        }
    }

    @Stable
    @l
    public final HorizontalOrVertical z(float f) {
        return new SpacedAligned(f, true, androidx.compose.foundation.layout.Arrangement.spacedBy.1.e, null);

        final class androidx.compose.foundation.layout.Arrangement.spacedBy.1 extends N implements o {
            public static final androidx.compose.foundation.layout.Arrangement.spacedBy.1 e;

            static {
                androidx.compose.foundation.layout.Arrangement.spacedBy.1.e = new androidx.compose.foundation.layout.Arrangement.spacedBy.1();
            }

            androidx.compose.foundation.layout.Arrangement.spacedBy.1() {
                super(2);
            }

            @l
            public final Integer a(int v, @l LayoutDirection layoutDirection0) {
                L.p(layoutDirection0, "layoutDirection");
                return Alignment.a.u().a(0, v, layoutDirection0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).intValue(), ((LayoutDirection)object1));
            }
        }

    }
}

