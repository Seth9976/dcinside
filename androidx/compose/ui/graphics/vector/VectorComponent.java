package androidx.compose.ui.graphics.vector;

import A3.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,555:1\n76#2:556\n102#2,2:557\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n*L\n120#1:556\n120#1:557,2\n*E\n"})
public final class VectorComponent extends VNode {
    @l
    private final GroupComponent c;
    private boolean d;
    @l
    private final DrawCache e;
    @l
    private a f;
    @l
    private final MutableState g;
    private float h;
    private float i;
    private long j;
    @l
    private final Function1 k;

    public VectorComponent() {
        super(null);
        GroupComponent groupComponent0 = new GroupComponent();
        groupComponent0.u(0.0f);
        groupComponent0.v(0.0f);
        groupComponent0.d(new a() {
            final VectorComponent e;

            {
                this.e = vectorComponent0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.f();
            }
        });
        this.c = groupComponent0;
        this.d = true;
        this.e = new DrawCache();
        this.f = androidx.compose.ui.graphics.vector.VectorComponent.invalidateCallback.1.e;
        this.g = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.j = 0x7FC000007FC00000L;
        this.k = new Function1() {
            final VectorComponent e;

            {
                this.e = vectorComponent0;
                super(1);
            }

            public final void a(@l DrawScope drawScope0) {
                L.p(drawScope0, "$this$null");
                this.e.k().a(drawScope0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((DrawScope)object0));
                return S0.a;
            }
        };

        final class androidx.compose.ui.graphics.vector.VectorComponent.invalidateCallback.1 extends N implements a {
            public static final androidx.compose.ui.graphics.vector.VectorComponent.invalidateCallback.1 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComponent.invalidateCallback.1.e = new androidx.compose.ui.graphics.vector.VectorComponent.invalidateCallback.1();
            }

            androidx.compose.ui.graphics.vector.VectorComponent.invalidateCallback.1() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }

            public final void invoke() {
            }
        }

    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    public void a(@l DrawScope drawScope0) {
        L.p(drawScope0, "<this>");
        this.g(drawScope0, 1.0f, null);
    }

    private final void f() {
        this.d = true;
        this.f.invoke();
    }

    public final void g(@l DrawScope drawScope0, float f, @m ColorFilter colorFilter0) {
        L.p(drawScope0, "<this>");
        if(colorFilter0 == null) {
            colorFilter0 = this.h();
        }
        if(this.d || !Size.k(this.j, drawScope0.b())) {
            float f1 = Size.t(drawScope0.b());
            this.c.x(f1 / this.h);
            float f2 = Size.m(drawScope0.b());
            this.c.y(f2 / this.i);
            long v = IntSizeKt.a(((int)(((float)Math.ceil(Size.t(drawScope0.b()))))), ((int)(((float)Math.ceil(Size.m(drawScope0.b()))))));
            LayoutDirection layoutDirection0 = drawScope0.getLayoutDirection();
            this.e.b(v, drawScope0, layoutDirection0, this.k);
            this.d = false;
            this.j = drawScope0.b();
        }
        this.e.c(drawScope0, f, colorFilter0);
    }

    @m
    public final ColorFilter h() {
        return (ColorFilter)this.g.getValue();
    }

    @l
    public final a i() {
        return this.f;
    }

    // 去混淆评级： 低(20)
    @l
    public final String j() [...] // 潜在的解密器

    @l
    public final GroupComponent k() {
        return this.c;
    }

    public final float l() {
        return this.i;
    }

    public final float m() {
        return this.h;
    }

    public final void n(@m ColorFilter colorFilter0) {
        this.g.setValue(colorFilter0);
    }

    public final void o(@l a a0) {
        L.p(a0, "<set-?>");
        this.f = a0;
    }

    public final void p(@l String s) {
        L.p(s, "value");
        this.c.t(s);
    }

    public final void q(float f) {
        if(this.i != f) {
            this.i = f;
            this.f();
        }
    }

    public final void r(float f) {
        if(this.h != f) {
            this.h = f;
            this.f();
        }
    }

    // 去混淆评级： 低(33)
    @Override
    @l
    public String toString() {
        String s = "Params: \tname: \n\tviewportWidth: " + this.h + "\n" + "\tviewportHeight: " + this.i + "\n";
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

