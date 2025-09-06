package com.unity3d.services.core.network.domain;

import A3.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.V;
import kotlin.collections.u;
import kotlin.comparisons.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.sequences.m;
import kotlin.sequences.p;
import y4.l;

@s0({"SMAP\nCleanupDirectory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CleanupDirectory.kt\ncom/unity3d/services/core/network/domain/CleanupDirectory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1#2:40\n2689#3,10:41\n603#3:53\n179#3,2:54\n1855#4,2:51\n1855#4,2:56\n*S KotlinDebug\n*F\n+ 1 CleanupDirectory.kt\ncom/unity3d/services/core/network/domain/CleanupDirectory\n*L\n15#1:41,10\n28#1:53\n32#1:54,2\n21#1:51,2\n36#1:56,2\n*E\n"})
public final class CleanupDirectory {
    public final void invoke(@l File file0, int v, long v1) {
        L.p(file0, "directory");
        if(!file0.exists() || !file0.isDirectory()) {
            throw new IllegalArgumentException(("Directory does not exist or is not a directory: " + file0).toString());
        }
        Object object0 = null;
        m m0 = p.p0(kotlin.io.m.N(file0, null, 1, null), com.unity3d.services.core.network.domain.CleanupDirectory.invoke.cachedFiles.1.INSTANCE);
        long v2 = 0L;
        long v3 = 0L;
        for(Object object1: m0) {
            v3 += ((File)object1).length();
        }
        long v4 = System.currentTimeMillis();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object2: m0) {
            if(((File)object2).lastModified() + v1 < v4) {
                arrayList0.add(object2);
            }
            else {
                arrayList1.add(object2);
            }
        }
        V v5 = new V(arrayList0, arrayList1);
        List list0 = (List)v5.b();
        Iterable iterable0 = (List)v5.a();
        for(Object object3: iterable0) {
            v2 += ((File)object3).length();
        }
        long v6 = v3 - v2;
        for(Object object4: iterable0) {
            ((File)object4).delete();
        }
        if(v6 > ((long)(0x100000 * v))) {
            for(Object object5: p.w2(p.K2(u.A1(list0), new com.unity3d.services.core.network.domain.CleanupDirectory.invoke..inlined.sortedBy.1()), r0.a(v6, u.H()), com.unity3d.services.core.network.domain.CleanupDirectory.invoke.additionalFiles.2.INSTANCE)) {
                if(((Number)((V)object5).a()).longValue() <= ((long)(0x100000 * v))) {
                    object0 = object5;
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(((V)object0) != null) {
                List list1 = (List)((V)object0).b();
                if(list1 != null) {
                    list0 = list1;
                }
            }
            for(Object object6: list0) {
                ((File)object6).delete();
            }
        }

        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CleanupDirectory.kt\ncom/unity3d/services/core/network/domain/CleanupDirectory\n*L\n1#1,328:1\n28#2:329\n*E\n"})
        public final class com.unity3d.services.core.network.domain.CleanupDirectory.invoke..inlined.sortedBy.1 implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return a.l(((File)object0).lastModified(), ((File)object1).lastModified());
            }
        }


        final class com.unity3d.services.core.network.domain.CleanupDirectory.invoke.additionalFiles.2 extends N implements o {
            public static final com.unity3d.services.core.network.domain.CleanupDirectory.invoke.additionalFiles.2 INSTANCE;

            static {
                com.unity3d.services.core.network.domain.CleanupDirectory.invoke.additionalFiles.2.INSTANCE = new com.unity3d.services.core.network.domain.CleanupDirectory.invoke.additionalFiles.2();
            }

            com.unity3d.services.core.network.domain.CleanupDirectory.invoke.additionalFiles.2() {
                super(2);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((V)object0), ((File)object1));
            }

            @l
            public final V invoke(@l V v0, @l File file0) {
                L.p(v0, "<name for destructuring parameter 0>");
                L.p(file0, "file");
                return r0.a(((long)(((Number)v0.a()).longValue() - file0.length())), u.E4(((List)v0.b()), file0));
            }
        }


        final class com.unity3d.services.core.network.domain.CleanupDirectory.invoke.cachedFiles.1 extends H implements Function1 {
            public static final com.unity3d.services.core.network.domain.CleanupDirectory.invoke.cachedFiles.1 INSTANCE;

            static {
                com.unity3d.services.core.network.domain.CleanupDirectory.invoke.cachedFiles.1.INSTANCE = new com.unity3d.services.core.network.domain.CleanupDirectory.invoke.cachedFiles.1();
            }

            com.unity3d.services.core.network.domain.CleanupDirectory.invoke.cachedFiles.1() {
                super(1, File.class, "isFile", "isFile()Z", 0);
            }

            @l
            public final Boolean invoke(@l File file0) {
                L.p(file0, "p0");
                return Boolean.valueOf(file0.isFile());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((File)object0));
            }
        }

    }
}

