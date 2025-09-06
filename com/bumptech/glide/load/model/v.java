package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class v implements d {
    private final b a;
    private static final String b = "StreamEncoder";

    public v(b b0) {
        this.a = b0;
    }

    @Override  // com.bumptech.glide.load.d
    public boolean a(@NonNull Object object0, @NonNull File file0, @NonNull j j0) {
        return this.c(((InputStream)object0), file0, j0);
    }

    public boolean c(@NonNull InputStream inputStream0, @NonNull File file0, @NonNull j j0) {
        FileOutputStream fileOutputStream1;
        byte[] arr_b = (byte[])this.a.d(0x10000, byte[].class);
        FileOutputStream fileOutputStream0 = null;
        try {
            fileOutputStream1 = new FileOutputStream(file0);
            goto label_6;
        }
        catch(IOException iOException0) {
            goto label_17;
            try {
                while(true) {
                label_6:
                    int v = inputStream0.read(arr_b);
                    if(v == -1) {
                        break;
                    }
                    fileOutputStream1.write(arr_b, 0, v);
                }
                fileOutputStream1.close();
                goto label_30;
            }
            catch(IOException iOException0) {
                fileOutputStream0 = fileOutputStream1;
            }
            catch(Throwable throwable0) {
                fileOutputStream0 = fileOutputStream1;
                goto label_26;
            }
            try {
            label_17:
                if(Log.isLoggable("StreamEncoder", 3)) {
                    Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", iOException0);
                }
            }
            catch(Throwable throwable0) {
                goto label_26;
            }
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        this.a.put(arr_b);
        return false;
    label_26:
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        this.a.put(arr_b);
        throw throwable0;
        try {
        label_30:
            fileOutputStream1.close();
        }
        catch(IOException unused_ex) {
        }
        this.a.put(arr_b);
        return true;
    }
}

