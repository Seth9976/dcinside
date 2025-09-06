package com.dcinside.app.youtube;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.uk;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.List;

public class YoutubeSearchResult implements Parcelable {
    public static final class Error implements Parcelable {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public Error a(Parcel parcel0) {
                return new Error(parcel0);
            }

            public Error[] b(int v) {
                return new Error[v];
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
        @com.google.gson.annotations.a
        @c("code")
        private int a;
        @com.google.gson.annotations.a
        @c("message")
        private String b;
        @com.google.gson.annotations.a
        @c("errors")
        private List c;

        static {
            Error.CREATOR = new a();
        }

        public Error() {
        }

        Error(Parcel parcel0) {
            this.a = parcel0.readInt();
            this.b = parcel0.readString();
        }

        public int a() {
            return this.a;
        }

        List c() {
            return this.c;
        }

        public String d() {
            return this.b;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.a);
            parcel0.writeString(this.b);
        }
    }

    public static final class ErrorDetail implements Parcelable {
        class com.dcinside.app.youtube.YoutubeSearchResult.ErrorDetail.a implements Parcelable.Creator {
            com.dcinside.app.youtube.YoutubeSearchResult.ErrorDetail.a() {
                super();
            }

            public ErrorDetail a(Parcel parcel0) {
                return new ErrorDetail(parcel0);
            }

            public ErrorDetail[] b(int v) {
                return new ErrorDetail[v];
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
        @com.google.gson.annotations.a
        @c("reason")
        private String a;

        static {
            ErrorDetail.CREATOR = new com.dcinside.app.youtube.YoutubeSearchResult.ErrorDetail.a();
        }

        public ErrorDetail() {
        }

        ErrorDetail(Parcel parcel0) {
            this.a = parcel0.readString();
        }

        String a() {
            return this.a;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeString(this.a);
        }
    }

    public static final class Id implements Parcelable {
        class com.dcinside.app.youtube.YoutubeSearchResult.Id.a implements Parcelable.Creator {
            com.dcinside.app.youtube.YoutubeSearchResult.Id.a() {
                super();
            }

            public Id a(Parcel parcel0) {
                return new Id(parcel0);
            }

            public Id[] b(int v) {
                return new Id[v];
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
        @com.google.gson.annotations.a
        @c("videoId")
        private String a;

        static {
            Id.CREATOR = new com.dcinside.app.youtube.YoutubeSearchResult.Id.a();
        }

        public Id() {
        }

        Id(Parcel parcel0) {
            this.a = parcel0.readString();
        }

        String a() {
            return this.a;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeString(this.a);
        }
    }

    public static final class Image implements Parcelable {
        class com.dcinside.app.youtube.YoutubeSearchResult.Image.a implements Parcelable.Creator {
            com.dcinside.app.youtube.YoutubeSearchResult.Image.a() {
                super();
            }

            public Image a(Parcel parcel0) {
                return new Image(parcel0);
            }

            public Image[] b(int v) {
                return new Image[v];
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
        @com.google.gson.annotations.a
        @c("url")
        private String a;
        @com.google.gson.annotations.a
        @c("width")
        private long b;
        @com.google.gson.annotations.a
        @c("height")
        private long c;

        static {
            Image.CREATOR = new com.dcinside.app.youtube.YoutubeSearchResult.Image.a();
        }

        public Image() {
        }

        Image(Parcel parcel0) {
            this.a = parcel0.readString();
            this.b = parcel0.readLong();
            this.c = parcel0.readLong();
        }

        public long a() {
            return this.c;
        }

        public String c() {
            return this.a;
        }

        public long d() {
            return this.b;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeString(this.a);
            parcel0.writeLong(this.b);
            parcel0.writeLong(this.c);
        }
    }

    public static final class Item implements Parcelable {
        class com.dcinside.app.youtube.YoutubeSearchResult.Item.a implements Parcelable.Creator {
            com.dcinside.app.youtube.YoutubeSearchResult.Item.a() {
                super();
            }

            public Item a(Parcel parcel0) {
                return new Item(parcel0);
            }

            public Item[] b(int v) {
                return new Item[v];
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
        @com.google.gson.annotations.a
        @c("id")
        private Id a;
        @com.google.gson.annotations.a
        @c("snippet")
        private Snippet b;

        static {
            Item.CREATOR = new com.dcinside.app.youtube.YoutubeSearchResult.Item.a();
        }

        public Item() {
        }

        Item(Parcel parcel0) {
            this.a = (Id)parcel0.readParcelable(Id.class.getClassLoader());
            this.b = (Snippet)parcel0.readParcelable(Snippet.class.getClassLoader());
        }

        Id a() {
            return this.a;
        }

        Snippet c() {
            return this.b;
        }

        public void d() {
            Snippet youtubeSearchResult$Snippet0 = this.c();
            if(youtubeSearchResult$Snippet0 != null) {
                String s = youtubeSearchResult$Snippet0.b;
                if(!TextUtils.isEmpty(s)) {
                    youtubeSearchResult$Snippet0.b = Dl.M(s);
                }
            }
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeParcelable(this.a, v);
            parcel0.writeParcelable(this.b, v);
        }
    }

    public static final class Snippet implements Parcelable {
        class com.dcinside.app.youtube.YoutubeSearchResult.Snippet.a implements Parcelable.Creator {
            com.dcinside.app.youtube.YoutubeSearchResult.Snippet.a() {
                super();
            }

            public Snippet a(Parcel parcel0) {
                return new Snippet(parcel0);
            }

