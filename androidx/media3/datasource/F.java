package androidx.media3.datasource;

import java.util.concurrent.Callable;

public final class f implements Callable {
    public final DataSourceBitmapLoader a;
    public final byte[] b;

    public f(DataSourceBitmapLoader dataSourceBitmapLoader0, byte[] arr_b) {
        this.a = dataSourceBitmapLoader0;
        this.b = arr_b;
    }

    @Override
    public final Object call() {
        return this.a.h(this.b);
    }
}

