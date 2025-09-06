package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;

@UnstableApi
public final class SectionReader implements TsPayloadReader {
    private final SectionPayloadReader d;
    private final ParsableByteArray e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private static final int j = 3;
    private static final int k = 0x20;
    private static final int l = 0x1002;

    public SectionReader(SectionPayloadReader sectionPayloadReader0) {
        this.d = sectionPayloadReader0;
        this.e = new ParsableByteArray(0x20);
    }

    @Override  // androidx.media3.extractor.ts.TsPayloadReader
    public void a(ParsableByteArray parsableByteArray0, int v) {
        boolean z = (v & 1) != 0;
        int v1 = z ? parsableByteArray0.f() + parsableByteArray0.L() : -1;
        if(this.i) {
            if(!z) {
                return;
            }
            this.i = false;
            parsableByteArray0.Y(v1);
            this.g = 0;
        }
        while(parsableByteArray0.a() > 0) {
            int v2 = this.g;
            if(v2 < 3) {
                if(v2 == 0) {
                    int v3 = parsableByteArray0.L();
                    parsableByteArray0.Y(parsableByteArray0.f() - 1);
                    if(v3 == 0xFF) {
                        this.i = true;
                        return;
                    }
                }
                int v4 = Math.min(parsableByteArray0.a(), 3 - this.g);
                parsableByteArray0.n(this.e.e(), this.g, v4);
                int v5 = this.g + v4;
                this.g = v5;
                if(v5 != 3) {
                    continue;
                }
                this.e.Y(0);
                this.e.X(3);
                this.e.Z(1);
                int v6 = this.e.L();
                int v7 = this.e.L();
                this.h = (v6 & 0x80) != 0;
                this.f = ((v6 & 15) << 8 | v7) + 3;
                int v8 = this.f;
                if(this.e.b() >= v8) {
                    continue;
                }
                this.e.c(Math.min(0x1002, Math.max(v8, this.e.b() * 2)));
            }
            else {
                int v9 = Math.min(parsableByteArray0.a(), this.f - this.g);
                parsableByteArray0.n(this.e.e(), this.g, v9);
                int v10 = this.g + v9;
                this.g = v10;
                int v11 = this.f;
                if(v10 == v11) {
                    if(this.h) {
                        if(Util.E(this.e.e(), 0, this.f, -1) != 0) {
                            this.i = true;
                            return;
                        }
                        this.e.X(this.f - 4);
                    }
                    else {
                        this.e.X(v11);
                    }
                    this.e.Y(0);
                    this.d.a(this.e);
                    this.g = 0;
                }
            }
        }
    }

    @Override  // androidx.media3.extractor.ts.TsPayloadReader
    public void b() {
        this.i = true;
    }

    @Override  // androidx.media3.extractor.ts.TsPayloadReader
    public void c(TimestampAdjuster timestampAdjuster0, ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        this.d.c(timestampAdjuster0, extractorOutput0, tsPayloadReader$TrackIdGenerator0);
        this.i = true;
    }
}