            public Snippet[] b(int v) {
                return new Snippet[v];
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
        @com.google.gson.annotations.a
        @c("publishedAt")
        private String a;
        @com.google.gson.annotations.a
        @c("title")
        private String b;
        @com.google.gson.annotations.a
        @c("thumbnails")
        private Thumbnails c;
        @com.google.gson.annotations.a
        @c("channelTitle")
        private String d;

        static {
            Snippet.CREATOR = new com.dcinside.app.youtube.YoutubeSearchResult.Snippet.a();
        }

        public Snippet() {
        }

        Snippet(Parcel parcel0) {
            this.a = parcel0.readString();
            this.b = parcel0.readString();
            this.c = (Thumbnails)parcel0.readParcelable(Thumbnails.class.getClassLoader());
            this.d = parcel0.readString();
        }

        String d() {
            return this.d;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        String e() {
            return this.a;
        }

        Thumbnails f() {
            return this.c;
        }

        String g() {
            return this.b;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeString(this.a);
            parcel0.writeString(this.b);
            parcel0.writeParcelable(this.c, v);
            parcel0.writeString(this.d);
        }
    }

    public static final class Thumbnails implements Parcelable {
        class com.dcinside.app.youtube.YoutubeSearchResult.Thumbnails.a implements Parcelable.Creator {
            com.dcinside.app.youtube.YoutubeSearchResult.Thumbnails.a() {
                super();
            }

            public Thumbnails a(Parcel parcel0) {
                return new Thumbnails(parcel0);
            }

            public Thumbnails[] b(int v) {
                return new Thumbnails[v];
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
        @com.google.gson.annotations.a
        @c("high")
        private Image a;

        static {
            Thumbnails.CREATOR = new com.dcinside.app.youtube.YoutubeSearchResult.Thumbnails.a();
        }

        public Thumbnails() {
        }

        Thumbnails(Parcel parcel0) {
            this.a = (Image)parcel0.readParcelable(Image.class.getClassLoader());
        }

        public Image a() {
            return this.a;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeParcelable(this.a, v);
        }
    }

    class com.dcinside.app.youtube.YoutubeSearchResult.a implements Parcelable.Creator {
        com.dcinside.app.youtube.YoutubeSearchResult.a() {
            super();
        }

        public YoutubeSearchResult a(Parcel parcel0) {
            return new YoutubeSearchResult(parcel0, null);
        }

        public YoutubeSearchResult[] b(int v) {
            return new YoutubeSearchResult[v];
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
    @com.google.gson.annotations.a
    @c("etag")
    private String a;
    @com.google.gson.annotations.a
    @c("prevPageToken")
    private String b;
    @com.google.gson.annotations.a
    @c("nextPageToken")
    private String c;
    @com.google.gson.annotations.a
    @c("items")
    private List d;
    @com.google.gson.annotations.a
    @c("error")
    private Error e;

    static {
        YoutubeSearchResult.CREATOR = new com.dcinside.app.youtube.YoutubeSearchResult.a();
    }

    public YoutubeSearchResult() {
    }

    private YoutubeSearchResult(Parcel parcel0) {
        this.b = parcel0.readString();
        this.c = parcel0.readString();
        ArrayList arrayList0 = new ArrayList();
        this.d = arrayList0;
        parcel0.readList(arrayList0, Item.class.getClassLoader());
        this.e = (Error)parcel0.readParcelable(Error.class.getClassLoader());
    }

    YoutubeSearchResult(Parcel parcel0, t t0) {
        this(parcel0);
    }

    public String a() {
        return this.a;
    }

    public Error c() {
        return this.e;
    }

    @Nullable
    private static String d(YoutubeSearchResult youtubeSearchResult0) {
        if(youtubeSearchResult0 == null) {
            return null;
        }
        Error youtubeSearchResult$Error0 = youtubeSearchResult0.c();
        if(youtubeSearchResult$Error0 == null) {
            return null;
        }
        List list0 = youtubeSearchResult0.c().c();
        if(list0 != null && list0.size() > 0) {
            String s = ((ErrorDetail)list0.get(0)).a();
            if(m0.a.k(s)) {
                if("quotaExceeded".equals(s)) {
                    return "일일 검색 허용량을 초과하여 일시적으로 사용이 불가능합니다. 유튜브 URL을 직접 본문에 등록하세요";
                }
                if("forbidden".equals(s)) {
                    return "액세스가 금지되었습니다.\n인증되지 않은 요청입니다";
                }
                if(youtubeSearchResult$Error0.d() != null && youtubeSearchResult$Error0.d().startsWith("Daily Limit Exceeded")) {
                    return "일일 검색 허용량을 초과하여 일시적으로 사용이 불가능합니다. 유튜브 URL을 직접 본문에 등록하세요";
                }
                return youtubeSearchResult$Error0.d() == null || !youtubeSearchResult$Error0.d().contains("console.developers.google.com") ? youtubeSearchResult$Error0.d() : "유튜브 검색을 일시적으로 사용할 수 없습니다. 유튜브 URL을 직접 본문에 등록하세요";
            }
        }
        return null;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List e() {
        return this.d;
    }

    public String f() {
        return this.c;
    }

    @NonNull
    public static String g(@Nullable String s) {
        if(s == null) {
            return "";
        }
        try {
            String s1 = YoutubeSearchResult.d(((YoutubeSearchResult)c0.a.a.a(uk.a, s, YoutubeSearchResult.class)));
            if(s1 == null) {
                return "";
            }
            if(m0.a.k(s1)) {
                return s1;
            }
        }
        catch(Exception unused_ex) {
        }
        return s;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeList(this.d);
        parcel0.writeParcelable(this.e, v);
    }
}

