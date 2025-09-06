package androidx.compose.ui.platform;

import A3.p;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.R.id;
import androidx.compose.ui.R.string;
import androidx.compose.ui.TempListUtilsKt;
import androidx.compose.ui.focus.b;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.e;
import androidx.compose.ui.platform.accessibility.CollectionInfoKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.J;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.comparisons.a;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.f;
import kotlin.ranges.s;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.channels.o;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,3169:1\n1747#2,3:3170\n33#3,4:3173\n33#3,6:3177\n38#3:3183\n33#3,6:3184\n33#3,6:3190\n33#3,6:3196\n69#3,6:3202\n69#3,6:3208\n33#3,6:3215\n33#3,6:3223\n33#3,6:3229\n33#3,6:3235\n33#3,6:3241\n33#3,6:3247\n1#4:3214\n37#5,2:3221\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n451#1:3170,3\n616#1:3173,4\n619#1:3177,6\n616#1:3183\n662#1:3184,6\n752#1:3190,6\n1200#1:3196,6\n1211#1:3202,6\n1218#1:3208,6\n1748#1:3215,6\n2432#1:3223,6\n2436#1:3229,6\n2595#1:3235,6\n2613#1:3241,6\n656#1:3247,6\n1813#1:3221,2\n*E\n"})
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    @RequiresApi(24)
    static final class Api24Impl {
        @l
        public static final Api24Impl a;

        static {
            Api24Impl.a = new Api24Impl();
        }

        @DoNotInline
        @n
        public static final void a(@l AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, @l SemanticsNode semanticsNode0) {
            L.p(accessibilityNodeInfoCompat0, "info");
            L.p(semanticsNode0, "semanticsNode");
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode0)) {
                AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.r());
                if(accessibilityAction0 != null) {
                    accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x102003D, accessibilityAction0.b()));
                }
            }
        }
    }

    @RequiresApi(28)
    static final class Api28Impl {
        @l
        public static final Api28Impl a;

        static {
            Api28Impl.a = new Api28Impl();
        }

        @DoNotInline
        @n
        public static final void a(@l AccessibilityEvent accessibilityEvent0, int v, int v1) {
            L.p(accessibilityEvent0, "event");
            accessibilityEvent0.setScrollDeltaX(v);
            accessibilityEvent0.setScrollDeltaY(v1);
        }
    }

    @RequiresApi(29)
    static final class Api29Impl {
        @l
        public static final Api29Impl a;

        static {
            Api29Impl.a = new Api29Impl();
        }

        @DoNotInline
        @n
        public static final void a(@l AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, @l SemanticsNode semanticsNode0) {
            L.p(accessibilityNodeInfoCompat0, "info");
            L.p(semanticsNode0, "semanticsNode");
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode0)) {
                SemanticsActions semanticsActions0 = SemanticsActions.a;
                AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.m());
                if(accessibilityAction0 != null) {
                    accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x1020046, accessibilityAction0.b()));
                }
                AccessibilityAction accessibilityAction1 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.j());
                if(accessibilityAction1 != null) {
                    accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x1020047, accessibilityAction1.b()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.k());
                if(accessibilityAction2 != null) {
                    accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x1020048, accessibilityAction2.b()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.l());
                if(accessibilityAction3 != null) {
                    accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x1020049, accessibilityAction3.b()));
                }
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public final class MyNodeProvider extends AccessibilityNodeProvider {
        final AndroidComposeViewAccessibilityDelegateCompat a;

        @Override  // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int v, @l AccessibilityNodeInfo accessibilityNodeInfo0, @l String s, @m Bundle bundle0) {
            L.p(accessibilityNodeInfo0, "info");
            L.p(s, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.y(v, accessibilityNodeInfo0, s, bundle0);
        }

        @Override  // android.view.accessibility.AccessibilityNodeProvider
        @m
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int v) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.F(v);
        }

        @Override  // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int v, int v1, @m Bundle bundle0) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.j0(v, v1, bundle0);
        }
    }

    static final class PendingTextTraversedEvent {
        @l
        private final SemanticsNode a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final long f;

        public PendingTextTraversedEvent(@l SemanticsNode semanticsNode0, int v, int v1, int v2, int v3, long v4) {
            L.p(semanticsNode0, "node");
            super();
            this.a = semanticsNode0;
            this.b = v;
            this.c = v1;
            this.d = v2;
            this.e = v3;
            this.f = v4;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.c;
        }

        @l
        public final SemanticsNode d() {
            return this.a;
        }

        public final int e() {
            return this.e;
        }

        public final long f() {
            return this.f;
        }
    }

    @VisibleForTesting
    @s0({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,3169:1\n33#2,6:3170\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n*L\n380#1:3170,6\n*E\n"})
    public static final class SemanticsNodeCopy {
        @l
        private final SemanticsNode a;
        @l
        private final SemanticsConfiguration b;
        @l
        private final Set c;

        public SemanticsNodeCopy(@l SemanticsNode semanticsNode0, @l Map map0) {
            L.p(semanticsNode0, "semanticsNode");
            L.p(map0, "currentSemanticsNodes");
            super();
            this.a = semanticsNode0;
            this.b = semanticsNode0.x();
            this.c = new LinkedHashSet();
            List list0 = semanticsNode0.t();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                SemanticsNode semanticsNode1 = (SemanticsNode)list0.get(v1);
                if(map0.containsKey(semanticsNode1.l())) {
                    this.c.add(semanticsNode1.l());
                }
            }
        }

        @l
        public final Set a() {
            return this.c;
        }

        @l
        public final SemanticsNode b() {
            return this.a;
        }

        @l
        public final SemanticsConfiguration c() {
            return this.b;
        }

        public final boolean d() {
            return this.b.c(SemanticsProperties.a.r());
        }
    }

    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[ToggleableState.values().length];
            try {
                arr_v[ToggleableState.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ToggleableState.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ToggleableState.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private final String A;
    @l
    private Map B;
    @l
    private SemanticsNodeCopy C;
    private boolean D;
    @l
    private final Runnable E;
    @l
    private final List F;
    @l
    private final Function1 G;
    @l
    public static final Companion H = null;
    public static final int I = 0x80000000;
    @l
    public static final String J = "android.view.View";
    @l
    public static final String K = "android.widget.EditText";
    @l
    public static final String L = "android.widget.TextView";
    @l
    public static final String M = "AccessibilityDelegate";
    @l
    public static final String N = "androidx.compose.ui.semantics.testTag";
    public static final int O = 100000;
    public static final int P = -1;
    public static final int Q = 20;
    public static final long R = 100L;
    public static final long S = 1000L;
    @l
    private static final int[] T;
    @l
    private final AndroidComposeView d;
    private int e;
    @l
    private final AccessibilityManager f;
    private boolean g;
    @l
    private final AccessibilityManager.AccessibilityStateChangeListener h;
    @l
    private final AccessibilityManager.TouchExplorationStateChangeListener i;
    private List j;
    @l
    private final Handler k;
    @l
    private AccessibilityNodeProviderCompat l;
    private int m;
    @l
    private SparseArrayCompat n;
    @l
    private SparseArrayCompat o;
    private int p;
    @m
    private Integer q;
    @l
    private final ArraySet r;
    @l
    private final kotlinx.coroutines.channels.l s;
    private boolean t;
    @m
    private PendingTextTraversedEvent u;
    @l
    private Map v;
    @l
    private ArraySet w;
    @l
    private HashMap x;
    @l
    private HashMap y;
    @l
    private final String z;

    static {
        AndroidComposeViewAccessibilityDelegateCompat.H = new Companion(null);
        AndroidComposeViewAccessibilityDelegateCompat.T = new int[]{id.accessibility_custom_action_0, id.accessibility_custom_action_1, id.accessibility_custom_action_2, id.accessibility_custom_action_3, id.accessibility_custom_action_4, id.accessibility_custom_action_5, id.accessibility_custom_action_6, id.accessibility_custom_action_7, id.accessibility_custom_action_8, id.accessibility_custom_action_9, id.accessibility_custom_action_10, id.accessibility_custom_action_11, id.accessibility_custom_action_12, id.accessibility_custom_action_13, id.accessibility_custom_action_14, id.accessibility_custom_action_15, id.accessibility_custom_action_16, id.accessibility_custom_action_17, id.accessibility_custom_action_18, id.accessibility_custom_action_19, id.accessibility_custom_action_20, id.accessibility_custom_action_21, id.accessibility_custom_action_22, id.accessibility_custom_action_23, id.accessibility_custom_action_24, id.accessibility_custom_action_25, id.accessibility_custom_action_26, id.accessibility_custom_action_27, id.accessibility_custom_action_28, id.accessibility_custom_action_29, id.accessibility_custom_action_30, id.accessibility_custom_action_31};
    }

    public AndroidComposeViewAccessibilityDelegateCompat(@l AndroidComposeView androidComposeView0) {
        L.p(androidComposeView0, "view");
        super();
        this.d = androidComposeView0;
        this.e = 0x80000000;
        Object object0 = androidComposeView0.getContext().getSystemService("accessibility");
        L.n(object0, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f = (AccessibilityManager)object0;
        this.h = (boolean z) -> {
            L.p(this, "this$0");
            this.j = z ? this.f.getEnabledAccessibilityServiceList(-1) : u.H();
        };
        this.i = (boolean z) -> {
            L.p(this, "this$0");
            this.j = this.f.getEnabledAccessibilityServiceList(-1);
        };
        this.j = ((AccessibilityManager)object0).getEnabledAccessibilityServiceList(-1);
        this.k = new Handler(Looper.getMainLooper());
        this.l = new AccessibilityNodeProviderCompat(new MyNodeProvider(this));
        this.m = 0x80000000;
        this.n = new SparseArrayCompat();
        this.o = new SparseArrayCompat();
        this.p = -1;
        this.r = new ArraySet();
        this.s = o.d(-1, null, null, 6, null);
        this.t = true;
        this.v = Y.z();
        this.w = new ArraySet();
        this.x = new HashMap();
        this.y = new HashMap();
        this.z = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.A = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.B = new LinkedHashMap();
        this.C = new SemanticsNodeCopy(androidComposeView0.getSemanticsOwner().b(), Y.z());
        androidComposeView0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(@l View view0) {
                L.p(view0, "view");
                this.a.K().addAccessibilityStateChangeListener(this.a.P());
                this.a.K().addTouchExplorationStateChangeListener(this.a.X());
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@l View view0) {
                L.p(view0, "view");
                this.a.k.removeCallbacks(this.a.E);
                this.a.K().removeAccessibilityStateChangeListener(this.a.P());
                this.a.K().removeTouchExplorationStateChangeListener(this.a.X());
            }
        });
        this.E = () -> {
            L.p(this, "this$0");
            e.e(this.d, false, 1, null);
            this.C();
            this.D = false;
        };
        this.F = new ArrayList();
        this.G = new Function1() {
            final AndroidComposeViewAccessibilityDelegateCompat e;

            {
                this.e = androidComposeViewAccessibilityDelegateCompat0;
                super(1);
            }

            public final void a(@l ScrollObservationScope scrollObservationScope0) {
                L.p(scrollObservationScope0, "it");
                this.e.z0(scrollObservationScope0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((ScrollObservationScope)object0));
                return S0.a;
            }
        };
    }

    public final boolean A(boolean z, int v, long v1) {
        return this.B(this.O().values(), z, v, v1);
    }

    @VisibleForTesting
    public final void A0(@l Map map0) {
        AccessibilityEvent accessibilityEvent1;
        L.p(map0, "newSemanticsNodes");
        ArrayList arrayList0 = new ArrayList(this.F);
        this.F.clear();
        for(Object object0: map0.keySet()) {
            int v = ((Number)object0).intValue();
            SemanticsNodeCopy androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0 = (SemanticsNodeCopy)this.B.get(v);
            if(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0 != null) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)map0.get(v);
                SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0 == null ? null : semanticsNodeWithAdjustedBounds0.b();
                L.m(semanticsNode0);
                boolean z = false;
                for(Object object1: semanticsNode0.x()) {
                    Map.Entry map$Entry0 = (Map.Entry)object1;
                    Object object2 = map$Entry0.getKey();
                    SemanticsProperties semanticsProperties0 = SemanticsProperties.a;
                    if((L.g(object2, semanticsProperties0.i()) || L.g(map$Entry0.getKey(), semanticsProperties0.C()) ? this.p0(v, arrayList0) : false) || !L.g(map$Entry0.getValue(), SemanticsConfigurationKt.a(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.c(), ((SemanticsPropertyKey)map$Entry0.getKey())))) {
                        String s = "";
                        SemanticsPropertyKey semanticsPropertyKey0 = (SemanticsPropertyKey)map$Entry0.getKey();
                        if(L.g(semanticsPropertyKey0, semanticsProperties0.r())) {
                            Object object3 = map$Entry0.getValue();
                            L.n(object3, "null cannot be cast to non-null type kotlin.String");
                            String s1 = (String)object3;
                            if(!androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.d()) {
                                continue;
                            }
                            this.x0(v, 8, s1);
                        }
                        else if((L.g(semanticsPropertyKey0, semanticsProperties0.x()) ? true : L.g(semanticsPropertyKey0, semanticsProperties0.B()))) {
                            AndroidComposeViewAccessibilityDelegateCompat.w0(this, this.t0(v), 0x800, 0x40, null, 8, null);
                            AndroidComposeViewAccessibilityDelegateCompat.w0(this, this.t0(v), 0x800, 0, null, 8, null);
                        }
                        else if(L.g(semanticsPropertyKey0, semanticsProperties0.t())) {
                            AndroidComposeViewAccessibilityDelegateCompat.w0(this, this.t0(v), 0x800, 0x40, null, 8, null);
                            AndroidComposeViewAccessibilityDelegateCompat.w0(this, this.t0(v), 0x800, 0, null, 8, null);
                        }
                        else if(L.g(semanticsPropertyKey0, semanticsProperties0.w())) {
                            Role role0 = (Role)SemanticsConfigurationKt.a(semanticsNode0.k(), semanticsProperties0.u());
                            if(!(role0 == null ? false : Role.k(role0.n(), 4))) {
                                AndroidComposeViewAccessibilityDelegateCompat.w0(this, this.t0(v), 0x800, 0x40, null, 8, null);
                                AndroidComposeViewAccessibilityDelegateCompat.w0(this, this.t0(v), 0x800, 0, null, 8, null);
                            }
                            else if(L.g(SemanticsConfigurationKt.a(semanticsNode0.k(), semanticsProperties0.w()), Boolean.TRUE)) {
                                AccessibilityEvent accessibilityEvent0 = this.E(this.t0(v), 4);
                                SemanticsNode semanticsNode1 = new SemanticsNode(semanticsNode0.p(), true, null, 4, null);
                                List list0 = (List)SemanticsConfigurationKt.a(semanticsNode1.k(), semanticsProperties0.c());
                                String s2 = list0 == null ? null : TempListUtilsKt.f(list0, ",", null, null, 0, null, null, 62, null);
                                List list1 = (List)SemanticsConfigurationKt.a(semanticsNode1.k(), semanticsProperties0.z());
                                String s3 = list1 == null ? null : TempListUtilsKt.f(list1, ",", null, null, 0, null, null, 62, null);
                                if(s2 != null) {
                                    accessibilityEvent0.setContentDescription(s2);
                                }
                                if(s3 != null) {
                                    accessibilityEvent0.getText().add(s3);
                                }
                                this.u0(accessibilityEvent0);
                            }
                            else {
                                AndroidComposeViewAccessibilityDelegateCompat.w0(this, this.t0(v), 0x800, 0, null, 8, null);
                            }
                        }
                        else if(L.g(semanticsPropertyKey0, semanticsProperties0.c())) {
                            int v1 = this.t0(v);
                            Object object4 = map$Entry0.getValue();
                            L.n(object4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            this.v0(v1, 0x800, 4, ((List)object4));
                        }
                        else if(L.g(semanticsPropertyKey0, semanticsProperties0.e())) {
                            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.A(semanticsNode0)) {
                                AnnotatedString annotatedString0 = this.W(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.c());
                                if(annotatedString0 == null) {
                                    annotatedString0 = "";
                                }
                                AnnotatedString annotatedString1 = this.W(semanticsNode0.x());
                                if(annotatedString1 != null) {
                                    s = annotatedString1;
                                }
                                CharSequence charSequence0 = this.S0(s, 100000);
                                int v2 = annotatedString0.length();
                                int v3 = s.length();
                                int v4 = s.B(v2, v3);
                                int v5;
                                for(v5 = 0; v5 < v4 && annotatedString0.charAt(v5) == s.charAt(v5); ++v5) {
                                }
                                int v6;
                                for(v6 = 0; v6 < v4 - v5 && annotatedString0.charAt(v2 - 1 - v6) == s.charAt(v3 - 1 - v6); ++v6) {
                                }
                                boolean z1 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.A(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.b()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.x(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.b()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.x(semanticsNode0);
                                boolean z2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.A(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.b()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.x(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.b()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.x(semanticsNode0);
                                if(z1 || z2) {
                                    accessibilityEvent1 = this.G(this.t0(v), 0, 0, v3, charSequence0);
                                }
                                else {
                                    accessibilityEvent1 = this.E(this.t0(v), 16);
                                    accessibilityEvent1.setFromIndex(v5);
                                    accessibilityEvent1.setRemovedCount(v2 - v6 - v5);
                                    accessibilityEvent1.setAddedCount(v3 - v6 - v5);
                                    accessibilityEvent1.setBeforeText(annotatedString0);
                                    accessibilityEvent1.getText().add(charSequence0);
                                }
                                accessibilityEvent1.setClassName("android.widget.EditText");
                                this.u0(accessibilityEvent1);
                                if(!z1 && !z2) {
                                    continue;
                                }
                                long v7 = ((TextRange)semanticsNode0.x().g(SemanticsProperties.a.A())).r();
                                accessibilityEvent1.setFromIndex(((int)(v7 >> 0x20)));
                                accessibilityEvent1.setToIndex(((int)(v7 & 0xFFFFFFFFL)));
                                this.u0(accessibilityEvent1);
                            }
                            else {
                                AndroidComposeViewAccessibilityDelegateCompat.w0(this, this.t0(v), 0x800, 2, null, 8, null);
                            }
                        }
                        else if(L.g(semanticsPropertyKey0, semanticsProperties0.A())) {
                            AnnotatedString annotatedString2 = this.W(semanticsNode0.x());
                            if(annotatedString2 != null) {
                                String s4 = annotatedString2.j();
                                if(s4 != null) {
                                    s = s4;
                                }
                            }
                            long v8 = ((TextRange)semanticsNode0.x().g(semanticsProperties0.A())).r();
                            this.u0(this.G(this.t0(v), ((int)(v8 >> 0x20)), ((int)(v8 & 0xFFFFFFFFL)), s.length(), this.S0(s, 100000)));
                            this.y0(semanticsNode0.l());
                        }
                        else if((L.g(semanticsPropertyKey0, semanticsProperties0.i()) ? true : L.g(semanticsPropertyKey0, semanticsProperties0.C()))) {
                            this.g0(semanticsNode0.n());
                            ScrollObservationScope scrollObservationScope0 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(this.F, v);
                            L.m(scrollObservationScope0);
                            scrollObservationScope0.g(((ScrollAxisRange)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties0.i())));
                            scrollObservationScope0.j(((ScrollAxisRange)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties0.C())));
                            this.z0(scrollObservationScope0);
                        }
                        else if(L.g(semanticsPropertyKey0, semanticsProperties0.g())) {
                            Object object5 = map$Entry0.getValue();
                            L.n(object5, "null cannot be cast to non-null type kotlin.Boolean");
                            if(((Boolean)object5).booleanValue()) {
                                this.u0(this.E(this.t0(semanticsNode0.l()), 8));
                            }
                            AndroidComposeViewAccessibilityDelegateCompat.w0(this, this.t0(semanticsNode0.l()), 0x800, 0, null, 8, null);
                        }
                        else {
                            SemanticsActions semanticsActions0 = SemanticsActions.a;
                            if(L.g(semanticsPropertyKey0, semanticsActions0.c())) {
                                List list2 = (List)semanticsNode0.x().g(semanticsActions0.c());
                                List list3 = (List)SemanticsConfigurationKt.a(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.c(), semanticsActions0.c());
                                if(list3 == null) {
                                    if(list2.isEmpty()) {
                                        continue;
                                    }
                                    z = true;
                                    continue;
                                }
                                else {
                                    LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                                    int v9 = list2.size();
                                    for(int v10 = 0; v10 < v9; ++v10) {
                                        linkedHashSet0.add(((CustomAccessibilityAction)list2.get(v10)).b());
                                    }
                                    LinkedHashSet linkedHashSet1 = new LinkedHashSet();
                                    int v11 = list3.size();
                                    for(int v12 = 0; v12 < v11; ++v12) {
                                        linkedHashSet1.add(((CustomAccessibilityAction)list3.get(v12)).b());
                                    }
                                    if(linkedHashSet0.containsAll(linkedHashSet1) && linkedHashSet1.containsAll(linkedHashSet0)) {
                                        z = false;
                                        continue;
                                    }
                                }
                            }
                            else if(map$Entry0.getValue() instanceof AccessibilityAction) {
                                Object object6 = map$Entry0.getValue();
                                L.n(object6, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                z = !AndroidComposeViewAccessibilityDelegateCompat_androidKt.m(((AccessibilityAction)object6), SemanticsConfigurationKt.a(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.c(), ((SemanticsPropertyKey)map$Entry0.getKey())));
                                continue;
                            }
                            z = true;
                        }
                    }
                }
                if(!z) {
                    z = AndroidComposeViewAccessibilityDelegateCompat_androidKt.E(semanticsNode0, androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0);
                }
                if(z) {
                    AndroidComposeViewAccessibilityDelegateCompat.w0(this, this.t0(v), 0x800, 0, null, 8, null);
                }
            }
        }
    }

    // This method was un-flattened
    @VisibleForTesting(otherwise = 2)
    public final boolean B(@l Collection collection0, boolean z, int v, long v1) {
        SemanticsPropertyKey semanticsPropertyKey0;
        L.p(collection0, "currentSemanticsNodes");
        if(!Offset.l(v1, 0x7FC000007FC00000L) && Offset.t(v1)) {
            switch(z) {
                case 0: {
                    semanticsPropertyKey0 = SemanticsProperties.a.i();
                    break;
                }
                case 1: {
                    semanticsPropertyKey0 = SemanticsProperties.a.C();
                    break;
                }
                default: {
                    throw new J();
                }
            }
            if(!collection0.isEmpty()) {
                for(Object object0: collection0) {
                    SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)object0;
                    if(RectHelper_androidKt.e(semanticsNodeWithAdjustedBounds0.a()).f(v1)) {
                        ScrollAxisRange scrollAxisRange0 = (ScrollAxisRange)SemanticsConfigurationKt.a(semanticsNodeWithAdjustedBounds0.b().k(), semanticsPropertyKey0);
                        if(scrollAxisRange0 != null) {
                            int v2 = scrollAxisRange0.b() ? -v : v;
                            if(v == 0 && scrollAxisRange0.b()) {
                                v2 = -1;
                            }
                            if(v2 < 0) {
                                if(((Number)scrollAxisRange0.c().invoke()).floatValue() <= 0.0f) {
                                    continue;
                                }
                                return true;
                            }
                            if(((Number)scrollAxisRange0.c().invoke()).floatValue() < ((Number)scrollAxisRange0.a().invoke()).floatValue()) {
                                return true;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    private final void B0(SemanticsNode semanticsNode0, SemanticsNodeCopy androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0) {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        List list0 = semanticsNode0.t();
        int v = list0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            SemanticsNode semanticsNode1 = (SemanticsNode)list0.get(v2);
            if(this.O().containsKey(semanticsNode1.l())) {
                if(!androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.a().contains(semanticsNode1.l())) {
                    this.g0(semanticsNode0.n());
                    return;
                }
                linkedHashSet0.add(semanticsNode1.l());
            }
        }
        for(Object object0: androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.a()) {
            if(!linkedHashSet0.contains(((Number)object0).intValue())) {
                this.g0(semanticsNode0.n());
                return;
            }
            if(false) {
                break;
            }
        }
        List list1 = semanticsNode0.t();
        int v3 = list1.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            SemanticsNode semanticsNode2 = (SemanticsNode)list1.get(v1);
            if(this.O().containsKey(semanticsNode2.l())) {
                Object object1 = this.B.get(semanticsNode2.l());
                L.m(object1);
                this.B0(semanticsNode2, ((SemanticsNodeCopy)object1));
            }
        }
    }

    private final void C() {
        this.B0(this.d.getSemanticsOwner().b(), this.C);
        this.A0(this.O());
        this.U0();
    }

    private final void C0(LayoutNode layoutNode0, ArraySet arraySet0) {
        if(!layoutNode0.o()) {
            return;
        }
        if(this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode0)) {
            return;
        }
        SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.j(layoutNode0);
        if(semanticsModifierNode0 == null) {
            LayoutNode layoutNode1 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.q(layoutNode0, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.semanticsWrapper.1.e);
            semanticsModifierNode0 = layoutNode1 == null ? null : SemanticsNodeKt.j(layoutNode1);
            if(semanticsModifierNode0 == null) {
                return;
            }
        }
        if(!SemanticsModifierNodeKt.a(semanticsModifierNode0).k()) {
            LayoutNode layoutNode2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.q(layoutNode0, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1.e);
            if(layoutNode2 != null) {
                SemanticsModifierNode semanticsModifierNode1 = SemanticsNodeKt.j(layoutNode2);
                if(semanticsModifierNode1 != null) {
                    semanticsModifierNode0 = semanticsModifierNode1;
                }
            }
        }
        int v = DelegatableNodeKt.p(semanticsModifierNode0).w();
        if(!arraySet0.add(v)) {
            return;
        }
        AndroidComposeViewAccessibilityDelegateCompat.w0(this, this.t0(v), 0x800, 1, null, 8, null);

        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1() {
                super(1);
            }

            @l
            public final Boolean a(@l LayoutNode layoutNode0) {
                L.p(layoutNode0, "it");
                SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.j(layoutNode0);
                boolean z = false;
                if(semanticsModifierNode0 != null) {
                    SemanticsConfiguration semanticsConfiguration0 = SemanticsModifierNodeKt.a(semanticsModifierNode0);
                    if(semanticsConfiguration0 != null && semanticsConfiguration0.k()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((LayoutNode)object0));
            }
        }


        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.semanticsWrapper.1 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.semanticsWrapper.1 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.semanticsWrapper.1.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.semanticsWrapper.1();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.semanticsWrapper.1() {
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

    private final boolean D(int v) {
        if(this.b0(v)) {
            this.m = 0x80000000;
            this.d.invalidate();
            AndroidComposeViewAccessibilityDelegateCompat.w0(this, v, 0x10000, null, null, 12, null);
            return true;
        }
        return false;
    }

    public final void D0(boolean z) {
        this.g = z;
    }

    @VisibleForTesting
    @l
    public final AccessibilityEvent E(int v, int v1) {
        AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain(v1);
        L.o(accessibilityEvent0, "obtain(eventType)");
        accessibilityEvent0.setEnabled(true);
        accessibilityEvent0.setClassName("android.view.View");
        accessibilityEvent0.setPackageName("com.dcinside.app.android");
        accessibilityEvent0.setSource(this.d, v);
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.O().get(v);
        if(semanticsNodeWithAdjustedBounds0 != null) {
            accessibilityEvent0.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.x(semanticsNodeWithAdjustedBounds0.b()));
        }
        return accessibilityEvent0;
    }

    private final boolean E0(SemanticsNode semanticsNode0, int v, int v1, boolean z) {
        SemanticsActions semanticsActions0 = SemanticsActions.a;
        boolean z1 = false;
        if(semanticsNode0.x().c(semanticsActions0.s()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode0)) {
            p p0 = (p)((AccessibilityAction)semanticsNode0.x().g(semanticsActions0.s())).a();
            return p0 == null ? false : ((Boolean)p0.invoke(v, v1, Boolean.valueOf(z))).booleanValue();
        }
        if(v == v1 && v1 == this.p) {
            return false;
        }
        String s = this.S(semanticsNode0);
        if(s == null) {
            return false;
        }
        if(v < 0 || v != v1 || v1 > s.length()) {
            v = -1;
        }
        this.p = v;
        if(s.length() > 0) {
            z1 = true;
        }
        int v2 = this.t0(semanticsNode0.l());
        Integer integer0 = null;
        Integer integer1 = z1 ? this.p : null;
        Integer integer2 = z1 ? this.p : null;
        if(z1) {
            integer0 = s.length();
        }
        this.u0(this.G(v2, integer1, integer2, integer0, s));
        this.y0(semanticsNode0.l());
        return true;
    }

    private final AccessibilityNodeInfo F(int v) {
        State lifecycle$State0;
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = this.d.getViewTreeOwners();
        View view0 = null;
        if(androidComposeView$ViewTreeOwners0 == null) {
            lifecycle$State0 = null;
        }
        else {
            LifecycleOwner lifecycleOwner0 = androidComposeView$ViewTreeOwners0.a();
            if(lifecycleOwner0 == null) {
                lifecycle$State0 = null;
            }
            else {
                Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
                lifecycle$State0 = lifecycle0 == null ? null : lifecycle0.b();
            }
        }
        if(lifecycle$State0 == State.a) {
            return null;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.O0();
        L.o(accessibilityNodeInfoCompat0, "obtain()");
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.O().get(v);
        if(semanticsNodeWithAdjustedBounds0 == null) {
            return null;
        }
        SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0.b();
        int v1 = -1;
        if(v == -1) {
            ViewParent viewParent0 = ViewCompat.q0(this.d);
            if(viewParent0 instanceof View) {
                view0 = (View)viewParent0;
            }
            accessibilityNodeInfoCompat0.R1(view0);
        }
        else if(semanticsNode0.q() != null) {
            SemanticsNode semanticsNode1 = semanticsNode0.q();
            L.m(semanticsNode1);
            int v2 = semanticsNode1.l();
            if(v2 != this.d.getSemanticsOwner().b().l()) {
                v1 = v2;
            }
            accessibilityNodeInfoCompat0.S1(this.d, v1);
        }
        else {
            throw new IllegalStateException("semanticsNode " + v + " has null parent");
        }
        accessibilityNodeInfoCompat0.d2(this.d, v);
        Rect rect0 = semanticsNodeWithAdjustedBounds0.a();
        long v3 = this.d.y(OffsetKt.a(rect0.left, rect0.top));
        long v4 = this.d.y(OffsetKt.a(rect0.right, rect0.bottom));
        accessibilityNodeInfoCompat0.f1(new Rect(((int)(((float)Math.floor(Offset.p(v3))))), ((int)(((float)Math.floor(Offset.r(v3))))), ((int)(((float)Math.ceil(Offset.p(v4))))), ((int)(((float)Math.ceil(Offset.r(v4)))))));
        this.m0(v, accessibilityNodeInfoCompat0, semanticsNode0);
        return accessibilityNodeInfoCompat0.s2();
    }

    private final void F0(SemanticsNode semanticsNode0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        SemanticsProperties semanticsProperties0 = SemanticsProperties.a;
        if(semanticsNode0.x().c(semanticsProperties0.f())) {
            accessibilityNodeInfoCompat0.q1(true);
            accessibilityNodeInfoCompat0.w1(((CharSequence)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties0.f())));
        }
    }

    private final AccessibilityEvent G(int v, Integer integer0, Integer integer1, Integer integer2, CharSequence charSequence0) {
        AccessibilityEvent accessibilityEvent0 = this.E(v, 0x2000);
        if(integer0 != null) {
            accessibilityEvent0.setFromIndex(integer0.intValue());
        }
        if(integer1 != null) {
            accessibilityEvent0.setToIndex(integer1.intValue());
        }
        if(integer2 != null) {
            accessibilityEvent0.setItemCount(integer2.intValue());
        }
        if(charSequence0 != null) {
            accessibilityEvent0.getText().add(charSequence0);
        }
        return accessibilityEvent0;
    }

    public final void G0(int v) {
        this.e = v;
    }

    public final boolean H(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "event");
        if(!this.f0()) {
            return false;
        }
        switch(motionEvent0.getAction()) {
            case 7: 
            case 9: {
                int v = this.a0(motionEvent0.getX(), motionEvent0.getY());
                boolean z = this.d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent0);
                this.T0(v);
                return v == 0x80000000 ? z : true;
            }
            case 10: {
                if(this.e != 0x80000000) {
                    this.T0(0x80000000);
                    return true;
                }
                return this.d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent0);
            }
            default: {
                return false;
            }
        }
    }

    public final void H0(@l Map map0) {
        L.p(map0, "<set-?>");
        this.B = map0;
    }

    // 检测为 Lambda 实现
    private static final void I(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0, boolean z) [...]

    private final void I0(SemanticsNode semanticsNode0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        Resolver fontFamily$Resolver0 = this.d.getFontFamilyResolver();
        AnnotatedString annotatedString0 = this.W(semanticsNode0.x());
        CharSequence charSequence0 = null;
        SpannableString spannableString0 = (SpannableString)this.S0((annotatedString0 == null ? null : AndroidAccessibilitySpannableString_androidKt.c(annotatedString0, this.d.getDensity(), fontFamily$Resolver0)), 100000);
        List list0 = (List)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsProperties.a.z());
        if(list0 != null) {
            AnnotatedString annotatedString1 = (AnnotatedString)u.G2(list0);
            if(annotatedString1 != null) {
                charSequence0 = AndroidAccessibilitySpannableString_androidKt.c(annotatedString1, this.d.getDensity(), fontFamily$Resolver0);
            }
        }
        SpannableString spannableString1 = (SpannableString)this.S0(charSequence0, 100000);
        if(spannableString0 == null) {
            spannableString0 = spannableString1;
        }
        accessibilityNodeInfoCompat0.f2(spannableString0);
    }

    public final boolean J() {
        return this.g;
    }

    private final void J0() {
        this.x.clear();
        this.y.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.O().get(-1);
        SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0 == null ? null : semanticsNodeWithAdjustedBounds0.b();
        L.m(semanticsNode0);
        List list0 = this.N0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.y(semanticsNode0), u.Y5(semanticsNode0.i()));
        int v = u.J(list0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                int v2 = ((SemanticsNode)list0.get(v1 - 1)).l();
                int v3 = ((SemanticsNode)list0.get(v1)).l();
                this.x.put(v2, v3);
                this.y.put(v3, v2);
                if(v1 == v) {
                    break;
                }
            }
        }
    }

    @l
    public final AccessibilityManager K() {
        return this.f;
    }

    private final List K0(boolean z, List list0, Map map0) {
        ArrayList arrayList0 = new ArrayList();
        int v = u.J(list0);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                SemanticsNode semanticsNode0 = (SemanticsNode)list0.get(v1);
                if(v1 == 0 || !AndroidComposeViewAccessibilityDelegateCompat.M0(arrayList0, semanticsNode0)) {
                    arrayList0.add(new V(semanticsNode0.h(), u.S(new SemanticsNode[]{semanticsNode0})));
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        u.p0(arrayList0, a.h(new Function1[]{androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.1.e, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2.e}));
        List list1 = new ArrayList();
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            V v4 = (V)arrayList0.get(v3);
            u.p0(((List)v4.f()), this.r0(z));
            List list2 = (List)v4.f();
            int v5 = list2.size();
            for(int v6 = 0; v6 < v5; ++v6) {
                SemanticsNode semanticsNode1 = (SemanticsNode)list2.get(v6);
                List list3 = (List)map0.get(semanticsNode1.l());
                list1.addAll((list3 == null ? u.S(new SemanticsNode[]{semanticsNode1}) : list3));
            }
        }
        return list1;

        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.1 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.1 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.1.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.1();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.1() {
                super(1);
            }

            @m
            public final Comparable a(@l V v0) {
                L.p(v0, "it");
                return ((androidx.compose.ui.geometry.Rect)v0.e()).B();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((V)object0));
            }
        }


        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2() {
                super(1);
            }

            @m
            public final Comparable a(@l V v0) {
                L.p(v0, "it");
                return ((androidx.compose.ui.geometry.Rect)v0.e()).j();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((V)object0));
            }
        }

    }

    @VisibleForTesting
    public static void L() {
    }

    static List L0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0, boolean z, List list0, Map map0, int v, Object object0) {
        if((v & 4) != 0) {
            map0 = new LinkedHashMap();
        }
        return androidComposeViewAccessibilityDelegateCompat0.K0(z, list0, map0);
    }

    // 去混淆评级： 低(20)
    private final int M(SemanticsNode semanticsNode0) {
        return semanticsNode0.x().c(SemanticsProperties.a.c()) || !semanticsNode0.x().c(SemanticsProperties.a.A()) ? this.p : TextRange.i(((TextRange)semanticsNode0.x().g(SemanticsProperties.a.A())).r());
    }

    private static final boolean M0(List list0, SemanticsNode semanticsNode0) {
        float f = semanticsNode0.h().B();
        float f1 = semanticsNode0.h().j();
        OpenEndRange openEndRange0 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.F(f, f1);
        int v = u.J(list0);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                androidx.compose.ui.geometry.Rect rect0 = (androidx.compose.ui.geometry.Rect)((V)list0.get(v1)).e();
                if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.D(AndroidComposeViewAccessibilityDelegateCompat_androidKt.F(rect0.B(), rect0.j()), openEndRange0)) {
                    list0.set(v1, new V(rect0.J(new androidx.compose.ui.geometry.Rect(0.0f, f, Infinityf, f1)), ((V)list0.get(v1)).f()));
                    ((List)((V)list0.get(v1)).f()).add(semanticsNode0);
                    return true;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    private final int N(SemanticsNode semanticsNode0) {
        return semanticsNode0.x().c(SemanticsProperties.a.c()) || !semanticsNode0.x().c(SemanticsProperties.a.A()) ? this.p : TextRange.n(((TextRange)semanticsNode0.x().g(SemanticsProperties.a.A())).r());
    }

    private final List N0(boolean z, List list0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        ArrayList arrayList0 = new ArrayList();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            AndroidComposeViewAccessibilityDelegateCompat.O0(arrayList0, linkedHashMap0, this, z, ((SemanticsNode)list0.get(v1)));
        }
        return this.K0(z, arrayList0, linkedHashMap0);
    }

    private final Map O() {
        if(this.t) {
            this.t = false;
            this.v = AndroidComposeViewAccessibilityDelegateCompat_androidKt.r(this.d.getSemanticsOwner());
            this.J0();
        }
        return this.v;
    }

    private static final void O0(List list0, Map map0, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0, boolean z, SemanticsNode semanticsNode0) {
        list0.add(semanticsNode0);
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.u(semanticsNode0)) {
            map0.put(semanticsNode0.l(), androidComposeViewAccessibilityDelegateCompat0.N0(z, u.Y5(semanticsNode0.i())));
            return;
        }
        List list1 = semanticsNode0.i();
        int v = list1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            AndroidComposeViewAccessibilityDelegateCompat.O0(list0, map0, androidComposeViewAccessibilityDelegateCompat0, z, ((SemanticsNode)list1.get(v1)));
        }
    }

    @l
    public final AccessibilityManager.AccessibilityStateChangeListener P() {
        return this.h;
    }

    private final RectF P0(SemanticsNode semanticsNode0, androidx.compose.ui.geometry.Rect rect0) {
        if(semanticsNode0 == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect rect1 = rect0.S(semanticsNode0.r());
        androidx.compose.ui.geometry.Rect rect2 = semanticsNode0.g();
        androidx.compose.ui.geometry.Rect rect3 = rect1.Q(rect2) ? rect1.J(rect2) : null;
        if(rect3 != null) {
            long v = this.d.y(OffsetKt.a(rect3.t(), rect3.B()));
            long v1 = this.d.y(OffsetKt.a(rect3.x(), rect3.j()));
            return new RectF(Offset.p(v), Offset.r(v), Offset.p(v1), Offset.r(v1));
        }
        return null;
    }

    @VisibleForTesting
    public static void Q() {
    }

    // 检测为 Lambda 实现
    private static final void Q0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0, boolean z) [...]

    public final int R() {
        return this.e;
    }

    private final boolean R0(SemanticsNode semanticsNode0, int v, boolean z, boolean z1) {
        int v5;
        int v4;
        if(this.q == null || semanticsNode0.l() != ((int)this.q)) {
            this.p = -1;
            this.q = semanticsNode0.l();
        }
        String s = this.S(semanticsNode0);
        boolean z2 = false;
        if(s != null && s.length() != 0) {
            TextSegmentIterator accessibilityIterators$TextSegmentIterator0 = this.T(semanticsNode0, v);
            if(accessibilityIterators$TextSegmentIterator0 == null) {
                return false;
            }
            int v1 = this.M(semanticsNode0);
            if(v1 == -1) {
                v1 = z ? 0 : s.length();
            }
            int[] arr_v = z ? accessibilityIterators$TextSegmentIterator0.a(v1) : accessibilityIterators$TextSegmentIterator0.b(v1);
            if(arr_v == null) {
                return false;
            }
            int v2 = arr_v[0];
            z2 = true;
            int v3 = arr_v[1];
            if(!z1 || !this.c0(semanticsNode0)) {
                v4 = z ? v3 : v2;
                v5 = v4;
            }
            else {
                v4 = this.N(semanticsNode0);
                if(v4 == -1) {
                    v4 = z ? v2 : v3;
                }
                v5 = z ? v3 : v2;
            }
            this.u = new PendingTextTraversedEvent(semanticsNode0, (z ? 0x100 : 0x200), v, v2, v3, SystemClock.uptimeMillis());
            this.E0(semanticsNode0, v4, v5, true);
        }
        return z2;
    }

    private final String S(SemanticsNode semanticsNode0) {
        if(semanticsNode0 == null) {
            return null;
        }
        SemanticsProperties semanticsProperties0 = SemanticsProperties.a;
        if(semanticsNode0.x().c(semanticsProperties0.c())) {
            return TempListUtilsKt.f(((List)semanticsNode0.x().g(semanticsProperties0.c())), ",", null, null, 0, null, null, 62, null);
        }
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.A(semanticsNode0)) {
            AnnotatedString annotatedString0 = this.W(semanticsNode0.x());
            return annotatedString0 == null ? null : annotatedString0.j();
        }
        List list0 = (List)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties0.z());
        if(list0 != null) {
            AnnotatedString annotatedString1 = (AnnotatedString)u.G2(list0);
            return annotatedString1 == null ? null : annotatedString1.j();
        }
        return null;
    }

    private final CharSequence S0(CharSequence charSequence0, @IntRange(from = 1L) int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(charSequence0 != null && charSequence0.length() != 0 && charSequence0.length() > v) {
            if(Character.isHighSurrogate(charSequence0.charAt(v - 1)) && Character.isLowSurrogate(charSequence0.charAt(v))) {
                --v;
            }
            charSequence0 = charSequence0.subSequence(0, v);
            L.n(charSequence0, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        }
        return charSequence0;
    }

    private final TextSegmentIterator T(SemanticsNode semanticsNode0, int v) {
        TextSegmentIterator accessibilityIterators$TextSegmentIterator0;
        if(semanticsNode0 == null) {
            return null;
        }
        String s = this.S(semanticsNode0);
        if(s != null && s.length() != 0) {
            switch(v) {
                case 1: {
                    Locale locale1 = this.d.getContext().getResources().getConfiguration().locale;
                    L.o(locale1, "view.context.resources.configuration.locale");
                    accessibilityIterators$TextSegmentIterator0 = CharacterTextSegmentIterator.e.a(locale1);
                    ((AbstractTextSegmentIterator)accessibilityIterators$TextSegmentIterator0).e(s);
                    return accessibilityIterators$TextSegmentIterator0;
                }
                case 2: {
                    Locale locale0 = this.d.getContext().getResources().getConfiguration().locale;
                    L.o(locale0, "view.context.resources.configuration.locale");
                    accessibilityIterators$TextSegmentIterator0 = WordTextSegmentIterator.e.a(locale0);
                    ((AbstractTextSegmentIterator)accessibilityIterators$TextSegmentIterator0).e(s);
                    return accessibilityIterators$TextSegmentIterator0;
                }
                case 8: {
                    accessibilityIterators$TextSegmentIterator0 = ParagraphTextSegmentIterator.d.a();
                    ((AbstractTextSegmentIterator)accessibilityIterators$TextSegmentIterator0).e(s);
                    return accessibilityIterators$TextSegmentIterator0;
                }
                case 4: 
                case 16: {
                    SemanticsActions semanticsActions0 = SemanticsActions.a;
                    if(!semanticsNode0.x().c(semanticsActions0.g())) {
                        return null;
                    }
                    ArrayList arrayList0 = new ArrayList();
                    Function1 function10 = (Function1)((AccessibilityAction)semanticsNode0.x().g(semanticsActions0.g())).a();
                    if(L.g((function10 == null ? null : ((Boolean)function10.invoke(arrayList0))), Boolean.TRUE)) {
                        TextLayoutResult textLayoutResult0 = (TextLayoutResult)arrayList0.get(0);
                        if(v == 4) {
                            accessibilityIterators$TextSegmentIterator0 = LineTextSegmentIterator.e.a();
                            ((LineTextSegmentIterator)accessibilityIterators$TextSegmentIterator0).j(s, textLayoutResult0);
                            return accessibilityIterators$TextSegmentIterator0;
                        }
                        PageTextSegmentIterator accessibilityIterators$PageTextSegmentIterator0 = PageTextSegmentIterator.g.a();
                        accessibilityIterators$PageTextSegmentIterator0.j(s, textLayoutResult0, semanticsNode0);
                        return accessibilityIterators$PageTextSegmentIterator0;
                    }
                    return null;
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }

    private final void T0(int v) {
        int v1 = this.e;
        if(v1 == v) {
            return;
        }
        this.e = v;
        AndroidComposeViewAccessibilityDelegateCompat.w0(this, v, 0x80, null, null, 12, null);
        AndroidComposeViewAccessibilityDelegateCompat.w0(this, v1, 0x100, null, null, 12, null);
    }

    @l
    public final Map U() {
        return this.B;
    }

    private final void U0() {
        ArraySet arraySet0 = new ArraySet();
        for(Object object0: this.w) {
            Integer integer0 = (Integer)object0;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.O().get(integer0);
            String s = null;
            SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0 == null ? null : semanticsNodeWithAdjustedBounds0.b();
            if(semanticsNode0 == null || !AndroidComposeViewAccessibilityDelegateCompat_androidKt.v(semanticsNode0)) {
                arraySet0.add(integer0);
                L.o(integer0, "id");
                int v = (int)integer0;
                SemanticsNodeCopy androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0 = (SemanticsNodeCopy)this.B.get(integer0);
                if(androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0 != null) {
                    SemanticsConfiguration semanticsConfiguration0 = androidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy0.c();
                    if(semanticsConfiguration0 != null) {
                        s = (String)SemanticsConfigurationKt.a(semanticsConfiguration0, SemanticsProperties.a.r());
                    }
                }
                this.x0(v, 0x20, s);
            }
        }
        this.w.i(arraySet0);
        this.B.clear();
        for(Object object1: this.O().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.v(((SemanticsNodeWithAdjustedBounds)map$Entry0.getValue()).b()) && this.w.add(map$Entry0.getKey())) {
                this.x0(((Number)map$Entry0.getKey()).intValue(), 16, ((String)((SemanticsNodeWithAdjustedBounds)map$Entry0.getValue()).b().x().g(SemanticsProperties.a.r())));
            }
            this.B.put(map$Entry0.getKey(), new SemanticsNodeCopy(((SemanticsNodeWithAdjustedBounds)map$Entry0.getValue()).b(), this.O()));
        }
        this.C = new SemanticsNodeCopy(this.d.getSemanticsOwner().b(), this.O());
    }

    @VisibleForTesting
    public static void V() {
    }

    private final AnnotatedString W(SemanticsConfiguration semanticsConfiguration0) {
        return (AnnotatedString)SemanticsConfigurationKt.a(semanticsConfiguration0, SemanticsProperties.a.e());
    }

    @l
    public final AccessibilityManager.TouchExplorationStateChangeListener X() {
        return this.i;
    }

    @VisibleForTesting
    public static void Y() {
    }

    @l
    public final AndroidComposeView Z() {
        return this.d;
    }

    @VisibleForTesting
    public final int a0(float f, float f1) {
        SemanticsModifierNode semanticsModifierNode0 = null;
        e.e(this.d, false, 1, null);
        HitTestResult hitTestResult0 = new HitTestResult();
        LayoutNode.M0(this.d.getRoot(), OffsetKt.a(f, f1), hitTestResult0, false, false, 12, null);
        SemanticsModifierNode semanticsModifierNode1 = (SemanticsModifierNode)u.v3(hitTestResult0);
        if(semanticsModifierNode1 != null) {
            LayoutNode layoutNode0 = DelegatableNodeKt.p(semanticsModifierNode1);
            if(layoutNode0 != null) {
                semanticsModifierNode0 = SemanticsNodeKt.j(layoutNode0);
            }
        }
        if(semanticsModifierNode0 != null && AndroidComposeViewAccessibilityDelegateCompat_androidKt.B(new SemanticsNode(semanticsModifierNode0, false, null, 4, null))) {
            LayoutNode layoutNode1 = DelegatableNodeKt.p(semanticsModifierNode0);
            return ((AndroidViewHolder)this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNode1)) == null ? this.t0(layoutNode1.w()) : 0x80000000;
        }
        return 0x80000000;
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    @l
    public AccessibilityNodeProviderCompat b(@l View view0) {
        L.p(view0, "host");
        return this.l;
    }

    private final boolean b0(int v) {
        return this.m == v;
    }

    // 去混淆评级： 低(20)
    private final boolean c0(SemanticsNode semanticsNode0) {
        return !semanticsNode0.x().c(SemanticsProperties.a.c()) && semanticsNode0.x().c(SemanticsProperties.a.e());
    }

    public final boolean d0() {
        if(!this.g) {
            if(this.f.isEnabled()) {
                List list0 = this.j;
                L.o(list0, "enabledServices");
                return !list0.isEmpty();
            }
            return false;
        }
        return true;
    }

    @VisibleForTesting
    public static void e0() {
    }

    // 去混淆评级： 低(30)
    private final boolean f0() {
        return this.g || this.f.isEnabled() && this.f.isTouchExplorationEnabled();
    }

    private final void g0(LayoutNode layoutNode0) {
        if(this.r.add(layoutNode0)) {
            this.s.l(S0.a);
        }
    }

    public final void h0(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "layoutNode");
        this.t = true;
        if(!this.d0()) {
            return;
        }
        this.g0(layoutNode0);
    }

    public final void i0() {
        this.t = true;
        if(this.d0() && !this.D) {
            this.D = true;
            this.k.post(this.E);
        }
    }

    private final boolean j0(int v, int v1, Bundle bundle0) {
        int v5;
        float f4;
        AccessibilityAction accessibilityAction9;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.O().get(v);
        boolean z = false;
        if(semanticsNodeWithAdjustedBounds0 != null) {
            SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0.b();
            if(semanticsNode0 != null) {
                switch(v1) {
                    case 0x40: {
                        return this.q0(v);
                    }
                    case 0x80: {
                        return this.D(v);
                    }
                    case 0x100: 
                    case 0x200: {
                        if(bundle0 != null) {
                            int v8 = bundle0.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                            boolean z2 = bundle0.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                            if(v1 == 0x100) {
                                z = true;
                            }
                            return this.R0(semanticsNode0, v8, z, z2);
                        }
                        return false;
                    }
                    case 0x4000: {
                        AccessibilityAction accessibilityAction17 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.b());
                        if(accessibilityAction17 != null) {
                            A3.a a12 = (A3.a)accessibilityAction17.a();
                            return a12 == null ? false : ((Boolean)a12.invoke()).booleanValue();
                        }
                        return false;
                    }
                    default: {
                        String s = null;
                        int v2 = -1;
                        if(v1 != 0x20000) {
                            if(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode0)) {
                                return false;
                            }
                            switch(v1) {
                                case 1: {
                                    AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.o());
                                    if(accessibilityAction0 != null) {
                                        A3.a a0 = (A3.a)accessibilityAction0.a();
                                        return a0 == null ? false : ((Boolean)a0.invoke()).booleanValue();
                                    }
                                    return false;
                                }
                                case 2: {
                                    if(L.g(SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsProperties.a.g()), Boolean.TRUE)) {
                                        b.a(this.d.getFocusOwner(), false, 1, null);
                                        return true;
                                    }
                                    return false;
                                }
                                case 16: {
                                    AccessibilityAction accessibilityAction1 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.h());
                                    if(accessibilityAction1 != null) {
                                        A3.a a1 = (A3.a)accessibilityAction1.a();
                                        if(a1 != null) {
                                            s = (Boolean)a1.invoke();
                                        }
                                    }
                                    AndroidComposeViewAccessibilityDelegateCompat.w0(this, v, 1, null, null, 12, null);
                                    return s == null ? false : ((Boolean)s).booleanValue();
                                }
                                case 0x20: {
                                    AccessibilityAction accessibilityAction2 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.i());
                                    if(accessibilityAction2 != null) {
                                        A3.a a2 = (A3.a)accessibilityAction2.a();
                                        return a2 == null ? false : ((Boolean)a2.invoke()).booleanValue();
                                    }
                                    return false;
                                }
                                case 0x1000: 
                                case 0x2000: {
                                    break;
                                }
                                case 0x8000: {
                                    AccessibilityAction accessibilityAction3 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.n());
                                    if(accessibilityAction3 != null) {
                                        A3.a a3 = (A3.a)accessibilityAction3.a();
                                        return a3 == null ? false : ((Boolean)a3.invoke()).booleanValue();
                                    }
                                    return false;
                                }
                                case 0x10000: {
                                    AccessibilityAction accessibilityAction4 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.d());
                                    if(accessibilityAction4 != null) {
                                        A3.a a4 = (A3.a)accessibilityAction4.a();
                                        return a4 == null ? false : ((Boolean)a4.invoke()).booleanValue();
                                    }
                                    return false;
                                }
                                case 0x40000: {
                                    AccessibilityAction accessibilityAction5 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.f());
                                    if(accessibilityAction5 != null) {
                                        A3.a a5 = (A3.a)accessibilityAction5.a();
                                        return a5 == null ? false : ((Boolean)a5.invoke()).booleanValue();
                                    }
                                    return false;
                                }
                                case 0x80000: {
                                    AccessibilityAction accessibilityAction6 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.a());
                                    if(accessibilityAction6 != null) {
                                        A3.a a6 = (A3.a)accessibilityAction6.a();
                                        return a6 == null ? false : ((Boolean)a6.invoke()).booleanValue();
                                    }
                                    return false;
                                }
                                case 0x100000: {
                                    AccessibilityAction accessibilityAction7 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.e());
                                    if(accessibilityAction7 != null) {
                                        A3.a a7 = (A3.a)accessibilityAction7.a();
                                        return a7 == null ? false : ((Boolean)a7.invoke()).booleanValue();
                                    }
                                    return false;
                                }
                                case 0x200000: {
                                    if(bundle0 != null) {
                                        s = bundle0.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                                    }
                                    AccessibilityAction accessibilityAction8 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.t());
                                    if(accessibilityAction8 != null) {
                                        Function1 function10 = (Function1)accessibilityAction8.a();
                                        if(function10 != null) {
                                            if(s == null) {
                                                s = "";
                                            }
                                            return ((Boolean)function10.invoke(new AnnotatedString(s, null, null, 6, null))).booleanValue();
                                        }
                                    }
                                    return false;
                                }
                                case 0x1020036: {
                                    SemanticsNode semanticsNode1 = semanticsNode0.q();
                                    if(semanticsNode1 != null) {
                                        SemanticsConfiguration semanticsConfiguration0 = semanticsNode1.k();
                                        if(semanticsConfiguration0 != null) {
                                            accessibilityAction9 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsConfiguration0, SemanticsActions.a.p());
                                            goto label_76;
                                        }
                                    }
                                alab1:
                                    while(true) {
                                        while(true) {
                                            accessibilityAction9 = null;
                                        label_76:
                                            if(semanticsNode1 == null || accessibilityAction9 != null) {
                                                break alab1;
                                            }
                                            semanticsNode1 = semanticsNode1.q();
                                            if(semanticsNode1 == null) {
                                                break;
                                            }
                                            SemanticsConfiguration semanticsConfiguration1 = semanticsNode1.k();
                                            if(semanticsConfiguration1 == null) {
                                                break;
                                            }
                                            accessibilityAction9 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsConfiguration1, SemanticsActions.a.p());
                                            goto label_76;
                                        }
                                    }
                                    if(semanticsNode1 == null) {
                                        return false;
                                    }
                                    androidx.compose.ui.geometry.Rect rect0 = LayoutCoordinatesKt.a(semanticsNode1.m().v());
                                    LayoutCoordinates layoutCoordinates0 = semanticsNode1.m().v().K();
                                    androidx.compose.ui.geometry.Rect rect1 = rect0.S((layoutCoordinates0 == null ? 0L : LayoutCoordinatesKt.f(layoutCoordinates0)));
                                    androidx.compose.ui.geometry.Rect rect2 = RectKt.c(semanticsNode0.r(), IntSizeKt.f(semanticsNode0.v()));
                                    ScrollAxisRange scrollAxisRange0 = (ScrollAxisRange)SemanticsConfigurationKt.a(semanticsNode1.x(), SemanticsProperties.a.i());
                                    ScrollAxisRange scrollAxisRange1 = (ScrollAxisRange)SemanticsConfigurationKt.a(semanticsNode1.x(), SemanticsProperties.a.C());
                                    float f = AndroidComposeViewAccessibilityDelegateCompat.l0(rect2.t() - rect1.t(), rect2.x() - rect1.x());
                                    if(scrollAxisRange0 != null && scrollAxisRange0.b()) {
                                        f = -f;
                                    }
                                    if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.y(semanticsNode0)) {
                                        f = -f;
                                    }
                                    float f1 = scrollAxisRange1 == null || !scrollAxisRange1.b() ? AndroidComposeViewAccessibilityDelegateCompat.l0(rect2.B() - rect1.B(), rect2.j() - rect1.j()) : -AndroidComposeViewAccessibilityDelegateCompat.l0(rect2.B() - rect1.B(), rect2.j() - rect1.j());
                                    if(accessibilityAction9 != null) {
                                        A3.o o0 = (A3.o)accessibilityAction9.a();
                                        return o0 == null ? false : ((Boolean)o0.invoke(f, f1)).booleanValue();
                                    }
                                    return false;
                                }
                                case 0x102003D: {
                                    if(bundle0 != null && bundle0.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                        AccessibilityAction accessibilityAction10 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.r());
                                        if(accessibilityAction10 != null) {
                                            Function1 function11 = (Function1)accessibilityAction10.a();
                                            return function11 == null ? false : ((Boolean)function11.invoke(bundle0.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))).booleanValue();
                                        }
                                    }
                                    return false;
                                label_107:
                                    if(v1 != 0x1020038 && v1 != 0x1020039 && v1 != 0x102003A && v1 != 0x102003B) {
                                        switch(v1) {
                                            case 0x1020046: {
                                                AccessibilityAction accessibilityAction11 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.m());
                                                if(accessibilityAction11 != null) {
                                                    A3.a a8 = (A3.a)accessibilityAction11.a();
                                                    return a8 == null ? false : ((Boolean)a8.invoke()).booleanValue();
                                                }
                                                return false;
                                            }
                                            case 0x1020047: {
                                                AccessibilityAction accessibilityAction12 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.j());
                                                if(accessibilityAction12 != null) {
                                                    A3.a a9 = (A3.a)accessibilityAction12.a();
                                                    return a9 == null ? false : ((Boolean)a9.invoke()).booleanValue();
                                                }
                                                return false;
                                            }
                                            case 0x1020048: {
                                                AccessibilityAction accessibilityAction13 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.k());
                                                if(accessibilityAction13 != null) {
                                                    A3.a a10 = (A3.a)accessibilityAction13.a();
                                                    return a10 == null ? false : ((Boolean)a10.invoke()).booleanValue();
                                                }
                                                return false;
                                            }
                                            case 0x1020049: {
                                                AccessibilityAction accessibilityAction14 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.l());
                                                if(accessibilityAction14 != null) {
                                                    A3.a a11 = (A3.a)accessibilityAction14.a();
                                                    return a11 == null ? false : ((Boolean)a11.invoke()).booleanValue();
                                                }
                                                return false;
                                            }
                                            default: {
                                                SparseArrayCompat sparseArrayCompat0 = (SparseArrayCompat)this.n.g(v);
                                                if(sparseArrayCompat0 != null) {
                                                    CharSequence charSequence0 = (CharSequence)sparseArrayCompat0.g(v1);
                                                    if(charSequence0 != null) {
                                                        List list0 = (List)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.c());
                                                        if(list0 == null) {
                                                            return false;
                                                        }
                                                        int v3 = list0.size();
                                                        for(int v4 = 0; v4 < v3; ++v4) {
                                                            CustomAccessibilityAction customAccessibilityAction0 = (CustomAccessibilityAction)list0.get(v4);
                                                            if(L.g(customAccessibilityAction0.b(), charSequence0)) {
                                                                return ((Boolean)customAccessibilityAction0.a().invoke()).booleanValue();
                                                            }
                                                        }
                                                    }
                                                }
                                                return false;
                                            }
                                        }
                                    }
                                    break;
                                }
                                default: {
                                    goto label_107;
                                }
                            }
                            if(v1 == 0x1000 || v1 == 0x2000) {
                                ProgressBarRangeInfo progressBarRangeInfo0 = (ProgressBarRangeInfo)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsProperties.a.t());
                                AccessibilityAction accessibilityAction15 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.r());
                                if(progressBarRangeInfo0 != null && accessibilityAction15 != null) {
                                    float f2 = s.t(((Number)progressBarRangeInfo0.c().d()).floatValue(), ((Number)progressBarRangeInfo0.c().getStart()).floatValue());
                                    float f3 = s.A(((Number)progressBarRangeInfo0.c().getStart()).floatValue(), ((Number)progressBarRangeInfo0.c().d()).floatValue());
                                    if(progressBarRangeInfo0.d() > 0) {
                                        f4 = f2 - f3;
                                        v5 = progressBarRangeInfo0.d() + 1;
                                    }
                                    else {
                                        f4 = f2 - f3;
                                        v5 = 20;
                                    }
                                    float f5 = f4 / ((float)v5);
                                    if(v1 == 0x2000) {
                                        f5 = -f5;
                                    }
                                    Function1 function12 = (Function1)accessibilityAction15.a();
                                    return function12 == null ? false : ((Boolean)function12.invoke(((float)(progressBarRangeInfo0.b() + f5)))).booleanValue();
                                }
                            }
                            long v6 = LayoutCoordinatesKt.a(semanticsNode0.m().v()).z();
                            AccessibilityAction accessibilityAction16 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), SemanticsActions.a.p());
                            if(accessibilityAction16 == null) {
                                return false;
                            }
                            SemanticsProperties semanticsProperties0 = SemanticsProperties.a;
                            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties0.i());
                            if(scrollAxisRange2 != null && (v1 == 0x1020039 || v1 == 0x102003B || v1 == 0x1000 || v1 == 0x2000)) {
                                float f6 = Size.t(v6);
                                if(v1 == 0x1020039 || v1 == 0x2000) {
                                    f6 = -f6;
                                }
                                if(scrollAxisRange2.b()) {
                                    f6 = -f6;
                                }
                                if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.y(semanticsNode0) && (v1 == 0x1020039 || v1 == 0x102003B)) {
                                    f6 = -f6;
                                }
                                if(AndroidComposeViewAccessibilityDelegateCompat.k0(scrollAxisRange2, f6)) {
                                    A3.o o1 = (A3.o)accessibilityAction16.a();
                                    return o1 == null ? false : ((Boolean)o1.invoke(f6, 0.0f)).booleanValue();
                                }
                            }
                            ScrollAxisRange scrollAxisRange3 = (ScrollAxisRange)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties0.C());
                            if(scrollAxisRange3 != null && (v1 == 0x1020038 || v1 == 0x102003A || v1 == 0x1000 || v1 == 0x2000)) {
                                float f7 = Size.m(v6);
                                if(v1 == 0x1020038 || v1 == 0x2000) {
                                    f7 = -f7;
                                }
                                if(scrollAxisRange3.b()) {
                                    f7 = -f7;
                                }
                                if(AndroidComposeViewAccessibilityDelegateCompat.k0(scrollAxisRange3, f7)) {
                                    A3.o o2 = (A3.o)accessibilityAction16.a();
                                    return o2 == null ? false : ((Boolean)o2.invoke(0.0f, f7)).booleanValue();
                                }
                            }
                            return false;
                        }
                        int v7 = bundle0 == null ? -1 : bundle0.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                        if(bundle0 != null) {
                            v2 = bundle0.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1);
                        }
                        boolean z1 = this.E0(semanticsNode0, v7, v2, false);
                        if(z1) {
                            AndroidComposeViewAccessibilityDelegateCompat.w0(this, this.t0(semanticsNode0.l()), 0, null, null, 12, null);
                        }
                        return z1;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean k0(ScrollAxisRange scrollAxisRange0, float f) {
        return f < 0.0f && ((Number)scrollAxisRange0.c().invoke()).floatValue() > 0.0f || f > 0.0f && ((Number)scrollAxisRange0.c().invoke()).floatValue() < ((Number)scrollAxisRange0.a().invoke()).floatValue();
    }

    private static final float l0(float f, float f1) {
        if(Math.signum(f) == Math.signum(f1)) {
            return Math.abs(f) < Math.abs(f1) ? f : f1;
        }
        return 0.0f;
    }

    @VisibleForTesting
    public final void m0(int v, @l AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, @l SemanticsNode semanticsNode0) {
        Map map1;
        String s;
        L.p(accessibilityNodeInfoCompat0, "info");
        L.p(semanticsNode0, "semanticsNode");
        boolean z = !semanticsNode0.y() && semanticsNode0.t().isEmpty() && AndroidComposeViewAccessibilityDelegateCompat_androidKt.q(semanticsNode0.n(), androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties.isUnmergedLeafNode.1.e) == null;
        accessibilityNodeInfoCompat0.k1("android.view.View");
        SemanticsProperties semanticsProperties0 = SemanticsProperties.a;
        Role role0 = (Role)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties0.u());
        if(role0 != null) {
            int v1 = role0.n();
            if(semanticsNode0.y() || semanticsNode0.t().isEmpty()) {
                if(Role.k(role0.n(), 4)) {
                    accessibilityNodeInfoCompat0.X1(this.d.getContext().getResources().getString(string.tab));
                }
                else if(Role.k(role0.n(), 2)) {
                    accessibilityNodeInfoCompat0.X1(this.d.getContext().getResources().getString(string.switch_role));
                }
                else {
                    if(Role.k(v1, 0)) {
                        s = "android.widget.Button";
                    }
                    else if(Role.k(v1, 1)) {
                        s = "android.widget.CheckBox";
                    }
                    else if(Role.k(v1, 3)) {
                        s = "android.widget.RadioButton";
                    }
                    else if(Role.k(v1, 5)) {
                        s = "android.widget.ImageView";
                    }
                    else {
                        s = Role.k(v1, 6) ? "android.widget.Spinner" : null;
                    }
                    if(!Role.k(role0.n(), 5) || z || semanticsNode0.x().k()) {
                        accessibilityNodeInfoCompat0.k1(s);
                    }
                }
            }
        }
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.A(semanticsNode0)) {
            accessibilityNodeInfoCompat0.k1("android.widget.EditText");
        }
        if(semanticsNode0.k().c(semanticsProperties0.z())) {
            accessibilityNodeInfoCompat0.k1("android.widget.TextView");
        }
        accessibilityNodeInfoCompat0.P1("com.dcinside.app.android");
        accessibilityNodeInfoCompat0.D1(true);
        List list0 = semanticsNode0.t();
        int v2 = list0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            SemanticsNode semanticsNode1 = (SemanticsNode)list0.get(v3);
            if(this.O().containsKey(semanticsNode1.l())) {
                AndroidViewHolder androidViewHolder0 = (AndroidViewHolder)this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode1.n());
                if(androidViewHolder0 == null) {
                    accessibilityNodeInfoCompat0.d(this.d, semanticsNode1.l());
                }
                else {
                    accessibilityNodeInfoCompat0.c(androidViewHolder0);
                }
            }
        }
        if(this.m == v) {
            accessibilityNodeInfoCompat0.b1(true);
            accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.m);
        }
        else {
            accessibilityNodeInfoCompat0.b1(false);
            accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.l);
        }
        this.I0(semanticsNode0, accessibilityNodeInfoCompat0);
        this.F0(semanticsNode0, accessibilityNodeInfoCompat0);
        SemanticsProperties semanticsProperties1 = SemanticsProperties.a;
        accessibilityNodeInfoCompat0.e2(((CharSequence)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties1.x())));
        ToggleableState toggleableState0 = (ToggleableState)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties1.B());
        int v4 = 2;
        if(toggleableState0 != null) {
            accessibilityNodeInfoCompat0.i1(true);
            int v5 = WhenMappings.a[toggleableState0.ordinal()];
            switch(v5) {
                case 1: {
                    accessibilityNodeInfoCompat0.j1(true);
                    if((role0 == null ? false : Role.k(role0.n(), 2)) && accessibilityNodeInfoCompat0.Z() == null) {
                        accessibilityNodeInfoCompat0.e2(this.d.getContext().getResources().getString(string.on));
                    }
                    break;
                }
                case 2: {
                    accessibilityNodeInfoCompat0.j1(false);
                    if((role0 == null ? false : Role.k(role0.n(), 2)) && accessibilityNodeInfoCompat0.Z() == null) {
                        accessibilityNodeInfoCompat0.e2(this.d.getContext().getResources().getString(string.off));
                    }
                    break;
                }
                default: {
                    if(v5 == 3 && accessibilityNodeInfoCompat0.Z() == null) {
                        accessibilityNodeInfoCompat0.e2(this.d.getContext().getResources().getString(string.indeterminate));
                    }
                }
            }
        }
        Boolean boolean0 = (Boolean)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties1.w());
        if(boolean0 != null) {
            boolean z1 = boolean0.booleanValue();
            if((role0 == null ? false : Role.k(role0.n(), 4))) {
                accessibilityNodeInfoCompat0.a2(z1);
            }
            else {
                accessibilityNodeInfoCompat0.i1(true);
                accessibilityNodeInfoCompat0.j1(z1);
                if(accessibilityNodeInfoCompat0.Z() == null) {
                    accessibilityNodeInfoCompat0.e2((z1 ? this.d.getContext().getResources().getString(string.selected) : this.d.getContext().getResources().getString(string.not_selected)));
                }
            }
        }
        if(!semanticsNode0.x().k() || semanticsNode0.t().isEmpty()) {
            List list1 = (List)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties1.c());
            accessibilityNodeInfoCompat0.p1((list1 == null ? null : ((String)u.G2(list1))));
        }
        String s1 = (String)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties1.y());
        if(s1 != null) {
            for(SemanticsNode semanticsNode2 = semanticsNode0; true; semanticsNode2 = semanticsNode2.q()) {
                boolean z2 = false;
                if(semanticsNode2 == null) {
                    break;
                }
                SemanticsPropertiesAndroid semanticsPropertiesAndroid0 = SemanticsPropertiesAndroid.a;
                if(semanticsNode2.x().c(semanticsPropertiesAndroid0.a())) {
                    z2 = ((Boolean)semanticsNode2.x().g(semanticsPropertiesAndroid0.a())).booleanValue();
                    break;
                }
            }
            if(z2) {
                accessibilityNodeInfoCompat0.q2(s1);
            }
        }
        SemanticsProperties semanticsProperties2 = SemanticsProperties.a;
        if(((S0)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties2.h())) != null) {
            accessibilityNodeInfoCompat0.B1(true);
        }
        accessibilityNodeInfoCompat0.T1(AndroidComposeViewAccessibilityDelegateCompat_androidKt.x(semanticsNode0));
        accessibilityNodeInfoCompat0.u1(AndroidComposeViewAccessibilityDelegateCompat_androidKt.A(semanticsNode0));
        accessibilityNodeInfoCompat0.v1(AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode0));
        accessibilityNodeInfoCompat0.y1(semanticsNode0.x().c(semanticsProperties2.g()));
        if(accessibilityNodeInfoCompat0.z0()) {
            accessibilityNodeInfoCompat0.z1(((Boolean)semanticsNode0.x().g(semanticsProperties2.g())).booleanValue());
            if(accessibilityNodeInfoCompat0.A0()) {
                accessibilityNodeInfoCompat0.a(2);
            }
            else {
                accessibilityNodeInfoCompat0.a(1);
            }
        }
        accessibilityNodeInfoCompat0.r2(AndroidComposeViewAccessibilityDelegateCompat_androidKt.B(semanticsNode0));
        LiveRegionMode liveRegionMode0 = (LiveRegionMode)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties2.q());
        if(liveRegionMode0 != null) {
            int v6 = liveRegionMode0.i();
            if(LiveRegionMode.f(v6, 0)) {
                v4 = 1;
            }
            else if(!LiveRegionMode.f(v6, 1)) {
                v4 = 1;
            }
            accessibilityNodeInfoCompat0.J1(v4);
        }
        accessibilityNodeInfoCompat0.l1(false);
        SemanticsActions semanticsActions0 = SemanticsActions.a;
        AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.h());
        if(accessibilityAction0 != null) {
            boolean z3 = L.g(SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties2.w()), Boolean.TRUE);
            accessibilityNodeInfoCompat0.l1(!z3);
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode0) && !z3) {
                accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(16, accessibilityAction0.b()));
            }
        }
        accessibilityNodeInfoCompat0.K1(false);
        AccessibilityAction accessibilityAction1 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.i());
        if(accessibilityAction1 != null) {
            accessibilityNodeInfoCompat0.K1(true);
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode0)) {
                accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x20, accessibilityAction1.b()));
            }
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.b());
        if(accessibilityAction2 != null) {
            accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x4000, accessibilityAction2.b()));
        }
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode0)) {
            AccessibilityAction accessibilityAction3 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.t());
            if(accessibilityAction3 != null) {
                accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x200000, accessibilityAction3.b()));
            }
            AccessibilityAction accessibilityAction4 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.d());
            if(accessibilityAction4 != null) {
                accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x10000, accessibilityAction4.b()));
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.n());
            if(accessibilityAction5 != null && accessibilityNodeInfoCompat0.A0() && this.d.getClipboardManager().b()) {
                accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x8000, accessibilityAction5.b()));
            }
        }
        String s2 = this.S(semanticsNode0);
        if(s2 != null && s2.length() != 0) {
            accessibilityNodeInfoCompat0.i2(this.N(semanticsNode0), this.M(semanticsNode0));
            AccessibilityAction accessibilityAction6 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.s());
            accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x20000, (accessibilityAction6 == null ? null : accessibilityAction6.b())));
            accessibilityNodeInfoCompat0.a(0x100);
            accessibilityNodeInfoCompat0.a(0x200);
            accessibilityNodeInfoCompat0.N1(11);
            Collection collection0 = (List)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties2.c());
            if((collection0 == null || collection0.isEmpty()) && semanticsNode0.x().c(semanticsActions0.g()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode0)) {
                accessibilityNodeInfoCompat0.N1(accessibilityNodeInfoCompat0.Q() | 20);
            }
        }
        int v7 = Build.VERSION.SDK_INT;
        if(v7 >= 26) {
            ArrayList arrayList0 = new ArrayList();
            CharSequence charSequence0 = accessibilityNodeInfoCompat0.a0();
            if(charSequence0 != null && charSequence0.length() != 0 && semanticsNode0.x().c(semanticsActions0.g())) {
                arrayList0.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if(semanticsNode0.x().c(semanticsProperties2.y())) {
                arrayList0.add("androidx.compose.ui.semantics.testTag");
            }
            if(!arrayList0.isEmpty()) {
                AccessibilityNodeInfo accessibilityNodeInfo0 = accessibilityNodeInfoCompat0.s2();
                L.o(accessibilityNodeInfo0, "info.unwrap()");
                AccessibilityNodeInfoVerificationHelperMethods.a.a(accessibilityNodeInfo0, arrayList0);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo0 = (ProgressBarRangeInfo)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties2.t());
        if(progressBarRangeInfo0 != null) {
            if(semanticsNode0.x().c(semanticsActions0.r())) {
                accessibilityNodeInfoCompat0.k1("android.widget.SeekBar");
            }
            else {
                accessibilityNodeInfoCompat0.k1("android.widget.ProgressBar");
            }
            if(progressBarRangeInfo0 != ProgressBarRangeInfo.d.a()) {
                accessibilityNodeInfoCompat0.V1(RangeInfoCompat.e(1, ((Number)progressBarRangeInfo0.c().getStart()).floatValue(), ((Number)progressBarRangeInfo0.c().d()).floatValue(), progressBarRangeInfo0.b()));
                if(accessibilityNodeInfoCompat0.Z() == null) {
                    int v8 = 100;
                    f f0 = progressBarRangeInfo0.c();
                    float f1 = s.H((((Number)f0.d()).floatValue() - ((Number)f0.getStart()).floatValue() == 0.0f ? 0.0f : (progressBarRangeInfo0.b() - ((Number)f0.getStart()).floatValue()) / (((Number)f0.d()).floatValue() - ((Number)f0.getStart()).floatValue())), 0.0f, 1.0f);
                    if(f1 == 0.0f) {
                        v8 = 0;
                    }
                    else if(f1 != 1.0f) {
                        v8 = s.I(kotlin.math.b.L0(f1 * 100.0f), 1, 99);
                    }
                    accessibilityNodeInfoCompat0.e2(this.d.getContext().getResources().getString(string.template_percent, new Object[]{v8}));
                }
            }
            else if(accessibilityNodeInfoCompat0.Z() == null) {
                accessibilityNodeInfoCompat0.e2(this.d.getContext().getResources().getString(string.in_progress));
            }
            if(semanticsNode0.x().c(semanticsActions0.r()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode0)) {
                if(progressBarRangeInfo0.b() < s.t(((Number)progressBarRangeInfo0.c().d()).floatValue(), ((Number)progressBarRangeInfo0.c().getStart()).floatValue())) {
                    accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.r);
                }
                if(progressBarRangeInfo0.b() > s.A(((Number)progressBarRangeInfo0.c().getStart()).floatValue(), ((Number)progressBarRangeInfo0.c().d()).floatValue())) {
                    accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.s);
                }
            }
        }
        if(v7 >= 24) {
            Api24Impl.a(accessibilityNodeInfoCompat0, semanticsNode0);
        }
        CollectionInfoKt.d(semanticsNode0, accessibilityNodeInfoCompat0);
        CollectionInfoKt.e(semanticsNode0, accessibilityNodeInfoCompat0);
        ScrollAxisRange scrollAxisRange0 = (ScrollAxisRange)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties2.i());
        AccessibilityAction accessibilityAction7 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.p());
        if(scrollAxisRange0 != null && accessibilityAction7 != null) {
            if(!CollectionInfoKt.b(semanticsNode0)) {
                accessibilityNodeInfoCompat0.k1("android.widget.HorizontalScrollView");
            }
            if(((Number)scrollAxisRange0.a().invoke()).floatValue() > 0.0f) {
                accessibilityNodeInfoCompat0.Z1(true);
            }
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode0)) {
                if(AndroidComposeViewAccessibilityDelegateCompat.o0(scrollAxisRange0)) {
                    accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.r);
                    accessibilityNodeInfoCompat0.b((AndroidComposeViewAccessibilityDelegateCompat_androidKt.y(semanticsNode0) ? AccessibilityActionCompat.E : AccessibilityActionCompat.G));
                }
                if(AndroidComposeViewAccessibilityDelegateCompat.n0(scrollAxisRange0)) {
                    accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.s);
                    accessibilityNodeInfoCompat0.b((AndroidComposeViewAccessibilityDelegateCompat_androidKt.y(semanticsNode0) ? AccessibilityActionCompat.G : AccessibilityActionCompat.E));
                }
            }
        }
        ScrollAxisRange scrollAxisRange1 = (ScrollAxisRange)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties2.C());
        if(scrollAxisRange1 != null && accessibilityAction7 != null) {
            if(!CollectionInfoKt.b(semanticsNode0)) {
                accessibilityNodeInfoCompat0.k1("android.widget.ScrollView");
            }
            if(((Number)scrollAxisRange1.a().invoke()).floatValue() > 0.0f) {
                accessibilityNodeInfoCompat0.Z1(true);
            }
            if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode0)) {
                if(AndroidComposeViewAccessibilityDelegateCompat.o0(scrollAxisRange1)) {
                    accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.r);
                    accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.F);
                }
                if(AndroidComposeViewAccessibilityDelegateCompat.n0(scrollAxisRange1)) {
                    accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.s);
                    accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.D);
                }
            }
        }
        if(v7 >= 29) {
            Api29Impl.a(accessibilityNodeInfoCompat0, semanticsNode0);
        }
        accessibilityNodeInfoCompat0.Q1(((CharSequence)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties2.r())));
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode0)) {
            AccessibilityAction accessibilityAction8 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.f());
            if(accessibilityAction8 != null) {
                accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x40000, accessibilityAction8.b()));
            }
            AccessibilityAction accessibilityAction9 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.a());
            if(accessibilityAction9 != null) {
                accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x80000, accessibilityAction9.b()));
            }
            AccessibilityAction accessibilityAction10 = (AccessibilityAction)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsActions0.e());
            if(accessibilityAction10 != null) {
                accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(0x100000, accessibilityAction10.b()));
            }
            if(semanticsNode0.x().c(semanticsActions0.c())) {
                List list2 = (List)semanticsNode0.x().g(semanticsActions0.c());
                int[] arr_v = AndroidComposeViewAccessibilityDelegateCompat.T;
                if(list2.size() >= arr_v.length) {
                    throw new IllegalStateException("Can\'t have more than " + arr_v.length + " custom actions for one widget");
                }
                SparseArrayCompat sparseArrayCompat0 = new SparseArrayCompat();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                if(this.o.d(v)) {
                    Map map0 = (Map)this.o.g(v);
                    List list3 = kotlin.collections.l.Sy(arr_v);
                    ArrayList arrayList1 = new ArrayList();
                    int v9 = list2.size();
                    int v10 = 0;
                    while(v10 < v9) {
                        CustomAccessibilityAction customAccessibilityAction0 = (CustomAccessibilityAction)list2.get(v10);
                        L.m(map0);
                        if(map0.containsKey(customAccessibilityAction0.b())) {
                            Integer integer0 = (Integer)map0.get(customAccessibilityAction0.b());
                            L.m(integer0);
                            map1 = map0;
                            sparseArrayCompat0.o(((int)integer0), customAccessibilityAction0.b());
                            linkedHashMap0.put(customAccessibilityAction0.b(), integer0);
                            list3.remove(integer0);
                            accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(((int)integer0), customAccessibilityAction0.b()));
                        }
                        else {
                            map1 = map0;
                            arrayList1.add(customAccessibilityAction0);
                        }
                        ++v10;
                        map0 = map1;
                    }
                    int v11 = arrayList1.size();
                    for(int v12 = 0; v12 < v11; ++v12) {
                        CustomAccessibilityAction customAccessibilityAction1 = (CustomAccessibilityAction)arrayList1.get(v12);
                        int v13 = ((Number)list3.get(v12)).intValue();
                        sparseArrayCompat0.o(v13, customAccessibilityAction1.b());
                        linkedHashMap0.put(customAccessibilityAction1.b(), v13);
                        accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(v13, customAccessibilityAction1.b()));
                    }
                }
                else {
                    int v14 = list2.size();
                    for(int v15 = 0; v15 < v14; ++v15) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction)list2.get(v15);
                        int v16 = AndroidComposeViewAccessibilityDelegateCompat.T[v15];
                        sparseArrayCompat0.o(v16, customAccessibilityAction2.b());
                        linkedHashMap0.put(customAccessibilityAction2.b(), v16);
                        accessibilityNodeInfoCompat0.b(new AccessibilityActionCompat(v16, customAccessibilityAction2.b()));
                    }
                }
                this.n.o(v, sparseArrayCompat0);
                this.o.o(v, linkedHashMap0);
            }
        }
        accessibilityNodeInfoCompat0.Y1(semanticsNode0.x().k() || z && (accessibilityNodeInfoCompat0.D() != null || accessibilityNodeInfoCompat0.a0() != null || accessibilityNodeInfoCompat0.I() != null || accessibilityNodeInfoCompat0.Z() != null || accessibilityNodeInfoCompat0.q0()));
        if(this.x.get(v) != null) {
            Integer integer1 = (Integer)this.x.get(v);
            if(integer1 != null) {
                accessibilityNodeInfoCompat0.o2(this.d, ((int)integer1));
            }
            AccessibilityNodeInfo accessibilityNodeInfo1 = accessibilityNodeInfoCompat0.s2();
            L.o(accessibilityNodeInfo1, "info.unwrap()");
            this.y(v, accessibilityNodeInfo1, this.z, null);
        }
        if(this.y.get(v) != null) {
            Integer integer2 = (Integer)this.y.get(v);
            if(integer2 != null) {
                accessibilityNodeInfoCompat0.m2(this.d, ((int)integer2));
            }
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat0.s2();
            L.o(accessibilityNodeInfo2, "info.unwrap()");
            this.y(v, accessibilityNodeInfo2, this.A, null);
        }

        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties.isUnmergedLeafNode.1 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties.isUnmergedLeafNode.1 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties.isUnmergedLeafNode.1.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties.isUnmergedLeafNode.1();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties.isUnmergedLeafNode.1() {
                super(1);
            }

            @l
            public final Boolean a(@l LayoutNode layoutNode0) {
                L.p(layoutNode0, "it");
                SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.j(layoutNode0);
                boolean z = false;
                if(semanticsModifierNode0 != null) {
                    SemanticsConfiguration semanticsConfiguration0 = SemanticsModifierNodeKt.a(semanticsModifierNode0);
                    if(semanticsConfiguration0 != null && semanticsConfiguration0.k()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((LayoutNode)object0));
            }
        }

    }

    // 去混淆评级： 低(20)
    private static final boolean n0(ScrollAxisRange scrollAxisRange0) {
        return ((Number)scrollAxisRange0.c().invoke()).floatValue() > 0.0f && !scrollAxisRange0.b() || ((Number)scrollAxisRange0.c().invoke()).floatValue() < ((Number)scrollAxisRange0.a().invoke()).floatValue() && scrollAxisRange0.b();
    }

    // 去混淆评级： 低(20)
    private static final boolean o0(ScrollAxisRange scrollAxisRange0) {
        return ((Number)scrollAxisRange0.c().invoke()).floatValue() < ((Number)scrollAxisRange0.a().invoke()).floatValue() && !scrollAxisRange0.b() || ((Number)scrollAxisRange0.c().invoke()).floatValue() > 0.0f && scrollAxisRange0.b();
    }

    private final boolean p0(int v, List list0) {
        boolean z;
        ScrollObservationScope scrollObservationScope0 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(list0, v);
        if(scrollObservationScope0 == null) {
            scrollObservationScope0 = new ScrollObservationScope(v, this.F, null, null, null, null);
            z = true;
        }
        else {
            z = false;
        }
        this.F.add(scrollObservationScope0);
        return z;
    }

    private final boolean q0(int v) {
        if(!this.f0()) {
            return false;
        }
        if(!this.b0(v)) {
            int v1 = this.m;
            if(v1 != 0x80000000) {
                AndroidComposeViewAccessibilityDelegateCompat.w0(this, v1, 0x10000, null, null, 12, null);
            }
            this.m = v;
            this.d.invalidate();
            AndroidComposeViewAccessibilityDelegateCompat.w0(this, v, 0x8000, null, null, 12, null);
            return true;
        }
        return false;
    }

    private final Comparator r0(boolean z) {
        Comparator comparator0 = a.h(new Function1[]{androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.1.e, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.2.e, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.3.e, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.4.e});
        if(z) {
            comparator0 = a.h(new Function1[]{androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.1.e, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.2.e, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.3.e, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.4.e});
        }
        return new Comparator() {
            @Override
            public final int compare(Object object0, Object object1) {
                int v = this.a.compare(object0, object1);
                return v == 0 ? a.l(((SemanticsNode)object0).l(), ((SemanticsNode)object1).l()) : v;
            }
        };

        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n+ 2 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n1#1,328:1\n542#2:329\n*E\n"})
        public final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator..inlined.thenBy.1 implements Comparator {
            public androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator..inlined.thenBy.1(Comparator comparator0, Comparator comparator1) {
            }

            @Override
            public final int compare(Object object0, Object object1) {
                int v = this.a.compare(object0, object1);
                return v == 0 ? this.b.compare(((SemanticsNode)object0).n(), ((SemanticsNode)object1).n()) : v;
            }
        }


        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.1 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.1 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.1.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.1();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.1() {
                super(1);
            }

            @m
            public final Comparable a(@l SemanticsNode semanticsNode0) {
                L.p(semanticsNode0, "it");
                return semanticsNode0.h().x();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SemanticsNode)object0));
            }
        }


        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.2 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.2 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.2.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.2();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.2() {
                super(1);
            }

            @m
            public final Comparable a(@l SemanticsNode semanticsNode0) {
                L.p(semanticsNode0, "it");
                return semanticsNode0.h().B();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SemanticsNode)object0));
            }
        }


        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.3 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.3 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.3.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.3();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.3() {
                super(1);
            }

            @m
            public final Comparable a(@l SemanticsNode semanticsNode0) {
                L.p(semanticsNode0, "it");
                return semanticsNode0.h().j();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SemanticsNode)object0));
            }
        }


        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.4 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.4 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.4.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.4();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.4() {
                super(1);
            }

            @m
            public final Comparable a(@l SemanticsNode semanticsNode0) {
                L.p(semanticsNode0, "it");
                return semanticsNode0.h().t();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SemanticsNode)object0));
            }
        }


        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.1 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.1 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.1.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.1();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.1() {
                super(1);
            }

            @m
            public final Comparable a(@l SemanticsNode semanticsNode0) {
                L.p(semanticsNode0, "it");
                return semanticsNode0.h().t();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SemanticsNode)object0));
            }
        }


        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.2 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.2 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.2.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.2();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.2() {
                super(1);
            }

            @m
            public final Comparable a(@l SemanticsNode semanticsNode0) {
                L.p(semanticsNode0, "it");
                return semanticsNode0.h().B();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SemanticsNode)object0));
            }
        }


        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.3 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.3 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.3.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.3();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.3() {
                super(1);
            }

            @m
            public final Comparable a(@l SemanticsNode semanticsNode0) {
                L.p(semanticsNode0, "it");
                return semanticsNode0.h().j();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SemanticsNode)object0));
            }
        }


        final class androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.4 extends N implements Function1 {
            public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.4 e;

            static {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.4.e = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.4();
            }

            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.comparator.4() {
                super(1);
            }

            @m
            public final Comparable a(@l SemanticsNode semanticsNode0) {
                L.p(semanticsNode0, "it");
                return semanticsNode0.h().x();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SemanticsNode)object0));
            }
        }

    }

    // 检测为 Lambda 实现
    private static final void s0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0) [...]

    private final int t0(int v) {
        return v == this.d.getSemanticsOwner().b().l() ? -1 : v;
    }

    private final boolean u0(AccessibilityEvent accessibilityEvent0) {
        return this.d0() ? this.d.getParent().requestSendAccessibilityEvent(this.d, accessibilityEvent0) : false;
    }

    private final boolean v0(int v, int v1, Integer integer0, List list0) {
        if(v != 0x80000000 && this.d0()) {
            AccessibilityEvent accessibilityEvent0 = this.E(v, v1);
            if(integer0 != null) {
                accessibilityEvent0.setContentChangeTypes(((int)integer0));
            }
            if(list0 != null) {
                accessibilityEvent0.setContentDescription(TempListUtilsKt.f(list0, ",", null, null, 0, null, null, 62, null));
            }
            return this.u0(accessibilityEvent0);
        }
        return false;
    }

    static boolean w0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0, int v, int v1, Integer integer0, List list0, int v2, Object object0) {
        if((v2 & 4) != 0) {
            integer0 = null;
        }
        if((v2 & 8) != 0) {
            list0 = null;
        }
        return androidComposeViewAccessibilityDelegateCompat0.v0(v, v1, integer0, list0);
    }

    private final void x0(int v, int v1, String s) {
        AccessibilityEvent accessibilityEvent0 = this.E(this.t0(v), 0x20);
        accessibilityEvent0.setContentChangeTypes(v1);
        if(s != null) {
            accessibilityEvent0.getText().add(s);
        }
        this.u0(accessibilityEvent0);
    }

    private final void y(int v, AccessibilityNodeInfo accessibilityNodeInfo0, String s, Bundle bundle0) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)this.O().get(v);
        if(semanticsNodeWithAdjustedBounds0 != null) {
            SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0.b();
            if(semanticsNode0 != null) {
                String s1 = this.S(semanticsNode0);
                if(L.g(s, this.z)) {
                    Integer integer0 = (Integer)this.x.get(v);
                    if(integer0 != null) {
                        accessibilityNodeInfo0.getExtras().putInt(s, ((int)integer0));
                    }
                }
                else if(L.g(s, this.A)) {
                    Integer integer1 = (Integer)this.y.get(v);
                    if(integer1 != null) {
                        accessibilityNodeInfo0.getExtras().putInt(s, ((int)integer1));
                    }
                }
                else {
                    SemanticsActions semanticsActions0 = SemanticsActions.a;
                    if(semanticsNode0.x().c(semanticsActions0.g()) && bundle0 != null && L.g(s, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                        int v1 = bundle0.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                        int v2 = bundle0.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                        if(v2 > 0 && v1 >= 0 && v1 < (s1 == null ? 0x7FFFFFFF : s1.length())) {
                            ArrayList arrayList0 = new ArrayList();
                            Function1 function10 = (Function1)((AccessibilityAction)semanticsNode0.x().g(semanticsActions0.g())).a();
                            if(L.g((function10 == null ? null : ((Boolean)function10.invoke(arrayList0))), Boolean.TRUE)) {
                                TextLayoutResult textLayoutResult0 = (TextLayoutResult)arrayList0.get(0);
                                ArrayList arrayList1 = new ArrayList();
                                for(int v3 = 0; v3 < v2; ++v3) {
                                    int v4 = v1 + v3;
                                    if(v4 >= textLayoutResult0.l().n().length()) {
                                        arrayList1.add(null);
                                    }
                                    else {
                                        arrayList1.add(this.P0(semanticsNode0, textLayoutResult0.d(v4)));
                                    }
                                }
                                accessibilityNodeInfo0.getExtras().putParcelableArray(s, ((Parcelable[])arrayList1.toArray(new RectF[0])));
                                return;
                            }
                            return;
                        }
                        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                        return;
                    }
                    SemanticsProperties semanticsProperties0 = SemanticsProperties.a;
                    if(semanticsNode0.x().c(semanticsProperties0.y()) && bundle0 != null && L.g(s, "androidx.compose.ui.semantics.testTag")) {
                        String s2 = (String)SemanticsConfigurationKt.a(semanticsNode0.x(), semanticsProperties0.y());
                        if(s2 != null) {
                            accessibilityNodeInfo0.getExtras().putCharSequence(s, s2);
                        }
                    }
                }
            }
        }
    }

    private final void y0(int v) {
        PendingTextTraversedEvent androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0 = this.u;
        if(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0 != null) {
            if(v != androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.d().l()) {
                return;
            }
            if(SystemClock.uptimeMillis() - androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.f() <= 1000L) {
                AccessibilityEvent accessibilityEvent0 = this.E(this.t0(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.d().l()), 0x20000);
                accessibilityEvent0.setFromIndex(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.b());
                accessibilityEvent0.setToIndex(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.e());
                accessibilityEvent0.setAction(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.a());
                accessibilityEvent0.setMovementGranularity(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.c());
                accessibilityEvent0.getText().add(this.S(androidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent0.d()));
                this.u0(accessibilityEvent0);
            }
        }
        this.u = null;
    }

    @m
    public final Object z(@l d d0) {
        ArraySet arraySet1;
        kotlinx.coroutines.channels.n n0;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0;
        ArraySet arraySet0;
        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop.1 androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10;
        if(d0 instanceof androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop.1) {
            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop.1)d0;
            int v = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.p;
            if((v & 0x80000000) == 0) {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    int p;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.n = object0;
                        this.p |= 0x80000000;
                        return d0.z(this);
                    }
                };
            }
            else {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.p = v ^ 0x80000000;
            }
        }
        else {
            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                Object n;
                int p;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.n = object0;
                    this.p |= 0x80000000;
                    return d0.z(this);
                }
            };
        }
        Object object0 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.n;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.p) {
            case 0: {
                f0.n(object0);
                try {
                    arraySet0 = new ArraySet();
                    androidComposeViewAccessibilityDelegateCompat0 = this;
                    n0 = this.s.iterator();
                    androidComposeViewAccessibilityDelegateCompat0 = this;
                    goto label_29;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                n0 = (kotlinx.coroutines.channels.n)androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.m;
                arraySet1 = (ArraySet)androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.l;
                androidComposeViewAccessibilityDelegateCompat0 = (AndroidComposeViewAccessibilityDelegateCompat)androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.k;
                try {
                    f0.n(object0);
                    goto label_38;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 2: {
                n0 = (kotlinx.coroutines.channels.n)androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.m;
                arraySet1 = (ArraySet)androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.l;
                androidComposeViewAccessibilityDelegateCompat0 = (AndroidComposeViewAccessibilityDelegateCompat)androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.k;
                try {
                    f0.n(object0);
                    while(true) {
                        arraySet0 = arraySet1;
                    label_29:
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.k = androidComposeViewAccessibilityDelegateCompat0;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.l = arraySet0;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.m = n0;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.p = 1;
                        Object object2 = n0.b(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10);
                        if(object2 == object1) {
                            return object1;
                        }
                        arraySet1 = arraySet0;
                        object0 = object2;
                    label_38:
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_64;
                        }
                        n0.next();
                        if(androidComposeViewAccessibilityDelegateCompat0.d0()) {
                            int v1 = androidComposeViewAccessibilityDelegateCompat0.r.size();
                            for(int v2 = 0; v2 < v1; ++v2) {
                                Object object3 = androidComposeViewAccessibilityDelegateCompat0.r.o(v2);
                                L.m(object3);
                                androidComposeViewAccessibilityDelegateCompat0.C0(((LayoutNode)object3), arraySet1);
                            }
                            arraySet1.clear();
                            if(!androidComposeViewAccessibilityDelegateCompat0.D) {
                                androidComposeViewAccessibilityDelegateCompat0.D = true;
                                androidComposeViewAccessibilityDelegateCompat0.k.post(androidComposeViewAccessibilityDelegateCompat0.E);
                            }
                        }
                        androidComposeViewAccessibilityDelegateCompat0.r.clear();
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.k = androidComposeViewAccessibilityDelegateCompat0;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.l = arraySet1;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.m = n0;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10.p = 2;
                        if(a0.b(100L, androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$10) != object1) {
                            continue;
                        }
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        androidComposeViewAccessibilityDelegateCompat0.r.clear();
        throw throwable0;
    label_64:
        androidComposeViewAccessibilityDelegateCompat0.r.clear();
        return S0.a;
    }

    private final void z0(ScrollObservationScope scrollObservationScope0) {
        if(!scrollObservationScope0.H()) {
            return;
        }
        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendScrollEventIfNeeded.1 androidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$10 = new A3.a(this) {
            final ScrollObservationScope e;
            final AndroidComposeViewAccessibilityDelegateCompat f;

            {
                this.e = scrollObservationScope0;
                this.f = androidComposeViewAccessibilityDelegateCompat0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                ScrollAxisRange scrollAxisRange0 = this.e.b();
                ScrollAxisRange scrollAxisRange1 = this.e.f();
                Float float0 = this.e.c();
                Float float1 = this.e.d();
                float f = scrollAxisRange0 == null || float0 == null ? 0.0f : ((Number)scrollAxisRange0.c().invoke()).floatValue() - ((float)float0);
                float f1 = scrollAxisRange1 == null || float1 == null ? 0.0f : ((Number)scrollAxisRange1.c().invoke()).floatValue() - ((float)float1);
                if(f != 0.0f || f1 != 0.0f) {
                    int v = this.f.t0(this.e.e());
                    AndroidComposeViewAccessibilityDelegateCompat.w0(this.f, v, 0x800, 1, null, 8, null);
                    AccessibilityEvent accessibilityEvent0 = this.f.E(v, 0x1000);
                    if(scrollAxisRange0 != null) {
                        accessibilityEvent0.setScrollX(((int)((Number)scrollAxisRange0.c().invoke()).floatValue()));
                        accessibilityEvent0.setMaxScrollX(((int)((Number)scrollAxisRange0.a().invoke()).floatValue()));
                    }
                    if(scrollAxisRange1 != null) {
                        accessibilityEvent0.setScrollY(((int)((Number)scrollAxisRange1.c().invoke()).floatValue()));
                        accessibilityEvent0.setMaxScrollY(((int)((Number)scrollAxisRange1.a().invoke()).floatValue()));
                    }
                    if(Build.VERSION.SDK_INT >= 28) {
                        Api28Impl.a(accessibilityEvent0, ((int)f), ((int)f1));
                    }
                    this.f.u0(accessibilityEvent0);
                }
                if(scrollAxisRange0 != null) {
                    Float float2 = (Float)scrollAxisRange0.c().invoke();
                    this.e.h(float2);
                }
                if(scrollAxisRange1 != null) {
                    Float float3 = (Float)scrollAxisRange1.c().invoke();
                    this.e.i(float3);
                }
            }
        };
        this.d.getSnapshotObserver().i(scrollObservationScope0, this.G, androidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$10);
    }
}

