package androidx.media3.exoplayer.dash;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.TrackOutput.CryptoData;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.g;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.emsg.EventMessageDecoder;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

@UnstableApi
public final class PlayerEmsgHandler implements Handler.Callback {
    static final class ManifestExpiryEventInfo {
        public final long a;
        public final long b;

        public ManifestExpiryEventInfo(long v, long v1) {
            this.a = v;
            this.b = v1;
        }
    }

    public interface PlayerEmsgCallback {
        void a(long arg1);

        void b();
    }

    public final class PlayerTrackEmsgHandler implements TrackOutput {
        private final SampleQueue d;
        private final FormatHolder e;
        private final MetadataInputBuffer f;
        private long g;
        final PlayerEmsgHandler h;

        PlayerTrackEmsgHandler(Allocator allocator0) {
            this.d = SampleQueue.m(allocator0);
            this.e = new FormatHolder();
            this.f = new MetadataInputBuffer();
            this.g = 0x8000000000000001L;
        }

        @Override  // androidx.media3.extractor.TrackOutput
        public void a(ParsableByteArray parsableByteArray0, int v, int v1) {
            this.d.b(parsableByteArray0, v);
        }

        @Override  // androidx.media3.extractor.TrackOutput
        public void b(ParsableByteArray parsableByteArray0, int v) {
            g.b(this, parsableByteArray0, v);
        }

        @Override  // androidx.media3.extractor.TrackOutput
        public int c(DataReader dataReader0, int v, boolean z, int v1) throws IOException {
            return this.d.e(dataReader0, v, z);
        }

        @Override  // androidx.media3.extractor.TrackOutput
        public void d(Format format0) {
            this.d.d(format0);
        }

        @Override  // androidx.media3.extractor.TrackOutput
        public int e(DataReader dataReader0, int v, boolean z) {
            return g.a(this, dataReader0, v, z);
        }

        @Override  // androidx.media3.extractor.TrackOutput
        public void f(long v, int v1, int v2, int v3, @Nullable CryptoData trackOutput$CryptoData0) {
            this.d.f(v, v1, v2, v3, trackOutput$CryptoData0);
            this.l();
        }

        @Nullable
        private MetadataInputBuffer g() {
            this.f.f();
            if(this.d.V(this.e, this.f, 0, false) == -4) {
                this.f.s();
                return this.f;
            }
            return null;
        }

        public boolean h(long v) {
            return PlayerEmsgHandler.this.j(v);
        }

        public void i(Chunk chunk0) {
            if(this.g == 0x8000000000000001L || chunk0.h > this.g) {
                this.g = chunk0.h;
            }
            PlayerEmsgHandler.this.m(chunk0);
        }

        public boolean j(Chunk chunk0) {
            return this.g == 0x8000000000000001L || this.g >= chunk0.g ? PlayerEmsgHandler.this.n(false) : PlayerEmsgHandler.this.n(true);
        }

        private void k(long v, long v1) {
            ManifestExpiryEventInfo playerEmsgHandler$ManifestExpiryEventInfo0 = new ManifestExpiryEventInfo(v, v1);
            PlayerEmsgHandler.this.d.sendMessage(PlayerEmsgHandler.this.d.obtainMessage(1, playerEmsgHandler$ManifestExpiryEventInfo0));
        }

        private void l() {
            while(this.d.N(false)) {
                MetadataInputBuffer metadataInputBuffer0 = this.g();
                if(metadataInputBuffer0 != null) {
                    long v = metadataInputBuffer0.f;
                    Metadata metadata0 = PlayerEmsgHandler.this.c.a(metadataInputBuffer0);
                    if(metadata0 != null) {
                        EventMessage eventMessage0 = (EventMessage)metadata0.e(0);
                        if(PlayerEmsgHandler.h(eventMessage0.a, eventMessage0.b)) {
                            this.m(v, eventMessage0);
                        }
                    }
                }
            }
            this.d.t();
        }

        private void m(long v, EventMessage eventMessage0) {
            long v1 = PlayerEmsgHandler.f(eventMessage0);
            if(v1 == 0x8000000000000001L) {
                return;
            }
            this.k(v, v1);
        }

        public void n() {
            this.d.W();
        }
    }

    private final Allocator a;
    private final PlayerEmsgCallback b;
    private final EventMessageDecoder c;
    private final Handler d;
    private final TreeMap e;
    private DashManifest f;
    private long g;
    private boolean h;
    private boolean i;
    private boolean j;
    private static final int k = 1;

    public PlayerEmsgHandler(DashManifest dashManifest0, PlayerEmsgCallback playerEmsgHandler$PlayerEmsgCallback0, Allocator allocator0) {
        this.f = dashManifest0;
        this.b = playerEmsgHandler$PlayerEmsgCallback0;
        this.a = allocator0;
        this.e = new TreeMap();
        this.d = Util.I(this);
        this.c = new EventMessageDecoder();
    }

    @Nullable
    private Map.Entry e(long v) {
        return this.e.ceilingEntry(v);
    }

    private static long f(EventMessage eventMessage0) {
        try {
            return Util.O1(Util.T(eventMessage0.e));
        }
        catch(ParserException unused_ex) {
            return 0x8000000000000001L;
        }
    }

    private void g(long v, long v1) {
        Long long0 = (Long)this.e.get(v1);
        if(long0 == null) {
            this.e.put(v1, v);
            return;
        }
        if(((long)long0) > v) {
            this.e.put(v1, v);
        }
    }

    // 去混淆评级： 低(40)
    private static boolean h(String s, String s1) {
        return "urn:mpeg:dash:event:2012".equals(s) && ("1".equals(s1) || "2".equals(s1) || "3".equals(s1));
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(Message message0) {
        if(this.j) {
            return true;
        }
        if(message0.what != 1) {
            return false;
        }
        this.g(((ManifestExpiryEventInfo)message0.obj).a, ((ManifestExpiryEventInfo)message0.obj).b);
        return true;
    }

    private void i() {
        if(!this.h) {
            return;
        }
        this.i = true;
        this.h = false;
        this.b.b();
    }

    boolean j(long v) {
        DashManifest dashManifest0 = this.f;
        boolean z = false;
        if(!dashManifest0.d) {
            return false;
        }
        if(this.i) {
            return true;
        }
        Map.Entry map$Entry0 = this.e(dashManifest0.h);
        if(map$Entry0 != null && ((long)(((Long)map$Entry0.getValue()))) < v) {
            this.g = (long)(((Long)map$Entry0.getKey()));
            this.l();
            z = true;
        }
        if(z) {
            this.i();
        }
        return z;
    }

    public PlayerTrackEmsgHandler k() {
        return new PlayerTrackEmsgHandler(this, this.a);
    }

    private void l() {
        this.b.a(this.g);
    }

    void m(Chunk chunk0) {
        this.h = true;
    }

    boolean n(boolean z) {
        if(!this.f.d) {
            return false;
        }
        if(this.i) {
            return true;
        }
        if(z) {
            this.i();
            return true;
        }
        return false;
    }

    public void o() {
        this.j = true;
        this.d.removeCallbacksAndMessages(null);
    }

    private void p() {
        Iterator iterator0 = this.e.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((long)(((Long)((Map.Entry)object0).getKey()))) < this.f.h) {
                iterator0.remove();
            }
        }
    }

    public void q(DashManifest dashManifest0) {
        this.i = false;
        this.g = 0x8000000000000001L;
        this.f = dashManifest0;
        this.p();
    }
}

