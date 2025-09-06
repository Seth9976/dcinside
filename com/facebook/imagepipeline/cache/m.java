package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.e;
import com.facebook.cache.disk.k;
import com.facebook.common.memory.i;
import com.facebook.common.memory.j;
import com.facebook.imagepipeline.systrace.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nBufferedDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedDiskCache.kt\ncom/facebook/imagepipeline/cache/BufferedDiskCache\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n40#2,2:393\n44#2,5:396\n40#2,9:401\n1#3:395\n*S KotlinDebug\n*F\n+ 1 BufferedDiskCache.kt\ncom/facebook/imagepipeline/cache/BufferedDiskCache\n*L\n115#1:393,2\n115#1:396,5\n234#1:401,9\n*E\n"})
public final class m {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final k a;
    @l
    private final j b;
    @l
    private final com.facebook.common.memory.m c;
    @l
    private final Executor d;
    @l
    private final Executor e;
    @l
    private final x f;
    @l
    private final G g;
    @l
    public static final a h;
    @l
    private static final Class i;

    static {
        m.h = new a(null);
        m.i = m.class;
    }

    public m(@l k k0, @l j j0, @l com.facebook.common.memory.m m0, @l Executor executor0, @l Executor executor1, @l x x0) {
        L.p(k0, "fileCache");
        L.p(j0, "pooledByteBufferFactory");
        L.p(m0, "pooledByteStreams");
        L.p(executor0, "readExecutor");
        L.p(executor1, "writeExecutor");
        L.p(x0, "imageCacheStatsTracker");
        super();
        this.a = k0;
        this.b = j0;
        this.c = m0;
        this.d = executor0;
        this.e = executor1;
        this.f = x0;
        G g0 = G.d();
        L.o(g0, "getInstance(...)");
        this.g = g0;
    }

    @l
    public final bolts.j A(@l e e0) {
        L.p(e0, "key");
        this.g.g(e0);
        try {
            return bolts.j.e(() -> {
                L.p(this, "this$0");
                L.p(e0, "$key");
                Object object1 = e1.a.e(e1.a.d("BufferedDiskCache_remove"), null);
                try {
                    this.g.g(e0);
                    this.a.j(e0);
                }
                catch(Throwable throwable0) {
                    try {
                        e1.a.c(e1.a.d("BufferedDiskCache_remove"), throwable0);
                        throw throwable0;
                    }
                    catch(Throwable throwable1) {
                        e1.a.f(object1);
                        throw throwable1;
                    }
                }
                e1.a.f(object1);
                return null;
            }, this.e);
        }
        catch(Exception exception0) {
            Object[] arr_object = {e0.a()};
            x0.a.n0(m.i, exception0, "Failed to schedule disk-cache remove for %s", arr_object);
            return bolts.j.C(exception0);
        }
    }

    // 检测为 Lambda 实现
    private static final Void B(Object object0, m m0, e e0) [...]

