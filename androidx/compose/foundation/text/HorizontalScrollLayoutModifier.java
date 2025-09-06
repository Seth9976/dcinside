package androidx.compose.foundation.text;

import A3.a;
import A3.o;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class HorizontalScrollLayoutModifier implements LayoutModifier {
    @l
    private final TextFieldScrollerPosition a;
    private final int b;
    @l
    private final TransformedText c;
    @l
    private final a d;

    public HorizontalScrollLayoutModifier(@l TextFieldScrollerPosition textFieldScrollerPosition0, int v, @l TransformedText transformedText0, @l a a0) {
        L.p(textFieldScrollerPosition0, "scrollerPosition");
        L.p(transformedText0, "transformedText");
        L.p(a0, "textLayoutResultProvider");
        super();
        this.a = textFieldScrollerPosition0;
        this.b = v;
        this.c = transformedText0;
        this.d = a0;
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

    @l
    public final TextFieldScrollerPosition a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int c(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.d(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @l
    public final TransformedText d() {
        return this.c;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int e(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.b(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        if(!L.g(this.a, ((HorizontalScrollLayoutModifier)object0).a)) {
            return false;
        }
        if(this.b != ((HorizontalScrollLayoutModifier)object0).b) {
            return false;
        }
        return L.g(this.c, ((HorizontalScrollLayoutModifier)object0).c) ? L.g(this.d, ((HorizontalScrollLayoutModifier)object0).d) : false;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int f(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.a(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int g(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.c(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        Placeable placeable0 = measurable0.r1((measurable0.h1(Constraints.o(v)) >= Constraints.p(v) ? Constraints.e(v, 0, 0x7FFFFFFF, 0, 0, 13, null) : v));
        int v1 = Math.min(placeable0.N1(), Constraints.p(v));
        return MeasureScope.-CC.p(measureScope0, v1, placeable0.K1(), null, new Function1(this, placeable0, v1) {
            final MeasureScope e;
            final HorizontalScrollLayoutModifier f;
            final Placeable g;
            final int h;

            {
                this.e = measureScope0;
                this.f = horizontalScrollLayoutModifier0;
                this.g = placeable0;
                this.h = v;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                TextLayoutResultProxy textLayoutResultProxy0 = (TextLayoutResultProxy)this.f.p().invoke();
                Rect rect0 = TextFieldScrollKt.b(this.e, this.f.m(), this.f.q(), (textLayoutResultProxy0 == null ? null : textLayoutResultProxy0.i()), this.e.getLayoutDirection() == LayoutDirection.b, this.g.N1());
                this.f.n().l(Orientation.b, rect0, this.h, this.g.N1());
                int v = kotlin.math.b.L0(-this.f.n().d());
                PlacementScope.v(placeable$PlacementScope0, this.g, v, 0, 0.0f, 4, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null);
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @l
    public final a i() {
        return this.d;
    }

    @l
    public final HorizontalScrollLayoutModifier j(@l TextFieldScrollerPosition textFieldScrollerPosition0, int v, @l TransformedText transformedText0, @l a a0) {
        L.p(textFieldScrollerPosition0, "scrollerPosition");
        L.p(transformedText0, "transformedText");
        L.p(a0, "textLayoutResultProvider");
        return new HorizontalScrollLayoutModifier(textFieldScrollerPosition0, v, transformedText0, a0);
    }

    public static HorizontalScrollLayoutModifier l(HorizontalScrollLayoutModifier horizontalScrollLayoutModifier0, TextFieldScrollerPosition textFieldScrollerPosition0, int v, TransformedText transformedText0, a a0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            textFieldScrollerPosition0 = horizontalScrollLayoutModifier0.a;
        }
        if((v1 & 2) != 0) {
            v = horizontalScrollLayoutModifier0.b;
        }
        if((v1 & 4) != 0) {
            transformedText0 = horizontalScrollLayoutModifier0.c;
        }
        if((v1 & 8) != 0) {
            a0 = horizontalScrollLayoutModifier0.d;
        }
        return horizontalScrollLayoutModifier0.j(textFieldScrollerPosition0, v, transformedText0, a0);
    }

    public final int m() {
        return this.b;
    }

    @l
    public final TextFieldScrollerPosition n() {
        return this.a;
    }

    @l
    public final a p() {
        return this.d;
    }

    @l
    public final TransformedText q() {
        return this.c;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return androidx.compose.ui.a.a(this, modifier0);
    }

    @Override
    @l
    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

