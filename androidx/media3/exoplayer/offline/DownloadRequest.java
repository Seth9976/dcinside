package androidx.media3.exoplayer.offline;

import O1.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O2;
import j..util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@UnstableApi
public final class DownloadRequest implements Parcelable {
    public static class Builder {
        private final String a;
        private final Uri b;
        @Nullable
        private String c;
        @Nullable
        private List d;
        @Nullable
        private byte[] e;
        @Nullable
        private String f;
        @Nullable
        private byte[] g;

        public Builder(String s, Uri uri0) {
            this.a = s;
            this.b = uri0;
        }

        public DownloadRequest a() {
            String s = this.c;
            List list0 = this.d;
            return list0 == null ? new DownloadRequest(this.a, this.b, s, O2.A(), this.e, this.f, this.g, null) : new DownloadRequest(this.a, this.b, s, list0, this.e, this.f, this.g, null);
        }

        @a
        public Builder b(@Nullable String s) {
            this.f = s;
            return this;
        }

        @a
        public Builder c(@Nullable byte[] arr_b) {
            this.g = arr_b;
            return this;
        }

        @a
        public Builder d(@Nullable byte[] arr_b) {
            this.e = arr_b;
            return this;
        }

        @a
        public Builder e(@Nullable String s) {
            this.c = MimeTypes.v(s);
            return this;
        }

        @a
        public Builder f(@Nullable List list0) {
            this.d = list0;
            return this;
        }
    }

    public static class UnsupportedRequestException extends IOException {
    }

    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final Uri b;
    @Nullable
    public final String c;
    public final List d;
    @Nullable
    public final byte[] e;
    @Nullable
    public final String f;
    public final byte[] g;

    static {
        DownloadRequest.CREATOR = new Parcelable.Creator() {
            public DownloadRequest a(Parcel parcel0) {
                return new DownloadRequest(parcel0);
            }

            public DownloadRequest[] b(int v) {
                return new DownloadRequest[v];
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

    DownloadRequest(Parcel parcel0) {
        this.a = (String)Util.o(parcel0.readString());
        this.b = Uri.parse(((String)Util.o(parcel0.readString())));
        this.c = parcel0.readString();
        int v = parcel0.readInt();
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(((StreamKey)parcel0.readParcelable(StreamKey.class.getClassLoader())));
        }
        this.d = DesugarCollections.unmodifiableList(arrayList0);
        this.e = parcel0.createByteArray();
        this.f = parcel0.readString();
        this.g = (byte[])Util.o(parcel0.createByteArray());
    }

    private DownloadRequest(String s, Uri uri0, @Nullable String s1, List list0, @Nullable byte[] arr_b, @Nullable String s2, @Nullable byte[] arr_b1) {
        int v = Util.Y0(uri0, s1);
        boolean z = true;
        if(v == 0 || (v == 1 || v == 2)) {
            if(s2 != null) {
                z = false;
            }
            Assertions.b(z, "customCacheKey must be null for type: " + v);
        }
        this.a = s;
        this.b = uri0;
        this.c = s1;
        ArrayList arrayList0 = new ArrayList(list0);
        Collections.sort(arrayList0);
        this.d = DesugarCollections.unmodifiableList(arrayList0);
        this.e = arr_b == null ? null : Arrays.copyOf(arr_b, arr_b.length);
        this.f = s2;
        this.g = arr_b1 == null ? Util.f : Arrays.copyOf(arr_b1, arr_b1.length);
    }

    DownloadRequest(String s, Uri uri0, String s1, List list0, byte[] arr_b, String s2, byte[] arr_b1, androidx.media3.exoplayer.offline.DownloadRequest.1 downloadRequest$10) {
        this(s, uri0, s1, list0, arr_b, s2, arr_b1);
    }

    public DownloadRequest a(String s) {
        return new DownloadRequest(s, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public DownloadRequest c(@Nullable byte[] arr_b) {
        return new DownloadRequest(this.a, this.b, this.c, this.d, arr_b, this.f, this.g);
    }

    public DownloadRequest d(DownloadRequest downloadRequest0) {
        List list0;
        Assertions.a(this.a.equals(downloadRequest0.a));
        if(!this.d.isEmpty() && !downloadRequest0.d.isEmpty()) {
            list0 = new ArrayList(this.d);
            for(int v = 0; v < downloadRequest0.d.size(); ++v) {
                StreamKey streamKey0 = (StreamKey)downloadRequest0.d.get(v);
                if(!list0.contains(streamKey0)) {
                    list0.add(streamKey0);
                }
            }
            return new DownloadRequest(this.a, downloadRequest0.b, downloadRequest0.c, list0, downloadRequest0.e, downloadRequest0.f, downloadRequest0.g);
        }
        list0 = Collections.emptyList();
        return new DownloadRequest(this.a, downloadRequest0.b, downloadRequest0.c, list0, downloadRequest0.e, downloadRequest0.f, downloadRequest0.g);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MediaItem e() {
        return new androidx.media3.common.MediaItem.Builder().E(this.a).M(this.b).l(this.f).G(this.c).I(this.d).a();
    }

    // 去混淆评级： 中等(80)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof DownloadRequest ? this.a.equals(((DownloadRequest)object0).a) && this.b.equals(((DownloadRequest)object0).b) && Util.g(this.c, ((DownloadRequest)object0).c) && this.d.equals(((DownloadRequest)object0).d) && Arrays.equals(this.e, ((DownloadRequest)object0).e) && Util.g(this.f, ((DownloadRequest)object0).f) && Arrays.equals(this.g, ((DownloadRequest)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = 0;
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d.hashCode();
        int v5 = Arrays.hashCode(this.e);
        String s = this.f;
        if(s != null) {
            v2 = s.hashCode();
        }
        return (((((v * 961 + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v2) * 0x1F + Arrays.hashCode(this.g);
    }

    @Override
    public String toString() {
        return this.c + ":" + this.a;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b.toString());
        parcel0.writeString(this.c);
        parcel0.writeInt(this.d.size());
        for(int v1 = 0; v1 < this.d.size(); ++v1) {
            parcel0.writeParcelable(((Parcelable)this.d.get(v1)), 0);
        }
        parcel0.writeByteArray(this.e);
        parcel0.writeString(this.f);
        parcel0.writeByteArray(this.g);
    }
}

