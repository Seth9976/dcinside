package androidx.compose.ui.window;

import A3.a;
import A3.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.R.id;
import androidx.compose.ui.R.string;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.J;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.math.b;
import y4.l;
import y4.m;

@SuppressLint({"ViewConstructor"})
@s0({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,824:1\n154#2:825\n1#3:826\n76#4:827\n102#4,2:828\n76#4:830\n102#4,2:831\n76#4:833\n76#4:834\n102#4,2:835\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n*L\n413#1:825\n402#1:827\n402#1:828,2\n403#1:830\n403#1:831,2\n407#1:833\n447#1:834\n447#1:835,2\n*E\n"})
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[LayoutDirection.values().length];
            try {
                arr_v[LayoutDirection.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutDirection.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private final int[] A;
    @m
    private a j;
    @l
    private PopupProperties k;
    @l
    private String l;
    @l
    private final View m;
    @l
    private final PopupLayoutHelper n;
    @l
    private final WindowManager o;
    @l
    private final WindowManager.LayoutParams p;
    @l
    private PopupPositionProvider q;
    @l
    private LayoutDirection r;
    @l
    private final MutableState s;
    @l
    private final MutableState t;
    @m
    private IntRect u;
    @l
    private final State v;
    private final float w;
    @l
    private final Rect x;
    @l
    private final MutableState y;
    private boolean z;

    public PopupLayout(@m a a0, @l PopupProperties popupProperties0, @l String s, @l View view0, @l Density density0, @l PopupPositionProvider popupPositionProvider0, @l UUID uUID0, @l PopupLayoutHelper popupLayoutHelper0) {
        L.p(popupProperties0, "properties");
        L.p(s, "testTag");
        L.p(view0, "composeView");
        L.p(density0, "density");
        L.p(popupPositionProvider0, "initialPositionProvider");
        L.p(uUID0, "popupId");
        L.p(popupLayoutHelper0, "popupLayoutHelper");
        Context context0 = view0.getContext();
        L.o(context0, "composeView.context");
        super(context0, null, 0, 6, null);
        this.j = a0;
        this.k = popupProperties0;
        this.l = s;
        this.m = view0;
        this.n = popupLayoutHelper0;
        Object object0 = view0.getContext().getSystemService("window");
        L.n(object0, "null cannot be cast to non-null type android.view.WindowManager");
        this.o = (WindowManager)object0;
        this.p = this.m();
        this.q = popupPositionProvider0;
        this.r = LayoutDirection.a;
        this.s = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.t = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.v = SnapshotStateKt.c(new a() {
            final PopupLayout e;

            {
                this.e = popupLayout0;
                super(0);
            }

            @l
            public final Boolean b() {
                return this.e.getParentLayoutCoordinates() == null || this.e.getPopupContentSize-bOM6tXw() == null ? false : true;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        this.w = 8.0f;
        this.x = new Rect();
        this.setId(0x1020002);
        ViewTreeLifecycleOwner.b(this, ViewTreeLifecycleOwner.a(view0));
        ViewTreeViewModelStoreOwner.b(this, ViewTreeViewModelStoreOwner.a(view0));
        ViewTreeSavedStateRegistryOwner.b(this, ViewTreeSavedStateRegistryOwner.a(view0));
        this.setTag(id.compose_view_saveable_id_tag, "Popup:" + uUID0);
        this.setClipChildren(false);
        this.setElevation(density0.y1(8.0f));
        this.setOutlineProvider(new androidx.compose.ui.window.PopupLayout.2());
        this.y = SnapshotStateKt__SnapshotStateKt.g(ComposableSingletons.AndroidPopup_androidKt.a.a(), null, 2, null);
        this.A = new int[2];

        public final class androidx.compose.ui.window.PopupLayout.2 extends ViewOutlineProvider {
            @Override  // android.view.ViewOutlineProvider
            public void getOutline(@l View view0, @l Outline outline0) {
                L.p(view0, "view");
                L.p(outline0, "result");
                outline0.setRect(0, 0, view0.getWidth(), view0.getHeight());
                outline0.setAlpha(0.0f);
            }
        }

    }

    public PopupLayout(a a0, PopupProperties popupProperties0, String s, View view0, Density density0, PopupPositionProvider popupPositionProvider0, UUID uUID0, PopupLayoutHelper popupLayoutHelper0, int v, w w0) {
        PopupLayoutHelper popupLayoutHelper1;
        if((v & 0x80) == 0) {
            popupLayoutHelper1 = popupLayoutHelper0;
        }
        else {
            PopupLayoutHelperImpl popupLayoutHelperImpl0 = Build.VERSION.SDK_INT >= 29 ? new PopupLayoutHelperImpl29() : new PopupLayoutHelperImpl();
            popupLayoutHelper1 = popupLayoutHelperImpl0;
        }
        this(a0, popupProperties0, s, view0, density0, popupPositionProvider0, uUID0, popupLayoutHelper1);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    @UiComposable
    public void a(@m Composer composer0, int v) {
        Composer composer1 = composer0.G(-857613600);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-857613600, v, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:463)");
        }
        this.getContent().invoke(composer1, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(v) {
                final PopupLayout e;
                final int f;

                {
                    this.e = popupLayout0;
                    this.f = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    this.e.a(composer0, (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        if(keyEvent0.getKeyCode() != 4 || !this.k.b() || this.getKeyDispatcherState() == null) {
            return super.dispatchKeyEvent(keyEvent0);
        }
        if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyEvent$DispatcherState0 = this.getKeyDispatcherState();
            if(keyEvent$DispatcherState0 != null) {
                keyEvent$DispatcherState0.startTracking(keyEvent0, this);
            }
            return true;
        }
        if(keyEvent0.getAction() == 1) {
            KeyEvent.DispatcherState keyEvent$DispatcherState1 = this.getKeyDispatcherState();
            if(keyEvent$DispatcherState1 != null && keyEvent$DispatcherState1.isTracking(keyEvent0) && !keyEvent0.isCanceled()) {
                a a0 = this.j;
                if(a0 != null) {
                    a0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void g(boolean z, int v, int v1, int v2, int v3) {
        super.g(z, v, v1, v2, v3);
        View view0 = this.getChildAt(0);
        if(view0 == null) {
            return;
        }
        this.p.width = view0.getMeasuredWidth();
        this.p.height = view0.getMeasuredHeight();
        this.n.a(this.o, this, this.p);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean)this.v.getValue()).booleanValue();
    }

    private final o getContent() {
        return (o)this.y.getValue();
    }

    private final int getDisplayHeight() {
        float f = this.getContext().getResources().getDisplayMetrics().density;
        return b.L0(((float)this.getContext().getResources().getConfiguration().screenHeightDp) * f);
    }

    private final int getDisplayWidth() {
        float f = this.getContext().getResources().getDisplayMetrics().density;
        return b.L0(((float)this.getContext().getResources().getConfiguration().screenWidthDp) * f);
    }

    @l
    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.p;
    }

    @VisibleForTesting(otherwise = 2)
    public static void getParams$ui_release$annotations() {
    }

    private final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates)this.t.getValue();
    }

    @l
    public final LayoutDirection getParentLayoutDirection() {
        return this.r;
    }

    @m
    public final IntSize getPopupContentSize-bOM6tXw() {
        return (IntSize)this.s.getValue();
    }

    @l
    public final PopupPositionProvider getPositionProvider() {
        return this.q;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.z;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    @l
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @l
    public final String getTestTag() {
        return this.l;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    public View getViewRoot() {
        return null;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void h(int v, int v1) {
        if(this.k.g()) {
            super.h(v, v1);
            return;
        }
        super.h(View.MeasureSpec.makeMeasureSpec(this.getDisplayWidth(), 0x80000000), View.MeasureSpec.makeMeasureSpec(this.getDisplayHeight(), 0x80000000));
    }

    private final void l(int v) {
        this.p.flags = v;
        this.n.a(this.o, this, this.p);
    }

    private final WindowManager.LayoutParams m() {
        WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
        windowManager$LayoutParams0.gravity = 0x800033;
        windowManager$LayoutParams0.flags = windowManager$LayoutParams0.flags & 0xFF7D7FE7 | 0x40000;
        windowManager$LayoutParams0.type = 1002;
        windowManager$LayoutParams0.token = this.m.getApplicationWindowToken();
        windowManager$LayoutParams0.width = -2;
        windowManager$LayoutParams0.height = -2;
        windowManager$LayoutParams0.format = -3;
        windowManager$LayoutParams0.setTitle(this.m.getContext().getResources().getString(string.default_popup_window_title));
        return windowManager$LayoutParams0;
    }

    public final void n() {
        ViewTreeLifecycleOwner.b(this, null);
        this.o.removeViewImmediate(this);
    }

    public final void o() {
        int v = this.A[0];
        int v1 = this.A[1];
        this.m.getLocationOnScreen(this.A);
        if(v != this.A[0] || v1 != this.A[1]) {
            this.t();
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(@m MotionEvent motionEvent0) {
        if(!this.k.c()) {
            return super.onTouchEvent(motionEvent0);
        }
        if(motionEvent0 != null && motionEvent0.getAction() == 0 && (motionEvent0.getX() < 0.0f || motionEvent0.getX() >= ((float)this.getWidth()) || motionEvent0.getY() < 0.0f || motionEvent0.getY() >= ((float)this.getHeight()))) {
            a a0 = this.j;
            if(a0 != null) {
                a0.invoke();
            }
            return true;
        }
        if(motionEvent0 != null && motionEvent0.getAction() == 4) {
            a a1 = this.j;
            if(a1 != null) {
                a1.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent0);
    }

    public final void p(@l CompositionContext compositionContext0, @l o o0) {
        L.p(compositionContext0, "parent");
        L.p(o0, "content");
        this.setParentCompositionContext(compositionContext0);
        this.setContent(o0);
        this.z = true;
    }

    public final void q() {
        this.o.addView(this, this.p);
    }

    private final void r(LayoutDirection layoutDirection0) {
        int v = WhenMappings.a[layoutDirection0.ordinal()];
        int v1 = 1;
        if(v == 1) {
            v1 = 0;
        }
        else if(v != 2) {
            throw new J();
        }
        super.setLayoutDirection(v1);
    }

    public final void s(@m a a0, @l PopupProperties popupProperties0, @l String s, @l LayoutDirection layoutDirection0) {
        L.p(popupProperties0, "properties");
        L.p(s, "testTag");
        L.p(layoutDirection0, "layoutDirection");
        this.j = a0;
        this.k = popupProperties0;
        this.l = s;
        this.setIsFocusable(popupProperties0.e());
        this.setSecurePolicy(popupProperties0.f());
        this.setClippingEnabled(popupProperties0.a());
        this.r(layoutDirection0);
    }

    private final void setClippingEnabled(boolean z) {
        this.l((z ? this.p.flags & 0xFFFFFDFF : this.p.flags | 0x200));
    }

    private final void setContent(o o0) {
        this.y.setValue(o0);
    }

    private final void setIsFocusable(boolean z) {
        this.l((z ? this.p.flags & -9 : this.p.flags | 8));
    }

    @Override  // android.view.View
    public void setLayoutDirection(int v) {
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates0) {
        this.t.setValue(layoutCoordinates0);
    }

    public final void setParentLayoutDirection(@l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "<set-?>");
        this.r = layoutDirection0;
    }

    public final void setPopupContentSize-fhxjrPA(@m IntSize intSize0) {
        this.s.setValue(intSize0);
    }

    public final void setPositionProvider(@l PopupPositionProvider popupPositionProvider0) {
        L.p(popupPositionProvider0, "<set-?>");
        this.q = popupPositionProvider0;
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy0) {
        this.l((SecureFlagPolicy_androidKt.a(secureFlagPolicy0, AndroidPopup_androidKt.i(this.m)) ? this.p.flags | 0x2000 : this.p.flags & 0xFFFFDFFF));
    }

    public final void setTestTag(@l String s) {
        L.p(s, "<set-?>");
        this.l = s;
    }

    @VisibleForTesting(otherwise = 2)
    public final void t() {
        LayoutCoordinates layoutCoordinates0 = this.getParentLayoutCoordinates();
        if(layoutCoordinates0 == null) {
            return;
        }
        long v = layoutCoordinates0.a();
        long v1 = LayoutCoordinatesKt.g(layoutCoordinates0);
        IntRect intRect0 = IntRectKt.b(IntOffsetKt.a(b.L0(Offset.p(v1)), b.L0(Offset.r(v1))), v);
        if(!L.g(intRect0, this.u)) {
            this.u = intRect0;
            this.v();
        }
    }

    public final void u(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "parentLayoutCoordinates");
        this.setParentLayoutCoordinates(layoutCoordinates0);
        this.t();
    }

    public final void v() {
        IntRect intRect0 = this.u;
        if(intRect0 == null) {
            return;
        }
        IntSize intSize0 = this.getPopupContentSize-bOM6tXw();
        if(intSize0 != null) {
            this.n.c(this.m, this.x);
            IntRect intRect1 = AndroidPopup_androidKt.l(this.x);
            long v = IntSizeKt.a(intRect1.G(), intRect1.r());
            long v1 = this.q.a(intRect0, v, this.r, intSize0.q());
            this.p.x = (int)(v1 >> 0x20);
            this.p.y = (int)(v1 & 0xFFFFFFFFL);
            if(this.k.d()) {
                this.n.b(this, ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
            }
            this.n.a(this.o, this, this.p);
        }
    }
}

