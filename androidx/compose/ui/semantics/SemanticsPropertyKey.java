package androidx.compose.ui.semantics;

import A3.o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class SemanticsPropertyKey {
    @l
    private final String a;
    @l
    private final o b;
    public static final int c;

    static {
    }

    public SemanticsPropertyKey(@l String s, @l o o0) {
        L.p(s, "name");
        L.p(o0, "mergePolicy");
        super();
        this.a = s;
        this.b = o0;
    }

    public SemanticsPropertyKey(String s, o o0, int v, w w0) {
        if((v & 2) != 0) {
            o0 = androidx.compose.ui.semantics.SemanticsPropertyKey.1.e;
        }
        this(s, o0);

        final class androidx.compose.ui.semantics.SemanticsPropertyKey.1 extends N implements o {
            public static final androidx.compose.ui.semantics.SemanticsPropertyKey.1 e;

            static {
                androidx.compose.ui.semantics.SemanticsPropertyKey.1.e = new androidx.compose.ui.semantics.SemanticsPropertyKey.1();
            }

            androidx.compose.ui.semantics.SemanticsPropertyKey.1() {
                super(2);
            }

            @Override  // A3.o
            @m
            public final Object invoke(@m Object object0, Object object1) {
                return object0 == null ? object1 : object0;
            }
        }

    }

    @l
    public final o a() {
        return this.b;
    }

    @l
    public final String b() {
        return this.a;
    }

    public final Object c(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l kotlin.reflect.o o0) {
        L.p(semanticsPropertyReceiver0, "thisRef");
        L.p(o0, "property");
        return SemanticsPropertiesKt.d1();
    }

    @m
    public final Object d(@m Object object0, Object object1) {
        return this.b.invoke(object0, object1);
    }

    public final void e(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, @l kotlin.reflect.o o0, Object object0) {
        L.p(semanticsPropertyReceiver0, "thisRef");
        L.p(o0, "property");
        semanticsPropertyReceiver0.a(this, object0);
    }

    @Override
    @l
    public String toString() {
        return "SemanticsPropertyKey: " + this.a;
    }
}

