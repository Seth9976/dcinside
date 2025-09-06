package androidx.media3.extractor.metadata.dvbsi;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.common.base.f;
import java.nio.ByteBuffer;
import java.util.ArrayList;

@UnstableApi
public final class AppInfoTableDecoder extends SimpleMetadataDecoder {
    private static final int a = 2;
    private static final int b = 21;
    private static final int c = 3;
    public static final int d = 0x74;

    @Override  // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    @Nullable
    protected Metadata b(MetadataInputBuffer metadataInputBuffer0, ByteBuffer byteBuffer0) {
        return byteBuffer0.get() == 0x74 ? AppInfoTableDecoder.c(new ParsableBitArray(byteBuffer0.array(), byteBuffer0.limit())) : null;
    }

    @Nullable
    private static Metadata c(ParsableBitArray parsableBitArray0) {
        parsableBitArray0.s(12);
        int v = parsableBitArray0.h(12);
        int v1 = parsableBitArray0.d();
        parsableBitArray0.s(44);
        parsableBitArray0.t(parsableBitArray0.h(12));
        parsableBitArray0.s(16);
        ArrayList arrayList0 = new ArrayList();
        while(true) {
            Metadata metadata0 = null;
            if(parsableBitArray0.d() >= v1 + v - 4) {
                break;
            }
            parsableBitArray0.s(0x30);
            int v2 = parsableBitArray0.h(8);
            parsableBitArray0.s(4);
            int v3 = parsableBitArray0.h(12);
            int v4 = parsableBitArray0.d() + v3;
            String s = null;
            while(parsableBitArray0.d() < v4) {
                int v5 = parsableBitArray0.h(8);
                int v6 = parsableBitArray0.h(8);
                int v7 = parsableBitArray0.d() + v6;
                if(v5 == 2) {
                    int v8 = parsableBitArray0.h(16);
                    parsableBitArray0.s(8);
                    if(v8 == 3) {
                        while(parsableBitArray0.d() < v7) {
                            metadata0 = parsableBitArray0.m(parsableBitArray0.h(8), f.a);
                            int v9 = parsableBitArray0.h(8);
                            for(int v10 = 0; v10 < v9; ++v10) {
                                parsableBitArray0.t(parsableBitArray0.h(8));
                            }
                        }
                    }
                }
                else if(v5 == 21) {
                    s = parsableBitArray0.m(v6, f.a);
                }
                parsableBitArray0.q(v7 * 8);
            }
            parsableBitArray0.q(v4 * 8);
            if(metadata0 != null && s != null) {
                arrayList0.add(new AppInfoTable(v2, ((String)metadata0) + s));
            }
        }
        return arrayList0.isEmpty() ? null : new Metadata(arrayList0);
    }
}

