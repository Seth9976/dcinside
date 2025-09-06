package androidx.media3.exoplayer.dash.manifest;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.B;

@UnstableApi
public final class BaseUrl {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public static final int e = 1;
    public static final int f = 1;
    public static final int g = 0x80000000;

    public BaseUrl(String s) {
        this(s, s, 0x80000000, 1);
    }

    public BaseUrl(String s, String s1, int v, int v1) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof BaseUrl ? this.c == ((BaseUrl)object0).c && this.d == ((BaseUrl)object0).d && B.a(this.a, ((BaseUrl)object0).a) && B.a(this.b, ((BaseUrl)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.a, this.b, this.c, this.d});
    }
}

