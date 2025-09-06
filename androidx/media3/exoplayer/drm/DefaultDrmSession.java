package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.CopyOnWriteMultiset;
import androidx.media3.common.util.Log;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import h4.e;
import h4.m;
import j..util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

class DefaultDrmSession implements DrmSession {
    public interface ProvisioningManager {
        void a(Exception arg1, boolean arg2);

        void b();

        void c(DefaultDrmSession arg1);
    }

    public interface ReferenceCountListener {
        void a(DefaultDrmSession arg1, int arg2);

        void b(DefaultDrmSession arg1, int arg2);
    }

    @SuppressLint({"HandlerLeak"})
    class RequestHandler extends Handler {
        @GuardedBy("this")
        private boolean a;
        final DefaultDrmSession b;

        public RequestHandler(Looper looper0) {
            super(looper0);
        }

        private boolean a(Message message0, MediaDrmCallbackException mediaDrmCallbackException0) {
            RequestTask defaultDrmSession$RequestTask0 = (RequestTask)message0.obj;
            if(!defaultDrmSession$RequestTask0.b) {
                return false;
            }
            int v = defaultDrmSession$RequestTask0.e + 1;
            defaultDrmSession$RequestTask0.e = v;
            if(v > DefaultDrmSession.this.o.d(3)) {
                return false;
            }
            long v1 = SystemClock.elapsedRealtime();
            long v2 = SystemClock.elapsedRealtime();
            LoadEventInfo loadEventInfo0 = new LoadEventInfo(defaultDrmSession$RequestTask0.a, mediaDrmCallbackException0.a, mediaDrmCallbackException0.b, mediaDrmCallbackException0.c, v1, v2 - defaultDrmSession$RequestTask0.c, mediaDrmCallbackException0.d);
            MediaLoadData mediaLoadData0 = new MediaLoadData(3);
            IOException iOException0 = mediaDrmCallbackException0.getCause() instanceof IOException ? ((IOException)mediaDrmCallbackException0.getCause()) : new UnexpectedDrmSessionException(mediaDrmCallbackException0.getCause());
            long v3 = DefaultDrmSession.this.o.c(new LoadErrorInfo(loadEventInfo0, mediaLoadData0, iOException0, defaultDrmSession$RequestTask0.e));
            if(v3 == 0x8000000000000001L) {
                return false;
            }
            synchronized(this) {
                if(!this.a) {
                    this.sendMessageDelayed(Message.obtain(message0), v3);
                    return true;
                }
                return false;
            }
        }

        void b(int v, Object object0, boolean z) {
            this.obtainMessage(v, new RequestTask(LoadEventInfo.a(), z, SystemClock.elapsedRealtime(), object0)).sendToTarget();
        }

