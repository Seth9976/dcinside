package com.dcinside.app.ad.util;

import com.dcinside.app.util.jl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.io.y;
import kotlin.jvm.internal.s0;
import kotlin.text.f;
import kotlin.text.v;
import y4.l;

@s0({"SMAP\nAdBlockDetect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdBlockDetect.kt\ncom/dcinside/app/ad/util/AdBlockDetect\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 5 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,100:1\n774#2:101\n865#2,2:102\n774#2:105\n865#2,2:106\n1557#2:108\n1628#2,3:109\n1755#2,3:117\n774#2:129\n865#2,2:130\n774#2:132\n865#2,2:133\n1755#2,3:135\n1#3:104\n1#3:116\n54#4,4:112\n177#5,9:120\n*S KotlinDebug\n*F\n+ 1 AdBlockDetect.kt\ncom/dcinside/app/ad/util/AdBlockDetect\n*L\n34#1:101\n34#1:102,2\n38#1:105\n38#1:106,2\n41#1:108\n41#1:109,3\n46#1:117,3\n74#1:129\n74#1:130,2\n86#1:132\n86#1:133,2\n90#1:135,3\n44#1:116\n44#1:112,4\n61#1:120,9\n*E\n"})
public final class b {
    @l
    public static final b a;
    private static long b;
    private static boolean c;

    static {
        b.a = new b();
    }

    private final boolean a() {
        List list2;
        String s = jl.a.t();
        if(s != null) {
            List list0 = v.V4(s, new String[]{","}, false, 0, 6, null);
            if(list0 != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: list0) {
                    if(((String)object0).length() > 0) {
                        arrayList0.add(object0);
                    }
                }
                if(arrayList0.isEmpty()) {
                    arrayList0 = null;
                }
                if(arrayList0 != null) {
                    int v = arrayList0.size();
                    long v1 = jl.a.s();
                    int v2 = 0;
                    int v3 = 0;
                    Iterator iterator1 = arrayList0.iterator();
                    while(iterator1.hasNext()) {
                        ++v2;
                        Object object1 = iterator1.next();
                        if(this.d(((String)object1))) {
                            ++v3;
                            if(((long)v3) >= v1) {
                                String s1 = jl.a.r();
                                if(s1 == null) {
                                    list2 = u.H();
                                }
                                else {
                                    List list1 = v.V4(s1, new String[]{","}, false, 0, 6, null);
                                    if(list1 == null) {
                                        list2 = u.H();
                                    }
                                    else {
                                        list2 = new ArrayList();
                                        for(Object object2: list1) {
                                            if(((String)object2).length() > 0) {
                                                list2.add(object2);
                                            }
                                        }
                                    }
                                }
                                if(!list2.isEmpty()) {
                                    if(!(list2 instanceof Collection) || !list2.isEmpty()) {
                                        for(Object object3: list2) {
                                            if(b.a.d(((String)object3))) {
                                                continue;
                                            }
                                            return true;
                                        }
                                    }
                                    return false;
                                }
                                return true;
                            }
                            if(((long)(v - v2 + v3)) < v1) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean b() {
        boolean z;
        BufferedReader bufferedReader0;
        ArrayList arrayList0;
        try {
            String s = jl.a.p();
            if(s == null) {
                return false;
            }
            List list0 = v.V4(s, new String[]{","}, false, 0, 6, null);
            if(list0 == null) {
                return false;
            }
            arrayList0 = new ArrayList();
            for(Object object0: list0) {
                if(((String)object0).length() > 0) {
                    arrayList0.add(object0);
                }
            }
            if(arrayList0.isEmpty()) {
                arrayList0 = null;
            }
            if(arrayList0 == null) {
                return false;
            }
            String s1 = jl.a.q();
            if(s1 == null) {
                return false;
            }
            List list1 = v.V4(s1, new String[]{","}, false, 0, 6, null);
            if(list1 == null) {
                return false;
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: list1) {
                if(((String)object1).length() > 0) {
                    arrayList1.add(object1);
                }
            }
            if(arrayList1.isEmpty()) {
                arrayList1 = null;
            }
            if(arrayList1 == null) {
                return false;
            }
            ArrayList arrayList2 = new ArrayList(u.b0(arrayList1, 10));
            for(Object object2: arrayList1) {
                arrayList2.add(new File(((String)object2)));
            }
            Object object3 = null;
            for(Object object4: arrayList2) {
                if(((File)object4).canRead()) {
                    object3 = object4;
                    break;
                }
            }
            if(((File)object3) == null) {
                return false;
            }
            bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream(((File)object3)), f.b), 0x2000);
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
            return false;
        }
        try {
            z = false;
            Iterator iterator4 = y.h(bufferedReader0).iterator();
            while(true) {
                if(!iterator4.hasNext()) {
                    goto label_59;
                }
                Object object5 = iterator4.next();
                String s2 = (String)object5;
                if(v.f5(s2, '#', false, 2, null) || arrayList0.isEmpty()) {
                    continue;
                }
                Iterator iterator5 = arrayList0.iterator();
            label_51:
                if(!iterator5.hasNext()) {
                    continue;
                }
                Object object6 = iterator5.next();
                if(!v.W2(s2, ((String)object6), false, 2, null)) {
                    goto label_51;
                }
                goto label_58;
            }
        }
        catch(Throwable throwable0) {
            try {
                c.a(bufferedReader0, throwable0);
                throw throwable0;
            label_58:
                z = true;
            label_59:
                c.a(bufferedReader0, null);
                return z;
            }
            catch(Exception exception0) {
            }
        }
        timber.log.b.a.y(exception0);
        return false;
    }

    public final boolean c() {
        if(!b.c || Math.abs(System.currentTimeMillis() - b.b) > jl.a.o()) {
            if(!this.b() && !this.a()) {
                b.b = System.currentTimeMillis();
                b.c = true;
                return true;
            }
            b.c = false;
        }
        return b.c;
    }

    private final boolean d(String s) {
        boolean z;
        InetAddress inetAddress0 = null;
        try {
            inetAddress0 = InetAddress.getByName(s);
            z = true;
        }
        catch(Exception unused_ex) {
        }
        if(inetAddress0 == null) {
            return true;
        }
        if(!inetAddress0.isAnyLocalAddress() && !inetAddress0.isLinkLocalAddress() && !inetAddress0.isLoopbackAddress()) {
            return false;
        }
        return inetAddress0.getHostAddress() == null ? false : z;
    }
}

