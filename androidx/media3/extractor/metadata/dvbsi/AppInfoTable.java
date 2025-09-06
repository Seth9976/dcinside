package androidx.media3.extractor.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class AppInfoTable implements Entry {
    public static final Parcelable.Creator CREATOR = null;
    public final int a;
    public final String b;
    public static final int c = 1;
    public static final int d = 2;

    static {
        AppInfoTable.CREATOR = new Parcelable.Creator() {
            public AppInfoTable a(Parcel parcel0) {
                String s = (String)Assertions.g(parcel0.readString());
                return new AppInfoTable(parcel0.readInt(), s);
            }

            public AppInfoTable[] b(int v) {
                return new AppInfoTable[v];
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

    public AppInfoTable(int v, String s) {
        this.a = v;
        this.b = s;
    }

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
        return "Ait(controlCode=" + this.a + ",url=" + this.b + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.b);
        parcel0.writeInt(this.a);
    }
}

