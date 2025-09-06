package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR;
    @Nullable
    public final String b;
    public final String c;

    static {
        UrlLinkFrame.CREATOR = new Parcelable.Creator() {
            public UrlLinkFrame a(Parcel parcel0) {
                return new UrlLinkFrame(parcel0);
            }

            public UrlLinkFrame[] b(int v) {
                return new UrlLinkFrame[v];
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

    UrlLinkFrame(Parcel parcel0) {
        super(((String)Util.o(parcel0.readString())));
        this.b = parcel0.readString();
        this.c = (String)Util.o(parcel0.readString());
    }

    public UrlLinkFrame(String s, @Nullable String s1, String s2) {
        super(s);
        this.b = s1;
        this.c = s2;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return UrlLinkFrame.class == class0 && (this.a.equals(((UrlLinkFrame)object0).a) && Util.g(this.b, ((UrlLinkFrame)object0).b) && Util.g(this.c, ((UrlLinkFrame)object0).c));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v + 0x20F) * 0x1F + v2) * 0x1F + v1;
    }

    @Override  // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.a + ": url=" + this.c;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
    }
}

