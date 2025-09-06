package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class ChangeSize {
    @l
    private final Alignment a;
    @l
    private final Function1 b;
    @l
    private final FiniteAnimationSpec c;
    private final boolean d;

    public ChangeSize(@l Alignment alignment0, @l Function1 function10, @l FiniteAnimationSpec finiteAnimationSpec0, boolean z) {
        L.p(alignment0, "alignment");
        L.p(function10, "size");
        L.p(finiteAnimationSpec0, "animationSpec");
        super();
        this.a = alignment0;
        this.b = function10;
        this.c = finiteAnimationSpec0;
        this.d = z;
    }

    public ChangeSize(Alignment alignment0, Function1 function10, FiniteAnimationSpec finiteAnimationSpec0, boolean z, int v, w w0) {
        if((v & 2) != 0) {
            function10 = androidx.compose.animation.ChangeSize.1.e;
        }
        if((v & 8) != 0) {
            z = true;
        }
        this(alignment0, function10, finiteAnimationSpec0, z);

        final class androidx.compose.animation.ChangeSize.1 extends N implements Function1 {
            public static final androidx.compose.animation.ChangeSize.1 e;

            static {
                androidx.compose.animation.ChangeSize.1.e = new androidx.compose.animation.ChangeSize.1();
            }

            androidx.compose.animation.ChangeSize.1() {
                super(1);
            }

            // 去混淆评级： 低(20)
            public final long a(long v) {
                return 0L;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return IntSize.b(this.a(((IntSize)object0).q()));
            }
        }

    }

    @l
    public final Alignment a() {
        return this.a;
    }

    @l
    public final Function1 b() {
        return this.b;
    }

    @l
    public final FiniteAnimationSpec c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    @l
    public final ChangeSize e(@l Alignment alignment0, @l Function1 function10, @l FiniteAnimationSpec finiteAnimationSpec0, boolean z) {
        L.p(alignment0, "alignment");
        L.p(function10, "size");
        L.p(finiteAnimationSpec0, "animationSpec");
        return new ChangeSize(alignment0, function10, finiteAnimationSpec0, z);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ChangeSize)) {
            return false;
        }
        if(!L.g(this.a, ((ChangeSize)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((ChangeSize)object0).b)) {
            return false;
        }
        return L.g(this.c, ((ChangeSize)object0).c) ? this.d == ((ChangeSize)object0).d : false;
    }

    public static ChangeSize f(ChangeSize changeSize0, Alignment alignment0, Function1 function10, FiniteAnimationSpec finiteAnimationSpec0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            alignment0 = changeSize0.a;
        }
        if((v & 2) != 0) {
            function10 = changeSize0.b;
        }
        if((v & 4) != 0) {
            finiteAnimationSpec0 = changeSize0.c;
        }
        if((v & 8) != 0) {
            z = changeSize0.d;
        }
        return changeSize0.e(alignment0, function10, finiteAnimationSpec0, z);
    }

    @l
    public final Alignment g() {
        return this.a;
    }

    @l
    public final FiniteAnimationSpec h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = this.c.hashCode();
        int v3 = this.d;
        if(v3) {
            v3 = 1;
        }
        return ((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3;
    }

    public final boolean i() {
        return this.d;
    }

    @l
    public final Function1 j() {
        return this.b;
    }

    @Override
    @l
    public String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ')';
    }
}

