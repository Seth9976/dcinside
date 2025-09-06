package androidx.media3.exoplayer.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData.SchemeData;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource.Factory;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import com.google.common.util.concurrent.O0;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@UnstableApi
public final class OfflineLicenseHelper {
    private final ConditionVariable a;
    private final DefaultDrmSessionManager b;
    private final HandlerThread c;
    private final Handler d;
    private final EventDispatcher e;
    private static final Format f;

    static {
        OfflineLicenseHelper.f = new Builder().U(new DrmInitData(new SchemeData[0])).K();
    }

    public OfflineLicenseHelper(DefaultDrmSessionManager defaultDrmSessionManager0, EventDispatcher drmSessionEventListener$EventDispatcher0) {
        this.b = defaultDrmSessionManager0;
        this.e = drmSessionEventListener$EventDispatcher0;
        HandlerThread handlerThread0 = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.c = handlerThread0;
        handlerThread0.start();
        this.d = new Handler(handlerThread0.getLooper());
        this.a = new ConditionVariable();
        androidx.media3.exoplayer.drm.OfflineLicenseHelper.1 offlineLicenseHelper$10 = new DrmSessionEventListener() {
            final OfflineLicenseHelper a;

            @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void G(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
                OfflineLicenseHelper.this.a.open();
            }

            @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void W(int v, MediaPeriodId mediaSource$MediaPeriodId0) {
            }

            @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void j0(int v, MediaPeriodId mediaSource$MediaPeriodId0, int v1) {
            }

            @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void k0(int v, MediaPeriodId mediaSource$MediaPeriodId0) {
            }

            @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void m0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
                OfflineLicenseHelper.this.a.open();
            }

            @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void n0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, Exception exception0) {
                OfflineLicenseHelper.this.a.open();
            }

