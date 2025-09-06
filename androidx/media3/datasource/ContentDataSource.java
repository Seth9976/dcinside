package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

@UnstableApi
public final class ContentDataSource extends BaseDataSource {
    public static class ContentDataSourceException extends DataSourceException {
        @Deprecated
        public ContentDataSourceException(IOException iOException0) {
            this(iOException0, 2000);
        }

        public ContentDataSourceException(@Nullable IOException iOException0, int v) {
            super(iOException0, v);
        }
    }

    private final ContentResolver f;
    @Nullable
    private Uri g;
    @Nullable
    private AssetFileDescriptor h;
    @Nullable
    private FileInputStream i;
    private long j;
    private boolean k;

    public ContentDataSource(Context context0) {
        super(false);
        this.f = context0.getContentResolver();
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws ContentDataSourceException {
        AssetFileDescriptor assetFileDescriptor0;
        int v = 2000;
        try {
            Uri uri0 = dataSpec0.a.normalizeScheme();
            this.g = uri0;
            this.w(dataSpec0);
            if("content".equals(uri0.getScheme())) {
                Bundle bundle0 = new Bundle();
                bundle0.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor0 = this.f.openTypedAssetFileDescriptor(uri0, "*/*", bundle0);
            }
            else {
                assetFileDescriptor0 = this.f.openAssetFileDescriptor(uri0, "r");
            }
            this.h = assetFileDescriptor0;
            if(assetFileDescriptor0 == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uri0), 2000);
            }
            long v1 = assetFileDescriptor0.getLength();
            FileInputStream fileInputStream0 = new FileInputStream(assetFileDescriptor0.getFileDescriptor());
            this.i = fileInputStream0;
            int v2 = Long.compare(v1, -1L);
            if(v2 != 0 && dataSpec0.g > v1) {
                throw new ContentDataSourceException(null, 2008);
            }
            long v3 = assetFileDescriptor0.getStartOffset();
            long v4 = fileInputStream0.skip(dataSpec0.g + v3) - v3;
            if(v4 != dataSpec0.g) {
                throw new ContentDataSourceException(null, 2008);
            }
            if(v2 == 0) {
                FileChannel fileChannel0 = fileInputStream0.getChannel();
                long v5 = fileChannel0.size();
                if(v5 == 0L) {
                    this.j = -1L;
                }
                else {
                    long v6 = v5 - fileChannel0.position();
                    this.j = v6;
                    if(v6 < 0L) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            }
            else {
                long v7 = v1 - v4;
                this.j = v7;
                if(v7 < 0L) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            goto label_44;
        }
        catch(ContentDataSourceException contentDataSource$ContentDataSourceException0) {
        }
        catch(IOException iOException0) {
            goto label_41;
        }
        throw contentDataSource$ContentDataSourceException0;
    label_41:
        if(iOException0 instanceof FileNotFoundException) {
            v = 2005;
        }
        throw new ContentDataSourceException(iOException0, v);
    label_44:
        long v8 = dataSpec0.h;
        if(v8 != -1L) {
            long v9 = this.j;
            if(v9 != -1L) {
                v8 = Math.min(v9, v8);
            }
            this.j = v8;
        }
        this.k = true;
        this.x(dataSpec0);
        return dataSpec0.h == -1L ? this.j : dataSpec0.h;
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    public Uri c() {
        return this.g;
    }

    @Override  // androidx.media3.datasource.DataSource
    public void close() throws ContentDataSourceException {
        try {
            try {
                this.g = null;
                FileInputStream fileInputStream0 = this.i;
                if(fileInputStream0 != null) {
                    fileInputStream0.close();
                }
                goto label_24;
            }
            catch(IOException iOException0) {
            }
            throw new ContentDataSourceException(iOException0, 2000);
        }
        catch(Throwable throwable0) {
            try {
                this.i = null;
                AssetFileDescriptor assetFileDescriptor0 = this.h;
                if(assetFileDescriptor0 != null) {
                    assetFileDescriptor0.close();
                }
            }
            catch(IOException iOException1) {
                throw new ContentDataSourceException(iOException1, 2000);
            }
            finally {
                this.h = null;
                if(this.k) {
                    this.k = false;
                    this.v();
                }
            }
            throw throwable0;
        }
        try {
        label_24:
            this.i = null;
            AssetFileDescriptor assetFileDescriptor1 = this.h;
            if(assetFileDescriptor1 != null) {
                assetFileDescriptor1.close();
            }
        }
        catch(IOException iOException2) {
            throw new ContentDataSourceException(iOException2, 2000);
        }
        finally {
            this.h = null;
            if(this.k) {
                this.k = false;
                this.v();
            }
        }
    }

    @Override  // androidx.media3.common.DataReader
    public int read(byte[] arr_b, int v, int v1) throws ContentDataSourceException {
        int v3;
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.j;
        if(v2 == 0L) {
            return -1;
        }
        try {
            if(v2 != -1L) {
                v1 = (int)Math.min(v2, v1);
            }
            v3 = this.i.read(arr_b, v, v1);
        }
        catch(IOException iOException0) {
            throw new ContentDataSourceException(iOException0, 2000);
        }
        if(v3 == -1) {
            return -1;
        }
        long v4 = this.j;
        if(v4 != -1L) {
            this.j = v4 - ((long)v3);
        }
        this.u(v3);
        return v3;
    }
}

