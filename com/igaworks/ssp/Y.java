package com.igaworks.ssp;

import android.content.Context;
import com.igaworks.ssp.common.adapter.BaseMediationAdapter;
import com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

public abstract class y {
    private static BaseMediationAdapter a(ConcurrentHashMap concurrentHashMap0, i i0) {
        if(concurrentHashMap0 == null) {
            concurrentHashMap0 = new ConcurrentHashMap();
        }
        BaseMediationAdapter baseMediationAdapter0 = (BaseMediationAdapter)concurrentHashMap0.get(i0);
        if(baseMediationAdapter0 == null) {
            baseMediationAdapter0 = i0.e();
            if(baseMediationAdapter0 != null) {
                concurrentHashMap0.put(i0, baseMediationAdapter0);
            }
        }
        return baseMediationAdapter0;
    }

    public static String a(Context context0) {
        try {
            return context0.getApplicationInfo().loadLabel(context0.getPackageManager()).toString();
        }
        catch(Exception unused_ex) {
            return "";
        }
    }

    public static void a(d0 d00, ConcurrentHashMap concurrentHashMap0) {
        if(d00 == null) {
            return;
        }
        if(d00.e() == null) {
            return;
        }
        if(A.b(d00.e().a())) {
            return;
        }
        ArrayList arrayList0 = d00.e().a();
        int v = arrayList0.size() - 1;
        String s = "Valid Mediation Schedule\n";
        while(v >= 0) {
            i i0 = i.a(((a0)arrayList0.get(v)).a());
            try {
                if(i0.b() != i.c.b()) {
                    ((BaseMediationAdapter)Class.forName("").cast(y.a(concurrentHashMap0, i0))).checkValidMediation();
                }
                s = s + String.format("Import SDK : %s", i0.d()) + "\n";
            }
            catch(NoClassDefFoundError unused_ex) {
                arrayList0.remove(v);
                s = s + String.format("Not Import SDK : %s", i0.d()) + "\n";
            }
            catch(NoSuchMethodError unused_ex) {
                arrayList0.remove(v);
                s = s + String.format("Not Import SDK : %s", i0.d()) + "\n";
            }
            catch(Exception unused_ex) {
                arrayList0.remove(v);
                s = s + String.format("Not Import SDK : %s", i0.d()) + "\n";
            }
            --v;
        }
        b.c(Thread.currentThread(), s);
    }

    public static boolean a(d0 d00) {
        if(d00 == null) {
            return false;
        }
        return d00.b() == null ? false : d00.b().size() > 0;
    }

    public static boolean a(i i0, ConcurrentHashMap concurrentHashMap0) {
        try {
            ((BaseMediationAdapter)Class.forName("").cast(y.a(concurrentHashMap0, i0))).checkValidMediation();
            b.c(Thread.currentThread(), "Import SDK : " + i0.d());
            return true;
        }
        catch(NoClassDefFoundError unused_ex) {
            b.c(Thread.currentThread(), "Not Import SDK 1 : " + i0.d());
            return false;
        }
        catch(NoSuchMethodError unused_ex) {
            b.c(Thread.currentThread(), "Not Import SDK 2 : " + i0.d());
            return false;
        }
        catch(Exception unused_ex) {
            b.c(Thread.currentThread(), "Not Import SDK 3 : " + i0.d());
            return false;
        }
    }

    private static VideoMixAdMediationAdapter b(ConcurrentHashMap concurrentHashMap0, i i0) {
        if(concurrentHashMap0 == null) {
            concurrentHashMap0 = new ConcurrentHashMap();
        }
        VideoMixAdMediationAdapter videoMixAdMediationAdapter0 = (VideoMixAdMediationAdapter)concurrentHashMap0.get(i0);
        if(videoMixAdMediationAdapter0 == null) {
            videoMixAdMediationAdapter0 = i0.f();
            if(videoMixAdMediationAdapter0 != null) {
                concurrentHashMap0.put(i0, videoMixAdMediationAdapter0);
            }
        }
        return videoMixAdMediationAdapter0;
    }

    public static void b(d0 d00, ConcurrentHashMap concurrentHashMap0) {
        if(d00 == null) {
            return;
        }
        if(d00.e() == null) {
            return;
        }
        if(A.b(d00.e().a())) {
            return;
        }
        ArrayList arrayList0 = d00.e().a();
        int v = arrayList0.size() - 1;
        String s = "Valid VideoMix Mediation Schedule\n";
        while(v >= 0) {
            i i0 = i.a(((a0)arrayList0.get(v)).a());
            try {
                if(i0.b() != i.c.b()) {
                    ((VideoMixAdMediationAdapter)Class.forName("").cast(y.b(concurrentHashMap0, i0))).checkValidMediation();
                }
                s = s + String.format("Import SDK : %s", i0.d()) + "\n";
            }
            catch(NoClassDefFoundError unused_ex) {
                arrayList0.remove(v);
                s = s + String.format("Not Import SDK : %s", i0.d()) + "\n";
            }
            catch(NoSuchMethodError unused_ex) {
                arrayList0.remove(v);
                s = s + String.format("Not Import SDK : %s", i0.d()) + "\n";
            }
            catch(Exception unused_ex) {
                arrayList0.remove(v);
                s = s + String.format("Not Import SDK : %s", i0.d()) + "\n";
            }
            --v;
        }
        b.c(Thread.currentThread(), s);
    }

    public static boolean b(d0 d00) {
        if(d00 == null) {
            return false;
        }
        return d00.c() == null ? false : d00.c().size() > 0;
    }

    public static boolean b(i i0, ConcurrentHashMap concurrentHashMap0) {
        try {
            ((VideoMixAdMediationAdapter)Class.forName("").cast(y.b(concurrentHashMap0, i0))).checkValidMediation();
            b.c(Thread.currentThread(), "Import SDK : " + i0.d());
            return true;
        }
        catch(NoClassDefFoundError unused_ex) {
            b.c(Thread.currentThread(), "Not Import SDK 1 : " + i0.d());
            return false;
        }
        catch(NoSuchMethodError unused_ex) {
            b.c(Thread.currentThread(), "Not Import SDK 2 : " + i0.d());
            return false;
        }
        catch(Exception unused_ex) {
            b.c(Thread.currentThread(), "Not Import SDK 3 : " + i0.d());
            return false;
        }
    }

    public static boolean c(d0 d00) {
        if(d00 == null) {
            return false;
        }
        try {
            if(d00.e() == null) {
                return false;
            }
            ArrayList arrayList0 = d00.e().a();
            if(arrayList0 != null && arrayList0.size() > 0) {
                return true;
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
        return false;
    }
}

