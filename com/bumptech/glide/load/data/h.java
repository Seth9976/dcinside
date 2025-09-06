package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;

public class h extends b {
    public h(AssetManager assetManager0, String s) {
        super(assetManager0, s);
    }

    @Override  // com.bumptech.glide.load.data.d
    @NonNull
    public Class a() {
        return AssetFileDescriptor.class;
    }

    @Override  // com.bumptech.glide.load.data.b
    protected void e(Object object0) throws IOException {
        this.g(((AssetFileDescriptor)object0));
    }

    @Override  // com.bumptech.glide.load.data.b
    protected Object f(AssetManager assetManager0, String s) throws IOException {
        return this.h(assetManager0, s);
    }

    protected void g(AssetFileDescriptor assetFileDescriptor0) throws IOException {
        assetFileDescriptor0.close();
    }

    protected AssetFileDescriptor h(AssetManager assetManager0, String s) throws IOException {
        return assetManager0.openFd(s);
    }
}

