package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n73#1,8:433\n73#1,8:441\n73#1,8:449\n73#1,8:457\n73#1,8:465\n73#1,8:473\n73#1,8:481\n73#1,8:489\n73#1,8:497\n73#1,8:505\n73#1,8:513\n73#1,8:521\n73#1,6:529\n80#1:536\n73#1,8:537\n73#1,8:545\n73#1,8:553\n74#1,7:561\n74#1,7:568\n73#1,8:575\n73#1,8:583\n73#1,8:591\n73#1,8:599\n74#1,7:607\n1#2:535\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:433,8\n95#1:441,8\n99#1:449,8\n107#1:457,8\n118#1:465,8\n134#1:473,8\n158#1:481,8\n163#1:489,8\n168#1:497,8\n172#1:505,8\n176#1:513,8\n184#1:521,8\n194#1:529,6\n194#1:536\n200#1:537,8\n204#1:545,8\n208#1:553,8\n212#1:561,7\n216#1:568,7\n222#1:575,8\n228#1:583,8\n232#1:591,8\n240#1:599,8\n249#1:607,7\n*E\n"})
public abstract class BaseTextPreparedSelection {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private final AnnotatedString a;
    private final long b;
    @m
    private final TextLayoutResult c;
    @l
    private final OffsetMapping d;
    @l
    private final TextPreparedSelectionState e;
    private long f;
    @l
    private AnnotatedString g;
    @l
    public static final Companion h = null;
    public static final int i = -1;

    static {
        BaseTextPreparedSelection.h = new Companion(null);
    }

    private BaseTextPreparedSelection(AnnotatedString annotatedString0, long v, TextLayoutResult textLayoutResult0, OffsetMapping offsetMapping0, TextPreparedSelectionState textPreparedSelectionState0) {
        this.a = annotatedString0;
        this.b = v;
        this.c = textLayoutResult0;
        this.d = offsetMapping0;
        this.e = textPreparedSelectionState0;
        this.f = v;
        this.g = annotatedString0;
    }

    public BaseTextPreparedSelection(AnnotatedString annotatedString0, long v, TextLayoutResult textLayoutResult0, OffsetMapping offsetMapping0, TextPreparedSelectionState textPreparedSelectionState0, w w0) {
        this(annotatedString0, v, textLayoutResult0, offsetMapping0, textPreparedSelectionState0);
    }

    @m
    public final Integer A() {
        return this.c == null ? null : BaseTextPreparedSelection.z(this, this.c, 0, 1, null);
    }

    public final long B() {
        return this.f;
    }

    @l
    public final TextPreparedSelectionState C() {
        return this.e;
    }

    @l
    public final String D() {
        return this.g.j();
    }

    private final boolean E() {
        return (this.c == null ? null : this.c.y(this.e0())) != ResolvedTextDirection.b;
    }

    private final int F(TextLayoutResult textLayoutResult0, int v) {
        int v1 = this.e0();
        if(this.e.a() == null) {
            Float float0 = textLayoutResult0.e(v1).t();
            this.e.c(float0);
        }
        int v2 = textLayoutResult0.q(v1) + v;
        if(v2 < 0) {
            return 0;
        }
        if(v2 >= textLayoutResult0.n()) {
            return this.D().length();
        }
        float f = textLayoutResult0.m(v2);
        Float float1 = this.e.a();
        L.m(float1);
        float f1 = float1.floatValue();
        if(this.E() && f1 >= textLayoutResult0.t(v2) || !this.E() && f1 <= textLayoutResult0.s(v2)) {
            return textLayoutResult0.o(v2, true);
        }
        int v3 = textLayoutResult0.x(OffsetKt.a(float1.floatValue(), f - 1.0f));
        return this.d.a(v3);
    }

