package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

public class i extends l {
    public i(ContentResolver contentResolver0, Uri uri0) {
        super(contentResolver0, uri0);
    }

    @Override  // com.bumptech.glide.load.data.d
    @NonNull
    public Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override  // com.bumptech.glide.load.data.l
    protected void e(Object object0) throws IOException {
        this.g(((ParcelFileDescriptor)object0));
    }

    @Override  // com.bumptech.glide.load.data.l
    protected Object f(Uri uri0, ContentResolver contentResolver0) throws FileNotFoundException {
        return this.h(uri0, contentResolver0);
    }

    protected void g(ParcelFileDescriptor parcelFileDescriptor0) throws IOException {
        parcelFileDescriptor0.close();
    }

    protected ParcelFileDescriptor h(Uri uri0, ContentResolver contentResolver0) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptor0 = contentResolver0.openAssetFileDescriptor(uri0, "r");
        if(assetFileDescriptor0 == null) {
            throw new FileNotFoundException("FileDescriptor is null for: " + uri0);
        }
        return assetFileDescriptor0.getParcelFileDescriptor();
    }
}

