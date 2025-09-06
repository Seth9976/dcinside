package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource.Factory;
import androidx.media3.datasource.DataSourceInputStream;
import androidx.media3.datasource.DataSpec.Builder;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException;
import androidx.media3.datasource.StatsDataSource;
import com.google.common.collect.Q2;
import com.google.common.io.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@UnstableApi
public final class HttpMediaDrmCallback implements MediaDrmCallback {
    private final Factory a;
    @Nullable
    private final String b;
    private final boolean c;
    private final Map d;
    private static final int e = 5;

    public HttpMediaDrmCallback(@Nullable String s, Factory dataSource$Factory0) {
        this(s, false, dataSource$Factory0);
    }

    public HttpMediaDrmCallback(@Nullable String s, boolean z, Factory dataSource$Factory0) {
        Assertions.a(!z || !TextUtils.isEmpty(s));
        this.a = dataSource$Factory0;
        this.b = s;
        this.c = z;
        this.d = new HashMap();
    }

    @Override  // androidx.media3.exoplayer.drm.MediaDrmCallback
    public byte[] a(UUID uUID0, KeyRequest exoMediaDrm$KeyRequest0) throws MediaDrmCallbackException {
        String s1;
        String s = exoMediaDrm$KeyRequest0.b();
        if(this.c || TextUtils.isEmpty(s)) {
            s = this.b;
        }
        if(!TextUtils.isEmpty(s)) {
            HashMap hashMap0 = new HashMap();
            UUID uUID1 = C.k2;
            if(uUID1.equals(uUID0)) {
                s1 = "text/xml";
            }
            else {
                s1 = C.i2.equals(uUID0) ? "application/json" : "application/octet-stream";
            }
            hashMap0.put("Content-Type", s1);
            if(uUID1.equals(uUID0)) {
                hashMap0.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized(this.d) {
                hashMap0.putAll(this.d);
            }
            return HttpMediaDrmCallback.e(this.a, s, exoMediaDrm$KeyRequest0.a(), hashMap0);
        }
        Builder dataSpec$Builder0 = new Builder();
        Uri uri0 = Uri.EMPTY;
        throw new MediaDrmCallbackException(dataSpec$Builder0.j(uri0).a(), uri0, Q2.u(), 0L, new IllegalStateException("No license URL"));
    }

    @Override  // androidx.media3.exoplayer.drm.MediaDrmCallback
    public byte[] b(UUID uUID0, ProvisionRequest exoMediaDrm$ProvisionRequest0) throws MediaDrmCallbackException {
        Map map0 = Collections.emptyMap();
        return HttpMediaDrmCallback.e(this.a, exoMediaDrm$ProvisionRequest0.b() + "&signedRequest=" + Util.T(exoMediaDrm$ProvisionRequest0.a()), null, map0);
    }

    public void c() {
        synchronized(this.d) {
            this.d.clear();
        }
    }

    public void d(String s) {
        Assertions.g(s);
        synchronized(this.d) {
            this.d.remove(s);
        }
    }

    private static byte[] e(Factory dataSource$Factory0, String s, @Nullable byte[] arr_b, Map map0) throws MediaDrmCallbackException {
        byte[] arr_b1;
        DataSourceInputStream dataSourceInputStream0;
        StatsDataSource statsDataSource0 = new StatsDataSource(dataSource$Factory0.a());
        DataSpec dataSpec0 = new Builder().k(s).f(map0).e(2).d(arr_b).c(1).a();
        int v = 0;
        DataSpec dataSpec1 = dataSpec0;
        while(true) {
            try {
            label_4:
                dataSourceInputStream0 = new DataSourceInputStream(statsDataSource0, dataSpec1);
            }
            catch(Exception exception0) {
                break;
            }
            try {
                try {
                    arr_b1 = h.u(dataSourceInputStream0);
                    goto label_18;
                }
                catch(InvalidResponseCodeException httpDataSource$InvalidResponseCodeException0) {
                }
                String s1 = HttpMediaDrmCallback.f(httpDataSource$InvalidResponseCodeException0, v);
                if(s1 == null) {
                    throw httpDataSource$InvalidResponseCodeException0;
                }
                ++v;
                dataSpec1 = dataSpec1.a().k(s1).a();
            }
            catch(Throwable throwable0) {
                goto label_16;
            }
            try {
                Util.t(dataSourceInputStream0);
                goto label_4;
            label_16:
                Util.t(dataSourceInputStream0);
                throw throwable0;
            label_18:
                Util.t(dataSourceInputStream0);
                return arr_b1;
            }
            catch(Exception exception0) {
                break;
            }
        }
        throw new MediaDrmCallbackException(dataSpec0, ((Uri)Assertions.g(statsDataSource0.v())), statsDataSource0.b(), statsDataSource0.u(), exception0);
    }

    @Nullable
    private static String f(InvalidResponseCodeException httpDataSource$InvalidResponseCodeException0, int v) {
        if((httpDataSource$InvalidResponseCodeException0.h == 307 || httpDataSource$InvalidResponseCodeException0.h == 308) && v < 5) {
            Map map0 = httpDataSource$InvalidResponseCodeException0.j;
            if(map0 != null) {
                List list0 = (List)map0.get("Location");
                return list0 == null || list0.isEmpty() ? null : ((String)list0.get(0));
            }
        }
        return null;
    }

    public void g(String s, String s1) {
        Assertions.g(s);
        Assertions.g(s1);
        synchronized(this.d) {
            this.d.put(s, s1);
        }
    }
}

