package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import jeb.synthetic.TWR;

class e {
    private final a a;
    private final d b;
    private final b c;
    private final ContentResolver d;
    private final List e;
    private static final String f = "ThumbStreamOpener";
    private static final a g;

    static {
        e.g = new a();
    }

    e(List list0, a a0, d d0, b b0, ContentResolver contentResolver0) {
        this.a = a0;
        this.b = d0;
        this.c = b0;
        this.d = contentResolver0;
        this.e = list0;
    }

    e(List list0, d d0, b b0, ContentResolver contentResolver0) {
        this(list0, e.g, d0, b0, contentResolver0);
    }

    int a(Uri uri0) {
        int v;
        InputStream inputStream0;
        try {
            try {
                inputStream0 = null;
                inputStream0 = this.d.openInputStream(uri0);
                v = f.b(this.e, inputStream0, this.c);
                goto label_14;
            }
            catch(IOException | NullPointerException iOException0) {
            }
            if(Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri0, iOException0);
            }
        }
        catch(Throwable throwable0) {
            goto label_11;
        }
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        return -1;
    label_11:
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
    label_14:
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        return v;
    }

    @Nullable
    private String b(@NonNull Uri uri0) {
        String s;
        Cursor cursor0 = null;
        try {
            cursor0 = this.b.a(uri0);
            goto label_6;
        }
        catch(SecurityException securityException0) {
            goto label_11;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
    label_6:
        if(cursor0 != null) {
            try {
                try {
                    if(cursor0.moveToFirst()) {
                        s = cursor0.getString(0);
                        goto label_19;
                    }
                    goto label_21;
                }
                catch(SecurityException securityException0) {
                }
            label_11:
                if(Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri0, securityException0);
                }
            }
            catch(Throwable throwable0) {
                goto label_17;
            }
            if(cursor0 != null) {
                cursor0.close();
            }
            return null;
        label_17:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        label_19:
            cursor0.close();
            return s;
        }
    label_21:
        if(cursor0 != null) {
            cursor0.close();
        }
        return null;
    }

    private boolean c(File file0) {
        return this.a.a(file0) && 0L < this.a.c(file0);
    }

    public InputStream d(Uri uri0) throws FileNotFoundException {
        String s = this.b(uri0);
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        File file0 = this.a.b(s);
        if(!this.c(file0)) {
            return null;
        }
        Uri uri1 = Uri.fromFile(file0);
        try {
            return this.d.openInputStream(uri1);
        }
        catch(NullPointerException nullPointerException0) {
            throw (FileNotFoundException)new FileNotFoundException("NPE opening uri: " + uri0 + " -> " + uri1).initCause(nullPointerException0);
        }
    }
}

