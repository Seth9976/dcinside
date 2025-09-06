package com.dcinside.app.model;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.core.os.ParcelCompat;
import com.dcinside.app.write.menu.ai.type.AiModelItem;
import com.dcinside.app.write.menu.ai.type.AiSampleList;
import com.dcinside.app.write.menu.ai.type.LoraModel;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.D;
import kotlin.E;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AiImageStatusResult implements Parcelable {
    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public AiImageStatusResult a(@l Parcel parcel0) {
            L.p(parcel0, "parcel");
            return new AiImageStatusResult(parcel0);
        }

        @l
        public AiImageStatusResult[] b(int v) {
            return new AiImageStatusResult[v];
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
    @c("result")
    @m
    private final Boolean a;
    @c("generate_cnt")
    private final int b;
    @c("set_cnt")
    private final int c;
    @c("prompts")
    @l
    private final List d;
    @c("samples")
    @l
    private final AiSampleList e;
    @c("styles")
    @l
    private final List f;
    @c("lora_list")
    @l
    private final Map g;
    @c("models")
    @l
    private final Map h;
    @l
    private final D i;
    @l
    private final D j;

    static {
        AiImageStatusResult.CREATOR = new a(null);
    }

    public AiImageStatusResult() {
        this(null, 0, 0, null, null, null, null, null, 0xFF, null);
    }

    public AiImageStatusResult(@l Parcel parcel0) {
        L.p(parcel0, "parcel");
        Boolean boolean0 = Boolean.valueOf(parcel0.readInt() == 1);
        int v1 = parcel0.readInt();
        int v2 = parcel0.readInt();
        List list0 = parcel0.createStringArrayList();
        if(list0 == null) {
            list0 = u.H();
        }
        AiSampleList aiSampleList0 = (AiSampleList)ParcelCompat.g(parcel0, AiSampleList.class.getClassLoader(), AiSampleList.class);
        if(aiSampleList0 == null) {
            aiSampleList0 = new AiSampleList(null, null, 3, null);
        }
        List list1 = parcel0.createStringArrayList();
        if(list1 == null) {
            list1 = u.H();
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        int v3 = parcel0.readInt();
        for(int v4 = 0; v4 < v3; ++v4) {
            String s = parcel0.readString();
            LoraModel loraModel0 = Build.VERSION.SDK_INT < 33 ? ((LoraModel)parcel0.readParcelable(LoraModel.class.getClassLoader())) : ((LoraModel)parcel0.readParcelable(LoraModel.class.getClassLoader(), LoraModel.class));
            if(s != null && loraModel0 != null) {
                linkedHashMap0.put(s, loraModel0);
            }
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        int v5 = parcel0.readInt();
        for(int v = 0; v < v5; ++v) {
            String s1 = parcel0.readString();
            String s2 = parcel0.readString();
            if(s1 != null && s2 != null) {
                linkedHashMap1.put(s1, s2);
            }
        }
        this(boolean0, v1, v2, list0, aiSampleList0, list1, linkedHashMap0, linkedHashMap1);
    }

    public AiImageStatusResult(@m Boolean boolean0, int v, int v1, @l List list0, @l AiSampleList aiSampleList0, @l List list1, @l Map map0, @l Map map1) {
        @s0({"SMAP\nAiImageStatusResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiImageStatusResult.kt\ncom/dcinside/app/model/AiImageStatusResult$loraList$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n136#2,9:155\n216#2:164\n217#2:166\n145#2:167\n1#3:165\n1053#4:168\n*S KotlinDebug\n*F\n+ 1 AiImageStatusResult.kt\ncom/dcinside/app/model/AiImageStatusResult$loraList$2\n*L\n67#1:155,9\n67#1:164\n67#1:166\n67#1:167\n67#1:165\n73#1:168\n*E\n"})
        static final class b extends N implements A3.a {
            final AiImageStatusResult e;

            b(AiImageStatusResult aiImageStatusResult0) {
                this.e = aiImageStatusResult0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }

            @l
            public final List invoke() {
                @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AiImageStatusResult.kt\ncom/dcinside/app/model/AiImageStatusResult$loraList$2\n*L\n1#1,102:1\n73#2:103\n*E\n"})
                public static final class com.dcinside.app.model.AiImageStatusResult.b.a implements Comparator {
                    @Override
                    public final int compare(Object object0, Object object1) {
                        return kotlin.comparisons.a.l(((LoraModel)object0).e(), ((LoraModel)object1).e());
                    }
                }

                AiImageStatusResult aiImageStatusResult0 = this.e;
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: this.e.q().entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    LoraModel loraModel0 = (LoraModel)aiImageStatusResult0.q().get(map$Entry0.getKey());
                    if(loraModel0 == null) {
                        loraModel0 = null;
                    }
                    else {
                        String s = loraModel0.d();
                        if(s != null && s.length() != 0) {
                            loraModel0.m(((String)map$Entry0.getKey()));
                        }
                    }
                    if(loraModel0 != null) {
                        arrayList0.add(loraModel0);
                    }
                }
                return u.u5(arrayList0, new com.dcinside.app.model.AiImageStatusResult.b.a());
            }
        }


        @s0({"SMAP\nAiImageStatusResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiImageStatusResult.kt\ncom/dcinside/app/model/AiImageStatusResult$modelList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1611#2,9:155\n1863#2:164\n1864#2:166\n1620#2:167\n1#3:165\n*S KotlinDebug\n*F\n+ 1 AiImageStatusResult.kt\ncom/dcinside/app/model/AiImageStatusResult$modelList$2\n*L\n77#1:155,9\n77#1:164\n77#1:166\n77#1:167\n77#1:165\n*E\n"})
        static final class com.dcinside.app.model.AiImageStatusResult.c extends N implements A3.a {
            final AiImageStatusResult e;

            com.dcinside.app.model.AiImageStatusResult.c(AiImageStatusResult aiImageStatusResult0) {
                this.e = aiImageStatusResult0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }

            @l
            public final List invoke() {
                AiImageStatusResult aiImageStatusResult0 = this.e;
                List list0 = new ArrayList();
                for(Object object0: com.dcinside.app.write.menu.ai.type.a.b()) {
                    String s = (String)aiImageStatusResult0.s().get(((com.dcinside.app.write.menu.ai.type.a)object0).e());
                    AiModelItem aiModelItem0 = s == null ? null : new AiModelItem(((com.dcinside.app.write.menu.ai.type.a)object0), s);
                    if(aiModelItem0 != null) {
                        list0.add(aiModelItem0);
                    }
                }
                return list0;
            }
        }

        L.p(list0, "recommendList");
        L.p(aiSampleList0, "sampleList");
        L.p(list1, "styleList");
        L.p(map0, "loraListRaw");
        L.p(map1, "modelListRaw");
        super();
        this.a = boolean0;
        this.b = v;
        this.c = v1;
        this.d = list0;
        this.e = aiSampleList0;
        this.f = list1;
        this.g = map0;
        this.h = map1;
        this.i = E.a(new b(this));
        this.j = E.a(new com.dcinside.app.model.AiImageStatusResult.c(this));
    }

    public AiImageStatusResult(Boolean boolean0, int v, int v1, List list0, AiSampleList aiSampleList0, List list1, Map map0, Map map1, int v2, w w0) {
        this(((v2 & 1) == 0 ? boolean0 : null), ((v2 & 2) == 0 ? v : 0), ((v2 & 4) == 0 ? v1 : 0), ((v2 & 8) == 0 ? list0 : u.H()), ((v2 & 16) == 0 ? aiSampleList0 : new AiSampleList(null, null, 3, null)), ((v2 & 0x20) == 0 ? list1 : u.H()), ((v2 & 0x40) == 0 ? map0 : Y.z()), ((v2 & 0x80) == 0 ? map1 : Y.z()));
    }

    @m
    public final Boolean a() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AiImageStatusResult)) {
            return false;
        }
        if(!L.g(this.a, ((AiImageStatusResult)object0).a)) {
            return false;
        }
        if(this.b != ((AiImageStatusResult)object0).b) {
            return false;
        }
        if(this.c != ((AiImageStatusResult)object0).c) {
            return false;
        }
        if(!L.g(this.d, ((AiImageStatusResult)object0).d)) {
            return false;
        }
        if(!L.g(this.e, ((AiImageStatusResult)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((AiImageStatusResult)object0).f)) {
            return false;
        }
        return L.g(this.g, ((AiImageStatusResult)object0).g) ? L.g(this.h, ((AiImageStatusResult)object0).h) : false;
    }

    @l
    public final AiSampleList f() {
        return this.e;
    }

    @l
    public final List g() {
        return this.f;
    }

    @l
    public final Map h() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return this.a == null ? (((((this.b * 0x1F + this.c) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode() : ((((((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode();
    }

    @l
    public final Map i() {
        return this.h;
    }

    @l
    public final AiImageStatusResult l(@m Boolean boolean0, int v, int v1, @l List list0, @l AiSampleList aiSampleList0, @l List list1, @l Map map0, @l Map map1) {
        L.p(list0, "recommendList");
        L.p(aiSampleList0, "sampleList");
        L.p(list1, "styleList");
        L.p(map0, "loraListRaw");
        L.p(map1, "modelListRaw");
        return new AiImageStatusResult(boolean0, v, v1, list0, aiSampleList0, list1, map0, map1);
    }

    public static AiImageStatusResult m(AiImageStatusResult aiImageStatusResult0, Boolean boolean0, int v, int v1, List list0, AiSampleList aiSampleList0, List list1, Map map0, Map map1, int v2, Object object0) {
        Boolean boolean1 = (v2 & 1) == 0 ? boolean0 : aiImageStatusResult0.a;
        int v3 = (v2 & 2) == 0 ? v : aiImageStatusResult0.b;
        int v4 = (v2 & 4) == 0 ? v1 : aiImageStatusResult0.c;
        List list2 = (v2 & 8) == 0 ? list0 : aiImageStatusResult0.d;
        AiSampleList aiSampleList1 = (v2 & 16) == 0 ? aiSampleList0 : aiImageStatusResult0.e;
        List list3 = (v2 & 0x20) == 0 ? list1 : aiImageStatusResult0.f;
        Map map2 = (v2 & 0x40) == 0 ? map0 : aiImageStatusResult0.g;
        return (v2 & 0x80) == 0 ? aiImageStatusResult0.l(boolean1, v3, v4, list2, aiSampleList1, list3, map2, map1) : aiImageStatusResult0.l(boolean1, v3, v4, list2, aiSampleList1, list3, map2, aiImageStatusResult0.h);
    }

    @l
    public final List o() {
        return (List)this.i.getValue();
    }

    @l
    public final Map q() {
        return this.g;
    }

    @l
    public final List r() {
        return (List)this.j.getValue();
    }

    @l
    public final Map s() {
        return this.h;
    }

    @l
    public final List t() {
        return this.d;
    }

    @Override
    @l
    public String toString() {
        return "AiImageStatusResult(result=" + this.a + ", remainCount=" + this.b + ", totalCount=" + this.c + ", recommendList=" + this.d + ", sampleList=" + this.e + ", styleList=" + this.f + ", loraListRaw=" + this.g + ", modelListRaw=" + this.h + ")";
    }

    public final int u() {
        return this.b;
    }

    @m
    public final Boolean v() {
        return this.a;
    }

    @l
    public final AiSampleList w() {
        return this.e;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeInt(((int)L.g(this.a, Boolean.TRUE)));
        parcel0.writeInt(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeStringList(this.d);
        parcel0.writeParcelable(this.e, 0);
        parcel0.writeStringList(this.f);
        Set set0 = this.g.entrySet();
        parcel0.writeInt(set0.size());
        for(Object object0: set0) {
            parcel0.writeString(((String)((Map.Entry)object0).getKey()));
            parcel0.writeParcelable(((Parcelable)((Map.Entry)object0).getValue()), v);
        }
        Set set1 = this.h.entrySet();
        parcel0.writeInt(set1.size());
        for(Object object1: set1) {
            parcel0.writeString(((String)((Map.Entry)object1).getKey()));
            parcel0.writeString(((String)((Map.Entry)object1).getValue()));
        }
    }

    @l
    public final List x() {
        return this.f;
    }

    public final int y() {
        return this.c;
    }
}

