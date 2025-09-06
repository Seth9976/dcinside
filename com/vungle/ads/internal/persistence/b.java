package com.vungle.ads.internal.persistence;

import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.util.c;
import com.vungle.ads.internal.util.h;
import com.vungle.ads.internal.util.q;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public final class b {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        @n
        public final b get(@l Executor executor0, @l q q0, @l String s) {
            synchronized(this) {
                L.p(executor0, "ioExecutor");
                L.p(q0, "pathProvider");
                L.p(s, "filename");
                ConcurrentHashMap concurrentHashMap0 = b.filePreferenceMap;
                b b0 = concurrentHashMap0.get(s);
                if(b0 == null) {
                    b0 = new b(executor0, q0, s, null);
                    Object object0 = concurrentHashMap0.putIfAbsent(s, b0);
                    if(object0 != null) {
                        b0 = object0;
                    }
                }
                L.o(b0, "filePreferenceMap.getOrP…, filename)\n            }");
                return b0;
            }
        }

        public static b get$default(a b$a0, Executor executor0, q q0, String s, int v, Object object0) {
            if((v & 4) != 0) {
                s = "settings_vungle";
            }
            return b$a0.get(executor0, q0, s);
        }

        @VisibleForTesting
        public static void getFILENAME$annotations() {
        }
    }

    @l
    public static final a Companion = null;
    @l
    public static final String FILENAME = "settings_vungle";
    @l
    public static final String GENERIC_TPAT_FAILED_FILENAME = "failedGenericTpats";
    @l
    public static final String TPAT_FAILED_FILENAME = "failedTpats";
    @l
    private final File file;
    @l
    private static final ConcurrentHashMap filePreferenceMap;
    @l
    private final Executor ioExecutor;
    @l
    private final ConcurrentHashMap values;

    static {
        b.Companion = new a(null);
        b.filePreferenceMap = new ConcurrentHashMap();
    }

    private b(Executor executor0, q q0, String s) {
        this.ioExecutor = executor0;
        File file0 = new File(q0.getSharedPrefsDir(), s);
        this.file = file0;
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
        this.values = concurrentHashMap0;
        Object object0 = h.readSerializable(file0);
        if(object0 instanceof HashMap) {
            concurrentHashMap0.putAll(((HashMap)object0));
        }
    }

    b(Executor executor0, q q0, String s, int v, w w0) {
        if((v & 4) != 0) {
            s = "settings_vungle";
        }
        this(executor0, q0, s);
    }

    public b(Executor executor0, q q0, String s, w w0) {
        this(executor0, q0, s);
    }

    public final void apply() {
        com.vungle.ads.internal.persistence.a a0 = () -> {
            L.p(this, "this$0");
            L.p(new HashMap(this.values), "$serializable");
            h.writeSerializable(this.file, new HashMap(this.values));
        };
        this.ioExecutor.execute(a0);
    }

    // 检测为 Lambda 实现
    private static final void apply$lambda-0(b b0, Serializable serializable0) [...]

    @l
    @n
    public static final b get(@l Executor executor0, @l q q0, @l String s) {
        synchronized(b.class) {
            return b.Companion.get(executor0, q0, s);
        }
    }

    @m
    public final Boolean getBoolean(@l String s) {
        L.p(s, "key");
        Object object0 = this.values.get(s);
        return object0 instanceof Boolean ? ((Boolean)object0) : null;
    }

    public final boolean getBoolean(@l String s, boolean z) {
        L.p(s, "key");
        Object object0 = this.values.get(s);
        return object0 instanceof Boolean ? ((Boolean)object0).booleanValue() : z;
    }

    public final int getInt(@l String s, int v) {
        L.p(s, "key");
        Object object0 = this.values.get(s);
        return object0 instanceof Integer ? ((Number)object0).intValue() : v;
    }

    public final long getLong(@l String s, long v) {
        L.p(s, "key");
        Object object0 = this.values.get(s);
        return object0 instanceof Long ? ((Number)object0).longValue() : v;
    }

    @m
    public final String getString(@l String s) {
        L.p(s, "key");
        Object object0 = this.values.get(s);
        return object0 instanceof String ? ((String)object0) : null;
    }

    @l
    public final String getString(@l String s, @l String s1) {
        L.p(s, "key");
        L.p(s1, "defaultValue");
        Object object0 = this.values.get(s);
        return object0 instanceof String ? ((String)object0) : s1;
    }

    @l
    public final HashSet getStringSet(@l String s, @l HashSet hashSet0) {
        L.p(s, "key");
        L.p(hashSet0, "defaultValue");
        Object object0 = this.values.get(s);
        return object0 instanceof HashSet ? c.getNewHashSet(((HashSet)object0)) : hashSet0;
    }

    @l
    public final b put(@l String s, int v) {
        L.p(s, "key");
        this.values.put(s, v);
        return this;
    }

    @l
    public final b put(@l String s, long v) {
        L.p(s, "key");
        this.values.put(s, v);
        return this;
    }

    @l
    public final b put(@l String s, @l String s1) {
        L.p(s, "key");
        L.p(s1, "value");
        this.values.put(s, s1);
        return this;
    }

    @l
    public final b put(@l String s, @m HashSet hashSet0) {
        L.p(s, "key");
        HashSet hashSet1 = c.getNewHashSet(hashSet0);
        this.values.put(s, hashSet1);
        return this;
    }

    @l
    public final b put(@l String s, boolean z) {
        L.p(s, "key");
        this.values.put(s, Boolean.valueOf(z));
        return this;
    }

    @l
    public final b remove(@l String s) {
        L.p(s, "key");
        if(this.values.containsKey(s)) {
            this.values.remove(s);
        }
        return this;
    }
}

