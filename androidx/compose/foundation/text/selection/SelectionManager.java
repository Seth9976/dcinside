package androidx.compose.foundation.text.selection;

import A3.a;
import A3.o;
import A3.p;
import A3.r;
import android.view.KeyEvent;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.E0;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,914:1\n76#2:915\n102#2,2:916\n76#2:918\n102#2,2:919\n76#2:921\n102#2,2:922\n76#2:924\n102#2,2:925\n76#2:927\n102#2,2:928\n76#2:930\n102#2,2:931\n76#2:933\n102#2,2:934\n1#3:936\n59#4,3:937\n62#4,2:944\n64#4:947\n59#4,3:948\n62#4,2:955\n64#4:958\n33#5,4:940\n38#5:946\n33#5,4:951\n38#5:957\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n112#1:915\n112#1:916,2\n161#1:918\n161#1:919,2\n168#1:921\n168#1:922,2\n177#1:924\n177#1:925,2\n186#1:927\n186#1:928,2\n193#1:930\n193#1:931,2\n200#1:933\n200#1:934,2\n368#1:937,3\n368#1:944,2\n368#1:947\n752#1:948,3\n752#1:955,2\n752#1:958\n368#1:940,4\n368#1:946\n752#1:951,4\n752#1:957\n*E\n"})
public final class SelectionManager {
    @l
    private final SelectionRegistrarImpl a;
    @l
    private final MutableState b;
    private boolean c;
    @l
    private Function1 d;
    @m
    private HapticFeedback e;
    @m
    private ClipboardManager f;
    @m
    private TextToolbar g;
    @l
    private FocusRequester h;
    @l
    private final MutableState i;
    @m
    private Offset j;
    @m
    private LayoutCoordinates k;
    @l
    private final MutableState l;
    @l
    private final MutableState m;
    @l
    private final MutableState n;
    @l
    private final MutableState o;
    @l
    private final MutableState p;
    @l
    private final MutableState q;

