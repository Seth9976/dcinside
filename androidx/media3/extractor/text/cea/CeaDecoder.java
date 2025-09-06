package androidx.media3.extractor.text.cea;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderOutputBuffer.Owner;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

abstract class CeaDecoder implements SubtitleDecoder {
    static final class CeaInputBuffer extends SubtitleInputBuffer implements Comparable {
        private long n;

        private CeaInputBuffer() {
        }

        CeaInputBuffer(androidx.media3.extractor.text.cea.CeaDecoder.1 ceaDecoder$10) {
        }

        @Override
        public int compareTo(Object object0) {
            return this.y(((CeaInputBuffer)object0));
        }

        public int y(CeaInputBuffer ceaDecoder$CeaInputBuffer0) {
            if(this.j() != ceaDecoder$CeaInputBuffer0.j()) {
                return this.j() ? 1 : -1;
            }
            long v = this.f - ceaDecoder$CeaInputBuffer0.f;
            if(v == 0L) {
                v = this.n - ceaDecoder$CeaInputBuffer0.n;
                if(v == 0L) {
                    return 0;
                }
            }
            return v <= 0L ? -1 : 1;
        }
    }

    static final class CeaOutputBuffer extends SubtitleOutputBuffer {
        private Owner g;

        public CeaOutputBuffer(Owner decoderOutputBuffer$Owner0) {
            this.g = decoderOutputBuffer$Owner0;
        }

        @Override  // androidx.media3.decoder.DecoderOutputBuffer
        public final void p() {
            this.g.a(this);
        }
    }

    private final ArrayDeque a;
    private final ArrayDeque b;
    private final PriorityQueue c;
    @Nullable
    private CeaInputBuffer d;
    private long e;
    private long f;
    private long g;
    private static final int h = 10;
    private static final int i = 2;

    public CeaDecoder() {
        this.a = new ArrayDeque();
        for(int v1 = 0; v1 < 10; ++v1) {
            CeaInputBuffer ceaDecoder$CeaInputBuffer0 = new CeaInputBuffer(null);
            this.a.add(ceaDecoder$CeaInputBuffer0);
        }
        this.b = new ArrayDeque();
        for(int v = 0; v < 2; ++v) {
            CeaOutputBuffer ceaDecoder$CeaOutputBuffer0 = new CeaOutputBuffer((SubtitleOutputBuffer subtitleOutputBuffer0) -> {
                subtitleOutputBuffer0.f();
                this.b.add(subtitleOutputBuffer0);
            });
            this.b.add(ceaDecoder$CeaOutputBuffer0);
        }
        this.c = new PriorityQueue();
        this.g = 0x8000000000000001L;
    }

    @Override  // androidx.media3.decoder.Decoder
    @Nullable
    public Object a() throws DecoderException {
        return this.j();
    }

    @Override  // androidx.media3.decoder.Decoder
    public void b(Object object0) throws DecoderException {
        this.n(((SubtitleInputBuffer)object0));
    }

    @Override  // androidx.media3.decoder.Decoder
    public final void c(long v) {
        this.g = v;
    }

    @Override  // androidx.media3.decoder.Decoder
    @Nullable
    public Object d() throws DecoderException {
        return this.i();
    }

    @Override  // androidx.media3.extractor.text.SubtitleDecoder
    public void f(long v) {
        this.e = v;
    }

    @Override  // androidx.media3.decoder.Decoder
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while(!this.c.isEmpty()) {
            this.o(((CeaInputBuffer)Util.o(((CeaInputBuffer)this.c.poll()))));
        }
        CeaInputBuffer ceaDecoder$CeaInputBuffer0 = this.d;
        if(ceaDecoder$CeaInputBuffer0 != null) {
            this.o(ceaDecoder$CeaInputBuffer0);
            this.d = null;
        }
    }

    protected abstract Subtitle g();

    @Override  // androidx.media3.decoder.Decoder
    public abstract String getName();

    protected abstract void h(SubtitleInputBuffer arg1);

    @Nullable
    public SubtitleInputBuffer i() throws SubtitleDecoderException {
        Assertions.i(this.d == null);
        if(this.a.isEmpty()) {
            return null;
        }
        CeaInputBuffer ceaDecoder$CeaInputBuffer0 = (CeaInputBuffer)this.a.pollFirst();
        this.d = ceaDecoder$CeaInputBuffer0;
        return ceaDecoder$CeaInputBuffer0;
    }

    @Nullable
    public SubtitleOutputBuffer j() throws SubtitleDecoderException {
        if(this.b.isEmpty()) {
            return null;
        }
        while(!this.c.isEmpty() && ((CeaInputBuffer)Util.o(((CeaInputBuffer)this.c.peek()))).f <= this.e) {
            CeaInputBuffer ceaDecoder$CeaInputBuffer0 = (CeaInputBuffer)Util.o(((CeaInputBuffer)this.c.poll()));
            if(ceaDecoder$CeaInputBuffer0.j()) {
                SubtitleOutputBuffer subtitleOutputBuffer0 = (SubtitleOutputBuffer)Util.o(((SubtitleOutputBuffer)this.b.pollFirst()));
                subtitleOutputBuffer0.e(4);
                this.o(ceaDecoder$CeaInputBuffer0);
                return subtitleOutputBuffer0;
            }
            this.h(ceaDecoder$CeaInputBuffer0);
            if(this.m()) {
                Subtitle subtitle0 = this.g();
                SubtitleOutputBuffer subtitleOutputBuffer1 = (SubtitleOutputBuffer)Util.o(((SubtitleOutputBuffer)this.b.pollFirst()));
                subtitleOutputBuffer1.r(ceaDecoder$CeaInputBuffer0.f, subtitle0, 0x7FFFFFFFFFFFFFFFL);
                this.o(ceaDecoder$CeaInputBuffer0);
                return subtitleOutputBuffer1;
            }
            this.o(ceaDecoder$CeaInputBuffer0);
        }
        return null;
    }

    @Nullable
    protected final SubtitleOutputBuffer k() {
        return (SubtitleOutputBuffer)this.b.pollFirst();
    }

    protected final long l() {
        return this.e;
    }

    protected abstract boolean m();

    public void n(SubtitleInputBuffer subtitleInputBuffer0) throws SubtitleDecoderException {
        Assertions.a(subtitleInputBuffer0 == this.d);
        if(this.g == 0x8000000000000001L || ((CeaInputBuffer)subtitleInputBuffer0).f >= this.g) {
            long v = this.f;
            this.f = v + 1L;
            ((CeaInputBuffer)subtitleInputBuffer0).n = v;
            this.c.add(((CeaInputBuffer)subtitleInputBuffer0));
        }
        else {
            this.o(((CeaInputBuffer)subtitleInputBuffer0));
        }
        this.d = null;
    }

    private void o(CeaInputBuffer ceaDecoder$CeaInputBuffer0) {
        ceaDecoder$CeaInputBuffer0.f();
        this.a.add(ceaDecoder$CeaInputBuffer0);
    }

    // 检测为 Lambda 实现
    protected void p(SubtitleOutputBuffer subtitleOutputBuffer0) [...]

    @Override  // androidx.media3.decoder.Decoder
    public void release() {
    }

    class androidx.media3.extractor.text.cea.CeaDecoder.1 {
    }

}

