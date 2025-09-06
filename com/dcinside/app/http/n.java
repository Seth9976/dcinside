package com.dcinside.app.http;

import androidx.annotation.Nullable;
import java.io.File;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public final class n {
    public static RequestBody a(File file0, @Nullable b l$b0) {
        if(file0 != null && file0.exists()) {
            return l$b0 == null ? RequestBody.create(MediaType.parse("audio/m4a"), file0) : new l(RequestBody.create(MediaType.parse("audio/m4a"), file0), l$b0);
        }
        return null;
    }

    public static RequestBody b(File file0, @Nullable b l$b0) {
        if(file0 != null && file0.exists()) {
            return l$b0 == null ? RequestBody.create(MediaType.parse("image/jpg"), file0) : new l(RequestBody.create(MediaType.parse("image/jpg"), file0), l$b0);
        }
        return null;
    }

    public static RequestBody c(File file0, @Nullable b l$b0) {
        if(file0 != null && file0.exists()) {
            return l$b0 == null ? RequestBody.create(MediaType.parse("video/mp4"), file0) : new l(RequestBody.create(MediaType.parse("video/mp4"), file0), l$b0);
        }
        return null;
    }
}

