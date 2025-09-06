package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public abstract class SpliceCommand implements Entry {
    @Override  // androidx.media3.common.Metadata$Entry
    public byte[] E0() {
        return null;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public Format h1() {
        return null;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(Builder mediaMetadata$Builder0) {
    }

    @Override
    public String toString() {
        return "SCTE-35 splice command: type=" + this.getClass().getSimpleName();
    }
}

