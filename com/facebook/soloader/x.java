package com.facebook.soloader;

import android.os.StrictMode.ThreadPolicy;
import java.io.File;

public class x extends H {
    @Override  // com.facebook.soloader.H
    public String f() {
        return "NoopSoSource";
    }

    @Override  // com.facebook.soloader.H
    public int i(String s, int v, StrictMode.ThreadPolicy strictMode$ThreadPolicy0) {
        return 1;
    }

    @Override  // com.facebook.soloader.H
    public File k(String s) {
        throw new UnsupportedOperationException("unpacking not supported in test mode");
    }
}

