package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = null;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    private final Id3Frame[] g;
    public static final String h = "CHAP";

    static {
        ChapterFrame.CREATOR = new Parcelable.Creator() {
            public ChapterFrame a(Parcel parcel0) {
                return new ChapterFrame(parcel0);
            }

            public ChapterFrame[] b(int v) {
                return new ChapterFrame[v];
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

    ChapterFrame(Parcel parcel0) {
        super("CHAP");
        this.b = (String)Util.o(parcel0.readString());
        this.c = parcel0.readInt();
        this.d = parcel0.readInt();
        this.e = parcel0.readLong();
        this.f = parcel0.readLong();
        int v = parcel0.readInt();
        this.g = new Id3Frame[v];
        for(int v1 = 0; v1 < v; ++v1) {
            this.g[v1] = (Id3Frame)parcel0.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String s, int v, int v1, long v2, long v3, Id3Frame[] arr_id3Frame) {
        super("CHAP");
        this.b = s;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = v3;
        this.g = arr_id3Frame;
    }

    public Id3Frame a(int v) {
        return this.g[v];
    }

    public int c() {
        return this.g.length;
    }

    @Override  // androidx.media3.extractor.metadata.id3.Id3Frame
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return ChapterFrame.class == class0 && (this.c == ((ChapterFrame)object0).c && this.d == ((ChapterFrame)object0).d && this.e == ((ChapterFrame)object0).e && this.f == ((ChapterFrame)object0).f && Util.g(this.b, ((ChapterFrame)object0).b) && Arrays.equals(this.g, ((ChapterFrame)object0).g));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = ((((this.c + 0x20F) * 0x1F + this.d) * 0x1F + ((int)this.e)) * 0x1F + ((int)this.f)) * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeInt(this.d);
        parcel0.writeLong(this.e);
        parcel0.writeLong(this.f);
        parcel0.writeInt(this.g.length);
        Id3Frame[] arr_id3Frame = this.g;
        for(int v1 = 0; v1 < arr_id3Frame.length; ++v1) {
            parcel0.writeParcelable(arr_id3Frame[v1], 0);
        }
    }
}

