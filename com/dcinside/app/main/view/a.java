package com.dcinside.app.main.view;

import com.dcinside.app.model.MajorRanking;
import com.dcinside.app.model.MinorRanking;
import com.dcinside.app.util.jl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nCrowdDTO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrowdDTO.kt\ncom/dcinside/app/main/view/CrowdDTO\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1#2:80\n1628#3,3:81\n1628#3,3:84\n1628#3,3:87\n1628#3,3:90\n*S KotlinDebug\n*F\n+ 1 CrowdDTO.kt\ncom/dcinside/app/main/view/CrowdDTO\n*L\n21#1:81,3\n31#1:84,3\n41#1:87,3\n51#1:90,3\n*E\n"})
public final class a {
    @l
    private final List a;
    @l
    private final List b;
    @l
    private final List c;
    @l
    private final List d;

    public a(@l List list0, @l List list1, @l List list2, @l List list3) {
        L.p(list0, "major");
        L.p(list1, "minor");
        L.p(list2, "mini");
        L.p(list3, "person");
        super();
        boolean z = list0.isEmpty() && list1.isEmpty() && list2.isEmpty() && list3.isEmpty();
        int v = ((int)jl.a.n0()) * 10;
        int v1 = list0.size();
        if(z || v1 >= v) {
            this.a = u.J5(list0, v);
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(list0);
            this.a = arrayList0;
            Iterator iterator0 = s.W1(0, v - v1).iterator();
            while(iterator0.hasNext()) {
                arrayList0.add(new MajorRanking(null, null, null, null, 0, v1 + 1 + ((T)iterator0).b(), null, 0x5F, null));
            }
        }
        int v2 = list1.size();
        if(z || v2 >= v) {
            this.b = u.J5(list1, v);
        }
        else {
            ArrayList arrayList1 = new ArrayList();
            arrayList1.addAll(list1);
            this.b = arrayList1;
            Iterator iterator1 = s.W1(0, v - v2).iterator();
            while(iterator1.hasNext()) {
                arrayList1.add(new MinorRanking(null, null, null, null, 0, v2 + 1 + ((T)iterator1).b(), null, null, null, 0x1DF, null));
            }
        }
        int v3 = list2.size();
        if(z || v3 >= v) {
            this.c = u.J5(list2, v);
        }
        else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            this.c = arrayList2;
            Iterator iterator2 = s.W1(0, v - v3).iterator();
            while(iterator2.hasNext()) {
                arrayList2.add(new MinorRanking(null, null, null, null, 0, v3 + 1 + ((T)iterator2).b(), null, null, null, 0x1DF, null));
            }
        }
        if(!z && list3.size() < v) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(list3);
            this.d = arrayList3;
            Iterator iterator3 = s.W1(0, v - v3).iterator();
            while(iterator3.hasNext()) {
                arrayList3.add(new MinorRanking(null, null, null, null, 0, v3 + 1 + ((T)iterator3).b(), null, null, null, 0x1DF, null));
            }
            return;
        }
        this.d = u.J5(list3, v);
    }

    @l
    public final List a() {
        return this.a;
    }

    @l
    public final List b() {
        return this.c;
    }

    @l
    public final List c() {
        return this.b;
    }

    @l
    public final List d() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(a.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type com.dcinside.app.main.view.CrowdDTO");
        if(!L.g(this.a, ((a)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((a)object0).b)) {
            return false;
        }
        return L.g(this.c, ((a)object0).c) ? L.g(this.d, ((a)object0).d) : false;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }
}

