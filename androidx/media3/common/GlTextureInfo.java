package androidx.media3.common;

import androidx.media3.common.util.GlUtil.GlException;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class GlTextureInfo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public static final GlTextureInfo f;

    static {
        GlTextureInfo.f = new GlTextureInfo(-1, -1, -1, -1, -1);
    }

    public GlTextureInfo(int v, int v1, int v2, int v3, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    public void a() throws GlException {
        int v = this.a;
        if(v != -1) {
            GlUtil.A(v);
        }
        int v1 = this.b;
        if(v1 != -1) {
            GlUtil.w(v1);
        }
        int v2 = this.c;
        if(v2 != -1) {
            GlUtil.x(v2);
        }
    }
}

