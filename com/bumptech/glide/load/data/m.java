package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

public class m extends b {
    public m(AssetManager assetManager0, String s) {
        super(assetManager0, s);
    }

    @Override  // com.bumptech.glide.load.data.d
    @NonNull
    public Class a() {
        return InputStream.class;
    }

    @Override  // com.bumptech.glide.load.data.b
    protected void e(Object object0) throws IOException {
        this.g(((InputStream)object0));
    }

    @Override  // com.bumptech.glide.load.data.b
    protected Object f(AssetManager assetManager0, String s) throws IOException {
        return this.h(assetManager0, s);
    }

    protected void g(InputStream inputStream0) throws IOException {
        inputStream0.close();
    }

    protected InputStream h(AssetManager assetManager0, String s) throws IOException {
        return assetManager0.open(s);
    }
}

