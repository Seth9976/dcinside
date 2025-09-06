package com.bumptech.glide.signature;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class a implements g {
    private final int c;
    private final g d;

    private a(int v, g g0) {
        this.c = v;
        this.d = g0;
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
        this.d.b(messageDigest0);
        messageDigest0.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @NonNull
    public static g c(@NonNull Context context0) {
        g g0 = b.c(context0);
        return new a(context0.getResources().getConfiguration().uiMode & 0x30, g0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.g
    public boolean equals(Object object0) {
        return object0 instanceof a && this.c == ((a)object0).c && this.d.equals(((a)object0).d);
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        return o.r(this.d, this.c);
    }
}

