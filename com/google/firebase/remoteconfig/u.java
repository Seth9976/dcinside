package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o3.g;

public class u extends r {
    private final int b;

    public u(int v, @NonNull String s) {
        super(s);
        this.b = v;
    }

    public u(int v, @NonNull String s, @g a r$a0) {
        super(s, r$a0);
        this.b = v;
    }

    public u(int v, @NonNull String s, @Nullable Throwable throwable0) {
        super(s, throwable0);
        this.b = v;
    }

    public u(int v, @NonNull String s, @Nullable Throwable throwable0, @NonNull a r$a0) {
        super(s, throwable0, r$a0);
        this.b = v;
    }

    public u(@NonNull String s, @g a r$a0) {
        super(s, r$a0);
        this.b = -1;
    }

    public u(@NonNull String s, @Nullable Throwable throwable0, @NonNull a r$a0) {
        super(s, throwable0, r$a0);
        this.b = -1;
    }

    public int b() {
        return this.b;
    }
}

