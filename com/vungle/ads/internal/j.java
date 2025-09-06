package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.Z0;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.y;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import y4.l;
import y4.m;

public final class j {
    public static final class a {
        @l
        private c downCoordinate;
        @l
        private c upCoordinate;

        public a(@l c j$c0, @l c j$c1) {
            L.p(j$c0, "downCoordinate");
            L.p(j$c1, "upCoordinate");
            super();
            this.downCoordinate = j$c0;
            this.upCoordinate = j$c1;
        }

        @l
        public final c component1() {
            return this.downCoordinate;
        }

        @l
        public final c component2() {
            return this.upCoordinate;
        }

        @l
        public final a copy(@l c j$c0, @l c j$c1) {
            L.p(j$c0, "downCoordinate");
            L.p(j$c1, "upCoordinate");
            return new a(j$c0, j$c1);
        }

        public static a copy$default(a j$a0, c j$c0, c j$c1, int v, Object object0) {
            if((v & 1) != 0) {
                j$c0 = j$a0.downCoordinate;
            }
            if((v & 2) != 0) {
                j$c1 = j$a0.upCoordinate;
            }
            return j$a0.copy(j$c0, j$c1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            return L.g(this.downCoordinate, ((a)object0).downCoordinate) ? L.g(this.upCoordinate, ((a)object0).upCoordinate) : false;
        }

        @l
        public final c getDownCoordinate() {
            return this.downCoordinate;
        }

        @l
        public final c getUpCoordinate() {
            return this.upCoordinate;
        }

        @Override
        public int hashCode() {
            return this.downCoordinate.hashCode() * 0x1F + this.upCoordinate.hashCode();
        }

        public final boolean ready() {
            return this.downCoordinate.getX() != 0x80000000 && this.downCoordinate.getY() != 0x80000000 && this.upCoordinate.getX() != 0x80000000 && this.upCoordinate.getY() != 0x80000000;
        }

        public final void setDownCoordinate(@l c j$c0) {
            L.p(j$c0, "<set-?>");
            this.downCoordinate = j$c0;
        }

        public final void setUpCoordinate(@l c j$c0) {
            L.p(j$c0, "<set-?>");
            this.upCoordinate = j$c0;
        }

        @Override
        @l
        public String toString() {
            return "ClickCoordinate(downCoordinate=" + this.downCoordinate + ", upCoordinate=" + this.upCoordinate + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    public static final class c {
        private final int x;
        private final int y;

        public c(int v, int v1) {
            this.x = v;
            this.y = v1;
        }

        public final int component1() {
            return this.x;
        }

        public final int component2() {
            return this.y;
        }

        @l
        public final c copy(int v, int v1) {
            return new c(v, v1);
        }

        public static c copy$default(c j$c0, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = j$c0.x;
            }
            if((v2 & 2) != 0) {
                v1 = j$c0.y;
            }
            return j$c0.copy(v, v1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof c)) {
                return false;
            }
            return this.x == ((c)object0).x ? this.y == ((c)object0).y : false;
        }

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }

        @Override
        public int hashCode() {
            return this.x * 0x1F + this.y;
        }

        @Override
        @l
        public String toString() {
            return "Coordinate(x=" + this.x + ", y=" + this.y + ')';
        }
    }

    public static final class d {
        @l
        private final Context context;
        @l
        private final DisplayMetrics dm;

        public d(@l Context context0) {
            L.p(context0, "context");
            super();
            this.context = context0;
            DisplayMetrics displayMetrics0 = new DisplayMetrics();
            this.dm = displayMetrics0;
            Object object0 = context0.getSystemService("window");
            L.n(object0, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager)object0).getDefaultDisplay().getMetrics(displayMetrics0);
        }

        @l
        public final Context component1() {
            return this.context;
        }

        @l
        public final d copy(@l Context context0) {
            L.p(context0, "context");
            return new d(context0);
        }

