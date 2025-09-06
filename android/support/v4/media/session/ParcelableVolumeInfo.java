package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public ParcelableVolumeInfo a(Parcel parcel0) {
            return new ParcelableVolumeInfo(parcel0);
        }

        public ParcelableVolumeInfo[] b(int v) {
            return new ParcelableVolumeInfo[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ParcelableVolumeInfo.CREATOR = new a();
    }

    public ParcelableVolumeInfo(int v, int v1, int v2, int v3, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    public ParcelableVolumeInfo(Parcel parcel0) {
        this.a = parcel0.readInt();
        this.c = parcel0.readInt();
        this.d = parcel0.readInt();
        this.e = parcel0.readInt();
        this.b = parcel0.readInt();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
        parcel0.writeInt(this.c);
        parcel0.writeInt(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeInt(this.b);
    }
}

