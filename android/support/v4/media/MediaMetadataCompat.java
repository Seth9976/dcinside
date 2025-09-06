package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.util.Set;

@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public MediaMetadataCompat a(Parcel parcel0) {
            return new MediaMetadataCompat(parcel0);
        }

        public MediaMetadataCompat[] b(int v) {
            return new MediaMetadataCompat[v];
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

    public static final class b {
        private final Bundle a;

        public b() {
            this.a = new Bundle();
        }

        public b(MediaMetadataCompat mediaMetadataCompat0) {
            Bundle bundle0 = new Bundle(mediaMetadataCompat0.a);
            this.a = bundle0;
            MediaSessionCompat.b(bundle0);
        }

        @RestrictTo({Scope.a})
        public b(MediaMetadataCompat mediaMetadataCompat0, int v) {
            this(mediaMetadataCompat0);
            for(Object object0: this.a.keySet()) {
                String s = (String)object0;
                Object object1 = this.a.get(s);
                if(object1 instanceof Bitmap && (((Bitmap)object1).getHeight() > v || ((Bitmap)object1).getWidth() > v)) {
                    this.b(s, this.g(((Bitmap)object1), v));
                }
            }
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.a);
        }

        public b b(String s, Bitmap bitmap0) {
            if(MediaMetadataCompat.N.containsKey(s) && ((int)(((Integer)MediaMetadataCompat.N.get(s)))) != 2) {
                throw new IllegalArgumentException("The " + s + " key cannot be used to put a Bitmap");
            }
            this.a.putParcelable(s, bitmap0);
            return this;
        }

        public b c(String s, long v) {
            if(MediaMetadataCompat.N.containsKey(s) && ((int)(((Integer)MediaMetadataCompat.N.get(s)))) != 0) {
                throw new IllegalArgumentException("The " + s + " key cannot be used to put a long");
            }
            this.a.putLong(s, v);
            return this;
        }

        public b d(String s, RatingCompat ratingCompat0) {
            if(MediaMetadataCompat.N.containsKey(s) && ((int)(((Integer)MediaMetadataCompat.N.get(s)))) != 3) {
                throw new IllegalArgumentException("The " + s + " key cannot be used to put a Rating");
            }
            Parcelable parcelable0 = (Parcelable)ratingCompat0.d();
            this.a.putParcelable(s, parcelable0);
            return this;
        }

        public b e(String s, String s1) {
            if(MediaMetadataCompat.N.containsKey(s) && ((int)(((Integer)MediaMetadataCompat.N.get(s)))) != 1) {
                throw new IllegalArgumentException("The " + s + " key cannot be used to put a String");
            }
            this.a.putCharSequence(s, s1);
            return this;
        }

        public b f(String s, CharSequence charSequence0) {
            if(MediaMetadataCompat.N.containsKey(s) && ((int)(((Integer)MediaMetadataCompat.N.get(s)))) != 1) {
                throw new IllegalArgumentException("The " + s + " key cannot be used to put a CharSequence");
            }
            this.a.putCharSequence(s, charSequence0);
            return this;
        }

        private Bitmap g(Bitmap bitmap0, int v) {
            float f = Math.min(((float)v) / ((float)bitmap0.getWidth()), ((float)v) / ((float)bitmap0.getHeight()));
            int v1 = (int)(((float)bitmap0.getHeight()) * f);
            return Bitmap.createScaledBitmap(bitmap0, ((int)(((float)bitmap0.getWidth()) * f)), v1, true);
        }
    }

    public static final String A = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final String B = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final String C = "android.media.metadata.DISPLAY_ICON";
    public static final Parcelable.Creator CREATOR = null;
    public static final String D = "android.media.metadata.DISPLAY_ICON_URI";
    public static final String E = "android.media.metadata.MEDIA_ID";
    public static final String F = "android.media.metadata.MEDIA_URI";
    public static final String G = "android.media.metadata.BT_FOLDER_TYPE";
    public static final String H = "android.media.metadata.ADVERTISEMENT";
    public static final String I = "android.media.metadata.DOWNLOAD_STATUS";
    static final int J = 0;
    static final int K = 1;
    static final int L = 2;
    static final int M = 3;
    static final ArrayMap N = null;
    private static final String[] O = null;
    private static final String[] P = null;
    private static final String[] Q = null;
    final Bundle a;
    private MediaMetadata b;
    private MediaDescriptionCompat c;
    private static final String d = "MediaMetadata";
    public static final String e = "android.media.metadata.TITLE";
    public static final String f = "android.media.metadata.ARTIST";
    public static final String g = "android.media.metadata.DURATION";
    public static final String h = "android.media.metadata.ALBUM";
    public static final String i = "android.media.metadata.AUTHOR";
    public static final String j = "android.media.metadata.WRITER";
    public static final String k = "android.media.metadata.COMPOSER";
    public static final String l = "android.media.metadata.COMPILATION";
    public static final String m = "android.media.metadata.DATE";
    public static final String n = "android.media.metadata.YEAR";
    public static final String o = "android.media.metadata.GENRE";
    public static final String p = "android.media.metadata.TRACK_NUMBER";
    public static final String q = "android.media.metadata.NUM_TRACKS";
    public static final String r = "android.media.metadata.DISC_NUMBER";
    public static final String s = "android.media.metadata.ALBUM_ARTIST";
    public static final String t = "android.media.metadata.ART";
    public static final String u = "android.media.metadata.ART_URI";
    public static final String v = "android.media.metadata.ALBUM_ART";
    public static final String w = "android.media.metadata.ALBUM_ART_URI";
    public static final String x = "android.media.metadata.USER_RATING";
    public static final String y = "android.media.metadata.RATING";
    public static final String z = "android.media.metadata.DISPLAY_TITLE";

    static {
        ArrayMap arrayMap0 = new ArrayMap();
        MediaMetadataCompat.N = arrayMap0;
        arrayMap0.put("android.media.metadata.TITLE", 1);
        arrayMap0.put("android.media.metadata.ARTIST", 1);
        arrayMap0.put("android.media.metadata.DURATION", 0);
        arrayMap0.put("android.media.metadata.ALBUM", 1);
        arrayMap0.put("android.media.metadata.AUTHOR", 1);
        arrayMap0.put("android.media.metadata.WRITER", 1);
        arrayMap0.put("android.media.metadata.COMPOSER", 1);
        arrayMap0.put("android.media.metadata.COMPILATION", 1);
        arrayMap0.put("android.media.metadata.DATE", 1);
        arrayMap0.put("android.media.metadata.YEAR", 0);
        arrayMap0.put("android.media.metadata.GENRE", 1);
        arrayMap0.put("android.media.metadata.TRACK_NUMBER", 0);
        arrayMap0.put("android.media.metadata.NUM_TRACKS", 0);
        arrayMap0.put("android.media.metadata.DISC_NUMBER", 0);
        arrayMap0.put("android.media.metadata.ALBUM_ARTIST", 1);
        arrayMap0.put("android.media.metadata.ART", 2);
        arrayMap0.put("android.media.metadata.ART_URI", 1);
        arrayMap0.put("android.media.metadata.ALBUM_ART", 2);
        arrayMap0.put("android.media.metadata.ALBUM_ART_URI", 1);
        arrayMap0.put("android.media.metadata.USER_RATING", 3);
        arrayMap0.put("android.media.metadata.RATING", 3);
        arrayMap0.put("android.media.metadata.DISPLAY_TITLE", 1);
        arrayMap0.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        arrayMap0.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        arrayMap0.put("android.media.metadata.DISPLAY_ICON", 2);
        arrayMap0.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        arrayMap0.put("android.media.metadata.MEDIA_ID", 1);
        arrayMap0.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        arrayMap0.put("android.media.metadata.MEDIA_URI", 1);
        arrayMap0.put("android.media.metadata.ADVERTISEMENT", 0);
        arrayMap0.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        MediaMetadataCompat.O = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        MediaMetadataCompat.P = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        MediaMetadataCompat.Q = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        MediaMetadataCompat.CREATOR = new a();
    }

    MediaMetadataCompat(Bundle bundle0) {
        Bundle bundle1 = new Bundle(bundle0);
        this.a = bundle1;
        MediaSessionCompat.b(bundle1);
    }

    MediaMetadataCompat(Parcel parcel0) {
        this.a = parcel0.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public boolean a(String s) {
        return this.a.containsKey(s);
    }

    public static MediaMetadataCompat c(Object object0) {
        if(object0 != null) {
            Parcel parcel0 = Parcel.obtain();
            ((MediaMetadata)object0).writeToParcel(parcel0, 0);
            parcel0.setDataPosition(0);
            MediaMetadataCompat mediaMetadataCompat0 = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(parcel0);
            parcel0.recycle();
            mediaMetadataCompat0.b = (MediaMetadata)object0;
            return mediaMetadataCompat0;
        }
        return null;
    }

    public Bitmap d(String s) {
        try {
            return (Bitmap)this.a.getParcelable(s);
        }
        catch(Exception exception0) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", exception0);
            return null;
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle e() {
        return new Bundle(this.a);
    }

    public MediaDescriptionCompat f() {
        Uri uri1;
        Uri uri0;
        Bitmap bitmap0;
        MediaDescriptionCompat mediaDescriptionCompat0 = this.c;
        if(mediaDescriptionCompat0 != null) {
            return mediaDescriptionCompat0;
        }
        String s = this.l("android.media.metadata.MEDIA_ID");
        CharSequence[] arr_charSequence = new CharSequence[3];
        CharSequence charSequence0 = this.m("android.media.metadata.DISPLAY_TITLE");
        if(TextUtils.isEmpty(charSequence0)) {
            int v1 = 0;
            for(int v = 0; v1 < 3; ++v) {
                String[] arr_s = MediaMetadataCompat.O;
                if(v >= arr_s.length) {
                    break;
                }
                CharSequence charSequence1 = this.m(arr_s[v]);
                if(!TextUtils.isEmpty(charSequence1)) {
                    arr_charSequence[v1] = charSequence1;
                    ++v1;
                }
            }
        }
        else {
            arr_charSequence[0] = charSequence0;
            arr_charSequence[1] = this.m("android.media.metadata.DISPLAY_SUBTITLE");
            arr_charSequence[2] = this.m("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        for(int v2 = 0; true; ++v2) {
            bitmap0 = null;
            String[] arr_s1 = MediaMetadataCompat.P;
            uri0 = null;
            if(v2 >= arr_s1.length) {
                break;
            }
            Bitmap bitmap1 = this.d(arr_s1[v2]);
            if(bitmap1 != null) {
                bitmap0 = bitmap1;
                break;
            }
        }
        for(int v3 = 0; true; ++v3) {
            uri1 = null;
            String[] arr_s2 = MediaMetadataCompat.Q;
            if(v3 >= arr_s2.length) {
                break;
            }
            String s1 = this.l(arr_s2[v3]);
            if(!TextUtils.isEmpty(s1)) {
                uri1 = Uri.parse(s1);
                break;
            }
        }
        String s2 = this.l("android.media.metadata.MEDIA_URI");
        if(!TextUtils.isEmpty(s2)) {
            uri0 = Uri.parse(s2);
        }
        d mediaDescriptionCompat$d0 = new d();
        mediaDescriptionCompat$d0.f(s);
        mediaDescriptionCompat$d0.i(arr_charSequence[0]);
        mediaDescriptionCompat$d0.h(arr_charSequence[1]);
        mediaDescriptionCompat$d0.b(arr_charSequence[2]);
        mediaDescriptionCompat$d0.d(bitmap0);
        mediaDescriptionCompat$d0.e(uri1);
        mediaDescriptionCompat$d0.g(uri0);
        Bundle bundle0 = new Bundle();
        if(this.a.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle0.putLong("android.media.extra.BT_FOLDER_TYPE", this.g("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if(this.a.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle0.putLong("android.media.extra.DOWNLOAD_STATUS", this.g("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if(!bundle0.isEmpty()) {
            mediaDescriptionCompat$d0.c(bundle0);
        }
        MediaDescriptionCompat mediaDescriptionCompat1 = mediaDescriptionCompat$d0.a();
        this.c = mediaDescriptionCompat1;
        return mediaDescriptionCompat1;
    }

    public long g(String s) {
        return this.a.getLong(s, 0L);
    }

    public Object h() {
        if(this.b == null) {
            Parcel parcel0 = Parcel.obtain();
            this.writeToParcel(parcel0, 0);
            parcel0.setDataPosition(0);
            this.b = (MediaMetadata)MediaMetadata.CREATOR.createFromParcel(parcel0);
            parcel0.recycle();
        }
        return this.b;
    }

    public RatingCompat i(String s) {
        try {
            return RatingCompat.a(this.a.getParcelable(s));
        }
        catch(Exception exception0) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", exception0);
            return null;
        }
    }

    public String l(String s) {
        CharSequence charSequence0 = this.a.getCharSequence(s);
        return charSequence0 == null ? null : charSequence0.toString();
    }

    public CharSequence m(String s) {
        return this.a.getCharSequence(s);
    }

    public Set o() {
        return this.a.keySet();
    }

    public int q() {
        return this.a.size();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeBundle(this.a);
    }
}

