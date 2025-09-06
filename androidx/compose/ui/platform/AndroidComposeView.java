package androidx.compose.ui.platform;

import A3.a;
import A3.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver.OnTouchModeChangeListener;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.input.pointer.ProcessResult;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.LayoutNode.UsageByParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner.OnLayoutCompletedListener;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.e;
import androidx.compose.ui.semantics.SemanticsModifierCore;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.AndroidTextInputServicePlugin.Adapter;
import androidx.compose.ui.text.input.PlatformTextInput;
import androidx.compose.ui.text.input.PlatformTextInputAdapter;
import androidx.compose.ui.text.input.PlatformTextInputPlugin;
import androidx.compose.ui.text.input.PlatformTextInputPluginRegistry;
import androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl;
import androidx.compose.ui.text.input.TextInputForTests;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.c;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.S0;
import kotlin.V;
import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r0;
import y4.l;
import y4.m;

@SuppressLint({"ViewConstructor", "VisibleForTests"})
@s0({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 6 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 9 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1941:1\n1182#2:1942\n1161#2,2:1943\n76#3:1945\n102#3,2:1946\n76#3:1948\n102#3,2:1949\n76#3:1951\n102#3,2:1952\n523#4:1954\n728#4,2:1955\n460#4,11:1979\n460#4,11:1991\n26#5,5:1957\n26#5,5:1962\n26#5,5:1967\n26#5,5:2006\n47#6,5:1972\n1#7:1977\n163#8:1978\n163#8:1990\n20#9,2:2002\n20#9,2:2004\n533#10,6:2011\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n481#1:1942\n481#1:1943,2\n348#1:1945\n348#1:1946,2\n405#1:1948\n405#1:1949,2\n419#1:1951\n419#1:1952,2\n673#1:1954\n686#1:1955,2\n1115#1:1979,11\n1123#1:1991,11\n803#1:1957,5\n814#1:1962,5\n864#1:1967,5\n1273#1:2006,5\n1041#1:1972,5\n1115#1:1978\n1123#1:1990\n1135#1:2002,2\n1190#1:2004,2\n1357#1:2011,6\n*E\n"})
public final class AndroidComposeView extends ViewGroup implements PositionCalculator, Owner, ViewRootForTest, DefaultLifecycleObserver {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @SuppressLint({"PrivateApi", "BanUncheckedReflection"})
        private final boolean b() {
            try {
                Boolean boolean0 = null;
                if(AndroidComposeView.o9 == null) {
                    AndroidComposeView.o9 = Class.forName("android.os.SystemProperties");
                    Class class0 = AndroidComposeView.o9;
                    AndroidComposeView.p9 = class0 == null ? null : class0.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method0 = AndroidComposeView.p9;
                Object object0 = method0 == null ? null : method0.invoke(null, "debug.layout", Boolean.FALSE);
                if(object0 instanceof Boolean) {
                    boolean0 = (Boolean)object0;
                }
                return boolean0 == null ? false : boolean0.booleanValue();
            }
            catch(Exception unused_ex) {
            }
            return false;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class ViewTreeOwners {
        @l
        private final LifecycleOwner a;
        @l
        private final SavedStateRegistryOwner b;
        public static final int c = 8;

        static {
        }

        public ViewTreeOwners(@l LifecycleOwner lifecycleOwner0, @l SavedStateRegistryOwner savedStateRegistryOwner0) {
            L.p(lifecycleOwner0, "lifecycleOwner");
            L.p(savedStateRegistryOwner0, "savedStateRegistryOwner");
            super();
            this.a = lifecycleOwner0;
            this.b = savedStateRegistryOwner0;
        }

        @l
        public final LifecycleOwner a() {
            return this.a;
        }

        @l
        public final SavedStateRegistryOwner b() {
            return this.b;
        }
    }

    private boolean A;
    @m
    private AndroidViewsHandler B;
    @m
    private DrawChildContainer C;
    @m
    private Constraints D;
    private boolean E;
    @l
    private final MeasureAndLayoutDelegate F;
    @l
    private final ViewConfiguration G;
    private long H;
    @l
    private final int[] I;
    @l
    private final float[] J;
    @l
    private final float[] K;
    private long L;
    private boolean M;
    @l
    private final ViewTreeObserver.OnGlobalLayoutListener M8;
    private long N;
    @l
    private final ViewTreeObserver.OnScrollChangedListener N8;
    private boolean O;
    @l
    private final ViewTreeObserver.OnTouchModeChangeListener O8;
    @l
    private final MutableState P;
    @l
    private final PlatformTextInputPluginRegistryImpl P8;
    @m
    private Function1 Q;
    @l
    private final TextInputService Q8;
    @l
    private final ResourceLoader R8;
    @l
    private final MutableState S8;
    private int T8;
    @l
    private final MutableState U8;
    @l
    private final HapticFeedback V8;
    @l
    private final InputModeManagerImpl W8;
    @l
    private final ModifierLocalManager X8;
    @l
    private final TextToolbar Y8;
    @m
    private MotionEvent Z8;
    private long a;
    private long a9;
    private boolean b;
    @l
    private final WeakCache b9;
    @l
    private final LayoutNodeDrawScope c;
    @l
    private final MutableVector c9;
    @l
    private Density d;
    @l
    private final androidx.compose.ui.platform.AndroidComposeView.resendMotionEventRunnable.1 d9;
    @l
    private final SemanticsModifierCore e;
    @l
    private final Runnable e9;
    @l
    private final FocusOwner f;
    private boolean f9;
    @l
    private final WindowInfoImpl g;
    @l
    private final a g9;
    @l
    private final Modifier h;
    @l
    private final CalculateMatrixToWindow h9;
    @l
    private final Modifier i;
    private boolean i9;
    @l
    private final CanvasHolder j;
    @m
    private PointerIcon j9;
    @l
    private final LayoutNode k;
    @l
    private final PointerIconService k9;
    @l
    private final RootForTest l;
    @l
    public static final Companion l9 = null;
    @l
    private final SemanticsOwner m;
    @l
    private static final String m9 = "Compose Focus";
    @l
    private final AndroidComposeViewAccessibilityDelegateCompat n;
    private static final int n9 = 10;
    @l
    private final AutofillTree o;
    @m
    private static Class o9;
    @l
    private final List p;
    @m
    private static Method p9;
    @m
    private List q;
    private boolean r;
    @l
    private final MotionEventAdapter s;
    @l
    private final PointerInputEventProcessor t;
    @l
    private Function1 u;
    @m
    private final AndroidAutofill v;
    private boolean w;
    @l
    private final AndroidClipboardManager x;
    @l
    private final AndroidAccessibilityManager y;
    @l
    private final OwnerSnapshotObserver z;

    static {
        AndroidComposeView.l9 = new Companion(null);
    }

    public AndroidComposeView(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        this.a = 0x7FC000007FC00000L;
        this.b = true;
        this.c = new LayoutNodeDrawScope(null, 1, null);
        this.d = AndroidDensity_androidKt.a(context0);
        SemanticsModifierCore semanticsModifierCore0 = new SemanticsModifierCore(false, false, androidx.compose.ui.platform.AndroidComposeView.semanticsModifier.1.e, null, 8, null);
        this.e = semanticsModifierCore0;
        this.f = new FocusOwnerImpl(new Function1() {
            final AndroidComposeView e;

            {
                this.e = androidComposeView0;
                super(1);
            }

            public final void a(@l a a0) {
                L.p(a0, "it");
                this.e.d(a0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((a)object0));
                return S0.a;
            }
        });
        this.g = new WindowInfoImpl();
        androidx.compose.ui.platform.AndroidComposeView.keyInputModifier.1 androidComposeView$keyInputModifier$10 = new Function1() {
            final AndroidComposeView e;

            {
                this.e = androidComposeView0;
                super(1);
            }

            @l
            public final Boolean a(@l KeyEvent keyEvent0) {
                L.p(keyEvent0, "it");
                FocusDirection focusDirection0 = this.e.u(keyEvent0);
                return focusDirection0 == null || !KeyEventType.g(KeyEvent_androidKt.b(keyEvent0), 2) ? false : Boolean.valueOf(this.e.getFocusOwner().i(focusDirection0.q()));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((androidx.compose.ui.input.key.KeyEvent)object0).h());
            }
        };
        Modifier modifier0 = KeyInputModifierKt.a(Modifier.m0, androidComposeView$keyInputModifier$10);
        this.h = modifier0;
        Modifier modifier1 = RotaryInputModifierKt.b(Modifier.m0, androidx.compose.ui.platform.AndroidComposeView.rotaryInputModifier.1.e);
        this.i = modifier1;
        this.j = new CanvasHolder();
        LayoutNode layoutNode0 = new LayoutNode(false, 0, 3, null);
        layoutNode0.l(RootMeasurePolicy.b);
        layoutNode0.n(this.getDensity());
        layoutNode0.m(Modifier.m0.r0(semanticsModifierCore0).r0(modifier1).r0(this.getFocusOwner().b()).r0(modifier0));
        this.k = layoutNode0;
        this.l = this;
        this.m = new SemanticsOwner(this.getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0 = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.n = androidComposeViewAccessibilityDelegateCompat0;
        this.o = new AutofillTree();
        this.p = new ArrayList();
        this.s = new MotionEventAdapter();
        this.t = new PointerInputEventProcessor(this.getRoot());
        this.u = androidx.compose.ui.platform.AndroidComposeView.configurationChangeObserver.1.e;
        this.v = new AndroidAutofill(this, this.getAutofillTree());
        this.x = new AndroidClipboardManager(context0);
        this.y = new AndroidAccessibilityManager(context0);
        this.z = new OwnerSnapshotObserver(new Function1() {
            final AndroidComposeView e;

            {
                this.e = androidComposeView0;
                super(1);
            }

            public final void b(@l a a0) {
                L.p(a0, "command");
                Handler handler0 = this.e.getHandler();
                if((handler0 == null ? null : handler0.getLooper()) == Looper.myLooper()) {
                    a0.invoke();
                    return;
                }
                Handler handler1 = this.e.getHandler();
                if(handler1 != null) {
                    handler1.post(() -> {
                        L.p(a0, "$tmp0");
                        a0.invoke();
                    });
                }
            }

            // 检测为 Lambda 实现
            private static final void c(a a0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((a)object0));
                return S0.a;
            }
        });
        this.F = new MeasureAndLayoutDelegate(this.getRoot());
        android.view.ViewConfiguration viewConfiguration0 = android.view.ViewConfiguration.get(context0);
        L.o(viewConfiguration0, "get(context)");
        this.G = new AndroidViewConfiguration(viewConfiguration0);
        this.H = IntOffsetKt.a(0x7FFFFFFF, 0x7FFFFFFF);
        this.I = new int[]{0, 0};
        this.J = Matrix.c(null, 1, null);
        this.K = Matrix.c(null, 1, null);
        this.L = -1L;
        this.N = 0x7F8000007F800000L;
        this.O = true;
        this.P = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        this.M8 = () -> {
            L.p(this, "this$0");
            this.x0();
        };
        this.N8 = () -> {
            L.p(this, "this$0");
            this.x0();
        };
        this.O8 = (boolean z) -> // 去混淆评级： 低(20)
        {
            L.p(this, "this$0");
            this.W8.c((z ? 1 : 2));
        };
        this.P8 = new PlatformTextInputPluginRegistryImpl(new o() {
            final AndroidComposeView e;

            {
                this.e = androidComposeView0;
                super(2);
            }

            @l
            public final PlatformTextInputAdapter a(@l PlatformTextInputPlugin platformTextInputPlugin0, @l PlatformTextInput platformTextInput0) {
                L.p(platformTextInputPlugin0, "factory");
                L.p(platformTextInput0, "platformTextInput");
                return platformTextInputPlugin0.a(platformTextInput0, this.e);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((PlatformTextInputPlugin)object0), ((PlatformTextInput)object1));
            }
        });
        this.Q8 = ((Adapter)this.getPlatformTextInputPluginRegistry().h((PlatformTextInput platformTextInput0, View view0) -> this.b(platformTextInput0, view0)).b()).d();
        this.R8 = new AndroidFontResourceLoader(context0);
        this.S8 = SnapshotStateKt.j(FontFamilyResolver_androidKt.a(context0), SnapshotStateKt.s());
        Configuration configuration0 = context0.getResources().getConfiguration();
        L.o(configuration0, "context.resources.configuration");
        this.T8 = this.X(configuration0);
        Configuration configuration1 = context0.getResources().getConfiguration();
        L.o(configuration1, "context.resources.configuration");
        this.U8 = SnapshotStateKt__SnapshotStateKt.g(AndroidComposeView_androidKt.d(configuration1), null, 2, null);
        this.V8 = new PlatformHapticFeedback(this);
        this.W8 = new InputModeManagerImpl((this.isInTouchMode() ? 1 : 2), new Function1() {
            final AndroidComposeView e;

            {
                this.e = androidComposeView0;
                super(1);
            }

            @l
            public final Boolean a(int v) {
                if(InputMode.f(v, 1)) {
                    return Boolean.valueOf(this.e.isInTouchMode());
                }
                if(InputMode.f(v, 2)) {
                    return this.e.isInTouchMode() ? Boolean.valueOf(this.e.requestFocusFromTouch()) : true;
                }
                return false;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((InputMode)object0).i());
            }
        }, null);
        this.X8 = new ModifierLocalManager(this);
        this.Y8 = new AndroidTextToolbar(this);
        this.b9 = new WeakCache();
        this.c9 = new MutableVector(new a[16], 0);
        this.d9 = new Runnable() {
            @Override
            public void run() {
                boolean z = false;
                this.a.removeCallbacks(this);
                MotionEvent motionEvent0 = this.a.Z8;
                if(motionEvent0 != null) {
                    if(motionEvent0.getToolType(0) == 3) {
                        z = true;
                    }
                    int v = motionEvent0.getActionMasked();
                    if(z) {
                        if(v != 1 && v != 10) {
                            this.a.u0(motionEvent0, (v == 7 || v == 9 ? 7 : 2), this.a.a9, false);
                        }
                    }
                    else if(v != 1) {
                        this.a.u0(motionEvent0, (v == 7 || v == 9 ? 7 : 2), this.a.a9, false);
                    }
                }
            }
        };
        this.e9 = () -> {
            L.p(this, "this$0");
            this.f9 = false;
            MotionEvent motionEvent0 = this.Z8;
            L.m(motionEvent0);
            if(motionEvent0.getActionMasked() != 10) {
                throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
            }
            this.t0(motionEvent0);
        };
        this.g9 = new a() {
            final AndroidComposeView e;

            {
                this.e = androidComposeView0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                MotionEvent motionEvent0 = this.e.Z8;
                if(motionEvent0 != null) {
                    switch(motionEvent0.getActionMasked()) {
                        case 7: 
                        case 9: {
                            long v = SystemClock.uptimeMillis();
                            this.e.a9 = v;
                            this.e.post(this.e.d9);
                            break;
                        }
                    }
                }
            }
        };
        int v = Build.VERSION.SDK_INT;
        CalculateMatrixToWindowApi29 calculateMatrixToWindowApi290 = v >= 29 ? new CalculateMatrixToWindowApi29() : new CalculateMatrixToWindowApi21();
        this.h9 = calculateMatrixToWindowApi290;
        this.setWillNotDraw(false);
        this.setFocusable(true);
        if(v >= 26) {
            AndroidComposeViewVerificationHelperMethodsO.a.a(this, 1, false);
        }
        this.setFocusableInTouchMode(true);
        this.setClipChildren(false);
        ViewCompat.J1(this, androidComposeViewAccessibilityDelegateCompat0);
        Function1 function10 = ViewRootForTest.s0.a();
        if(function10 != null) {
            function10.invoke(this);
        }
        this.getRoot().G(this);
        if(v >= 29) {
            AndroidComposeViewForceDarkModeQ.a.a(this);
        }
        this.k9 = new PointerIconService() {
            @Override  // androidx.compose.ui.input.pointer.PointerIconService
            @l
            public PointerIcon a() {
                PointerIcon pointerIcon0 = this.a.j9;
                return pointerIcon0 == null ? PointerIcon.a.b() : pointerIcon0;
            }

            @Override  // androidx.compose.ui.input.pointer.PointerIconService
            public void b(@l PointerIcon pointerIcon0) {
                L.p(pointerIcon0, "value");
                this.a.j9 = pointerIcon0;
            }
        };

        final class androidx.compose.ui.platform.AndroidComposeView.configurationChangeObserver.1 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeView.configurationChangeObserver.1 e;

            static {
                androidx.compose.ui.platform.AndroidComposeView.configurationChangeObserver.1.e = new androidx.compose.ui.platform.AndroidComposeView.configurationChangeObserver.1();
            }

            androidx.compose.ui.platform.AndroidComposeView.configurationChangeObserver.1() {
                super(1);
            }

            public final void a(@l Configuration configuration0) {
                L.p(configuration0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Configuration)object0));
                return S0.a;
            }
        }


        final class androidx.compose.ui.platform.AndroidComposeView.rotaryInputModifier.1 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeView.rotaryInputModifier.1 e;

            static {
                androidx.compose.ui.platform.AndroidComposeView.rotaryInputModifier.1.e = new androidx.compose.ui.platform.AndroidComposeView.rotaryInputModifier.1();
            }

            androidx.compose.ui.platform.AndroidComposeView.rotaryInputModifier.1() {
                super(1);
            }

            @l
            public final Boolean a(@l RotaryScrollEvent rotaryScrollEvent0) {
                L.p(rotaryScrollEvent0, "it");
                return false;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((RotaryScrollEvent)object0));
            }
        }


        final class androidx.compose.ui.platform.AndroidComposeView.semanticsModifier.1 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeView.semanticsModifier.1 e;

            static {
                androidx.compose.ui.platform.AndroidComposeView.semanticsModifier.1.e = new androidx.compose.ui.platform.AndroidComposeView.semanticsModifier.1();
            }

            androidx.compose.ui.platform.AndroidComposeView.semanticsModifier.1() {
                super(1);
            }

            public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                L.p(semanticsPropertyReceiver0, "$this$$receiver");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((SemanticsPropertyReceiver)object0));
                return S0.a;
            }
        }

    }

    public final void P(@l AndroidViewHolder androidViewHolder0, @l LayoutNode layoutNode0) {
        L.p(androidViewHolder0, "view");
        L.p(layoutNode0, "layoutNode");
        this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder0, layoutNode0);
        this.getAndroidViewsHandler$ui_release().addView(androidViewHolder0);
        this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode0, androidViewHolder0);
        ViewCompat.b2(androidViewHolder0, 1);
        ViewCompat.J1(androidViewHolder0, new AccessibilityDelegateCompat() {
            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(@l View view0, @l AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                L.p(view0, "host");
                L.p(accessibilityNodeInfoCompat0, "info");
                super.g(view0, accessibilityNodeInfoCompat0);
                LayoutNode layoutNode0 = SemanticsNodeKt.e(this, androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1.onInitializeAccessibilityNodeInfo.parentId.1.e);
                Integer integer0 = layoutNode0 == null ? null : layoutNode0.w();
                if(integer0 == null || ((int)integer0) == this.getSemanticsOwner().b().l()) {
                    integer0 = -1;
                }
                accessibilityNodeInfoCompat0.S1(this.f, ((int)integer0));

                final class androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1.onInitializeAccessibilityNodeInfo.parentId.1 extends N implements Function1 {
                    public static final androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1.onInitializeAccessibilityNodeInfo.parentId.1 e;

                    static {
                        androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1.onInitializeAccessibilityNodeInfo.parentId.1.e = new androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1.onInitializeAccessibilityNodeInfo.parentId.1();
                    }

                    androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1.onInitializeAccessibilityNodeInfo.parentId.1() {
                        super(1);
                    }

                    @l
                    public final Boolean a(@l LayoutNode layoutNode0) {
                        L.p(layoutNode0, "it");
                        return SemanticsNodeKt.j(layoutNode0) == null ? false : true;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((LayoutNode)object0));
                    }
                }

            }
        });
    }

    private final boolean Q() [...] // 潜在的解密器

    @m
    public final Object R(@l d d0) {
        Object object0 = this.n.z(d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private final boolean S(LayoutNode layoutNode0) {
        if(!this.E) {
            LayoutNode layoutNode1 = layoutNode0.C0();
            return layoutNode1 != null && !layoutNode1.d0();
        }
        return true;
    }

    private final void T(ViewGroup viewGroup0) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0 instanceof AndroidComposeView) {
                ((AndroidComposeView)view0).o();
            }
            else if(view0 instanceof ViewGroup) {
                this.T(((ViewGroup)view0));
            }
        }
    }

    private final V U(int v) {
        int v1 = View.MeasureSpec.getMode(v);
        int v2 = View.MeasureSpec.getSize(v);
        switch(v1) {
            case 0x80000000: {
                return r0.a(0, v2);
            }
            case 0: {
                return r0.a(0, 0x7FFFFFFF);
            }
            default: {
                if(v1 != 0x40000000) {
                    throw new IllegalStateException();
                }
                return r0.a(v2, v2);
            }
        }
    }

    public final void V(@l AndroidViewHolder androidViewHolder0, @l Canvas canvas0) {
        L.p(androidViewHolder0, "view");
        L.p(canvas0, "canvas");
        this.getAndroidViewsHandler$ui_release().a(androidViewHolder0, canvas0);
    }

    private final View W(int v, View view0) {
        if(Build.VERSION.SDK_INT < 29) {
            Method method0 = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            method0.setAccessible(true);
            if(L.g(method0.invoke(view0, null), v)) {
                return view0;
            }
            if(view0 instanceof ViewGroup) {
                int v1 = ((ViewGroup)view0).getChildCount();
                for(int v2 = 0; v2 < v1; ++v2) {
                    View view1 = ((ViewGroup)view0).getChildAt(v2);
                    L.o(view1, "currentView.getChildAt(i)");
                    View view2 = this.W(v, view1);
                    if(view2 != null) {
                        return view2;
                    }
                }
            }
        }
        return null;
    }

    private final int X(Configuration configuration0) {
        return Build.VERSION.SDK_INT < 0x1F ? 0 : configuration0.fontWeightAdjustment;
    }

    // 检测为 Lambda 实现
    private static final void Y(AndroidComposeView androidComposeView0) [...]

    private final int Z(MotionEvent motionEvent0) {
        int v3;
        this.removeCallbacks(this.d9);
        try {
            this.k0(motionEvent0);
            boolean z = true;
            this.M = true;
            this.a(false);
            this.j9 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int v2 = motionEvent0.getActionMasked();
                MotionEvent motionEvent1 = this.Z8;
                boolean z1 = motionEvent1 != null && motionEvent1.getToolType(0) == 3;
                if(motionEvent1 != null && this.b0(motionEvent0, motionEvent1)) {
                    if(this.f0(motionEvent1)) {
                        this.t.d();
                    }
                    else if(motionEvent1.getActionMasked() != 10 && z1) {
                        AndroidComposeView.v0(this, motionEvent1, 10, motionEvent1.getEventTime(), false, 8, null);
                    }
                }
                if(motionEvent0.getToolType(0) != 3) {
                    z = false;
                }
                if(!z1 && z && (v2 != 3 && v2 != 9) && this.g0(motionEvent0)) {
                    AndroidComposeView.v0(this, motionEvent0, 9, motionEvent0.getEventTime(), false, 8, null);
                }
                if(motionEvent1 != null) {
                    motionEvent1.recycle();
                }
                this.Z8 = MotionEvent.obtainNoHistory(motionEvent0);
                v3 = this.t0(motionEvent0);
            }
            finally {
                Trace.endSection();
            }
            if(Build.VERSION.SDK_INT >= 24) {
                AndroidComposeViewVerificationHelperMethodsN.a.a(this, this.j9);
            }
            return v3;
        }
        finally {
            this.M = false;
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void a(boolean z) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            if(this.F.n((z ? this.g9 : null))) {
                this.requestLayout();
            }
            MeasureAndLayoutDelegate.e(this.F, false, 1, null);
        }
        finally {
            Trace.endSection();
        }
    }

    private final boolean a0(MotionEvent motionEvent0) {
        android.view.ViewConfiguration viewConfiguration0 = android.view.ViewConfiguration.get(this.getContext());
        float f = motionEvent0.getAxisValue(26);
        return this.getFocusOwner().e(new RotaryScrollEvent(ViewConfigurationCompat.k(viewConfiguration0, this.getContext()) * -f, -f * ViewConfigurationCompat.f(viewConfiguration0, this.getContext()), motionEvent0.getEventTime()));
    }

    @Override  // android.view.View
    public void autofill(@l SparseArray sparseArray0) {
        L.p(sparseArray0, "values");
        AndroidAutofill androidAutofill0 = this.v;
        if(androidAutofill0 != null) {
            AndroidAutofill_androidKt.a(androidAutofill0, sparseArray0);
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void b(@l LayoutNode layoutNode0, boolean z, boolean z1) {
        L.p(layoutNode0, "layoutNode");
        if(z) {
            if(this.F.z(layoutNode0, z1)) {
                this.p0(layoutNode0);
            }
        }
        else if(this.F.E(layoutNode0, z1)) {
            this.p0(layoutNode0);
        }
    }

    private final boolean b0(MotionEvent motionEvent0, MotionEvent motionEvent1) {
        return motionEvent1.getSource() != motionEvent0.getSource() || motionEvent1.getToolType(0) != motionEvent0.getToolType(0);
    }

    @Override  // androidx.compose.ui.node.Owner
    public void c(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "layoutNode");
        this.F.B(layoutNode0);
        AndroidComposeView.q0(this, null, 1, null);
    }

    private final void c0(LayoutNode layoutNode0) {
        layoutNode0.S0();
        MutableVector mutableVector0 = layoutNode0.I0();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                this.c0(((LayoutNode)arr_object[v1]));
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    @Override  // android.view.View
    public boolean canScrollHorizontally(int v) {
        return this.n.A(false, v, this.a);
    }

    @Override  // android.view.View
    public boolean canScrollVertically(int v) {
        return this.n.A(true, v, this.a);
    }

    @Override  // androidx.compose.ui.node.Owner
    public void d(@l a a0) {
        L.p(a0, "listener");
        if(!this.c9.m(a0)) {
            this.c9.b(a0);
        }
    }

    private final void d0(LayoutNode layoutNode0) {
        int v = 0;
        MeasureAndLayoutDelegate.F(this.F, layoutNode0, false, 2, null);
        MutableVector mutableVector0 = layoutNode0.I0();
        int v1 = mutableVector0.J();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.F();
            while(true) {
                this.d0(((LayoutNode)arr_object[v]));
                ++v;
                if(v >= v1) {
                    break;
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        if(!this.isAttachedToWindow()) {
            this.c0(this.getRoot());
        }
        e.e(this, false, 1, null);
        this.r = true;
        this.j.b().K(canvas0);
        this.getRoot().Q(this.j.b());
        this.j.b().K(this.j.b().I());
        if(!this.p.isEmpty()) {
            int v = this.p.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((OwnedLayer)this.p.get(v1)).k();
            }
        }
        this.p.clear();
        this.r = false;
        List list0 = this.q;
        if(list0 != null) {
            L.m(list0);
            this.p.addAll(list0);
            list0.clear();
        }
    }

    @Override  // android.view.View
    public boolean dispatchGenericMotionEvent(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "event");
        if(motionEvent0.getActionMasked() == 8) {
            if(motionEvent0.isFromSource(0x400000)) {
                return this.a0(motionEvent0);
            }
            return this.e0(motionEvent0) || !this.isAttachedToWindow() ? super.dispatchGenericMotionEvent(motionEvent0) : ProcessResult.f(this.Z(motionEvent0));
        }
        return super.dispatchGenericMotionEvent(motionEvent0);
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchHoverEvent(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "event");
        if(this.f9) {
            this.removeCallbacks(this.e9);
            this.e9.run();
        }
        if(!this.e0(motionEvent0) && this.isAttachedToWindow()) {
            if(motionEvent0.isFromSource(0x1002) && motionEvent0.getToolType(0) == 1) {
                return this.n.H(motionEvent0);
            }
            switch(motionEvent0.getActionMasked()) {
                case 7: {
                    return this.h0(motionEvent0) ? ProcessResult.f(this.Z(motionEvent0)) : false;
                }
                case 10: {
                    if(this.g0(motionEvent0)) {
                        if(motionEvent0.getToolType(0) != 3) {
                            MotionEvent motionEvent1 = this.Z8;
                            if(motionEvent1 != null) {
                                motionEvent1.recycle();
                            }
                            this.Z8 = MotionEvent.obtainNoHistory(motionEvent0);
                            this.f9 = true;
                            this.post(this.e9);
                            return false;
                        }
                        return motionEvent0.getButtonState() == 0 ? ProcessResult.f(this.Z(motionEvent0)) : false;
                    }
                    return ProcessResult.f(this.Z(motionEvent0));
                }
                default: {
                    return ProcessResult.f(this.Z(motionEvent0));
                }
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        if(this.isFocused()) {
            int v = PointerKeyboardModifiers.b(keyEvent0.getMetaState());
            this.g.e(v);
            return this.k(androidx.compose.ui.input.key.KeyEvent.b(keyEvent0));
        }
        return super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "motionEvent");
        if(this.f9) {
            this.removeCallbacks(this.e9);
            MotionEvent motionEvent1 = this.Z8;
            L.m(motionEvent1);
            if(motionEvent0.getActionMasked() != 0 || this.b0(motionEvent0, motionEvent1)) {
                this.e9.run();
            }
            else {
                this.f9 = false;
            }
        }
        if(this.e0(motionEvent0) || !this.isAttachedToWindow() || motionEvent0.getActionMasked() == 2 && !this.h0(motionEvent0)) {
            return false;
        }
        int v = this.Z(motionEvent0);
        if(ProcessResult.e(v)) {
            this.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return ProcessResult.f(v);
    }

    @Override  // androidx.compose.ui.node.Owner
    public void e(@l OnLayoutCompletedListener owner$OnLayoutCompletedListener0) {
        L.p(owner$OnLayoutCompletedListener0, "listener");
        this.F.u(owner$OnLayoutCompletedListener0);
        AndroidComposeView.q0(this, null, 1, null);
    }

    private final boolean e0(MotionEvent motionEvent0) {
        float f = motionEvent0.getX();
        if(!Float.isInfinite(f) && !Float.isNaN(f)) {
            float f1 = motionEvent0.getY();
            if(!Float.isInfinite(f1) && !Float.isNaN(f1)) {
                float f2 = motionEvent0.getRawX();
                if(!Float.isInfinite(f2) && !Float.isNaN(f2)) {
                    float f3 = motionEvent0.getRawY();
                    return Float.isInfinite(f3) || Float.isNaN(f3);
                }
            }
        }
        return true;
    }

    @Override  // androidx.compose.ui.node.RootForTest
    public void f() {
        e.e(this, false, 1, null);
    }

    private final boolean f0(MotionEvent motionEvent0) {
        if(motionEvent0.getButtonState() != 0) {
            return true;
        }
        switch(motionEvent0.getActionMasked()) {
            case 0: 
            case 2: 
            case 6: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @m
    public final View findViewByAccessibilityIdTraversal(int v) {
        try {
            if(Build.VERSION.SDK_INT < 29) {
                return this.W(v, this);
            }
            Method method0 = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            method0.setAccessible(true);
            Object object0 = method0.invoke(this, v);
            return object0 instanceof View ? ((View)object0) : null;
        }
        catch(NoSuchMethodException unused_ex) {
        }
        return null;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForTest
    public boolean g() {
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = this.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners0 != null) {
            LifecycleOwner lifecycleOwner0 = androidComposeView$ViewTreeOwners0.a();
            if(lifecycleOwner0 != null) {
                Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
                return lifecycle0 == null ? null == State.e : lifecycle0.b() == State.e;
            }
        }
        return null == State.e;
    }

    private final boolean g0(MotionEvent motionEvent0) {
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        return 0.0f <= f && f <= ((float)this.getWidth()) && 0.0f <= f1 && f1 <= ((float)this.getHeight());
    }

    @Override  // androidx.compose.ui.node.Owner
    public AccessibilityManager getAccessibilityManager() {
        return this.getAccessibilityManager();
    }

    @l
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.y;
    }

    @l
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if(this.B == null) {
            Context context0 = this.getContext();
            L.o(context0, "context");
            AndroidViewsHandler androidViewsHandler0 = new AndroidViewsHandler(context0);
            this.B = androidViewsHandler0;
            this.addView(androidViewsHandler0);
        }
        AndroidViewsHandler androidViewsHandler1 = this.B;
        L.m(androidViewsHandler1);
        return androidViewsHandler1;
    }

    @Override  // androidx.compose.ui.node.Owner
    @m
    public Autofill getAutofill() {
        return this.v;
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public AutofillTree getAutofillTree() {
        return this.o;
    }

    @l
    public AndroidClipboardManager getClipboardManager() {
        return this.x;
    }

    @Override  // androidx.compose.ui.node.Owner
    public ClipboardManager getClipboardManager() {
        return this.getClipboardManager();
    }

    @l
    public final Function1 getConfigurationChangeObserver() {
        return this.u;
    }

    @Override  // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @l
    public Density getDensity() {
        return this.d;
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public FocusOwner getFocusOwner() {
        return this.f;
    }

    @Override  // android.view.View
    public void getFocusedRect(@l Rect rect0) {
        S0 s00;
        L.p(rect0, "rect");
        androidx.compose.ui.geometry.Rect rect1 = this.getFocusOwner().k();
        if(rect1 == null) {
            s00 = null;
        }
        else {
            rect0.left = kotlin.math.b.L0(rect1.t());
            rect0.top = kotlin.math.b.L0(rect1.B());
            rect0.right = kotlin.math.b.L0(rect1.x());
            rect0.bottom = kotlin.math.b.L0(rect1.j());
            s00 = S0.a;
        }
        if(s00 == null) {
            super.getFocusedRect(rect0);
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public Resolver getFontFamilyResolver() {
        return (Resolver)this.S8.getValue();
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public ResourceLoader getFontLoader() {
        return this.R8;
    }

    @k(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @c0(expression = "fontFamilyResolver", imports = {}))
    public static void getFontLoader$annotations() {
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public HapticFeedback getHapticFeedBack() {
        return this.V8;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.F.k();
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public InputModeManager getInputModeManager() {
        return this.W8;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.L;
    }

    @VisibleForTesting
    public static void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection)this.U8.getValue();
    }

    @Override  // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.F.m();
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public ModifierLocalManager getModifierLocalManager() {
        return this.X8;
    }

    @Override  // androidx.compose.ui.node.Owner
    public PlatformTextInputPluginRegistry getPlatformTextInputPluginRegistry() {
        return this.getPlatformTextInputPluginRegistry();
    }

    @l
    public PlatformTextInputPluginRegistryImpl getPlatformTextInputPluginRegistry() {
        return this.P8;
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public PointerIconService getPointerIconService() {
        return this.k9;
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public LayoutNode getRoot() {
        return this.k;
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public RootForTest getRootForTest() {
        return this.l;
    }

    @Override  // androidx.compose.ui.node.RootForTest
    @l
    public SemanticsOwner getSemanticsOwner() {
        return this.m;
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.c;
    }

    @Override  // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.A;
    }

    public static void getShowLayoutBounds$annotations() {
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.z;
    }

    @Override  // androidx.compose.ui.node.RootForTest
    @m
    public TextInputForTests getTextInputForTests() {
        PlatformTextInputAdapter platformTextInputAdapter0 = this.getPlatformTextInputPluginRegistry().g();
        return platformTextInputAdapter0 == null ? null : platformTextInputAdapter0.a();
    }

    @Override  // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @l
    public TextInputService getTextInputService() {
        return this.Q8;
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public TextToolbar getTextToolbar() {
        return this.Y8;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForTest
    @l
    public View getView() [...] // Inlined contents

    @Override  // androidx.compose.ui.node.Owner
    @l
    public ViewConfiguration getViewConfiguration() {
        return this.G;
    }

    @m
    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners)this.P.getValue();
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public WindowInfo getWindowInfo() {
        return this.g;
    }

    @Override  // androidx.compose.ui.input.pointer.PositionCalculator
    public long h(long v) {
        this.j0();
        long v1 = OffsetKt.a(Offset.p(v) - Offset.p(this.N), Offset.r(v) - Offset.r(this.N));
        return Matrix.j(this.K, v1);
    }

    private final boolean h0(MotionEvent motionEvent0) {
        if(motionEvent0.getPointerCount() != 1) {
            return true;
        }
        MotionEvent motionEvent1 = this.Z8;
        return motionEvent1 == null || motionEvent0.getRawX() != motionEvent1.getRawX() || motionEvent0.getRawY() != motionEvent1.getRawY();
    }

    @Override  // androidx.compose.ui.node.Owner
    @l
    public OwnedLayer i(@l Function1 function10, @l a a0) {
        L.p(function10, "drawBlock");
        L.p(a0, "invalidateParentLayer");
        OwnedLayer ownedLayer0 = (OwnedLayer)this.b9.c();
        if(ownedLayer0 != null) {
            ownedLayer0.c(function10, a0);
            return ownedLayer0;
        }
        if(this.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.O) {
            try {
                return new RenderNodeLayer(this, function10, a0);
            }
            catch(Throwable unused_ex) {
                this.O = false;
            }
        }
        if(this.C == null) {
            ViewLayer.o.e(new View(this.getContext()));
            Context context0 = this.getContext();
            L.o(context0, "context");
            DrawChildContainer drawChildContainer0 = new ViewLayerContainer(context0);
            this.C = drawChildContainer0;
            this.addView(drawChildContainer0);
        }
        DrawChildContainer drawChildContainer1 = this.C;
        L.m(drawChildContainer1);
        return new ViewLayer(this, drawChildContainer1, function10, a0);
    }

    public final void i0(@l OwnedLayer ownedLayer0, boolean z) {
        L.p(ownedLayer0, "layer");
        if(z) {
            if(!this.r) {
                this.p.add(ownedLayer0);
                return;
            }
            List list1 = this.q;
            if(list1 == null) {
                list1 = new ArrayList();
                this.q = list1;
            }
            list1.add(ownedLayer0);
        }
        else if(!this.r) {
            this.p.remove(ownedLayer0);
            List list0 = this.q;
            if(list0 != null) {
                list0.remove(ownedLayer0);
            }
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void j(@l LayoutNode layoutNode0, long v) {
        L.p(layoutNode0, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.F.p(layoutNode0, v);
            MeasureAndLayoutDelegate.e(this.F, false, 1, null);
        }
        finally {
            Trace.endSection();
        }
    }

    private final void j0() {
        if(!this.M) {
            long v = AnimationUtils.currentAnimationTimeMillis();
            if(v != this.L) {
                this.L = v;
                this.l0();
                ViewParent viewParent0 = this.getParent();
                View view0 = this;
                while(viewParent0 instanceof ViewGroup) {
                    view0 = (View)viewParent0;
                    viewParent0 = ((ViewGroup)view0).getParent();
                }
                view0.getLocationOnScreen(this.I);
                float f = (float)this.I[0];
                float f1 = (float)this.I[1];
                view0.getLocationInWindow(this.I);
                this.N = OffsetKt.a(f - ((float)this.I[0]), f1 - ((float)this.I[1]));
            }
        }
    }

    @Override  // androidx.compose.ui.node.RootForTest
    public boolean k(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "keyEvent");
        return this.getFocusOwner().f(keyEvent0);
    }

    private final void k0(MotionEvent motionEvent0) {
        this.L = AnimationUtils.currentAnimationTimeMillis();
        this.l0();
        long v = OffsetKt.a(motionEvent0.getX(), motionEvent0.getY());
        long v1 = Matrix.j(this.J, v);
        this.N = OffsetKt.a(motionEvent0.getRawX() - Offset.p(v1), motionEvent0.getRawY() - Offset.r(v1));
    }

    @Override  // androidx.compose.ui.node.Owner
    public long l(long v) {
        this.j0();
        return Matrix.j(this.K, v);
    }

    private final void l0() {
        this.h9.a(this, this.J);
        InvertMatrixKt.a(this.J, this.K);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void m(@l LifecycleOwner lifecycleOwner0) {
        L.p(lifecycleOwner0, "owner");
        this.setShowLayoutBounds(AndroidComposeView.l9.b());
    }

    public final boolean m0(@l OwnedLayer ownedLayer0) {
        L.p(ownedLayer0, "layer");
        boolean z = this.C == null || Build.VERSION.SDK_INT >= 23 || this.b9.b() < 10;
        if(z) {
            this.b9.d(ownedLayer0);
        }
        return z;
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void n(LifecycleOwner lifecycleOwner0) {
        c.c(this, lifecycleOwner0);
    }

    public final void n0(@l AndroidViewHolder androidViewHolder0) {
        L.p(androidViewHolder0, "view");
        this.d(new a(androidViewHolder0) {
            final AndroidComposeView e;
            final AndroidViewHolder f;

            {
                this.e = androidComposeView0;
                this.f = androidViewHolder0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.getAndroidViewsHandler$ui_release().removeViewInLayout(this.f);
                HashMap hashMap0 = this.e.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                Object object0 = this.e.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.f);
                v0.k(hashMap0).remove(object0);
                ViewCompat.b2(this.f, 0);
            }
        });
    }

    @Override  // androidx.compose.ui.node.Owner
    public void o() {
        if(this.w) {
            this.getSnapshotObserver().b();
            this.w = false;
        }
        AndroidViewsHandler androidViewsHandler0 = this.B;
        if(androidViewsHandler0 != null) {
            this.T(androidViewsHandler0);
        }
        while(this.c9.O()) {
            int v = this.c9.J();
            for(int v1 = 0; v1 < v; ++v1) {
                a a0 = (a)this.c9.F()[v1];
                this.c9.i0(v1, null);
                if(a0 != null) {
                    a0.invoke();
                }
            }
            this.c9.f0(0, v);
        }
    }

    public final void o0() {
        this.w = true;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d0(this.getRoot());
        this.c0(this.getRoot());
        this.getSnapshotObserver().j();
        AndroidAutofill androidAutofill0 = this.v;
        if(androidAutofill0 != null) {
            AutofillCallback.a.a(androidAutofill0);
        }
        LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.a(this);
        SavedStateRegistryOwner savedStateRegistryOwner0 = ViewTreeSavedStateRegistryOwner.a(this);
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = this.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners0 == null || lifecycleOwner0 != null && savedStateRegistryOwner0 != null && (lifecycleOwner0 != androidComposeView$ViewTreeOwners0.a() || savedStateRegistryOwner0 != androidComposeView$ViewTreeOwners0.a())) {
            if(lifecycleOwner0 == null) {
                throw new IllegalStateException("Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!");
            }
            if(savedStateRegistryOwner0 == null) {
                throw new IllegalStateException("Composed into the View which doesn\'t propagateViewTreeSavedStateRegistryOwner!");
            }
            if(androidComposeView$ViewTreeOwners0 != null) {
                LifecycleOwner lifecycleOwner1 = androidComposeView$ViewTreeOwners0.a();
                if(lifecycleOwner1 != null) {
                    Lifecycle lifecycle0 = lifecycleOwner1.getLifecycle();
                    if(lifecycle0 != null) {
                        lifecycle0.d(this);
                    }
                }
            }
            lifecycleOwner0.getLifecycle().a(this);
            ViewTreeOwners androidComposeView$ViewTreeOwners1 = new ViewTreeOwners(lifecycleOwner0, savedStateRegistryOwner0);
            this.setViewTreeOwners(androidComposeView$ViewTreeOwners1);
            Function1 function10 = this.Q;
            if(function10 != null) {
                function10.invoke(androidComposeView$ViewTreeOwners1);
            }
            this.Q = null;
        }
        int v = this.isInTouchMode() ? 1 : 2;
        this.W8.c(v);
        ViewTreeOwners androidComposeView$ViewTreeOwners2 = this.getViewTreeOwners();
        L.m(androidComposeView$ViewTreeOwners2);
        androidComposeView$ViewTreeOwners2.a().getLifecycle().a(this);
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.M8);
        this.getViewTreeObserver().addOnScrollChangedListener(this.N8);
        this.getViewTreeObserver().addOnTouchModeChangeListener(this.O8);
    }

    @Override  // android.view.View
    public boolean onCheckIsTextEditor() {
        return this.getPlatformTextInputPluginRegistry().g() != null;
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(@l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        Context context0 = this.getContext();
        L.o(context0, "context");
        this.d = AndroidDensity_androidKt.a(context0);
        if(this.X(configuration0) != this.T8) {
            this.T8 = this.X(configuration0);
            Context context1 = this.getContext();
            L.o(context1, "context");
            this.setFontFamilyResolver(FontFamilyResolver_androidKt.a(context1));
        }
        this.u.invoke(configuration0);
    }

    @Override  // android.view.View
    @m
    public InputConnection onCreateInputConnection(@l EditorInfo editorInfo0) {
        L.p(editorInfo0, "outAttrs");
        PlatformTextInputAdapter platformTextInputAdapter0 = this.getPlatformTextInputPluginRegistry().g();
        return platformTextInputAdapter0 == null ? null : platformTextInputAdapter0.c(editorInfo0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner0) {
        c.b(this, lifecycleOwner0);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getSnapshotObserver().k();
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = this.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners0 != null) {
            LifecycleOwner lifecycleOwner0 = androidComposeView$ViewTreeOwners0.a();
            if(lifecycleOwner0 != null) {
                Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
                if(lifecycle0 != null) {
                    lifecycle0.d(this);
                }
            }
        }
        AndroidAutofill androidAutofill0 = this.v;
        if(androidAutofill0 != null) {
            AutofillCallback.a.b(androidAutofill0);
        }
        this.getViewTreeObserver().removeOnGlobalLayoutListener(this.M8);
        this.getViewTreeObserver().removeOnScrollChangedListener(this.N8);
        this.getViewTreeObserver().removeOnTouchModeChangeListener(this.O8);
    }

    @Override  // android.view.View
    protected void onDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
    }

    @Override  // android.view.View
    protected void onFocusChanged(boolean z, int v, @m Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        Log.d("Compose Focus", "Owner FocusChanged(" + z + ')');
        if(z) {
            this.getFocusOwner().c();
            return;
        }
        this.getFocusOwner().l();
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.F.n(this.g9);
        this.D = null;
        this.x0();
        if(this.B != null) {
            this.getAndroidViewsHandler$ui_release().layout(0, 0, v2 - v, v3 - v1);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if(!this.isAttachedToWindow()) {
                this.d0(this.getRoot());
            }
            V v3 = this.U(v);
            V v4 = this.U(v1);
            long v5 = ConstraintsKt.a(((Number)v3.a()).intValue(), ((Number)v3.b()).intValue(), ((Number)v4.a()).intValue(), ((Number)v4.b()).intValue());
            Constraints constraints0 = this.D;
            boolean z = false;
            if(constraints0 == null) {
                this.D = Constraints.b(v5);
                this.E = false;
            }
            else {
                if(constraints0 != null) {
                    z = Constraints.g(constraints0.x(), v5);
                }
                if(!z) {
                    this.E = true;
                }
            }
            this.F.G(v5);
            this.F.q();
            this.setMeasuredDimension(this.getRoot().getWidth(), this.getRoot().getHeight());
            if(this.B != null) {
                this.getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(this.getRoot().getWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.getRoot().getHeight(), 0x40000000));
            }
        }
        finally {
            Trace.endSection();
        }
    }

    @Override  // android.view.View
    public void onProvideAutofillVirtualStructure(@m ViewStructure viewStructure0, int v) {
        if(viewStructure0 != null) {
            AndroidAutofill androidAutofill0 = this.v;
            if(androidAutofill0 != null) {
                AndroidAutofill_androidKt.b(androidAutofill0, viewStructure0);
            }
        }
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        if(this.b) {
            LayoutDirection layoutDirection0 = AndroidComposeView_androidKt.g(v);
            this.setLayoutDirection(layoutDirection0);
            this.getFocusOwner().a(layoutDirection0);
        }
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner0) {
        c.e(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner0) {
        c.f(this, lifecycleOwner0);
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        this.g.f(z);
        this.i9 = true;
        super.onWindowFocusChanged(z);
        if(z) {
            boolean z1 = AndroidComposeView.l9.b();
            if(this.getShowLayoutBounds() != z1) {
                this.setShowLayoutBounds(z1);
                this.x();
            }
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void p(@l LayoutNode layoutNode0, boolean z, boolean z1) {
        L.p(layoutNode0, "layoutNode");
        if(z) {
            if(this.F.x(layoutNode0, z1)) {
                AndroidComposeView.q0(this, null, 1, null);
            }
        }
        else if(this.F.C(layoutNode0, z1)) {
            AndroidComposeView.q0(this, null, 1, null);
        }
    }

    private final void p0(LayoutNode layoutNode0) {
        if(!this.isLayoutRequested() && this.isAttachedToWindow()) {
            if(layoutNode0 != null) {
                while(layoutNode0 != null && layoutNode0.u0() == UsageByParent.a && this.S(layoutNode0)) {
                    layoutNode0 = layoutNode0.C0();
                }
                if(layoutNode0 == this.getRoot()) {
                    this.requestLayout();
                    return;
                }
            }
            if(this.getWidth() != 0 && this.getHeight() != 0) {
                this.invalidate();
                return;
            }
            this.requestLayout();
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public long q(long v) {
        this.j0();
        return Matrix.j(this.J, v);
    }

    static void q0(AndroidComposeView androidComposeView0, LayoutNode layoutNode0, int v, Object object0) {
        if((v & 1) != 0) {
            layoutNode0 = null;
        }
        androidComposeView0.p0(layoutNode0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void r(LifecycleOwner lifecycleOwner0) {
        c.a(this, lifecycleOwner0);
    }

    // 检测为 Lambda 实现
    private static final void r0(AndroidComposeView androidComposeView0) [...]

    @Override  // androidx.compose.ui.node.Owner
    public void s(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "layoutNode");
        this.n.h0(layoutNode0);
    }

    // 检测为 Lambda 实现
    private static final void s0(AndroidComposeView androidComposeView0) [...]

    public final void setConfigurationChangeObserver(@l Function1 function10) {
        L.p(function10, "<set-?>");
        this.u = function10;
    }

    private void setFontFamilyResolver(Resolver fontFamily$Resolver0) {
        this.S8.setValue(fontFamily$Resolver0);
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long v) {
        this.L = v;
    }

    private void setLayoutDirection(LayoutDirection layoutDirection0) {
        this.U8.setValue(layoutDirection0);
    }

    public final void setOnViewTreeOwnersAvailable(@l Function1 function10) {
        L.p(function10, "callback");
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = this.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners0 != null) {
            function10.invoke(androidComposeView$ViewTreeOwners0);
        }
        if(!this.isAttachedToWindow()) {
            this.Q = function10;
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.A = z;
    }

    private final void setViewTreeOwners(ViewTreeOwners androidComposeView$ViewTreeOwners0) {
        this.P.setValue(androidComposeView$ViewTreeOwners0);
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override  // androidx.compose.ui.node.Owner
    public void t(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "layoutNode");
        this.F.h(layoutNode0);
    }

    private final int t0(MotionEvent motionEvent0) {
        if(this.i9) {
            this.i9 = false;
            int v = PointerKeyboardModifiers.b(motionEvent0.getMetaState());
            this.g.e(v);
        }
        PointerInputEvent pointerInputEvent0 = this.s.c(motionEvent0, this);
        if(pointerInputEvent0 != null) {
            Object object0 = null;
            List list0 = pointerInputEvent0.b();
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                Object object1 = listIterator0.previous();
                if(((PointerInputEventData)object1).m()) {
                    object0 = object1;
                    break;
                }
            }
            if(((PointerInputEventData)object0) != null) {
                this.a = ((PointerInputEventData)object0).q();
            }
            boolean z = this.g0(motionEvent0);
            int v1 = this.t.b(pointerInputEvent0, this, z);
            switch(motionEvent0.getActionMasked()) {
                case 0: 
                case 5: {
                    if(!ProcessResult.f(v1)) {
                        int v2 = motionEvent0.getPointerId(motionEvent0.getActionIndex());
                        this.s.e(v2);
                        return v1;
                    }
                    return v1;
                }
                default: {
                    return v1;
                }
            }
        }
        this.t.d();
        return 0;
    }

    // 去混淆评级： 低(28)
    @Override  // androidx.compose.ui.node.Owner
    @m
    public FocusDirection u(@l KeyEvent keyEvent0) {
        boolean z = true;
        L.p(keyEvent0, "keyEvent");
        long v = KeyEvent_androidKt.a(keyEvent0);
        if(Key.E4(v, 0x3D00000000L)) {
            return KeyEvent_androidKt.g(keyEvent0) ? FocusDirection.k(2) : FocusDirection.k(1);
        }
        if(Key.E4(v, 0x1600000000L)) {
            return FocusDirection.k(4);
        }
        if(Key.E4(v, 0x1500000000L)) {
            return FocusDirection.k(3);
        }
        if(Key.E4(v, 0x1300000000L)) {
            return FocusDirection.k(5);
        }
        if(Key.E4(v, 0x1400000000L)) {
            return FocusDirection.k(6);
        }
        if(((Key.E4(v, 0x1700000000L) ? true : Key.E4(v, 0x4200000000L)) ? true : Key.E4(v, 0xA000000000L))) {
            return FocusDirection.k(7);
        }
        if(!Key.E4(v, 0x400000000L)) {
            z = Key.E4(v, 0x6F00000000L);
        }
        return z ? FocusDirection.k(8) : null;
    }

    private final void u0(MotionEvent motionEvent0, int v, long v1, boolean z) {
        int v2 = -1;
        switch(motionEvent0.getActionMasked()) {
            case 1: {
                if(v != 9 && v != 10) {
                    v2 = 0;
                }
                break;
            }
            case 6: {
                v2 = motionEvent0.getActionIndex();
            }
        }
        int v3 = motionEvent0.getPointerCount() - (v2 < 0 ? 0 : 1);
        if(v3 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] arr_motionEvent$PointerProperties = new MotionEvent.PointerProperties[v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            arr_motionEvent$PointerProperties[v4] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] arr_motionEvent$PointerCoords = new MotionEvent.PointerCoords[v3];
        for(int v5 = 0; v5 < v3; ++v5) {
            arr_motionEvent$PointerCoords[v5] = new MotionEvent.PointerCoords();
        }
        for(int v6 = 0; v6 < v3; ++v6) {
            int v7 = (v2 < 0 || v6 < v2 ? 0 : 1) + v6;
            motionEvent0.getPointerProperties(v7, arr_motionEvent$PointerProperties[v6]);
            MotionEvent.PointerCoords motionEvent$PointerCoords0 = arr_motionEvent$PointerCoords[v6];
            motionEvent0.getPointerCoords(v7, motionEvent$PointerCoords0);
            long v8 = this.y(OffsetKt.a(motionEvent$PointerCoords0.x, motionEvent$PointerCoords0.y));
            motionEvent$PointerCoords0.x = Offset.p(v8);
            motionEvent$PointerCoords0.y = Offset.r(v8);
        }
        int v9 = z ? 0 : motionEvent0.getButtonState();
        MotionEvent motionEvent1 = MotionEvent.obtain((motionEvent0.getDownTime() == motionEvent0.getEventTime() ? v1 : motionEvent0.getDownTime()), v1, v, v3, arr_motionEvent$PointerProperties, arr_motionEvent$PointerCoords, motionEvent0.getMetaState(), v9, motionEvent0.getXPrecision(), motionEvent0.getYPrecision(), motionEvent0.getDeviceId(), motionEvent0.getEdgeFlags(), motionEvent0.getSource(), motionEvent0.getFlags());
        L.o(motionEvent1, "event");
        PointerInputEvent pointerInputEvent0 = this.s.c(motionEvent1, this);
        L.m(pointerInputEvent0);
        this.t.b(pointerInputEvent0, this, true);
        motionEvent1.recycle();
    }

    @Override  // androidx.compose.ui.node.Owner
    public void v(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "node");
    }

    static void v0(AndroidComposeView androidComposeView0, MotionEvent motionEvent0, int v, long v1, boolean z, int v2, Object object0) {
        androidComposeView0.u0(motionEvent0, v, v1, ((v2 & 8) == 0 ? z : true));
    }

    @Override  // androidx.compose.ui.node.Owner
    public void w(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "node");
        this.F.r(layoutNode0);
        this.o0();
    }

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static final void w0(AndroidComposeView androidComposeView0, boolean z) [...]

    @Override  // androidx.compose.ui.platform.ViewRootForTest
    public void x() {
        this.c0(this.getRoot());
    }

    private final void x0() {
        this.getLocationOnScreen(this.I);
        int v = IntOffset.c(this.H);
        int v1 = IntOffset.d(this.H);
        int[] arr_v = this.I;
        boolean z = false;
        int v2 = arr_v[0];
        if(v != v2 || v1 != arr_v[1]) {
            this.H = IntOffsetKt.a(v2, arr_v[1]);
            if(v != 0x7FFFFFFF && v1 != 0x7FFFFFFF) {
                this.getRoot().k0().x().Y1();
                z = true;
            }
        }
        this.F.d(z);
    }

    @Override  // androidx.compose.ui.input.pointer.PositionCalculator
    public long y(long v) {
        this.j0();
        long v1 = Matrix.j(this.J, v);
        return OffsetKt.a(Offset.p(v1) + Offset.p(this.N), Offset.r(v1) + Offset.r(this.N));
    }

    @Override  // androidx.compose.ui.node.Owner
    public void z() {
        this.n.i0();
    }
}

