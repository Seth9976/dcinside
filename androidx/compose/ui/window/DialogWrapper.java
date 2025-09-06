package androidx.compose.ui.window;

import A3.a;
import A3.o;
import android.content.Context;
import android.graphics.Outline;
import android.os.Build.VERSION;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.R.id;
import androidx.compose.ui.R.style;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.J;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,456:1\n154#2:457\n1#3:458\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n*L\n300#1:457\n*E\n"})
final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {
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
    private a d;
    @l
    private DialogProperties e;
    @l
    private final View f;
    @l
    private final DialogLayout g;
    private final float h;
    private final int i;

    public DialogWrapper(@l a a0, @l DialogProperties dialogProperties0, @l View view0, @l LayoutDirection layoutDirection0, @l Density density0, @l UUID uUID0) {
        L.p(a0, "onDismissRequest");
        L.p(dialogProperties0, "properties");
        L.p(view0, "composeView");
        L.p(layoutDirection0, "layoutDirection");
        L.p(density0, "density");
        L.p(uUID0, "dialogId");
        ViewGroup viewGroup0 = null;
        super(new ContextThemeWrapper(view0.getContext(), (Build.VERSION.SDK_INT >= 0x1F || dialogProperties0.a() ? style.DialogWindowTheme : style.FloatingDialogWindowTheme)), 0, 2, null);
        this.d = a0;
        this.e = dialogProperties0;
        this.f = view0;
        this.h = 8.0f;
        Window window0 = this.getWindow();
        if(window0 == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.i = window0.getAttributes().softInputMode & 0xF0;
        window0.requestFeature(1);
        window0.setBackgroundDrawableResource(0x106000D);
        WindowCompat.c(window0, this.e.a());
        Context context0 = this.getContext();
        L.o(context0, "context");
        DialogLayout dialogLayout0 = new DialogLayout(context0, window0);
        dialogLayout0.setTag(id.compose_view_saveable_id_tag, "Dialog:" + uUID0);
        dialogLayout0.setClipChildren(false);
        dialogLayout0.setElevation(density0.y1(8.0f));
        dialogLayout0.setOutlineProvider(new androidx.compose.ui.window.DialogWrapper.1.2());
        this.g = dialogLayout0;
        View view1 = window0.getDecorView();
        if(view1 instanceof ViewGroup) {
            viewGroup0 = (ViewGroup)view1;
        }
        if(viewGroup0 != null) {
            DialogWrapper.f(viewGroup0);
        }
        this.setContentView(dialogLayout0);
        ViewTreeLifecycleOwner.b(dialogLayout0, ViewTreeLifecycleOwner.a(view0));
        ViewTreeViewModelStoreOwner.b(dialogLayout0, ViewTreeViewModelStoreOwner.a(view0));
        ViewTreeSavedStateRegistryOwner.b(dialogLayout0, ViewTreeSavedStateRegistryOwner.a(view0));
        this.m(this.d, this.e, layoutDirection0);
        OnBackPressedDispatcherKt.b(this.getOnBackPressedDispatcher(), this, false, new Function1() {
            final DialogWrapper e;

            {
                this.e = dialogWrapper0;
                super(1);
            }

            public final void a(@l OnBackPressedCallback onBackPressedCallback0) {
                L.p(onBackPressedCallback0, "$this$addCallback");
                if(this.e.e.b()) {
                    this.e.d.invoke();
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((OnBackPressedCallback)object0));
                return S0.a;
            }
        }, 2, null);

        public final class androidx.compose.ui.window.DialogWrapper.1.2 extends ViewOutlineProvider {
            @Override  // android.view.ViewOutlineProvider
            public void getOutline(@l View view0, @l Outline outline0) {
                L.p(view0, "view");
                L.p(outline0, "result");
                outline0.setRect(0, 0, view0.getWidth(), view0.getHeight());
                outline0.setAlpha(0.0f);
            }
        }

    }

    @Override  // android.app.Dialog
    public void cancel() {
    }

    private static final void f(ViewGroup viewGroup0) {
        viewGroup0.setClipChildren(false);
        if(viewGroup0 instanceof DialogLayout) {
            return;
        }
        int v1 = viewGroup0.getChildCount();
        for(int v = 0; v < v1; ++v) {
            View view0 = viewGroup0.getChildAt(v);
            ViewGroup viewGroup1 = view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
            if(viewGroup1 != null) {
                DialogWrapper.f(viewGroup1);
            }
        }
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    @l
    public AbstractComposeView getSubCompositionView() {
        return this.g;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    public View getViewRoot() {
        return null;
    }

    public final void i() {
        this.g.e();
    }

    public final void j(@l CompositionContext compositionContext0, @l o o0) {
        L.p(compositionContext0, "parentComposition");
        L.p(o0, "children");
        this.g.l(compositionContext0, o0);
    }

    private final void k(LayoutDirection layoutDirection0) {
        DialogLayout dialogLayout0 = this.g;
        int v = WhenMappings.a[layoutDirection0.ordinal()];
        int v1 = 1;
        if(v == 1) {
            v1 = 0;
        }
        else if(v != 2) {
            throw new J();
        }
        dialogLayout0.setLayoutDirection(v1);
    }

    private final void l(SecureFlagPolicy secureFlagPolicy0) {
        boolean z = SecureFlagPolicy_androidKt.a(secureFlagPolicy0, AndroidPopup_androidKt.i(this.f));
        Window window0 = this.getWindow();
        L.m(window0);
        window0.setFlags((z ? 0x2000 : 0xFFFFDFFF), 0x2000);
    }

    public final void m(@l a a0, @l DialogProperties dialogProperties0, @l LayoutDirection layoutDirection0) {
        L.p(a0, "onDismissRequest");
        L.p(dialogProperties0, "properties");
        L.p(layoutDirection0, "layoutDirection");
        this.d = a0;
        this.e = dialogProperties0;
        this.l(dialogProperties0.d());
        this.k(layoutDirection0);
        this.g.m(dialogProperties0.e());
        if(Build.VERSION.SDK_INT < 0x1F) {
            if(dialogProperties0.a()) {
                Window window0 = this.getWindow();
                if(window0 != null) {
                    window0.setSoftInputMode(this.i);
                }
            }
            else {
                Window window1 = this.getWindow();
                if(window1 != null) {
                    window1.setSoftInputMode(16);
                }
            }
        }
    }

    @Override  // android.app.Dialog
    public boolean onTouchEvent(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "event");
        boolean z = super.onTouchEvent(motionEvent0);
        if(z && this.e.c()) {
            this.d.invoke();
        }
        return z;
    }
}

