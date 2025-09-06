package androidx.media3.exoplayer.drm;

import O1.a;
import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData.SchemeData;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.google.common.collect.D4;
import com.google.common.collect.O2;
import com.google.common.collect.a3;
import com.google.common.collect.u5;
import h4.d;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@UnstableApi
public class DefaultDrmSessionManager implements DrmSessionManager {
    public static final class Builder {
        private final HashMap a;
        private UUID b;
        private Provider c;
        private boolean d;
        private int[] e;
        private boolean f;
        private LoadErrorHandlingPolicy g;
        private long h;

        public Builder() {
            this.a = new HashMap();
            this.b = C.j2;
            this.c = FrameworkMediaDrm.k;
            this.e = new int[0];
            this.f = true;
            this.g = new DefaultLoadErrorHandlingPolicy();
            this.h = 300000L;
        }

        public DefaultDrmSessionManager a(MediaDrmCallback mediaDrmCallback0) {
            return new DefaultDrmSessionManager(this.b, this.c, mediaDrmCallback0, this.a, this.d, this.e, this.f, this.g, this.h, null);
        }

        @a
        public Builder b(@Nullable Map map0) {
            this.a.clear();
            if(map0 != null) {
                this.a.putAll(map0);
            }
            return this;
        }

        @a
        public Builder c(LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
            this.g = (LoadErrorHandlingPolicy)Assertions.g(loadErrorHandlingPolicy0);
            return this;
        }

        @a
        public Builder d(boolean z) {
            this.d = z;
            return this;
        }

        @a
        public Builder e(boolean z) {
            this.f = z;
            return this;
        }

        @a
        public Builder f(long v) {
            Assertions.a(v > 0L || v == 0x8000000000000001L);
            this.h = v;
            return this;
        }

        @a
        public Builder g(int[] arr_v) {
            for(int v = 0; v < arr_v.length; ++v) {
                boolean z = true;
                switch(arr_v[v]) {
                    case 1: 
                    case 2: {
                        break;
                    }
                    default: {
                        z = false;
                    }
                }
                Assertions.a(z);
            }
            this.e = (int[])arr_v.clone();
            return this;
        }

        @a
        public Builder h(UUID uUID0, Provider exoMediaDrm$Provider0) {
            this.b = (UUID)Assertions.g(uUID0);
            this.c = (Provider)Assertions.g(exoMediaDrm$Provider0);
            return this;
        }
    }

    class MediaDrmEventListener implements OnEventListener {
        final DefaultDrmSessionManager a;

        private MediaDrmEventListener() {
        }

        MediaDrmEventListener(androidx.media3.exoplayer.drm.DefaultDrmSessionManager.1 defaultDrmSessionManager$10) {
        }

        @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm$OnEventListener
        public void a(ExoMediaDrm exoMediaDrm0, @Nullable byte[] arr_b, int v, int v1, @Nullable byte[] arr_b1) {
            ((MediaDrmHandler)Assertions.g(DefaultDrmSessionManager.this.y)).obtainMessage(v, arr_b).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    class MediaDrmHandler extends Handler {
        final DefaultDrmSessionManager a;

        public MediaDrmHandler(Looper looper0) {
            super(looper0);
        }

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            byte[] arr_b = (byte[])message0.obj;
            if(arr_b == null) {
                return;
            }
            for(Object object0: DefaultDrmSessionManager.this.m) {
                DefaultDrmSession defaultDrmSession0 = (DefaultDrmSession)object0;
                if(defaultDrmSession0.t(arr_b)) {
                    defaultDrmSession0.B(message0.what);
                    return;
                }
                if(false) {
                    break;
                }
            }
        }
    }

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uUID0) {
            super("Media does not support uuid: " + uUID0);
        }