        public static d copy$default(d j$d0, Context context0, int v, Object object0) {
            if((v & 1) != 0) {
                context0 = j$d0.context;
            }
            return j$d0.copy(context0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof d ? L.g(this.context, ((d)object0).context) : false;
        }

        @l
        public final Context getContext() {
            return this.context;
        }

        public final int getDeviceHeight() {
            return this.dm.heightPixels;
        }

        public final int getDeviceWidth() {
            return this.dm.widthPixels;
        }

        @Override
        public int hashCode() {
            return this.context.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "DeviceScreenInfo(context=" + this.context + ')';
        }
    }

    @l
    public static final b Companion = null;
    private static final String MACRO_DOWN_X = null;
    private static final String MACRO_DOWN_Y = null;
    private static final String MACRO_HEIGHT = null;
    private static final String MACRO_REQ_HEIGHT = null;
    private static final String MACRO_REQ_WIDTH = null;
    private static final String MACRO_UP_X = null;
    private static final String MACRO_UP_Y = null;
    private static final String MACRO_WIDTH = null;
    @l
    private static final String TAG = "ClickCoordinateTracker";
    @l
    private final com.vungle.ads.internal.model.b advertisement;
    @l
    private final Context context;
    @l
    private final a currentClick;
    @l
    private final Executor executor;
    @l
    private final D executors$delegate;
    @l
    private final D vungleApiClient$delegate;

    static {
        j.Companion = new b(null);
        j.MACRO_REQ_WIDTH = "\\Q{{{req_width}}}\\E";
        j.MACRO_REQ_HEIGHT = "\\Q{{{req_height}}}\\E";
        j.MACRO_WIDTH = "\\Q{{{width}}}\\E";
        j.MACRO_HEIGHT = "\\Q{{{height}}}\\E";
        j.MACRO_DOWN_X = "\\Q{{{down_x}}}\\E";
        j.MACRO_DOWN_Y = "\\Q{{{down_y}}}\\E";
        j.MACRO_UP_X = "\\Q{{{up_x}}}\\E";
        j.MACRO_UP_Y = "\\Q{{{up_y}}}\\E";
    }

    public j(@l Context context0, @l com.vungle.ads.internal.model.b b0, @l Executor executor0) {
        public static final class g extends N implements A3.a {
            final Context $context;

            public g(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.l.class);
            }
        }


        public static final class h extends N implements A3.a {
            final Context $context;

            public h(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
            }
        }

