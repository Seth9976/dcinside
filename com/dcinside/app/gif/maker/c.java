package com.dcinside.app.gif.maker;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.LongSparseArray;
import com.dcinside.app.Application;
import com.dcinside.app.util.ol.b;
import com.dcinside.app.util.ol;
import com.waynejo.androidndkgif.GifEncoder.a;
import java.io.File;
import kotlin.collections.u;
import kotlin.io.t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.X;
import y4.l;

@s0({"SMAP\nGifMakeInfoVideo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifMakeInfoVideo.kt\ncom/dcinside/app/gif/maker/GifMakeInfoVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
public final class c implements f {
    @l
    private final String a;
    @l
    private final File b;
    private final int c;
    private final long d;
    private final int e;
    private final int f;
    @l
    private final LongSparseArray g;

    public c(@l String s) {
        L.p(s, "path");
        int v3;
        int v2;
        long v1;
        int v;
        super();
        this.a = s;
        this.b = d.f.e();
        this.g = new LongSparseArray();
        if(!this.h1().exists() && !this.h1().mkdirs()) {
            throw new t(this.h1(), null, "임시 파일을 생성할 수 없습니다.", 2, null);
        }
        MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
        mediaMetadataRetriever0.setDataSource(Application.e.c(), Uri.fromFile(new File(s)));
        String s1 = mediaMetadataRetriever0.extractMetadata(24);
        if(s1 == null) {
            v = 0;
        }
        else {
            L.m(s1);
            v = Integer.parseInt(s1);
        }
        this.c = v;
        String s2 = mediaMetadataRetriever0.extractMetadata(9);
        if(s2 == null) {
            v1 = 0L;
        }
        else {
            L.m(s2);
            v1 = Long.parseLong(s2);
        }
        this.d = v1;
        String s3 = mediaMetadataRetriever0.extractMetadata(18);
        if(s3 == null) {
            v2 = 0;
        }
        else {
            L.m(s3);
            v2 = Integer.parseInt(s3);
        }
        String s4 = mediaMetadataRetriever0.extractMetadata(19);
        if(s4 == null) {
            v3 = 0;
        }
        else {
            L.m(s4);
            v3 = Integer.parseInt(s4);
        }
        ol ol0 = b.e(ol.e, v2, v3, 700, 0, 8, null);
        if(Math.abs(this.i1()) == 90 || Math.abs(this.i1()) == 270) {
            this.e = ol0.g();
            this.f = ol0.j();
        }
        else {
            this.e = ol0.j();
            this.f = ol0.g();
        }
        mediaMetadataRetriever0.release();
    }

    @l
    public final String a() {
        return this.a;
    }

    @Override  // com.dcinside.app.gif.maker.f
    public long f1() {
        return this.d;
    }

    @Override  // com.dcinside.app.gif.maker.f
    @l
    public X g1(@l a gifEncoder$a0, boolean z, int v, boolean z1, boolean z2, long v1) {
        L.p(gifEncoder$a0, "type");
        X x0 = (X)this.g.get(v1);
        if(x0 != null && (!x0.k() || x0.x0() == null)) {
            return x0;
        }
        X x1 = (X)u.B2(com.dcinside.app.gif.frame.d.e(com.dcinside.app.gif.frame.d.a, this, v1 * 1000L, 0L, true, com.dcinside.app.gif.frame.d.a.b, null, 36, null));
        this.g.put(v1, x1);
        return x1;
    }

    @Override  // com.dcinside.app.gif.maker.f
    public int getHeight() {
        return this.f;
    }

    @Override  // com.dcinside.app.gif.maker.f
    public int getWidth() {
        return this.e;
    }

    @Override  // com.dcinside.app.gif.maker.f
    @l
    public File h1() {
        return this.b;
    }

    @Override  // com.dcinside.app.gif.maker.f
    public int i1() {
        return this.c;
    }

    @Override  // com.dcinside.app.gif.maker.f
    public void release() {
        LongSparseArray longSparseArray0 = this.g;
        int v = longSparseArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            X x0 = (X)longSparseArray0.valueAt(v1);
            if(x0 != null) {
                L.m(x0);
                kotlinx.coroutines.I0.a.b(x0, null, 1, null);
            }
        }
        longSparseArray0.clear();
    }
}

