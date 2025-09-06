package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@Immutable
public abstract class Brush {
    @s0({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n1#2:656\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @Stable
        @l
        public final Brush a(@l List list0, float f, float f1, int v) {
            L.p(list0, "colors");
            return this.e(list0, OffsetKt.a(f, 0.0f), OffsetKt.a(f1, 0.0f), v);
        }

        @Stable
        @l
        public final Brush b(@l V[] arr_v, float f, float f1, int v) {
            L.p(arr_v, "colorStops");
            return this.f(((V[])Arrays.copyOf(arr_v, arr_v.length)), OffsetKt.a(f, 0.0f), OffsetKt.a(f1, 0.0f), v);
        }

        public static Brush c(Companion brush$Companion0, List list0, float f, float f1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                f1 = Infinityf;
            }
            if((v1 & 8) != 0) {
                v = 0;
            }
            return brush$Companion0.a(list0, f, f1, v);
        }

        public static Brush d(Companion brush$Companion0, V[] arr_v, float f, float f1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                f1 = Infinityf;
            }
            if((v1 & 8) != 0) {
                v = 0;
            }
            return brush$Companion0.b(arr_v, f, f1, v);
        }

        @Stable
        @l
        public final Brush e(@l List list0, long v, long v1, int v2) {
            L.p(list0, "colors");
            return new LinearGradient(list0, null, v, v1, v2, null);
        }

        @Stable
        @l
        public final Brush f(@l V[] arr_v, long v, long v1, int v2) {
            L.p(arr_v, "colorStops");
            ArrayList arrayList0 = new ArrayList(arr_v.length);
            for(int v4 = 0; v4 < arr_v.length; ++v4) {
                arrayList0.add(Color.n(((Color)arr_v[v4].f()).M()));
            }
            ArrayList arrayList1 = new ArrayList(arr_v.length);
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                arrayList1.add(((Number)arr_v[v3].e()).floatValue());
            }
            return new LinearGradient(arrayList0, arrayList1, v, v1, v2, null);
        }

        public static Brush g(Companion brush$Companion0, List list0, long v, long v1, int v2, int v3, Object object0) {
            if((v3 & 2) != 0) {
                v = 0L;
            }
            if((v3 & 4) != 0) {
                v1 = 0x7F8000007F800000L;
            }
            if((v3 & 8) != 0) {
                v2 = 0;
            }
            return brush$Companion0.e(list0, v, v1, v2);
        }

        public static Brush h(Companion brush$Companion0, V[] arr_v, long v, long v1, int v2, int v3, Object object0) {
            if((v3 & 2) != 0) {
                v = 0L;
            }
            if((v3 & 4) != 0) {
                v1 = 0x7F8000007F800000L;
            }
            if((v3 & 8) != 0) {
                v2 = 0;
            }
            return brush$Companion0.f(arr_v, v, v1, v2);
        }

        @Stable
        @l
        public final Brush i(@l List list0, long v, float f, int v1) {
            L.p(list0, "colors");
            return new RadialGradient(list0, null, v, f, v1, null);
        }

        @Stable
        @l
        public final Brush j(@l V[] arr_v, long v, float f, int v1) {
            L.p(arr_v, "colorStops");
            ArrayList arrayList0 = new ArrayList(arr_v.length);
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                arrayList0.add(Color.n(((Color)arr_v[v3].f()).M()));
            }
            ArrayList arrayList1 = new ArrayList(arr_v.length);
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                arrayList1.add(((Number)arr_v[v2].e()).floatValue());
            }
            return new RadialGradient(arrayList0, arrayList1, v, f, v1, null);
        }

        public static Brush k(Companion brush$Companion0, List list0, long v, float f, int v1, int v2, Object object0) {
            if((v2 & 2) != 0) {
                v = 0x7FC000007FC00000L;
            }
            if((v2 & 8) != 0) {
                v1 = 0;
            }
            return brush$Companion0.i(list0, v, ((v2 & 4) == 0 ? f : Infinityf), v1);
        }

        public static Brush l(Companion brush$Companion0, V[] arr_v, long v, float f, int v1, int v2, Object object0) {
            if((v2 & 2) != 0) {
                v = 0x7FC000007FC00000L;
            }
            if((v2 & 8) != 0) {
                v1 = 0;
            }
            return brush$Companion0.j(arr_v, v, ((v2 & 4) == 0 ? f : Infinityf), v1);
        }

        @Stable
        @l
        public final Brush m(@l List list0, long v) {
            L.p(list0, "colors");
            return new SweepGradient(v, list0, null, null);
        }

        @Stable
        @l
        public final Brush n(@l V[] arr_v, long v) {
            L.p(arr_v, "colorStops");
            ArrayList arrayList0 = new ArrayList(arr_v.length);
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                arrayList0.add(Color.n(((Color)arr_v[v2].f()).M()));
            }
            ArrayList arrayList1 = new ArrayList(arr_v.length);
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                arrayList1.add(((Number)arr_v[v1].e()).floatValue());
            }
            return new SweepGradient(v, arrayList0, arrayList1, null);
        }

        public static Brush o(Companion brush$Companion0, List list0, long v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                v = 0x7FC000007FC00000L;
            }
            return brush$Companion0.m(list0, v);
        }

        public static Brush p(Companion brush$Companion0, V[] arr_v, long v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                v = 0x7FC000007FC00000L;
            }
            return brush$Companion0.n(arr_v, v);
        }

        @Stable
        @l
        public final Brush q(@l List list0, float f, float f1, int v) {
            L.p(list0, "colors");
            return this.e(list0, OffsetKt.a(0.0f, f), OffsetKt.a(0.0f, f1), v);
        }

        @Stable
        @l
        public final Brush r(@l V[] arr_v, float f, float f1, int v) {
            L.p(arr_v, "colorStops");
            return this.f(((V[])Arrays.copyOf(arr_v, arr_v.length)), OffsetKt.a(0.0f, f), OffsetKt.a(0.0f, f1), v);
        }

        public static Brush s(Companion brush$Companion0, List list0, float f, float f1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                f1 = Infinityf;
            }
            if((v1 & 8) != 0) {
                v = 0;
            }
            return brush$Companion0.q(list0, f, f1, v);
        }

        public static Brush t(Companion brush$Companion0, V[] arr_v, float f, float f1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                f1 = Infinityf;
            }
            if((v1 & 8) != 0) {
                v = 0;
            }
            return brush$Companion0.r(arr_v, f, f1, v);
        }
    }

    private final long a;
    @l
    public static final Companion b;

    static {
        Brush.b = new Companion(null);
    }

    private Brush() {
        this.a = 0x7FC000007FC00000L;
    }

    public Brush(w w0) {
    }

    public abstract void a(long arg1, @l Paint arg2, float arg3);

    public long b() {
        return this.a;
    }
}

