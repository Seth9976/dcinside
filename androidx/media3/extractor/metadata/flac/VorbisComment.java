package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.c;

@UnstableApi
@Deprecated
public class VorbisComment implements Entry {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;

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

    protected VorbisComment(Parcel parcel0) {
        this.a = (String)Util.o(parcel0.readString());
        this.b = (String)Util.o(parcel0.readString());
    }

    public VorbisComment(String s, String s1) {
        this.a = c.j(s);
        this.b = s1;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public byte[] E0() {
        return null;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && (this.a.equals(((VorbisComment)object0).a) && this.b.equals(((VorbisComment)object0).b));
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public Format h1() {
        return null;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() + 0x20F) * 0x1F + this.b.hashCode();
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(Builder mediaMetadata$Builder0) {
        this.a.hashCode();
        switch(this.a) {
            case "ALBUM": {
                mediaMetadata$Builder0.O(this.b);
                return;
            }
            case "ALBUMARTIST": {
                mediaMetadata$Builder0.N(this.b);
                return;
            }
            case "ARTIST": {
                mediaMetadata$Builder0.P(this.b);
                return;
            }
            case "DESCRIPTION": {
                mediaMetadata$Builder0.W(this.b);
                return;
            }
            case "TITLE": {
                mediaMetadata$Builder0.p0(this.b);
            }
        }
    }

    @Override
    public String toString() {
        return "VC: " + this.a + "=" + this.b;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
    }
}

