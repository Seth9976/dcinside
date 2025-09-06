package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

public final class b {
    private final List a;

    public b() {
        this.a = new ArrayList();
    }

    public void a(@NonNull ImageHeaderParser imageHeaderParser0) {
        synchronized(this) {
            this.a.add(imageHeaderParser0);
        }
    }

    @NonNull
    public List b() {
        synchronized(this) {
        }
        return this.a;
    }
}

