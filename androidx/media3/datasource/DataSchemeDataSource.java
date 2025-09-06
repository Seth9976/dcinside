package androidx.media3.datasource;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.net.URLDecoder;

@UnstableApi
public final class DataSchemeDataSource extends BaseDataSource {
    @Nullable
    private DataSpec f;
    @Nullable
    private byte[] g;
    private int h;
    private int i;
    public static final String j = "data";

    public DataSchemeDataSource() {
        super(false);
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws IOException {
        this.w(dataSpec0);
        this.f = dataSpec0;
        Uri uri0 = dataSpec0.a.normalizeScheme();
        String s = uri0.getScheme();
        Assertions.b("data".equals(s), "Unsupported scheme: " + s);
        String[] arr_s = Util.m2(uri0.getSchemeSpecificPart(), ",");
        if(arr_s.length != 2) {
            throw ParserException.b(("Unexpected URI format: " + uri0), null);
        }
        String s1 = arr_s[1];
        if(arr_s[0].contains(";base64")) {
            try {
                this.g = Base64.decode(s1, 0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw ParserException.b(("Error while parsing Base64 encoded string: " + s1), illegalArgumentException0);
            }
        }
        else {
            this.g = Util.O0(URLDecoder.decode(s1, "US-ASCII"));
        }
        long v = dataSpec0.g;
        byte[] arr_b = this.g;
        if(v <= ((long)arr_b.length)) {
            this.h = (int)v;
            int v1 = arr_b.length - ((int)v);
            this.i = v1;
            long v2 = dataSpec0.h;
            if(v2 != -1L) {
                this.i = (int)Math.min(v1, v2);
            }
            this.x(dataSpec0);
            return dataSpec0.h == -1L ? ((long)this.i) : dataSpec0.h;
        }
        this.g = null;
        throw new DataSourceException(2008);
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    public Uri c() {
        return this.f == null ? null : this.f.a;
    }

    @Override  // androidx.media3.datasource.DataSource
    public void close() {
        if(this.g != null) {
            this.g = null;
            this.v();
        }
        this.f = null;
    }

    @Override  // androidx.media3.common.DataReader
    public int read(byte[] arr_b, int v, int v1) {
        if(v1 == 0) {
            return 0;
        }
        int v2 = this.i;
        if(v2 == 0) {
            return -1;
        }
        int v3 = Math.min(v1, v2);
        System.arraycopy(this.g, this.h, arr_b, v, v3);
        this.h += v3;
        this.i -= v3;
        this.u(v3);
        return v3;
    }
}

