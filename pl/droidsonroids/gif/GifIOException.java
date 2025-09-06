package pl.droidsonroids.gif;

import androidx.annotation.NonNull;
import java.io.IOException;

public class GifIOException extends IOException {
    @NonNull
    public final h a;
    private final String b;
    private static final long c = 13038402904505L;

    GifIOException(int v, String s) {
        this.a = h.a(v);
        this.b = s;
    }

    static GifIOException a(int v) {
        return v == h.c.b ? null : new GifIOException(v, null);
    }

    @Override
    public String getMessage() {
        return this.b == null ? this.a.c() : this.a.c() + ": " + this.b;
    }
}

