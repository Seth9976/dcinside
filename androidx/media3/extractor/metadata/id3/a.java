package androidx.media3.extractor.metadata.id3;

public final class a implements FramePredicate {
    @Override  // androidx.media3.extractor.metadata.id3.Id3Decoder$FramePredicate
    public final boolean a(int v, int v1, int v2, int v3, int v4) {
        return Id3Decoder.c(v, v1, v2, v3, v4);
    }
}

