package com.vungle.ads.internal.session;

import android.content.Context;
import com.vungle.ads.internal.model.p;
import com.vungle.ads.internal.util.h;
import com.vungle.ads.internal.util.q;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.reflect.u;
import kotlinx.serialization.i;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.s;
import kotlinx.serialization.z;
import y4.l;

public final class d {
    static final class a extends N implements Function1 {
        public static final a INSTANCE;

        static {
            a.INSTANCE = new a();
        }

        a() {
            super(1);
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            this.invoke(((f)object0));
            return S0.a;
        }

        public final void invoke(@l f f0) {
            L.p(f0, "$this$Json");
            f0.w(true);
            f0.u(true);
            f0.v(false);
            f0.r(true);
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    @l
    public static final b Companion = null;
    @l
    private static final String FILENAME = "unclosed_ad";
    @l
    private final Context context;
    @l
    private final com.vungle.ads.internal.executor.a executors;
    @l
    private File file;
    @l
    private static final kotlinx.serialization.json.b json;
    @l
    private final q pathProvider;
    @l
    private final String sessionId;
    @l
    private final CopyOnWriteArrayList unclosedAdList;

    static {
        d.Companion = new b(null);
        d.json = s.b(null, a.INSTANCE, 1, null);
    }

    public d(@l Context context0, @l String s, @l com.vungle.ads.internal.executor.a a0, @l q q0) {
        L.p(context0, "context");
        L.p(s, "sessionId");
        L.p(a0, "executors");
        L.p(q0, "pathProvider");
        super();
        this.context = context0;
        this.sessionId = s;
        this.executors = a0;
        this.pathProvider = q0;
        this.file = q0.getUnclosedAdFile("unclosed_ad");
        this.unclosedAdList = new CopyOnWriteArrayList();
        if(this.file != null && !this.file.exists()) {
            this.file.createNewFile();
        }
    }

    public final void addUnclosedAd(@l p p0) {
        L.p(p0, "ad");
        p0.setSessionId(this.sessionId);
        this.unclosedAdList.add(p0);
        this.writeUnclosedAdToFile(this.unclosedAdList);
    }

    private final Object decodeJson(String s) {
        kotlinx.serialization.modules.f f0 = d.json.a();
        L.y(6, "T");
        i i0 = z.k(f0, null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return d.json.d(i0, s);
    }

    @l
    public final Context getContext() {
        return this.context;
    }

    @l
    public final com.vungle.ads.internal.executor.a getExecutors() {
        return this.executors;
    }

    @l
    public final q getPathProvider() {
        return this.pathProvider;
    }

    private final List readUnclosedAdFromFile() {
        return (List)new com.vungle.ads.internal.executor.b(this.executors.getIoExecutor().submit(() -> {
            L.p(this, "this$0");
            try {
                String s = h.INSTANCE.readString(this.file);
                if(s != null && s.length() != 0) {
                    kotlinx.serialization.modules.f f0 = d.json.a();
                    kotlin.reflect.s s1 = m0.A(p.class);
                    u u0 = u.c.e(s1);
                    i i0 = z.k(f0, m0.B(List.class, u0));
                    L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    return (List)d.json.d(i0, s);
                }
                return new ArrayList();
            }
            catch(Exception exception0) {
            }
            com.vungle.ads.internal.util.p.Companion.e("UnclosedAdDetector", "Fail to read unclosed ad file " + exception0.getMessage());
            return new ArrayList();
        })).get(1000L, TimeUnit.MILLISECONDS);
    }

    // 检测为 Lambda 实现
    private static final List readUnclosedAdFromFile$lambda-2(d d0) [...]

    public final void removeUnclosedAd(@l p p0) {
        L.p(p0, "ad");
        if(this.unclosedAdList.contains(p0)) {
            this.unclosedAdList.remove(p0);
            this.writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    @l
    public final List retrieveUnclosedAd() {
        List list0 = new ArrayList();
        List list1 = this.readUnclosedAdFromFile();
        if(list1 != null) {
            list0.addAll(list1);
        }
        this.executors.getIoExecutor().execute(() -> {
            L.p(this, "this$0");
            try {
                h.deleteAndLogIfFailed(this.file);
            }
            catch(Exception exception0) {
                com.vungle.ads.internal.util.p.Companion.e("UnclosedAdDetector", "Fail to delete file " + exception0.getMessage());
            }
        });
        return list0;
    }

    // 检测为 Lambda 实现
    private static final void retrieveUnclosedAd$lambda-1(d d0) [...]

    private final void writeUnclosedAdToFile(List list0) {
        try {
            kotlinx.serialization.modules.f f0 = d.json.a();
            kotlin.reflect.s s0 = m0.A(p.class);
            u u0 = u.c.e(s0);
            i i0 = z.k(f0, m0.B(List.class, u0));
            L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String s1 = d.json.c(i0, list0);
            this.executors.getIoExecutor().execute(() -> {
                L.p(this, "this$0");
                L.p(s1, "$jsonContent");
                h.INSTANCE.writeString(this.file, s1);
            });
        }
        catch(Throwable throwable0) {
            com.vungle.ads.internal.util.p.Companion.e("UnclosedAdDetector", "Fail to write unclosed ad file " + throwable0.getMessage());
        }
    }

    // 检测为 Lambda 实现
    private static final void writeUnclosedAdToFile$lambda-3(d d0, String s) [...]
}

