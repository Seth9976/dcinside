package androidx.compose.ui.text.caches;

import A3.a;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import jeb.synthetic.FIN;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n349#1:353\n349#1:362\n349#1:364\n349#1:366\n349#1:368\n349#1:370\n349#1:372\n24#2:354\n24#2:356\n24#2:357\n24#2:358\n24#2:359\n24#2:360\n24#2:361\n24#2:363\n24#2:365\n24#2:367\n24#2:369\n24#2:371\n24#2:373\n24#2:374\n24#2:375\n24#2:376\n1#3:355\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n*L\n41#1:353\n296#1:362\n302#1:364\n308#1:366\n313#1:368\n318#1:370\n323#1:372\n41#1:354\n72#1:356\n87#1:357\n105#1:358\n143#1:359\n177#1:360\n219#1:361\n296#1:363\n302#1:365\n308#1:367\n313#1:369\n318#1:371\n323#1:373\n330#1:374\n340#1:375\n349#1:376\n*E\n"})
public class LruCache {
    @l
    private final SynchronizedObject a;
    @l
    private final HashMap b;
    @l
    private final LinkedHashSet c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public LruCache(int v) {
        this.a = Synchronization_jvmKt.a();
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.e = v;
        this.b = new HashMap(0, 0.75f);
        this.c = new LinkedHashSet();
    }

    @m
    protected Object b(Object object0) [...] // Inlined contents

    public final int c() {
        synchronized(this.a) {
        }
        return this.g;
    }

    protected void d(boolean z, Object object0, Object object1, @m Object object2) {
    }

    public final void e() {
        this.t(-1);
    }

    public final int f() {
        synchronized(this.a) {
        }
        return this.h;
    }

    @m
    public final Object g(Object object0) {
        synchronized(this.a) {
            Object object1 = this.b.get(object0);
            if(object1 != null) {
                this.c.remove(object0);
                this.c.add(object0);
                ++this.i;
                return object1;
            }
            ++this.j;
            return null;
        }
    }

    public final int h() {
        synchronized(this.a) {
        }
        return this.i;
    }

    public final int i() {
        synchronized(this.a) {
        }
        return this.e;
    }

    public final int j() {
        synchronized(this.a) {
        }
        return this.j;
    }

    @m
    public final Object k(Object object0, Object object1) {
        Object object2;
        if(object0 == null || object1 == null) {
            throw null;
        }
        synchronized(this.a) {
            ++this.f;
            this.d = this.p() + this.o(object0, object1);
            object2 = this.b.put(object0, object1);
            if(object2 != null) {
                this.d = this.p() - this.o(object0, object2);
            }
            if(this.c.contains(object0)) {
                this.c.remove(object0);
            }
            this.c.add(object0);
        }
        this.t(this.e);
        return object2;
    }

    public final int l() {
        synchronized(this.a) {
        }
        return this.f;
    }

    @m
    public final Object m(Object object0) {
        object0.getClass();
        synchronized(this.a) {
            Object object1 = this.b.remove(object0);
            this.c.remove(object0);
            if(object1 != null) {
                this.d = this.p() - this.o(object0, object1);
            }
            return object1;
        }
    }

    public void n(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized(this.a) {
            this.e = v;
        }
        this.t(v);
    }

    private final int o(Object object0, Object object1) {
        return 1;
    }

    @i(name = "size")
    public final int p() {
        synchronized(this.a) {
        }
        return this.d;
    }

    protected int q(Object object0, Object object1) [...] // Inlined contents

    @l
    public final Map r() {
        synchronized(this.a) {
            Map map0 = new LinkedHashMap();
            for(Object object0: this.c) {
                Object object1 = this.b.get(object0);
                L.m(object1);
                ((AbstractMap)map0).put(object0, object1);
            }
            return map0;
        }
    }

    public final Object s(@l a a0) {
        L.p(a0, "block");
        synchronized(this.a) {
            return a0.invoke();
        }
    }

    public void t(int v) {
        Object object1;
        Object object0;
        int v1;
        while(true) {
            synchronized(this.a) {
                v1 = FIN.finallyOpen$NT();
                if(this.p() < 0 || this.b.isEmpty() && this.p() != 0 || this.b.isEmpty() != this.c.isEmpty()) {
                    break;
                }
                if(this.p() <= v || this.b.isEmpty()) {
                    object0 = null;
                    object1 = null;
                }
                else {
                    object0 = u.z2(this.c);
                    object1 = this.b.get(object0);
                    if(object1 != null) {
                        v0.k(this.b).remove(object0);
                        v0.a(this.c).remove(object0);
                        int v2 = this.p();
                        L.m(object0);
                        L.m(object1);
                        this.d = v2 - this.o(object0, object1);
                        ++this.h;
                        goto label_20;
                    }
                    FIN.finallyExec$NT(v1);
                    throw new IllegalStateException("inconsistent state");
                }
            label_20:
                FIN.finallyCodeBegin$NT(v1);
            }
            FIN.finallyCodeEnd$NT(v1);
            if(object0 == null && object1 == null) {
                return;
            }
            L.m(object0);
            L.m(object1);
        }
        FIN.finallyExec$NT(v1);
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    @Override
    @l
    public String toString() {
        synchronized(this.a) {
            int v1 = this.j + this.i;
            int v2 = v1 == 0 ? 0 : this.i * 100 / v1;
            return "LruCache[maxSize=" + this.e + ",hits=" + this.i + ",misses=" + this.j + ",hitRate=" + v2 + "%]";
        }
    }
}

