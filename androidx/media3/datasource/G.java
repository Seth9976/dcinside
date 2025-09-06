package androidx.media3.datasource;

import android.net.Uri;
import java.util.concurrent.Callable;

public final class g implements Callable {
    public final DataSourceBitmapLoader a;
    public final Uri b;

    public g(DataSourceBitmapLoader dataSourceBitmapLoader0, Uri uri0) {
        this.a = dataSourceBitmapLoader0;
        this.b = uri0;
    }

    @Override
    public final Object call() {
        return this.a.i(this.b);
    }
}