    private final void C(e e0, com.facebook.imagepipeline.image.l l0) {
        String s = e0.a();
        x0.a.V(m.i, "About to write to disk-cache for key %s", s);
        try {
            com.facebook.imagepipeline.cache.l l1 = (OutputStream outputStream0) -> {
                L.p(this, "this$0");
                L.p(outputStream0, "os");
                L.m(l0);
                InputStream inputStream0 = l0.o();
                if(inputStream0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                this.c.a(inputStream0, outputStream0);
            };
            this.a.k(e0, l1);
            this.f.c(e0);
            String s1 = e0.a();
            x0.a.V(m.i, "Successful disk-cache write for key %s", s1);
        }
        catch(IOException iOException0) {
            Object[] arr_object = {e0.a()};
            x0.a.n0(m.i, iOException0, "Failed to write to disk-cache for key %s", arr_object);
        }
    }

    // 检测为 Lambda 实现
    private static final void D(com.facebook.imagepipeline.image.l l0, m m0, OutputStream outputStream0) [...]

    public final void h(@l e e0) {
        L.p(e0, "key");
        this.a.c(e0);
    }

    private final boolean i(e e0) {
        com.facebook.imagepipeline.image.l l0 = this.g.c(e0);
        if(l0 != null) {
            l0.close();
            String s = e0.a();
            x0.a.V(m.i, "Found image for %s in staging area", s);
            this.f.h(e0);
            return true;
        }
        String s1 = e0.a();
        x0.a.V(m.i, "Did not find image for %s in staging area", s1);
        this.f.d(e0);
        try {
            return this.a.h(e0);
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    @l
    public final bolts.j j() {
        this.g.a();
        Object object0 = e1.a.d("BufferedDiskCache_clearAll");
        try {
            return bolts.j.e(() -> {
                L.p(this, "this$0");
                Object object1 = e1.a.e(object0, null);
                try {
                    this.g.a();
                    this.a.b();
                }
                catch(Throwable throwable0) {
                    try {
                        e1.a.c(object0, throwable0);
                        throw throwable0;
                    }
                    catch(Throwable throwable1) {
                        e1.a.f(object1);
                        throw throwable1;
                    }
                }
                e1.a.f(object1);
                return null;
            }, this.e);
        }
        catch(Exception exception0) {
            x0.a.n0(m.i, exception0, "Failed to schedule disk-cache clear", new Object[0]);
            return bolts.j.C(exception0);
        }
    }

    // 检测为 Lambda 实现
    private static final Void k(Object object0, m m0) [...]

    @l
    public final bolts.j l(@l e e0) {
        L.p(e0, "key");
        if(this.o(e0)) {
            bolts.j j0 = bolts.j.D(Boolean.TRUE);
            L.m(j0);
            return j0;
        }
        return this.m(e0);
    }

    private final bolts.j m(e e0) {
        try {
            return bolts.j.e(() -> {
                Boolean boolean0;
                L.p(this, "this$0");
                L.p(e0, "$key");
                Object object1 = e1.a.e(e1.a.d("BufferedDiskCache_containsAsync"), null);
                try {
                    boolean0 = Boolean.valueOf(this.i(e0));
                }
                catch(Throwable throwable0) {
                    try {
                        e1.a.c(e1.a.d("BufferedDiskCache_containsAsync"), throwable0);
                        throw throwable0;
                    }
                    catch(Throwable throwable1) {
                        e1.a.f(object1);
                        throw throwable1;
                    }
                }
                e1.a.f(object1);
                return boolean0;
            }, this.d);
        }
        catch(Exception exception0) {
            Object[] arr_object = {e0.a()};
            x0.a.n0(m.i, exception0, "Failed to schedule disk-cache read for %s", arr_object);
            return bolts.j.C(exception0);
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean n(Object object0, m m0, e e0) [...]

    public final boolean o(@l e e0) {
        L.p(e0, "key");
        return this.g.b(e0) || this.a.f(e0);
    }

    public final boolean p(@l e e0) {
        L.p(e0, "key");
        return this.o(e0) ? true : this.i(e0);
    }

    private final bolts.j q(e e0, com.facebook.imagepipeline.image.l l0) {
        String s = e0.a();
        x0.a.V(m.i, "Found image for %s in staging area", s);
        this.f.h(e0);
        bolts.j j0 = bolts.j.D(l0);
        L.o(j0, "forResult(...)");
        return j0;
    }

    @l
    public final bolts.j r(@l e e0, @l AtomicBoolean atomicBoolean0) {
        bolts.j j0;
        L.p(e0, "key");
        L.p(atomicBoolean0, "isCancelled");
        if(!b.e()) {
            com.facebook.imagepipeline.image.l l0 = this.g.c(e0);
            if(l0 != null) {
                j0 = this.q(e0, l0);
                return j0 == null ? this.s(e0, atomicBoolean0) : j0;
            }
            return this.s(e0, atomicBoolean0);
        }
        b.a("BufferedDiskCache#get");
        try {
            com.facebook.imagepipeline.image.l l1 = this.g.c(e0);
            if(l1 == null) {
                j0 = this.s(e0, atomicBoolean0);
            }
            else {
                j0 = this.q(e0, l1);
                if(j0 == null) {
                    j0 = this.s(e0, atomicBoolean0);
                }
            }
            return j0;
        }
        finally {
            b.c();
        }
    }

    private final bolts.j s(e e0, AtomicBoolean atomicBoolean0) {
        try {
            return bolts.j.e(() -> {
                com.facebook.imagepipeline.image.l l1;
                com.facebook.imagepipeline.image.l l0;
                L.p(atomicBoolean0, "$isCancelled");
                L.p(this, "this$0");
                L.p(e0, "$key");
                Object object1 = e1.a.e(e1.a.d("BufferedDiskCache_getAsync"), null);
                try {
                    if(atomicBoolean0.get()) {
                        throw new CancellationException();
                    }
                    l0 = this.g.c(e0);
                    if(l0 != null) {
                        String s = e0.a();
                        x0.a.V(m.i, "Found image for %s in staging area", s);
                        this.f.h(e0);
                        goto label_28;
                    }
                    String s1 = e0.a();
                    x0.a.V(m.i, "Did not find image for %s in staging area", s1);
                    this.f.d(e0);
                    try {
                        i i0 = this.z(e0);
                        if(i0 != null) {
                            com.facebook.common.references.a a0 = com.facebook.common.references.a.t(i0);
                            L.o(a0, "of(...)");
                            try {
                                l1 = new com.facebook.imagepipeline.image.l(a0);
                            }
                            finally {
                                com.facebook.common.references.a.j(a0);
                            }
                            l0 = l1;
                            goto label_28;
                        }
                        goto label_40;
                    }
                    catch(Exception unused_ex) {
                    }
                }
                catch(Throwable throwable0) {
                    goto label_33;
                }
                e1.a.f(object1);
                return null;
                try {
                label_28:
                    if(Thread.interrupted()) {
                        x0.a.U(m.i, "Host thread was interrupted, decreasing reference count");
                        l0.close();
                        throw new InterruptedException();
                    }
                    goto label_38;
                }
                catch(Throwable throwable0) {
                }
                try {
                label_33:
                    e1.a.c(e1.a.d("BufferedDiskCache_getAsync"), throwable0);
                    throw throwable0;
                }
                catch(Throwable throwable1) {
                    e1.a.f(object1);
                    throw throwable1;
                }
            label_38:
                e1.a.f(object1);
                return l0;
            label_40:
                e1.a.f(object1);
                return null;
            }, this.d);
        }
        catch(Exception exception0) {
            Object[] arr_object = {e0.a()};
            x0.a.n0(m.i, exception0, "Failed to schedule disk-cache read for %s", arr_object);
            return bolts.j.C(exception0);
        }
    }

    // 检测为 Lambda 实现
    private static final com.facebook.imagepipeline.image.l t(Object object0, AtomicBoolean atomicBoolean0, m m0, e e0) [...]

    public final long u() {
        return this.a.getSize();
    }

    @l
    public final bolts.j v(@l e e0) {
        L.p(e0, "key");
        try {
            return bolts.j.e(() -> {
                L.p(this, "this$0");
                L.p(e0, "$key");
                Object object1 = e1.a.e(e1.a.d("BufferedDiskCache_probe"), null);
                try {
                    this.a.c(e0);
                    return null;
                }
                finally {
                    e1.a.f(object1);
                }
            }, this.e);
        }
        catch(Exception exception0) {
            Object[] arr_object = {e0.a()};
            x0.a.n0(m.i, exception0, "Failed to schedule disk-cache probe for %s", arr_object);
            return bolts.j.C(exception0);
        }
    }

    // 检测为 Lambda 实现
    private static final Void w(Object object0, m m0, e e0) [...]

    public final void x(@l e e0, @l com.facebook.imagepipeline.image.l l0) {
        L.p(e0, "key");
        L.p(l0, "encodedImage");
        if(!b.e()) {
            if(!com.facebook.imagepipeline.image.l.R(l0)) {
                throw new IllegalStateException("Check failed.");
            }
            this.g.f(e0, l0);
            com.facebook.imagepipeline.image.l l1 = com.facebook.imagepipeline.image.l.b(l0);
            try {
                g g0 = () -> {
                    L.p(this, "this$0");
                    L.p(e0, "$key");
                    Object object1 = e1.a.e(e1.a.d("BufferedDiskCache_putAsync"), null);
                    try {
                        this.C(e0, l1);
                    }
                    catch(Throwable throwable0) {
                        try {
                            e1.a.c(e1.a.d("BufferedDiskCache_putAsync"), throwable0);
                            throw throwable0;
                        }
                        catch(Throwable throwable1) {
                            L.m(l1);
                            this.g.h(e0, l1);
                            com.facebook.imagepipeline.image.l.c(l1);
                            e1.a.f(object1);
                            throw throwable1;
                        }
                    }
                    L.m(l1);
                    this.g.h(e0, l1);
                    com.facebook.imagepipeline.image.l.c(l1);
                    e1.a.f(object1);
                };
                this.e.execute(g0);
            }
            catch(Exception exception0) {
                Object[] arr_object = {e0.a()};
                x0.a.n0(m.i, exception0, "Failed to schedule disk-cache write for %s", arr_object);
                this.g.h(e0, l0);
                com.facebook.imagepipeline.image.l.c(l1);
            }
            return;
        }
        b.a("BufferedDiskCache#put");
        try {
            if(com.facebook.imagepipeline.image.l.R(l0)) {
                this.g.f(e0, l0);
                com.facebook.imagepipeline.image.l l2 = com.facebook.imagepipeline.image.l.b(l0);
                try {
                    g g1 = () -> {
                        L.p(this, "this$0");
                        L.p(e0, "$key");
                        Object object1 = e1.a.e(e1.a.d("BufferedDiskCache_putAsync"), null);
                        try {
                            this.C(e0, l2);
                        }
                        catch(Throwable throwable0) {
                            try {
                                e1.a.c(e1.a.d("BufferedDiskCache_putAsync"), throwable0);
                                throw throwable0;
                            }
                            catch(Throwable throwable1) {
                                L.m(l2);
                                this.g.h(e0, l2);
                                com.facebook.imagepipeline.image.l.c(l2);
                                e1.a.f(object1);
                                throw throwable1;
                            }
                        }
                        L.m(l2);
                        this.g.h(e0, l2);
                        com.facebook.imagepipeline.image.l.c(l2);
                        e1.a.f(object1);
                    };
                    this.e.execute(g1);
                }
                catch(Exception exception1) {
                    Object[] arr_object1 = {e0.a()};
                    x0.a.n0(m.i, exception1, "Failed to schedule disk-cache write for %s", arr_object1);
                    this.g.h(e0, l0);
                    com.facebook.imagepipeline.image.l.c(l2);
                }
                return;
            }
        }
        finally {
            b.c();
        }
        throw new IllegalStateException("Check failed.");
    }

    // 检测为 Lambda 实现
    private static final void y(Object object0, m m0, e e0, com.facebook.imagepipeline.image.l l0) [...]

    private final i z(e e0) throws IOException {
        i i0;
        try {
            Class class0 = m.i;
            x0.a.V(class0, "Disk cache read for %s", e0.a());
            r0.a a0 = this.a.d(e0);
            if(a0 == null) {
                x0.a.V(class0, "Disk cache miss for %s", e0.a());
                this.f.b(e0);
                return null;
            }
            x0.a.V(class0, "Found entry in disk cache for %s", e0.a());
            this.f.k(e0);
            InputStream inputStream0 = a0.a();
            try {
                int v1 = (int)a0.size();
                i0 = this.b.e(inputStream0, v1);
            }
            finally {
                inputStream0.close();
            }
            x0.a.V(class0, "Successful read from disk cache for %s", e0.a());
            return i0;
        }
        catch(IOException iOException0) {
        }
        Object[] arr_object = {e0.a()};
        x0.a.n0(m.i, iOException0, "Exception reading from cache for %s", arr_object);
        this.f.n(e0);
        throw iOException0;
    }
}

