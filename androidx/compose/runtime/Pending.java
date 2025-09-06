package androidx.compose.runtime;

import A3.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4507:1\n1#2:4508\n1855#3,2:4509\n1855#3,2:4511\n1855#3,2:4513\n1855#3,2:4515\n1855#3,2:4517\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n*L\n156#1:4509,2\n162#1:4511,2\n172#1:4513,2\n178#1:4515,2\n198#1:4517,2\n*E\n"})
final class Pending {
    @l
    private final List a;
    private final int b;
    private int c;
    @l
    private final List d;
    @l
    private final HashMap e;
    @l
    private final D f;

    public Pending(@l List list0, int v) {
        L.p(list0, "keyInfos");
        super();
        this.a = list0;
        this.b = v;
        if(v < 0) {
            throw new IllegalArgumentException("Invalid start index");
        }
        this.d = new ArrayList();
        HashMap hashMap0 = new HashMap();
        int v1 = list0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            KeyInfo keyInfo0 = (KeyInfo)this.a.get(v2);
            hashMap0.put(keyInfo0.c(), new GroupInfo(v2, v3, keyInfo0.d()));
            v3 += keyInfo0.d();
        }
        this.e = hashMap0;
        this.f = E.a(new a() {
            final Pending e;

            {
                this.e = pending0;
                super(0);
            }

            @l
            public final HashMap b() {
                HashMap hashMap0 = ComposerKt.h0();
                Pending pending0 = this.e;
                int v = pending0.b().size();
                for(int v1 = 0; v1 < v; ++v1) {
                    KeyInfo keyInfo0 = (KeyInfo)pending0.b().get(v1);
                    ComposerKt.l0(hashMap0, ComposerKt.P(keyInfo0), keyInfo0);
                }
                return hashMap0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    public final int a() {
        return this.c;
    }

    @l
    public final List b() {
        return this.a;
    }

    @l
    public final HashMap c() {
        return (HashMap)this.f.getValue();
    }

    @m
    public final KeyInfo d(int v, @m Object object0) {
        if(object0 != null) {
            JoinedKey joinedKey0 = new JoinedKey(v, object0);
            return (KeyInfo)ComposerKt.k0(this.c(), joinedKey0);
        }
        return (KeyInfo)ComposerKt.k0(this.c(), v);
    }

    public final int e() {
        return this.b;
    }

    @l
    public final List f() {
        return this.d;
    }

    public final int g(@l KeyInfo keyInfo0) {
        L.p(keyInfo0, "keyInfo");
        GroupInfo groupInfo0 = (GroupInfo)this.e.get(keyInfo0.c());
        return groupInfo0 == null ? -1 : groupInfo0.b();
    }

    public final boolean h(@l KeyInfo keyInfo0) {
        L.p(keyInfo0, "keyInfo");
        return this.d.add(keyInfo0);
    }

    public final void i(@l KeyInfo keyInfo0, int v) {
        L.p(keyInfo0, "keyInfo");
        GroupInfo groupInfo0 = new GroupInfo(-1, v, 0);
        this.e.put(keyInfo0.c(), groupInfo0);
    }

    public final void j(int v, int v1, int v2) {
        if(v > v1) {
            Collection collection0 = this.e.values();
            L.o(collection0, "groupInfos.values");
            for(Object object0: collection0) {
                GroupInfo groupInfo0 = (GroupInfo)object0;
                int v3 = groupInfo0.b();
                if(v <= v3 && v3 < v + v2) {
                    groupInfo0.e(v3 - v + v1);
                }
                else if(v1 <= v3 && v3 < v) {
                    groupInfo0.e(v3 + v2);
                }
            }
            return;
        }
        if(v1 > v) {
            Collection collection1 = this.e.values();
            L.o(collection1, "groupInfos.values");
            for(Object object1: collection1) {
                GroupInfo groupInfo1 = (GroupInfo)object1;
                int v4 = groupInfo1.b();
                if(v <= v4 && v4 < v + v2) {
                    groupInfo1.e(v4 - v + v1);
                }
                else if(v + 1 <= v4 && v4 < v1) {
                    groupInfo1.e(v4 - v2);
                }
            }
        }
    }

    public final void k(int v, int v1) {
        if(v > v1) {
            Collection collection0 = this.e.values();
            L.o(collection0, "groupInfos.values");
            for(Object object0: collection0) {
                GroupInfo groupInfo0 = (GroupInfo)object0;
                int v2 = groupInfo0.c();
                if(v2 == v) {
                    groupInfo0.f(v1);
                }
                else if(v1 <= v2 && v2 < v) {
                    groupInfo0.f(v2 + 1);
                }
            }
            return;
        }
        if(v1 > v) {
            Collection collection1 = this.e.values();
            L.o(collection1, "groupInfos.values");
            for(Object object1: collection1) {
                GroupInfo groupInfo1 = (GroupInfo)object1;
                int v3 = groupInfo1.c();
                if(v3 == v) {
                    groupInfo1.f(v1);
                }
                else if(v + 1 <= v3 && v3 < v1) {
                    groupInfo1.f(v3 - 1);
                }
            }
        }
    }

    public final void l(int v) {
        this.c = v;
    }

    public final int m(@l KeyInfo keyInfo0) {
        L.p(keyInfo0, "keyInfo");
        GroupInfo groupInfo0 = (GroupInfo)this.e.get(keyInfo0.c());
        return groupInfo0 == null ? -1 : groupInfo0.c();
    }

    public final boolean n(int v, int v1) {
        GroupInfo groupInfo0 = (GroupInfo)this.e.get(v);
        if(groupInfo0 != null) {
            int v2 = groupInfo0.b();
            int v3 = v1 - groupInfo0.a();
            groupInfo0.d(v1);
            if(v3 != 0) {
                Collection collection0 = this.e.values();
                L.o(collection0, "groupInfos.values");
                for(Object object0: collection0) {
                    GroupInfo groupInfo1 = (GroupInfo)object0;
                    if(groupInfo1.b() >= v2 && !L.g(groupInfo1, groupInfo0)) {
                        int v4 = groupInfo1.b() + v3;
                        if(v4 >= 0) {
                            groupInfo1.e(v4);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int o(@l KeyInfo keyInfo0) {
        L.p(keyInfo0, "keyInfo");
        GroupInfo groupInfo0 = (GroupInfo)this.e.get(keyInfo0.c());
        return groupInfo0 == null ? keyInfo0.d() : groupInfo0.a();
    }
}

