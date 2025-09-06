package androidx.media3.exoplayer.dash.manifest;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class ProgramInformation {
    @Nullable
    public final String a;
    @Nullable
    public final String b;
    @Nullable
    public final String c;
    @Nullable
    public final String d;
    @Nullable
    public final String e;

    public ProgramInformation(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ProgramInformation ? Util.g(this.a, ((ProgramInformation)object0).a) && Util.g(this.b, ((ProgramInformation)object0).b) && Util.g(this.c, ((ProgramInformation)object0).c) && Util.g(this.d, ((ProgramInformation)object0).d) && Util.g(this.e, ((ProgramInformation)object0).e) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        String s = this.e;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((v1 + 0x20F) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }
}

