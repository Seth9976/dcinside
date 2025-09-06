package androidx.media3.datasource;

import O1.a;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DefaultDataSource implements DataSource {
    public static final class Factory implements androidx.media3.datasource.DataSource.Factory {
        private final Context a;
        private final androidx.media3.datasource.DataSource.Factory b;
        @Nullable
        private TransferListener c;

        public Factory(Context context0) {
            this(context0, new androidx.media3.datasource.DefaultHttpDataSource.Factory());
        }

        public Factory(Context context0, androidx.media3.datasource.DataSource.Factory dataSource$Factory0) {
            this.a = context0.getApplicationContext();
            this.b = dataSource$Factory0;
        }

        @Override  // androidx.media3.datasource.DataSource$Factory
        @UnstableApi
        public DataSource a() {
            return this.c();
        }

        @UnstableApi
        public DefaultDataSource c() {
            DataSource dataSource0 = this.b.a();
            DefaultDataSource defaultDataSource0 = new DefaultDataSource(this.a, dataSource0);
            TransferListener transferListener0 = this.c;
            if(transferListener0 != null) {
                defaultDataSource0.l(transferListener0);
            }
            return defaultDataSource0;
        }

        @a
        @UnstableApi
        public Factory d(@Nullable TransferListener transferListener0) {
            this.c = transferListener0;
            return this;
        }
    }

    private final Context b;
    private final List c;
    private final DataSource d;
    @Nullable
    private DataSource e;
    @Nullable
    private DataSource f;
    @Nullable
    private DataSource g;
    @Nullable
    private DataSource h;
    @Nullable
    private DataSource i;
    @Nullable
    private DataSource j;
    @Nullable
    private DataSource k;
    @Nullable
    private DataSource l;
    private static final String m = "DefaultDataSource";
    private static final String n = "asset";
    private static final String o = "content";
    private static final String p = "rtmp";
    private static final String q = "udp";
    private static final String r = "data";
    private static final String s = "rawresource";
    private static final String t = "android.resource";

    @UnstableApi
    public DefaultDataSource(Context context0, DataSource dataSource0) {
        this.b = context0.getApplicationContext();
        this.d = (DataSource)Assertions.g(dataSource0);
        this.c = new ArrayList();
    }

    @UnstableApi
    public DefaultDataSource(Context context0, @Nullable String s, int v, int v1, boolean z) {
        this(context0, new androidx.media3.datasource.DefaultHttpDataSource.Factory().l(s).e(v).j(v1).d(z).c());
    }

    @UnstableApi
    public DefaultDataSource(Context context0, @Nullable String s, boolean z) {
        this(context0, s, 8000, 8000, z);
    }

    @UnstableApi
    public DefaultDataSource(Context context0, boolean z) {
        this(context0, null, 8000, 8000, z);
    }

    private DataSource A() {
        if(this.h == null) {
            try {
                DataSource dataSource0 = (DataSource)Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.h = dataSource0;
                this.u(dataSource0);
            }
            catch(ClassNotFoundException unused_ex) {
                Log.n("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            }
            catch(Exception exception0) {
                throw new RuntimeException("Error instantiating RTMP extension", exception0);
            }
            if(this.h == null) {
                this.h = this.d;
            }
        }
        return this.h;
    }

    private DataSource B() {
        if(this.i == null) {
            UdpDataSource udpDataSource0 = new UdpDataSource();
            this.i = udpDataSource0;
            this.u(udpDataSource0);
        }
        return this.i;
    }

    private void C(@Nullable DataSource dataSource0, TransferListener transferListener0) {
        if(dataSource0 != null) {
            dataSource0.l(transferListener0);
        }
    }

    @Override  // androidx.media3.datasource.DataSource
    @UnstableApi
    public long a(DataSpec dataSpec0) throws IOException {
        Assertions.i(this.l == null);
        String s = dataSpec0.a.getScheme();
        if(Util.i1(dataSpec0.a)) {
            String s1 = dataSpec0.a.getPath();
            if(s1 != null && s1.startsWith("/android_asset/")) {
                this.l = this.v();
                return this.l.a(dataSpec0);
            }
            this.l = this.y();
            return this.l.a(dataSpec0);
        }
        if("asset".equals(s)) {
            this.l = this.v();
            return this.l.a(dataSpec0);
        }
        if("content".equals(s)) {
            this.l = this.w();
            return this.l.a(dataSpec0);
        }
        if("rtmp".equals(s)) {
            this.l = this.A();
            return this.l.a(dataSpec0);
        }
        if("udp".equals(s)) {
            this.l = this.B();
            return this.l.a(dataSpec0);
        }
        if("data".equals(s)) {
            this.l = this.x();
            return this.l.a(dataSpec0);
        }
        if(!"rawresource".equals(s) && !"android.resource".equals(s)) {
            this.l = this.d;
            return this.l.a(dataSpec0);
        }
        this.l = this.z();
        return this.l.a(dataSpec0);
    }

    @Override  // androidx.media3.datasource.DataSource
    @UnstableApi
    public Map b() {
        return this.l == null ? Collections.emptyMap() : this.l.b();
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    @UnstableApi
    public Uri c() {
        return this.l == null ? null : this.l.c();
    }

    @Override  // androidx.media3.datasource.DataSource
    @UnstableApi
    public void close() throws IOException {
        DataSource dataSource0 = this.l;
        if(dataSource0 != null) {
            try {
                dataSource0.close();
                this.l = null;
            }
            catch(Throwable throwable0) {
                this.l = null;
                throw throwable0;
            }
        }
    }

    @Override  // androidx.media3.datasource.DataSource
    @UnstableApi
    public void l(TransferListener transferListener0) {
        Assertions.g(transferListener0);
        this.d.l(transferListener0);
        this.c.add(transferListener0);
        this.C(this.e, transferListener0);
        this.C(this.f, transferListener0);
        this.C(this.g, transferListener0);
        this.C(this.h, transferListener0);
        this.C(this.i, transferListener0);
        this.C(this.j, transferListener0);
        this.C(this.k, transferListener0);
    }

    @Override  // androidx.media3.common.DataReader
    @UnstableApi
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        return ((DataSource)Assertions.g(this.l)).read(arr_b, v, v1);
    }

    private void u(DataSource dataSource0) {
        for(int v = 0; v < this.c.size(); ++v) {
            dataSource0.l(((TransferListener)this.c.get(v)));
        }
    }

    private DataSource v() {
        if(this.f == null) {
            AssetDataSource assetDataSource0 = new AssetDataSource(this.b);
            this.f = assetDataSource0;
            this.u(assetDataSource0);
        }
        return this.f;
    }

    private DataSource w() {
        if(this.g == null) {
            ContentDataSource contentDataSource0 = new ContentDataSource(this.b);
            this.g = contentDataSource0;
            this.u(contentDataSource0);
        }
        return this.g;
    }

    private DataSource x() {
        if(this.j == null) {
            DataSchemeDataSource dataSchemeDataSource0 = new DataSchemeDataSource();
            this.j = dataSchemeDataSource0;
            this.u(dataSchemeDataSource0);
        }
        return this.j;
    }

    private DataSource y() {
        if(this.e == null) {
            FileDataSource fileDataSource0 = new FileDataSource();
            this.e = fileDataSource0;
            this.u(fileDataSource0);
        }
        return this.e;
    }

    private DataSource z() {
        if(this.k == null) {
            RawResourceDataSource rawResourceDataSource0 = new RawResourceDataSource(this.b);
            this.k = rawResourceDataSource0;
            this.u(rawResourceDataSource0);
        }
        return this.k;
    }
}

