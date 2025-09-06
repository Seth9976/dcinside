package androidx.media3.exoplayer.drm;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem.DrmConfiguration;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource.Factory;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.google.common.collect.u5;
import com.google.common.primitives.l;
import java.util.Map.Entry;

@UnstableApi
public final class DefaultDrmSessionManagerProvider implements DrmSessionManagerProvider {
    private final Object a;
    @GuardedBy("lock")
    private DrmConfiguration b;
    @GuardedBy("lock")
    private DrmSessionManager c;
    @Nullable
    private Factory d;
    @Nullable
    private String e;
    @Nullable
    private LoadErrorHandlingPolicy f;

    public DefaultDrmSessionManagerProvider() {
        this.a = new Object();
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
    public DrmSessionManager a(MediaItem mediaItem0) {
        Assertions.g(mediaItem0.b);
        DrmConfiguration mediaItem$DrmConfiguration0 = mediaItem0.b.c;
        if(mediaItem$DrmConfiguration0 == null) {
            return DrmSessionManager.a;
        }
        synchronized(this.a) {
            if(!Util.g(mediaItem$DrmConfiguration0, this.b)) {
                this.b = mediaItem$DrmConfiguration0;
                this.c = this.b(mediaItem$DrmConfiguration0);
            }
        }
        return (DrmSessionManager)Assertions.g(this.c);
    }

    private DrmSessionManager b(DrmConfiguration mediaItem$DrmConfiguration0) {
        Factory dataSource$Factory0 = this.d;
        if(dataSource$Factory0 == null) {
            dataSource$Factory0 = new androidx.media3.datasource.DefaultHttpDataSource.Factory().l(this.e);
        }
        HttpMediaDrmCallback httpMediaDrmCallback0 = new HttpMediaDrmCallback((mediaItem$DrmConfiguration0.c == null ? null : mediaItem$DrmConfiguration0.c.toString()), mediaItem$DrmConfiguration0.h, dataSource$Factory0);
        u5 u50 = mediaItem$DrmConfiguration0.e.m().i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            httpMediaDrmCallback0.g(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        Builder defaultDrmSessionManager$Builder0 = new Builder().h(mediaItem$DrmConfiguration0.a, FrameworkMediaDrm.k).d(mediaItem$DrmConfiguration0.f).e(mediaItem$DrmConfiguration0.g).g(l.D(mediaItem$DrmConfiguration0.j));
        LoadErrorHandlingPolicy loadErrorHandlingPolicy0 = this.f;
        if(loadErrorHandlingPolicy0 != null) {
            defaultDrmSessionManager$Builder0.c(loadErrorHandlingPolicy0);
        }
        DrmSessionManager drmSessionManager0 = defaultDrmSessionManager$Builder0.a(httpMediaDrmCallback0);
        ((DefaultDrmSessionManager)drmSessionManager0).F(0, mediaItem$DrmConfiguration0.d());
        return drmSessionManager0;
    }

    public void c(@Nullable Factory dataSource$Factory0) {
        this.d = dataSource$Factory0;
    }

    public void d(LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
        this.f = loadErrorHandlingPolicy0;
    }

    @Deprecated
    public void e(@Nullable String s) {
        this.e = s;
    }
}

