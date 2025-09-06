package com.dcinside.app.gif.frame;

import A3.p;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.dcinside.app.gif.maker.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nFrames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Frames.kt\ncom/dcinside/app/gif/frame/Frames\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,271:1\n1#2:272\n177#3,9:273\n177#3,9:282\n*S KotlinDebug\n*F\n+ 1 Frames.kt\ncom/dcinside/app/gif/frame/Frames\n*L\n257#1:273,9\n263#1:282,9\n*E\n"})
public final class d {
    public static enum a {
        MANY,
        DEFAULT;

        private static final a[] c;
        private static final kotlin.enums.a d;

        static {
            a.c = arr_d$a;
            L.p(arr_d$a, "entries");
            a.d = new kotlin.enums.d(arr_d$a);
        }

        private static final a[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return a.d;
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[a.values().length];
            try {
                arr_v[a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[a.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @l
    public static final d a = null;
    private static final int b = 10000;
    private static final int c = -1;
    private static final long d = -1L;
    private static final long e = -2L;

    static {
        d.a = new d();
    }

    public final boolean a(@l Bitmap bitmap0, @l File file0) {
        boolean z;
        L.p(bitmap0, "bitmap");
        L.p(file0, "file");
        FileOutputStream fileOutputStream0 = null;
        try {
            fileOutputStream0 = new FileOutputStream(file0);
            z = bitmap0.compress(Bitmap.CompressFormat.WEBP, 100, fileOutputStream0);
            goto label_12;
        }
        catch(Throwable throwable0) {
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.flush();
                    fileOutputStream0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            try {
                bitmap0.recycle();
            }
            catch(Exception unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_12:
            fileOutputStream0.flush();
            fileOutputStream0.close();
        }
        catch(Exception unused_ex) {
        }
        try {
            bitmap0.recycle();
        }
        catch(Exception unused_ex) {
        }
        return z;
    }

    private final List b(MediaExtractor mediaExtractor0, MediaCodec mediaCodec0, com.dcinside.app.gif.frame.a a0, long v, boolean z, int v1, p p0) throws IOException {
        MediaCodec.BufferInfo mediaCodec$BufferInfo0 = new MediaCodec.BufferInfo();
        List list0 = new ArrayList();
        long v2 = -1L;
        long v3 = -1L;
        boolean z1 = false;
        int v4 = 0;
        boolean z2 = false;
        while(!z2) {
            if(!z1) {
                long v5 = this.h(mediaExtractor0, mediaCodec0);
                if(v5 != -1L) {
                    if(v5 == -2L) {
                        z1 = true;
                    }
                    else if(v5 >= 0L) {
                        if(v2 < 0L) {
                            v2 = v5;
                        }
                        if(v3 < 0L) {
                            v3 = v5 + v;
                        }
                    }
                }
            }
            int v6 = this.j(mediaCodec0, mediaCodec$BufferInfo0);
            if(v6 != -1) {
                z2 = (mediaCodec$BufferInfo0.flags & 4) != 0 || 0L <= v3 && v3 <= mediaCodec$BufferInfo0.presentationTimeUs;
                boolean z3 = mediaCodec$BufferInfo0.size != 0;
                mediaCodec0.releaseOutputBuffer(v6, z3);
                if(z3) {
                    a0.b();
                    if(z || v4 % v1 == 0) {
                        a0.e();
                        long v7 = mediaCodec$BufferInfo0.presentationTimeUs;
                        list0.add(a0.j(v7));
                        if(p0 != null) {
                            p0.invoke(v7, v2, v3);
                        }
                    }
                    if(z && !list0.isEmpty()) {
                        break;
                    }
                    ++v4;
                }
            }
        }
        return list0;
    }

    static List c(d d0, MediaExtractor mediaExtractor0, MediaCodec mediaCodec0, com.dcinside.app.gif.frame.a a0, long v, boolean z, int v1, p p0, int v2, Object object0) throws IOException {
        return (v2 & 0x40) == 0 ? d0.b(mediaExtractor0, mediaCodec0, a0, v, z, v1, p0) : d0.b(mediaExtractor0, mediaCodec0, a0, v, z, v1, null);
    }

    @l
    public final List d(@l c c0, long v, long v1, boolean z, @l a d$a0, @m p p0) throws IOException {
        List list0;
        float f;
        com.dcinside.app.gif.frame.a a1;
        com.dcinside.app.gif.frame.c c1;
        MediaCodec mediaCodec0;
        MediaExtractor mediaExtractor0;
        File file0;
        L.p(c0, "info");
        L.p(d$a0, "frameCount");
        com.dcinside.app.gif.frame.a a0 = null;
        try {
            file0 = new File(c0.a());
            if(!file0.canRead()) {
                throw new FileNotFoundException("Unable to read " + file0);
            }
            mediaExtractor0 = new MediaExtractor();
        }
        catch(Throwable throwable0) {
            mediaCodec0 = null;
            mediaExtractor0 = null;
            goto label_38;
        }
        try {
            mediaExtractor0.setDataSource(file0.toString());
            c1 = this.i(mediaExtractor0);
            if(c1 == null) {
                throw new RuntimeException("Video track not found: " + file0);
            }
            mediaExtractor0.seekTo(Math.max(v, 1L), 0);
            a1 = new com.dcinside.app.gif.frame.a(c0.getWidth(), c0.getHeight(), ((float)c0.i1()), c0.h1());
        }
        catch(Throwable throwable0) {
            mediaCodec0 = null;
            goto label_38;
        }
        try {
            mediaCodec0 = MediaCodec.createDecoderByType(c1.d());
            mediaCodec0.configure(c1.a(), a1.g(), null, 0);
            mediaCodec0.start();
        }
        catch(Throwable throwable0) {
            mediaCodec0 = null;
            goto label_37;
        }
        try {
            switch(d$a0) {
                case 1: {
                    f = 10.0f;
                    break;
                }
                case 2: {
                    f = 8.0f;
                    break;
                }
                default: {
                    throw new J();
                }
            }
            list0 = this.b(mediaExtractor0, mediaCodec0, a1, v1, z, ((int)Math.max(((float)Math.rint(((float)c1.b()) / f)), 1.0f)), p0);
            goto label_46;
        label_37:
            a0 = a1;
        }
        catch(Throwable throwable0) {
            goto label_37;
        }
    label_38:
        if(a0 != null) {
            a0.i();
        }
        if(mediaCodec0 != null) {
            mediaCodec0.stop();
            mediaCodec0.release();
        }
        if(mediaExtractor0 != null) {
            mediaExtractor0.release();
        }
        throw throwable0;
    label_46:
        a1.i();
        mediaCodec0.stop();
        mediaCodec0.release();
        mediaExtractor0.release();
        return list0;
    }

    public static List e(d d0, c c0, long v, long v1, boolean z, a d$a0, p p0, int v2, Object object0) throws IOException {
        long v3 = (v2 & 4) == 0 ? v1 : 0x7FFFFFFFFFFFFFFFL;
        boolean z1 = (v2 & 8) == 0 ? z : false;
        return (v2 & 0x20) == 0 ? d0.d(c0, v, v3, z1, d$a0, p0) : d0.d(c0, v, v3, z1, d$a0, null);
    }

    private final ByteBuffer f(MediaCodec mediaCodec0, int v) {
        return mediaCodec0.getInputBuffer(v);
    }

    private final com.dcinside.app.gif.frame.c g(MediaExtractor mediaExtractor0) {
        int v = mediaExtractor0.getTrackCount();
        for(int v1 = 0; v1 < v; ++v1) {
            MediaFormat mediaFormat0 = mediaExtractor0.getTrackFormat(v1);
            L.o(mediaFormat0, "getTrackFormat(...)");
            String s = mediaFormat0.getString("mime");
            if(s != null && v.v2(s, "video/", false, 2, null)) {
                return new com.dcinside.app.gif.frame.c(v1, mediaFormat0, s);
            }
        }
        return null;
    }

    private final long h(MediaExtractor mediaExtractor0, MediaCodec mediaCodec0) {
        int v = mediaCodec0.dequeueInputBuffer(10000L);
        if(v >= 0) {
            ByteBuffer byteBuffer0 = this.f(mediaCodec0, v);
            int v1 = byteBuffer0 == null ? -1 : mediaExtractor0.readSampleData(byteBuffer0, 0);
            if(v1 < 0) {
                mediaCodec0.queueInputBuffer(v, 0, 0, 0L, 4);
                return -2L;
            }
            long v2 = mediaExtractor0.getSampleTime();
            mediaCodec0.queueInputBuffer(v, 0, v1, v2, 0);
            mediaExtractor0.advance();
            return v2;
        }
        return -1L;
    }

    private final com.dcinside.app.gif.frame.c i(MediaExtractor mediaExtractor0) {
        com.dcinside.app.gif.frame.c c0 = this.g(mediaExtractor0);
        if(c0 != null) {
            mediaExtractor0.selectTrack(c0.c());
            return c0;
        }
        return null;
    }

    private final int j(MediaCodec mediaCodec0, MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        int v = mediaCodec0.dequeueOutputBuffer(mediaCodec$BufferInfo0, 10000L);
        if(v != -1 && (v != -3 && v != -2)) {
            if(v < 0) {
                throw new IllegalStateException("unexpected status: " + v);
            }
            return v;
        }
        return -1;
    }
}

