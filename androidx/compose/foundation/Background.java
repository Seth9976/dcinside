package androidx.compose.foundation;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/Background\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
final class Background extends InspectorValueInfo implements DrawModifier {
    @m
    private final Color d;
    @m
    private final Brush e;
    private final float f;
    @l
    private final Shape g;
    @m
    private Size h;
    @m
    private LayoutDirection i;
    @m
    private Outline j;

    private Background(Color color0, Brush brush0, float f, Shape shape0, Function1 function10) {
        super(function10);
        this.d = color0;
        this.e = brush0;
        this.f = f;
        this.g = shape0;
    }

    public Background(Color color0, Brush brush0, float f, Shape shape0, Function1 function10, int v, w w0) {
        this(((v & 1) == 0 ? color0 : null), ((v & 2) == 0 ? brush0 : null), ((v & 4) == 0 ? f : 1.0f), shape0, function10, null);
    }

    public Background(Color color0, Brush brush0, float f, Shape shape0, Function1 function10, w w0) {
        this(color0, brush0, f, shape0, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return b.d(this, object0, o0);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        Background background0 = object0 instanceof Background ? ((Background)object0) : null;
        return background0 == null ? false : L.g(this.d, background0.d) && L.g(this.e, background0.e) && this.f == background0.f && L.g(this.g, background0.g);
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.d == null ? 0 : Color.K(this.d.M());
        Brush brush0 = this.e;
        if(brush0 != null) {
            v = brush0.hashCode();
        }
        return ((v1 * 0x1F + v) * 0x1F + Float.floatToIntBits(this.f)) * 0x1F + this.g.hashCode();
    }

    private final void j(ContentDrawScope contentDrawScope0) {
        Outline outline0;
        if(!Size.j(contentDrawScope0.b(), this.h) || contentDrawScope0.getLayoutDirection() != this.i) {
            long v = contentDrawScope0.b();
            LayoutDirection layoutDirection0 = contentDrawScope0.getLayoutDirection();
            outline0 = this.g.a(v, layoutDirection0, contentDrawScope0);
        }
        else {
            outline0 = this.j;
            L.m(outline0);
        }
        if(this.d != null) {
            OutlineKt.g(contentDrawScope0, outline0, this.d.M(), 0.0f, null, null, 0, 60, null);
        }
        Brush brush0 = this.e;
        if(brush0 != null) {
            OutlineKt.e(contentDrawScope0, outline0, brush0, this.f, null, null, 0, 56, null);
        }
        this.j = outline0;
        this.h = Size.c(contentDrawScope0.b());
        this.i = contentDrawScope0.getLayoutDirection();
    }

    private final void l(ContentDrawScope contentDrawScope0) {
        Color color0 = this.d;
        if(color0 != null) {
            androidx.compose.ui.graphics.drawscope.b.K(contentDrawScope0, color0.M(), 0L, 0L, 0.0f, null, null, 0, 0x7E, null);
        }
        Brush brush0 = this.e;
        if(brush0 != null) {
            androidx.compose.ui.graphics.drawscope.b.J(contentDrawScope0, brush0, 0L, 0L, this.f, null, null, 0, 0x76, null);
        }
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override
    @l
    public String toString() {
        return "Background(color=" + this.d + ", brush=" + this.e + ", alpha = " + this.f + ", shape=" + this.g + ')';
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }

    @Override  // androidx.compose.ui.draw.DrawModifier
    public void v(@l ContentDrawScope contentDrawScope0) {
        L.p(contentDrawScope0, "<this>");
        if(this.g == RectangleShapeKt.a()) {
            this.l(contentDrawScope0);
        }
        else {
            this.j(contentDrawScope0);
        }
        contentDrawScope0.Q0();
    }
}

