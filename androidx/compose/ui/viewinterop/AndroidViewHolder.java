package androidx.compose.ui.viewinterop;

import A3.a;
import A3.o;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Region;
import android.os.Build.VERSION;
import android.os.Looper;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.h;
import kotlin.ranges.s;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public class AndroidViewHolder extends ViewGroup implements ComposeNodeLifecycleCallback, NestedScrollingParent3 {
    @l
    private final NestedScrollDispatcher a;
    @m
    private View b;
    @l
    private a c;
    private boolean d;
    @l
    private a e;
    @l
    private a f;
    @l
    private Modifier g;
    @m
    private Function1 h;
    @l
    private Density i;
    @m
    private Function1 j;
    @m
    private LifecycleOwner k;
    @m
    private SavedStateRegistryOwner l;
    @l
    private final SnapshotStateObserver m;
    @l
    private final Function1 n;
    @l
    private final a o;
    @m
    private Function1 p;
    @l
    private final int[] q;
    private int r;
    private int s;
    @l
    private final NestedScrollingParentHelper t;
    @l
    private final LayoutNode u;

    public AndroidViewHolder(@l Context context0, @m CompositionContext compositionContext0, @l NestedScrollDispatcher nestedScrollDispatcher0) {
        L.p(context0, "context");
        L.p(nestedScrollDispatcher0, "dispatcher");
        super(context0);
        this.a = nestedScrollDispatcher0;
        if(compositionContext0 != null) {
            WindowRecomposer_androidKt.j(this, compositionContext0);
        }
        this.setSaveFromParentEnabled(false);
        this.c = androidx.compose.ui.viewinterop.AndroidViewHolder.update.1.e;
        this.e = androidx.compose.ui.viewinterop.AndroidViewHolder.reset.1.e;
        this.f = androidx.compose.ui.viewinterop.AndroidViewHolder.release.1.e;
        this.g = Modifier.m0;
        this.i = DensityKt.b(1.0f, 0.0f, 2, null);
        this.m = new SnapshotStateObserver(new Function1() {
            final AndroidViewHolder e;

            {
                this.e = androidViewHolder0;
                super(1);
            }

            public final void b(@l a a0) {
                L.p(a0, "command");
                if(this.e.getHandler().getLooper() == Looper.myLooper()) {
                    a0.invoke();
                    return;
                }
                this.e.getHandler().post(() -> {
                    L.p(a0, "$tmp0");
                    a0.invoke();
                });
            }

            // 检测为 Lambda 实现
            private static final void c(a a0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((a)object0));
                return S0.a;
            }
        });
        this.n = new Function1() {
            final AndroidViewHolder e;

            {
                this.e = androidViewHolder0;
                super(1);
            }

            public final void b(@l AndroidViewHolder androidViewHolder0) {
                L.p(androidViewHolder0, "it");
                this.e.getHandler().post(() -> {
                    L.p(this.e.o, "$tmp0");
                    this.e.o.invoke();
                });
            }

            // 检测为 Lambda 实现
            private static final void c(a a0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((AndroidViewHolder)object0));
                return S0.a;
            }
        };
        this.o = new a() {
            final AndroidViewHolder e;

            {
                this.e = androidViewHolder0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                if(this.e.d) {
                    this.e.m.r(this.e, this.e.n, this.e.getUpdate());
                }
            }
        };
        this.q = new int[2];
        this.r = 0x80000000;
        this.s = 0x80000000;
        this.t = new NestedScrollingParentHelper(this);
        LayoutNode layoutNode0 = new LayoutNode(false, 0, 3, null);
        layoutNode0.J1(this);
        Modifier modifier0 = OnGloballyPositionedModifierKt.a(DrawModifierKt.a(PointerInteropFilter_androidKt.c(SemanticsModifierKt.b(Modifier.m0, true, androidx.compose.ui.viewinterop.AndroidViewHolder.layoutNode.1.coreModifier.1.e), this), new Function1(this) {
            final LayoutNode e;
            final AndroidViewHolder f;

            {
                this.e = layoutNode0;
                this.f = androidViewHolder0;
                super(1);
            }

            public final void a(@l DrawScope drawScope0) {
                L.p(drawScope0, "$this$drawBehind");
                AndroidViewHolder androidViewHolder0 = this.f;
                Canvas canvas0 = drawScope0.J0().a();
                Owner owner0 = this.e.B0();
                AndroidComposeView androidComposeView0 = owner0 instanceof AndroidComposeView ? ((AndroidComposeView)owner0) : null;
                if(androidComposeView0 != null) {
                    androidComposeView0.V(androidViewHolder0, AndroidCanvas_androidKt.d(canvas0));
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((DrawScope)object0));
                return S0.a;
            }
        }), new Function1(layoutNode0) {
            final AndroidViewHolder e;
            final LayoutNode f;

            {
                this.e = androidViewHolder0;
                this.f = layoutNode0;
                super(1);
            }

            public final void a(@l LayoutCoordinates layoutCoordinates0) {
                L.p(layoutCoordinates0, "it");
                AndroidViewHolder_androidKt.e(this.e, this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LayoutCoordinates)object0));
                return S0.a;
            }
        });
        layoutNode0.m(this.g.r0(modifier0));
        this.h = new Function1(modifier0) {
            final LayoutNode e;
            final Modifier f;

            {
                this.e = layoutNode0;
                this.f = modifier0;
                super(1);
            }

            public final void a(@l Modifier modifier0) {
                L.p(modifier0, "it");
                Modifier modifier1 = modifier0.r0(this.f);
                this.e.m(modifier1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Modifier)object0));
                return S0.a;
            }
        };
        layoutNode0.n(this.i);
        this.j = new Function1() {
            final LayoutNode e;

            {
                this.e = layoutNode0;
                super(1);
            }

            public final void a(@l Density density0) {
                L.p(density0, "it");
                this.e.n(density0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Density)object0));
                return S0.a;
            }
        };
        h l0$h0 = new h();
        layoutNode0.Q1(new Function1(layoutNode0, l0$h0) {
            final AndroidViewHolder e;
            final LayoutNode f;
            final h g;

            {
                this.e = androidViewHolder0;
                this.f = layoutNode0;
                this.g = l0$h0;
                super(1);
            }

            public final void a(@l Owner owner0) {
                L.p(owner0, "owner");
                AndroidComposeView androidComposeView0 = owner0 instanceof AndroidComposeView ? ((AndroidComposeView)owner0) : null;
                if(androidComposeView0 != null) {
                    androidComposeView0.P(this.e, this.f);
                }
                Object object0 = this.g.a;
                if(object0 != null) {
                    this.e.setView$ui_release(((View)object0));
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Owner)object0));
                return S0.a;
            }
        });
        layoutNode0.R1(new Function1(l0$h0) {
            final AndroidViewHolder e;
            final h f;

            {
                this.e = androidViewHolder0;
                this.f = l0$h0;
                super(1);
            }

            public final void a(@l Owner owner0) {
                L.p(owner0, "owner");
                AndroidComposeView androidComposeView0 = owner0 instanceof AndroidComposeView ? ((AndroidComposeView)owner0) : null;
                if(androidComposeView0 != null) {
                    androidComposeView0.n0(this.e);
                }
                this.f.a = this.e.getView();
                this.e.setView$ui_release(null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Owner)object0));
                return S0.a;
            }
        });
        layoutNode0.l(new MeasurePolicy() {
            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @l
            public MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                L.p(measureScope0, "$this$measure");
                L.p(list0, "measurables");
                if(layoutNode0.getChildCount() == 0) {
                    return MeasureScope.-CC.p(measureScope0, Constraints.r(v), Constraints.q(v), null, androidx.compose.ui.viewinterop.AndroidViewHolder.layoutNode.1.5.measure.1.e, 4, null);
                }
                if(Constraints.r(v) != 0) {
                    layoutNode0.getChildAt(0).setMinimumWidth(Constraints.r(v));
                }
                if(Constraints.q(v) != 0) {
                    layoutNode0.getChildAt(0).setMinimumHeight(Constraints.q(v));
                }
                int v1 = Constraints.r(v);
                int v2 = Constraints.p(v);
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = layoutNode0.getLayoutParams();
                L.m(viewGroup$LayoutParams0);
                int v3 = layoutNode0.h(v1, v2, viewGroup$LayoutParams0.width);
                int v4 = Constraints.q(v);
                int v5 = Constraints.o(v);
                ViewGroup.LayoutParams viewGroup$LayoutParams1 = layoutNode0.getLayoutParams();
                L.m(viewGroup$LayoutParams1);
                int v6 = layoutNode0.h(v4, v5, viewGroup$LayoutParams1.height);
                layoutNode0.measure(v3, v6);
                return MeasureScope.-CC.p(measureScope0, layoutNode0.getMeasuredWidth(), layoutNode0.getMeasuredHeight(), null, new Function1(this.b) {
                    final AndroidViewHolder e;
                    final LayoutNode f;

                    {
                        this.e = androidViewHolder0;
                        this.f = layoutNode0;
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                        AndroidViewHolder_androidKt.e(this.e, this.f);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                }, 4, null);

                final class androidx.compose.ui.viewinterop.AndroidViewHolder.layoutNode.1.5.measure.1 extends N implements Function1 {
                    public static final androidx.compose.ui.viewinterop.AndroidViewHolder.layoutNode.1.5.measure.1 e;

                    static {
                        androidx.compose.ui.viewinterop.AndroidViewHolder.layoutNode.1.5.measure.1.e = new androidx.compose.ui.viewinterop.AndroidViewHolder.layoutNode.1.5.measure.1();
                    }

                    androidx.compose.ui.viewinterop.AndroidViewHolder.layoutNode.1.5.measure.1() {
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                }

            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int b(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                return this.f(v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int c(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                return this.g(v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int d(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                return this.f(v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int e(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                return this.g(v);
            }

            private final int f(int v) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = layoutNode0.getLayoutParams();
                L.m(viewGroup$LayoutParams0);
                int v1 = layoutNode0.h(0, v, viewGroup$LayoutParams0.width);
                layoutNode0.measure(v1, 0);
                return layoutNode0.getMeasuredHeight();
            }

            private final int g(int v) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = layoutNode0.getLayoutParams();
                L.m(viewGroup$LayoutParams0);
                int v1 = layoutNode0.h(0, v, viewGroup$LayoutParams0.height);
                layoutNode0.measure(0, v1);
                return layoutNode0.getMeasuredWidth();
            }
        });
        this.u = layoutNode0;

        final class androidx.compose.ui.viewinterop.AndroidViewHolder.layoutNode.1.coreModifier.1 extends N implements Function1 {
            public static final androidx.compose.ui.viewinterop.AndroidViewHolder.layoutNode.1.coreModifier.1 e;

            static {
                androidx.compose.ui.viewinterop.AndroidViewHolder.layoutNode.1.coreModifier.1.e = new androidx.compose.ui.viewinterop.AndroidViewHolder.layoutNode.1.coreModifier.1();
            }

            androidx.compose.ui.viewinterop.AndroidViewHolder.layoutNode.1.coreModifier.1() {
                super(1);
            }

            public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                L.p(semanticsPropertyReceiver0, "$this$semantics");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((SemanticsPropertyReceiver)object0));
                return S0.a;
            }
        }


        final class androidx.compose.ui.viewinterop.AndroidViewHolder.release.1 extends N implements a {
            public static final androidx.compose.ui.viewinterop.AndroidViewHolder.release.1 e;

            static {
                androidx.compose.ui.viewinterop.AndroidViewHolder.release.1.e = new androidx.compose.ui.viewinterop.AndroidViewHolder.release.1();
            }

            androidx.compose.ui.viewinterop.AndroidViewHolder.release.1() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }

            public final void invoke() {
            }
        }


        final class androidx.compose.ui.viewinterop.AndroidViewHolder.reset.1 extends N implements a {
            public static final androidx.compose.ui.viewinterop.AndroidViewHolder.reset.1 e;

            static {
                androidx.compose.ui.viewinterop.AndroidViewHolder.reset.1.e = new androidx.compose.ui.viewinterop.AndroidViewHolder.reset.1();
            }

            androidx.compose.ui.viewinterop.AndroidViewHolder.reset.1() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }

            public final void invoke() {
            }
        }


        final class androidx.compose.ui.viewinterop.AndroidViewHolder.update.1 extends N implements a {
            public static final androidx.compose.ui.viewinterop.AndroidViewHolder.update.1 e;

            static {
                androidx.compose.ui.viewinterop.AndroidViewHolder.update.1.e = new androidx.compose.ui.viewinterop.AndroidViewHolder.update.1();
            }

            androidx.compose.ui.viewinterop.AndroidViewHolder.update.1() {
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

    @Override  // androidx.core.view.NestedScrollingParent2
    public void a(@l View view0, @l View view1, int v, int v1) {
        L.p(view0, "child");
        L.p(view1, "target");
        this.t.c(view0, view1, v, v1);
    }

    @Override  // android.view.ViewGroup
    public boolean gatherTransparentRegion(@m Region region0) {
        if(region0 == null) {
            return true;
        }
        this.getLocationInWindow(this.q);
        int v = this.q[0];
        region0.op(v, this.q[1], v + this.getWidth(), this.q[1] + this.getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @l
    public final Density getDensity() {
        return this.i;
    }

    @m
    public final View getInteropView() {
        return this.b;
    }

    @l
    public final LayoutNode getLayoutNode() {
        return this.u;
    }

    @Override  // android.view.View
    @m
    public ViewGroup.LayoutParams getLayoutParams() {
        View view0 = this.b;
        if(view0 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            return viewGroup$LayoutParams0 == null ? new ViewGroup.LayoutParams(-1, -1) : viewGroup$LayoutParams0;
        }
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @m
    public final LifecycleOwner getLifecycleOwner() {
        return this.k;
    }

    @l
    public final Modifier getModifier() {
        return this.g;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.t.a();
    }

    @m
    public final Function1 getOnDensityChanged$ui_release() {
        return this.j;
    }

    @m
    public final Function1 getOnModifierChanged$ui_release() {
        return this.h;
    }

    @m
    public final Function1 getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.p;
    }

    @l
    public final a getRelease() {
        return this.f;
    }

    @l
    public final a getReset() {
        return this.e;
    }

    @m
    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.l;
    }

    @l
    public final a getUpdate() {
        return this.c;
    }

    @m
    public final View getView() {
        return this.b;
    }

    private final int h(int v, int v1, int v2) {
        if(v2 < 0 && v != v1) {
            if(v2 == -2 && v1 != 0x7FFFFFFF) {
                return View.MeasureSpec.makeMeasureSpec(v1, 0x80000000);
            }
            return v2 != -1 || v1 == 0x7FFFFFFF ? 0 : View.MeasureSpec.makeMeasureSpec(v1, 0x40000000);
        }
        return View.MeasureSpec.makeMeasureSpec(s.I(v2, v, v1), 0x40000000);
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void i() {
        this.f.invoke();
    }

    @Override  // android.view.ViewGroup
    @m
    public ViewParent invalidateChildInParent(@m int[] arr_v, @m Rect rect0) {
        super.invalidateChildInParent(arr_v, rect0);
        this.u.R0();
        return null;
    }

    @Override  // android.view.View
    public boolean isNestedScrollingEnabled() {
        View view0 = this.b;
        return view0 == null ? super.isNestedScrollingEnabled() : view0.isNestedScrollingEnabled();
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void j() {
        this.e.invoke();
        this.removeAllViewsInLayout();
    }

    public final void k() {
        int v = this.r;
        if(v != 0x80000000) {
            int v1 = this.s;
            if(v1 != 0x80000000) {
                this.measure(v, v1);
            }
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void l(@l View view0, int v) {
        L.p(view0, "target");
        this.t.e(view0, v);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void n(@l View view0, int v, int v1, int v2, int v3, int v4) {
        L.p(view0, "target");
        if(!this.isNestedScrollingEnabled()) {
            return;
        }
        int v5 = AndroidViewHolder_androidKt.h(v4);
        this.a.b(OffsetKt.a(AndroidViewHolder_androidKt.b(v), AndroidViewHolder_androidKt.b(v1)), OffsetKt.a(AndroidViewHolder_androidKt.b(v2), AndroidViewHolder_androidKt.b(v3)), v5);
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m.v();
    }

    @Override  // android.view.ViewGroup
    public void onDescendantInvalidated(@l View view0, @l View view1) {
        L.p(view0, "child");
        L.p(view1, "target");
        super.onDescendantInvalidated(view0, view1);
        this.u.R0();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m.w();
        this.m.k();
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        View view0 = this.b;
        if(view0 != null) {
            view0.layout(0, 0, v2 - v, v3 - v1);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        if((this.b == null ? null : this.b.getParent()) != this) {
            this.setMeasuredDimension(View.MeasureSpec.getSize(v), View.MeasureSpec.getSize(v1));
            return;
        }
        View view0 = this.b;
        if(view0 != null) {
            view0.measure(v, v1);
        }
        int v2 = 0;
        int v3 = this.b == null ? 0 : this.b.getMeasuredWidth();
        View view1 = this.b;
        if(view1 != null) {
            v2 = view1.getMeasuredHeight();
        }
        this.setMeasuredDimension(v3, v2);
        this.r = v;
        this.s = v1;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@l View view0, float f, float f1, boolean z) {
        L.p(view0, "target");
        if(!this.isNestedScrollingEnabled()) {
            return false;
        }
        k.f(this.a.f(), null, null, new o(this, VelocityKt.a(AndroidViewHolder_androidKt.c(f), AndroidViewHolder_androidKt.c(f1)), null) {
            int k;
            final boolean l;
            final AndroidViewHolder m;
            final long n;

            {
                this.l = z;
                this.m = androidViewHolder0;
                this.n = v;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.ui.viewinterop.AndroidViewHolder.onNestedFling.1(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.ui.viewinterop.AndroidViewHolder.onNestedFling.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        if(this.l) {
                            this.k = 2;
                            if(this.m.a.a(this.n, 0L, this) == object1) {
                                return object1;
                            }
                        }
                        else {
                            this.k = 1;
                            if(this.m.a.a(0L, this.n, this) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
                    }
                    case 1: 
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, 3, null);
        return false;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@l View view0, float f, float f1) {
        L.p(view0, "target");
        if(!this.isNestedScrollingEnabled()) {
            return false;
        }
        k.f(this.a.f(), null, null, new o(VelocityKt.a(AndroidViewHolder_androidKt.c(f), AndroidViewHolder_androidKt.c(f1)), null) {
            int k;
            final AndroidViewHolder l;
            final long m;

            {
                this.l = androidViewHolder0;
                this.m = v;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.ui.viewinterop.AndroidViewHolder.onNestedPreFling.1(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.ui.viewinterop.AndroidViewHolder.onNestedPreFling.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.l.a.c(this.m, this) == object1 ? object1 : S0.a;
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
        }, 3, null);
        return false;
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        if(Build.VERSION.SDK_INT < 23 && v == 0) {
            this.u.R0();
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void p(@l View view0, int v, int v1, @l int[] arr_v, int v2) {
        L.p(view0, "target");
        L.p(arr_v, "consumed");
        if(!this.isNestedScrollingEnabled()) {
            return;
        }
        int v3 = AndroidViewHolder_androidKt.h(v2);
        long v4 = this.a.d(OffsetKt.a(AndroidViewHolder_androidKt.b(v), AndroidViewHolder_androidKt.b(v1)), v3);
        arr_v[0] = NestedScrollInteropConnectionKt.f(Offset.p(v4));
        arr_v[1] = NestedScrollInteropConnectionKt.f(Offset.r(v4));
    }

    @Override  // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void r() {
        View view0 = this.b;
        L.m(view0);
        if(view0.getParent() != this) {
            this.addView(this.b);
            return;
        }
        this.e.invoke();
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function10 = this.p;
        if(function10 != null) {
            function10.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override  // androidx.core.view.NestedScrollingParent3
    public void s(@l View view0, int v, int v1, int v2, int v3, int v4, @l int[] arr_v) {
        L.p(view0, "target");
        L.p(arr_v, "consumed");
        if(!this.isNestedScrollingEnabled()) {
            return;
        }
        int v5 = AndroidViewHolder_androidKt.h(v4);
        long v6 = this.a.b(OffsetKt.a(AndroidViewHolder_androidKt.b(v), AndroidViewHolder_androidKt.b(v1)), OffsetKt.a(AndroidViewHolder_androidKt.b(v2), AndroidViewHolder_androidKt.b(v3)), v5);
        arr_v[0] = NestedScrollInteropConnectionKt.f(Offset.p(v6));
        arr_v[1] = NestedScrollInteropConnectionKt.f(Offset.r(v6));
    }

    public final void setDensity(@l Density density0) {
        L.p(density0, "value");
        if(density0 != this.i) {
            this.i = density0;
            Function1 function10 = this.j;
            if(function10 != null) {
                function10.invoke(density0);
            }
        }
    }

    public final void setLifecycleOwner(@m LifecycleOwner lifecycleOwner0) {
        if(lifecycleOwner0 != this.k) {
            this.k = lifecycleOwner0;
            ViewTreeLifecycleOwner.b(this, lifecycleOwner0);
        }
    }

    public final void setModifier(@l Modifier modifier0) {
        L.p(modifier0, "value");
        if(modifier0 != this.g) {
            this.g = modifier0;
            Function1 function10 = this.h;
            if(function10 != null) {
                function10.invoke(modifier0);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@m Function1 function10) {
        this.j = function10;
    }

    public final void setOnModifierChanged$ui_release(@m Function1 function10) {
        this.h = function10;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@m Function1 function10) {
        this.p = function10;
    }

    protected final void setRelease(@l a a0) {
        L.p(a0, "<set-?>");
        this.f = a0;
    }

    protected final void setReset(@l a a0) {
        L.p(a0, "<set-?>");
        this.e = a0;
    }

    public final void setSavedStateRegistryOwner(@m SavedStateRegistryOwner savedStateRegistryOwner0) {
        if(savedStateRegistryOwner0 != this.l) {
            this.l = savedStateRegistryOwner0;
            ViewTreeSavedStateRegistryOwner.b(this, savedStateRegistryOwner0);
        }
    }

    protected final void setUpdate(@l a a0) {
        L.p(a0, "value");
        this.c = a0;
        this.d = true;
        this.o.invoke();
    }

    public final void setView$ui_release(@m View view0) {
        if(view0 != this.b) {
            this.b = view0;
            this.removeAllViewsInLayout();
            if(view0 != null) {
                this.addView(view0);
                this.o.invoke();
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public boolean u(@l View view0, @l View view1, int v, int v1) {
        L.p(view0, "child");
        L.p(view1, "target");
        return (v & 2) != 0 || (v & 1) != 0;
    }
}

