package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video.Thumbnails;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class c implements d {
    static class a implements com.bumptech.glide.load.data.mediastore.d {
        private final ContentResolver a;
        private static final String[] b = null;
        private static final String c = "kind = 1 AND image_id = ?";

        static {
            a.b = new String[]{"_data"};
        }

        a(ContentResolver contentResolver0) {
            this.a = contentResolver0;
        }

        @Override  // com.bumptech.glide.load.data.mediastore.d
        public Cursor a(Uri uri0) {
            String[] arr_s = {uri0.getLastPathSegment()};
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a.b, "kind = 1 AND image_id = ?", arr_s, null);
        }
    }

    static class b implements com.bumptech.glide.load.data.mediastore.d {
        private final ContentResolver a;
        private static final String[] b = null;
        private static final String c = "kind = 1 AND video_id = ?";

        static {
            b.b = new String[]{"_data"};
        }

        b(ContentResolver contentResolver0) {
            this.a = contentResolver0;
        }

        @Override  // com.bumptech.glide.load.data.mediastore.d
        public Cursor a(Uri uri0) {
            String[] arr_s = {uri0.getLastPathSegment()};
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b.b, "kind = 1 AND video_id = ?", arr_s, null);
        }
    }

    private final Uri a;
    private final e b;
    private InputStream c;
    private static final String d = "MediaStoreThumbFetcher";

    @VisibleForTesting
    c(Uri uri0, e e0) {
        this.a = uri0;
        this.b = e0;
    }

    @Override  // com.bumptech.glide.load.data.d
    @NonNull
    public Class a() {
        return InputStream.class;
    }

    @Override  // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream0 = this.c;
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    @Override  // com.bumptech.glide.load.data.d
    @NonNull
    public com.bumptech.glide.load.a c() {
        return com.bumptech.glide.load.a.a;
    }

    @Override  // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override  // com.bumptech.glide.load.data.d
    public void d(@NonNull j j0, @NonNull com.bumptech.glide.load.data.d.a d$a0) {
        try {
            InputStream inputStream0 = this.h();
            this.c = inputStream0;
            d$a0.e(inputStream0);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            if(Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", fileNotFoundException0);
            }
            d$a0.f(fileNotFoundException0);
        }
    }

    private static c e(Context context0, Uri uri0, com.bumptech.glide.load.data.mediastore.d d0) {
        com.bumptech.glide.load.engine.bitmap_recycle.b b0 = com.bumptech.glide.c.e(context0).g();
        return new c(uri0, new e(com.bumptech.glide.c.e(context0).n().g(), d0, b0, context0.getContentResolver()));
    }

    public static c f(Context context0, Uri uri0) {
        return c.e(context0, uri0, new a(context0.getContentResolver()));
    }

    public static c g(Context context0, Uri uri0) {
        return c.e(context0, uri0, new b(context0.getContentResolver()));
    }

    private InputStream h() throws FileNotFoundException {
        InputStream inputStream0 = this.b.d(this.a);
        int v = inputStream0 == null ? -1 : this.b.a(this.a);
        return v != -1 ? new g(inputStream0, v) : inputStream0;
    }
}

