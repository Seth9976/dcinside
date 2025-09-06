package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.Map;

@UnstableApi
public final class PlaceholderDataSource implements DataSource {
    public static final PlaceholderDataSource b;
    public static final Factory c;

    static {
        PlaceholderDataSource.b = new PlaceholderDataSource();
        PlaceholderDataSource.c = () -> new PlaceholderDataSource();
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override  // androidx.media3.datasource.DataSource
    public Map b() {
        return d.a(this);
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    public Uri c() {
        return null;
    }

    @Override  // androidx.media3.datasource.DataSource
    public void close() {
    }

    @Override  // androidx.media3.datasource.DataSource
    public void l(TransferListener transferListener0) {
    }

    @Override  // androidx.media3.common.DataReader
    public int read(byte[] arr_b, int v, int v1) {
        throw new UnsupportedOperationException();
    }

    // 检测为 Lambda 实现
    public static PlaceholderDataSource u() [...]
}

