package com.dcinside.app.write.menu.ai.type;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class AiModelItem implements Parcelable {
    public static final class a implements Parcelable.Creator {
        @l
        public AiModelItem a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new AiModelItem(parcel0);
        }

        @l
        public AiModelItem[] b(int v) {
            return new AiModelItem[v];
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
        private b() {
        }

        public b(w w0) {
        }
    }

    @l
    @f
    public static final Parcelable.Creator CREATOR;
    @l
    private final com.dcinside.app.write.menu.ai.type.a a;
    @l
    private final String b;
    @l
    public static final b c;

    static {
        AiModelItem.c = new b(null);
        AiModelItem.CREATOR = new a();
    }

    public AiModelItem(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        String s = parcel0.readString();
        com.dcinside.app.write.menu.ai.type.a a0 = com.dcinside.app.write.menu.ai.type.a.e;
        if(!L.g(s, "ani1")) {
            com.dcinside.app.write.menu.ai.type.a a1 = com.dcinside.app.write.menu.ai.type.a.f;
            if(L.g(s, "ani2")) {
                a0 = a1;
            }
            else {
                a1 = com.dcinside.app.write.menu.ai.type.a.g;
                if(L.g(s, "ani3")) {
                    a0 = a1;
                }
                else {
                    a1 = com.dcinside.app.write.menu.ai.type.a.h;
                    if(L.g(s, "ani4")) {
                        a0 = a1;
                    }
                    else {
                        a1 = com.dcinside.app.write.menu.ai.type.a.i;
                        if(L.g(s, "real1")) {
                            a0 = a1;
                        }
                        else {
                            a1 = com.dcinside.app.write.menu.ai.type.a.j;
                            if(L.g(s, "real2")) {
                                a0 = a1;
                            }
                            else {
                                a1 = com.dcinside.app.write.menu.ai.type.a.k;
                                if(L.g(s, "real3")) {
                                    a0 = a1;
                                }
                                else {
                                    a1 = com.dcinside.app.write.menu.ai.type.a.l;
                                    if(L.g(s, "real4")) {
                                        a0 = a1;
                                    }
                                    else {
                                        a1 = com.dcinside.app.write.menu.ai.type.a.m;
                                        if(L.g(s, "real5")) {
                                            a0 = a1;
                                        }
                                        else {
                                            a1 = com.dcinside.app.write.menu.ai.type.a.n;
                                            if(L.g(s, "real6")) {
                                                a0 = a1;
                                            }
                                            else {
                                                a1 = com.dcinside.app.write.menu.ai.type.a.o;
                                                if(L.g(s, "Toon3d")) {
                                                    a0 = a1;
                                                }
                                                else {
                                                    a1 = com.dcinside.app.write.menu.ai.type.a.p;
                                                    if(L.g(s, "figure")) {
                                                        a0 = a1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        String s1 = parcel0.readString();
        if(s1 == null) {
            s1 = "";
        }
        this(a0, s1);
    }

    public AiModelItem(@l com.dcinside.app.write.menu.ai.type.a a0, @l String s) {
        L.p(a0, "type");
        L.p(s, "name");
        super();
        this.a = a0;
        this.b = s;
    }

    @l
    public final String a() {
        return this.b;
    }

    @l
    public final com.dcinside.app.write.menu.ai.type.a c() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(AiModelItem.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.dcinside.app.write.menu.ai.type.AiModelItem");
        return this.a == ((AiModelItem)object0).a ? L.g(this.b, ((AiModelItem)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "AiModelItem(type=" + this.a + ", name=\'" + this.b + "\')";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeString(this.a.e());
        parcel0.writeString(this.b);
    }
}

