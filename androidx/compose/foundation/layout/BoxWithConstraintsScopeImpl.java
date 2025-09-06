package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
final class BoxWithConstraintsScopeImpl implements BoxScope, BoxWithConstraintsScope {
    @l
    private final Density a;
    private final long b;
    private final BoxScopeInstance c;

    private BoxWithConstraintsScopeImpl(Density density0, long v) {
        this.a = density0;
        this.b = v;
        this.c = BoxScopeInstance.a;
    }

    public BoxWithConstraintsScopeImpl(Density density0, long v, w w0) {
        this(density0, v);
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.compose.foundation.layout.BoxWithConstraintsScope
    public float a() {
        return Constraints.j(this.e()) ? this.a.C(Constraints.p(this.e())) : Infinityf;
    }

    @Override  // androidx.compose.foundation.layout.BoxScope
    @Stable
    @l
    public Modifier b(@l Modifier modifier0, @l Alignment alignment0) {
        L.p(modifier0, "<this>");
        L.p(alignment0, "alignment");
        return this.c.b(modifier0, alignment0);
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.compose.foundation.layout.BoxWithConstraintsScope
    public float c() {
        return Constraints.i(this.e()) ? this.a.C(Constraints.o(this.e())) : Infinityf;
    }

    @Override  // androidx.compose.foundation.layout.BoxWithConstraintsScope
    public float d() {
        int v = Constraints.r(this.e());
        return this.a.C(v);
    }

    @Override  // androidx.compose.foundation.layout.BoxWithConstraintsScope
    public long e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        return L.g(this.a, ((BoxWithConstraintsScopeImpl)object0).a) ? Constraints.g(this.e(), ((BoxWithConstraintsScopeImpl)object0).e()) : false;
    }

    @Override  // androidx.compose.foundation.layout.BoxScope
    @Stable
    @l
    public Modifier f(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return this.c.f(modifier0);
    }

    @Override  // androidx.compose.foundation.layout.BoxWithConstraintsScope
    public float g() {
        int v = Constraints.q(this.e());
        return this.a.C(v);
    }

    private final Density h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + Constraints.t(this.e());
    }

    public final long i() {
        return this.e();
    }

    @l
    public final BoxWithConstraintsScopeImpl j(@l Density density0, long v) {
        L.p(density0, "density");
        return new BoxWithConstraintsScopeImpl(density0, v, null);
    }

    public static BoxWithConstraintsScopeImpl k(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl0, Density density0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            density0 = boxWithConstraintsScopeImpl0.a;
        }
        if((v1 & 2) != 0) {
            v = boxWithConstraintsScopeImpl0.e();
        }
        return boxWithConstraintsScopeImpl0.j(density0, v);
    }

    @Override
    @l
    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + Constraints.w(this.e()) + ')';
    }
}

