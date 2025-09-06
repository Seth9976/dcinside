package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
public final class AutofillNode {
    @s0({"SMAP\nAutofill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,104:1\n34#2:105\n*S KotlinDebug\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n*L\n82#1:105\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final int b() {
            synchronized(this) {
                AutofillNode.g = 1;
                return 0;
            }
        }
    }

    @l
    private final List a;
    @m
    private Rect b;
    @m
    private final Function1 c;
    private final int d;
    @l
    public static final Companion e;
    public static final int f;
    private static int g;

    static {
        AutofillNode.e = new Companion(null);
        AutofillNode.f = 8;
    }

    public AutofillNode(@l List list0, @m Rect rect0, @m Function1 function10) {
        L.p(list0, "autofillTypes");
        super();
        this.a = list0;
        this.b = rect0;
        this.c = function10;
        this.d = AutofillNode.e.b();
    }

    public AutofillNode(List list0, Rect rect0, Function1 function10, int v, w w0) {
        if((v & 1) != 0) {
            list0 = u.H();
        }
        if((v & 2) != 0) {
            rect0 = null;
        }
        this(list0, rect0, function10);
    }

    public static final int a() [...] // 潜在的解密器

    @l
    public final List c() {
        return this.a;
    }

    @m
    public final Rect d() {
        return this.b;
    }

    public final int e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AutofillNode)) {
            return false;
        }
        if(!L.g(this.a, ((AutofillNode)object0).a)) {
            return false;
        }
        return L.g(this.b, ((AutofillNode)object0).b) ? L.g(this.c, ((AutofillNode)object0).c) : false;
    }

    @m
    public final Function1 f() {
        return this.c;
    }

    public final void g(@m Rect rect0) {
        this.b = rect0;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        Function1 function10 = this.c;
        if(function10 != null) {
            v1 = function10.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }
}