        L.p(context0, "context");
        L.p(b0, "advertisement");
        L.p(executor0, "executor");
        super();
        this.context = context0;
        this.advertisement = b0;
        this.executor = executor0;
        g j$g0 = new g(context0);
        this.vungleApiClient$delegate = E.c(H.a, j$g0);
        h j$h0 = new h(context0);
        this.executors$delegate = E.c(H.a, j$h0);
        this.currentClick = new a(new c(0x80000000, 0x80000000), new c(0x80000000, 0x80000000));
    }

    @l
    public final a getCurrentClick$vungle_ads_release() {
        return this.currentClick;
    }

    @VisibleForTesting
    public static void getCurrentClick$vungle_ads_release$annotations() {
    }

    private final int getDeviceHeight() {
        return new d(this.context).getDeviceHeight();
    }

    private final int getDeviceWidth() {
        return new d(this.context).getDeviceWidth();
    }

    private final com.vungle.ads.internal.executor.a getExecutors() {
        return (com.vungle.ads.internal.executor.a)this.executors$delegate.getValue();
    }

    private final int getRequestedHeight() {
        int v = this.advertisement.adHeight();
        return v == 0 ? this.getDeviceHeight() : y.INSTANCE.dpToPixels(this.context, v);
    }

    private final int getRequestedWidth() {
        int v = this.advertisement.adWidth();
        return v == 0 ? this.getDeviceWidth() : y.INSTANCE.dpToPixels(this.context, v);
    }

    private final com.vungle.ads.internal.network.l getVungleApiClient() {
        return (com.vungle.ads.internal.network.l)this.vungleApiClient$delegate.getValue();
    }

    private final void sendClickCoordinates() {
        public static final class e extends N implements A3.a {
            final Context $context;

            public e(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(q.class);
            }
        }


        public static final class f extends N implements A3.a {
            final Context $context;

            public f(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.c.class);
            }
        }

        List list0 = com.vungle.ads.internal.model.b.getTpatUrls$default(this.advertisement, "video.clickCoordinates", null, null, 6, null);
        if(list0 != null && !list0.isEmpty()) {
            int v = this.getRequestedWidth();
            int v1 = this.getRequestedHeight();
            int v2 = this.getRequestedWidth();
            int v3 = this.getRequestedHeight();
            e j$e0 = new e(this.context);
            D d0 = E.c(H.a, j$e0);
            f j$f0 = new f(this.context);
            D d1 = E.c(H.a, j$f0);
            com.vungle.ads.internal.network.l l0 = this.getVungleApiClient();
            i i0 = this.getExecutors().getIoExecutor();
            q q0 = j.sendClickCoordinates$lambda-0(d0);
            com.vungle.ads.internal.signals.c c0 = j.sendClickCoordinates$lambda-1(d1);
            com.vungle.ads.internal.network.j j0 = new com.vungle.ads.internal.network.j(l0, this.advertisement.getLogEntry$vungle_ads_release(), i0, q0, c0);
            for(Object object0: list0) {
                L.o("\\Q{{{req_width}}}\\E", "MACRO_REQ_WIDTH");
                String s = new r("\\Q{{{req_width}}}\\E").m(((String)object0), String.valueOf(v));
                L.o("\\Q{{{req_height}}}\\E", "MACRO_REQ_HEIGHT");
                String s1 = new r("\\Q{{{req_height}}}\\E").m(s, String.valueOf(v1));
                L.o("\\Q{{{width}}}\\E", "MACRO_WIDTH");
                String s2 = new r("\\Q{{{width}}}\\E").m(s1, String.valueOf(v2));
                L.o("\\Q{{{height}}}\\E", "MACRO_HEIGHT");
                String s3 = new r("\\Q{{{height}}}\\E").m(s2, String.valueOf(v3));
                L.o("\\Q{{{down_x}}}\\E", "MACRO_DOWN_X");
                String s4 = new r("\\Q{{{down_x}}}\\E").m(s3, String.valueOf(this.currentClick.getDownCoordinate().getX()));
                L.o("\\Q{{{down_y}}}\\E", "MACRO_DOWN_Y");
                String s5 = new r("\\Q{{{down_y}}}\\E").m(s4, String.valueOf(this.currentClick.getDownCoordinate().getY()));
                L.o("\\Q{{{up_x}}}\\E", "MACRO_UP_X");
                String s6 = new r("\\Q{{{up_x}}}\\E").m(s5, String.valueOf(this.currentClick.getUpCoordinate().getX()));
                L.o("\\Q{{{up_y}}}\\E", "MACRO_UP_Y");
                j0.sendTpat(new r("\\Q{{{up_y}}}\\E").m(s6, String.valueOf(this.currentClick.getUpCoordinate().getY())), this.executor);
            }
            return;
        }
        new Z0(com.vungle.ads.internal.protos.Sdk.SDKError.b.EMPTY_TPAT_ERROR, "Empty urls for tpat: video.clickCoordinates").setLogEntry$vungle_ads_release(this.advertisement.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
    }

    private static final q sendClickCoordinates$lambda-0(D d0) {
        return (q)d0.getValue();
    }

    private static final com.vungle.ads.internal.signals.c sendClickCoordinates$lambda-1(D d0) {
        return (com.vungle.ads.internal.signals.c)d0.getValue();
    }

    public final void trackCoordinate(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "event");
        if(!this.advertisement.isClickCoordinatesTrackingEnabled()) {
            return;
        }
        switch(motionEvent0.getAction()) {
            case 0: {
                c j$c0 = new c(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
                this.currentClick.setDownCoordinate(j$c0);
                return;
            }
            case 1: {
                c j$c1 = new c(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
                this.currentClick.setUpCoordinate(j$c1);
                if(this.currentClick.ready()) {
                    this.sendClickCoordinates();
                }
            }
        }
    }
}

