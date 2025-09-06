package com.dcinside.app.ad.mediation;

import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.Adapter;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.u;
import kotlin.jvm.internal.s0;
import kotlin.text.r;
import timber.log.b;
import y4.l;

@s0({"SMAP\nAdmobMediationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdmobMediationAdapter.kt\ncom/dcinside/app/ad/mediation/AdmobMediationAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,45:1\n739#2,9:46\n739#2,9:93\n37#3,2:55\n37#3,2:102\n177#4,9:57\n177#4,9:66\n177#4,9:75\n177#4,9:84\n*S KotlinDebug\n*F\n+ 1 AdmobMediationAdapter.kt\ncom/dcinside/app/ad/mediation/AdmobMediationAdapter\n*L\n19#1:46,9\n31#1:93,9\n19#1:55,2\n31#1:102,2\n20#1:57,9\n21#1:66,9\n22#1:75,9\n24#1:84,9\n*E\n"})
public abstract class AdmobMediationAdapter extends Adapter {
    @l
    public abstract String getAdSdkVersion();

    @Override  // com.google.android.gms.ads.mediation.Adapter
    @l
    public VersionInfo getSDKVersionInfo() {
        Integer integer3;
        Integer integer2;
        Integer integer1;
        List list1;
        String s = this.getAdSdkVersion();
        int v = 0;
        List list0 = new r("\\.").p(s, 0);
        if(!list0.isEmpty()) {
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                if(((String)listIterator0.previous()).length() == 0) {
                    continue;
                }
                list1 = u.J5(list0, listIterator0.nextIndex() + 1);
                goto label_10;
            }
        }
        list1 = u.H();
    label_10:
        String[] arr_s = (String[])list1.toArray(new String[0]);
        Integer integer0 = null;
        try {
            String s1 = (String)kotlin.collections.l.Pe(arr_s, 0);
            integer1 = null;
            if(s1 != null) {
                integer1 = Integer.parseInt(s1);
            }
        }
        catch(Exception unused_ex) {
        }
        int v1 = integer1 == null ? 0 : ((int)integer1);
        try {
            String s2 = (String)kotlin.collections.l.Pe(arr_s, 1);
            integer2 = null;
            if(s2 != null) {
                integer2 = Integer.parseInt(s2);
            }
        }
        catch(Exception unused_ex) {
        }
        int v2 = integer2 == null ? 0 : ((int)integer2);
        try {
            String s3 = (String)kotlin.collections.l.Pe(arr_s, 2);
            integer3 = null;
            if(s3 != null) {
                integer3 = Integer.parseInt(s3);
            }
        }
        catch(Exception unused_ex) {
        }
        int v3 = integer3 == null ? 0 : ((int)integer3);
        if(arr_s.length >= 4) {
            try {
                String s4 = (String)kotlin.collections.l.Pe(arr_s, 3);
                if(s4 != null) {
                    integer0 = Integer.parseInt(s4);
                }
            }
            catch(Exception unused_ex) {
            }
            if(integer0 != null) {
                v = (int)integer0;
            }
            v3 = v3 * 100 + v;
        }
        return new VersionInfo(v1, v2, v3);
    }

    @Override  // com.google.android.gms.ads.mediation.Adapter
    @l
    public VersionInfo getVersionInfo() {
        List list1;
        List list0 = new r("\\.").p("5.1.2", 0);
        if(!list0.isEmpty()) {
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                if(((String)listIterator0.previous()).length() == 0) {
                    continue;
                }
                list1 = u.J5(list0, listIterator0.nextIndex() + 1);
                goto label_8;
            }
        }
        list1 = u.H();
    label_8:
        String[] arr_s = (String[])list1.toArray(new String[0]);
        if(arr_s.length >= 3) {
            try {
                return new VersionInfo(Integer.parseInt(arr_s[0]), Integer.parseInt(arr_s[1]), Integer.parseInt(arr_s[2]));
            }
            catch(NumberFormatException numberFormatException0) {
                b.a.e(numberFormatException0);
            }
        }
        return new VersionInfo(0, 0, 0);
    }
}

