package androidx.compose.ui.platform;

import A3.a;
import A3.o;
import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer.State;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.Owner;
import java.lang.ref.WeakReference;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeView.android.kt\nandroidx/compose/ui/platform/AbstractComposeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,448:1\n1#2:449\n*E\n"})
public abstract class AbstractComposeView extends ViewGroup {
    @m
    private WeakReference a;
    @m
    private IBinder b;
    @m
    private Composition c;
    @m
    private CompositionContext d;
    @m
    private a e;
    private boolean f;
    private boolean g;
    private boolean h;
    public static final int i = 8;

    static {
    }

    @j
    public AbstractComposeView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AbstractComposeView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AbstractComposeView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.setClipChildren(false);
        this.setClipToPadding(false);
        this.e = ViewCompositionStrategy.a.a().a(this);
    }

    public AbstractComposeView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Composable
    @UiComposable
    public abstract void a(@m Composer arg1, int arg2);

    @Override  // android.view.ViewGroup
    public void addView(@m View view0) {
        this.c();
        super.addView(view0);
    }

    @Override  // android.view.ViewGroup
    public void addView(@m View view0, int v) {
        this.c();
        super.addView(view0, v);
    }

    @Override  // android.view.ViewGroup
    public void addView(@m View view0, int v, int v1) {
        this.c();
        super.addView(view0, v, v1);
    }

    @Override  // android.view.ViewGroup
    public void addView(@m View view0, int v, @m ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.c();
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public void addView(@m View view0, @m ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.c();
        super.addView(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    protected boolean addViewInLayout(@m View view0, int v, @m ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.c();
        return super.addViewInLayout(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    protected boolean addViewInLayout(@m View view0, int v, @m ViewGroup.LayoutParams viewGroup$LayoutParams0, boolean z) {
        this.c();
        return super.addViewInLayout(view0, v, viewGroup$LayoutParams0, z);
    }

    private final CompositionContext b(CompositionContext compositionContext0) {
        CompositionContext compositionContext1 = this.i(compositionContext0) ? compositionContext0 : null;
        if(compositionContext1 != null) {
            this.a = new WeakReference(compositionContext1);
        }
        return compositionContext0;
    }

    private final void c() {
        if(!this.g) {
            throw new UnsupportedOperationException("Cannot add views to " + this.getClass().getSimpleName() + "; only Compose content is supported");
        }
    }

    public final void d() {
        if(this.d == null && !this.isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        this.f();
    }

    public final void e() {
        Composition composition0 = this.c;
        if(composition0 != null) {
            composition0.dispose();
        }
        this.c = null;
        this.requestLayout();
    }

    private final void f() {
        if(this.c == null) {
            try {
                this.g = true;
                this.c = Wrapper_androidKt.e(this, this.j(), ComposableLambdaKt.c(0xD8E40040, true, new o() {
                    final AbstractComposeView e;

                    {
                        this.e = abstractComposeView0;
                        super(2);
                    }

                    @Composable
                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    public final void a(@m Composer composer0, int v) {
                        if((v & 11) == 2 && composer0.c()) {
                            composer0.m();
                            return;
                        }
                        if(ComposerKt.g0()) {
                            ComposerKt.w0(0xD8E40040, v, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:250)");
                        }
                        this.e.a(composer0, 8);
                        if(ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        this.a(((Composer)object0), ((Number)object1).intValue());
                        return S0.a;
                    }
                }));
                this.g = false;
            }
            catch(Throwable throwable0) {
                this.g = false;
                throw throwable0;
            }
        }
    }

    public void g(boolean z, int v, int v1, int v2, int v3) {
        View view0 = this.getChildAt(0);
        if(view0 != null) {
            view0.layout(this.getPaddingLeft(), this.getPaddingTop(), v2 - v - this.getPaddingRight(), v3 - v1 - this.getPaddingBottom());
        }
    }

    private static void getDisposeViewCompositionStrategy$annotations() {
    }

    public final boolean getHasComposition() {
        return this.c != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f;
    }

    @InternalComposeUiApi
    public static void getShowLayoutBounds$annotations() {
    }

    public void h(int v, int v1) {
        View view0 = this.getChildAt(0);
        if(view0 == null) {
            super.onMeasure(v, v1);
            return;
        }
        int v2 = Math.max(0, View.MeasureSpec.getSize(v) - this.getPaddingLeft() - this.getPaddingRight());
        int v3 = Math.max(0, View.MeasureSpec.getSize(v1) - this.getPaddingTop() - this.getPaddingBottom());
        view0.measure(View.MeasureSpec.makeMeasureSpec(v2, View.MeasureSpec.getMode(v)), View.MeasureSpec.makeMeasureSpec(v3, View.MeasureSpec.getMode(v1)));
        this.setMeasuredDimension(view0.getMeasuredWidth() + this.getPaddingLeft() + this.getPaddingRight(), view0.getMeasuredHeight() + this.getPaddingTop() + this.getPaddingBottom());
    }

    private final boolean i(CompositionContext compositionContext0) {
        return !(compositionContext0 instanceof Recomposer) || ((State)((Recomposer)compositionContext0).p0().getValue()).compareTo(State.b) > 0;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.h || super.isTransitionGroup();
    }

    private final CompositionContext j() {
        CompositionContext compositionContext0 = this.d;
        if(compositionContext0 == null) {
            CompositionContext compositionContext1 = WindowRecomposer_androidKt.d(this);
            CompositionContext compositionContext2 = null;
            compositionContext0 = compositionContext1 == null ? null : this.b(compositionContext1);
            if(compositionContext0 == null) {
                WeakReference weakReference0 = this.a;
                if(weakReference0 != null) {
                    CompositionContext compositionContext3 = (CompositionContext)weakReference0.get();
                    if(compositionContext3 != null && this.i(compositionContext3)) {
                        compositionContext2 = compositionContext3;
                    }
                }
                return compositionContext2 == null ? this.b(WindowRecomposer_androidKt.h(this)) : compositionContext2;
            }
        }
        return compositionContext0;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.setPreviousAttachedWindowToken(this.getWindowToken());
        if(this.getShouldCreateCompositionOnAttachedToWindow()) {
            this.f();
        }
    }

    @Override  // android.view.ViewGroup
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.g(z, v, v1, v2, v3);
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        this.f();
        this.h(v, v1);
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        View view0 = this.getChildAt(0);
        if(view0 != null) {
            view0.setLayoutDirection(v);
        }
    }

    public final void setParentCompositionContext(@m CompositionContext compositionContext0) {
        this.setParentContext(compositionContext0);
    }

    private final void setParentContext(CompositionContext compositionContext0) {
        if(this.d != compositionContext0) {
            this.d = compositionContext0;
            if(compositionContext0 != null) {
                this.a = null;
            }
            Composition composition0 = this.c;
            if(composition0 != null) {
                composition0.dispose();
                this.c = null;
                if(this.isAttachedToWindow()) {
                    this.f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder0) {
        if(this.b != iBinder0) {
            this.b = iBinder0;
            this.a = null;
        }
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f = z;
        View view0 = this.getChildAt(0);
        if(view0 != null) {
            ((Owner)view0).setShowLayoutBounds(z);
        }
    }

    @Override  // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.h = true;
    }

    public final void setViewCompositionStrategy(@l ViewCompositionStrategy viewCompositionStrategy0) {
        L.p(viewCompositionStrategy0, "strategy");
        a a0 = this.e;
        if(a0 != null) {
            a0.invoke();
        }
        this.e = viewCompositionStrategy0.a(this);
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

