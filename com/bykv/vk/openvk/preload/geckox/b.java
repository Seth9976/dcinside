package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.a.a.c;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class b {
    public static final class a {
        private INetWork a;
        private List b;
        private List c;
        private Context d;
        private c e;
        private IStatisticMonitor f;
        private boolean g;
        private com.bykv.vk.openvk.preload.geckox.a.a.a h;
        private Long i;
        private String j;
        private String k;
        private String l;
        private File m;
        private String n;
        private String o;
        private long p;

        public a(Context context0) {
            this.g = true;
            this.d = context0.getApplicationContext();
        }

        public final a a() {
            this.g = false;
            return this;
        }

        public final a a(long v) {
            this.p = v;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a a0) {
            this.h = a0;
            return this;
        }

        public final a a(INetWork iNetWork0) {
            this.a = iNetWork0;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor0) {
            this.f = iStatisticMonitor0;
            return this;
        }

        public final a a(File file0) {
            this.m = file0;
            return this;
        }

        public final a a(String s) {
            this.j = s;
            return this;
        }

        public final a a(String[] arr_s) {
            this.c = Arrays.asList(arr_s);
            return this;
        }

        public final a b() {
            this.i = 38L;
            return this;
        }

        public final a b(String s) {
            this.k = s;
            return this;
        }

        public final a b(String[] arr_s) {
            this.b = Arrays.asList(arr_s);
            return this;
        }

        public final a c(String s) {
            this.l = s;
            return this;
        }
    }

    private final Context a;
    private final c b;
    private final IStatisticMonitor c;
    private final INetWork d;
    private final List e;
    private final List f;
    private final com.bykv.vk.openvk.preload.geckox.a.a.a g;
    private final Long h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final File n;
    private final boolean o;
    private final long p;
    private JSONObject q;
    private static IThreadPoolCallback r;
    private static ThreadPoolExecutor s;

    private b(a b$a0) {
        Context context0 = b$a0.d;
        this.a = context0;
        if(context0 == null) {
            throw new IllegalArgumentException("context == null");
        }
        List list0 = b$a0.b;
        this.e = list0;
        this.f = b$a0.c;
        this.b = b$a0.e;
        this.g = b$a0.h;
        Long long0 = b$a0.i;
        this.h = long0;
        this.i = TextUtils.isEmpty(b$a0.j) ? com.bykv.vk.openvk.preload.geckox.utils.a.a(context0) : b$a0.j;
        String s = b$a0.k;
        this.j = s;
        this.l = b$a0.n;
        this.m = b$a0.o;
        this.p = b$a0.p;
        this.n = b$a0.m == null ? new File(context0.getFilesDir(), "gecko_offline_res_x") : b$a0.m;
        String s1 = b$a0.l;
        this.k = s1;
        if(TextUtils.isEmpty(s1)) {
            throw new IllegalArgumentException("host == null");
        }
        if(list0 == null || list0.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if(long0 == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.d = b$a0.a;
        this.c = b$a0.f;
        this.o = b$a0.g;
    }

    b(a b$a0, byte b) {
        this(b$a0);
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback0) {
        b.r = iThreadPoolCallback0;
    }

    public final Context a() {
        return this.a;
    }

    public final void a(JSONObject jSONObject0) {
        this.q = jSONObject0;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.g;
    }

    public final boolean c() {
        return this.o;
    }

    public final List d() {
        return this.f;
    }

    public final List e() {
        return this.e;
    }

    public final JSONObject f() {
        return this.q;
    }

    public static Executor g() {
        return b.t();
    }

    public static Executor h() {
        return b.t();
    }

    public final INetWork i() {
        return this.d;
    }

    public final String j() {
        return this.k;
    }

    public final long k() {
        return (long)this.h;
    }

    public final String l() {
        return this.m;
    }

    public final String m() {
        return this.l;
    }

    public final File n() {
        return this.n;
    }

    public final String o() {
        return this.i;
    }

    public final c p() {
        return this.b;
    }

    public final IStatisticMonitor q() {
        return this.c;
    }

    public final String r() {
        return this.j;
    }

    public final long s() {
        return this.p;
    }

    public static ExecutorService t() {
        ExecutorService executorService0 = b.r == null ? null : b.r.getThreadPool();
        if(executorService0 != null) {
            return executorService0;
        }
        if(b.s == null) {
            Class class0 = b.class;
            __monitor_enter(class0);
            try {
                if(b.s == null) {
                    ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    b.s = threadPoolExecutor0;
                    threadPoolExecutor0.allowCoreThreadTimeOut(true);
                }
                __monitor_exit(class0);
                return b.s;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return b.s;
    }
}

