package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = null;
    public final String b;
    public final String c;
    public final String d;
    public static final String e = "COMM";

    static {
        CommentFrame.CREATOR = new Parcelable.Creator() {
            public CommentFrame a(Parcel parcel0) {
                return new CommentFrame(parcel0);
            }

            public CommentFrame[] b(int v) {
                return new CommentFrame[v];
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

    CommentFrame(Parcel parcel0) {
        super("COMM");
        this.b = (String)Util.o(parcel0.readString());
        this.c = (String)Util.o(parcel0.readString());
        this.d = (String)Util.o(parcel0.readString());
    }

    public CommentFrame(String s, String s1, String s2) {
        super("COMM");
        this.b = s;
        this.c = s1;
        this.d = s2;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return CommentFrame.class == class0 && (Util.g(this.c, ((CommentFrame)object0).c) && Util.g(this.b, ((CommentFrame)object0).b) && Util.g(this.d, ((CommentFrame)object0).d));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.b == null ? 0 : this.b.hashCode();
        int v2 = this.c == null ? 0 : this.c.hashCode();
        String s = this.d;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 + 0x20F) * 0x1F + v2) * 0x1F + v;
    }

    @Override  // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.d);
    }
}

