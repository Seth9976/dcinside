package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm.KeyRequest;
import android.media.MediaDrm.KeyStatus;
import android.media.MediaDrm.ProvisionRequest;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData.SchemeData;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import com.google.common.base.f;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class FrameworkMediaDrm implements ExoMediaDrm {
    @RequiresApi(0x1F)
    static class Api31 {
        @DoNotInline
        public static boolean a(MediaDrm mediaDrm0, String s) {
            return mediaDrm0.requiresSecureDecoder(s);
        }

        @DoNotInline
        public static void b(MediaDrm mediaDrm0, byte[] arr_b, PlayerId playerId0) {
            LogSessionId logSessionId0 = playerId0.a();
            if(!logSessionId0.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                I.a(Assertions.g(mediaDrm0.getPlaybackComponent(arr_b))).setLogSessionId(logSessionId0);
            }
        }
    }

    private final UUID g;
    private final MediaDrm h;
    private int i;
    private static final String j = "FrameworkMediaDrm";
    @UnstableApi
    public static final Provider k = null;
    private static final String l = "cenc";
    private static final String m = "https://x";
    private static final String n = "<LA_URL>https://x</LA_URL>";
    private static final int o = 2;

    static {
        FrameworkMediaDrm.k = (UUID uUID0) -> try {
            return FrameworkMediaDrm.R(uUID0);
        }
        catch(UnsupportedDrmException unused_ex) {
            Log.d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uUID0 + ".");
            return new DummyExoMediaDrm();
        };
    }

    private FrameworkMediaDrm(UUID uUID0) throws UnsupportedSchemeException {
        Assertions.g(uUID0);
        Assertions.b(!C.h2.equals(uUID0), "Use C.CLEARKEY_UUID instead");
        this.g = uUID0;
        MediaDrm mediaDrm0 = new MediaDrm(FrameworkMediaDrm.G(uUID0));
        this.h = mediaDrm0;
        this.i = 1;
        if(C.j2.equals(uUID0) && FrameworkMediaDrm.Q()) {
            FrameworkMediaDrm.I(mediaDrm0);
        }
    }

    private static byte[] B(byte[] arr_b) {
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(arr_b);
        int v = parsableByteArray0.w();
        if(parsableByteArray0.z() == 1 && parsableByteArray0.z() == 1) {
            int v1 = parsableByteArray0.z();
            Charset charset0 = f.e;
            String s = parsableByteArray0.J(v1, charset0);
            if(s.contains("<LA_URL>")) {
                return arr_b;
            }
            int v2 = s.indexOf("</DATA>");
            if(v2 == -1) {
                Log.n("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String s1 = s.substring(0, v2) + "<LA_URL>https://x</LA_URL>" + s.substring(v2);
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(v + 52);
            byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer0.putInt(v + 52);
            byteBuffer0.putShort(1);
            byteBuffer0.putShort(1);
            byteBuffer0.putShort(((short)(s1.length() * 2)));
            byteBuffer0.put(s1.getBytes(charset0));
            return byteBuffer0.array();
        }
        Log.h("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return arr_b;
    }

    private String C(String s) {
        if("<LA_URL>https://x</LA_URL>".equals(s)) {
            return "";
        }
        if(Util.a >= 33 && "https://default.url".equals(s)) {
            String s1 = this.l("version");
            return !Objects.equals(s1, "1.2") && !Objects.equals(s1, "aidl-1") ? s : "";
        }
        return s;
    }

    // 去混淆评级： 低(20)
    private static byte[] D(UUID uUID0, byte[] arr_b) {
        return C.i2.equals(uUID0) ? ClearKeyUtil.a(arr_b) : arr_b;
    }

    private static byte[] E(UUID uUID0, byte[] arr_b) {
        UUID uUID1 = C.k2;
        if(uUID1.equals(uUID0)) {
            byte[] arr_b1 = PsshAtomUtil.e(arr_b, uUID0);
            if(arr_b1 != null) {
                arr_b = arr_b1;
            }
            arr_b = PsshAtomUtil.a(uUID1, FrameworkMediaDrm.B(arr_b));
        }
        if(Util.a < 23 && C.j2.equals(uUID0) || uUID1.equals(uUID0) && "Amazon".equals(Util.c) && ("AFTB".equals(Util.d) || "AFTS".equals(Util.d) || "AFTM".equals(Util.d) || "AFTT".equals(Util.d))) {
            byte[] arr_b2 = PsshAtomUtil.e(arr_b, uUID0);
            return arr_b2 == null ? arr_b : arr_b2;
        }
        return arr_b;
    }

    // 去混淆评级： 低(30)
    private static String F(UUID uUID0, String s) {
        return Util.a >= 26 || !C.i2.equals(uUID0) || !"video/mp4".equals(s) && !"audio/mp4".equals(s) ? s : "cenc";
    }

    private static UUID G(UUID uUID0) {
        return Util.a >= 27 || !C.i2.equals(uUID0) ? uUID0 : C.h2;
    }

    @UnstableApi
    public FrameworkCryptoConfig H(byte[] arr_b) throws MediaCryptoException {
        boolean z = this.S();
        return new FrameworkCryptoConfig(FrameworkMediaDrm.G(this.g), arr_b, z);
    }

    private static void I(MediaDrm mediaDrm0) {
        mediaDrm0.setPropertyString("securityLevel", "L3");
    }

    private static SchemeData J(UUID uUID0, List list0) {
        if(!C.j2.equals(uUID0)) {
            return (SchemeData)list0.get(0);
        }
        if(Util.a >= 28 && list0.size() > 1) {
            SchemeData drmInitData$SchemeData0 = (SchemeData)list0.get(0);
            int v = 0;
            int v1 = 0;
            while(v < list0.size()) {
                SchemeData drmInitData$SchemeData1 = (SchemeData)list0.get(v);
                byte[] arr_b = (byte[])Assertions.g(drmInitData$SchemeData1.e);
                if(!Util.g(drmInitData$SchemeData1.d, drmInitData$SchemeData0.d) || !Util.g(drmInitData$SchemeData1.c, drmInitData$SchemeData0.c) || !PsshAtomUtil.c(arr_b)) {
                    goto label_23;
                }
                v1 += arr_b.length;
                ++v;
            }
            byte[] arr_b1 = new byte[v1];
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                byte[] arr_b2 = (byte[])Assertions.g(((SchemeData)list0.get(v2)).e);
                System.arraycopy(arr_b2, 0, arr_b1, v3, arr_b2.length);
                v3 += arr_b2.length;
            }
            return drmInitData$SchemeData0.c(arr_b1);
        }
    label_23:
        for(int v4 = 0; v4 < list0.size(); ++v4) {
            SchemeData drmInitData$SchemeData2 = (SchemeData)list0.get(v4);
            int v5 = PsshAtomUtil.g(((byte[])Assertions.g(drmInitData$SchemeData2.e)));
            int v6 = Util.a;
            if(v6 < 23 && v5 == 0) {
                return drmInitData$SchemeData2;
            }
            if(v6 >= 23 && v5 == 1) {
                return drmInitData$SchemeData2;
            }
        }
        return (SchemeData)list0.get(0);
    }

    public static boolean K(UUID uUID0) {
        return MediaDrm.isCryptoSchemeSupported(FrameworkMediaDrm.G(uUID0));
    }

    @RequiresApi(0x1F)
    private boolean L() {
        if(this.g.equals(C.j2)) {
            String s = this.l("version");
            return !s.startsWith("v5.") && !s.startsWith("14.") && !s.startsWith("15.") && !s.startsWith("16.0");
        }
        return this.g.equals(C.i2);
    }

    // 检测为 Lambda 实现
    private void M(OnEventListener exoMediaDrm$OnEventListener0, MediaDrm mediaDrm0, byte[] arr_b, int v, int v1, byte[] arr_b1) [...]

    // 检测为 Lambda 实现
    private void N(OnExpirationUpdateListener exoMediaDrm$OnExpirationUpdateListener0, MediaDrm mediaDrm0, byte[] arr_b, long v) [...]

    // 检测为 Lambda 实现
    private void O(OnKeyStatusChangeListener exoMediaDrm$OnKeyStatusChangeListener0, MediaDrm mediaDrm0, byte[] arr_b, List list0, boolean z) [...]

    // 检测为 Lambda 实现
    private static ExoMediaDrm P(UUID uUID0) [...]

    private static boolean Q() {
        return "ASUS_Z00AD".equals(Util.d);
    }

    @UnstableApi
    public static FrameworkMediaDrm R(UUID uUID0) throws UnsupportedDrmException {
        try {
            return new FrameworkMediaDrm(uUID0);
        }
        catch(UnsupportedSchemeException unsupportedSchemeException0) {
            throw new UnsupportedDrmException(1, unsupportedSchemeException0);
        }
        catch(Exception exception0) {
            throw new UnsupportedDrmException(2, exception0);
        }
    }

    // 去混淆评级： 低(20)
    private boolean S() {
        return Util.a < 21 && C.j2.equals(this.g) && "L3".equals(this.l("securityLevel"));
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void b() {
        synchronized(this) {
            Assertions.i(this.i > 0);
            ++this.i;
        }
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @Nullable
    @UnstableApi
    public PersistableBundle c() {
        return Util.a >= 28 ? this.h.getMetrics() : null;
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public Map d(byte[] arr_b) {
        return this.h.queryKeyStatus(arr_b);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public ProvisionRequest e() {
        MediaDrm.ProvisionRequest mediaDrm$ProvisionRequest0 = this.h.getProvisionRequest();
        return new ProvisionRequest(mediaDrm$ProvisionRequest0.getData(), mediaDrm$ProvisionRequest0.getDefaultUrl());
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @RequiresApi(29)
    @UnstableApi
    public List f() {
        if(Util.a < 29) {
            throw new UnsupportedOperationException();
        }
        return this.h.getOfflineLicenseKeySetIds();
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public byte[] g() throws MediaDrmException {
        return this.h.openSession();
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void h(byte[] arr_b, byte[] arr_b1) {
        this.h.restoreKeys(arr_b, arr_b1);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void i(String s, String s1) {
        this.h.setPropertyString(s, s1);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @RequiresApi(29)
    @UnstableApi
    public void j(byte[] arr_b) {
        if(Util.a < 29) {
            throw new UnsupportedOperationException();
        }
        this.h.removeOfflineLicense(arr_b);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void k(String s, byte[] arr_b) {
        this.h.setPropertyByteArray(s, arr_b);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public String l(String s) {
        return this.h.getPropertyString(s);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @Nullable
    @UnstableApi
    public byte[] m(byte[] arr_b, byte[] arr_b1) throws NotProvisionedException, DeniedByServerException {
        if(C.i2.equals(this.g)) {
            arr_b1 = ClearKeyUtil.b(arr_b1);
        }
        return this.h.provideKeyResponse(arr_b, arr_b1);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void n(byte[] arr_b, PlayerId playerId0) {
        if(Util.a >= 0x1F) {
            try {
                Api31.b(this.h, arr_b, playerId0);
            }
            catch(UnsupportedOperationException unused_ex) {
                Log.n("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @RequiresApi(23)
    @UnstableApi
    public void o(@Nullable OnExpirationUpdateListener exoMediaDrm$OnExpirationUpdateListener0) {
        if(Util.a < 23) {
            throw new UnsupportedOperationException();
        }
        D d0 = exoMediaDrm$OnExpirationUpdateListener0 == null ? null : (MediaDrm mediaDrm0, byte[] arr_b, long v) -> exoMediaDrm$OnExpirationUpdateListener0.a(this, arr_b, v);
        this.h.setOnExpirationUpdateListener(d0, null);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void p(byte[] arr_b) throws DeniedByServerException {
        this.h.provideProvisionResponse(arr_b);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public int q() {
        return 2;
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public CryptoConfig r(byte[] arr_b) throws MediaCryptoException {
        return this.H(arr_b);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void release() {
        synchronized(this) {
            int v1 = this.i - 1;
            this.i = v1;
            if(v1 == 0) {
                this.h.release();
            }
        }
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @RequiresApi(23)
    @UnstableApi
    public void s(@Nullable OnKeyStatusChangeListener exoMediaDrm$OnKeyStatusChangeListener0) {
        if(Util.a < 23) {
            throw new UnsupportedOperationException();
        }
        F f0 = exoMediaDrm$OnKeyStatusChangeListener0 == null ? null : (MediaDrm mediaDrm0, byte[] arr_b, List list0, boolean z) -> {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                arrayList0.add(new KeyStatus(((MediaDrm.KeyStatus)object0).getStatusCode(), ((MediaDrm.KeyStatus)object0).getKeyId()));
            }
            exoMediaDrm$OnKeyStatusChangeListener0.a(this, arr_b, arrayList0, z);
        };
        this.h.setOnKeyStatusChangeListener(f0, null);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public boolean t(byte[] arr_b, String s) {
        boolean z;
        MediaCrypto mediaCrypto0;
        if(Util.a >= 0x1F && this.L()) {
            return Api31.a(this.h, s) && !this.S();
        }
        try {
            mediaCrypto0 = null;
            mediaCrypto0 = new MediaCrypto(this.g, arr_b);
            z = mediaCrypto0.requiresSecureDecoderComponent(s);
        }
        catch(MediaCryptoException unused_ex) {
            if(mediaCrypto0 != null) {
                mediaCrypto0.release();
            }
            return !this.S();
        }
        catch(Throwable throwable0) {
            if(mediaCrypto0 != null) {
                mediaCrypto0.release();
            }
            throw throwable0;
        }
        mediaCrypto0.release();
        return z && !this.S();
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void u(byte[] arr_b) {
        this.h.closeSession(arr_b);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public byte[] v(String s) {
        return this.h.getPropertyByteArray(s);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void w(@Nullable OnEventListener exoMediaDrm$OnEventListener0) {
        E e0 = exoMediaDrm$OnEventListener0 == null ? null : (MediaDrm mediaDrm0, byte[] arr_b, int v, int v1, byte[] arr_b1) -> exoMediaDrm$OnEventListener0.a(this, arr_b, v, v1, arr_b1);
        this.h.setOnEventListener(e0);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @SuppressLint({"WrongConstant"})
    @UnstableApi
    public KeyRequest x(byte[] arr_b, @Nullable List list0, int v, @Nullable HashMap hashMap0) throws NotProvisionedException {
        String s;
        byte[] arr_b2;
        SchemeData drmInitData$SchemeData0;
        if(list0 == null) {
            drmInitData$SchemeData0 = null;
            arr_b2 = null;
            s = null;
        }
        else {
            drmInitData$SchemeData0 = FrameworkMediaDrm.J(this.g, list0);
            byte[] arr_b1 = (byte[])Assertions.g(drmInitData$SchemeData0.e);
            arr_b2 = FrameworkMediaDrm.E(this.g, arr_b1);
            s = FrameworkMediaDrm.F(this.g, drmInitData$SchemeData0.d);
        }
        MediaDrm.KeyRequest mediaDrm$KeyRequest0 = this.h.getKeyRequest(arr_b, arr_b2, s, v, hashMap0);
        byte[] arr_b3 = mediaDrm$KeyRequest0.getData();
        byte[] arr_b4 = FrameworkMediaDrm.D(this.g, arr_b3);
        String s1 = this.C(mediaDrm$KeyRequest0.getDefaultUrl());
        if(TextUtils.isEmpty(s1) && drmInitData$SchemeData0 != null && !TextUtils.isEmpty(drmInitData$SchemeData0.c)) {
            s1 = drmInitData$SchemeData0.c;
        }
        return Util.a < 23 ? new KeyRequest(arr_b4, s1, 0x80000000) : new KeyRequest(arr_b4, s1, mediaDrm$KeyRequest0.getRequestType());
    }
}

