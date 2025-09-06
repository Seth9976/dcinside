package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.util.q;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;

public final class j implements c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final e makeJobInfo() {
            return new e("ResendTpatJob").setPriority(0).setUpdateCurrent(true);
        }
    }

    @l
    public static final a Companion = null;
    @l
    public static final String TAG = "ResendTpatJob";
    @l
    private final Context context;
    @l
    private final q pathProvider;

    static {
        j.Companion = new a(null);
    }

    public j(@l Context context0, @l q q0) {
        L.p(context0, "context");
        L.p(q0, "pathProvider");
        super();
        this.context = context0;
        this.pathProvider = q0;
    }

    @l
    public final Context getContext() {
        return this.context;
    }

    @l
    public final q getPathProvider() {
        return this.pathProvider;
    }

    @Override  // com.vungle.ads.internal.task.c
    public int onRunJob(@l Bundle bundle0, @l g g0) {
        public static final class b extends N implements A3.a {
            final Context $context;

            public b(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.l.class);
            }
        }


        public static final class com.vungle.ads.internal.task.j.c extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.task.j.c(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
            }
        }

        L.p(bundle0, "bundle");
        L.p(g0, "jobRunner");
        b j$b0 = new b(this.context);
        D d0 = E.c(H.a, j$b0);
        com.vungle.ads.internal.task.j.c j$c0 = new com.vungle.ads.internal.task.j.c(this.context);
        D d1 = E.c(H.a, j$c0);
        new com.vungle.ads.internal.network.j(j.onRunJob$lambda-0(d0), null, j.onRunJob$lambda-1(d1).getIoExecutor(), this.pathProvider, null, 18, null).resendStoredTpats$vungle_ads_release(j.onRunJob$lambda-1(d1).getJobExecutor());
        return 0;
    }

    private static final com.vungle.ads.internal.network.l onRunJob$lambda-0(D d0) {
        return (com.vungle.ads.internal.network.l)d0.getValue();
    }

    private static final com.vungle.ads.internal.executor.a onRunJob$lambda-1(D d0) {
        return (com.vungle.ads.internal.executor.a)d0.getValue();
    }
}

