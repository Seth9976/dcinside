package com.dcinside.app.album;

import android.database.Cursor;
import com.dcinside.app.album.picker.PickerItem;
import com.dcinside.app.util.zk;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyCursorExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyCursorExtractor.kt\ncom/dcinside/app/album/LazyCursorExtractor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1#2:81\n1863#3,2:82\n*S KotlinDebug\n*F\n+ 1 LazyCursorExtractor.kt\ncom/dcinside/app/album/LazyCursorExtractor\n*L\n73#1:82,2\n*E\n"})
public final class j {
    @m
    private final Cursor a;
    @l
    private final Function1 b;
    private final int c;
    @l
    private final List d;
    @m
    private I0 e;
    @l
    private ConcurrentHashMap f;

    public j(@l O o0, @m Cursor cursor0, @l Function1 function10) {
        @f(c = "com.dcinside.app.album.LazyCursorExtractor$1", f = "LazyCursorExtractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nLazyCursorExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyCursorExtractor.kt\ncom/dcinside/app/album/LazyCursorExtractor$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1#2:81\n1863#3,2:82\n*S KotlinDebug\n*F\n+ 1 LazyCursorExtractor.kt\ncom/dcinside/app/album/LazyCursorExtractor$1\n*L\n47#1:82,2\n*E\n"})
        static final class a extends o implements A3.o {
            int k;
            private Object l;
            final j m;

            a(j j0, d d0) {
                this.m = j0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new a(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Cursor cursor1;
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                O o0 = (O)this.l;
                Cursor cursor0 = null;
                try {
                    if(this.m.a != null && this.m.a.moveToFirst()) {
                        do {
                            PickerItem pickerItem0 = (PickerItem)this.m.b.invoke(this.m.a);
                            int v = this.m.f().size();
                            if(pickerItem0 != null) {
                                this.m.f().add(pickerItem0);
                            }
                            Object object1 = this.m.f.get(b.f(v));
                            if(object1 != null) {
                                synchronized(object1) {
                                    object1.notifyAll();
                                }
                            }
                        }
                        while(pickerItem0 != null && P.k(o0) && !this.m.a.isClosed() && this.m.a.moveToNext());
                    }
                    goto label_64;
                }
                catch(Exception exception0) {
                    goto label_22;
                }
                catch(Throwable throwable0) {
                }
                try {
                    try {
                        goto label_44;
                    }
                    catch(Exception exception0) {
                    }
                label_22:
                    exception0.printStackTrace();
                    zk.a(exception0);
                    cursor1 = this.m.a;
                    if(cursor1 != null) {
                        goto label_26;
                    }
                    goto label_30;
                }
                catch(Throwable throwable0) {
                    goto label_44;
                }
            label_26:
                if(!cursor1.isClosed()) {
                    cursor0 = cursor1;
                }
                if(cursor0 != null) {
                    cursor0.close();
                }
            label_30:
                Collection collection0 = this.m.f.values();
                L.o(collection0, "<get-values>(...)");
                for(Object object2: u.s2(collection0)) {
                    L.m(object2);
                    synchronized(object2) {
                        object2.notifyAll();
                    }
                }
                return S0.a;
            label_44:
                Cursor cursor2 = this.m.a;
                if(cursor2 != null) {
                    if(!cursor2.isClosed()) {
                        cursor0 = cursor2;
                    }
                    if(cursor0 != null) {
                        cursor0.close();
                    }
                }
                Collection collection1 = this.m.f.values();
                L.o(collection1, "<get-values>(...)");
                for(Object object3: u.s2(collection1)) {
                    L.m(object3);
                    synchronized(object3) {
                        object3.notifyAll();
                    }
                }
                throw throwable0;
            label_64:
                Cursor cursor3 = this.m.a;
                if(cursor3 != null) {
                    if(!cursor3.isClosed()) {
                        cursor0 = cursor3;
                    }
                    if(cursor0 != null) {
                        cursor0.close();
                    }
                }
                Collection collection2 = this.m.f.values();
                L.o(collection2, "<get-values>(...)");
                for(Object object4: u.s2(collection2)) {
                    L.m(object4);
                    synchronized(object4) {
                        object4.notifyAll();
                    }
                }
                return S0.a;
            }
        }

        L.p(o0, "scope");
        L.p(function10, "rowExtractor");
        super();
        this.a = cursor0;
        this.b = function10;
        this.c = cursor0 == null ? 0 : cursor0.getCount();
        this.d = new ArrayList();
        this.f = new ConcurrentHashMap();
        this.e = k.f(o0, null, null, new a(this, null), 3, null);
    }

    @m
    public final PickerItem d(int v) {
        if(this.d.size() <= v && (this.e != null && this.e.isActive())) {
            Object object0 = new Object();
            synchronized(object0) {
                this.f.put(v, object0);
                object0.wait();
                this.f.remove(v);
            }
        }
        return this.d.size() > v ? ((PickerItem)this.d.get(v)) : null;
    }

    private static void e() {
    }

    @l
    public final List f() {
        return this.d;
    }

    public final int g() {
        return this.c;
    }

    public final void h() {
        I0 i00 = this.e;
        Cursor cursor0 = null;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        Cursor cursor1 = this.a;
        if(cursor1 != null) {
            if(!cursor1.isClosed()) {
                cursor0 = cursor1;
            }
            if(cursor0 != null) {
                cursor0.close();
            }
        }
        Collection collection0 = this.f.values();
        L.o(collection0, "<get-values>(...)");
        for(Object object0: u.s2(collection0)) {
            L.m(object0);
            synchronized(object0) {
                object0.notifyAll();
            }
        }
        this.d.clear();
    }
}