            @Override  // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void t0(int v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
                OfflineLicenseHelper.this.a.open();
            }
        };
        drmSessionEventListener$EventDispatcher0.g(new Handler(handlerThread0.getLooper()), offlineLicenseHelper$10);
    }

    private DrmSession g(int v, @Nullable byte[] arr_b, Format format0) throws DrmSessionException {
        DrmSession drmSession0;
        Assertions.g(format0.r);
        O0 o00 = O0.F();
        this.a.close();
        M m0 = () -> try {
            Looper looper0 = (Looper)Assertions.g(Looper.myLooper());
            this.b.b(looper0, PlayerId.d);
            this.b.n();
            try {
                this.b.F(v, arr_b);
                o00.B(((DrmSession)Assertions.g(this.b.c(this.e, format0))));
            }
            catch(Throwable throwable1) {
                this.b.release();
                throw throwable1;
            }
        }
        catch(Throwable throwable0) {
            o00.C(throwable0);
        };
        this.d.post(m0);
        try {
            drmSession0 = (DrmSession)o00.get();
        }
        catch(ExecutionException | InterruptedException executionException0) {
            throw new IllegalStateException(executionException0);
        }
        this.a.block();
        O0 o01 = O0.F();
        N n0 = () -> {
            try {
                DrmSessionException drmSession$DrmSessionException0 = drmSession0.getError();
                if(drmSession0.getState() == 1) {
                    drmSession0.d(this.e);
                    this.b.release();
                }
                o01.B(drmSession$DrmSessionException0);
                return;
            }
            catch(Throwable throwable0) {
            }
            o01.C(throwable0);
            drmSession0.d(this.e);
            this.b.release();
        };
        this.d.post(n0);
        try {
            if(o01.get() != null) {
                throw (DrmSessionException)o01.get();
            }
            return drmSession0;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            throw new IllegalStateException(interruptedException0);
        }
    }

    private byte[] h(int v, @Nullable byte[] arr_b, Format format0) throws DrmSessionException {
        DrmSession drmSession0 = this.g(v, arr_b, format0);
        O0 o00 = O0.F();
        P p0 = () -> try {
            o00.B(drmSession0.f());
        }
        catch(Throwable throwable0) {
            o00.C(throwable0);
        }
        finally {
            drmSession0.d(this.e);
        };
        this.d.post(p0);
        try {
            return (byte[])Assertions.g(((byte[])o00.get()));
        }
        catch(ExecutionException | InterruptedException executionException0) {
            throw new IllegalStateException(executionException0);
        }
        finally {
            this.u();
        }
    }

    public byte[] i(Format format0) throws DrmSessionException {
        synchronized(this) {
            Assertions.a(format0.r != null);
            return this.h(2, null, format0);
        }
    }

    public Pair j(byte[] arr_b) throws DrmSessionException {
        Pair pair1;
        DrmSession drmSession0;
        synchronized(this) {
            Assertions.g(arr_b);
            try {
                drmSession0 = this.g(1, arr_b, OfflineLicenseHelper.f);
            }
            catch(DrmSessionException drmSession$DrmSessionException0) {
                if(!(drmSession$DrmSessionException0.getCause() instanceof KeysExpiredException)) {
                    throw drmSession$DrmSessionException0;
                }
                return Pair.create(0L, 0L);
            }
            O0 o00 = O0.F();
            L l0 = () -> try {
                o00.B(((Pair)Assertions.g(WidevineUtil.b(drmSession0))));
            }
            catch(Throwable throwable0) {
                o00.C(throwable0);
            }
            finally {
                drmSession0.d(this.e);
            };
            this.d.post(l0);
            try {
                try {
                    pair1 = (Pair)o00.get();
                }
                catch(ExecutionException | InterruptedException executionException0) {
                    throw new IllegalStateException(executionException0);
                }
            }
            catch(Throwable throwable0) {
                this.u();
                throw throwable0;
            }
            this.u();
            return pair1;
        }
    }

    // 检测为 Lambda 实现
    private void k(int v, byte[] arr_b, O0 o00, Format format0) [...]

    // 检测为 Lambda 实现
    private void l(DrmSession drmSession0, O0 o00) [...]

    // 检测为 Lambda 实现
    private void m(O0 o00, DrmSession drmSession0) [...]

    // 检测为 Lambda 实现
    private void n(O0 o00, DrmSession drmSession0) [...]

    // 检测为 Lambda 实现
    private void o(O0 o00) [...]

    public static OfflineLicenseHelper p(String s, Factory dataSource$Factory0, EventDispatcher drmSessionEventListener$EventDispatcher0) {
        return OfflineLicenseHelper.q(s, false, dataSource$Factory0, drmSessionEventListener$EventDispatcher0);
    }

    public static OfflineLicenseHelper q(String s, boolean z, Factory dataSource$Factory0, EventDispatcher drmSessionEventListener$EventDispatcher0) {
        return OfflineLicenseHelper.r(s, z, dataSource$Factory0, null, drmSessionEventListener$EventDispatcher0);
    }

    public static OfflineLicenseHelper r(String s, boolean z, Factory dataSource$Factory0, @Nullable Map map0, EventDispatcher drmSessionEventListener$EventDispatcher0) {
        return new OfflineLicenseHelper(new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder().b(map0).a(new HttpMediaDrmCallback(s, z, dataSource$Factory0)), drmSessionEventListener$EventDispatcher0);
    }

    public void s() {
        this.c.quit();
    }

    public void t(byte[] arr_b) throws DrmSessionException {
        synchronized(this) {
            Assertions.g(arr_b);
            this.h(3, arr_b, OfflineLicenseHelper.f);
        }
    }

    private void u() {
        O0 o00 = O0.F();
        O o0 = () -> try {
            this.b.release();
            o00.B(null);
        }
        catch(Throwable throwable0) {
            o00.C(throwable0);
        };
        this.d.post(o0);
        try {
            o00.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            throw new IllegalStateException(interruptedException0);
        }
    }

    public byte[] v(byte[] arr_b) throws DrmSessionException {
        synchronized(this) {
            Assertions.g(arr_b);
            return this.h(2, arr_b, OfflineLicenseHelper.f);
        }
    }
}

