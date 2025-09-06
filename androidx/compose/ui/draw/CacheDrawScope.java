package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.a;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"})
public final class CacheDrawScope implements Density {
    @l
    private BuildDrawCacheParams a;
    @m
    private DrawResult b;
    public static final int c;

    static {
    }

    public CacheDrawScope() {
        this.a = EmptyBuildDrawCacheParams.a;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float C(int v) {
        return a.e(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float D(float f) {
        return a.d(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int E1(long v) {
        return a.a(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public Rect H0(DpRect dpRect0) {
        return a.i(this, dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long J(long v) {
        return a.j(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long M(float f) {
        return a.k(this, f);
    }

    public final long b() {
        return this.a.b();
    }

    @Override  // androidx.compose.ui.unit.Density
    public int b1(float f) {
        return a.b(this, f);
    }

    @l
    public final BuildDrawCacheParams c() {
        return this.a;
    }

    @m
    public final DrawResult e() {
        return this.b;
    }

    @l
    public final DrawResult f(@l Function1 function10) {
        L.p(function10, "block");
        return this.g(new Function1() {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            public final void a(@l ContentDrawScope contentDrawScope0) {
                L.p(contentDrawScope0, "$this$onDrawWithContent");
                this.e.invoke(contentDrawScope0);
                contentDrawScope0.Q0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((ContentDrawScope)object0));
                return S0.a;
            }
        });
    }

    @l
    public final DrawResult g(@l Function1 function10) {
        L.p(function10, "block");
        DrawResult drawResult0 = new DrawResult(function10);
        this.b = drawResult0;
        return drawResult0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float g1(long v) {
        return a.g(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a.getDensity().getDensity();
    }

    @l
    public final LayoutDirection getLayoutDirection() {
        return this.a.getLayoutDirection();
    }

    public final void h(@l BuildDrawCacheParams buildDrawCacheParams0) {
        L.p(buildDrawCacheParams0, "<set-?>");
        this.a = buildDrawCacheParams0;
    }

    public final void k(@m DrawResult drawResult0) {
        this.b = drawResult0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public long m(long v) {
        return a.f(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float p(long v) {
        return a.c(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long r(int v) {
        return a.m(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long s(float f) {
        return a.l(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float w1() {
        return this.a.getDensity().w1();
    }

    @Override  // androidx.compose.ui.unit.Density
    public float y1(float f) {
        return a.h(this, f);
    }
}

