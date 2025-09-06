package S0;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nForwardingControllerListener2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingControllerListener2.kt\ncom/facebook/fresco/ui/common/ForwardingControllerListener2\n*L\n1#1,84:1\n35#1,16:85\n35#1,16:101\n35#1,16:117\n35#1,16:133\n35#1,16:149\n35#1,16:165\n35#1,16:181\n*S KotlinDebug\n*F\n+ 1 ForwardingControllerListener2.kt\ncom/facebook/fresco/ui/common/ForwardingControllerListener2\n*L\n53#1:85,16\n57#1:101,16\n61#1:117,16\n65#1:133,16\n69#1:149,16\n73#1:165,16\n77#1:181,16\n*E\n"})
public class d extends a {
    public static final class S0.d.a {
        private S0.d.a() {
        }

        public S0.d.a(w w0) {
        }
    }

    @l
    private final List c;
    @l
    public static final S0.d.a d = null;
    @l
    private static final String e = "FwdControllerListener2";

    static {
        d.d = new S0.d.a(null);
    }

    public d() {
        this.c = new ArrayList(2);
    }

    @Override  // S0.a
    public void a(@l String s, @m Object object0) {
        b b0;
        L.p(s, "id");
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            try {
                b0 = (b)this.c.get(v1);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                break;
            }
            try {
                b0.a(s, object0);
            }
            catch(Exception exception0) {
                Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", exception0);
            }
        }
    }

    @Override  // S0.a
    public void b(@l String s, @m Throwable throwable0, @m S0.b.a b$a0) {
        b b0;
        L.p(s, "id");
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            try {
                b0 = (b)this.c.get(v1);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                break;
            }
            try {
                b0.b(s, throwable0, b$a0);
            }
            catch(Exception exception0) {
                Log.e("FwdControllerListener2", "InternalListener exception in onFailure", exception0);
            }
        }
    }

    @Override  // S0.a
    public void c(@l String s, @m S0.b.a b$a0) {
        b b0;
        L.p(s, "id");
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            try {
                b0 = (b)this.c.get(v1);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                break;
            }
            try {
                b0.c(s, b$a0);
            }
            catch(Exception exception0) {
                Log.e("FwdControllerListener2", "InternalListener exception in onRelease", exception0);
            }
        }
    }

    @Override  // S0.a
    public void e(@l String s, @m Object object0, @m S0.b.a b$a0) {
        b b0;
        L.p(s, "id");
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            try {
                b0 = (b)this.c.get(v1);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                break;
            }
            try {
                b0.e(s, object0, b$a0);
            }
            catch(Exception exception0) {
                Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", exception0);
            }
        }
    }

    @Override  // S0.a
    public void f(@l String s) {
        b b0;
        L.p(s, "id");
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            try {
                b0 = (b)this.c.get(v1);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                break;
            }
            try {
                b0.f(s);
            }
            catch(Exception exception0) {
                Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", exception0);
            }
        }
    }

    @Override  // S0.a
    public void k(@m Object object0) {
        b b0;
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            try {
                b0 = (b)this.c.get(v1);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                break;
            }
            try {
                b0.k(object0);
            }
            catch(Exception exception0) {
                Log.e("FwdControllerListener2", "InternalListener exception in onEmptyEvent", exception0);
            }
        }
    }

    @Override  // S0.a
    public void p(@l String s, @m Object object0, @m S0.b.a b$a0) {
        b b0;
        L.p(s, "id");
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            try {
                b0 = (b)this.c.get(v1);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                break;
            }
            try {
                b0.p(s, object0, b$a0);
            }
            catch(Exception exception0) {
                Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", exception0);
            }
        }
    }

    public final void t(@l b b0) {
        synchronized(this) {
            L.p(b0, "listener");
            this.c.add(b0);
        }
    }

    private final void v(String s, Function1 function10) {
        b b0;
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            try {
                b0 = (b)this.c.get(v1);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                break;
            }
            try {
                function10.invoke(b0);
            }
            catch(Exception exception0) {
                Log.e("FwdControllerListener2", "InternalListener exception in " + s, exception0);
            }
        }
    }

    public final void w() {
        synchronized(this) {
            this.c.clear();
        }
    }

    public final void x(@l b b0) {
        synchronized(this) {
            L.p(b0, "listener");
            this.c.remove(b0);
        }
    }
}

