package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.m;
import com.bumptech.glide.util.o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class e implements m {
    @Nullable
    private final b a;
    public static final i b = null;
    public static final i c = null;
    private static final String d = "BitmapEncoder";

    static {
        e.b = i.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
        e.c = i.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    }

    @Deprecated
    public e() {
        this.a = null;
    }

    public e(@NonNull b b0) {
        this.a = b0;
    }

    @Override  // com.bumptech.glide.load.d
    public boolean a(@NonNull Object object0, @NonNull File file0, @NonNull j j0) {
        return this.c(((v)object0), file0, j0);
    }

    @Override  // com.bumptech.glide.load.m
    @NonNull
    public c b(@NonNull j j0) {
        return c.b;
    }

    public boolean c(@NonNull v v0, @NonNull File file0, @NonNull j j0) {
        boolean z;
        FileOutputStream fileOutputStream1;
        Bitmap bitmap0 = (Bitmap)v0.get();
        Bitmap.CompressFormat bitmap$CompressFormat0 = this.d(bitmap0, j0);
        bitmap0.getWidth();
        bitmap0.getHeight();
        long v1 = com.bumptech.glide.util.i.b();
        int v2 = (int)(((Integer)j0.c(e.b)));
        FileOutputStream fileOutputStream0 = null;
        try {
            fileOutputStream1 = new FileOutputStream(file0);
        }
        catch(IOException iOException0) {
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_30;
        }
        try {
            fileOutputStream0 = this.a == null ? fileOutputStream1 : new com.bumptech.glide.load.data.c(fileOutputStream1, this.a);
        }
        catch(IOException iOException0) {
            fileOutputStream0 = fileOutputStream1;
            goto label_23;
        }
        catch(Throwable throwable0) {
            fileOutputStream0 = fileOutputStream1;
            goto label_30;
        }
        try {
            bitmap0.compress(bitmap$CompressFormat0, v2, fileOutputStream0);
            fileOutputStream0.close();
            goto label_33;
        }
        catch(IOException iOException0) {
            try {
            label_23:
                if(Log.isLoggable("BitmapEncoder", 3)) {
                    Log.d("BitmapEncoder", "Failed to encode Bitmap", iOException0);
                }
            }
            catch(Throwable throwable0) {
                goto label_30;
            }
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            z = false;
            goto label_35;
        }
        catch(Throwable throwable0) {
        }
    label_30:
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_33:
            fileOutputStream0.close();
            z = true;
        }
        catch(IOException unused_ex) {
        }
    label_35:
        if(Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + bitmap$CompressFormat0 + " of size " + o.i(bitmap0) + " in " + com.bumptech.glide.util.i.a(v1) + ", options format: " + j0.c(e.c) + ", hasAlpha: " + bitmap0.hasAlpha());
        }
        return z;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap0, j j0) {
        Bitmap.CompressFormat bitmap$CompressFormat0 = (Bitmap.CompressFormat)j0.c(e.c);
        if(bitmap$CompressFormat0 != null) {
            return bitmap$CompressFormat0;
        }
        return bitmap0.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }
}

