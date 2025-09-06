package com.dcinside.app.backup.process;

import android.content.Context;
import android.text.TextUtils;
import com.dcinside.app.realm.A0;
import com.dcinside.app.realm.c;
import com.dcinside.app.realm.d0;
import com.dcinside.app.util.uk;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.g1;
import java.io.Writer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.A1;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nExportIo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportIo.kt\ncom/dcinside/app/backup/process/ExportIo\n+ 2 WeakReferenceDelegate.kt\ncom/karumi/weak/WeakReferenceDelegateKt\n*L\n1#1,218:1\n8#2:219\n*S KotlinDebug\n*F\n+ 1 ExportIo.kt\ncom/dcinside/app/backup/process/ExportIo\n*L\n27#1:219\n*E\n"})
public final class h {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        public final Object a(@l Context context0, @l String s, @l Writer writer0, @l d d0) {
            @f(c = "com.dcinside.app.backup.process.ExportIo$Companion$exportPostHtml$2", f = "ExportIo.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 10}, l = {0x79, 0x7C, 130, 0x83, 0x84, 0x85, 0x86, 0x88, 0x8D, 0x8F, 0x8D, 0x8F}, m = "invokeSuspend", n = {"exportIo", "defaultFolderName", "items", "exportIo", "defaultFolderName", "items", "first", "exportIo", "defaultFolderName", "item", "url", "first", "exportIo", "defaultFolderName", "item", "url", "first", "exportIo", "defaultFolderName", "item", "first", "exportIo", "defaultFolderName", "first", "exportIo", "defaultFolderName", "first", "exportIo", "defaultFolderName", "first", "exportIo", "exportIo"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "I$0", "L$0", "L$1", "L$4", "L$5", "I$0", "L$0", "L$1", "L$4", "L$5", "I$0", "L$0", "L$1", "L$4", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$0"})
            @s0({"SMAP\nExportIo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportIo.kt\ncom/dcinside/app/backup/process/ExportIo$Companion$exportPostHtml$2\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,218:1\n120#2,3:219\n124#2:224\n120#2,3:225\n124#2:230\n1#3:222\n1#3:228\n1#3:231\n1053#4:223\n37#5:229\n*S KotlinDebug\n*F\n+ 1 ExportIo.kt\ncom/dcinside/app/backup/process/ExportIo$Companion$exportPostHtml$2\n*L\n102#1:219,3\n102#1:224\n116#1:225,3\n116#1:230\n102#1:222\n116#1:228\n103#1:223\n116#1:229\n*E\n"})
            static final class com.dcinside.app.backup.process.h.a.a extends o implements A3.o {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                Object p;
                int q;
                int r;
                final String s;
                final Writer t;
                final Context u;

