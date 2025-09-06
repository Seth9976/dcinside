package com.dcinside.app.mod;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public class DirectoryChooserConfig implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public DirectoryChooserConfig a(Parcel parcel0) {
            return new DirectoryChooserConfig(parcel0);
        }

        public DirectoryChooserConfig[] b(int v) {
            return new DirectoryChooserConfig[v];
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

    public static class b {
        private String a;
        private String b;
        private boolean c;

        public b a(boolean z) {
            this.c = z;
            return this;
        }

        public DirectoryChooserConfig b() {
            DirectoryChooserConfig directoryChooserConfig0 = new DirectoryChooserConfig();
            directoryChooserConfig0.a = this.a;
            directoryChooserConfig0.b = this.b;
            directoryChooserConfig0.c = this.c;
            return directoryChooserConfig0;
        }

        public b c(String s) {
            this.b = s;
            return this;
        }

        public b d(String s) {
            this.a = s;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private String a;
    private String b;
    private boolean c;

    static {
        DirectoryChooserConfig.CREATOR = new a();
    }

    public DirectoryChooserConfig() {
    }

    protected DirectoryChooserConfig(Parcel parcel0) {
        this.a = parcel0.readString();
        this.b = parcel0.readString();
        this.c = parcel0.readByte() != 0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.c;
    }

    public static b f() {
        return new b().c("").a(false);
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeByte(((byte)this.c));
    }
}

