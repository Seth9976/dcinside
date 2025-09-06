package com.dcinside.app.gif.frame;

import android.media.MediaFormat;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nFrameTrackInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameTrackInfo.kt\ncom/dcinside/app/gif/frame/FrameTrackInfo\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,9:1\n177#2,9:10\n*S KotlinDebug\n*F\n+ 1 FrameTrackInfo.kt\ncom/dcinside/app/gif/frame/FrameTrackInfo\n*L\n7#1:10,9\n*E\n"})
public final class c {
    private final int a;
    @l
    private final MediaFormat b;
    @l
    private final String c;
    private final int d;

    public c(int v, @l MediaFormat mediaFormat0, @l String s) {
        L.p(mediaFormat0, "format");
        Integer integer0;
        L.p(s, "mime");
        super();
        this.a = v;
        this.b = mediaFormat0;
        this.c = s;
        try {
            integer0 = null;
            integer0 = mediaFormat0.getInteger("frame-rate");
        }
        catch(Exception unused_ex) {
        }
        this.d = integer0 == null ? 30 : ((int)integer0);
    }

    @l
    public final MediaFormat a() {
        return this.b;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.a;
    }

    @l
    public final String d() {
        return this.c;
    }
}

