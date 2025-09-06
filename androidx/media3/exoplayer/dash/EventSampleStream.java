package androidx.media3.exoplayer.dash;

import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.dash.manifest.EventStream;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.extractor.metadata.emsg.EventMessageEncoder;
import java.io.IOException;

final class EventSampleStream implements SampleStream {
    private final Format a;
    private final EventMessageEncoder b;
    private long[] c;
    private boolean d;
    private EventStream e;
    private boolean f;
    private int g;
    private long h;

    public EventSampleStream(EventStream eventStream0, Format format0, boolean z) {
        this.a = format0;
        this.e = eventStream0;
        this.b = new EventMessageEncoder();
        this.h = 0x8000000000000001L;
        this.c = eventStream0.b;
        this.d(eventStream0, z);
    }

    public String a() {
        return this.e.a();
    }

    @Override  // androidx.media3.exoplayer.source.SampleStream
    public void b() throws IOException {
    }

    public void c(long v) {
        int v1 = Util.j(this.c, v, true, false);
        this.g = v1;
        if(!this.d || v1 != this.c.length) {
            v = 0x8000000000000001L;
        }
        this.h = v;
    }

    public void d(EventStream eventStream0, boolean z) {
        long v = this.g == 0 ? 0x8000000000000001L : this.c[this.g - 1];
        this.d = z;
        this.e = eventStream0;
        long[] arr_v = eventStream0.b;
        this.c = arr_v;
        long v1 = this.h;
        if(v1 != 0x8000000000000001L) {
            this.c(v1);
            return;
        }
        if(v != 0x8000000000000001L) {
            this.g = Util.j(arr_v, v, false, false);
        }
    }

    @Override  // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return true;
    }

    @Override  // androidx.media3.exoplayer.source.SampleStream
    public int m(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v) {
        int v1 = this.g;
        boolean z = v1 == this.c.length;
        if(z && !this.d) {
            decoderInputBuffer0.n(4);
            return -4;
        }
        if((v & 2) == 0 && this.f) {
            if(z) {
                return -3;
            }
            if((v & 1) == 0) {
                this.g = v1 + 1;
            }
            if((v & 4) == 0) {
                byte[] arr_b = this.b.a(this.e.a[v1]);
                decoderInputBuffer0.r(arr_b.length);
                decoderInputBuffer0.d.put(arr_b);
            }
            decoderInputBuffer0.f = this.c[v1];
            decoderInputBuffer0.n(1);
            return -4;
        }
        formatHolder0.b = this.a;
        this.f = true;
        return -5;
    }

    @Override  // androidx.media3.exoplayer.source.SampleStream
    public int p(long v) {
        int v1 = Math.max(this.g, Util.j(this.c, v, true, false));
        int v2 = v1 - this.g;
        this.g = v1;
        return v2;
    }
}