    @l
    public final BaseTextPreparedSelection G() {
        if(this.D().length() > 0) {
            TextLayoutResult textLayoutResult0 = this.c;
            if(textLayoutResult0 != null) {
                this.b0(this.F(textLayoutResult0, 1));
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection H() {
        this.C().b();
        if(this.D().length() > 0) {
            if(this.E()) {
                this.M();
            }
            else {
                this.J();
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection I() {
        this.C().b();
        if(this.D().length() > 0) {
            if(this.E()) {
                this.O();
            }
            else {
                this.L();
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final BaseTextPreparedSelection J() {
        this.C().b();
        if(this.D().length() > 0) {
            int v = this.o();
            if(v != -1) {
                this.b0(v);
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection K() {
        this.C().b();
        if(this.D().length() > 0) {
            this.b0(this.v());
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final BaseTextPreparedSelection L() {
        this.C().b();
        if(this.D().length() > 0) {
            Integer integer0 = this.p();
            if(integer0 != null) {
                this.b0(integer0.intValue());
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final BaseTextPreparedSelection M() {
        this.C().b();
        if(this.D().length() > 0) {
            int v = this.x();
            if(v != -1) {
                this.b0(v);
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection N() {
        this.C().b();
        if(this.D().length() > 0) {
            this.b0(this.w());
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final BaseTextPreparedSelection O() {
        this.C().b();
        if(this.D().length() > 0) {
            Integer integer0 = this.A();
            if(integer0 != null) {
                this.b0(integer0.intValue());
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection P() {
        this.C().b();
        if(this.D().length() > 0) {
            if(this.E()) {
                this.J();
            }
            else {
                this.M();
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection Q() {
        this.C().b();
        if(this.D().length() > 0) {
            if(this.E()) {
                this.L();
            }
            else {
                this.O();
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection R() {
        this.C().b();
        if(this.D().length() > 0) {
            this.b0(this.D().length());
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection S() {
        this.C().b();
        if(this.D().length() > 0) {
            this.b0(0);
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection T() {
        this.C().b();
        if(this.D().length() > 0) {
            Integer integer0 = this.i();
            if(integer0 != null) {
                this.b0(integer0.intValue());
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection U() {
        this.C().b();
        if(this.D().length() > 0) {
            if(this.E()) {
                this.W();
            }
            else {
                this.T();
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection V() {
        this.C().b();
        if(this.D().length() > 0) {
            if(this.E()) {
                this.T();
            }
            else {
                this.W();
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection W() {
        this.C().b();
        if(this.D().length() > 0) {
            Integer integer0 = this.l();
            if(integer0 != null) {
                this.b0(integer0.intValue());
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection X() {
        if(this.D().length() > 0) {
            TextLayoutResult textLayoutResult0 = this.c;
            if(textLayoutResult0 != null) {
                this.b0(this.F(textLayoutResult0, -1));
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection Y() {
        this.C().b();
        if(this.D().length() > 0) {
            this.c0(0, this.D().length());
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final BaseTextPreparedSelection Z() {
        if(this.D().length() > 0) {
            this.f = TextRangeKt.b(((int)(this.b >> 0x20)), ((int)(this.f & 0xFFFFFFFFL)));
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    protected final BaseTextPreparedSelection a(Object object0, boolean z, @l Function1 function10) {
        L.p(function10, "block");
        if(z) {
            this.C().b();
        }
        if(this.D().length() > 0) {
            function10.invoke(object0);
        }
        L.n(object0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (BaseTextPreparedSelection)object0;
    }

    public final void a0(@l AnnotatedString annotatedString0) {
        L.p(annotatedString0, "<set-?>");
        this.g = annotatedString0;
    }

    public static BaseTextPreparedSelection b(BaseTextPreparedSelection baseTextPreparedSelection0, Object object0, boolean z, Function1 function10, int v, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if((v & 1) != 0) {
            z = true;
        }
        L.p(function10, "block");
        if(z) {
            baseTextPreparedSelection0.C().b();
        }
        if(baseTextPreparedSelection0.D().length() > 0) {
            function10.invoke(object0);
        }
        L.n(object0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (BaseTextPreparedSelection)object0;
    }

    protected final void b0(int v) {
        this.c0(v, v);
    }

    private final int c(int v) {
        return s.B(v, this.D().length() - 1);
    }

    protected final void c0(int v, int v1) {
        this.f = TextRangeKt.b(v, v1);
    }

    @l
    public final BaseTextPreparedSelection d(@l Function1 function10) {
        L.p(function10, "or");
        this.C().b();
        if(this.D().length() > 0) {
            if(TextRange.h(this.f)) {
                L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                function10.invoke(this);
            }
            else if(this.E()) {
                this.b0(TextRange.l(this.f));
            }
            else {
                this.b0(TextRange.k(this.f));
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void d0(long v) {
        this.f = v;
    }

    @l
    public final BaseTextPreparedSelection e(@l Function1 function10) {
        L.p(function10, "or");
        this.C().b();
        if(this.D().length() > 0) {
            if(TextRange.h(this.f)) {
                L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                function10.invoke(this);
            }
            else if(this.E()) {
                this.b0(TextRange.k(this.f));
            }
            else {
                this.b0(TextRange.l(this.f));
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int e0() {
        return this.d.b(((int)(this.f & 0xFFFFFFFFL)));
    }

    @l
    public final BaseTextPreparedSelection f() {
        this.C().b();
        if(this.D().length() > 0) {
            this.b0(((int)(this.f & 0xFFFFFFFFL)));
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int f0() {
        return this.d.b(TextRange.k(this.f));
    }

    @l
    public final AnnotatedString g() {
        return this.g;
    }

    private final int g0() {
        return this.d.b(TextRange.l(this.f));
    }

    @m
    public final TextLayoutResult h() {
        return this.c;
    }

    @m
    public final Integer i() {
        return this.c == null ? null : BaseTextPreparedSelection.k(this, this.c, 0, 1, null);
    }

    private final int j(TextLayoutResult textLayoutResult0, int v) {
        int v1 = textLayoutResult0.o(textLayoutResult0.q(v), true);
        return this.d.a(v1);
    }

    static int k(BaseTextPreparedSelection baseTextPreparedSelection0, TextLayoutResult textLayoutResult0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if((v1 & 1) != 0) {
            v = baseTextPreparedSelection0.f0();
        }
        return baseTextPreparedSelection0.j(textLayoutResult0, v);
    }

    @m
    public final Integer l() {
        return this.c == null ? null : BaseTextPreparedSelection.n(this, this.c, 0, 1, null);
    }

    private final int m(TextLayoutResult textLayoutResult0, int v) {
        int v1 = textLayoutResult0.u(textLayoutResult0.q(v));
        return this.d.a(v1);
    }

    static int n(BaseTextPreparedSelection baseTextPreparedSelection0, TextLayoutResult textLayoutResult0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if((v1 & 1) != 0) {
            v = baseTextPreparedSelection0.g0();
        }
        return baseTextPreparedSelection0.m(textLayoutResult0, v);
    }

    public final int o() {
        return StringHelpers_androidKt.a(this.g.j(), ((int)(this.f & 0xFFFFFFFFL)));
    }

    @m
    public final Integer p() {
        return this.c == null ? null : BaseTextPreparedSelection.r(this, this.c, 0, 1, null);
    }

    private final int q(TextLayoutResult textLayoutResult0, int v) {
        long v1;
        while(true) {
            if(v >= this.a.length()) {
                return this.a.length();
            }
            v1 = textLayoutResult0.C(this.c(v));
            if(((int)(v1 & 0xFFFFFFFFL)) > v) {
                break;
            }
            ++v;
        }
        return this.d.a(((int)(v1 & 0xFFFFFFFFL)));
    }

    static int r(BaseTextPreparedSelection baseTextPreparedSelection0, TextLayoutResult textLayoutResult0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if((v1 & 1) != 0) {
            v = baseTextPreparedSelection0.e0();
        }
        return baseTextPreparedSelection0.q(textLayoutResult0, v);
    }

    @l
    public final OffsetMapping s() {
        return this.d;
    }

    public final long t() {
        return this.b;
    }

    @l
    public final AnnotatedString u() {
        return this.a;
    }

    private final int v() {
        return StringHelpersKt.a(this.D(), TextRange.k(this.f));
    }

    private final int w() {
        return StringHelpersKt.b(this.D(), TextRange.l(this.f));
    }

    public final int x() {
        return StringHelpers_androidKt.b(this.g.j(), ((int)(this.f & 0xFFFFFFFFL)));
    }

    private final int y(TextLayoutResult textLayoutResult0, int v) {
        long v1;
        while(true) {
            if(v <= 0) {
                return 0;
            }
            v1 = textLayoutResult0.C(this.c(v));
            if(((int)(v1 >> 0x20)) < v) {
                break;
            }
            --v;
        }
        return this.d.a(((int)(v1 >> 0x20)));
    }

    static int z(BaseTextPreparedSelection baseTextPreparedSelection0, TextLayoutResult textLayoutResult0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if((v1 & 1) != 0) {
            v = baseTextPreparedSelection0.e0();
        }
        return baseTextPreparedSelection0.y(textLayoutResult0, v);
    }
}

