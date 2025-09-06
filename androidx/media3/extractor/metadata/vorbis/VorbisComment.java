package androidx.media3.extractor.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class VorbisComment extends androidx.media3.extractor.metadata.flac.VorbisComment {
    public static final Parcelable.Creator CREATOR;

    static {
        VorbisComment.CREATOR = new Parcelable.Creator() {
            public VorbisComment a(Parcel parcel0) {
                return new VorbisComment(parcel0);
            }

            public VorbisComment[] b(int v) {
                return new VorbisComment[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        };
    }

    VorbisComment(Parcel parcel0) {
        super(parcel0);
    }

    public VorbisComment(String s, String s1) {
        super(s, s1);
    }
}

