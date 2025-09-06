package L3;

import android.annotation.SuppressLint;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.debug.internal.g;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sun.misc.Signal;
import y4.l;
import y4.m;
import z3.n;

@SuppressLint({"all"})
@IgnoreJRERequirement
public final class b {
    public static final class a implements ClassFileTransformer {
        @l
        public static final a a;

        static {
            a.a = new a();
        }

        @m
        public byte[] a(@m ClassLoader classLoader0, @l String s, @m Class class0, @l ProtectionDomain protectionDomain0, @m byte[] arr_b) {
            if(classLoader0 != null && L.g(s, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                kotlinx.coroutines.debug.internal.a.a.b(true);
                return kotlin.io.b.p(classLoader0.getResourceAsStream("DebugProbesKt.bin"));
            }
            return null;
        }
    }

    @l
    public static final b a;
    private static final boolean b;

    static {
        Boolean boolean1;
        b.a = new b();
        Boolean boolean0 = null;
        try {
            String s = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            boolean1 = s == null ? null : Boolean.valueOf(Boolean.parseBoolean(s));
        }
        catch(Throwable throwable0) {
            boolean1 = e0.b(f0.a(throwable0));
        }
        if(!e0.i(boolean1)) {
            boolean0 = boolean1;
        }
        b.b = boolean0 == null ? false : boolean0.booleanValue();
    }

    private final void b() {
        try {
            Signal.handle(new Signal("TRAP"), new L3.a());
        }
        catch(Throwable unused_ex) {
        }
    }

    private static final void c(Signal signal0) {
        g g0 = g.a;
        if(g0.B()) {
            g0.f(System.out);
            return;
        }
        System.out.println("Cannot perform coroutines dump, debug probes are disabled");
    }

    @n
    public static final void d(@m String s, @l Instrumentation instrumentation0) {
        kotlinx.coroutines.debug.internal.a.a.b(true);
        instrumentation0.addTransformer(a.a);
        g.a.M(b.b);
        g.a.z();
        b.a.b();
    }
}

