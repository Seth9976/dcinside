package androidx.compose.foundation.text.selection;

import A3.a;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
public final class MultiWidgetSelectionDelegate implements Selectable {
    private final long a;
    @l
    private final a b;
    @l
    private final a c;
    @m
    private TextLayoutResult d;
    private int e;

    public MultiWidgetSelectionDelegate(long v, @l a a0, @l a a1) {
        L.p(a0, "coordinatesCallback");
        L.p(a1, "layoutResultCallback");
        super();
        this.a = v;
        this.b = a0;
        this.c = a1;
        this.e = -1;
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    @l
    public AnnotatedString a() {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        return textLayoutResult0 == null ? new AnnotatedString("", null, null, 6, null) : textLayoutResult0.l().n();
    }

    private final int b(TextLayoutResult textLayoutResult0) {
        synchronized(this) {
            if(this.d != textLayoutResult0) {
                if(!textLayoutResult0.f() || textLayoutResult0.w().e()) {
                    v1 = textLayoutResult0.n() - 1;
                }
                else {
                    int v1;
                    for(v1 = s.B(textLayoutResult0.r(((float)(((int)(textLayoutResult0.B() & 0xFFFFFFFFL))))), textLayoutResult0.n() - 1); textLayoutResult0.v(v1) >= ((float)(((int)(textLayoutResult0.B() & 0xFFFFFFFFL)))); --v1) {
                    }
                }
                this.e = textLayoutResult0.o(v1, true);
                this.d = textLayoutResult0;
            }
            return this.e;
        }
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    @l
    public Rect c(int v) {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        if(textLayoutResult0 == null) {
            return Rect.e.a();
        }
        int v1 = textLayoutResult0.l().n().length();
        return v1 >= 1 ? textLayoutResult0.d(s.I(v, 0, v1 - 1)) : Rect.e.a();
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    @m
    public LayoutCoordinates d() {
        LayoutCoordinates layoutCoordinates0 = (LayoutCoordinates)this.b.invoke();
        return layoutCoordinates0 == null || !layoutCoordinates0.o() ? null : layoutCoordinates0;
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    @l
    public V e(long v, long v1, @m Offset offset0, boolean z, @l LayoutCoordinates layoutCoordinates0, @l SelectionAdjustment selectionAdjustment0, @m Selection selection0) {
        L.p(layoutCoordinates0, "containerLayoutCoordinates");
        L.p(selectionAdjustment0, "adjustment");
        if(selection0 != null && (this.h() != selection0.h().h() || this.h() != selection0.f().h())) {
            throw new IllegalArgumentException("The given previousSelection doesn\'t belong to this selectable.");
        }
        LayoutCoordinates layoutCoordinates1 = this.d();
        if(layoutCoordinates1 == null) {
            return new V(null, Boolean.FALSE);
        }
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        if(textLayoutResult0 == null) {
            return new V(null, Boolean.FALSE);
        }
        long v2 = layoutCoordinates0.P(layoutCoordinates1, 0L);
        long v3 = Offset.u(v, v2);
        long v4 = Offset.u(v1, v2);
        return offset0 == null ? MultiWidgetSelectionDelegateKt.d(textLayoutResult0, v3, v4, null, this.h(), selectionAdjustment0, selection0, z) : MultiWidgetSelectionDelegateKt.d(textLayoutResult0, v3, v4, Offset.d(Offset.u(offset0.A(), v2)), this.h(), selectionAdjustment0, selection0, z);
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    public long f(@l Selection selection0, boolean z) {
        L.p(selection0, "selection");
        if(z && selection0.h().h() != this.h() || !z && selection0.f().h() != this.h()) {
            return 0L;
        }
        if(this.d() == null) {
            return 0L;
        }
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        if(textLayoutResult0 == null) {
            return 0L;
        }
        return z ? TextSelectionDelegateKt.b(textLayoutResult0, s.I(selection0.h().g(), 0, this.b(textLayoutResult0)), true, selection0.g()) : TextSelectionDelegateKt.b(textLayoutResult0, s.I(selection0.f().g(), 0, this.b(textLayoutResult0)), false, selection0.g());
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    public int g() {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        return textLayoutResult0 == null ? 0 : this.b(textLayoutResult0);
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    public long h() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    @m
    public Selection i() {
        Object object0 = this.c.invoke();
        return ((TextLayoutResult)object0) == null ? null : MultiWidgetSelectionDelegateKt.b(TextRangeKt.b(0, ((TextLayoutResult)object0).l().n().length()), false, this.h(), ((TextLayoutResult)object0));
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    public long j(int v) {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        if(textLayoutResult0 == null) {
            return 0L;
        }
        int v1 = this.b(textLayoutResult0);
        if(v1 < 1) {
            return 0L;
        }
        int v2 = textLayoutResult0.q(s.I(v, 0, v1 - 1));
        return TextRangeKt.b(textLayoutResult0.u(v2), textLayoutResult0.o(v2, true));
    }
}