    public SelectionManager(@l SelectionRegistrarImpl selectionRegistrarImpl0) {
        L.p(selectionRegistrarImpl0, "selectionRegistrar");
        super();
        this.a = selectionRegistrarImpl0;
        this.b = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.c = true;
        this.d = androidx.compose.foundation.text.selection.SelectionManager.onSelectionChange.1.e;
        this.h = new FocusRequester();
        this.i = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.l = SnapshotStateKt__SnapshotStateKt.g(Offset.d(0L), null, 2, null);
        this.m = SnapshotStateKt__SnapshotStateKt.g(Offset.d(0L), null, 2, null);
        this.n = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.o = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.p = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.q = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        selectionRegistrarImpl0.w(new Function1() {
            final SelectionManager e;

            {
                this.e = selectionManager0;
                super(1);
            }

            public final void a(long v) {
                Selection selection0 = this.e.F();
                if(selection0 != null) {
                    AnchorInfo selection$AnchorInfo0 = selection0.h();
                    if(selection$AnchorInfo0 != null && v == selection$AnchorInfo0.h()) {
                        this.e.h0();
                        this.e.k0();
                        return;
                    }
                }
                Selection selection1 = this.e.F();
                if(selection1 != null) {
                    AnchorInfo selection$AnchorInfo1 = selection1.f();
                    if(selection$AnchorInfo1 != null && v == selection$AnchorInfo1.h()) {
                        this.e.h0();
                        this.e.k0();
                    }
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).longValue());
                return S0.a;
            }
        });
        selectionRegistrarImpl0.B(new p() {
            final SelectionManager e;

            {
                this.e = selectionManager0;
                super(3);
            }

            public final void a(@l LayoutCoordinates layoutCoordinates0, long v, @l SelectionAdjustment selectionAdjustment0) {
                L.p(layoutCoordinates0, "layoutCoordinates");
                L.p(selectionAdjustment0, "selectionMode");
                Offset offset0 = this.e.n(layoutCoordinates0, v);
                if(offset0 != null) {
                    this.e.g0(offset0.A(), false, selectionAdjustment0);
                    this.e.z().h();
                    this.e.L();
                }
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((LayoutCoordinates)object0), ((Offset)object1).A(), ((SelectionAdjustment)object2));
                return S0.a;
            }
        });
        selectionRegistrarImpl0.A(new Function1() {
            final SelectionManager e;

            {
                this.e = selectionManager0;
                super(1);
            }

            public final void a(long v) {
                Selection selection0 = this.e.F();
                V v1 = this.e.P(v, selection0);
                Selection selection1 = (Selection)v1.a();
                Map map0 = (Map)v1.b();
                if(!L.g(selection1, this.e.F())) {
                    this.e.a.D(map0);
                    this.e.D().invoke(selection1);
                }
                this.e.z().h();
                this.e.L();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).longValue());
                return S0.a;
            }
        });
        selectionRegistrarImpl0.y(new r() {
            final SelectionManager e;

            {
                this.e = selectionManager0;
                super(5);
            }

            @Override  // A3.r
            public Object K0(Object object0, Object object1, Object object2, Object object3, Object object4) {
                return this.a(((LayoutCoordinates)object0), ((Offset)object1).A(), ((Offset)object2).A(), ((Boolean)object3).booleanValue(), ((SelectionAdjustment)object4));
            }

            @l
            public final Boolean a(@l LayoutCoordinates layoutCoordinates0, long v, long v1, boolean z, @l SelectionAdjustment selectionAdjustment0) {
                L.p(layoutCoordinates0, "layoutCoordinates");
                L.p(selectionAdjustment0, "selectionMode");
                Offset offset0 = this.e.n(layoutCoordinates0, v);
                Offset offset1 = this.e.n(layoutCoordinates0, v1);
                return Boolean.valueOf(this.e.j0(offset0, offset1, z, selectionAdjustment0));
            }
        });
        selectionRegistrarImpl0.z(new a() {
            final SelectionManager e;

            {
                this.e = selectionManager0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.f0();
                this.e.V(null);
                this.e.S(null);
            }
        });
        selectionRegistrarImpl0.x(new Function1() {
            final SelectionManager e;

            {
                this.e = selectionManager0;
                super(1);
            }

            public final void a(long v) {
                if(this.e.a.f().containsKey(v)) {
                    this.e.N();
                    this.e.b0(null);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).longValue());
                return S0.a;
            }
        });
        selectionRegistrarImpl0.v(new Function1() {
            final SelectionManager e;

            {
                this.e = selectionManager0;
                super(1);
            }

            public final void a(long v) {
                Selection selection0 = this.e.F();
                if(selection0 != null) {
                    AnchorInfo selection$AnchorInfo0 = selection0.h();
                    if(selection$AnchorInfo0 != null && v == selection$AnchorInfo0.h()) {
                        this.e.c0(null);
                        this.e.W(null);
                        return;
                    }
                }
                Selection selection1 = this.e.F();
                if(selection1 != null) {
                    AnchorInfo selection$AnchorInfo1 = selection1.f();
                    if(selection$AnchorInfo1 != null && v == selection$AnchorInfo1.h()) {
                        this.e.c0(null);
                        this.e.W(null);
                    }
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).longValue());
                return S0.a;
            }
        });

        final class androidx.compose.foundation.text.selection.SelectionManager.onSelectionChange.1 extends N implements Function1 {
            public static final androidx.compose.foundation.text.selection.SelectionManager.onSelectionChange.1 e;

            static {
                androidx.compose.foundation.text.selection.SelectionManager.onSelectionChange.1.e = new androidx.compose.foundation.text.selection.SelectionManager.onSelectionChange.1();
            }

            androidx.compose.foundation.text.selection.SelectionManager.onSelectionChange.1() {
                super(1);
            }

            public final void a(@m Selection selection0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

    }

    @m
    public final HapticFeedback A() {
        return this.e;
    }

    public final boolean B() {
        return ((Boolean)this.i.getValue()).booleanValue();
    }

    @l
    public final Modifier C() {
        Modifier modifier0 = Modifier.m0;
        Modifier modifier1 = KeyInputModifierKt.a(FocusableKt.c(FocusChangedModifierKt.a(FocusRequesterModifierKt.a(OnGloballyPositionedModifierKt.a(this.M(modifier0, new a() {
            final SelectionManager e;

            {
                this.e = selectionManager0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.N();
            }
        }), new Function1() {
            final SelectionManager e;

            {
                this.e = selectionManager0;
                super(1);
            }

            public final void a(@l LayoutCoordinates layoutCoordinates0) {
                L.p(layoutCoordinates0, "it");
                this.e.R(layoutCoordinates0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LayoutCoordinates)object0));
                return S0.a;
            }
        }), this.h), new Function1() {
            final SelectionManager e;

            {
                this.e = selectionManager0;
                super(1);
            }

            public final void a(@l FocusState focusState0) {
                L.p(focusState0, "focusState");
                if(!focusState0.a() && this.e.B()) {
                    this.e.N();
                }
                boolean z = focusState0.a();
                this.e.Z(z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((FocusState)object0));
                return S0.a;
            }
        }), false, null, 3, null), new Function1() {
            final SelectionManager e;

            {
                this.e = selectionManager0;
                super(1);
            }

            @l
            public final Boolean a(@l KeyEvent keyEvent0) {
                L.p(keyEvent0, "it");
                if(SelectionManager_androidKt.a(keyEvent0)) {
                    this.e.o();
                    return true;
                }
                return false;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((androidx.compose.ui.input.key.KeyEvent)object0).h());
            }
        });
        if(this.G()) {
            modifier0 = SelectionManager_androidKt.b(modifier0, this);
        }
        return modifier1.r0(modifier0);
    }

    @l
    public final Function1 D() {
        return this.d;
    }

    @m
    public final AnnotatedString E() {
        LayoutCoordinates layoutCoordinates0 = this.O();
        List list0 = this.a.E(layoutCoordinates0);
        Selection selection0 = this.F();
        AnnotatedString annotatedString0 = null;
        if(selection0 != null) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Selectable selectable0 = (Selectable)list0.get(v1);
                if(selectable0.h() == selection0.h().h() || selectable0.h() == selection0.f().h() || annotatedString0 != null) {
                    AnnotatedString annotatedString1 = SelectionManagerKt.d(selectable0, selection0);
                    if(annotatedString0 != null) {
                        AnnotatedString annotatedString2 = annotatedString0.n(annotatedString1);
                        if(annotatedString2 != null) {
                            annotatedString1 = annotatedString2;
                        }
                    }
                    if(selectable0.h() == selection0.f().h() && !selection0.g() || selectable0.h() == selection0.h().h() && selection0.g()) {
                        return annotatedString1;
                    }
                    annotatedString0 = annotatedString1;
                }
            }
        }
        return annotatedString0;
    }

    @m
    public final Selection F() {
        return (Selection)this.b.getValue();
    }

    private final boolean G() {
        return this.x() != null;
    }

    @m
    public final Offset H() {
        return (Offset)this.n.getValue();
    }

    @m
    public final TextToolbar I() {
        return this.g;
    }

    public final boolean J() {
        return this.c;
    }

    @l
    public final TextDragObserver K(boolean z) {
        return new TextDragObserver() {
            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void a(long v) {
                Selection selection0 = z.F();
                if(selection0 == null) {
                    return;
                }
                Selectable selectable0 = z.q((this.b ? selection0.h() : selection0.f()));
                if(selectable0 == null) {
                    return;
                }
                LayoutCoordinates layoutCoordinates0 = selectable0.d();
                if(layoutCoordinates0 == null) {
                    return;
                }
                long v1 = SelectionHandlesKt.a(selectable0.f(selection0, this.b));
                Offset offset0 = Offset.d(z.O().P(layoutCoordinates0, v1));
                z.S(offset0);
                z.V((this.b ? Handle.b : Handle.c));
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void b(long v) {
                long v1 = Offset.v(z.w(), v);
                z.U(v1);
                long v2 = Offset.v(z.v(), z.w());
                Offset offset0 = Offset.d(v2);
                Offset offset1 = Offset.d(z.v());
                if(z.j0(offset0, offset1, this.b, SelectionAdjustment.a.d())) {
                    z.T(v2);
                    z.U(0L);
                }
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void c(long v) {
                long v1;
                z.L();
                Selection selection0 = z.F();
                L.m(selection0);
                Selectable selectable0 = (Selectable)z.a.s().get(selection0.h().h());
                Selectable selectable1 = (Selectable)z.a.s().get(selection0.f().h());
                LayoutCoordinates layoutCoordinates0 = null;
                if(this.b) {
                    if(selectable0 != null) {
                        layoutCoordinates0 = selectable0.d();
                    }
                }
                else if(selectable1 != null) {
                    layoutCoordinates0 = selectable1.d();
                }
                L.m(layoutCoordinates0);
                if(this.b) {
                    L.m(selectable0);
                    v1 = selectable0.f(selection0, true);
                }
                else {
                    L.m(selectable1);
                    v1 = selectable1.f(selection0, false);
                }
                long v2 = SelectionHandlesKt.a(v1);
                long v3 = z.O().P(layoutCoordinates0, v2);
                z.T(v3);
                z.U(0L);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void d() {
                z.V(null);
                z.S(null);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                z.f0();
                z.V(null);
                z.S(null);
            }

            @Override  // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                z.f0();
                z.V(null);
                z.S(null);
            }
        };
    }

    public final void L() {
        if(this.B() && (this.g == null ? null : this.g.getStatus()) == TextToolbarStatus.a) {
            TextToolbar textToolbar0 = this.g;
            if(textToolbar0 != null) {
                textToolbar0.a();
            }
        }
    }

    private final Modifier M(Modifier modifier0, a a0) {
        if(this.B()) {
            androidx.compose.foundation.text.selection.SelectionManager.onClearSelectionRequested.1 selectionManager$onClearSelectionRequested$10 = new o(a0, null) {
                int k;
                private Object l;
                final SelectionManager m;
                final a n;

                {
                    this.m = selectionManager0;
                    this.n = a0;
                    super(2, d0);
                }

                @m
                public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                    return ((androidx.compose.foundation.text.selection.SelectionManager.onClearSelectionRequested.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    d d1 = new androidx.compose.foundation.text.selection.SelectionManager.onClearSelectionRequested.1(this.m, this.n, d0);
                    d1.l = object0;
                    return d1;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((PointerInputScope)object0), ((d)object1));
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            PointerInputScope pointerInputScope0 = (PointerInputScope)this.l;
                            androidx.compose.foundation.text.selection.SelectionManager.onClearSelectionRequested.1.1 selectionManager$onClearSelectionRequested$1$10 = new Function1() {
                                final a e;

                                {
                                    this.e = a0;
                                    super(1);
                                }

                                public final void a(long v) {
                                    this.e.invoke();
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((Offset)object0).A());
                                    return S0.a;
                                }
                            };
                            this.k = 1;
                            return this.m.p(pointerInputScope0, selectionManager$onClearSelectionRequested$1$10, this) == object1 ? object1 : S0.a;
                        }
                        case 1: {
                            f0.n(object0);
                            return S0.a;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }
            };
            return SuspendingPointerInputFilterKt.c(modifier0, S0.a, selectionManager$onClearSelectionRequested$10);
        }
        return modifier0;
    }

    public final void N() {
        Map map0 = Y.z();
        this.a.D(map0);
        this.L();
        if(this.F() != null) {
            this.d.invoke(null);
            HapticFeedback hapticFeedback0 = this.e;
            if(hapticFeedback0 != null) {
                hapticFeedback0.a(9);
            }
        }
    }

    @l
    public final LayoutCoordinates O() {
        LayoutCoordinates layoutCoordinates0 = this.k;
        if(layoutCoordinates0 == null || !layoutCoordinates0.o()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return layoutCoordinates0;
    }

    @l
    public final V P(long v, @m Selection selection0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        LayoutCoordinates layoutCoordinates0 = this.O();
        List list0 = this.a.E(layoutCoordinates0);
        int v1 = list0.size();
        Selection selection1 = null;
        for(int v2 = 0; v2 < v1; ++v2) {
            Selectable selectable0 = (Selectable)list0.get(v2);
            Selection selection2 = selectable0.h() == v ? selectable0.i() : null;
            if(selection2 != null) {
                linkedHashMap0.put(selectable0.h(), selection2);
            }
            selection1 = SelectionManagerKt.e(selection1, selection2);
        }
        if(!L.g(selection1, selection0)) {
            HapticFeedback hapticFeedback0 = this.e;
            if(hapticFeedback0 != null) {
                hapticFeedback0.a(9);
            }
        }
        return new V(selection1, linkedHashMap0);
    }

    public final void Q(@m ClipboardManager clipboardManager0) {
        this.f = clipboardManager0;
    }

    public final void R(@m LayoutCoordinates layoutCoordinates0) {
        this.k = layoutCoordinates0;
        if(this.B() && this.F() != null) {
            Offset offset0 = layoutCoordinates0 == null ? null : Offset.d(LayoutCoordinatesKt.g(layoutCoordinates0));
            if(!L.g(this.j, offset0)) {
                this.j = offset0;
                this.h0();
                this.k0();
            }
        }
    }

    private final void S(Offset offset0) {
        this.q.setValue(offset0);
    }

    private final void T(long v) {
        Offset offset0 = Offset.d(v);
        this.l.setValue(offset0);
    }

    private final void U(long v) {
        Offset offset0 = Offset.d(v);
        this.m.setValue(offset0);
    }

    private final void V(Handle handle0) {
        this.p.setValue(handle0);
    }

    private final void W(Offset offset0) {
        this.o.setValue(offset0);
    }

    public final void X(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "<set-?>");
        this.h = focusRequester0;
    }

    public final void Y(@m HapticFeedback hapticFeedback0) {
        this.e = hapticFeedback0;
    }

    public final void Z(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void a0(@l Function1 function10) {
        L.p(function10, "<set-?>");
        this.d = function10;
    }

    public final void b0(@m Selection selection0) {
        this.b.setValue(selection0);
        if(selection0 != null) {
            this.h0();
        }
    }

    private final void c0(Offset offset0) {
        this.n.setValue(offset0);
    }

    public final void d0(@m TextToolbar textToolbar0) {
        this.g = textToolbar0;
    }

    public final void e0(boolean z) {
        this.c = z;
    }

    public final void f0() {
        if(this.B() && this.F() != null) {
            TextToolbar textToolbar0 = this.g;
            if(textToolbar0 != null) {
                E0.a(textToolbar0, this.t(), new a() {
                    final SelectionManager e;

                    {
                        this.e = selectionManager0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.o();
                        this.e.N();
                    }
                }, null, null, null, 28, null);
            }
        }
    }

    private final void g0(long v, boolean z, SelectionAdjustment selectionAdjustment0) {
        this.i0(v, v, null, z, selectionAdjustment0);
    }

    private final void h0() {
        Selectable selectable1;
        Selectable selectable0;
        Selection selection0 = this.F();
        LayoutCoordinates layoutCoordinates0 = this.k;
        Offset offset0 = null;
        if(selection0 == null) {
            selectable0 = null;
        }
        else {
            AnchorInfo selection$AnchorInfo0 = selection0.h();
            selectable0 = selection$AnchorInfo0 == null ? null : this.q(selection$AnchorInfo0);
        }
        if(selection0 == null) {
            selectable1 = null;
        }
        else {
            AnchorInfo selection$AnchorInfo1 = selection0.f();
            selectable1 = selection$AnchorInfo1 == null ? null : this.q(selection$AnchorInfo1);
        }
        LayoutCoordinates layoutCoordinates1 = selectable0 == null ? null : selectable0.d();
        LayoutCoordinates layoutCoordinates2 = selectable1 == null ? null : selectable1.d();
        if(selection0 != null && layoutCoordinates0 != null && layoutCoordinates0.o() && layoutCoordinates1 != null && layoutCoordinates2 != null) {
            long v = layoutCoordinates0.P(layoutCoordinates1, selectable0.f(selection0, true));
            long v1 = layoutCoordinates0.P(layoutCoordinates2, selectable1.f(selection0, false));
            Rect rect0 = SelectionManagerKt.f(layoutCoordinates0);
            Offset offset1 = Offset.d(v);
            if(!SelectionManagerKt.c(rect0, v) && this.x() != Handle.b) {
                offset1 = null;
            }
            this.c0(offset1);
            Offset offset2 = Offset.d(v1);
            if(SelectionManagerKt.c(rect0, v1) || this.x() == Handle.c) {
                offset0 = offset2;
            }
            this.W(offset0);
            return;
        }
        this.c0(null);
        this.W(null);
    }

    public final boolean i0(long v, long v1, @m Offset offset0, boolean z, @l SelectionAdjustment selectionAdjustment0) {
        L.p(selectionAdjustment0, "adjustment");
        this.V((z ? Handle.b : Handle.c));
        this.S((z ? Offset.d(v) : Offset.d(v1)));
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        LayoutCoordinates layoutCoordinates0 = this.O();
        List list0 = this.a.E(layoutCoordinates0);
        int v2 = list0.size();
        Selection selection0 = null;
        boolean z1 = false;
        for(int v3 = 0; v3 < v2; ++v3) {
            Selectable selectable0 = (Selectable)list0.get(v3);
            Object object0 = this.a.f().get(selectable0.h());
            V v4 = selectable0.e(v, v1, offset0, z, this.O(), selectionAdjustment0, ((Selection)object0));
            Selection selection1 = (Selection)v4.a();
            z1 = z1 || ((Boolean)v4.b()).booleanValue();
            if(selection1 != null) {
                linkedHashMap0.put(selectable0.h(), selection1);
            }
            selection0 = SelectionManagerKt.e(selection0, selection1);
        }
        if(!L.g(selection0, this.F())) {
            HapticFeedback hapticFeedback0 = this.e;
            if(hapticFeedback0 != null) {
                hapticFeedback0.a(9);
            }
            this.a.D(linkedHashMap0);
            this.d.invoke(selection0);
        }
        return z1;
    }

    public final boolean j0(@m Offset offset0, @m Offset offset1, boolean z, @l SelectionAdjustment selectionAdjustment0) {
        Offset offset2;
        L.p(selectionAdjustment0, "adjustment");
        if(offset0 == null) {
            return false;
        }
        Selection selection0 = this.F();
        if(selection0 != null) {
            Selectable selectable0 = (Selectable)this.a.s().get(((long)(z ? selection0.f().h() : selection0.h().h())));
            if(selectable0 == null) {
                offset2 = null;
            }
            else {
                LayoutCoordinates layoutCoordinates0 = selectable0.d();
                L.m(layoutCoordinates0);
                offset2 = this.n(layoutCoordinates0, SelectionHandlesKt.a(selectable0.f(selection0, !z)));
            }
            if(offset2 != null) {
                long v = offset2.A();
                long v1 = z ? offset0.A() : v;
                if(!z) {
                    v = offset0.A();
                }
                return this.i0(v1, v, offset1, z, selectionAdjustment0);
            }
        }
        return false;
    }

    private final void k0() {
        if(this.B() && (this.g == null ? null : this.g.getStatus()) == TextToolbarStatus.a) {
            this.f0();
        }
    }

    public final void m(long v) {
        Selection selection0 = this.F();
        if((selection0 == null ? true : TextRange.h(selection0.j()))) {
            this.g0(v, true, SelectionAdjustment.a.g());
        }
    }

    private final Offset n(LayoutCoordinates layoutCoordinates0, long v) {
        return this.k == null || !this.k.o() ? null : Offset.d(this.O().P(layoutCoordinates0, v));
    }

    public final void o() {
        AnnotatedString annotatedString0 = this.E();
        if(annotatedString0 != null) {
            ClipboardManager clipboardManager0 = this.f;
            if(clipboardManager0 != null) {
                clipboardManager0.c(annotatedString0);
            }
        }
    }

    private final Object p(PointerInputScope pointerInputScope0, Function1 function10, d d0) {
        Object object0 = ForEachGestureKt.d(pointerInputScope0, new o(null) {
            int l;
            private Object m;
            final Function1 n;

            {
                this.n = function10;
                super(2, d0);
            }

            @m
            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                return ((androidx.compose.foundation.text.selection.SelectionManager.detectNonConsumingTap.2)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.text.selection.SelectionManager.detectNonConsumingTap.2(this.n, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((AwaitPointerEventScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        this.l = 1;
                        object0 = TapGestureDetectorKt.p(((AwaitPointerEventScope)this.m), null, this, 1, null);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(((PointerInputChange)object0) != null) {
                    Offset offset0 = Offset.d(((PointerInputChange)object0).q());
                    this.n.invoke(offset0);
                }
                return S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @m
    public final Selectable q(@l AnchorInfo selection$AnchorInfo0) {
        L.p(selection$AnchorInfo0, "anchor");
        return (Selectable)this.a.s().get(selection$AnchorInfo0.h());
    }

    @m
    public final ClipboardManager r() {
        return this.f;
    }

    @m
    public final LayoutCoordinates s() {
        return this.k;
    }

    private final Rect t() {
        Selection selection0 = this.F();
        if(selection0 == null) {
            return Rect.e.a();
        }
        Selectable selectable0 = this.q(selection0.h());
        Selectable selectable1 = this.q(selection0.f());
        if(selectable0 != null) {
            LayoutCoordinates layoutCoordinates0 = selectable0.d();
            if(layoutCoordinates0 != null && selectable1 != null) {
                LayoutCoordinates layoutCoordinates1 = selectable1.d();
                if(layoutCoordinates1 != null) {
                    LayoutCoordinates layoutCoordinates2 = this.k;
                    if(layoutCoordinates2 != null && layoutCoordinates2.o()) {
                        long v = layoutCoordinates2.P(layoutCoordinates0, selectable0.f(selection0, true));
                        long v1 = layoutCoordinates2.P(layoutCoordinates1, selectable1.f(selection0, false));
                        long v2 = layoutCoordinates2.L(v);
                        long v3 = layoutCoordinates2.L(v1);
                        float f = Math.min(Offset.p(v2), Offset.p(v3));
                        float f1 = Math.max(Offset.p(v2), Offset.p(v3));
                        long v4 = layoutCoordinates2.P(layoutCoordinates0, OffsetKt.a(0.0f, selectable0.c(selection0.h().g()).B()));
                        long v5 = layoutCoordinates2.P(layoutCoordinates1, OffsetKt.a(0.0f, selectable1.c(selection0.f().g()).B()));
                        long v6 = layoutCoordinates2.L(v4);
                        long v7 = layoutCoordinates2.L(v5);
                        return new Rect(f, Math.min(Offset.r(v6), Offset.r(v7)), f1, Math.max(Offset.r(v2), Offset.r(v3)) + 100.0f);
                    }
                    return Rect.e.a();
                }
            }
            return Rect.e.a();
        }
        return Rect.e.a();
    }

    @m
    public final Offset u() {
        return (Offset)this.q.getValue();
    }

    public final long v() {
        return ((Offset)this.l.getValue()).A();
    }

    public final long w() {
        return ((Offset)this.m.getValue()).A();
    }

    @m
    public final Handle x() {
        return (Handle)this.p.getValue();
    }

    @m
    public final Offset y() {
        return (Offset)this.o.getValue();
    }

    @l
    public final FocusRequester z() {
        return this.h;
    }
}

