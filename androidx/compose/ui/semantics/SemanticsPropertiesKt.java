package androidx.compose.ui.semantics;

import A3.a;
import A3.p;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.o;
import kotlin.v;
import y4.l;
import y4.m;

public final class SemanticsPropertiesKt {
    static final o[] a;

    static {
        SemanticsPropertiesKt.a = new o[]{m0.k(new Y(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), m0.k(new Y(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};
    }

    @l
    public static final ScrollAxisRange A(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return (ScrollAxisRange)SemanticsProperties.a.i().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[6]);
    }

    public static final void A0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @l Function1 function10) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(function10, "action");
        semanticsPropertyReceiver0.a(SemanticsActions.a.q(), new AccessibilityAction(s, function10));
    }

    private static Object B(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.i();
    }

    public static void B0(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.A0(semanticsPropertyReceiver0, s, function10);
    }

    public static final int C(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return ((ImeAction)SemanticsProperties.a.j().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[12])).o();
    }

    public static final void C0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.a(SemanticsProperties.a.v(), S0.a);
    }

    private static Object D(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.j();
    }

    public static final void D0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l CollectionInfo collectionInfo0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(collectionInfo0, "<set-?>");
        SemanticsProperties.a.a().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[14], collectionInfo0);
    }

    public static final int E(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return ((LiveRegionMode)SemanticsProperties.a.q().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[3])).i();
    }

    public static final void E0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l CollectionItemInfo collectionItemInfo0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(collectionItemInfo0, "<set-?>");
        SemanticsProperties.a.b().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[15], collectionItemInfo0);
    }

    private static Object F(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.q();
    }

    public static final void F0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, boolean z) {
        L.p(semanticsPropertyReceiver0, "<this>");
        SemanticsProperties.a.n().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[5], Boolean.valueOf(z));
    }

    @l
    public static final String G(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return (String)SemanticsProperties.a.r().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[2]);
    }

    public static final void G0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l String s) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(s, "value");
        List list0 = u.k(s);
        semanticsPropertyReceiver0.a(SemanticsProperties.a.c(), list0);
    }

    private static Object H(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.r();
    }

    public static final void H0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l List list0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(list0, "<set-?>");
        SemanticsActions.a.c().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[17], list0);
    }

    @l
    public static final ProgressBarRangeInfo I(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return (ProgressBarRangeInfo)SemanticsProperties.a.t().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[1]);
    }

    public static final void I0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l AnnotatedString annotatedString0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(annotatedString0, "<set-?>");
        SemanticsProperties.a.e().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[10], annotatedString0);
    }

    private static Object J(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.t();
    }

    public static final void J0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, boolean z) {
        L.p(semanticsPropertyReceiver0, "<this>");
        SemanticsProperties.a.g().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[4], Boolean.valueOf(z));
    }

    public static final int K(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return ((Role)SemanticsProperties.a.u().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[8])).n();
    }

    public static final void K0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l ScrollAxisRange scrollAxisRange0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(scrollAxisRange0, "<set-?>");
        SemanticsProperties.a.i().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[6], scrollAxisRange0);
    }

    private static Object L(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.u();
    }

    public static final void L0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, int v) {
        L.p(semanticsPropertyReceiver0, "$this$imeAction");
        o o0 = SemanticsPropertiesKt.a[12];
        ImeAction imeAction0 = ImeAction.i(v);
        SemanticsProperties.a.j().e(semanticsPropertyReceiver0, o0, imeAction0);
    }

    public static final boolean M(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return ((Boolean)SemanticsProperties.a.w().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[13])).booleanValue();
    }

    public static final void M0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, int v) {
        L.p(semanticsPropertyReceiver0, "$this$liveRegion");
        o o0 = SemanticsPropertiesKt.a[3];
        LiveRegionMode liveRegionMode0 = LiveRegionMode.c(v);
        SemanticsProperties.a.q().e(semanticsPropertyReceiver0, o0, liveRegionMode0);
    }

    private static Object N(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.w();
    }

    public static final void N0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l String s) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(s, "<set-?>");
        SemanticsProperties.a.r().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[2], s);
    }

    @l
    public static final String O(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return (String)SemanticsProperties.a.x().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[0]);
    }

    public static final void O0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m Function1 function10) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function10);
        semanticsPropertyReceiver0.a(SemanticsActions.a.r(), accessibilityAction0);
    }

    private static Object P(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.x();
    }

    public static void P0(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.O0(semanticsPropertyReceiver0, s, function10);
    }

    @l
    public static final String Q(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return (String)SemanticsProperties.a.y().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[9]);
    }

    public static final void Q0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l ProgressBarRangeInfo progressBarRangeInfo0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(progressBarRangeInfo0, "<set-?>");
        SemanticsProperties.a.t().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[1], progressBarRangeInfo0);
    }

    private static Object R(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.y();
    }

    public static final void R0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, int v) {
        L.p(semanticsPropertyReceiver0, "$this$role");
        o o0 = SemanticsPropertiesKt.a[8];
        Role role0 = Role.h(v);
        SemanticsProperties.a.u().e(semanticsPropertyReceiver0, o0, role0);
    }

    @l
    public static final AnnotatedString S(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return (AnnotatedString)SemanticsPropertiesKt.d1();
    }

    public static final void S0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, boolean z) {
        L.p(semanticsPropertyReceiver0, "<this>");
        SemanticsProperties.a.w().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[13], Boolean.valueOf(z));
    }

    public static final void T(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m Function1 function10) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function10);
        semanticsPropertyReceiver0.a(SemanticsActions.a.g(), accessibilityAction0);
    }

    public static final void T0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m p p0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, p0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.s(), accessibilityAction0);
    }

    public static void U(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.T(semanticsPropertyReceiver0, s, function10);
    }

    public static void U0(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, p p0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.T0(semanticsPropertyReceiver0, s, p0);
    }

    public static final long V(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return ((TextRange)SemanticsProperties.a.A().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[11])).r();
    }

    public static final void V0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l String s) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(s, "<set-?>");
        SemanticsProperties.a.x().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[0], s);
    }

    private static Object W(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.A();
    }

    public static final void W0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l String s) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(s, "<set-?>");
        SemanticsProperties.a.y().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[9], s);
    }

    @l
    public static final ToggleableState X(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return (ToggleableState)SemanticsProperties.a.B().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[16]);
    }

    public static final void X0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l AnnotatedString annotatedString0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(annotatedString0, "value");
        List list0 = u.k(annotatedString0);
        semanticsPropertyReceiver0.a(SemanticsProperties.a.z(), list0);
    }

    private static Object Y(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.B();
    }

    public static final void Y0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m Function1 function10) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, function10);
        semanticsPropertyReceiver0.a(SemanticsActions.a.t(), accessibilityAction0);
    }

    @l
    public static final ScrollAxisRange Z(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return (ScrollAxisRange)SemanticsProperties.a.C().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[7]);
    }

    public static void Z0(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.Y0(semanticsPropertyReceiver0, s, function10);
    }

    private static final SemanticsPropertyKey a(String s) {
        return new SemanticsPropertyKey(s, androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);

        @s0({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt$ActionPropertyKey$1\n*L\n1#1,1195:1\n*E\n"})
        public final class androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1 extends N implements A3.o {
            public static final androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1 e;

            static {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e = new androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1();
            }

            public androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1() {
                super(2);
            }

            @m
            public final AccessibilityAction a(@m AccessibilityAction accessibilityAction0, @l AccessibilityAction accessibilityAction1) {
                String s;
                L.p(accessibilityAction1, "childValue");
                if(accessibilityAction0 == null) {
                    s = accessibilityAction1.b();
                }
                else {
                    s = accessibilityAction0.b();
                    if(s == null) {
                        s = accessibilityAction1.b();
                    }
                }
                if(accessibilityAction0 != null) {
                    v v0 = accessibilityAction0.a();
                    return v0 == null ? new AccessibilityAction(s, accessibilityAction1.a()) : new AccessibilityAction(s, v0);
                }
                return new AccessibilityAction(s, accessibilityAction1.a());
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((AccessibilityAction)object0), ((AccessibilityAction)object1));
            }
        }

    }

    private static Object a0(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.C();
    }

    public static final void a1(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, long v) {
        L.p(semanticsPropertyReceiver0, "$this$textSelectionRange");
        o o0 = SemanticsPropertiesKt.a[11];
        TextRange textRange0 = TextRange.b(v);
        SemanticsProperties.a.A().e(semanticsPropertyReceiver0, o0, textRange0);
    }

    public static final void b0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.a(SemanticsProperties.a.h(), S0.a);
    }

    public static final void b1(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l ToggleableState toggleableState0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(toggleableState0, "<set-?>");
        SemanticsProperties.a.B().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[16], toggleableState0);
    }

    public static final void c(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m a a0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, a0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.a(), accessibilityAction0);
    }

    public static final void c0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l Function1 function10) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(function10, "mapping");
        semanticsPropertyReceiver0.a(SemanticsProperties.a.k(), function10);
    }

    public static final void c1(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l ScrollAxisRange scrollAxisRange0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(scrollAxisRange0, "<set-?>");
        SemanticsProperties.a.C().e(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[7], scrollAxisRange0);
    }

    public static void d(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.c(semanticsPropertyReceiver0, s, a0);
    }

    @ExperimentalComposeUiApi
    public static final void d0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.a(SemanticsProperties.a.l(), S0.a);
    }

    private static final Object d1() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static final void e(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m a a0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, a0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.b(), accessibilityAction0);
    }

    public static final boolean e0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return ((Boolean)SemanticsProperties.a.n().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[5])).booleanValue();
    }

    public static void f(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.e(semanticsPropertyReceiver0, s, a0);
    }

    private static Object f0(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.n();
    }

    public static final void g(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m a a0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, a0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.d(), accessibilityAction0);
    }

    public static final void g0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m a a0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, a0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.h(), accessibilityAction0);
    }

    public static void h(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.g(semanticsPropertyReceiver0, s, a0);
    }

    public static void h0(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.g0(semanticsPropertyReceiver0, s, a0);
    }

    public static final void i(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.a(SemanticsProperties.a.o(), S0.a);
    }

    public static final void i0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m a a0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, a0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.i(), accessibilityAction0);
    }

    public static final void j(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.a(SemanticsProperties.a.d(), S0.a);
    }

    public static void j0(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.i0(semanticsPropertyReceiver0, s, a0);
    }

    public static final void k(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m a a0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, a0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.e(), accessibilityAction0);
    }

    public static final void k0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m a a0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, a0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.j(), accessibilityAction0);
    }

    public static void l(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.k(semanticsPropertyReceiver0, s, a0);
    }

    public static void l0(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.k0(semanticsPropertyReceiver0, s, a0);
    }

    public static final void m(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l String s) {
        L.p(semanticsPropertyReceiver0, "<this>");
        L.p(s, "description");
        semanticsPropertyReceiver0.a(SemanticsProperties.a.f(), s);
    }

    public static final void m0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m a a0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, a0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.k(), accessibilityAction0);
    }

    public static final void n(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m a a0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, a0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.f(), accessibilityAction0);
    }

    public static void n0(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.m0(semanticsPropertyReceiver0, s, a0);
    }

    public static void o(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.n(semanticsPropertyReceiver0, s, a0);
    }

    public static final void o0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m a a0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, a0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.l(), accessibilityAction0);
    }

    @l
    public static final CollectionInfo p(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return (CollectionInfo)SemanticsProperties.a.a().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[14]);
    }

    public static void p0(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.o0(semanticsPropertyReceiver0, s, a0);
    }

    private static Object q(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.a();
    }

    public static final void q0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m a a0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, a0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.m(), accessibilityAction0);
    }

    @l
    public static final CollectionItemInfo r(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return (CollectionItemInfo)SemanticsProperties.a.b().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[15]);
    }

    public static void r0(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.q0(semanticsPropertyReceiver0, s, a0);
    }

    private static Object s(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.b();
    }

    public static final void s0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.a(SemanticsProperties.a.s(), S0.a);
    }

    @l
    public static final String t(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return (String)SemanticsPropertiesKt.d1();
    }

    public static final void t0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m a a0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, a0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.n(), accessibilityAction0);
    }

    @l
    public static final List u(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return (List)SemanticsActions.a.c().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[17]);
    }

    public static void u0(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.t0(semanticsPropertyReceiver0, s, a0);
    }

    private static Object v(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsActions.a.c();
    }

    public static final void v0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        semanticsPropertyReceiver0.a(SemanticsProperties.a.p(), S0.a);
    }

    @l
    public static final AnnotatedString w(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return (AnnotatedString)SemanticsProperties.a.e().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[10]);
    }

    public static final void w0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m a a0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, a0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.o(), accessibilityAction0);
    }

    private static Object x(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.e();
    }

    public static void x0(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.w0(semanticsPropertyReceiver0, s, a0);
    }

    public static final boolean y(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return ((Boolean)SemanticsProperties.a.g().c(semanticsPropertyReceiver0, SemanticsPropertiesKt.a[4])).booleanValue();
    }

    public static final void y0(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @m String s, @m A3.o o0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        AccessibilityAction accessibilityAction0 = new AccessibilityAction(s, o0);
        semanticsPropertyReceiver0.a(SemanticsActions.a.p(), accessibilityAction0);
    }

    private static Object z(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsProperties.a.g();
    }

    public static void z0(SemanticsPropertyReceiver semanticsPropertyReceiver0, String s, A3.o o0, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        SemanticsPropertiesKt.y0(semanticsPropertyReceiver0, s, o0);
    }
}

