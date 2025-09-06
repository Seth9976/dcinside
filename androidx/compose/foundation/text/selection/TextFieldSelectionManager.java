package androidx.compose.foundation.text.selection;

import A3.a;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,906:1\n76#2:907\n102#2,2:908\n76#2:910\n102#2,2:911\n76#2:913\n102#2,2:914\n76#2:916\n102#2,2:917\n1#3:919\n154#4:920\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n86#1:907\n86#1:908,2\n117#1:910\n117#1:911,2\n147#1:913\n147#1:914,2\n150#1:916\n150#1:917,2\n737#1:920\n*E\n"})
public final class TextFieldSelectionManager {
    @m
    private final UndoManager a;
    @l
    private OffsetMapping b;
    @l
    private Function1 c;
    @m
    private TextFieldState d;
    @l
    private final MutableState e;
    @l
    private VisualTransformation f;
    @m
    private ClipboardManager g;
    @m
    private TextToolbar h;
    @m
    private HapticFeedback i;
    @m
    private FocusRequester j;
    @l
    private final MutableState k;
    private long l;
    @m
    private Integer m;
    private long n;
    @l
    private final MutableState o;
    @l
    private final MutableState p;
    @l
    private TextFieldValue q;
    @l
    private final TextDragObserver r;
    @l
    private final MouseSelectionObserver s;

    public TextFieldSelectionManager() {
        this(null, 1, null);
    }

