package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription.Builder;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public MediaDescriptionCompat a(Parcel parcel0) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel0));
        }

        public MediaDescriptionCompat[] b(int v) {
            return new MediaDescriptionCompat[v];
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

    @RequiresApi(21)
    static class b {
        @DoNotInline
        static MediaDescription a(MediaDescription.Builder mediaDescription$Builder0) {
            return mediaDescription$Builder0.build();
        }

        @DoNotInline
        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        @DoNotInline
        @Nullable
        static CharSequence c(MediaDescription mediaDescription0) {
            return mediaDescription0.getDescription();
        }

        @DoNotInline
        @Nullable
        static Bundle d(MediaDescription mediaDescription0) {
            return mediaDescription0.getExtras();
        }

        @DoNotInline
        @Nullable
        static Bitmap e(MediaDescription mediaDescription0) {
            return mediaDescription0.getIconBitmap();
        }

        @DoNotInline
        @Nullable
        static Uri f(MediaDescription mediaDescription0) {
            return mediaDescription0.getIconUri();
        }

        @DoNotInline
        @Nullable
        static String g(MediaDescription mediaDescription0) {
            return mediaDescription0.getMediaId();
        }

        @DoNotInline
        @Nullable
        static CharSequence h(MediaDescription mediaDescription0) {
            return mediaDescription0.getSubtitle();
        }

        @DoNotInline
        @Nullable
        static CharSequence i(MediaDescription mediaDescription0) {
            return mediaDescription0.getTitle();
        }

        @DoNotInline
        static void j(MediaDescription.Builder mediaDescription$Builder0, @Nullable CharSequence charSequence0) {
            mediaDescription$Builder0.setDescription(charSequence0);
        }

        @DoNotInline
        static void k(MediaDescription.Builder mediaDescription$Builder0, @Nullable Bundle bundle0) {
            mediaDescription$Builder0.setExtras(bundle0);
        }

        @DoNotInline
        static void l(MediaDescription.Builder mediaDescription$Builder0, @Nullable Bitmap bitmap0) {
            mediaDescription$Builder0.setIconBitmap(bitmap0);
        }

        @DoNotInline
        static void m(MediaDescription.Builder mediaDescription$Builder0, @Nullable Uri uri0) {
            mediaDescription$Builder0.setIconUri(uri0);
        }

        @DoNotInline
        static void n(MediaDescription.Builder mediaDescription$Builder0, @Nullable String s) {
            mediaDescription$Builder0.setMediaId(s);
        }

        @DoNotInline
        static void o(MediaDescription.Builder mediaDescription$Builder0, @Nullable CharSequence charSequence0) {
            mediaDescription$Builder0.setSubtitle(charSequence0);
        }

        @DoNotInline
        static void p(MediaDescription.Builder mediaDescription$Builder0, @Nullable CharSequence charSequence0) {
            mediaDescription$Builder0.setTitle(charSequence0);
        }
    }

    @RequiresApi(23)
    static class c {
        @DoNotInline
        @Nullable
        static Uri a(MediaDescription mediaDescription0) {
            return mediaDescription0.getMediaUri();
        }

        @DoNotInline
        static void b(MediaDescription.Builder mediaDescription$Builder0, @Nullable Uri uri0) {
            mediaDescription$Builder0.setMediaUri(uri0);
        }
    }

    public static final class d {
        private String a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private Bitmap e;
        private Uri f;
        private Bundle g;
        private Uri h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public d b(@Nullable CharSequence charSequence0) {
            this.d = charSequence0;
            return this;
        }

        public d c(@Nullable Bundle bundle0) {
            this.g = bundle0;
            return this;
        }

        public d d(@Nullable Bitmap bitmap0) {
            this.e = bitmap0;
            return this;
        }

        public d e(@Nullable Uri uri0) {
            this.f = uri0;
            return this;
        }

        public d f(@Nullable String s) {
            this.a = s;
            return this;
        }

        public d g(@Nullable Uri uri0) {
            this.h = uri0;
            return this;
        }

        public d h(@Nullable CharSequence charSequence0) {
            this.c = charSequence0;
            return this;
        }

        public d i(@Nullable CharSequence charSequence0) {
            this.b = charSequence0;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR = null;
    private final String a;
    private final CharSequence b;
    private final CharSequence c;
    private final CharSequence d;
    private final Bitmap e;
    private final Uri f;
    private final Bundle g;
    private final Uri h;
    private MediaDescription i;
    private static final String j = "MediaDescriptionCompat";
    public static final String k = "android.media.extra.BT_FOLDER_TYPE";
    public static final long l = 0L;
    public static final long m = 1L;
    public static final long n = 2L;
    public static final long o = 3L;
    public static final long p = 4L;
    public static final long q = 5L;
    public static final long r = 6L;
    public static final String s = "android.media.extra.DOWNLOAD_STATUS";
    public static final long t = 0L;
    public static final long u = 1L;
    public static final long v = 2L;
    @RestrictTo({Scope.a})
    public static final String w = "android.support.v4.media.description.MEDIA_URI";
    @RestrictTo({Scope.a})
    public static final String x = "android.support.v4.media.description.NULL_BUNDLE_FLAG";

    static {
        MediaDescriptionCompat.CREATOR = new a();
    }

    MediaDescriptionCompat(Parcel parcel0) {
        this.a = parcel0.readString();
        Parcelable.Creator parcelable$Creator0 = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.b = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
        this.c = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
        this.d = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
        ClassLoader classLoader0 = MediaDescriptionCompat.class.getClassLoader();
        this.e = (Bitmap)parcel0.readParcelable(classLoader0);
        this.f = (Uri)parcel0.readParcelable(classLoader0);
        this.g = parcel0.readBundle(classLoader0);
        this.h = (Uri)parcel0.readParcelable(classLoader0);
    }

    MediaDescriptionCompat(String s, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, Bitmap bitmap0, Uri uri0, Bundle bundle0, Uri uri1) {
        this.a = s;
        this.b = charSequence0;
        this.c = charSequence1;
        this.d = charSequence2;
        this.e = bitmap0;
        this.f = uri0;
        this.g = bundle0;
        this.h = uri1;
    }

    public static MediaDescriptionCompat a(Object object0) {
        MediaDescriptionCompat mediaDescriptionCompat0 = null;
        if(object0 != null) {
            int v = Build.VERSION.SDK_INT;
            d mediaDescriptionCompat$d0 = new d();
            mediaDescriptionCompat$d0.f(b.g(((MediaDescription)object0)));
            mediaDescriptionCompat$d0.i(b.i(((MediaDescription)object0)));
            mediaDescriptionCompat$d0.h(b.h(((MediaDescription)object0)));
            mediaDescriptionCompat$d0.b(b.c(((MediaDescription)object0)));
            mediaDescriptionCompat$d0.d(b.e(((MediaDescription)object0)));
            mediaDescriptionCompat$d0.e(b.f(((MediaDescription)object0)));
            Bundle bundle0 = b.d(((MediaDescription)object0));
            if(bundle0 != null) {
                bundle0 = MediaSessionCompat.G(bundle0);
            }
            Uri uri0 = bundle0 == null ? null : ((Uri)bundle0.getParcelable("android.support.v4.media.description.MEDIA_URI"));
            if(uri0 == null) {
                mediaDescriptionCompat0 = bundle0;
            }
            else if(!bundle0.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundle0.size() != 2) {
                bundle0.remove("android.support.v4.media.description.MEDIA_URI");
                bundle0.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                mediaDescriptionCompat0 = bundle0;
            }
            mediaDescriptionCompat$d0.c(((Bundle)mediaDescriptionCompat0));
            if(uri0 != null) {
                mediaDescriptionCompat$d0.g(uri0);
            }
            else if(v >= 23) {
                mediaDescriptionCompat$d0.g(c.a(((MediaDescription)object0)));
            }
            mediaDescriptionCompat0 = mediaDescriptionCompat$d0.a();
            mediaDescriptionCompat0.i = (MediaDescription)object0;
        }
        return mediaDescriptionCompat0;
    }

    @Nullable
    public CharSequence c() {
        return this.d;
    }

    @Nullable
    public Bundle d() {
        return this.g;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public Bitmap e() {
        return this.e;
    }

    @Nullable
    public Uri f() {
        return this.f;
    }

    public Object g() {
        Bundle bundle0;
        MediaDescription mediaDescription0 = this.i;
        if(mediaDescription0 == null) {
            int v = Build.VERSION.SDK_INT;
            MediaDescription.Builder mediaDescription$Builder0 = b.b();
            b.n(mediaDescription$Builder0, this.a);
            b.p(mediaDescription$Builder0, this.b);
            b.o(mediaDescription$Builder0, this.c);
            b.j(mediaDescription$Builder0, this.d);
            b.l(mediaDescription$Builder0, this.e);
            b.m(mediaDescription$Builder0, this.f);
            if(v >= 23 || this.h == null) {
                b.k(mediaDescription$Builder0, this.g);
            }
            else {
                if(this.g == null) {
                    bundle0 = new Bundle();
                    bundle0.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                else {
                    bundle0 = new Bundle(this.g);
                }
                bundle0.putParcelable("android.support.v4.media.description.MEDIA_URI", this.h);
                b.k(mediaDescription$Builder0, bundle0);
            }
            if(v >= 23) {
                c.b(mediaDescription$Builder0, this.h);
            }
            mediaDescription0 = b.a(mediaDescription$Builder0);
            this.i = mediaDescription0;
        }
        return mediaDescription0;
    }

    @Nullable
    public String h() {
        return this.a;
    }

    @Nullable
    public Uri i() {
        return this.h;
    }

    @Nullable
    public CharSequence l() {
        return this.c;
    }

    @Nullable
    public CharSequence m() {
        return this.b;
    }

    @Override
    public String toString() {
        return this.b + ", " + this.c + ", " + this.d;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        ((MediaDescription)this.g()).writeToParcel(parcel0, v);
    }
}

