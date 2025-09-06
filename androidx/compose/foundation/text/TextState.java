package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,702:1\n76#2:703\n102#2,2:704\n76#2:706\n102#2,2:707\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextState\n*L\n579#1:703\n579#1:704,2\n581#1:706\n581#1:707,2\n*E\n"})
public final class TextState {
    private final long a;
    @l
    private Function1 b;
    @m
    private Selectable c;
    @m
    private LayoutCoordinates d;
    @l
    private TextDelegate e;
    @m
    private TextLayoutResult f;
    private long g;
    private long h;
    @l
    private final MutableState i;
    @l
    private final MutableState j;

    public TextState(@l TextDelegate textDelegate0, long v) {
        L.p(textDelegate0, "textDelegate");
        super();
        this.a = v;
        this.b = androidx.compose.foundation.text.TextState.onTextLayout.1.e;
        this.e = textDelegate0;
        this.g = 0L;
        this.h = 16L;
        SnapshotMutationPolicy snapshotMutationPolicy0 = SnapshotStateKt.l();
        this.i = SnapshotStateKt.j(S0.a, snapshotMutationPolicy0);
        SnapshotMutationPolicy snapshotMutationPolicy1 = SnapshotStateKt.l();
        this.j = SnapshotStateKt.j(S0.a, snapshotMutationPolicy1);

        final class androidx.compose.foundation.text.TextState.onTextLayout.1 extends N implements Function1 {
            public static final androidx.compose.foundation.text.TextState.onTextLayout.1 e;

            static {
                androidx.compose.foundation.text.TextState.onTextLayout.1.e = new androidx.compose.foundation.text.TextState.onTextLayout.1();
            }

            androidx.compose.foundation.text.TextState.onTextLayout.1() {
                super(1);
            }

            public final void a(@l TextLayoutResult textLayoutResult0) {
                L.p(textLayoutResult0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((TextLayoutResult)object0));
                return S0.a;
            }
        }

    }

    @l
    public final S0 a() {
        this.i.getValue();
        return S0.a;
    }

    @m
    public final LayoutCoordinates b() {
        return this.d;
    }

    @l
    public final S0 c() {
        this.j.getValue();
        return S0.a;
    }

    @m
    public final TextLayoutResult d() {
        return this.f;
    }

    @l
    public final Function1 e() {
        return this.b;
    }

    public final long f() {
        return this.g;
    }

    @m
    public final Selectable g() {
        return this.c;
    }

    public final long h() {
        return this.a;
    }

    public final long i() {
        return this.h;
    }

    @l
    public final TextDelegate j() {
        return this.e;
    }

    private final void k(S0 s00) {
        this.i.setValue(s00);
    }

    public final void l(@m LayoutCoordinates layoutCoordinates0) {
        this.d = layoutCoordinates0;
    }

    private final void m(S0 s00) {
        this.j.setValue(s00);
    }

    public final void n(@m TextLayoutResult textLayoutResult0) {
        this.k(S0.a);
        this.f = textLayoutResult0;
    }

    public final void o(@l Function1 function10) {
        L.p(function10, "<set-?>");
        this.b = function10;
    }

    public final void p(long v) {
        this.g = v;
    }

    public final void q(@m Selectable selectable0) {
        this.c = selectable0;
    }

    public final void r(long v) {
        this.h = v;
    }

    public final void s(@l TextDelegate textDelegate0) {
        L.p(textDelegate0, "value");
        this.m(S0.a);
        this.e = textDelegate0;
    }
}