    public TextFieldSelectionManager(@m UndoManager undoManager0) {
        this.a = undoManager0;
        this.b = ValidatingOffsetMappingKt.b();
        this.c = androidx.compose.foundation.text.selection.TextFieldSelectionManager.onValueChange.1.e;
        this.e = SnapshotStateKt__SnapshotStateKt.g(new TextFieldValue(null, 0L, null, 7, null), null, 2, null);
        this.f = VisualTransformation.a.a();
        this.k = SnapshotStateKt__SnapshotStateKt.g(Boolean.TRUE, null, 2, null);
        this.l = 0L;
        this.n = 0L;
        this.o = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.p = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.q = new TextFieldValue(null, 0L, null, 7, null);
        this.r = new TextDragObserver() {
            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void a(long v) {
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void b(long v) {
                if(this.a.K().i().length() == 0) {
                    return;
                }
                long v1 = Offset.v(this.a.n, v);
                this.a.n = v1;
                TextFieldState textFieldState0 = this.a.G();
                if(textFieldState0 != null) {
                    TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
                    if(textLayoutResultProxy0 != null) {
                        this.a.S(Offset.d(Offset.v(this.a.l, this.a.n)));
                        Integer integer0 = this.a.m;
                        int v2 = integer0 == null ? textLayoutResultProxy0.g(this.a.l, false) : ((int)integer0);
                        Offset offset0 = this.a.w();
                        L.m(offset0);
                        int v3 = textLayoutResultProxy0.g(offset0.A(), false);
                        this.a.f0(this.a.K(), v2, v3, false, SelectionAdjustment.a.g());
                    }
                }
                TextFieldState textFieldState1 = this.a.G();
                if(textFieldState1 != null) {
                    textFieldState1.B(false);
                }
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void c(long v) {
                if(this.a.y() != null) {
                    return;
                }
                this.a.T(Handle.c);
                this.a.N();
                TextFieldState textFieldState0 = this.a.G();
                if(textFieldState0 == null) {
                label_8:
                    TextFieldState textFieldState1 = this.a.G();
                    if(textFieldState1 != null) {
                        TextLayoutResultProxy textLayoutResultProxy1 = textFieldState1.g();
                        if(textLayoutResultProxy1 != null) {
                            TextFieldSelectionManager textFieldSelectionManager0 = this.a;
                            int v1 = textFieldSelectionManager0.E().a(TextLayoutResultProxy.e(textLayoutResultProxy1, textLayoutResultProxy1.f(Offset.r(v)), false, 2, null));
                            HapticFeedback hapticFeedback0 = textFieldSelectionManager0.C();
                            if(hapticFeedback0 != null) {
                                hapticFeedback0.a(9);
                            }
                            TextFieldValue textFieldValue0 = textFieldSelectionManager0.n(textFieldSelectionManager0.K().f(), TextRangeKt.b(v1, v1));
                            textFieldSelectionManager0.s();
                            textFieldSelectionManager0.F().invoke(textFieldValue0);
                            return;
                        }
                    }
                }
                else {
                    TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
                    if(textLayoutResultProxy0 == null || !textLayoutResultProxy0.j(v)) {
                        goto label_8;
                    }
                }
                if(this.a.K().i().length() == 0) {
                    return;
                }
                this.a.s();
                TextFieldState textFieldState2 = this.a.G();
                if(textFieldState2 != null) {
                    TextLayoutResultProxy textLayoutResultProxy2 = textFieldState2.g();
                    if(textLayoutResultProxy2 != null) {
                        int v2 = TextLayoutResultProxy.h(textLayoutResultProxy2, v, false, 2, null);
                        TextFieldValue textFieldValue1 = this.a.K();
                        this.a.f0(textFieldValue1, v2, v2, false, SelectionAdjustment.a.g());
                        this.a.m = v2;
                    }
                }
                this.a.l = v;
                Offset offset0 = Offset.d(this.a.l);
                this.a.S(offset0);
                this.a.n = 0L;
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void d() {
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.a.T(null);
                this.a.S(null);
                TextFieldState textFieldState0 = this.a.G();
                if(textFieldState0 != null) {
                    textFieldState0.B(true);
                }
                TextToolbar textToolbar0 = this.a.H();
                if((textToolbar0 == null ? null : textToolbar0.getStatus()) == TextToolbarStatus.b) {
                    this.a.e0();
                }
                this.a.m = null;
            }
        };
        this.s = new MouseSelectionObserver() {
            @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean a(long v, @l SelectionAdjustment selectionAdjustment0) {
                L.p(selectionAdjustment0, "adjustment");
                if(this.a.K().i().length() == 0) {
                    return false;
                }
                TextFieldState textFieldState0 = this.a.G();
                if(textFieldState0 != null) {
                    TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
                    if(textLayoutResultProxy0 != null) {
                        int v1 = textLayoutResultProxy0.g(v, false);
                        TextFieldValue textFieldValue0 = this.a.K();
                        Integer integer0 = this.a.m;
                        L.m(integer0);
                        this.a.f0(textFieldValue0, ((int)integer0), v1, false, selectionAdjustment0);
                        return true;
                    }
                }
                return false;
            }

            @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean b(long v) {
                if(this.a.K().i().length() == 0) {
                    return false;
                }
                TextFieldState textFieldState0 = this.a.G();
                if(textFieldState0 != null) {
                    TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
                    if(textLayoutResultProxy0 != null) {
                        int v1 = TextRange.n(this.a.K().h());
                        int v2 = this.a.E().b(v1);
                        int v3 = textLayoutResultProxy0.g(v, false);
                        TextFieldValue textFieldValue0 = this.a.K();
                        this.a.f0(textFieldValue0, v2, v3, false, SelectionAdjustment.a.e());
                        return true;
                    }
                }
                return false;
            }

            @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean c(long v, @l SelectionAdjustment selectionAdjustment0) {
                L.p(selectionAdjustment0, "adjustment");
                FocusRequester focusRequester0 = this.a.A();
                if(focusRequester0 != null) {
                    focusRequester0.h();
                }
                this.a.l = v;
                TextFieldState textFieldState0 = this.a.G();
                if(textFieldState0 != null) {
                    TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
                    if(textLayoutResultProxy0 != null) {
                        Integer integer0 = TextLayoutResultProxy.h(textLayoutResultProxy0, v, false, 2, null);
                        this.a.m = integer0;
                        int v1 = TextLayoutResultProxy.h(textLayoutResultProxy0, this.a.l, false, 2, null);
                        TextFieldValue textFieldValue0 = this.a.K();
                        this.a.f0(textFieldValue0, v1, v1, false, selectionAdjustment0);
                        return true;
                    }
                }
                return false;
            }

            @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean d(long v) {
                TextFieldState textFieldState0 = this.a.G();
                if(textFieldState0 != null) {
                    TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
                    if(textLayoutResultProxy0 != null) {
                        int v1 = TextRange.n(this.a.K().h());
                        int v2 = this.a.E().b(v1);
                        int v3 = TextLayoutResultProxy.h(textLayoutResultProxy0, v, false, 2, null);
                        TextFieldValue textFieldValue0 = this.a.K();
                        this.a.f0(textFieldValue0, v2, v3, false, SelectionAdjustment.a.e());
                        return true;
                    }
                }
                return false;
            }
        };

        final class androidx.compose.foundation.text.selection.TextFieldSelectionManager.onValueChange.1 extends N implements Function1 {
            public static final androidx.compose.foundation.text.selection.TextFieldSelectionManager.onValueChange.1 e;

            static {
                androidx.compose.foundation.text.selection.TextFieldSelectionManager.onValueChange.1.e = new androidx.compose.foundation.text.selection.TextFieldSelectionManager.onValueChange.1();
            }

            androidx.compose.foundation.text.selection.TextFieldSelectionManager.onValueChange.1() {
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

    public TextFieldSelectionManager(UndoManager undoManager0, int v, w w0) {
        if((v & 1) != 0) {
            undoManager0 = null;
        }
        this(undoManager0);
    }

    @m
    public final FocusRequester A() {
        return this.j;
    }

    public final long B(boolean z) {
        long v = this.K().h();
        TextLayoutResultProxy textLayoutResultProxy0 = this.d == null ? null : this.d.g();
        L.m(textLayoutResultProxy0);
        return TextSelectionDelegateKt.b(textLayoutResultProxy0.i(), this.b.b((z ? ((int)(v >> 0x20)) : ((int)(v & 0xFFFFFFFFL)))), z, TextRange.m(this.K().h()));
    }

    @m
    public final HapticFeedback C() {
        return this.i;
    }

    @l
    public final MouseSelectionObserver D() {
        return this.s;
    }

    @l
    public final OffsetMapping E() {
        return this.b;
    }

    @l
    public final Function1 F() {
        return this.c;
    }

    @m
    public final TextFieldState G() {
        return this.d;
    }

    @m
    public final TextToolbar H() {
        return this.h;
    }

    @l
    public final TextDragObserver I() {
        return this.r;
    }

    @m
    public final UndoManager J() {
        return this.a;
    }

    @l
    public final TextFieldValue K() {
        return (TextFieldValue)this.e.getValue();
    }

    @l
    public final VisualTransformation L() {
        return this.f;
    }

    @l
    public final TextDragObserver M(boolean z) {
        return new TextDragObserver() {
            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void a(long v) {
                z.T((this.b ? Handle.b : Handle.c));
                Offset offset0 = Offset.d(SelectionHandlesKt.a(z.B(this.b)));
                z.S(offset0);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void b(long v) {
                int v3;
                int v2;
                long v1 = Offset.v(z.n, v);
                z.n = v1;
                TextFieldState textFieldState0 = z.G();
                if(textFieldState0 != null) {
                    TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
                    if(textLayoutResultProxy0 != null) {
                        TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.i();
                        if(textLayoutResult0 != null) {
                            TextFieldSelectionManager textFieldSelectionManager0 = z;
                            boolean z = this.b;
                            textFieldSelectionManager0.S(Offset.d(Offset.v(textFieldSelectionManager0.l, textFieldSelectionManager0.n)));
                            if(z) {
                                Offset offset0 = textFieldSelectionManager0.w();
                                L.m(offset0);
                                v2 = textLayoutResult0.x(offset0.A());
                            }
                            else {
                                v2 = textFieldSelectionManager0.E().b(TextRange.n(textFieldSelectionManager0.K().h()));
                            }
                            if(z) {
                                v3 = textFieldSelectionManager0.E().b(TextRange.i(textFieldSelectionManager0.K().h()));
                            }
                            else {
                                Offset offset1 = textFieldSelectionManager0.w();
                                L.m(offset1);
                                v3 = textLayoutResult0.x(offset1.A());
                            }
                            textFieldSelectionManager0.f0(textFieldSelectionManager0.K(), v2, v3, z, SelectionAdjustment.a.c());
                        }
                    }
                }
                TextFieldState textFieldState1 = z.G();
                if(textFieldState1 != null) {
                    textFieldState1.B(false);
                }
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void c(long v) {
                long v1 = SelectionHandlesKt.a(z.B(this.b));
                z.l = v1;
                Offset offset0 = Offset.d(z.l);
                z.S(offset0);
                z.n = 0L;
                z.T((this.b ? Handle.b : Handle.c));
                TextFieldState textFieldState0 = z.G();
                if(textFieldState0 != null) {
                    textFieldState0.B(false);
                }
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void d() {
                z.T(null);
                z.S(null);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextToolbarStatus textToolbarStatus0 = null;
                z.T(null);
                z.S(null);
                TextFieldState textFieldState0 = z.G();
                if(textFieldState0 != null) {
                    textFieldState0.B(true);
                }
                TextToolbar textToolbar0 = z.H();
                if(textToolbar0 != null) {
                    textToolbarStatus0 = textToolbar0.getStatus();
                }
                if(textToolbarStatus0 == TextToolbarStatus.b) {
                    z.e0();
                }
            }
        };
    }

    public final void N() {
        if((this.h == null ? null : this.h.getStatus()) == TextToolbarStatus.a) {
            TextToolbar textToolbar0 = this.h;
            if(textToolbar0 != null) {
                textToolbar0.a();
            }
        }
    }

    public final boolean O() {
        return !L.g(this.q.i(), this.K().i());
    }

    public final void P() {
        ClipboardManager clipboardManager0 = this.g;
        if(clipboardManager0 != null) {
            AnnotatedString annotatedString0 = clipboardManager0.a();
            if(annotatedString0 != null) {
                AnnotatedString annotatedString1 = TextFieldValueKt.c(this.K(), this.K().i().length()).n(annotatedString0).n(TextFieldValueKt.b(this.K(), this.K().i().length()));
                int v = TextRange.l(this.K().h());
                int v1 = annotatedString0.length();
                TextFieldValue textFieldValue0 = this.n(annotatedString1, TextRangeKt.b(v + v1, v + v1));
                this.c.invoke(textFieldValue0);
                this.W(HandleState.a);
                UndoManager undoManager0 = this.a;
                if(undoManager0 != null) {
                    undoManager0.a();
                }
            }
        }
    }

    public final void Q() {
        TextFieldValue textFieldValue0 = this.n(this.K().f(), TextRangeKt.b(0, this.K().i().length()));
        this.c.invoke(textFieldValue0);
        this.q = TextFieldValue.d(this.q, null, textFieldValue0.h(), null, 5, null);
        TextFieldState textFieldState0 = this.d;
        if(textFieldState0 != null) {
            textFieldState0.B(true);
        }
    }

    public final void R(@m ClipboardManager clipboardManager0) {
        this.g = clipboardManager0;
    }

    private final void S(Offset offset0) {
        this.p.setValue(offset0);
    }

    private final void T(Handle handle0) {
        this.o.setValue(handle0);
    }

    public final void U(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void V(@m FocusRequester focusRequester0) {
        this.j = focusRequester0;
    }

    private final void W(HandleState handleState0) {
        TextFieldState textFieldState0 = this.d;
        if(textFieldState0 != null) {
            textFieldState0.u(handleState0);
        }
    }

    public final void X(@m HapticFeedback hapticFeedback0) {
        this.i = hapticFeedback0;
    }

    public final void Y(@l OffsetMapping offsetMapping0) {
        L.p(offsetMapping0, "<set-?>");
        this.b = offsetMapping0;
    }

    public final void Z(@l Function1 function10) {
        L.p(function10, "<set-?>");
        this.c = function10;
    }

    public final void a0(@m TextFieldState textFieldState0) {
        this.d = textFieldState0;
    }

    public final void b0(@m TextToolbar textToolbar0) {
        this.h = textToolbar0;
    }

    public final void c0(@l TextFieldValue textFieldValue0) {
        L.p(textFieldValue0, "<set-?>");
        this.e.setValue(textFieldValue0);
    }

    public final void d0(@l VisualTransformation visualTransformation0) {
        L.p(visualTransformation0, "<set-?>");
        this.f = visualTransformation0;
    }

    public final void e0() {
        boolean z = this.f instanceof PasswordVisualTransformation;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager.showSelectionToolbar.selectAll.1 textFieldSelectionManager$showSelectionToolbar$selectAll$10 = null;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager.showSelectionToolbar.copy.1 textFieldSelectionManager$showSelectionToolbar$copy$10 = TextRange.h(this.K().h()) || z ? null : new a() {
            final TextFieldSelectionManager e;

            {
                this.e = textFieldSelectionManager0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                TextFieldSelectionManager.m(this.e, false, 1, null);
                this.e.N();
            }
        };
        androidx.compose.foundation.text.selection.TextFieldSelectionManager.showSelectionToolbar.cut.1 textFieldSelectionManager$showSelectionToolbar$cut$10 = TextRange.h(this.K().h()) || !this.z() || z ? null : new a() {
            final TextFieldSelectionManager e;

            {
                this.e = textFieldSelectionManager0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.p();
                this.e.N();
            }
        };
        androidx.compose.foundation.text.selection.TextFieldSelectionManager.showSelectionToolbar.paste.1 textFieldSelectionManager$showSelectionToolbar$paste$10 = !this.z() || (this.g == null || !this.g.b()) ? null : new a() {
            final TextFieldSelectionManager e;

            {
                this.e = textFieldSelectionManager0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.P();
                this.e.N();
            }
        };
        if(TextRange.j(this.K().h()) != this.K().i().length()) {
            textFieldSelectionManager$showSelectionToolbar$selectAll$10 = new a() {
                final TextFieldSelectionManager e;

                {
                    this.e = textFieldSelectionManager0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    this.e.Q();
                }
            };
        }
        TextToolbar textToolbar0 = this.h;
        if(textToolbar0 != null) {
            textToolbar0.b(this.v(), textFieldSelectionManager$showSelectionToolbar$copy$10, textFieldSelectionManager$showSelectionToolbar$paste$10, textFieldSelectionManager$showSelectionToolbar$cut$10, textFieldSelectionManager$showSelectionToolbar$selectAll$10);
        }
    }

    private final void f0(TextFieldValue textFieldValue0, int v, int v1, boolean z, SelectionAdjustment selectionAdjustment0) {
        TextLayoutResult textLayoutResult0;
        long v2 = TextRangeKt.b(this.b.b(TextRange.n(textFieldValue0.h())), this.b.b(TextRange.i(textFieldValue0.h())));
        TextFieldState textFieldState0 = this.d;
        TextRange textRange0 = null;
        if(textFieldState0 == null) {
            textLayoutResult0 = null;
        }
        else {
            TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
            textLayoutResult0 = textLayoutResultProxy0 == null ? null : textLayoutResultProxy0.i();
        }
        if(!TextRange.h(v2)) {
            textRange0 = TextRange.b(v2);
        }
        long v3 = TextFieldSelectionDelegateKt.a(textLayoutResult0, v, v1, textRange0, z, selectionAdjustment0);
        long v4 = TextRangeKt.b(this.b.a(((int)(v3 >> 0x20))), this.b.a(((int)(v3 & 0xFFFFFFFFL))));
        if(TextRange.g(v4, textFieldValue0.h())) {
            return;
        }
        HapticFeedback hapticFeedback0 = this.i;
        if(hapticFeedback0 != null) {
            hapticFeedback0.a(9);
        }
        TextFieldValue textFieldValue1 = this.n(textFieldValue0.f(), v4);
        this.c.invoke(textFieldValue1);
        TextFieldState textFieldState1 = this.d;
        if(textFieldState1 != null) {
            textFieldState1.D(TextFieldSelectionManagerKt.c(this, true));
        }
        TextFieldState textFieldState2 = this.d;
        if(textFieldState2 != null) {
            textFieldState2.C(TextFieldSelectionManagerKt.c(this, false));
        }
    }

    public final void k(long v) {
        TextFieldState textFieldState0 = this.d;
        if(textFieldState0 != null) {
            TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
            if(textLayoutResultProxy0 != null) {
                int v1 = TextLayoutResultProxy.h(textLayoutResultProxy0, v, false, 2, null);
                if(!TextRange.e(this.K().h(), v1)) {
                    this.f0(this.K(), v1, v1, false, SelectionAdjustment.a.g());
                }
            }
        }
    }

    public final void l(boolean z) {
        if(TextRange.h(this.K().h())) {
            return;
        }
        ClipboardManager clipboardManager0 = this.g;
        if(clipboardManager0 != null) {
            clipboardManager0.c(TextFieldValueKt.a(this.K()));
        }
        if(!z) {
            return;
        }
        int v = TextRange.k(this.K().h());
        TextFieldValue textFieldValue0 = this.n(this.K().f(), TextRangeKt.b(v, v));
        this.c.invoke(textFieldValue0);
        this.W(HandleState.a);
    }

    public static void m(TextFieldSelectionManager textFieldSelectionManager0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager0.l(z);
    }

    private final TextFieldValue n(AnnotatedString annotatedString0, long v) {
        return new TextFieldValue(annotatedString0, v, null, 4, null);
    }

    @l
    public final TextDragObserver o() {
        return new TextDragObserver() {
            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void a(long v) {
                this.a.T(Handle.a);
                Offset offset0 = Offset.d(SelectionHandlesKt.a(this.a.B(true)));
                this.a.S(offset0);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void b(long v) {
                long v1 = Offset.v(this.a.n, v);
                this.a.n = v1;
                TextFieldState textFieldState0 = this.a.G();
                if(textFieldState0 != null) {
                    TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
                    if(textLayoutResultProxy0 != null) {
                        TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.i();
                        if(textLayoutResult0 != null) {
                            TextFieldSelectionManager textFieldSelectionManager0 = this.a;
                            textFieldSelectionManager0.S(Offset.d(Offset.v(textFieldSelectionManager0.l, textFieldSelectionManager0.n)));
                            Offset offset0 = textFieldSelectionManager0.w();
                            L.m(offset0);
                            int v2 = textFieldSelectionManager0.E().a(textLayoutResult0.x(offset0.A()));
                            long v3 = TextRangeKt.b(v2, v2);
                            if(TextRange.g(v3, textFieldSelectionManager0.K().h())) {
                                return;
                            }
                            HapticFeedback hapticFeedback0 = textFieldSelectionManager0.C();
                            if(hapticFeedback0 != null) {
                                hapticFeedback0.a(9);
                            }
                            textFieldSelectionManager0.F().invoke(textFieldSelectionManager0.n(textFieldSelectionManager0.K().f(), v3));
                        }
                    }
                }
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void c(long v) {
                long v1 = SelectionHandlesKt.a(this.a.B(true));
                this.a.l = v1;
                Offset offset0 = Offset.d(this.a.l);
                this.a.S(offset0);
                this.a.n = 0L;
                this.a.T(Handle.a);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void d() {
                this.a.T(null);
                this.a.S(null);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.a.T(null);
                this.a.S(null);
            }
        };
    }

    public final void p() {
        if(TextRange.h(this.K().h())) {
            return;
        }
        ClipboardManager clipboardManager0 = this.g;
        if(clipboardManager0 != null) {
            clipboardManager0.c(TextFieldValueKt.a(this.K()));
        }
        AnnotatedString annotatedString0 = TextFieldValueKt.c(this.K(), this.K().i().length()).n(TextFieldValueKt.b(this.K(), this.K().i().length()));
        int v = TextRange.l(this.K().h());
        TextFieldValue textFieldValue0 = this.n(annotatedString0, TextRangeKt.b(v, v));
        this.c.invoke(textFieldValue0);
        this.W(HandleState.a);
        UndoManager undoManager0 = this.a;
        if(undoManager0 != null) {
            undoManager0.a();
        }
    }

    public final void q(@m Offset offset0) {
        if(!TextRange.h(this.K().h())) {
            TextLayoutResultProxy textLayoutResultProxy0 = this.d == null ? null : this.d.g();
            int v = offset0 == null || textLayoutResultProxy0 == null ? TextRange.k(this.K().h()) : this.b.a(TextLayoutResultProxy.h(textLayoutResultProxy0, offset0.A(), false, 2, null));
            TextFieldValue textFieldValue0 = TextFieldValue.d(this.K(), null, TextRangeKt.a(v), null, 5, null);
            this.c.invoke(textFieldValue0);
        }
        this.W((offset0 == null || this.K().i().length() <= 0 ? HandleState.a : HandleState.c));
        this.N();
    }

    public static void r(TextFieldSelectionManager textFieldSelectionManager0, Offset offset0, int v, Object object0) {
        if((v & 1) != 0) {
            offset0 = null;
        }
        textFieldSelectionManager0.q(offset0);
    }

    public final void s() {
        if(this.d != null && !this.d.d()) {
            FocusRequester focusRequester0 = this.j;
            if(focusRequester0 != null) {
                focusRequester0.h();
            }
        }
        this.q = this.K();
        TextFieldState textFieldState0 = this.d;
        if(textFieldState0 != null) {
            textFieldState0.B(true);
        }
        this.W(HandleState.b);
    }

    public final void t() {
        TextFieldState textFieldState0 = this.d;
        if(textFieldState0 != null) {
            textFieldState0.B(false);
        }
        this.W(HandleState.a);
    }

    @m
    public final ClipboardManager u() {
        return this.g;
    }

    private final Rect v() {
        float f3;
        float f2;
        float f1;
        long v3;
        long v2;
        TextFieldState textFieldState0 = this.d;
        if(textFieldState0 != null) {
            if(textFieldState0.t()) {
                textFieldState0 = null;
            }
            if(textFieldState0 != null) {
                int v = this.b.b(TextRange.n(this.K().h()));
                int v1 = this.b.b(TextRange.i(this.K().h()));
                TextFieldState textFieldState1 = this.d;
                if(textFieldState1 == null) {
                    v2 = 0L;
                }
                else {
                    LayoutCoordinates layoutCoordinates0 = textFieldState1.f();
                    v2 = layoutCoordinates0 == null ? 0L : layoutCoordinates0.L(this.B(true));
                }
                TextFieldState textFieldState2 = this.d;
                if(textFieldState2 == null) {
                    v3 = 0L;
                }
                else {
                    LayoutCoordinates layoutCoordinates1 = textFieldState2.f();
                    v3 = layoutCoordinates1 == null ? 0L : layoutCoordinates1.L(this.B(false));
                }
                TextFieldState textFieldState3 = this.d;
                float f = 0.0f;
                if(textFieldState3 == null) {
                    f2 = 0.0f;
                }
                else {
                    LayoutCoordinates layoutCoordinates2 = textFieldState3.f();
                    if(layoutCoordinates2 == null) {
                        f2 = 0.0f;
                    }
                    else {
                        TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
                        if(textLayoutResultProxy0 == null) {
                            f1 = 0.0f;
                        }
                        else {
                            TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.i();
                            if(textLayoutResult0 == null) {
                                f1 = 0.0f;
                            }
                            else {
                                Rect rect0 = textLayoutResult0.e(v);
                                f1 = rect0 == null ? 0.0f : rect0.B();
                            }
                        }
                        f2 = Offset.r(layoutCoordinates2.L(OffsetKt.a(0.0f, f1)));
                    }
                }
                TextFieldState textFieldState4 = this.d;
                if(textFieldState4 != null) {
                    LayoutCoordinates layoutCoordinates3 = textFieldState4.f();
                    if(layoutCoordinates3 != null) {
                        TextLayoutResultProxy textLayoutResultProxy1 = textFieldState0.g();
                        if(textLayoutResultProxy1 == null) {
                            f3 = 0.0f;
                        }
                        else {
                            TextLayoutResult textLayoutResult1 = textLayoutResultProxy1.i();
                            if(textLayoutResult1 == null) {
                                f3 = 0.0f;
                            }
                            else {
                                Rect rect1 = textLayoutResult1.e(v1);
                                f3 = rect1 == null ? 0.0f : rect1.B();
                            }
                        }
                        f = Offset.r(layoutCoordinates3.L(OffsetKt.a(0.0f, f3)));
                    }
                }
                return new Rect(Math.min(Offset.p(v2), Offset.p(v3)), Math.min(f2, f), Math.max(Offset.p(v2), Offset.p(v3)), Math.max(Offset.r(v2), Offset.r(v3)) + 25.0f * textFieldState0.r().a().getDensity());
            }
        }
        return Rect.e.a();
    }

    @m
    public final Offset w() {
        return (Offset)this.p.getValue();
    }

    public final long x(@l Density density0) {
        L.p(density0, "density");
        int v = this.b.b(TextRange.n(this.K().h()));
        TextLayoutResultProxy textLayoutResultProxy0 = this.d == null ? null : this.d.g();
        L.m(textLayoutResultProxy0);
        TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.i();
        Rect rect0 = textLayoutResult0.e(s.I(v, 0, textLayoutResult0.l().n().length()));
        return OffsetKt.a(rect0.t() + density0.y1(2.0f) / 2.0f, rect0.j());
    }

    @m
    public final Handle y() {
        return (Handle)this.o.getValue();
    }

    public final boolean z() {
        return ((Boolean)this.k.getValue()).booleanValue();
    }
}

