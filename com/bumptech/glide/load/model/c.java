package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.j;
import com.bumptech.glide.util.a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class c implements d {
    private static final String a = "ByteBufferEncoder";

    @Override  // com.bumptech.glide.load.d
    public boolean a(@NonNull Object object0, @NonNull File file0, @NonNull j j0) {
        return this.c(((ByteBuffer)object0), file0, j0);
    }

    public boolean c(@NonNull ByteBuffer byteBuffer0, @NonNull File file0, @NonNull j j0) {
        try {
            a.f(byteBuffer0, file0);
            return true;
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", iOException0);
            }
            return false;
        }
    }
}

