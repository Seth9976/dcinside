package androidx.media3.datasource;

import O1.a;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

@UnstableApi
public final class FileDataSource extends BaseDataSource {
    @RequiresApi(21)
    static final class Api21 {
        @DoNotInline
        private static boolean b(@Nullable Throwable throwable0) {
            return throwable0 instanceof ErrnoException && ((ErrnoException)throwable0).errno == OsConstants.EACCES;
        }
    }

    public static final class Factory implements androidx.media3.datasource.DataSource.Factory {
        @Nullable
        private TransferListener a;

        @Override  // androidx.media3.datasource.DataSource$Factory
        public DataSource a() {
            return this.c();
        }

        public FileDataSource c() {
            FileDataSource fileDataSource0 = new FileDataSource();
            TransferListener transferListener0 = this.a;
            if(transferListener0 != null) {
                fileDataSource0.l(transferListener0);
            }
            return fileDataSource0;
        }

        @a
        public Factory d(@Nullable TransferListener transferListener0) {
            this.a = transferListener0;
            return this;
        }
    }

    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exception0) {
            super(exception0, 2000);
        }

        @Deprecated
        public FileDataSourceException(String s, IOException iOException0) {
            super(s, iOException0, 2000);
        }

        public FileDataSourceException(@Nullable String s, @Nullable Throwable throwable0, int v) {
            super(s, throwable0, v);
        }

        public FileDataSourceException(Throwable throwable0, int v) {
            super(throwable0, v);
        }
    }

    @Nullable
    private RandomAccessFile f;
    @Nullable
    private Uri g;
    private long h;
    private boolean i;

    public FileDataSource() {
        super(false);
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws FileDataSourceException {
        long v;
        this.g = dataSpec0.a;
        this.w(dataSpec0);
        RandomAccessFile randomAccessFile0 = FileDataSource.y(dataSpec0.a);
        this.f = randomAccessFile0;
        try {
            randomAccessFile0.seek(dataSpec0.g);
            v = dataSpec0.h;
            if(v == -1L) {
                v = this.f.length() - dataSpec0.g;
            }
        }
        catch(IOException iOException0) {
            throw new FileDataSourceException(iOException0, 2000);
        }
        this.h = v;
        if(v < 0L) {
            throw new FileDataSourceException(null, null, 2008);
        }
        this.i = true;
        this.x(dataSpec0);
        return this.h;
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    public Uri c() {
        return this.g;
    }

    @Override  // androidx.media3.datasource.DataSource
    public void close() throws FileDataSourceException {
        try {
            this.g = null;
            RandomAccessFile randomAccessFile0 = this.f;
            if(randomAccessFile0 != null) {
                randomAccessFile0.close();
            }
        }
        catch(IOException iOException0) {
            throw new FileDataSourceException(iOException0, 2000);
        }
        finally {
            this.f = null;
            if(this.i) {
                this.i = false;
                this.v();
            }
        }
    }

    @Override  // androidx.media3.common.DataReader
    public int read(byte[] arr_b, int v, int v1) throws FileDataSourceException {
        int v2;
        if(v1 == 0) {
            return 0;
        }
        if(this.h == 0L) {
            return -1;
        }
        try {
            v2 = this.f.read(arr_b, v, ((int)Math.min(this.h, v1)));
        }
        catch(IOException iOException0) {
            throw new FileDataSourceException(iOException0, 2000);
        }
        if(v2 > 0) {
            this.h -= (long)v2;
            this.u(v2);
        }
        return v2;
    }

    private static RandomAccessFile y(Uri uri0) throws FileDataSourceException {
        int v = 2006;
        try {
            return new RandomAccessFile(((String)Assertions.g(uri0.getPath())), "r");
        }
        catch(FileNotFoundException fileNotFoundException0) {
            if(!TextUtils.isEmpty(uri0.getQuery()) || !TextUtils.isEmpty(uri0.getFragment())) {
                throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing \'?\' or \'#\'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri0.getPath(), uri0.getQuery(), uri0.getFragment()), fileNotFoundException0, 1004);
            }
            if(Util.a < 21 || !Api21.b(fileNotFoundException0.getCause())) {
                v = 2005;
            }
            throw new FileDataSourceException(fileNotFoundException0, v);
        }
        catch(SecurityException securityException0) {
            throw new FileDataSourceException(securityException0, 2006);
        }
        catch(RuntimeException runtimeException0) {
            throw new FileDataSourceException(runtimeException0, 2000);
        }
    }
}

