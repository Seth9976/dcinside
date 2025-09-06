package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@UnstableApi
public final class AssetDataSource extends BaseDataSource {
    public static final class AssetDataSourceException extends DataSourceException {
        @Deprecated
        public AssetDataSourceException(IOException iOException0) {
            super(iOException0, 2000);
        }

        public AssetDataSourceException(@Nullable Throwable throwable0, int v) {
            super(throwable0, v);
        }
    }

    private final AssetManager f;
    @Nullable
    private Uri g;
    @Nullable
    private InputStream h;
    private long i;
    private boolean j;

    public AssetDataSource(Context context0) {
        super(false);
        this.f = context0.getAssets();
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws AssetDataSourceException {
        try {
            this.g = dataSpec0.a;
            String s = (String)Assertions.g(dataSpec0.a.getPath());
            if(s.startsWith("/android_asset/")) {
                s = s.substring(15);
            }
            else if(s.startsWith("/")) {
                s = s.substring(1);
            }
            this.w(dataSpec0);
            InputStream inputStream0 = this.f.open(s, 1);
            this.h = inputStream0;
            if(inputStream0.skip(dataSpec0.g) < dataSpec0.g) {
                throw new AssetDataSourceException(null, 2008);
            }
            long v = dataSpec0.h;
            if(v == -1L) {
                long v1 = (long)this.h.available();
                this.i = v1;
                if(v1 == 0x7FFFFFFFL) {
                    this.i = -1L;
                }
            }
            else {
                this.i = v;
            }
            goto label_26;
        }
        catch(AssetDataSourceException assetDataSource$AssetDataSourceException0) {
        }
        catch(IOException iOException0) {
            throw new AssetDataSourceException(iOException0, (iOException0 instanceof FileNotFoundException ? 2005 : 2000));
        }
        throw assetDataSource$AssetDataSourceException0;
    label_26:
        this.j = true;
        this.x(dataSpec0);
        return this.i;
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    public Uri c() {
        return this.g;
    }

    @Override  // androidx.media3.datasource.DataSource
    public void close() throws AssetDataSourceException {
        try {
            this.g = null;
            InputStream inputStream0 = this.h;
            if(inputStream0 != null) {
                inputStream0.close();
            }
        }
        catch(IOException iOException0) {
            throw new AssetDataSourceException(iOException0, 2000);
        }
        finally {
            this.h = null;
            if(this.j) {
                this.j = false;
                this.v();
            }
        }
    }

    @Override  // androidx.media3.common.DataReader
    public int read(byte[] arr_b, int v, int v1) throws AssetDataSourceException {
        int v3;
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.i;
        if(v2 == 0L) {
            return -1;
        }
        try {
            if(v2 != -1L) {
                v1 = (int)Math.min(v2, v1);
            }
            v3 = this.h.read(arr_b, v, v1);
        }
        catch(IOException iOException0) {
            throw new AssetDataSourceException(iOException0, 2000);
        }
        if(v3 == -1) {
            return -1;
        }
        long v4 = this.i;
        if(v4 != -1L) {
            this.i = v4 - ((long)v3);
        }
        this.u(v3);
        return v3;
    }
}

