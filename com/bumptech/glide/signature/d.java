package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.g;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class d implements g {
    @NonNull
    private final String c;
    private final long d;
    private final int e;

    public d(@Nullable String s, long v, int v1) {
        if(s == null) {
            s = "";
        }
        this.c = s;
        this.d = v;
        this.e = v1;
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
        messageDigest0.update(ByteBuffer.allocate(12).putLong(this.d).putInt(this.e).array());
        messageDigest0.update(this.c.getBytes(g.b));
    }

    @Override  // com.bumptech.glide.load.g
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.d != ((d)object0).d) {
            return false;
        }
        return this.e == ((d)object0).e ? this.c.equals(((d)object0).c) : false;
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        return (this.c.hashCode() * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + this.e;
    }
}

