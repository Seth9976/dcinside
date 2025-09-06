package androidx.compose.foundation.text;

import A3.a;
import A3.o;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import kotlin.r0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n1#2:703\n*E\n"})
public final class TextController implements RememberObserver {
    @l
    private final TextState a;
    @m
    private SelectionRegistrar b;
    public TextDragObserver c;
    @l
    private final MeasurePolicy d;
    @l
    private final Modifier e;
    @l
    private Modifier f;
    @l
    private Modifier g;

    public TextController(@l TextState textState0) {
        L.p(textState0, "state");
        super();
        this.a = textState0;
        this.d = new MeasurePolicy() {
            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @l
            public MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                L.p(measureScope0, "$this$measure");
                L.p(list0, "measurables");
                this.a.l().c();
                TextLayoutResult textLayoutResult0 = this.a.l().d();
                LayoutDirection layoutDirection0 = measureScope0.getLayoutDirection();
                TextLayoutResult textLayoutResult1 = this.a.l().j().o(v, layoutDirection0, textLayoutResult0);
                if(!L.g(textLayoutResult0, textLayoutResult1)) {
                    this.a.l().e().invoke(textLayoutResult1);
                    if(textLayoutResult0 != null) {
                        TextController textController0 = this.a;
                        if(!L.g(textLayoutResult0.l().n(), textLayoutResult1.l().n())) {
                            SelectionRegistrar selectionRegistrar0 = textController0.b;
                            if(selectionRegistrar0 != null) {
                                selectionRegistrar0.h(textController0.l().h());
                            }
                        }
                    }
                }
                this.a.l().n(textLayoutResult1);
                if(list0.size() < textLayoutResult1.A().size()) {
                    throw new IllegalStateException("Check failed.");
                }
                List list1 = textLayoutResult1.A();
                ArrayList arrayList0 = new ArrayList(list1.size());
                int v1 = list1.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    Rect rect0 = (Rect)list1.get(v2);
                    V v3 = rect0 == null ? null : new V(((Measurable)list0.get(v2)).r1(ConstraintsKt.b(0, ((int)(((float)Math.floor(rect0.G())))), 0, ((int)(((float)Math.floor(rect0.r())))), 5, null)), IntOffset.b(IntOffsetKt.a(b.L0(rect0.t()), b.L0(rect0.B()))));
                    if(v3 != null) {
                        arrayList0.add(v3);
                    }
                }
                return measureScope0.o1(((int)(textLayoutResult1.B() >> 0x20)), ((int)(textLayoutResult1.B() & 0xFFFFFFFFL)), Y.W(new V[]{r0.a(AlignmentLineKt.a(), b.L0(textLayoutResult1.h())), r0.a(AlignmentLineKt.b(), b.L0(textLayoutResult1.k()))}), new Function1() {
                    final List e;

                    {
                        this.e = list0;
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                        List list0 = this.e;
                        int v = list0.size();
                        for(int v1 = 0; v1 < v; ++v1) {
                            V v2 = (V)list0.get(v1);
                            PlacementScope.r(placeable$PlacementScope0, ((Placeable)v2.a()), ((IntOffset)v2.b()).w(), 0.0f, 2, null);
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                });
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int b(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                long v1 = ConstraintsKt.a(0, v, 0, 0x7FFFFFFF);
                LayoutDirection layoutDirection0 = intrinsicMeasureScope0.getLayoutDirection();
                return IntSize.j(TextDelegate.p(this.a.l().j(), v1, layoutDirection0, null, 4, null).B());
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int c(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                LayoutDirection layoutDirection0 = intrinsicMeasureScope0.getLayoutDirection();
                this.a.l().j().q(layoutDirection0);
                return this.a.l().j().f();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int d(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                long v1 = ConstraintsKt.a(0, v, 0, 0x7FFFFFFF);
                LayoutDirection layoutDirection0 = intrinsicMeasureScope0.getLayoutDirection();
                return IntSize.j(TextDelegate.p(this.a.l().j(), v1, layoutDirection0, null, 4, null).B());
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int e(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                LayoutDirection layoutDirection0 = intrinsicMeasureScope0.getLayoutDirection();
                this.a.l().j().q(layoutDirection0);
                return this.a.l().j().d();
            }
        };
        this.e = OnGloballyPositionedModifierKt.a(this.g(Modifier.m0), new Function1() {
            final TextController e;

            {
                this.e = textController0;
                super(1);
            }

            public final void a(@l LayoutCoordinates layoutCoordinates0) {
                L.p(layoutCoordinates0, "it");
                this.e.l().l(layoutCoordinates0);
                if(SelectionRegistrarKt.b(this.e.b, this.e.l().h())) {
                    long v = LayoutCoordinatesKt.g(layoutCoordinates0);
                    if(!Offset.l(v, this.e.l().f())) {
                        SelectionRegistrar selectionRegistrar0 = this.e.b;
                        if(selectionRegistrar0 != null) {
                            selectionRegistrar0.b(this.e.l().h());
                        }
                    }
                    this.e.l().p(v);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LayoutCoordinates)object0));
                return S0.a;
            }
        });
        this.f = this.f(textState0.j().n());
        this.g = Modifier.m0;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void a() {
        SelectionRegistrar selectionRegistrar0 = this.b;
        if(selectionRegistrar0 != null) {
            androidx.compose.foundation.text.TextController.onRemembered.1.1 textController$onRemembered$1$10 = new a() {
                final TextController e;

                {
                    this.e = textController0;
                    super(0);
                }

                @m
                public final LayoutCoordinates b() {
                    return this.e.l().b();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
            androidx.compose.foundation.text.TextController.onRemembered.1.2 textController$onRemembered$1$20 = new a() {
                final TextController e;

                {
                    this.e = textController0;
                    super(0);
                }

                @m
                public final TextLayoutResult b() {
                    return this.e.l().d();
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
            Selectable selectable0 = selectionRegistrar0.j(new MultiWidgetSelectionDelegate(this.a.h(), textController$onRemembered$1$10, textController$onRemembered$1$20));
            this.a.q(selectable0);
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void c() {
        Selectable selectable0 = this.a.g();
        if(selectable0 != null) {
            SelectionRegistrar selectionRegistrar0 = this.b;
            if(selectionRegistrar0 != null) {
                selectionRegistrar0.c(selectable0);
            }
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void d() {
        Selectable selectable0 = this.a.g();
        if(selectable0 != null) {
            SelectionRegistrar selectionRegistrar0 = this.b;
            if(selectionRegistrar0 != null) {
                selectionRegistrar0.c(selectable0);
            }
        }
    }

    private final Modifier f(AnnotatedString annotatedString0) {
        androidx.compose.foundation.text.TextController.createSemanticsModifierFor.1 textController$createSemanticsModifierFor$10 = new Function1(this) {
            final AnnotatedString e;
            final TextController f;

            {
                this.e = annotatedString0;
                this.f = textController0;
                super(1);
            }

            public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                L.p(semanticsPropertyReceiver0, "$this$semantics");
                SemanticsPropertiesKt.X0(semanticsPropertyReceiver0, this.e);
                SemanticsPropertiesKt.U(semanticsPropertyReceiver0, null, new Function1() {
                    final TextController e;

                    {
                        this.e = textController0;
                        super(1);
                    }

                    @l
                    public final Boolean a(@l List list0) {
                        L.p(list0, "it");
                        if(this.e.l().d() != null) {
                            TextLayoutResult textLayoutResult0 = this.e.l().d();
                            L.m(textLayoutResult0);
                            list0.add(textLayoutResult0);
                            return true;
                        }
                        return false;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((List)object0));
                    }
                }, 1, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((SemanticsPropertyReceiver)object0));
                return S0.a;
            }
        };
        return SemanticsModifierKt.c(Modifier.m0, false, textController$createSemanticsModifierFor$10, 1, null);
    }

    @Stable
    private final Modifier g(Modifier modifier0) {
        return DrawModifierKt.a(GraphicsLayerModifierKt.e(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFFF, null), new Function1() {
            final TextController e;

            {
                this.e = textController0;
                super(1);
            }

            public final void a(@l DrawScope drawScope0) {
                Selection selection0;
                L.p(drawScope0, "$this$drawBehind");
                TextLayoutResult textLayoutResult0 = this.e.l().d();
                if(textLayoutResult0 != null) {
                    TextController textController0 = this.e;
                    textController0.l().a();
                    SelectionRegistrar selectionRegistrar0 = textController0.b;
                    if(selectionRegistrar0 == null) {
                        selection0 = null;
                    }
                    else {
                        Map map0 = selectionRegistrar0.f();
                        selection0 = map0 == null ? null : ((Selection)map0.get(textController0.l().h()));
                    }
                    Selectable selectable0 = textController0.l().g();
                    int v = selectable0 == null ? 0 : selectable0.g();
                    if(selection0 != null) {
                        int v1 = s.I((selection0.g() ? selection0.f().g() : selection0.h().g()), 0, v);
                        int v2 = s.I((selection0.g() ? selection0.h().g() : selection0.f().g()), 0, v);
                        if(v1 != v2) {
                            Path path0 = textLayoutResult0.w().C(v1, v2);
                            if(TextOverflow.g(textLayoutResult0.l().h(), 3)) {
                                androidx.compose.ui.graphics.drawscope.b.G(drawScope0, path0, textController0.l().i(), 0.0f, null, null, 0, 60, null);
                            }
                            else {
                                float f = Size.t(drawScope0.b());
                                float f1 = Size.m(drawScope0.b());
                                DrawContext drawContext0 = drawScope0.J0();
                                long v3 = drawContext0.b();
                                drawContext0.a().f();
                                drawContext0.d().a(0.0f, 0.0f, f, f1, 1);
                                androidx.compose.ui.graphics.drawscope.b.G(drawScope0, path0, textController0.l().i(), 0.0f, null, null, 0, 60, null);
                                drawContext0.a().v();
                                drawContext0.c(v3);
                            }
                        }
                    }
                    Canvas canvas0 = drawScope0.J0().a();
                    TextDelegate.l.a(canvas0, textLayoutResult0);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((DrawScope)object0));
                return S0.a;
            }
        });
    }

    @l
    public final TextDragObserver h() {
        TextDragObserver textDragObserver0 = this.c;
        if(textDragObserver0 != null) {
            return textDragObserver0;
        }
        L.S("longPressDragObserver");
        return null;
    }

    @l
    public final MeasurePolicy i() {
        return this.d;
    }

    @l
    public final Modifier j() {
        return HeightInLinesModifierKt.b(this.e, this.a.j().m(), this.a.j().g(), 0, 4, null).r0(this.f).r0(this.g);
    }

    @l
    public final Modifier k() {
        return this.f;
    }

    @l
    public final TextState l() {
        return this.a;
    }

    private final boolean m(long v, long v1) {
        TextLayoutResult textLayoutResult0 = this.a.d();
        if(textLayoutResult0 != null) {
            int v2 = textLayoutResult0.l().n().j().length();
            int v3 = textLayoutResult0.x(v);
            int v4 = textLayoutResult0.x(v1);
            return v3 >= v2 - 1 && v4 >= v2 - 1 || v3 < 0 && v4 < 0;
        }
        return false;
    }

    public final void n(@l TextDragObserver textDragObserver0) {
        L.p(textDragObserver0, "<set-?>");
        this.c = textDragObserver0;
    }

    public final void o(@l TextDelegate textDelegate0) {
        L.p(textDelegate0, "textDelegate");
        if(this.a.j() == textDelegate0) {
            return;
        }
        this.a.s(textDelegate0);
        this.f = this.f(this.a.j().n());
    }

    public final void p(@m SelectionRegistrar selectionRegistrar0) {
        Modifier modifier0;
        this.b = selectionRegistrar0;
        if(selectionRegistrar0 == null) {
            modifier0 = Modifier.m0;
        }
        else {
            this.n(new TextDragObserver() {
                private long a;
                private long b;

                {
                    TextController textController0 = selectionRegistrar0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.a = 0L;
                    this.b = 0L;
                }

                @Override  // androidx.compose.foundation.text.TextDragObserver
                public void a(long v) {
                }

                @Override  // androidx.compose.foundation.text.TextDragObserver
                public void b(long v) {
                    LayoutCoordinates layoutCoordinates0 = selectionRegistrar0.l().b();
                    if(layoutCoordinates0 != null) {
                        SelectionRegistrar selectionRegistrar0 = this.d;
                        TextController textController0 = selectionRegistrar0;
                        if(!layoutCoordinates0.o()) {
                            return;
                        }
                        if(!SelectionRegistrarKt.b(selectionRegistrar0, textController0.l().h())) {
                            return;
                        }
                        long v1 = Offset.v(this.b, v);
                        this.b = v1;
                        long v2 = Offset.v(this.a, v1);
                        if(!textController0.m(this.a, v2) && selectionRegistrar0.g(layoutCoordinates0, v2, this.a, false, SelectionAdjustment.a.d())) {
                            this.a = v2;
                            this.b = 0L;
                        }
                    }
                }

                @Override  // androidx.compose.foundation.text.TextDragObserver
                public void c(long v) {
                    LayoutCoordinates layoutCoordinates0 = selectionRegistrar0.l().b();
                    if(layoutCoordinates0 != null) {
                        TextController textController0 = selectionRegistrar0;
                        SelectionRegistrar selectionRegistrar0 = this.d;
                        if(!layoutCoordinates0.o()) {
                            return;
                        }
                        if(textController0.m(v, v)) {
                            selectionRegistrar0.i(textController0.l().h());
                        }
                        else {
                            selectionRegistrar0.a(layoutCoordinates0, v, SelectionAdjustment.a.g());
                        }
                        this.a = v;
                    }
                    if(!SelectionRegistrarKt.b(this.d, selectionRegistrar0.l().h())) {
                        return;
                    }
                    this.b = 0L;
                }

                @Override  // androidx.compose.foundation.text.TextDragObserver
                public void d() {
                }

                public final long e() {
                    return this.b;
                }

                public final long f() {
                    return this.a;
                }

                public final void g(long v) {
                    this.b = v;
                }

                public final void h(long v) {
                    this.a = v;
                }

                @Override  // androidx.compose.foundation.text.TextDragObserver
                public void onCancel() {
                    if(SelectionRegistrarKt.b(this.d, selectionRegistrar0.l().h())) {
                        this.d.d();
                    }
                }

                @Override  // androidx.compose.foundation.text.TextDragObserver
                public void onStop() {
                    if(SelectionRegistrarKt.b(this.d, selectionRegistrar0.l().h())) {
                        this.d.d();
                    }
                }
            });
            TextDragObserver textDragObserver0 = this.h();
            androidx.compose.foundation.text.TextController.update.2 textController$update$20 = new o(null) {
                int k;
                private Object l;
                final TextController m;

                {
                    this.m = textController0;
                    super(2, d0);
                }

                @m
                public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                    return ((androidx.compose.foundation.text.TextController.update.2)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    d d1 = new androidx.compose.foundation.text.TextController.update.2(this.m, d0);
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
                    Object object1 = kotlin.coroutines.intrinsics.b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            PointerInputScope pointerInputScope0 = (PointerInputScope)this.l;
                            TextDragObserver textDragObserver0 = this.m.h();
                            this.k = 1;
                            return LongPressTextDragObserverKt.d(pointerInputScope0, textDragObserver0, this) == object1 ? object1 : S0.a;
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
            modifier0 = SuspendingPointerInputFilterKt.c(Modifier.m0, textDragObserver0, textController$update$20);
        }
        this.g = modifier0;

        @f(c = "androidx.compose.foundation.text.TextController$update$3", f = "CoreText.kt", i = {}, l = {283}, m = "invokeSuspend", n = {}, s = {})
        final class androidx.compose.foundation.text.TextController.update.3 extends kotlin.coroutines.jvm.internal.o implements o {
            int k;
            private Object l;
            final androidx.compose.foundation.text.TextController.update.mouseSelectionObserver.1 m;

            androidx.compose.foundation.text.TextController.update.3(androidx.compose.foundation.text.TextController.update.mouseSelectionObserver.1 textController$update$mouseSelectionObserver$10, d d0) {
                this.m = textController$update$mouseSelectionObserver$10;
                super(2, d0);
            }

            @m
            public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                return ((androidx.compose.foundation.text.TextController.update.3)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.text.TextController.update.3(this.m, d0);
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
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return TextSelectionMouseDetectorKt.c(((PointerInputScope)this.l), this.m, this) == object1 ? object1 : S0.a;
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
        }


        public final class androidx.compose.foundation.text.TextController.update.mouseSelectionObserver.1 implements MouseSelectionObserver {
            private long a;

            androidx.compose.foundation.text.TextController.update.mouseSelectionObserver.1(TextController textController0, SelectionRegistrar selectionRegistrar0) {
                this.a = 0L;
            }

            @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean a(long v, @l SelectionAdjustment selectionAdjustment0) {
                L.p(selectionAdjustment0, "adjustment");
                LayoutCoordinates layoutCoordinates0 = this.b.l().b();
                if(layoutCoordinates0 != null) {
                    SelectionRegistrar selectionRegistrar0 = this.c;
                    TextController textController0 = this.b;
                    if(!layoutCoordinates0.o()) {
                        return false;
                    }
                    if(!SelectionRegistrarKt.b(selectionRegistrar0, textController0.l().h())) {
                        return false;
                    }
                    if(selectionRegistrar0.g(layoutCoordinates0, v, this.a, false, selectionAdjustment0)) {
                        this.a = v;
                    }
                }
                return true;
            }

            @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean b(long v) {
                LayoutCoordinates layoutCoordinates0 = this.b.l().b();
                if(layoutCoordinates0 != null) {
                    SelectionRegistrar selectionRegistrar0 = this.c;
                    TextController textController0 = this.b;
                    if(!layoutCoordinates0.o()) {
                        return false;
                    }
                    if(!SelectionRegistrarKt.b(selectionRegistrar0, textController0.l().h())) {
                        return false;
                    }
                    if(selectionRegistrar0.g(layoutCoordinates0, v, this.a, false, SelectionAdjustment.a.e())) {
                        this.a = v;
                    }
                }
                return true;
            }

            @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean c(long v, @l SelectionAdjustment selectionAdjustment0) {
                L.p(selectionAdjustment0, "adjustment");
                LayoutCoordinates layoutCoordinates0 = this.b.l().b();
                if(layoutCoordinates0 != null) {
                    SelectionRegistrar selectionRegistrar0 = this.c;
                    TextController textController0 = this.b;
                    if(!layoutCoordinates0.o()) {
                        return false;
                    }
                    selectionRegistrar0.a(layoutCoordinates0, v, selectionAdjustment0);
                    this.a = v;
                    return SelectionRegistrarKt.b(selectionRegistrar0, textController0.l().h());
                }
                return false;
            }

            @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean d(long v) {
                LayoutCoordinates layoutCoordinates0 = this.b.l().b();
                if(layoutCoordinates0 != null) {
                    SelectionRegistrar selectionRegistrar0 = this.c;
                    TextController textController0 = this.b;
                    if(!layoutCoordinates0.o()) {
                        return false;
                    }
                    if(selectionRegistrar0.g(layoutCoordinates0, v, this.a, false, SelectionAdjustment.a.e())) {
                        this.a = v;
                    }
                    return SelectionRegistrarKt.b(selectionRegistrar0, textController0.l().h());
                }
                return false;
            }

            public final long e() {
                return this.a;
            }

            public final void f(long v) {
                this.a = v;
            }
        }

    }
}

