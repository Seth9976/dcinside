package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.a;
import com.google.common.base.Q;
import com.google.common.base.S;
import com.google.common.util.concurrent.C0;
import com.google.common.util.concurrent.t0;
import com.google.common.util.concurrent.y0;
import java.io.IOException;
import java.util.concurrent.Executors;

@UnstableApi
public final class DataSourceBitmapLoader implements BitmapLoader {
    private final y0 a;
    private final Factory b;
    @Nullable
    private final BitmapFactory.Options c;
    public static final Q d;

    static {
        DataSourceBitmapLoader.d = S.b(() -> C0.j(Executors.newSingleThreadExecutor()));
    }

    public DataSourceBitmapLoader(Context context0) {
        this(((y0)Assertions.k(((y0)DataSourceBitmapLoader.d.get()))), new androidx.media3.datasource.DefaultDataSource.Factory(context0));
    }

    public DataSourceBitmapLoader(y0 y00, Factory dataSource$Factory0) {
        this(y00, dataSource$Factory0, null);
    }

    public DataSourceBitmapLoader(y0 y00, Factory dataSource$Factory0, @Nullable BitmapFactory.Options bitmapFactory$Options0) {
        this.a = y00;
        this.b = dataSource$Factory0;
        this.c = bitmapFactory$Options0;
    }

    @Override  // androidx.media3.common.util.BitmapLoader
    public t0 a(byte[] arr_b) {
        f f0 = () -> BitmapUtil.a(arr_b, arr_b.length, this.c);
        return this.a.submit(f0);
    }

    @Override  // androidx.media3.common.util.BitmapLoader
    public boolean b(String s) {
        return Util.d1(s);
    }

    @Override  // androidx.media3.common.util.BitmapLoader
    public t0 c(MediaMetadata mediaMetadata0) {
        return a.a(this, mediaMetadata0);
    }

    @Override  // androidx.media3.common.util.BitmapLoader
    public t0 d(Uri uri0) {
        g g0 = () -> DataSourceBitmapLoader.k(this.b.a(), uri0, this.c);
        return this.a.submit(g0);
    }

    // 检测为 Lambda 实现
    private Bitmap h(byte[] arr_b) throws Exception [...]

    // 检测为 Lambda 实现
    private Bitmap i(Uri uri0) throws Exception [...]

    // 检测为 Lambda 实现
    private static y0 j() [...]

    private static Bitmap k(DataSource dataSource0, Uri uri0, @Nullable BitmapFactory.Options bitmapFactory$Options0) throws IOException {
        try(dataSource0) {
            dataSource0.a(new DataSpec(uri0));
            byte[] arr_b = DataSourceUtil.c(dataSource0);
            return BitmapUtil.a(arr_b, arr_b.length, bitmapFactory$Options0);
        }
    }
}

