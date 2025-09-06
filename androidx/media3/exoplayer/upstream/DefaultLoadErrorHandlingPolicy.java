package androidx.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource.CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException;
import java.io.FileNotFoundException;
import java.io.IOException;

@UnstableApi
public class DefaultLoadErrorHandlingPolicy implements LoadErrorHandlingPolicy {
    private final int c;
    public static final int d = 3;
    public static final int e = 6;
    public static final long f = 60000L;
    @Deprecated
    public static final long g = 60000L;
    public static final long h = 300000L;
    private static final int i = -1;

    public DefaultLoadErrorHandlingPolicy() {
        this(-1);
    }

    public DefaultLoadErrorHandlingPolicy(int v) {
        this.c = v;
    }

    @Override  // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public void a(long v) {
    }

    @Override  // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    @Nullable
    public FallbackSelection b(FallbackOptions loadErrorHandlingPolicy$FallbackOptions0, LoadErrorInfo loadErrorHandlingPolicy$LoadErrorInfo0) {
        if(!this.e(loadErrorHandlingPolicy$LoadErrorInfo0.c)) {
            return null;
        }
        if(loadErrorHandlingPolicy$FallbackOptions0.a(1)) {
            return new FallbackSelection(1, 300000L);
        }
        return loadErrorHandlingPolicy$FallbackOptions0.a(2) ? new FallbackSelection(2, 60000L) : null;
    }

    // 去混淆评级： 中等(50)
    @Override  // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public long c(LoadErrorInfo loadErrorHandlingPolicy$LoadErrorInfo0) {
        return loadErrorHandlingPolicy$LoadErrorInfo0.c instanceof ParserException || loadErrorHandlingPolicy$LoadErrorInfo0.c instanceof FileNotFoundException || loadErrorHandlingPolicy$LoadErrorInfo0.c instanceof CleartextNotPermittedException || loadErrorHandlingPolicy$LoadErrorInfo0.c instanceof UnexpectedLoaderException || DataSourceException.a(loadErrorHandlingPolicy$LoadErrorInfo0.c) ? 0x8000000000000001L : ((long)Math.min((loadErrorHandlingPolicy$LoadErrorInfo0.d - 1) * 1000, 5000));
    }

    @Override  // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public int d(int v) {
        int v1 = this.c;
        if(v1 == -1) {
            return v == 7 ? 6 : 3;
        }
        return v1;
    }

    protected boolean e(IOException iOException0) {
        if(!(iOException0 instanceof InvalidResponseCodeException)) {
            return false;
        }
        switch(((InvalidResponseCodeException)iOException0).h) {
            case 403: 
            case 404: 
            case 410: 
            case 0x1A0: 
            case 500: 
            case 503: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

