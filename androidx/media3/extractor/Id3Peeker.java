package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import java.io.EOFException;
import java.io.IOException;

@UnstableApi
public final class Id3Peeker {
    private final ParsableByteArray a;

    public Id3Peeker() {
        this.a = new ParsableByteArray(10);
    }

    @Nullable
    public Metadata a(ExtractorInput extractorInput0, @Nullable FramePredicate id3Decoder$FramePredicate0) throws IOException {
        Metadata metadata0 = null;
        int v;
        for(v = 0; true; v += v2) {
            try {
                extractorInput0.k(this.a.e(), 0, 10);
            }
            catch(EOFException unused_ex) {
                break;
            }
            this.a.Y(0);
            if(this.a.O() != 4801587) {
                break;
            }
            this.a.Z(3);
            int v1 = this.a.K();
            int v2 = v1 + 10;
            if(metadata0 == null) {
                byte[] arr_b = new byte[v2];
                System.arraycopy(this.a.e(), 0, arr_b, 0, 10);
                extractorInput0.k(arr_b, 10, v1);
                metadata0 = new Id3Decoder(id3Decoder$FramePredicate0).e(arr_b, v2);
            }
            else {
                extractorInput0.q(v1);
            }
        }
        extractorInput0.o();
        extractorInput0.q(v);
        return metadata0;
    }
}