        MissingSchemeDataException(UUID uUID0, androidx.media3.exoplayer.drm.DefaultDrmSessionManager.1 defaultDrmSessionManager$10) {
            this(uUID0);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Mode {
    }

    class PreacquiredSessionReference implements DrmSessionReference {
        @Nullable
        private final EventDispatcher b;
        @Nullable
        private DrmSession c;
        private boolean d;
        final DefaultDrmSessionManager e;

        public PreacquiredSessionReference(@Nullable EventDispatcher drmSessionEventListener$EventDispatcher0) {
            this.b = drmSessionEventListener$EventDispatcher0;
        }

        public void c(Format format0) {
            ((Handler)Assertions.g(DefaultDrmSessionManager.this.u)).post(() -> if(DefaultDrmSessionManager.this.p != 0 && !this.d) {
                Looper looper0 = (Looper)Assertions.g(DefaultDrmSessionManager.this.t);
                this.c = DefaultDrmSessionManager.this.t(looper0, this.b, format0, false);
                DefaultDrmSessionManager.this.n.add(this);
            });
        }

        // 检测为 Lambda 实现
        private void d(Format format0) [...]

        // 检测为 Lambda 实现
        private void e() [...]

        @Override  // androidx.media3.exoplayer.drm.DrmSessionManager$DrmSessionReference
        public void release() {
            Util.Q1(((Handler)Assertions.g(DefaultDrmSessionManager.this.u)), () -> {
                if(this.d) {
                    return;
                }
                DrmSession drmSession0 = this.c;
                if(drmSession0 != null) {
                    drmSession0.d(this.b);
                }
                DefaultDrmSessionManager.this.n.remove(this);
                this.d = true;
            });
        }
    }

    class ProvisioningManagerImpl implements ProvisioningManager {
        private final Set a;
        @Nullable
        private DefaultDrmSession b;
        final DefaultDrmSessionManager c;

        public ProvisioningManagerImpl() {
            this.a = new HashSet();
        }

        @Override  // androidx.media3.exoplayer.drm.DefaultDrmSession$ProvisioningManager
        public void a(Exception exception0, boolean z) {
            this.b = null;
            O2 o20 = O2.r(this.a);
            this.a.clear();
            u5 u50 = o20.i();
            while(u50.hasNext()) {
                Object object0 = u50.next();
                ((DefaultDrmSession)object0).D(exception0, z);
            }
        }

        @Override  // androidx.media3.exoplayer.drm.DefaultDrmSession$ProvisioningManager
        public void b() {
            this.b = null;
            O2 o20 = O2.r(this.a);
            this.a.clear();
            u5 u50 = o20.i();
            while(u50.hasNext()) {
                Object object0 = u50.next();
                ((DefaultDrmSession)object0).C();
            }
        }

        @Override  // androidx.media3.exoplayer.drm.DefaultDrmSession$ProvisioningManager
        public void c(DefaultDrmSession defaultDrmSession0) {
            this.a.add(defaultDrmSession0);
            if(this.b != null) {
                return;
            }
            this.b = defaultDrmSession0;
            defaultDrmSession0.H();
        }

        public void d(DefaultDrmSession defaultDrmSession0) {
            this.a.remove(defaultDrmSession0);
            if(this.b == defaultDrmSession0) {
                this.b = null;
                if(!this.a.isEmpty()) {
                    Object object0 = this.a.iterator().next();
                    this.b = (DefaultDrmSession)object0;
                    ((DefaultDrmSession)object0).H();
                }
            }
        }
    }

    class ReferenceCountListenerImpl implements ReferenceCountListener {
        final DefaultDrmSessionManager a;

        private ReferenceCountListenerImpl() {
        }

        ReferenceCountListenerImpl(androidx.media3.exoplayer.drm.DefaultDrmSessionManager.1 defaultDrmSessionManager$10) {
        }

        @Override  // androidx.media3.exoplayer.drm.DefaultDrmSession$ReferenceCountListener
        public void a(DefaultDrmSession defaultDrmSession0, int v) {
            if(DefaultDrmSessionManager.this.l != 0x8000000000000001L) {
                DefaultDrmSessionManager.this.o.remove(defaultDrmSession0);
                ((Handler)Assertions.g(DefaultDrmSessionManager.this.u)).removeCallbacksAndMessages(defaultDrmSession0);
            }
        }

        @Override  // androidx.media3.exoplayer.drm.DefaultDrmSession$ReferenceCountListener
        public void b(DefaultDrmSession defaultDrmSession0, int v) {
            if(v == 1 && DefaultDrmSessionManager.this.p > 0 && DefaultDrmSessionManager.this.l != 0x8000000000000001L) {
                DefaultDrmSessionManager.this.o.add(defaultDrmSession0);
                ((Handler)Assertions.g(DefaultDrmSessionManager.this.u)).postAtTime(() -> defaultDrmSession0.d(null), defaultDrmSession0, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.l);
            }
            else if(v == 0) {
                DefaultDrmSessionManager.this.m.remove(defaultDrmSession0);
                if(DefaultDrmSessionManager.this.r == defaultDrmSession0) {
                    DefaultDrmSessionManager.this.r = null;
                }
                if(DefaultDrmSessionManager.this.s == defaultDrmSession0) {
                    DefaultDrmSessionManager.this.s = null;
                }
                DefaultDrmSessionManager.this.i.d(defaultDrmSession0);
                if(DefaultDrmSessionManager.this.l != 0x8000000000000001L) {
                    ((Handler)Assertions.g(DefaultDrmSessionManager.this.u)).removeCallbacksAndMessages(defaultDrmSession0);
                    DefaultDrmSessionManager.this.o.remove(defaultDrmSession0);
                }
            }
            DefaultDrmSessionManager.this.C();
        }

        // 检测为 Lambda 实现
        private static void d(DefaultDrmSession defaultDrmSession0) [...]
    }

    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;
    public static final int E = 3;
    public static final long F = 300000L;
    private static final String G = "DefaultDrmSessionMgr";
    private final UUID b;
    private final Provider c;
    private final MediaDrmCallback d;
    private final HashMap e;
    private final boolean f;
    private final int[] g;
    private final boolean h;
    private final ProvisioningManagerImpl i;
    private final LoadErrorHandlingPolicy j;
    private final ReferenceCountListenerImpl k;
    private final long l;
    private final List m;
    private final Set n;
    private final Set o;
    private int p;
    @Nullable
    private ExoMediaDrm q;
    @Nullable
    private DefaultDrmSession r;
    @Nullable
    private DefaultDrmSession s;
    private Looper t;
    private Handler u;
    private int v;
    @Nullable
    private byte[] w;
    private PlayerId x;
    @Nullable
    volatile MediaDrmHandler y;
    public static final String z = "PRCustomData";

    private DefaultDrmSessionManager(UUID uUID0, Provider exoMediaDrm$Provider0, MediaDrmCallback mediaDrmCallback0, HashMap hashMap0, boolean z, int[] arr_v, boolean z1, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, long v) {
        Assertions.g(uUID0);
        Assertions.b(!C.h2.equals(uUID0), "Use C.CLEARKEY_UUID instead");
        this.b = uUID0;
        this.c = exoMediaDrm$Provider0;
        this.d = mediaDrmCallback0;
        this.e = hashMap0;
        this.f = z;
        this.g = arr_v;
        this.h = z1;
        this.j = loadErrorHandlingPolicy0;
        this.i = new ProvisioningManagerImpl(this);
        this.k = new ReferenceCountListenerImpl(this, null);
        this.v = 0;
        this.m = new ArrayList();
        this.n = D4.z();
        this.o = D4.z();
        this.l = v;
    }

    DefaultDrmSessionManager(UUID uUID0, Provider exoMediaDrm$Provider0, MediaDrmCallback mediaDrmCallback0, HashMap hashMap0, boolean z, int[] arr_v, boolean z1, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, long v, androidx.media3.exoplayer.drm.DefaultDrmSessionManager.1 defaultDrmSessionManager$10) {
        this(uUID0, exoMediaDrm$Provider0, mediaDrmCallback0, hashMap0, z, arr_v, z1, loadErrorHandlingPolicy0, v);
    }

    @Nullable
    private DrmSession A(int v, boolean z) {
        ExoMediaDrm exoMediaDrm0 = (ExoMediaDrm)Assertions.g(this.q);
        if((exoMediaDrm0.q() != 2 || !FrameworkCryptoConfig.d) && Util.u1(this.g, v) != -1 && exoMediaDrm0.q() != 1) {
            DefaultDrmSession defaultDrmSession0 = this.r;
            if(defaultDrmSession0 == null) {
                DefaultDrmSession defaultDrmSession1 = this.x(O2.A(), true, null, z);
                this.m.add(defaultDrmSession1);
                this.r = defaultDrmSession1;
                return this.r;
            }
            defaultDrmSession0.g(null);
            return this.r;
        }
        return null;
    }

    private void B(Looper looper0) {
        if(this.y == null) {
            this.y = new MediaDrmHandler(this, looper0);
        }
    }

    private void C() {
        if(this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            ((ExoMediaDrm)Assertions.g(this.q)).release();
            this.q = null;
        }
    }

    private void D() {
        u5 u50 = a3.u(this.o).i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            ((DrmSession)object0).d(null);
        }
    }

