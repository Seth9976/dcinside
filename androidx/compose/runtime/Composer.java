package androidx.compose.runtime;

import A3.a;
import A3.o;
import androidx.compose.runtime.tooling.CompositionData;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface Composer {
    public static final class Companion {
        static final Companion a;
        @l
        private static final Object b;

        static {
            Companion.a = new Companion();
            Companion.b = new Composer.Companion.Empty.1();
        }

        @l
        public final Object a() {
            return Companion.b;
        }

        @InternalComposeTracingApi
        public final void b(@l CompositionTracer compositionTracer0) {
            L.p(compositionTracer0, "tracer");
            ComposerKt.a = compositionTracer0;
        }
    }

    @l
    public static final Companion a;

    static {
        Composer.a = Companion.a;
    }

    @ComposeCompilerApi
    boolean A(long arg1);

    @ComposeCompilerApi
    boolean B(byte arg1);

    @ComposeCompilerApi
    boolean C(char arg1);

    @ComposeCompilerApi
    boolean D(double arg1);

    boolean E();

    @ComposeCompilerApi
    void F();

    @ComposeCompilerApi
    @l
    Composer G(int arg1);

    @l
    Applier H();

    @ComposeCompilerApi
    @m
    ScopeUpdateScope I();

    @ComposeCompilerApi
    @l
    Object J(@m Object arg1, @m Object arg2);

    @ComposeCompilerApi
    void K();

    @InternalComposeApi
    Object L(@l CompositionLocal arg1);

    @l
    g M();

    @ComposeCompilerApi
    void N(Object arg1, @l o arg2);

    @ComposeCompilerApi
    void O(@m Object arg1);

    @ComposeCompilerApi
    void P();

    @InternalComposeApi
    void Q(@l MovableContent arg1, @m Object arg2);

    void R();

    void S();

    @m
    RecomposeScope T();

    @ComposeCompilerApi
    void U();

    @ComposeCompilerApi
    void V(int arg1);

    @ComposeCompilerApi
    @m
    Object W();

    @l
    CompositionData X();

    @ComposeCompilerApi
    boolean Y(@m Object arg1);

    @ComposeCompilerApi
    void Z();

    int a();

    @ComposeCompilerApi
    void a0(int arg1, @m Object arg2);

    @ComposeCompilerApi
    void b(boolean arg1);

    @ComposeCompilerApi
    void b0();

    boolean c();

    @InternalComposeApi
    void c0(@l a arg1);

    @InternalComposeApi
    void d(@l List arg1);

    @InternalComposeApi
    void d0();

    @ComposeCompilerApi
    void e(int arg1);

    int e0();

    @ComposeCompilerApi
    void f();

    @ComposeCompilerApi
    void f0();

    @ComposeCompilerApi
    void g();

    @ComposeCompilerApi
    void g0();

    @ComposeCompilerApi
    void h();

    @ComposeCompilerApi
    void i(int arg1, @m Object arg2);

    @m
    Object j();

    @ComposeCompilerApi
    void k(@l a arg1);

    void l(@l String arg1);

    @ComposeCompilerApi
    void m();

    void n(int arg1, @l String arg2);

    @l
    ControlledComposition o();

    boolean p();

    @InternalComposeApi
    void q(@l RecomposeScope arg1);

    @InternalComposeApi
    @l
    CompositionContext r();

    void s();

    @ComposeCompilerApi
    boolean t(@m Object arg1);

    @InternalComposeApi
    void u(@l ProvidedValue[] arg1);

    @ComposeCompilerApi
    boolean v(boolean arg1);

    @ComposeCompilerApi
    boolean w(short arg1);

    @ComposeCompilerApi
    boolean x(float arg1);

    @ComposeCompilerApi
    void y();

    @ComposeCompilerApi
    boolean z(int arg1);
}

