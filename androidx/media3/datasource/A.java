package androidx.media3.datasource;

import android.net.Uri;

public final class a implements UriResolver {
    public final byte[] a;

    public a(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override  // androidx.media3.datasource.ByteArrayDataSource$UriResolver
    public final byte[] a(Uri uri0) {
        return ByteArrayDataSource.y(this.a, uri0);
    }
}

