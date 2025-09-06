package com.dcinside.app.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.dcinside.app.util.Yk;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public final class PostImage implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public PostImage a(@l Parcel parcel0) {
            L.p(parcel0, "source");
            return new PostImage(parcel0);
        }

        @l
        public PostImage[] b(int v) {
            return new PostImage[v];
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

    @s0({"SMAP\nPostImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostImage.kt\ncom/dcinside/app/model/PostImage$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n381#2,7:100\n381#2,7:108\n381#2,7:115\n1#3:107\n*S KotlinDebug\n*F\n+ 1 PostImage.kt\ncom/dcinside/app/model/PostImage$Companion\n*L\n66#1:100,7\n68#1:108,7\n72#1:115,7\n*E\n"})
    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @n
        public final boolean a(@m String s, @l PostImage postImage0, @m Map map0) {
            String s6;
            String s2;
            L.p(postImage0, "second");
            if(s == null) {
                return false;
            }
            if(map0 == null) {
                s2 = this.c(s);
            }
            else {
                String s1 = map0.get(s);
                if(s1 == null) {
                    s1 = PostImage.e.c(s);
                    map0.put(s, s1);
                }
                s2 = s1;
                if(s2 == null) {
                    s2 = this.c(s);
                }
            }
            String s3 = postImage0.l();
            String s4 = null;
            if(s3 == null) {
                s6 = null;
            }
            else if(map0 != null) {
                String s5 = map0.get(s3);
                if(s5 == null) {
                    s5 = PostImage.e.c(s3);
                    map0.put(s3, s5);
                }
                s6 = s5;
                if(s6 == null) {
                    s6 = PostImage.e.c(s3);
                }
            }
            else {
                s6 = PostImage.e.c(s3);
            }
            if(L.g(s2, s6)) {
                return true;
            }
            String s7 = postImage0.i();
            if(s7 != null) {
                if(map0 != null) {
                    String s8 = map0.get(s7);
                    if(s8 == null) {
                        s8 = PostImage.e.c(s7);
                        map0.put(s7, s8);
                    }
                    if(s8 != null) {
                        return L.g(s2, s8);
                    }
                }
                s4 = PostImage.e.c(s7);
            }
            return L.g(s2, s4);
        }

        public static boolean b(b postImage$b0, String s, PostImage postImage0, Map map0, int v, Object object0) {
            if((v & 4) != 0) {
                map0 = null;
            }
            return postImage$b0.a(s, postImage0, map0);
        }

        private final String c(String s) {
            if(s != null) {
                try {
                    if(s.length() > 0 && Yk.a.k().matcher(s).matches()) {
                        String s1 = Uri.parse(s).getQueryParameter("no");
                        return s1 == null || s1.length() <= 0 ? s : s1;
                    }
                    return s;
                }
                catch(Exception unused_ex) {
                }
                return s;
            }
            return s;
        }
    }

    @l
    @f
    public static final Parcelable.Creator CREATOR;
    @c("result")
    @m
    private String a;
    @c("cause")
    @m
    private String b;
    @c("img")
    @m
    private String c;
    @c("img_clone")
    @m
    private String d;
    @l
    public static final b e;

    static {
        PostImage.e = new b(null);
        PostImage.CREATOR = new a();
    }

    public PostImage() {
        this(null, null, null, null, 15, null);
    }

    public PostImage(@l Parcel parcel0) {
        L.p(parcel0, "source");
        this(parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString());
    }

    public PostImage(@l String s) {
        L.p(s, "path");
        this(null, null, null, null, 15, null);
        this.c = s;
        this.d = s;
    }

    public PostImage(@l String s, @l String s1) {
        L.p(s, "path");
        L.p(s1, "clonePath");
        this(null, null, null, null, 15, null);
        this.c = s;
        this.d = s1;
    }

    public PostImage(@m String s, @m String s1, @m String s2, @m String s3) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    public PostImage(String s, String s1, String s2, String s3, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        if((v & 8) != 0) {
            s3 = null;
        }
        this(s, s1, s2, s3);
    }

    @m
    public final String a() {
        return this.a;
    }

    @m
    public final String c() {
        return this.b;
    }

    @m
    public final String d() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @m
    public final String e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PostImage)) {
            return false;
        }
        if(!L.g(this.a, ((PostImage)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((PostImage)object0).b)) {
            return false;
        }
        return L.g(this.c, ((PostImage)object0).c) ? L.g(this.d, ((PostImage)object0).d) : false;
    }

    @l
    public final PostImage f(@m String s, @m String s1, @m String s2, @m String s3) {
        return new PostImage(s, s1, s2, s3);
    }

    public static PostImage g(PostImage postImage0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = postImage0.a;
        }
        if((v & 2) != 0) {
            s1 = postImage0.b;
        }
        if((v & 4) != 0) {
            s2 = postImage0.c;
        }
        if((v & 8) != 0) {
            s3 = postImage0.d;
        }
        return postImage0.f(s, s1, s2, s3);
    }

    @m
    public final String h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        String s = this.d;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @m
    public final String i() {
        return this.d;
    }

    @m
    public final String l() {
        return this.c;
    }

    @m
    public final String m() {
        return this.a;
    }

    @n
    public static final boolean o(@m String s, @l PostImage postImage0, @m Map map0) {
        return PostImage.e.a(s, postImage0, map0);
    }

    public final void q(@m String s) {
        this.b = s;
    }

    public final void r(@m String s) {
        this.d = s;
    }

    public final void s(@m String s) {
        this.c = s;
    }

    public final void t(@m String s) {
        this.a = s;
    }

    @Override
    @l
    public String toString() {
        return "PostImage(result=" + this.a + ", cause=" + this.b + ", path=" + this.c + ", clonePath=" + this.d + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "dest");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
    }
}

