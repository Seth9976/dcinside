package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

public class DataSourceException extends IOException {
    public final int a;
    @UnstableApi
    @Deprecated
    public static final int b = 2008;

    @UnstableApi
    public DataSourceException(int v) {
        this.a = v;
    }

    @UnstableApi
    public DataSourceException(@Nullable String s, int v) {
        super(s);
        this.a = v;
    }

    @UnstableApi
    public DataSourceException(@Nullable String s, @Nullable Throwable throwable0, int v) {
        super(s, throwable0);
        this.a = v;
    }

    @UnstableApi
    public DataSourceException(@Nullable Throwable throwable0, int v) {
        super(throwable0);
        this.a = v;
    }

    @UnstableApi
    public static boolean a(IOException iOException0) {
        while(iOException0 != null) {
            if(iOException0 instanceof DataSourceException && ((DataSourceException)iOException0).a == 2008) {
                return true;
            }
            iOException0 = iOException0.getCause();
        }
        return false;
    }
}

