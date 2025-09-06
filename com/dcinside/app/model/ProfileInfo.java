package com.dcinside.app.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.dcinside.app.util.Bk;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import org.json.JSONArray;
import y4.l;
import y4.m;

@s0({"SMAP\nProfileInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileInfo.kt\ncom/dcinside/app/model/ProfileInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class ProfileInfo implements Parcelable {
    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public ProfileInfo a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new ProfileInfo(parcel0);
        }

        @l
        public ProfileInfo[] b(int v) {
            return new ProfileInfo[v];
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

    @l
    public static final a CREATOR;
    @c("name")
    @l
    private String a;
    @c("value")
    @l
    private String b;
    @com.dcinside.app.util.Ik.a
    @l
    private String c;

    static {
        ProfileInfo.CREATOR = new a(null);
    }

    public ProfileInfo() {
        this(null, null, null, 7, null);
    }

    public ProfileInfo(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        this(parcel0.readString(), parcel0.readString(), parcel0.readString());
    }

    public ProfileInfo(@l String s, @l String s1, @l String s2) {
        L.p(s, "key");
        L.p(s1, "value");
        L.p(s2, "content");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    public ProfileInfo(String s, String s1, String s2, int v, w w0) {
        if((v & 1) != 0) {
            s = "";
        }
        if((v & 2) != 0) {
            s1 = "";
        }
        if((v & 4) != 0) {
            s2 = "";
        }
        this(s, s1, s2);
    }

    @l
    public final String a() [...] // 潜在的解密器

    @l
    public final String c() {
        return this.b;
    }

    @l
    public final String d() [...] // 潜在的解密器

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final ProfileInfo e(@l String s, @l String s1, @l String s2) {
        L.p(s, "key");
        L.p(s1, "value");
        L.p(s2, "content");
        return new ProfileInfo(s, s1, s2);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ProfileInfo)) {
            return false;
        }
        if(!L.g(this.a, ((ProfileInfo)object0).a)) {
            return false;
        }
        return L.g(this.b, ((ProfileInfo)object0).b) ? L.g(this.c, ((ProfileInfo)object0).c) : false;
    }

    public static ProfileInfo f(ProfileInfo profileInfo0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = profileInfo0.a;
        }
        if((v & 2) != 0) {
            s1 = profileInfo0.b;
        }
        if((v & 4) != 0) {
            s2 = profileInfo0.c;
        }
        return profileInfo0.e(s, s1, s2);
    }

    public final void g() {
        String s2;
        String s = "";
        this.a = v.G5(this.a).toString();
        this.b = v.G5(this.b).toString();
        String s1 = this.a;
        if(L.g(s1, "본명")) {
            s2 = com.dcinside.app.internal.l.f(this.o(this.b));
        }
        else if(L.g(s1, "직업")) {
            s2 = com.dcinside.app.internal.l.f(this.m(this.b));
        }
        else if(L.g(s1, "성별")) {
            switch(this.b) {
                case "F": {
                    s = "여성";
                    break;
                }
                case "M": {
                    s = "남성";
                    break;
                }
                case "X": {
                    break;
                }
                default: {
                    s = this.b;
                }
            }
            s2 = com.dcinside.app.internal.l.f(s);
        }
        else if((L.g(s1, "사이트") ? true : L.g(s1, "대표 이미지"))) {
            s2 = this.b;
        }
        else if(L.g(s1, "출생일")) {
            String s3 = Bk.a.C(this.b);
            if(s3 == null) {
                s2 = "";
            }
            else {
                s2 = com.dcinside.app.internal.l.f(s3);
                if(s2 == null) {
                    s2 = "";
                }
            }
        }
        else {
            s2 = com.dcinside.app.internal.l.f(this.b);
        }
        this.c = s2;
    }

    @l
    public final String h() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @l
    public final String i() [...] // 潜在的解密器

    @l
    public final String l() {
        return this.b;
    }

    private final String m(String s) {
        JSONArray jSONArray0;
        try {
            jSONArray0 = new JSONArray(s);
        }
        catch(Exception unused_ex) {
            return s;
        }
        ArrayList arrayList0 = new ArrayList();
        int v = jSONArray0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            String s1 = jSONArray0.getString(v1);
            L.m(s1);
            if(s1.length() <= 0) {
                s1 = null;
            }
            if(s1 != null) {
                arrayList0.add(s1);
            }
        }
        return arrayList0.isEmpty() ? s : u.m3(arrayList0, ", ", null, null, 0, null, null, 62, null);
    }

    private final String o(String s) {
        JSONArray jSONArray0;
        try {
            jSONArray0 = new JSONArray(s);
        }
        catch(Exception unused_ex) {
            return s;
        }
        ArrayList arrayList0 = new ArrayList();
        int v = jSONArray0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            String s1 = jSONArray0.getString(v1);
            L.m(s1);
            if(s1.length() <= 0) {
                s1 = null;
            }
            if(s1 != null) {
                arrayList0.add(s1);
            }
        }
        if(arrayList0.isEmpty()) {
            return "";
        }
        String s2 = (String)u.N0(arrayList0);
        if(s2 == null) {
            return s;
        }
        if(!arrayList0.isEmpty()) {
            StringBuilder stringBuilder0 = new StringBuilder(s2);
            u.k3(arrayList0, stringBuilder0, ", ", "(", ")", 0, null, null, 0x70, null);
            s2 = stringBuilder0.toString();
            L.m(s2);
        }
        return s2;
    }

    public final void q(@l String s) {
        L.p(s, "<set-?>");
        this.c = s;
    }

    public final void r(@l String s) {
        L.p(s, "<set-?>");
        this.a = s;
    }

    public final void s(@l String s) {
        L.p(s, "<set-?>");
        this.b = s;
    }

    @Override
    @l
    public String toString() {
        return "ProfileInfo(key=" + this.a + ", value=" + this.b + ", content=" + this.c + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
    }
}