        public void c() {
            synchronized(this) {
                this.removeCallbacksAndMessages(null);
                this.a = true;
            }
        }

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            RequestTask defaultDrmSession$RequestTask0 = (RequestTask)message0.obj;
            try {
                switch(message0.what) {
                    case 1: {
                        arr_b = DefaultDrmSession.this.q.b(DefaultDrmSession.this.r, ((ProvisionRequest)defaultDrmSession$RequestTask0.d));
                        goto label_13;
                    }
                    case 2: {
                        arr_b = DefaultDrmSession.this.q.a(DefaultDrmSession.this.r, ((KeyRequest)defaultDrmSession$RequestTask0.d));
                        goto label_13;
                    }
                    default: {
                        throw new RuntimeException();
                    }
                }
            }
            catch(MediaDrmCallbackException arr_b) {
            }
            catch(Exception arr_b) {
                goto label_12;
            }
            if(this.a(message0, ((MediaDrmCallbackException)arr_b))) {
                return;
            label_12:
                Log.o("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", ((Throwable)arr_b));
            }
        label_13:
            DefaultDrmSession.this.o.a(defaultDrmSession$RequestTask0.a);
            synchronized(this) {
                if(!this.a) {
                    DefaultDrmSession.this.t.obtainMessage(message0.what, Pair.create(defaultDrmSession$RequestTask0.d, arr_b)).sendToTarget();
                }
            }
        }
    }

    static final class RequestTask {
        public final long a;
        public final boolean b;
        public final long c;
        public final Object d;
        public int e;

        public RequestTask(long v, boolean z, long v1, Object object0) {
            this.a = v;
            this.b = z;
            this.c = v1;
            this.d = object0;
        }
    }

    @SuppressLint({"HandlerLeak"})
    class ResponseHandler extends Handler {
        final DefaultDrmSession a;

        public ResponseHandler(Looper looper0) {
            super(looper0);
        }

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            Object object0 = ((Pair)message0.obj).first;
            Object object1 = ((Pair)message0.obj).second;
            switch(message0.what) {
                case 1: {
                    DefaultDrmSession.this.E(object0, object1);
                    return;
                }
                case 2: {
                    DefaultDrmSession.this.y(object0, object1);
                }
            }
        }
    }

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(@Nullable Throwable throwable0) {
            super(throwable0);
        }
    }

    @Nullable
    private byte[] A;
    private byte[] B;
    @Nullable
    private KeyRequest C;
    @Nullable
    private ProvisionRequest D;
    private static final String E = "DefaultDrmSession";
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 60;
    @Nullable
    public final List f;
    private final ExoMediaDrm g;
    private final ProvisioningManager h;
    private final ReferenceCountListener i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final HashMap m;
    private final CopyOnWriteMultiset n;
    private final LoadErrorHandlingPolicy o;
    private final PlayerId p;
    private final MediaDrmCallback q;
    private final UUID r;
    private final Looper s;
    private final ResponseHandler t;
    private int u;
    private int v;
    @Nullable
    private HandlerThread w;
    @Nullable
    private RequestHandler x;
    @Nullable
    private CryptoConfig y;
    @Nullable
    private DrmSessionException z;

    public DefaultDrmSession(UUID uUID0, ExoMediaDrm exoMediaDrm0, ProvisioningManager defaultDrmSession$ProvisioningManager0, ReferenceCountListener defaultDrmSession$ReferenceCountListener0, @Nullable List list0, int v, boolean z, boolean z1, @Nullable byte[] arr_b, HashMap hashMap0, MediaDrmCallback mediaDrmCallback0, Looper looper0, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, PlayerId playerId0) {
        if(v == 1 || v == 3) {
            Assertions.g(arr_b);
        }
        this.r = uUID0;
        this.h = defaultDrmSession$ProvisioningManager0;
        this.i = defaultDrmSession$ReferenceCountListener0;
        this.g = exoMediaDrm0;
        this.j = v;
        this.k = z;
        this.l = z1;
        if(arr_b == null) {
            this.f = DesugarCollections.unmodifiableList(((List)Assertions.g(list0)));
        }
        else {
            this.B = arr_b;
            this.f = null;
        }
        this.m = hashMap0;
        this.q = mediaDrmCallback0;
        this.n = new CopyOnWriteMultiset();
        this.o = loadErrorHandlingPolicy0;
        this.p = playerId0;
        this.u = 2;
        this.s = looper0;
        this.t = new ResponseHandler(this, looper0);
    }

    private void A() {
        if(this.j == 0 && this.u == 4) {
            this.r(false);
        }
    }

    void B(int v) {
        if(v == 2) {
            this.A();
        }
    }

    void C() {
        if(this.F()) {
            this.r(true);
        }
    }

    void D(Exception exception0, boolean z) {
        this.x(exception0, (z ? 1 : 3));
    }

    private void E(Object object0, Object object1) {
        if(object0 == this.D && (this.u == 2 || this.u())) {
            this.D = null;
            if(object1 instanceof Exception) {
                this.h.a(((Exception)object1), false);
                return;
            }
            try {
                this.g.p(((byte[])object1));
            }
            catch(Exception exception0) {
                this.h.a(exception0, true);
                return;
            }
            this.h.b();
        }
    }

    @e(expression = {"sessionId"}, result = true)
    private boolean F() {
        if(this.u()) {
            return true;
        }
        try {
            byte[] arr_b = this.g.g();
            this.A = arr_b;
            this.g.n(arr_b, this.p);
            this.y = this.g.r(this.A);
            this.u = 3;
            this.q((EventDispatcher drmSessionEventListener$EventDispatcher0) -> drmSessionEventListener$EventDispatcher0.k(3));
            Assertions.g(this.A);
            return true;
        }
        catch(NotProvisionedException unused_ex) {
            this.h.c(this);
            return false;
        }
        catch(Exception | NoSuchMethodError exception0) {
            if(DrmUtil.b(exception0)) {
                this.h.c(this);
                return false;
            }
            this.x(exception0, 1);
            return false;
        }
    }

    private void G(byte[] arr_b, int v, boolean z) {
        try {
            this.C = this.g.x(arr_b, this.f, v, this.m);
            this.x.b(2, Assertions.g(this.C), z);
        }
        catch(Exception | NoSuchMethodError exception0) {
            this.z(exception0, true);
        }
    }

    void H() {
        this.D = this.g.e();
        this.x.b(1, Assertions.g(this.D), true);
    }

    @m({"sessionId", "offlineLicenseKeySetId"})
    private boolean I() {
        try {
            this.g.h(this.A, this.B);
            return true;
        }
        catch(Exception | NoSuchMethodError exception0) {
            this.x(exception0, 1);
            return false;
        }
    }

    // 去混淆评级： 低(20)
    private void J() {
        if(Thread.currentThread() != this.s.getThread()) {
            Log.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: jeb-dexdec-sb-st-2784\nExpected thread: " + this.s.getThread().getName(), new IllegalStateException());
        }
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    public boolean a() {
        this.J();
        return this.k;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public final CryptoConfig b() {
        this.J();
        return this.y;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public Map c() {
        this.J();
        return this.A == null ? null : this.g.d(this.A);
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    public void d(@Nullable EventDispatcher drmSessionEventListener$EventDispatcher0) {
        this.J();
        int v = this.v;
        if(v <= 0) {
            Log.d("DefaultDrmSession", "release() called on a session that\'s already fully released.");
            return;
        }
        this.v = v - 1;
        if(v - 1 == 0) {
            this.u = 0;
            this.t.removeCallbacksAndMessages(null);
            this.x.c();
            this.x = null;
            this.w.quit();
            this.w = null;
            this.y = null;
            this.z = null;
            this.C = null;
            this.D = null;
            byte[] arr_b = this.A;
            if(arr_b != null) {
                this.g.u(arr_b);
                this.A = null;
            }
        }
        if(drmSessionEventListener$EventDispatcher0 != null) {
            this.n.b(drmSessionEventListener$EventDispatcher0);
            if(this.n.y3(drmSessionEventListener$EventDispatcher0) == 0) {
                drmSessionEventListener$EventDispatcher0.m();
            }
        }
        this.i.b(this, this.v);
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    public final UUID e() {
        this.J();
        return this.r;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public byte[] f() {
        this.J();
        return this.B;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    public void g(@Nullable EventDispatcher drmSessionEventListener$EventDispatcher0) {
        this.J();
        boolean z = false;
        if(this.v < 0) {
            Log.d("DefaultDrmSession", "Session reference count less than zero: " + this.v);
            this.v = 0;
        }
        if(drmSessionEventListener$EventDispatcher0 != null) {
            this.n.a(drmSessionEventListener$EventDispatcher0);
        }
        int v = this.v + 1;
        this.v = v;
        if(v == 1) {
            if(this.u == 2) {
                z = true;
            }
            Assertions.i(z);
            HandlerThread handlerThread0 = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.w = handlerThread0;
            handlerThread0.start();
            this.x = new RequestHandler(this, this.w.getLooper());
            if(this.F()) {
                this.r(true);
            }
        }
        else if(drmSessionEventListener$EventDispatcher0 != null && this.u() && this.n.y3(drmSessionEventListener$EventDispatcher0) == 1) {
            drmSessionEventListener$EventDispatcher0.k(this.u);
        }
        this.i.a(this, this.v);
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public final DrmSessionException getError() {
        this.J();
        return this.u == 1 ? this.z : null;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        this.J();
        return this.u;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    public boolean h(String s) {
        this.J();
        byte[] arr_b = (byte[])Assertions.k(this.A);
        return this.g.t(arr_b, s);
    }

    private void q(Consumer consumer0) {
        for(Object object0: this.n.f()) {
            consumer0.accept(((EventDispatcher)object0));
        }
    }

    @m({"sessionId"})
    private void r(boolean z) {
        if(this.l) {
            return;
        }
        byte[] arr_b = this.A;
        int v = this.j;
        switch(v) {
            case 0: 
            case 1: {
                if(this.B == null) {
                    this.G(arr_b, 1, z);
                    return;
                }
                if(this.u == 4 || this.I()) {
                    long v1 = this.s();
                    if(this.j == 0 && v1 <= 60L) {
                        Log.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + v1);
                        this.G(arr_b, 2, z);
                        return;
                    }
                    if(v1 <= 0L) {
                        this.x(new KeysExpiredException(), 2);
                        return;
                    }
                    this.u = 4;
                    this.q(new androidx.media3.exoplayer.drm.e());
                    return;
                }
                break;
            }
            case 2: {
                if(this.B == null || this.I()) {
                    this.G(arr_b, 2, z);
                    return;
                }
                break;
            }
            default: {
                if(v == 3) {
                    Assertions.g(this.B);
                    Assertions.g(this.A);
                    this.G(this.B, 3, z);
                }
            }
        }
    }

    private long s() {
        if(!C.j2.equals(this.r)) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        Pair pair0 = (Pair)Assertions.g(WidevineUtil.b(this));
        return Math.min(((long)(((Long)pair0.first))), ((long)(((Long)pair0.second))));
    }

    public boolean t(byte[] arr_b) {
        this.J();
        return Arrays.equals(this.A, arr_b);
    }

    @e(expression = {"sessionId"}, result = true)
    private boolean u() {
        return this.u == 3 || this.u == 4;
    }

    // 检测为 Lambda 实现
    private static void v(Throwable throwable0, EventDispatcher drmSessionEventListener$EventDispatcher0) [...]

    // 检测为 Lambda 实现
    private static void w(int v, EventDispatcher drmSessionEventListener$EventDispatcher0) [...]

    private void x(Throwable throwable0, int v) {
        this.z = new DrmSessionException(throwable0, DrmUtil.a(throwable0, v));
        Log.e("DefaultDrmSession", "DRM session error", throwable0);
        if(throwable0 instanceof Exception) {
            this.q((EventDispatcher drmSessionEventListener$EventDispatcher0) -> drmSessionEventListener$EventDispatcher0.l(((Exception)throwable0)));
        }
        else if(!(throwable0 instanceof Error)) {
            throw new IllegalStateException("Unexpected Throwable subclass", throwable0);
        }
        else if(!DrmUtil.c(throwable0) && !DrmUtil.b(throwable0)) {
            throw (Error)throwable0;
        }
        if(this.u != 4) {
            this.u = 1;
        }
    }

    private void y(Object object0, Object object1) {
        if(object0 == this.C && this.u()) {
            this.C = null;
            if(!(object1 instanceof Exception) && !(object1 instanceof NoSuchMethodError)) {
                try {
                    if(this.j == 3) {
                        this.g.m(this.B, ((byte[])object1));
                        this.q(new b());
                        return;
                    }
                    byte[] arr_b = this.g.m(this.A, ((byte[])object1));
                    if((this.j == 2 || this.j == 0 && this.B != null) && arr_b != null && arr_b.length != 0) {
                        this.B = arr_b;
                    }
                    this.u = 4;
                    this.q(new c());
                    return;
                }
                catch(Exception | NoSuchMethodError exception0) {
                }
                this.z(exception0, true);
                return;
            }
            this.z(((Throwable)object1), false);
        }
    }

    private void z(Throwable throwable0, boolean z) {
        if(!(throwable0 instanceof NotProvisionedException) && !DrmUtil.b(throwable0)) {
            this.x(throwable0, (z ? 1 : 2));
            return;
        }
        this.h.c(this);
    }
}

