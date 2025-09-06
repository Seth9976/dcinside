package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import java.nio.ByteBuffer;

@UnstableApi
public final class SpliceInfoDecoder extends SimpleMetadataDecoder {
    private final ParsableByteArray a;
    private final ParsableBitArray b;
    private TimestampAdjuster c;
    private static final int d = 0;
    private static final int e = 4;
    private static final int f = 5;
    private static final int g = 6;
    private static final int h = 0xFF;

    public SpliceInfoDecoder() {
        this.a = new ParsableByteArray();
        this.b = new ParsableBitArray();
    }

    @Override  // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    protected Metadata b(MetadataInputBuffer metadataInputBuffer0, ByteBuffer byteBuffer0) {
        SpliceNullCommand spliceNullCommand0;
        if(this.c == null || metadataInputBuffer0.m != this.c.f()) {
            TimestampAdjuster timestampAdjuster0 = new TimestampAdjuster(metadataInputBuffer0.f);
            this.c = timestampAdjuster0;
            timestampAdjuster0.a(metadataInputBuffer0.f - metadataInputBuffer0.m);
        }
        byte[] arr_b = byteBuffer0.array();
        int v = byteBuffer0.limit();
        this.a.W(arr_b, v);
        this.b.p(arr_b, v);
        this.b.s(39);
        long v1 = ((long)this.b.h(1)) << 0x20 | ((long)this.b.h(0x20));
        this.b.s(20);
        int v2 = this.b.h(12);
        int v3 = this.b.h(8);
        this.a.Z(14);
        switch(v3) {
            case 0: {
                spliceNullCommand0 = new SpliceNullCommand();
                return spliceNullCommand0 == null ? new Metadata(new Entry[0]) : new Metadata(new Entry[]{spliceNullCommand0});
            }
            case 4: {
                spliceNullCommand0 = SpliceScheduleCommand.a(this.a);
                return spliceNullCommand0 == null ? new Metadata(new Entry[0]) : new Metadata(new Entry[]{spliceNullCommand0});
            }
            case 5: {
                spliceNullCommand0 = SpliceInsertCommand.a(this.a, v1, this.c);
                return spliceNullCommand0 == null ? new Metadata(new Entry[0]) : new Metadata(new Entry[]{spliceNullCommand0});
            }
            case 6: {
                spliceNullCommand0 = TimeSignalCommand.a(this.a, v1, this.c);
                return spliceNullCommand0 == null ? new Metadata(new Entry[0]) : new Metadata(new Entry[]{spliceNullCommand0});
            }
            case 0xFF: {
                spliceNullCommand0 = PrivateCommand.a(this.a, v2, v1);
                return spliceNullCommand0 == null ? new Metadata(new Entry[0]) : new Metadata(new Entry[]{spliceNullCommand0});
            }
            default: {
                return new Metadata(new Entry[0]);
            }
        }
    }
}