    private void E() {
        u5 u50 = a3.u(this.n).i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            ((PreacquiredSessionReference)object0).release();
        }
    }

    public void F(int v, @Nullable byte[] arr_b) {
        Assertions.i(this.m.isEmpty());
        if(v == 1 || v == 3) {
            Assertions.g(arr_b);
        }
        this.v = v;
        this.w = arr_b;
    }

    private void G(DrmSession drmSession0, @Nullable EventDispatcher drmSessionEventListener$EventDispatcher0) {
        drmSession0.d(drmSessionEventListener$EventDispatcher0);
        if(this.l != 0x8000000000000001L) {
            drmSession0.d(null);
        }
    }

    private void H(boolean z) {
        if(z && this.t == null) {
            Log.o("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if(Thread.currentThread() != ((Looper)Assertions.g(this.t)).getThread()) {
            Log.o("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: jeb-dexdec-sb-st-2845\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionManager
    public int a(Format format0) {
        this.H(false);
        int v = ((ExoMediaDrm)Assertions.g(this.q)).q();
        DrmInitData drmInitData0 = format0.r;
        if(drmInitData0 == null) {
            int v1 = MimeTypes.m(format0.n);
            return Util.u1(this.g, v1) == -1 ? 0 : v;
        }
        return this.v(drmInitData0) ? v : 1;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionManager
    public void b(Looper looper0, PlayerId playerId0) {
        this.z(looper0);
        this.x = playerId0;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionManager
    @Nullable
    public DrmSession c(@Nullable EventDispatcher drmSessionEventListener$EventDispatcher0, Format format0) {
        boolean z = false;
        this.H(false);
        if(this.p > 0) {
            z = true;
        }
        Assertions.i(z);
        Assertions.k(this.t);
        return this.t(this.t, drmSessionEventListener$EventDispatcher0, format0, true);
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionManager
    public DrmSessionReference d(@Nullable EventDispatcher drmSessionEventListener$EventDispatcher0, Format format0) {
        Assertions.i(this.p > 0);
        Assertions.k(this.t);
        DrmSessionReference drmSessionManager$DrmSessionReference0 = new PreacquiredSessionReference(this, drmSessionEventListener$EventDispatcher0);
        ((PreacquiredSessionReference)drmSessionManager$DrmSessionReference0).c(format0);
        return drmSessionManager$DrmSessionReference0;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void n() {
        this.H(true);
        int v = this.p;
        this.p = v + 1;
        if(v != 0) {
            return;
        }
        if(this.q == null) {
            ExoMediaDrm exoMediaDrm0 = this.c.a(this.b);
            this.q = exoMediaDrm0;
            exoMediaDrm0.w(new MediaDrmEventListener(this, null));
            return;
        }
        if(this.l != 0x8000000000000001L) {
            for(int v1 = 0; v1 < this.m.size(); ++v1) {
                ((DefaultDrmSession)this.m.get(v1)).g(null);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void release() {
        this.H(true);
        int v = this.p - 1;
        this.p = v;
        if(v != 0) {
            return;
        }
        if(this.l != 0x8000000000000001L) {
            ArrayList arrayList0 = new ArrayList(this.m);
            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                ((DefaultDrmSession)arrayList0.get(v1)).d(null);
            }
        }
        this.E();
        this.C();
    }

    @Nullable
    private DrmSession t(Looper looper0, @Nullable EventDispatcher drmSessionEventListener$EventDispatcher0, Format format0, boolean z) {
        List list0;
        DefaultDrmSession defaultDrmSession0 = null;
        this.B(looper0);
        DrmInitData drmInitData0 = format0.r;
        if(drmInitData0 == null) {
            return this.A(MimeTypes.m(format0.n), z);
        }
        if(this.w == null) {
            list0 = DefaultDrmSessionManager.y(((DrmInitData)Assertions.g(drmInitData0)), this.b, false);
            if(list0.isEmpty()) {
                MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException0 = new MissingSchemeDataException(this.b, null);
                Log.e("DefaultDrmSessionMgr", "DRM error", defaultDrmSessionManager$MissingSchemeDataException0);
                if(drmSessionEventListener$EventDispatcher0 != null) {
                    drmSessionEventListener$EventDispatcher0.l(defaultDrmSessionManager$MissingSchemeDataException0);
                }
                return new ErrorStateDrmSession(new DrmSessionException(defaultDrmSessionManager$MissingSchemeDataException0, 6003));
            }
        }
        else {
            list0 = null;
        }
        if(this.f) {
            for(Object object0: this.m) {
                DefaultDrmSession defaultDrmSession1 = (DefaultDrmSession)object0;
                if(Util.g(defaultDrmSession1.f, list0)) {
                    defaultDrmSession0 = defaultDrmSession1;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        else {
            defaultDrmSession0 = this.s;
        }
        if(defaultDrmSession0 == null) {
            defaultDrmSession0 = this.x(list0, false, drmSessionEventListener$EventDispatcher0, z);
            if(!this.f) {
                this.s = defaultDrmSession0;
            }
            this.m.add(defaultDrmSession0);
            return defaultDrmSession0;
        }
        defaultDrmSession0.g(drmSessionEventListener$EventDispatcher0);
        return defaultDrmSession0;
    }

    private static boolean u(DrmSession drmSession0) {
        if(drmSession0.getState() != 1) {
            return false;
        }
        Throwable throwable0 = ((DrmSessionException)Assertions.g(drmSession0.getError())).getCause();
        return throwable0 instanceof ResourceBusyException || DrmUtil.c(throwable0);
    }

    private boolean v(DrmInitData drmInitData0) {
        if(this.w != null) {
            return true;
        }
        if(DefaultDrmSessionManager.y(drmInitData0, this.b, true).isEmpty()) {
            if(drmInitData0.d == 1 && drmInitData0.s(0).e(C.h2)) {
                Log.n("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.b);
                goto label_7;
            }
            return false;
        }
    label_7:
        String s = drmInitData0.c;
        if(s != null && !"cenc".equals(s)) {
            return "cbcs".equals(s) ? Util.a >= 25 : !"cbc1".equals(s) && !"cens".equals(s);
        }
        return true;
    }

    private DefaultDrmSession w(@Nullable List list0, boolean z, @Nullable EventDispatcher drmSessionEventListener$EventDispatcher0) {
        Assertions.g(this.q);
        ExoMediaDrm exoMediaDrm0 = this.q;
        int v = this.v;
        byte[] arr_b = this.w;
        Object object0 = Assertions.g(this.t);
        Object object1 = Assertions.g(this.x);
        DefaultDrmSession defaultDrmSession0 = new DefaultDrmSession(this.b, exoMediaDrm0, this.i, this.k, list0, v, ((boolean)(this.h | z)), z, arr_b, this.e, this.d, ((Looper)object0), this.j, ((PlayerId)object1));
        defaultDrmSession0.g(drmSessionEventListener$EventDispatcher0);
        if(this.l != 0x8000000000000001L) {
            defaultDrmSession0.g(null);
        }
        return defaultDrmSession0;
    }

    private DefaultDrmSession x(@Nullable List list0, boolean z, @Nullable EventDispatcher drmSessionEventListener$EventDispatcher0, boolean z1) {
        DefaultDrmSession defaultDrmSession0 = this.w(list0, z, drmSessionEventListener$EventDispatcher0);
        if(DefaultDrmSessionManager.u(defaultDrmSession0) && !this.o.isEmpty()) {
            this.D();
            this.G(defaultDrmSession0, drmSessionEventListener$EventDispatcher0);
            defaultDrmSession0 = this.w(list0, z, drmSessionEventListener$EventDispatcher0);
        }
        if(DefaultDrmSessionManager.u(defaultDrmSession0) && z1 && !this.n.isEmpty()) {
            this.E();
            if(!this.o.isEmpty()) {
                this.D();
            }
            this.G(defaultDrmSession0, drmSessionEventListener$EventDispatcher0);
            return this.w(list0, z, drmSessionEventListener$EventDispatcher0);
        }
        return defaultDrmSession0;
    }

    private static List y(DrmInitData drmInitData0, UUID uUID0, boolean z) {
        List list0 = new ArrayList(drmInitData0.d);
        for(int v = 0; v < drmInitData0.d; ++v) {
            SchemeData drmInitData$SchemeData0 = drmInitData0.s(v);
            if((drmInitData$SchemeData0.e(uUID0) || C.i2.equals(uUID0) && drmInitData$SchemeData0.e(C.h2)) && (drmInitData$SchemeData0.e != null || z)) {
                list0.add(drmInitData$SchemeData0);
            }
        }
        return list0;
    }

    @d({"this.playbackLooper", "this.playbackHandler"})
    private void z(Looper looper0) {
        synchronized(this) {
            Looper looper1 = this.t;
            if(looper1 == null) {
                this.t = looper0;
                this.u = new Handler(looper0);
            }
            else {
                Assertions.i(looper1 == looper0);
                Assertions.g(this.u);
            }
        }
    }

    class androidx.media3.exoplayer.drm.DefaultDrmSessionManager.1 {
    }

}

