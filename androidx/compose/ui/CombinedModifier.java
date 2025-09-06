package androidx.compose.ui;

import A3.o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class CombinedModifier implements Modifier {
    @l
    private final Modifier a;
    @l
    private final Modifier b;
    public static final int c;

    static {
    }

    public CombinedModifier(@l Modifier modifier0, @l Modifier modifier1) {
        L.p(modifier0, "outer");
        L.p(modifier1, "inner");
        super();
        this.a = modifier0;
        this.b = modifier1;
    }

    @Override  // androidx.compose.ui.Modifier
    public boolean H(@l Function1 function10) {
        L.p(function10, "predicate");
        return this.a.H(function10) || this.b.H(function10);
    }

    @Override  // androidx.compose.ui.Modifier
    public Object P(Object object0, @l o o0) {
        L.p(o0, "operation");
        Object object1 = this.a.P(object0, o0);
        return this.b.P(object1, o0);
    }

    @Override  // androidx.compose.ui.Modifier
    public Object U(Object object0, @l o o0) {
        L.p(o0, "operation");
        Object object1 = this.b.U(object0, o0);
        return this.a.U(object1, o0);
    }

    @l
    public final Modifier a() {
        return this.b;
    }

    @l
    public final Modifier b() {
        return this.a;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof CombinedModifier && L.g(this.a, ((CombinedModifier)object0).a) && L.g(this.b, ((CombinedModifier)object0).b);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override
    @l
    public String toString() {
        return '[' + ((String)this.P("", androidx.compose.ui.CombinedModifier.toString.1.e)) + ']';

        final class androidx.compose.ui.CombinedModifier.toString.1 extends N implements o {
            public static final androidx.compose.ui.CombinedModifier.toString.1 e;

            static {
                androidx.compose.ui.CombinedModifier.toString.1.e = new androidx.compose.ui.CombinedModifier.toString.1();
            }

            androidx.compose.ui.CombinedModifier.toString.1() {
                super(2);
            }

            @l
            public final String a(@l String s, @l Element modifier$Element0) {
                L.p(s, "acc");
                L.p(modifier$Element0, "element");
                return s.length() == 0 ? modifier$Element0.toString() : s + ", " + modifier$Element0;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((String)object0), ((Element)object1));
            }
        }

    }

    @Override  // androidx.compose.ui.Modifier
    public boolean u(@l Function1 function10) {
        L.p(function10, "predicate");
        return this.a.u(function10) && this.b.u(function10);
    }
}

