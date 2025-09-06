package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.h;
import java.io.IOException;

class i implements h {
    private boolean a;
    private boolean b;
    private d c;
    private final f d;

    i(f f0) {
        this.a = false;
        this.b = false;
        this.d = f0;
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h a(long v) throws IOException {
        this.b();
        this.d.v(this.c, v, this.b);
        return this;
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h add(int v) throws IOException {
        this.b();
        this.d.t(this.c, v, this.b);
        return this;
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h add(@NonNull byte[] arr_b) throws IOException {
        this.b();
        this.d.f(this.c, arr_b, this.b);
        return this;
    }

    private void b() {
        if(this.a) {
            throw new c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h c(@Nullable String s) throws IOException {
        this.b();
        this.d.f(this.c, s, this.b);
        return this;
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h d(boolean z) throws IOException {
        this.b();
        this.d.x(this.c, z, this.b);
        return this;
    }

    void e(d d0, boolean z) {
        this.a = false;
        this.c = d0;
        this.b = z;
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h f(double f) throws IOException {
        this.b();
        this.d.c(this.c, f, this.b);
        return this;
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h g(float f) throws IOException {
        this.b();
        this.d.d(this.c, f, this.b);
        return this;
    }
}

