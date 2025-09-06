package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

@UnstableApi
public final class RawResourceDataSource extends BaseDataSource {
    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String s) {
            super(s, null, 2000);
        }

        public RawResourceDataSourceException(@Nullable String s, @Nullable Throwable throwable0, int v) {
            super(s, throwable0, v);
        }

        @Deprecated
        public RawResourceDataSourceException(Throwable throwable0) {
            super(throwable0, 2000);
        }
    }

    private final Context f;
    @Nullable
    private DataSpec g;
    @Nullable
    private AssetFileDescriptor h;
    @Nullable
    private InputStream i;
    private long j;
    private boolean k;
    @Deprecated
    public static final String l = "rawresource";

    public RawResourceDataSource(Context context0) {
        super(false);
        this.f = context0.getApplicationContext();
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws RawResourceDataSourceException {
        this.g = dataSpec0;
        this.w(dataSpec0);
        AssetFileDescriptor assetFileDescriptor0 = RawResourceDataSource.y(this.f, dataSpec0);
        this.h = assetFileDescriptor0;
        long v = assetFileDescriptor0.getLength();
        FileInputStream fileInputStream0 = new FileInputStream(this.h.getFileDescriptor());
        this.i = fileInputStream0;
        int v1 = Long.compare(v, -1L);
        try {
            if(v1 != 0 && dataSpec0.g > v) {
                throw new RawResourceDataSourceException(null, null, 2008);
            }
            long v2 = this.h.getStartOffset();
            long v3 = fileInputStream0.skip(dataSpec0.g + v2) - v2;
            if(v3 != dataSpec0.g) {
                throw new RawResourceDataSourceException(null, null, 2008);
            }
            if(v1 == 0) {
                FileChannel fileChannel0 = fileInputStream0.getChannel();
                if(fileChannel0.size() == 0L) {
                    this.j = -1L;
                }
                else {
                    long v4 = fileChannel0.size() - fileChannel0.position();
                    this.j = v4;
                    if(v4 < 0L) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                }
            }
            else {
                long v5 = v - v3;
                this.j = v5;
                if(v5 < 0L) {
                    throw new DataSourceException(2008);
                }
            }
            goto label_32;
        }
        catch(RawResourceDataSourceException rawResourceDataSource$RawResourceDataSourceException0) {
        }
        catch(IOException iOException0) {
            throw new RawResourceDataSourceException(null, iOException0, 2000);
        }
        throw rawResourceDataSource$RawResourceDataSourceException0;
    label_32:
        long v6 = dataSpec0.h;
        if(v6 != -1L) {
            long v7 = this.j;
            if(v7 != -1L) {
                v6 = Math.min(v7, v6);
            }
            this.j = v6;
        }
        this.k = true;
        this.x(dataSpec0);
        return dataSpec0.h == -1L ? this.j : dataSpec0.h;
    }

    @Deprecated
    public static Uri buildRawResourceUri(int v) {
        return Uri.parse(("rawresource:///" + v));
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    public Uri c() {
        return this.g == null ? null : this.g.a;
    }

    @Override  // androidx.media3.datasource.DataSource
    public void close() throws RawResourceDataSourceException {
        try {
            try {
                this.g = null;
                InputStream inputStream0 = this.i;
                if(inputStream0 != null) {
                    inputStream0.close();
                }
                goto label_24;
            }
            catch(IOException iOException0) {
            }
            throw new RawResourceDataSourceException(null, iOException0, 2000);
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
                throw new RawResourceDataSourceException(null, iOException1, 2000);
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
            throw new RawResourceDataSourceException(null, iOException2, 2000);
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
    public int read(byte[] arr_b, int v, int v1) throws RawResourceDataSourceException {
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
            throw new RawResourceDataSourceException(null, iOException0, 2000);
        }
        if(v3 == -1) {
            if(this.j != -1L) {
                throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            return -1;
        }
        long v4 = this.j;
        if(v4 != -1L) {
            this.j = v4 - ((long)v3);
        }
        this.u(v3);
        return v3;
    }

    private static AssetFileDescriptor y(Context context0, DataSpec dataSpec0) throws RawResourceDataSourceException {
        AssetFileDescriptor assetFileDescriptor0;
        int v;
        Resources resources0;
        Uri uri0 = dataSpec0.a.normalizeScheme();
        if(TextUtils.equals("rawresource", uri0.getScheme())) {
            resources0 = context0.getResources();
            List list0 = uri0.getPathSegments();
            if(list0.size() != 1) {
                throw new RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + list0.size());
            }
            v = RawResourceDataSource.z(((String)list0.get(0)));
            goto label_25;
        }
        if(!TextUtils.equals("android.resource", uri0.getScheme())) {
            throw new RawResourceDataSourceException("Unsupported URI scheme (" + uri0.getScheme() + "). Only " + "android.resource" + " is supported.", null, 1004);
        }
        String s = (String)Assertions.g(uri0.getPath());
        if(s.startsWith("/")) {
            s = s.substring(1);
        }
        String s1 = TextUtils.isEmpty(uri0.getHost()) ? "com.dcinside.app.android" : uri0.getHost();
        if(s1.equals("com.dcinside.app.android")) {
            resources0 = context0.getResources();
        }
        else {
            try {
                resources0 = context0.getPackageManager().getResourcesForApplication(s1);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                throw new RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", packageManager$NameNotFoundException0, 2005);
            }
        }
        if(s.matches("\\d+")) {
            v = RawResourceDataSource.z(s);
            goto label_25;
        }
        v = resources0.getIdentifier(s1 + ":" + s, "raw", null);
        if(v == 0) {
            throw new RawResourceDataSourceException("Resource not found.", null, 2005);
        }
        try {
        label_25:
            assetFileDescriptor0 = resources0.openRawResourceFd(v);
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            throw new RawResourceDataSourceException(null, resources$NotFoundException0, 2005);
        }
        if(assetFileDescriptor0 == null) {
            throw new RawResourceDataSourceException("Resource is compressed: " + uri0, null, 2000);
        }
        return assetFileDescriptor0;
    }

    private static int z(String s) throws RawResourceDataSourceException {
        try {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
            throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
        }
    }
}