                com.dcinside.app.backup.process.h.a.a(String s, Writer writer0, Context context0, d d0) {
                    this.s = s;
                    this.t = writer0;
                    this.u = context0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new com.dcinside.app.backup.process.h.a.a(this.s, this.t, this.u, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((com.dcinside.app.backup.process.h.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ExportIo.kt\ncom/dcinside/app/backup/process/ExportIo$Companion$exportPostHtml$2\n*L\n1#1,102:1\n104#2,4:103\n*E\n"})
                    public static final class com.dcinside.app.backup.process.h.a.a.a implements Comparator {
                        final String a;

                        public com.dcinside.app.backup.process.h.a.a.a(String s) {
                            this.a = s;
                            super();
                        }

                        @Override
                        public final int compare(Object object0, Object object1) {
                            String s = null;
                            String s1 = L.g(((c)object0).R5(), this.a) ? null : ((c)object0).R5();
                            if(!L.g(((c)object1).R5(), this.a)) {
                                s = ((c)object1).R5();
                            }
                            return kotlin.comparisons.a.l(s1, s);
                        }
                    }

                    h h5;
                    int v3;
                    g1 g12;
                    F0 f01;
                    c c0;
                    String s7;
                    d0 d02;
                    Iterator iterator7;
                    String s6;
                    String s5;
                    Iterator iterator6;
                    String s4;
                    Iterator iterator5;
                    Iterator iterator4;
                    d0 d01;
                    h h3;
                    String s3;
                    Iterator iterator3;
                    Iterator iterator2;
                    d0 d00;
                    String s2;
                    int v2;
                    h h2;
                    g1 g11;
                    int v1;
                    h h1;
                    String s1;
                    Iterator iterator1;
                    g1 g10;
                    Iterator iterator0;
                    int v;
                    String s;
                    List list0;
                    F0 f00;
                    h h0;
                    Object object1 = b.l();
                    switch(this.r) {
                        case 0: {
                            f0.n(object0);
                            h0 = new h(v.p(("\n            <html>\n            <head>\n            <meta charset=\"utf-8\">\n            <title>dc_contents_" + this.s + "</title>\n            </head>\n            <body>\n            <p>\n            ")), this.t, null);
                            try {
                                L.o("기본", "getString(...)");
                                f00 = F0.g4();
                            }
                            catch(Throwable throwable0) {
                                goto label_236;
                            }
                            try {
                                L.m(f00);
                                list0 = f00.g2(u.u5(com.dcinside.app.realm.d.f.c(f00, 0).S5(), new com.dcinside.app.backup.process.h.a.a.a("기본")));
                                goto label_15;
                            }
                            catch(Throwable throwable1) {
                                try {
                                    kotlin.io.c.a(f00, throwable1);
                                    throw throwable1;
                                label_15:
                                    kotlin.io.c.a(f00, null);
                                    s = "기본";
                                    v = 1;
                                    iterator0 = list0.iterator();
                                    goto label_175;
                                }
                                catch(Throwable throwable0) {
                                    goto label_236;
                                }
                            }
                        }
                        case 1: {
                            g10 = (g1)this.n;
                            iterator1 = (Iterator)this.m;
                            s1 = (String)this.l;
                            h1 = (h)this.k;
                            try {
                                f0.n(object0);
                                v3 = 0;
                                goto label_229;
                            }
                            catch(Throwable throwable0) {
                                goto label_235;
                            }
                        }
                        case 2: {
                            v1 = this.q;
                            g11 = (g1)this.n;
                            iterator0 = (Iterator)this.m;
                            s = (String)this.l;
                            h2 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_224;
                            }
                            catch(Throwable throwable0) {
                                h0 = h2;
                                goto label_236;
                            }
                        }
                        case 3: {
                            v2 = this.q;
                            s2 = (String)this.p;
                            d00 = (d0)this.o;
                            iterator2 = (Iterator)this.n;
                            iterator3 = (Iterator)this.m;
                            s3 = (String)this.l;
                            h3 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_109;
                            }
                            catch(Throwable throwable0) {
                                h0 = h3;
                                goto label_236;
                            }
                        }
                        case 4: {
                            v2 = this.q;
                            s2 = (String)this.p;
                            d00 = (d0)this.o;
                            iterator2 = (Iterator)this.n;
                            iterator3 = (Iterator)this.m;
                            s3 = (String)this.l;
                            h3 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_119;
                            }
                            catch(Throwable throwable0) {
                                h0 = h3;
                                goto label_236;
                            }
                        }
                        case 5: {
                            v2 = this.q;
                            d01 = (d0)this.o;
                            iterator4 = (Iterator)this.n;
                            iterator5 = (Iterator)this.m;
                            s4 = (String)this.l;
                            h h4 = (h)this.k;
                            try {
                                f0.n(object0);
                                h3 = h4;
                                goto label_133;
                            }
                            catch(Throwable throwable0) {
                                h0 = h4;
                                goto label_236;
                            }
                        }
                        case 6: {
                            v2 = this.q;
                            iterator6 = (Iterator)this.n;
                            iterator0 = (Iterator)this.m;
                            s5 = (String)this.l;
                            h2 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_153;
                            }
                            catch(Throwable throwable0) {
                                h0 = h2;
                                goto label_236;
                            }
                        }
                        case 7: {
                            v2 = this.q;
                            iterator6 = (Iterator)this.n;
                            iterator0 = (Iterator)this.m;
                            s5 = (String)this.l;
                            h2 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_161;
                            }
                            catch(Throwable throwable0) {
                                h0 = h2;
                                goto label_236;
                            }
                        }
                        case 8: {
                            v2 = this.q;
                            iterator6 = (Iterator)this.n;
                            iterator0 = (Iterator)this.m;
                            s5 = (String)this.l;
                            h2 = (h)this.k;
                            try {
                                f0.n(object0);
                            }
                            catch(Throwable throwable0) {
                                h0 = h2;
                                goto label_236;
                            }
                            while(true) {
                                s6 = s5;
                                h1 = h2;
                                v = v2;
                                iterator7 = iterator6;
                                try {
                                label_87:
                                    if(!iterator7.hasNext()) {
                                        goto label_173;
                                    }
                                    Object object2 = iterator7.next();
                                    d02 = (d0)object2;
                                    s7 = uk.Pk(d02.U5(), d02.X5());
                                    String s8 = d02.Y5();
                                    this.k = h1;
                                    this.l = s6;
                                    this.m = iterator0;
                                    this.n = iterator7;
                                    this.o = d02;
                                    this.p = s7;
                                    this.q = v;
                                    this.r = 3;
                                    if(h1.g(s8, this) == object1) {
                                        return object1;
                                    }
                                }
                                catch(Throwable throwable0) {
                                    goto label_235;
                                }
                                h3 = h1;
                                iterator2 = iterator7;
                                v2 = v;
                                s2 = s7;
                                s3 = s6;
                                iterator3 = iterator0;
                                d00 = d02;
                                try {
                                label_109:
                                    this.k = h3;
                                    this.l = s3;
                                    this.m = iterator3;
                                    this.n = iterator2;
                                    this.o = d00;
                                    this.p = s2;
                                    this.q = v2;
                                    this.r = 4;
                                    if(h3.g("<br>", this) == object1) {
                                        return object1;
                                    }
                                label_119:
                                    this.k = h3;
                                    this.l = s3;
                                    this.m = iterator3;
                                    this.n = iterator2;
                                    this.o = d00;
                                    this.p = null;
                                    this.q = v2;
                                    this.r = 5;
                                    if(h3.g("<a href=\"" + s2 + "\">" + s2 + "</a><br>", this) == object1) {
                                        return object1;
                                    }
                                    d01 = d00;
                                    iterator4 = iterator2;
                                    iterator5 = iterator3;
                                    s4 = s3;
                                label_133:
                                    String s9 = d01.V5();
                                    String s10 = d01.a6();
                                    String s11 = d01.S5();
                                    this.k = h3;
                                    this.l = s4;
                                    this.m = iterator5;
                                    this.n = iterator4;
                                    this.o = null;
                                    this.q = v2;
                                    this.r = 6;
                                    if(h3.g(s9 + " | " + s10 + " | " + s11 + "<br>", this) == object1) {
                                        return object1;
                                    }
                                }
                                catch(Throwable throwable0) {
                                    h0 = h3;
                                    goto label_236;
                                }
                                iterator6 = iterator4;
                                iterator0 = iterator5;
                                s5 = s4;
                                h2 = h3;
                                try {
                                label_153:
                                    this.k = h2;
                                    this.l = s5;
                                    this.m = iterator0;
                                    this.n = iterator6;
                                    this.q = v2;
                                    this.r = 7;
                                    if(h2.g("<br>", this) == object1) {
                                        return object1;
                                    }
                                label_161:
                                    this.k = h2;
                                    this.l = s5;
                                    this.m = iterator0;
                                    this.n = iterator6;
                                    this.q = v2;
                                    this.r = 8;
                                    if(A1.a(this) != object1) {
                                        continue;
                                    }
                                    return object1;
                                }
                                catch(Throwable throwable0) {
                                }
                                break;
                            }
                            h0 = h2;
                            goto label_236;
                            try {
                            label_173:
                                h0 = h1;
                                s = s6;
                            }
                            catch(Throwable throwable0) {
                                goto label_235;
                            }
                            try {
                                while(true) {
                                label_175:
                                    if(!iterator0.hasNext()) {
                                        goto label_245;
                                    }
                                    Object object3 = iterator0.next();
                                    L.o(object3, "next(...)");
                                    c0 = (c)object3;
                                    f01 = F0.g4();
                                    break;
                                }
                            }
                            catch(Throwable throwable0) {
                                goto label_236;
                            }
                            try {
                                L.m(f01);
                                RealmQuery realmQuery0 = f01.C4(d0.class);
                                L.o(realmQuery0, "this.where(T::class.java)");
                                g12 = realmQuery0.g0("folder.key", kotlin.coroutines.jvm.internal.b.g(c0.Q5())).p0().A();
                                goto label_188;
                            }
                            catch(Throwable throwable2) {
                                try {
                                    kotlin.io.c.a(f01, throwable2);
                                    throw throwable2;
                                label_188:
                                    kotlin.io.c.a(f01, null);
                                    L.m(g12);
                                    if(g12.isEmpty()) {
                                        g12 = null;
                                    }
                                    if(g12 == null) {
                                        goto label_175;
                                    }
                                    String s12 = c0.R5();
                                    if(s12 == null) {
                                        s12 = s;
                                    }
                                    if(v == 0) {
                                        this.k = h0;
                                        this.l = s;
                                        this.m = iterator0;
                                        this.n = g12;
                                        this.q = 0;
                                        this.r = 2;
                                        if(h0.g("</p><p><strong>" + s12 + "</strong><br>", this) == object1) {
                                            return object1;
                                        }
                                        goto label_221;
                                    }
                                    else {
                                        this.k = h0;
                                        this.l = s;
                                        this.m = iterator0;
                                        this.n = g12;
                                        this.r = 1;
                                        if(h0.g("<strong>" + s12 + "</strong><br>", this) == object1) {
                                            return object1;
                                        }
                                        iterator1 = iterator0;
                                        s1 = s;
                                        h1 = h0;
                                        g10 = g12;
                                        v3 = 0;
                                    }
                                    goto label_229;
                                }
                                catch(Throwable throwable0) {
                                    goto label_236;
                                }
                            }
                            return object1;
                        label_221:
                            h2 = h0;
                            v1 = 0;
                            g11 = g12;
                        label_224:
                            v3 = v1;
                            g10 = g11;
                            iterator1 = iterator0;
                            s1 = s;
                            h1 = h2;
                            try {
                            label_229:
                                v = v3;
                                s6 = s1;
                                iterator0 = iterator1;
                                iterator7 = g10.iterator();
                                goto label_87;
                            }
                            catch(Throwable throwable0) {
                            label_235:
                                h0 = h1;
                            }
                        label_236:
                            this.k = h0;
                            this.l = throwable0;
                            this.m = null;
                            this.n = null;
                            this.o = null;
                            this.p = null;
                            this.r = 11;
                            if(h0.g("</p></body></html>", this) == object1) {
                                return object1;
                            label_245:
                                this.k = h0;
                                this.l = null;
                                this.m = null;
                                this.n = null;
                                this.r = 9;
                                if(h0.g("</p></body></html>", this) == object1) {
                                    return object1;
                                }
                                h5 = h0;
                                this.k = null;
                                this.r = 10;
                                return h5.h(this) == object1 ? object1 : S0.a;
                            }
                            goto label_264;
                        }
                        case 9: {
                            h5 = (h)this.k;
                            f0.n(object0);
                            this.k = null;
                            this.r = 10;
                            return h5.h(this) == object1 ? object1 : S0.a;
                        }
                        case 10: {
                            f0.n(object0);
                            return S0.a;
                        }
                        case 11: {
                            throwable0 = (Throwable)this.l;
                            h0 = (h)this.k;
                            f0.n(object0);
                        label_264:
                            this.k = throwable0;
                            this.l = null;
                            this.r = 12;
                            if(h0.h(this) != object1) {
                                throw throwable0;
                            }
                            return object1;
                        }
                        case 12: {
                            break;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    throwable0 = (Throwable)this.k;
                    f0.n(object0);
                    throw throwable0;
                }
            }

