package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1087:1\n154#2:1088\n76#3:1089\n102#3,2:1090\n76#3:1092\n102#3,2:1093\n76#3:1095\n102#3,2:1096\n76#3:1098\n102#3,2:1099\n76#3:1101\n102#3,2:1102\n76#3:1104\n102#3,2:1105\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n*L\n749#1:1088\n744#1:1089\n744#1:1090,2\n749#1:1092\n749#1:1093,2\n800#1:1095\n800#1:1096,2\n811#1:1098\n811#1:1099,2\n817#1:1101\n817#1:1102,2\n823#1:1104\n823#1:1105,2\n*E\n"})
public final class TextFieldState {
    @l
    private TextDelegate a;
    @l
    private final RecomposeScope b;
    @l
    private final EditProcessor c;
    @m
    private TextInputSession d;
    @l
    private final MutableState e;
    @l
    private final MutableState f;
    @m
    private LayoutCoordinates g;
    @l
    private final MutableState h;
    @m
    private AnnotatedString i;
    @l
    private final MutableState j;
    private boolean k;
    @l
    private final MutableState l;
    @l
    private final MutableState m;
    @l
    private final MutableState n;
    private boolean o;
    @l
    private final KeyboardActionRunner p;
    @l
    private Function1 q;
    @l
    private final Function1 r;
    @l
    private final Function1 s;
    @l
    private final Paint t;

    public TextFieldState(@l TextDelegate textDelegate0, @l RecomposeScope recomposeScope0) {
        L.p(textDelegate0, "textDelegate");
        L.p(recomposeScope0, "recomposeScope");
        super();
        this.a = textDelegate0;
        this.b = recomposeScope0;
        this.c = new EditProcessor();
        this.e = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.f = SnapshotStateKt__SnapshotStateKt.g(Dp.d(0.0f), null, 2, null);
        this.h = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.j = SnapshotStateKt__SnapshotStateKt.g(HandleState.a, null, 2, null);
        this.l = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.m = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.n = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.o = true;
        this.p = new KeyboardActionRunner();
        this.q = androidx.compose.foundation.text.TextFieldState.onValueChangeOriginal.1.e;
        this.r = new Function1() {
            final TextFieldState e;

            {
                this.e = textFieldState0;
                super(1);
            }

            public final void a(@l TextFieldValue textFieldValue0) {
                L.p(textFieldValue0, "it");
                String s = textFieldValue0.i();
                AnnotatedString annotatedString0 = this.e.s();
                if(!L.g(s, (annotatedString0 == null ? null : annotatedString0.j()))) {
                    this.e.u(HandleState.a);
                }
                this.e.q.invoke(textFieldValue0);
                this.e.l().invalidate();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((TextFieldValue)object0));
                return S0.a;
            }
        };
        this.s = new Function1() {
            final TextFieldState e;

            {
                this.e = textFieldState0;
                super(1);
            }

            public final void a(int v) {
                this.e.p.e(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((ImeAction)object0).o());
                return S0.a;
            }
        };
        this.t = AndroidPaint_androidKt.a();

        final class androidx.compose.foundation.text.TextFieldState.onValueChangeOriginal.1 extends N implements Function1 {
            public static final androidx.compose.foundation.text.TextFieldState.onValueChangeOriginal.1 e;

            static {
                androidx.compose.foundation.text.TextFieldState.onValueChangeOriginal.1.e = new androidx.compose.foundation.text.TextFieldState.onValueChangeOriginal.1();
            }

            androidx.compose.foundation.text.TextFieldState.onValueChangeOriginal.1() {
                super(1);
            }

            public final void a(@l TextFieldValue textFieldValue0) {
                L.p(textFieldValue0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((TextFieldValue)object0));
                return S0.a;
            }
        }

    }

    public final void A(boolean z) {
        this.n.setValue(Boolean.valueOf(z));
    }

    public final void B(boolean z) {
        this.k = z;
    }

    public final void C(boolean z) {
        this.m.setValue(Boolean.valueOf(z));
    }

    public final void D(boolean z) {
        this.l.setValue(Boolean.valueOf(z));
    }

    public final void E(@l TextDelegate textDelegate0) {
        L.p(textDelegate0, "<set-?>");
        this.a = textDelegate0;
    }

    public final void F(@m AnnotatedString annotatedString0) {
        this.i = annotatedString0;
    }

    public final void G(@l AnnotatedString annotatedString0, @l AnnotatedString annotatedString1, @l TextStyle textStyle0, boolean z, @l Density density0, @l Resolver fontFamily$Resolver0, @l Function1 function10, @l KeyboardActions keyboardActions0, @l FocusManager focusManager0, long v) {
        L.p(annotatedString0, "untransformedText");
        L.p(annotatedString1, "visualText");
        L.p(textStyle0, "textStyle");
        L.p(density0, "density");
        L.p(fontFamily$Resolver0, "fontFamilyResolver");
        L.p(function10, "onValueChange");
        L.p(keyboardActions0, "keyboardActions");
        L.p(focusManager0, "focusManager");
        this.q = function10;
        this.t.g(v);
        this.p.h(keyboardActions0);
        this.p.f(focusManager0);
        this.p.g(this.d);
        this.i = annotatedString0;
        TextDelegate textDelegate0 = CoreTextKt.d(this.a, annotatedString1, textStyle0, density0, fontFamily$Resolver0, z, 0, 0, 0, u.H(), 0x1C0, null);
        if(this.a != textDelegate0) {
            this.o = true;
        }
        this.a = textDelegate0;
    }

    @l
    public final HandleState c() {
        return (HandleState)this.j.getValue();
    }

    public final boolean d() {
        return ((Boolean)this.e.getValue()).booleanValue();
    }

    @m
    public final TextInputSession e() {
        return this.d;
    }

    @m
    public final LayoutCoordinates f() {
        return this.g;
    }

    @m
    public final TextLayoutResultProxy g() {
        return (TextLayoutResultProxy)this.h.getValue();
    }

    public final float h() {
        return ((Dp)this.f.getValue()).w();
    }

    @l
    public final Function1 i() {
        return this.s;
    }

    @l
    public final Function1 j() {
        return this.r;
    }

    @l
    public final EditProcessor k() {
        return this.c;
    }

    @l
    public final RecomposeScope l() {
        return this.b;
    }

    @l
    public final Paint m() {
        return this.t;
    }

    public final boolean n() {
        return ((Boolean)this.n.getValue()).booleanValue();
    }

    public final boolean o() {
        return this.k;
    }

    public final boolean p() {
        return ((Boolean)this.m.getValue()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean)this.l.getValue()).booleanValue();
    }

    @l
    public final TextDelegate r() {
        return this.a;
    }

    @m
    public final AnnotatedString s() {
        return this.i;
    }

    public final boolean t() {
        return this.o;
    }

    public final void u(@l HandleState handleState0) {
        L.p(handleState0, "<set-?>");
        this.j.setValue(handleState0);
    }

    public final void v(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    public final void w(@m TextInputSession textInputSession0) {
        this.d = textInputSession0;
    }

    public final void x(@m LayoutCoordinates layoutCoordinates0) {
        this.g = layoutCoordinates0;
    }

    public final void y(@m TextLayoutResultProxy textLayoutResultProxy0) {
        this.h.setValue(textLayoutResultProxy0);
        this.o = false;
    }

    public final void z(float f) {
        Dp dp0 = Dp.d(f);
        this.f.setValue(dp0);
    }
}

