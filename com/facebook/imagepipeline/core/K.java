package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.d;
import com.facebook.common.internal.q;
import com.facebook.common.memory.j;
import com.facebook.imagepipeline.cache.x;
import com.facebook.imagepipeline.memory.N;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

public final class k implements q {
    @l
    private final com.facebook.imagepipeline.core.q a;
    @l
    private final N b;
    @l
    private final p c;
    @l
    private final x d;
    private final int e;
    @l
    private final d f;
    @l
    private final d g;
    @m
    private final Map h;
    @l
    private final D i;

    public k(@l com.facebook.imagepipeline.core.q q0, @l z z0) {
        L.p(q0, "fileCacheFactory");
        L.p(z0, "config");
        this(q0, z0.k(), z0.L(), z0.m(), z0.C(), z0.s(), z0.w(), z0.f());
    }

    public k(@l com.facebook.imagepipeline.core.q q0, @l N n0, @l p p0, @l x x0, int v, @l d d0, @l d d1, @m Map map0) {
        @s0({"SMAP\nDiskCachesStoreFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskCachesStoreFactory.kt\ncom/facebook/imagepipeline/core/DiskCachesStoreFactory$diskCachesStore$2$1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n462#2:102\n412#2:103\n462#2:109\n412#2:110\n1246#3,4:104\n1246#3,4:111\n1#4:108\n*S KotlinDebug\n*F\n+ 1 DiskCachesStoreFactory.kt\ncom/facebook/imagepipeline/core/DiskCachesStoreFactory$diskCachesStore$2$1\n*L\n79#1:102\n79#1:103\n86#1:109\n86#1:110\n79#1:104,4\n86#1:111,4\n*E\n"})
        public static final class a implements c {
            private final D a;
            private final D b;
            private final D c;
            private final D d;
            private final D e;
            private final D f;

            a(k k0) {
                e e0 = () -> {
                    L.p(k0, "this$0");
                    return k0.a.a(k0.f);
                };
                this.a = E.c(H.a, e0);
                f f0 = () -> {
                    L.p(this, "this$0");
                    L.p(k0, "this$1");
                    com.facebook.cache.disk.k k1 = this.f();
                    j j0 = k0.b.i(k0.e);
                    L.o(j0, "getPooledByteBufferFactory(...)");
                    com.facebook.common.memory.m m0 = k0.b.j();
                    L.o(m0, "getPooledByteStreams(...)");
                    Executor executor0 = k0.c.c();
                    L.o(executor0, "forLocalStorageRead(...)");
                    Executor executor1 = k0.c.e();
                    L.o(executor1, "forLocalStorageWrite(...)");
                    return new com.facebook.imagepipeline.cache.m(k1, j0, m0, executor0, executor1, k0.d);
                };
                this.b = E.c(H.a, f0);
                g g0 = () -> {
                    L.p(k0, "this$0");
                    return k0.a.a(k0.g);
                };
                this.c = E.c(H.a, g0);
                h h0 = () -> {
                    L.p(this, "this$0");
                    L.p(k0, "this$1");
                    com.facebook.cache.disk.k k1 = this.a();
                    j j0 = k0.b.i(k0.e);
                    L.o(j0, "getPooledByteBufferFactory(...)");
                    com.facebook.common.memory.m m0 = k0.b.j();
                    L.o(m0, "getPooledByteStreams(...)");
                    Executor executor0 = k0.c.c();
                    L.o(executor0, "forLocalStorageRead(...)");
                    Executor executor1 = k0.c.e();
                    L.o(executor1, "forLocalStorageWrite(...)");
                    return new com.facebook.imagepipeline.cache.m(k1, j0, m0, executor0, executor1, k0.d);
                };
                this.d = E.c(H.a, h0);
                i i0 = () -> {
                    L.p(k0, "this$0");
                    L.p(this, "this$1");
                    Map map0 = k0.h;
                    if(map0 != null) {
                        Map map1 = new LinkedHashMap(Y.j(map0.size()));
                        for(Object object0: map0.entrySet()) {
                            map1.put(((Map.Entry)object0).getKey(), k0.a.a(((d)((Map.Entry)object0).getValue())));
                        }
                        return map1;
                    }
                    return Y.z();
                };
                this.e = E.c(H.a, i0);
                com.facebook.imagepipeline.core.j j0 = () -> {
                    L.p(this, "this$0");
                    L.p(k0, "this$1");
                    Map map0 = this.d();
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap(Y.j(map0.size()));
                    for(Object object0: map0.entrySet()) {
                        Object object1 = ((Map.Entry)object0).getKey();
                        Object object2 = ((Map.Entry)object0).getValue();
                        j j0 = k0.b.i(k0.e);
                        L.o(j0, "getPooledByteBufferFactory(...)");
                        com.facebook.common.memory.m m0 = k0.b.j();
                        L.o(m0, "getPooledByteStreams(...)");
                        Executor executor0 = k0.c.c();
                        L.o(executor0, "forLocalStorageRead(...)");
                        Executor executor1 = k0.c.e();
                        L.o(executor1, "forLocalStorageWrite(...)");
                        linkedHashMap0.put(object1, new com.facebook.imagepipeline.cache.m(((com.facebook.cache.disk.k)object2), j0, m0, executor0, executor1, k0.d));
                    }
                    return com.facebook.common.internal.j.a(linkedHashMap0);
                };
                this.f = E.c(H.a, j0);
            }

            @Override  // com.facebook.imagepipeline.core.c
            public com.facebook.cache.disk.k a() {
                return (com.facebook.cache.disk.k)this.c.getValue();
            }

            @Override  // com.facebook.imagepipeline.core.c
            public com.facebook.imagepipeline.cache.m b() {
                return (com.facebook.imagepipeline.cache.m)this.d.getValue();
            }

            @Override  // com.facebook.imagepipeline.core.c
            public com.facebook.imagepipeline.cache.m c() {
                return (com.facebook.imagepipeline.cache.m)this.b.getValue();
            }

            @Override  // com.facebook.imagepipeline.core.c
            public Map d() {
                return (Map)this.e.getValue();
            }

            @Override  // com.facebook.imagepipeline.core.c
            public com.facebook.common.internal.j e() {
                Object object0 = this.f.getValue();
                L.o(object0, "getValue(...)");
                return (com.facebook.common.internal.j)object0;
            }

            @Override  // com.facebook.imagepipeline.core.c
            public com.facebook.cache.disk.k f() {
                return (com.facebook.cache.disk.k)this.a.getValue();
            }

            // 检测为 Lambda 实现
            private static final com.facebook.common.internal.j m(a k$a0, k k0) [...]

            // 检测为 Lambda 实现
            private static final Map n(k k0, a k$a0) [...]

            // 检测为 Lambda 实现
            private static final com.facebook.imagepipeline.cache.m o(a k$a0, k k0) [...]

            // 检测为 Lambda 实现
            private static final com.facebook.cache.disk.k p(k k0) [...]

            // 检测为 Lambda 实现
            private static final com.facebook.imagepipeline.cache.m q(a k$a0, k k0) [...]

            // 检测为 Lambda 实现
            private static final com.facebook.cache.disk.k r(k k0) [...]
        }

        L.p(q0, "fileCacheFactory");
        L.p(n0, "poolFactory");
        L.p(p0, "executorSupplier");
        L.p(x0, "imageCacheStatsTracker");
        L.p(d0, "mainDiskCacheConfig");
        L.p(d1, "smallImageDiskCacheConfig");
        super();
        this.a = q0;
        this.b = n0;
        this.c = p0;
        this.d = x0;
        this.e = v;
        this.f = d0;
        this.g = d1;
        this.h = map0;
        com.facebook.imagepipeline.core.d d2 = () -> {
            L.p(this, "this$0");
            return new a(this);
        };
        this.i = E.c(H.a, d2);
    }

    @Override  // com.facebook.common.internal.q
    public Object get() {
        return this.k();
    }

    // 检测为 Lambda 实现
    private static final a j(k k0) [...]

    @l
    public c k() {
        return this.l();
    }

    private final c l() {
        return (c)this.i.getValue();
    }
}

