package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class j implements l {
    private final List a;
    private final l b;
    private final b c;
    private static final String d = "StreamGifDecoder";

    public j(List list0, l l0, b b0) {
        this.a = list0;
        this.b = l0;
        this.c = b0;
    }

    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull com.bumptech.glide.load.j j0) throws IOException {
        return this.d(((InputStream)object0), j0);
    }

    @Override  // com.bumptech.glide.load.l
    public v b(@NonNull Object object0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) throws IOException {
        return this.c(((InputStream)object0), v, v1, j0);
    }

    public v c(@NonNull InputStream inputStream0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) throws IOException {
        byte[] arr_b = j.e(inputStream0);
        if(arr_b == null) {
            return null;
        }
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        return this.b.b(byteBuffer0, v, v1, j0);
    }

    public boolean d(@NonNull InputStream inputStream0, @NonNull com.bumptech.glide.load.j j0) throws IOException {
        return !((Boolean)j0.c(i.b)).booleanValue() && f.f(this.a, inputStream0, this.c) == ImageType.GIF;
    }

    private static byte[] e(InputStream inputStream0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x4000);
        try {
            byte[] arr_b = new byte[0x4000];
            int v;
            while((v = inputStream0.read(arr_b)) != -1) {
                byteArrayOutputStream0.write(arr_b, 0, v);
            }
            byteArrayOutputStream0.flush();
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
        }
        if(Log.isLoggable("StreamGifDecoder", 5)) {
            Log.w("StreamGifDecoder", "Error reading data from stream", iOException0);
        }
        return null;
    }
}

