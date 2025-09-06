package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import com.google.common.primitives.j;

@UnstableApi
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final int a;
    public final j b;

    public UnsupportedBrandsSniffFailure(int v, @Nullable int[] arr_v) {
        this.a = v;
        this.b = arr_v == null ? j.q() : j.j(arr_v);
    }
}

