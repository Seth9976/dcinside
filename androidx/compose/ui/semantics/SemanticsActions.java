package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.s0;
import y4.l;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1195:1\n432#2,3:1196\n432#2,3:1199\n432#2,3:1202\n432#2,3:1205\n432#2,3:1208\n432#2,3:1211\n432#2,3:1214\n432#2,3:1217\n432#2,3:1220\n432#2,3:1223\n432#2,3:1226\n432#2,3:1229\n432#2,3:1232\n432#2,3:1235\n432#2,3:1238\n432#2,3:1241\n432#2,3:1244\n432#2,3:1247\n432#2,3:1250\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n*L\n238#1:1196,3\n243#1:1199,3\n248#1:1202,3\n253#1:1205,3\n258#1:1208,3\n263#1:1211,3\n268#1:1214,3\n273#1:1217,3\n278#1:1220,3\n283#1:1223,3\n288#1:1226,3\n293#1:1229,3\n298#1:1232,3\n303#1:1235,3\n308#1:1238,3\n319#1:1241,3\n324#1:1244,3\n329#1:1247,3\n334#1:1250,3\n*E\n"})
public final class SemanticsActions {
    @l
    public static final SemanticsActions a;
    @l
    private static final SemanticsPropertyKey b;
    @l
    private static final SemanticsPropertyKey c;
    @l
    private static final SemanticsPropertyKey d;
    @l
    private static final SemanticsPropertyKey e;
    @l
    private static final SemanticsPropertyKey f;
    @l
    private static final SemanticsPropertyKey g;
    @l
    private static final SemanticsPropertyKey h;
    @l
    private static final SemanticsPropertyKey i;
    @l
    private static final SemanticsPropertyKey j;
    @l
    private static final SemanticsPropertyKey k;
    @l
    private static final SemanticsPropertyKey l;
    @l
    private static final SemanticsPropertyKey m;
    @l
    private static final SemanticsPropertyKey n;
    @l
    private static final SemanticsPropertyKey o;
    @l
    private static final SemanticsPropertyKey p;
    @l
    private static final SemanticsPropertyKey q;
    @l
    private static final SemanticsPropertyKey r;
    @l
    private static final SemanticsPropertyKey s;
    @l
    private static final SemanticsPropertyKey t;
    @l
    private static final SemanticsPropertyKey u;
    public static final int v;

    static {
        SemanticsActions.a = new SemanticsActions();
        SemanticsActions.b = new SemanticsPropertyKey("GetTextLayoutResult", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.c = new SemanticsPropertyKey("OnClick", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.d = new SemanticsPropertyKey("OnLongClick", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.e = new SemanticsPropertyKey("ScrollBy", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.f = new SemanticsPropertyKey("ScrollToIndex", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.g = new SemanticsPropertyKey("SetProgress", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.h = new SemanticsPropertyKey("SetSelection", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.i = new SemanticsPropertyKey("SetText", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.j = new SemanticsPropertyKey("CopyText", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.k = new SemanticsPropertyKey("CutText", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.l = new SemanticsPropertyKey("PasteText", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.m = new SemanticsPropertyKey("Expand", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.n = new SemanticsPropertyKey("Collapse", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.o = new SemanticsPropertyKey("Dismiss", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.p = new SemanticsPropertyKey("RequestFocus", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.q = new SemanticsPropertyKey("CustomActions", null, 2, null);
        SemanticsActions.r = new SemanticsPropertyKey("PageUp", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.s = new SemanticsPropertyKey("PageLeft", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.t = new SemanticsPropertyKey("PageDown", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
        SemanticsActions.u = new SemanticsPropertyKey("PageRight", androidx.compose.ui.semantics.SemanticsPropertiesKt.ActionPropertyKey.1.e);
    }

    @l
    public final SemanticsPropertyKey a() {
        return SemanticsActions.n;
    }

    @l
    public final SemanticsPropertyKey b() {
        return SemanticsActions.j;
    }

    @l
    public final SemanticsPropertyKey c() {
        return SemanticsActions.q;
    }

    @l
    public final SemanticsPropertyKey d() {
        return SemanticsActions.k;
    }

    @l
    public final SemanticsPropertyKey e() {
        return SemanticsActions.o;
    }

    @l
    public final SemanticsPropertyKey f() {
        return SemanticsActions.m;
    }

    @l
    public final SemanticsPropertyKey g() {
        return SemanticsActions.b;
    }

    @l
    public final SemanticsPropertyKey h() {
        return SemanticsActions.c;
    }

    @l
    public final SemanticsPropertyKey i() {
        return SemanticsActions.d;
    }

    @l
    public final SemanticsPropertyKey j() {
        return SemanticsActions.t;
    }

    @l
    public final SemanticsPropertyKey k() {
        return SemanticsActions.s;
    }

    @l
    public final SemanticsPropertyKey l() {
        return SemanticsActions.u;
    }

    @l
    public final SemanticsPropertyKey m() {
        return SemanticsActions.r;
    }

    @l
    public final SemanticsPropertyKey n() {
        return SemanticsActions.l;
    }

    @l
    public final SemanticsPropertyKey o() {
        return SemanticsActions.p;
    }

    @l
    public final SemanticsPropertyKey p() {
        return SemanticsActions.e;
    }

    @l
    public final SemanticsPropertyKey q() {
        return SemanticsActions.f;
    }

    @l
    public final SemanticsPropertyKey r() {
        return SemanticsActions.g;
    }

    @l
    public final SemanticsPropertyKey s() {
        return SemanticsActions.h;
    }

    @l
    public final SemanticsPropertyKey t() {
        return SemanticsActions.i;
    }
}

