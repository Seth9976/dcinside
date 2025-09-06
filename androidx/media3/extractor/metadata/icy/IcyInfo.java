package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

@UnstableApi
public final class IcyInfo implements Entry {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    @Nullable
    public final String b;
    @Nullable
    public final String c;

    static {
        IcyInfo.CREATOR = new Parcelable.Creator() {
            public IcyInfo a(Parcel parcel0) {
                return new IcyInfo(parcel0);
            }

            public IcyInfo[] b(int v) {
                return new IcyInfo[v];
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

    IcyInfo(Parcel parcel0) {
        this.a = (byte[])Assertions.g(parcel0.createByteArray());
        this.b = parcel0.readString();
        this.c = parcel0.readString();
    }

    public IcyInfo(byte[] arr_b, @Nullable String s, @Nullable String s1) {
        this.a = arr_b;
        this.b = s;
        this.c = s1;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public byte[] E0() {
        return null;
    }

    @Override  // android.os.Parcelable
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
            return IcyInfo.class == class0 ? Arrays.equals(this.a, ((IcyInfo)object0).a) : false;
        }
        return false;
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public Format h1() {
        return null;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override  // androidx.media3.common.Metadata$Entry
    public void r3(Builder mediaMetadata$Builder0) {
        String s = this.b;
        if(s != null) {
            mediaMetadata$Builder0.p0(s);
        }
    }

    @Override
    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.b, this.c, ((int)this.a.length));
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeByteArray(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
    }
}