            Object object0 = i.h(h0.a(), new com.dcinside.app.backup.process.h.a.a(s, writer0, context0, null), d0);
            return object0 == b.l() ? object0 : S0.a;
        }

        @m
        public final Object b(@l Context context0, @l String s, @l Writer writer0, @l d d0) {
            @f(c = "com.dcinside.app.backup.process.ExportIo$Companion$exportVoiceHtml$2", f = "ExportIo.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 14}, l = {0xB8, 0xBB, 0xC1, 0xC2, 0xC4, 0xC5, 0xC7, 200, 201, 202, 203, 205, 210, 0xD4, 210, 0xD4}, m = "invokeSuspend", n = {"exportIo", "defaultFolderName", "items", "exportIo", "defaultFolderName", "items", "first", "exportIo", "defaultFolderName", "item", "url", "first", "exportIo", "defaultFolderName", "item", "url", "first", "exportIo", "defaultFolderName", "item", "url", "first", "exportIo", "defaultFolderName", "item", "url", "first", "exportIo", "defaultFolderName", "item", "url", "first", "exportIo", "defaultFolderName", "item", "url", "first", "exportIo", "defaultFolderName", "item", "first", "exportIo", "defaultFolderName", "first", "exportIo", "defaultFolderName", "first", "exportIo", "defaultFolderName", "first", "exportIo", "exportIo"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "I$0", "L$0", "L$1", "L$4", "L$5", "I$0", "L$0", "L$1", "L$4", "L$5", "I$0", "L$0", "L$1", "L$4", "L$5", "I$0", "L$0", "L$1", "L$4", "L$5", "I$0", "L$0", "L$1", "L$4", "L$5", "I$0", "L$0", "L$1", "L$4", "L$5", "I$0", "L$0", "L$1", "L$4", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$0"})
            @s0({"SMAP\nExportIo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportIo.kt\ncom/dcinside/app/backup/process/ExportIo$Companion$exportVoiceHtml$2\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,218:1\n120#2,3:219\n124#2:224\n120#2,3:225\n124#2:230\n1#3:222\n1#3:228\n1#3:231\n1053#4:223\n37#5:229\n*S KotlinDebug\n*F\n+ 1 ExportIo.kt\ncom/dcinside/app/backup/process/ExportIo$Companion$exportVoiceHtml$2\n*L\n165#1:219,3\n165#1:224\n179#1:225,3\n179#1:230\n165#1:222\n179#1:228\n166#1:223\n179#1:229\n*E\n"})
            static final class com.dcinside.app.backup.process.h.a.b extends o implements A3.o {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                Object p;
                int q;
                int r;
                final String s;
                final Writer t;
                final Context u;

                com.dcinside.app.backup.process.h.a.b(String s, Writer writer0, Context context0, d d0) {
                    this.s = s;
                    this.t = writer0;
                    this.u = context0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new com.dcinside.app.backup.process.h.a.b(this.s, this.t, this.u, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((com.dcinside.app.backup.process.h.a.b)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ExportIo.kt\ncom/dcinside/app/backup/process/ExportIo$Companion$exportVoiceHtml$2\n*L\n1#1,102:1\n167#2,4:103\n*E\n"})
                    public static final class com.dcinside.app.backup.process.h.a.b.a implements Comparator {
                        final String a;

                        public com.dcinside.app.backup.process.h.a.b.a(String s) {
                            this.a = s;
                            super();
                        }

                        @Override
                        public final int compare(Object object0, Object object1) {
                            String s = null;
                            String s1 = L.g(((c)object0).R5(), this.a) ? null : ((c)object0).R5();
                            if(!L.g(((c)object1).R5(), this.a)) {
                                s = ((c)object1).R5();
                            }
                            return kotlin.comparisons.a.l(s1, s);
                        }
                    }

                    h h5;
                    int v3;
                    g1 g12;
                    F0 f01;
                    c c0;
                    String s7;
                    A0 a02;
                    String s6;
                    Iterator iterator7;
                    String s5;
                    Iterator iterator6;
                    h h4;
                    String s4;
                    Iterator iterator5;
                    Iterator iterator4;
                    A0 a01;
                    h h3;
                    String s3;
                    Iterator iterator3;
                    Iterator iterator2;
                    A0 a00;
                    String s2;
                    int v2;
                    h h2;
                    g1 g11;
                    int v1;
                    h h1;
                    String s1;
                    Iterator iterator1;
                    g1 g10;
                    Iterator iterator0;
                    int v;
                    String s;
                    List list0;
                    F0 f00;
                    h h0;
                    Object object1 = b.l();
                    switch(this.r) {
                        case 0: {
                            f0.n(object0);
                            h0 = new h(v.p(("\n            <html>\n            <head>\n            <meta charset=\"utf-8\">\n            <title>dc_voice_" + this.s + "</title>\n            </head>\n            <body>\n            <p>\n            ")), this.t, null);
                            try {
                                L.o("기본", "getString(...)");
                                f00 = F0.g4();
                            }
                            catch(Throwable throwable0) {
                                goto label_316;
                            }
                            try {
                                L.m(f00);
                                list0 = f00.g2(u.u5(com.dcinside.app.realm.d.f.c(f00, 1).S5(), new com.dcinside.app.backup.process.h.a.b.a("기본")));
                                goto label_15;
                            }
                            catch(Throwable throwable1) {
                                try {
                                    kotlin.io.c.a(f00, throwable1);
                                    throw throwable1;
                                label_15:
                                    kotlin.io.c.a(f00, null);
                                    s = "기본";
                                    v = 1;
                                    iterator0 = list0.iterator();
                                    goto label_255;
                                }
                                catch(Throwable throwable0) {
                                    goto label_316;
                                }
                            }
                        }
                        case 1: {
                            g10 = (g1)this.n;
                            iterator1 = (Iterator)this.m;
                            s1 = (String)this.l;
                            h1 = (h)this.k;
                            try {
                                f0.n(object0);
                                v3 = 0;
                                goto label_309;
                            }
                            catch(Throwable throwable0) {
                                goto label_315;
                            }
                        }
                        case 2: {
                            v1 = this.q;
                            g11 = (g1)this.n;
                            iterator0 = (Iterator)this.m;
                            s = (String)this.l;
                            h2 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_304;
                            }
                            catch(Throwable throwable0) {
                                h0 = h2;
                                goto label_316;
                            }
                        }
                        case 3: {
                            v2 = this.q;
                            s2 = (String)this.p;
                            a00 = (A0)this.o;
                            iterator2 = (Iterator)this.n;
                            iterator3 = (Iterator)this.m;
                            s3 = (String)this.l;
                            h3 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_141;
                            }
                            catch(Throwable throwable0) {
                                h0 = h3;
                                goto label_316;
                            }
                        }
                        case 4: {
                            v2 = this.q;
                            s2 = (String)this.p;
                            a00 = (A0)this.o;
                            iterator2 = (Iterator)this.n;
                            iterator3 = (Iterator)this.m;
                            s3 = (String)this.l;
                            h3 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_151;
                            }
                            catch(Throwable throwable0) {
                                h0 = h3;
                                goto label_316;
                            }
                        }
                        case 5: {
                            v2 = this.q;
                            s2 = (String)this.p;
                            a00 = (A0)this.o;
                            iterator2 = (Iterator)this.n;
                            iterator3 = (Iterator)this.m;
                            s3 = (String)this.l;
                            h3 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_163;
                            }
                            catch(Throwable throwable0) {
                                h0 = h3;
                                goto label_316;
                            }
                        }
                        case 6: {
                            v2 = this.q;
                            s2 = (String)this.p;
                            a00 = (A0)this.o;
                            iterator2 = (Iterator)this.n;
                            iterator3 = (Iterator)this.m;
                            s3 = (String)this.l;
                            h3 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_173;
                            }
                            catch(Throwable throwable0) {
                                h0 = h3;
                                goto label_316;
                            }
                        }
                        case 7: {
                            v2 = this.q;
                            s2 = (String)this.p;
                            a00 = (A0)this.o;
                            iterator2 = (Iterator)this.n;
                            iterator3 = (Iterator)this.m;
                            s3 = (String)this.l;
                            h3 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_184;
                            }
                            catch(Throwable throwable0) {
                                h0 = h3;
                                goto label_316;
                            }
                        }
                        case 8: {
                            v2 = this.q;
                            s2 = (String)this.p;
                            a00 = (A0)this.o;
                            iterator2 = (Iterator)this.n;
                            iterator3 = (Iterator)this.m;
                            s3 = (String)this.l;
                            h3 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_194;
                            }
                            catch(Throwable throwable0) {
                                h0 = h3;
                                goto label_316;
                            }
                        }
                        case 9: {
                            v2 = this.q;
                            a01 = (A0)this.o;
                            iterator4 = (Iterator)this.n;
                            iterator5 = (Iterator)this.m;
                            s4 = (String)this.l;
                            h4 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_213;
                            }
                            catch(Throwable throwable0) {
                                h0 = h4;
                                goto label_316;
                            }
                        }
                        case 10: {
                            v2 = this.q;
                            iterator6 = (Iterator)this.n;
                            iterator0 = (Iterator)this.m;
                            s5 = (String)this.l;
                            h2 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_233;
                            }
                            catch(Throwable throwable0) {
                                h0 = h2;
                                goto label_316;
                            }
                        }
                        case 11: {
                            v2 = this.q;
                            iterator6 = (Iterator)this.n;
                            iterator0 = (Iterator)this.m;
                            s5 = (String)this.l;
                            h2 = (h)this.k;
                            try {
                                f0.n(object0);
                                goto label_241;
                            }
                            catch(Throwable throwable0) {
                                h0 = h2;
                                goto label_316;
                            }
                        }
                        case 12: {
                            v2 = this.q;
                            iterator6 = (Iterator)this.n;
                            iterator0 = (Iterator)this.m;
                            s5 = (String)this.l;
                            h2 = (h)this.k;
                            try {
                                f0.n(object0);
                            }
                            catch(Throwable throwable0) {
                                h0 = h2;
                                goto label_316;
                            }
                            while(true) {
                                v = v2;
                                iterator7 = iterator6;
                                s6 = s5;
                                h1 = h2;
                                try {
                                label_119:
                                    if(!iterator7.hasNext()) {
                                        goto label_253;
                                    }
                                    Object object2 = iterator7.next();
                                    a02 = (A0)object2;
                                    s7 = uk.Pk(a02.S5(), a02.V5());
                                    String s8 = a02.W5();
                                    this.k = h1;
                                    this.l = s6;
                                    this.m = iterator0;
                                    this.n = iterator7;
                                    this.o = a02;
                                    this.p = s7;
                                    this.q = v;
                                    this.r = 3;
                                    if(h1.g(s8, this) == object1) {
                                        return object1;
                                    }
                                }
                                catch(Throwable throwable0) {
                                    goto label_315;
                                }
                                iterator2 = iterator7;
                                v2 = v;
                                s2 = s7;
                                h3 = h1;
                                iterator3 = iterator0;
                                a00 = a02;
                                s3 = s6;
                                try {
                                label_141:
                                    this.k = h3;
                                    this.l = s3;
                                    this.m = iterator3;
                                    this.n = iterator2;
                                    this.o = a00;
                                    this.p = s2;
                                    this.q = v2;
                                    this.r = 4;
                                    if(h3.g("<br>", this) == object1) {
                                        return object1;
                                    }
                                label_151:
                                    if(!TextUtils.isEmpty(a00.U5())) {
                                        String s9 = a00.U5();
                                        this.k = h3;
                                        this.l = s3;
                                        this.m = iterator3;
                                        this.n = iterator2;
                                        this.o = a00;
                                        this.p = s2;
                                        this.q = v2;
                                        this.r = 5;
                                        if(h3.g(s9, this) == object1) {
                                            return object1;
                                        }
                                    label_163:
                                        this.k = h3;
                                        this.l = s3;
                                        this.m = iterator3;
                                        this.n = iterator2;
                                        this.o = a00;
                                        this.p = s2;
                                        this.q = v2;
                                        this.r = 6;
                                        if(h3.g("<br>", this) == object1) {
                                            return object1;
                                        }
                                    }
                                label_173:
                                    String s10 = a00.X5();
                                    this.k = h3;
                                    this.l = s3;
                                    this.m = iterator3;
                                    this.n = iterator2;
                                    this.o = a00;
                                    this.p = s2;
                                    this.q = v2;
                                    this.r = 7;
                                    if(h3.g(s10, this) == object1) {
                                        return object1;
                                    }
                                label_184:
                                    this.k = h3;
                                    this.l = s3;
                                    this.m = iterator3;
                                    this.n = iterator2;
                                    this.o = a00;
                                    this.p = s2;
                                    this.q = v2;
                                    this.r = 8;
                                    if(h3.g("<br>", this) == object1) {
                                        return object1;
                                    }
                                label_194:
                                    this.k = h3;
                                    this.l = s3;
                                    this.m = iterator3;
                                    this.n = iterator2;
                                    this.o = a00;
                                    this.p = null;
                                    this.q = v2;
                                    this.r = 9;
                                    if(h3.g("<a href=\"" + s2 + "\">" + s2 + "</a><br>", this) == object1) {
                                        return object1;
                                    }
                                }
                                catch(Throwable throwable0) {
                                    h0 = h3;
                                    goto label_316;
                                }
                                a01 = a00;
                                iterator4 = iterator2;
                                iterator5 = iterator3;
                                s4 = s3;
                                h4 = h3;
                                try {
                                label_213:
                                    String s11 = a01.T5();
                                    String s12 = a01.Z5();
                                    String s13 = a01.Q5();
                                    this.k = h4;
                                    this.l = s4;
                                    this.m = iterator5;
                                    this.n = iterator4;
                                    this.o = null;
                                    this.q = v2;
                                    this.r = 10;
                                    if(h4.g(s11 + " | " + s12 + " | " + s13 + "<br>", this) == object1) {
                                        return object1;
                                    }
                                }
                                catch(Throwable throwable0) {
                                    h0 = h4;
                                    goto label_316;
                                }
                                iterator6 = iterator4;
                                iterator0 = iterator5;
                                s5 = s4;
                                h2 = h4;
                                try {
                                label_233:
                                    this.k = h2;
                                    this.l = s5;
                                    this.m = iterator0;
                                    this.n = iterator6;
                                    this.q = v2;
                                    this.r = 11;
                                    if(h2.g("<br>", this) == object1) {
                                        return object1;
                                    }
                                label_241:
                                    this.k = h2;
                                    this.l = s5;
                                    this.m = iterator0;
                                    this.n = iterator6;
                                    this.q = v2;
                                    this.r = 12;
                                    if(A1.a(this) != object1) {
                                        continue;
                                    }
                                    return object1;
                                }
                                catch(Throwable throwable0) {
                                }
                                break;
                            }
                            h0 = h2;
                            goto label_316;
                            try {
                            label_253:
                                h0 = h1;
                                s = s6;
                            }
                            catch(Throwable throwable0) {
                                goto label_315;
                            }
                            try {
                                while(true) {
                                label_255:
                                    if(!iterator0.hasNext()) {
                                        goto label_325;
                                    }
                                    Object object3 = iterator0.next();
                                    L.o(object3, "next(...)");
                                    c0 = (c)object3;
                                    f01 = F0.g4();
                                    break;
                                }
                            }
                            catch(Throwable throwable0) {
                                goto label_316;
                            }
                            try {
                                L.m(f01);
                                RealmQuery realmQuery0 = f01.C4(A0.class);
                                L.o(realmQuery0, "this.where(T::class.java)");
                                g12 = realmQuery0.g0("folder.key", kotlin.coroutines.jvm.internal.b.g(c0.Q5())).p0().A();
                                goto label_268;
                            }
                            catch(Throwable throwable2) {
                                try {
                                    kotlin.io.c.a(f01, throwable2);
                                    throw throwable2;
                                label_268:
                                    kotlin.io.c.a(f01, null);
                                    L.m(g12);
                                    if(g12.isEmpty()) {
                                        g12 = null;
                                    }
                                    if(g12 == null) {
                                        goto label_255;
                                    }
                                    String s14 = c0.R5();
                                    if(s14 == null) {
                                        s14 = s;
                                    }
                                    if(v == 0) {
                                        this.k = h0;
                                        this.l = s;
                                        this.m = iterator0;
                                        this.n = g12;
                                        this.q = 0;
                                        this.r = 2;
                                        if(h0.g("</p><p><strong>" + s14 + "</strong><br>", this) == object1) {
                                            return object1;
                                        }
                                        goto label_301;
                                    }
                                    else {
                                        this.k = h0;
                                        this.l = s;
                                        this.m = iterator0;
                                        this.n = g12;
                                        this.r = 1;
                                        if(h0.g("<strong>" + s14 + "</strong><br>", this) == object1) {
                                            return object1;
                                        }
                                        iterator1 = iterator0;
                                        s1 = s;
                                        h1 = h0;
                                        g10 = g12;
                                        v3 = 0;
                                    }
                                    goto label_309;
                                }
                                catch(Throwable throwable0) {
                                    goto label_316;
                                }
                            }
                            return object1;
                        label_301:
                            h2 = h0;
                            v1 = 0;
                            g11 = g12;
                        label_304:
                            v3 = v1;
                            g10 = g11;
                            iterator1 = iterator0;
                            s1 = s;
                            h1 = h2;
                            try {
                            label_309:
                                iterator0 = iterator1;
                                v = v3;
                                s6 = s1;
                                iterator7 = g10.iterator();
                                goto label_119;
                            }
                            catch(Throwable throwable0) {
                            label_315:
                                h0 = h1;
                            }
                        label_316:
                            this.k = h0;
                            this.l = throwable0;
                            this.m = null;
                            this.n = null;
                            this.o = null;
                            this.p = null;
                            this.r = 15;
                            if(h0.g("</p></body></html>", this) == object1) {
                                return object1;
                            label_325:
                                this.k = h0;
                                this.l = null;
                                this.m = null;
                                this.n = null;
                                this.r = 13;
                                if(h0.g("</p></body></html>", this) == object1) {
                                    return object1;
                                }
                                h5 = h0;
                                this.k = null;
                                this.r = 14;
                                return h5.h(this) == object1 ? object1 : S0.a;
                            }
                            goto label_344;
                        }
                        case 13: {
                            h5 = (h)this.k;
                            f0.n(object0);
                            this.k = null;
                            this.r = 14;
                            return h5.h(this) == object1 ? object1 : S0.a;
                        }
                        case 14: {
                            f0.n(object0);
                            return S0.a;
                        }
                        case 15: {
                            throwable0 = (Throwable)this.l;
                            h0 = (h)this.k;
                            f0.n(object0);
                        label_344:
                            this.k = throwable0;
                            this.l = null;
                            this.r = 16;
                            if(h0.h(this) != object1) {
                                throw throwable0;
                            }
                            return object1;
                        }
                        case 16: {
                            break;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    throwable0 = (Throwable)this.k;
                    f0.n(object0);
                    throw throwable0;
                }
            }

            Object object0 = i.h(h0.c(), new com.dcinside.app.backup.process.h.a.b(s, writer0, context0, null), d0);
            return object0 == b.l() ? object0 : S0.a;
        }
    }

    @l
    private final F2.a a;
    @l
    private StringBuilder b;
    private int c;
    @m
    private I0 d;
    @l
    public static final a e;
    static final kotlin.reflect.o[] f;

    static {
        h.f = new kotlin.reflect.o[]{m0.u(new kotlin.jvm.internal.h0(h.class, "writer", "getWriter()Ljava/io/Writer;", 0))};
        h.e = new a(null);
    }

    private h(String s, Writer writer0) {
        this.a = new F2.a(writer0);
        this.b = new StringBuilder(s);
    }

    public h(String s, Writer writer0, w w0) {
        this(s, writer0);
    }

    public static final Object f(h h0, d d0) {
        return h0.j(d0);
    }

    @m
    public final Object g(@m String s, @l d d0) {
        StringBuilder stringBuilder0 = this.b;
        if(s == null) {
            return S0.a;
        }
        stringBuilder0.append(s);
        int v = this.c + 1;
        this.c = v;
        if(v % 10000 == 0) {
            Object object0 = this.j(d0);
            return object0 == b.l() ? object0 : S0.a;
        }
        return S0.a;
    }

    @m
    public final Object h(@l d d0) {
        @f(c = "com.dcinside.app.backup.process.ExportIo", f = "ExportIo.kt", i = {0}, l = {62}, m = "flush", n = {"this"}, s = {"L$0"})
        static final class com.dcinside.app.backup.process.h.b extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            final h m;
            int n;

            com.dcinside.app.backup.process.h.b(h h0, d d0) {
                this.m = h0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.n |= 0x80000000;
                return this.m.h(this);
            }
        }

        h h0;
        com.dcinside.app.backup.process.h.b h$b0;
        if(d0 instanceof com.dcinside.app.backup.process.h.b) {
            h$b0 = (com.dcinside.app.backup.process.h.b)d0;
            int v = h$b0.n;
            if((v & 0x80000000) == 0) {
                h$b0 = new com.dcinside.app.backup.process.h.b(this, d0);
            }
            else {
                h$b0.n = v ^ 0x80000000;
            }
        }
        else {
            h$b0 = new com.dcinside.app.backup.process.h.b(this, d0);
        }
        Object object0 = h$b0.l;
        Object object1 = b.l();
        switch(h$b0.n) {
            case 0: {
                f0.n(object0);
                I0 i00 = this.d;
                if(i00 != null) {
                    h$b0.k = this;
                    h$b0.n = 1;
                    if(i00.c1(h$b0) == object1) {
                        return object1;
                    }
                }
                h0 = this;
                break;
            }
            case 1: {
                h0 = (h)h$b0.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(h0.b.length() > 0) {
            Writer writer0 = h0.i();
            if(writer0 != null) {
                writer0.append(h0.b);
            }
        }
        return S0.a;
    }

    private final Writer i() {
        return (Writer)this.a.a(this, h.f[0]);
    }

    private final Object j(d d0) {
        @f(c = "com.dcinside.app.backup.process.ExportIo$writeAsync$2", f = "ExportIo.kt", i = {0}, l = {43}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
        static final class com.dcinside.app.backup.process.h.c extends o implements A3.o {
            int k;
            private Object l;
            final h m;

            com.dcinside.app.backup.process.h.c(h h0, d d0) {
                this.m = h0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.dcinside.app.backup.process.h.c(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.backup.process.h.c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.backup.process.ExportIo$writeAsync$2$job$1", f = "ExportIo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.backup.process.h.c.a extends o implements A3.o {
                    int k;
                    final StringBuilder l;
                    final h m;

                    com.dcinside.app.backup.process.h.c.a(StringBuilder stringBuilder0, h h0, d d0) {
                        this.l = stringBuilder0;
                        this.m = h0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.backup.process.h.c.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.backup.process.h.c.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        if(this.l.length() > 0) {
                            Writer writer0 = this.m.i();
                            if(writer0 != null) {
                                writer0.append(this.l);
                            }
                        }
                        return S0.a;
                    }
                }

                O o1;
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        I0 i00 = this.m.d;
                        if(i00 != null) {
                            this.l = o0;
                            this.k = 1;
                            if(i00.c1(this) == object1) {
                                return object1;
                            }
                        }
                        o1 = o0;
                        break;
                    }
                    case 1: {
                        O o2 = (O)this.l;
                        f0.n(object0);
                        o1 = o2;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                StringBuilder stringBuilder0 = new StringBuilder();
                this.m.b = stringBuilder0;
                I0 i01 = k.f(o1, h0.c(), null, new com.dcinside.app.backup.process.h.c.a(this.m.b, this.m, null), 2, null);
                this.m.d = i01;
                return i01;
            }
        }

        return i.h(h0.a(), new com.dcinside.app.backup.process.h.c(this, null), d0);
    }
}

