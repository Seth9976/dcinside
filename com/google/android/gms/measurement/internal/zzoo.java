package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzfo.zzb;
import com.google.android.gms.internal.measurement.zzfo.zzc;
import com.google.android.gms.internal.measurement.zzfo.zzd;
import com.google.android.gms.internal.measurement.zzfy.zze;
import com.google.android.gms.internal.measurement.zzfy.zzf;
import com.google.android.gms.internal.measurement.zzfy.zzh;
import com.google.android.gms.internal.measurement.zzfy.zzj;
import com.google.android.gms.internal.measurement.zzfy.zzk.zza;
import com.google.android.gms.internal.measurement.zzfy.zzk;
import com.google.android.gms.internal.measurement.zzfy.zzm;
import com.google.android.gms.internal.measurement.zzfy.zzn;
import com.google.android.gms.internal.measurement.zzjg;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.internal.measurement.zzlb;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.android.gms.internal.measurement.zzpu;
import j..util.DesugarCollections;
import j..util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import w4.d;

public final class zzoo extends zznr {
    zzoo(zznv zznv0) {
        super(zznv0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzoo g_() {
        return super.g_();
    }

    static int zza(zza zzfy$zzk$zza0, String s) {
        if(zzfy$zzk$zza0 == null) {
            return -1;
        }
        for(int v = 0; v < zzfy$zzk$zza0.zzd(); ++v) {
            if(s.equals(zzfy$zzk$zza0.zzk(v).zzg())) {
                return v;
            }
        }
        return -1;
    }

    static Bundle zza(List list0) {
        Bundle bundle0 = new Bundle();
        for(Object object0: list0) {
            zzh zzfy$zzh0 = (zzh)object0;
            String s = zzfy$zzh0.zzg();
            if(zzfy$zzh0.zzj()) {
                bundle0.putDouble(s, zzfy$zzh0.zza());
            }
            else if(zzfy$zzh0.zzk()) {
                bundle0.putFloat(s, zzfy$zzh0.zzb());
            }
            else if(zzfy$zzh0.zzn()) {
                bundle0.putString(s, "");
            }
            else if(zzfy$zzh0.zzl()) {
                bundle0.putLong(s, zzfy$zzh0.zzd());
            }
        }
        return bundle0;
    }

    private final Bundle zza(Map map0, boolean z) {
        Bundle bundle0 = new Bundle();
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            Object object1 = map0.get(s);
            if(object1 == null) {
                bundle0.putString(s, null);
            }
            else if(object1 instanceof Long) {
                bundle0.putLong(s, ((long)(((Long)object1))));
            }
            else if(object1 instanceof Double) {
                bundle0.putDouble(s, ((double)(((Double)object1))));
            }
            else if(!(object1 instanceof ArrayList)) {
                bundle0.putString(s, object1.toString());
            }
            else if(z) {
                ArrayList arrayList0 = (ArrayList)object1;
                ArrayList arrayList1 = new ArrayList();
                int v = arrayList0.size();
                int v1 = 0;
                while(v1 < v) {
                    Object object2 = arrayList0.get(v1);
                    ++v1;
                    arrayList1.add(this.zza(((Map)object2), false));
                }
                bundle0.putParcelableArray(s, ((Parcelable[])arrayList1.toArray(new Parcelable[0])));
            }
        }
        return bundle0;
    }

    static zzh zza(zzf zzfy$zzf0, String s) {
        for(Object object0: zzfy$zzf0.zzh()) {
            zzh zzfy$zzh0 = (zzh)object0;
            if(zzfy$zzh0.zzg().equals(s)) {
                return zzfy$zzh0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    static zzlb zza(zzlb zzlb0, byte[] arr_b) throws zzkb {
        zzjg zzjg0 = zzjg.zza();
        return zzjg0 == null ? zzlb0.zza(arr_b) : zzlb0.zza(arr_b, zzjg0);
    }

    static Object zza(zzf zzfy$zzf0, String s, Object object0) {
        Object object1 = zzoo.zzb(zzfy$zzf0, s);
        return object1 == null ? object0 : object1;
    }

    private static String zza(boolean z, boolean z1, boolean z2) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(z) {
            stringBuilder0.append("Dynamic ");
        }
        if(z1) {
            stringBuilder0.append("Sequence ");
        }
        if(z2) {
            stringBuilder0.append("Session-Scoped ");
        }
        return stringBuilder0.toString();
    }

    static List zza(BitSet bitSet0) {
        int v = (bitSet0.length() + 0x3F) / 0x40;
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = 0L;
            for(int v3 = 0; v3 < 0x40; ++v3) {
                int v4 = (v1 << 6) + v3;
                if(v4 >= bitSet0.length()) {
                    break;
                }
                if(bitSet0.get(v4)) {
                    v2 |= 1L << v3;
                }
            }
            ((ArrayList)list0).add(v2);
        }
        return list0;
    }

    private static void zza(Uri.Builder uri$Builder0, String s, String s1, Set set0) {
        if(!set0.contains(s) && !TextUtils.isEmpty(s1)) {
            uri$Builder0.appendQueryParameter(s, s1);
        }
    }

    private static void zza(Uri.Builder uri$Builder0, String[] arr_s, Bundle bundle0, Set set0) {
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].split(",");
            String s = arr_s1[0];
            String s1 = arr_s1[arr_s1.length - 1];
            String s2 = bundle0.getString(s);
            if(s2 != null) {
                zzoo.zza(uri$Builder0, s1, s2, set0);
            }
        }
    }

    static void zza(com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza0, String s, Object object0) {
        List list0 = zzfy$zzf$zza0.zzf();
        int v;
        for(v = 0; true; ++v) {
            if(v >= list0.size()) {
                v = -1;
                break;
            }
            if(s.equals("")) {
                break;
            }
        }
        com.google.android.gms.internal.measurement.zzfy.zzh.zza zzfy$zzh$zza0 = zzh.zze().zza(s);
        if(object0 instanceof Long) {
            zzfy$zzh$zza0.zza(((long)(((Long)object0))));
        }
        else if(object0 instanceof String) {
            zzfy$zzh$zza0.zzb(((String)object0));
        }
        else if(object0 instanceof Double) {
            zzfy$zzh$zza0.zza(((double)(((Double)object0))));
        }
        if(v >= 0) {
            zzfy$zzf$zza0.zza(v, zzfy$zzh$zza0);
            return;
        }
        zzfy$zzf$zza0.zza(zzfy$zzh$zza0);
    }

    private static void zza(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("  ");
        }
    }

    private final void zza(StringBuilder stringBuilder0, int v, zzc zzfo$zzc0) {
        if(zzfo$zzc0 == null) {
            return;
        }
        zzoo.zza(stringBuilder0, v);
        stringBuilder0.append("filter {\n");
        if(zzfo$zzc0.zzg()) {
            zzoo.zza(stringBuilder0, v, "complement", Boolean.valueOf(zzfo$zzc0.zzf()));
        }
        if(zzfo$zzc0.zzi()) {
            zzoo.zza(stringBuilder0, v, "param_name", this.zzi().zzb(zzfo$zzc0.zze()));
        }
        if(zzfo$zzc0.zzj()) {
            com.google.android.gms.internal.measurement.zzfo.zzf zzfo$zzf0 = zzfo$zzc0.zzd();
            if(zzfo$zzf0 != null) {
                zzoo.zza(stringBuilder0, v + 1);
                stringBuilder0.append("string_filter");
                stringBuilder0.append(" {\n");
                if(zzfo$zzf0.zzj()) {
                    zzoo.zza(stringBuilder0, v + 1, "match_type", zzfo$zzf0.zzb().name());
                }
                if(zzfo$zzf0.zzi()) {
                    zzoo.zza(stringBuilder0, v + 1, "expression", zzfo$zzf0.zze());
                }
                if(zzfo$zzf0.zzh()) {
                    zzoo.zza(stringBuilder0, v + 1, "case_sensitive", Boolean.valueOf(zzfo$zzf0.zzg()));
                }
                if(zzfo$zzf0.zza() > 0) {
                    zzoo.zza(stringBuilder0, v + 2);
                    stringBuilder0.append("expression_list {\n");
                    for(Object object0: zzfo$zzf0.zzf()) {
                        zzoo.zza(stringBuilder0, v + 3);
                        stringBuilder0.append(((String)object0));
                        stringBuilder0.append("\n");
                    }
                    stringBuilder0.append("}\n");
                }
                zzoo.zza(stringBuilder0, v + 1);
                stringBuilder0.append("}\n");
            }
        }
        if(zzfo$zzc0.zzh()) {
            zzoo.zza(stringBuilder0, v + 1, "number_filter", zzfo$zzc0.zzc());
        }
        zzoo.zza(stringBuilder0, v);
        stringBuilder0.append("}\n");
    }

    private static void zza(StringBuilder stringBuilder0, int v, String s, zzd zzfo$zzd0) {
        if(zzfo$zzd0 == null) {
            return;
        }
        zzoo.zza(stringBuilder0, v);
        stringBuilder0.append(s);
        stringBuilder0.append(" {\n");
        if(zzfo$zzd0.zzh()) {
            zzoo.zza(stringBuilder0, v, "comparison_type", zzfo$zzd0.zza().name());
        }
        if(zzfo$zzd0.zzj()) {
            zzoo.zza(stringBuilder0, v, "match_as_float", Boolean.valueOf(zzfo$zzd0.zzg()));
        }
        if(zzfo$zzd0.zzi()) {
            zzoo.zza(stringBuilder0, v, "comparison_value", "");
        }
        if(zzfo$zzd0.zzl()) {
            zzoo.zza(stringBuilder0, v, "min_comparison_value", "");
        }
        if(zzfo$zzd0.zzk()) {
            zzoo.zza(stringBuilder0, v, "max_comparison_value", "");
        }
        zzoo.zza(stringBuilder0, v);
        stringBuilder0.append("}\n");
    }

    private static void zza(StringBuilder stringBuilder0, int v, String s, zzm zzfy$zzm0) {
        if(zzfy$zzm0 == null) {
            return;
        }
        zzoo.zza(stringBuilder0, 3);
        stringBuilder0.append(s);
        stringBuilder0.append(" {\n");
        if(zzfy$zzm0.zzb() != 0) {
            zzoo.zza(stringBuilder0, 4);
            stringBuilder0.append("results: ");
            int v1 = 0;
            for(Object object0: zzfy$zzm0.zzi()) {
                if(v1 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(((Long)object0));
                ++v1;
            }
            stringBuilder0.append('\n');
        }
        if(zzfy$zzm0.zzd() != 0) {
            zzoo.zza(stringBuilder0, 4);
            stringBuilder0.append("status: ");
            int v2 = 0;
            for(Object object1: zzfy$zzm0.zzk()) {
                if(v2 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(((Long)object1));
                ++v2;
            }
            stringBuilder0.append('\n');
        }
        if(zzfy$zzm0.zza() != 0) {
            zzoo.zza(stringBuilder0, 4);
            stringBuilder0.append("dynamic_filter_timestamps: {");
            int v3 = 0;
            for(Object object2: zzfy$zzm0.zzh()) {
                zze zzfy$zze0 = (zze)object2;
                if(v3 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append((zzfy$zze0.zzf() ? zzfy$zze0.zza() : null));
                stringBuilder0.append(":");
                stringBuilder0.append((zzfy$zze0.zze() ? zzfy$zze0.zzb() : null));
                ++v3;
            }
            stringBuilder0.append("}\n");
        }
        if(zzfy$zzm0.zzc() != 0) {
            zzoo.zza(stringBuilder0, 4);
            stringBuilder0.append("sequence_filter_timestamps: {");
            int v4 = 0;
            for(Object object3: zzfy$zzm0.zzj()) {
                zzn zzfy$zzn0 = (zzn)object3;
                if(v4 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append((zzfy$zzn0.zzf() ? zzfy$zzn0.zzb() : null));
                stringBuilder0.append(": [");
                int v5 = 0;
                for(Object object4: zzfy$zzn0.zze()) {
                    long v6 = (long)(((Long)object4));
                    if(v5 != 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(v6);
                    ++v5;
                }
                stringBuilder0.append("]");
                ++v4;
            }
            stringBuilder0.append("}\n");
        }
        zzoo.zza(stringBuilder0, 3);
        stringBuilder0.append("}\n");
    }

    private static void zza(StringBuilder stringBuilder0, int v, String s, Object object0) {
        if(object0 == null) {
            return;
        }
        zzoo.zza(stringBuilder0, v + 1);
        stringBuilder0.append(s);
        stringBuilder0.append(": ");
        stringBuilder0.append(object0);
        stringBuilder0.append('\n');
    }

    private final void zza(StringBuilder stringBuilder0, int v, List list0) {
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            zzh zzfy$zzh0 = (zzh)object0;
            if(zzfy$zzh0 != null) {
                zzoo.zza(stringBuilder0, v + 1);
                stringBuilder0.append("param {\n");
                Double double0 = null;
                zzoo.zza(stringBuilder0, v + 1, "name", (zzfy$zzh0.zzm() ? this.zzi().zzb("") : null));
                zzoo.zza(stringBuilder0, v + 1, "string_value", (zzfy$zzh0.zzn() ? "" : null));
                zzoo.zza(stringBuilder0, v + 1, "int_value", (zzfy$zzh0.zzl() ? zzfy$zzh0.zzd() : null));
                if(zzfy$zzh0.zzj()) {
                    double0 = zzfy$zzh0.zza();
                }
                zzoo.zza(stringBuilder0, v + 1, "double_value", double0);
                if(zzfy$zzh0.zzc() > 0) {
                    this.zza(stringBuilder0, v + 1, zzfy$zzh0.zzi());
                }
                zzoo.zza(stringBuilder0, v + 1);
                stringBuilder0.append("}\n");
            }
        }
    }

    @WorkerThread
    static boolean zza(zzbf zzbf0, zzo zzo0) {
        Preconditions.checkNotNull(zzbf0);
        Preconditions.checkNotNull(zzo0);
        return !TextUtils.isEmpty(zzo0.zzb) || !TextUtils.isEmpty(zzo0.zzp);
    }

    static boolean zza(List list0, int v) {
        return v < list0.size() << 6 && (1L << v % 0x40 & ((long)(((Long)list0.get(v / 0x40))))) != 0L;
    }

    // 去混淆评级： 低(20)
    final long zza(String s) {
        return TextUtils.isEmpty(s) ? 0L : this.zza(s.getBytes(Charset.forName("UTF-8")));
    }

    @WorkerThread
    final long zza(byte[] arr_b) {
        Preconditions.checkNotNull(arr_b);
        this.zzq().zzt();
        MessageDigest messageDigest0 = zzos.zzu();
        if(messageDigest0 == null) {
            this.zzj().zzg().zza("Failed to get MD5");
            return 0L;
        }
        return zzos.zza(messageDigest0.digest(arr_b));
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return super.zza();
    }

    final Parcelable zza(byte[] arr_b, Parcelable.Creator parcelable$Creator0) {
        if(arr_b == null) {
            return null;
        }
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.unmarshall(arr_b, 0, arr_b.length);
            parcel0.setDataPosition(0);
            return (Parcelable)parcelable$Creator0.createFromParcel(parcel0);
        }
        catch(ParseException unused_ex) {
            this.zzj().zzg().zza("Failed to load parcelable from buffer");
            return null;
        }
        finally {
            parcel0.recycle();
        }
    }

    final zzf zza(zzbc zzbc0) {
        com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza0 = zzf.zze().zza(zzbc0.zze);
        for(Object object0: zzbc0.zzf) {
            com.google.android.gms.internal.measurement.zzfy.zzh.zza zzfy$zzh$zza0 = zzh.zze().zza(((String)object0));
            Object object1 = zzbc0.zzf.zzc(((String)object0));
            Preconditions.checkNotNull(object1);
            this.zza(zzfy$zzh$zza0, object1);
            zzfy$zzf$zza0.zza(zzfy$zzh$zza0);
        }
        if(this.zze().zza(zzbh.zzdi) && !TextUtils.isEmpty(zzbc0.zzc) && zzbc0.zzf.zzc("_o") == null) {
            zzfy$zzf$zza0.zza(((zzh)(((zzjt)zzh.zze().zza("_o").zzb(zzbc0.zzc).zzai()))));
        }
        return (zzf)(((zzjt)zzfy$zzf$zza0.zzai()));
    }

    final zzbf zza(zzad zzad0) {
        String s;
        Bundle bundle0 = this.zza(zzad0.zzc(), true);
        if(bundle0.containsKey("_o")) {
            Object object0 = bundle0.get("_o");
            s = object0 == null ? "app" : object0.toString();
        }
        else {
            s = "app";
        }
        String s1 = zzji.zzb(zzad0.zzb());
        if(s1 == null) {
            s1 = zzad0.zzb();
        }
        return new zzbf(s1, new zzbe(bundle0), s, zzad0.zza());
    }

    @TargetApi(30)
    final zzno zza(String s, zza zzfy$zzk$zza0, com.google.android.gms.internal.measurement.zzfy.zzf.zza zzfy$zzf$zza0, String s1) {
        if(zzpn.zza() && this.zze().zze(s, zzbh.zzch)) {
            long v = this.zzb().currentTimeMillis();
            String[] arr_s = this.zze().zzd(s, zzbh.zzbg).split(",");
            HashSet hashSet0 = new HashSet(arr_s.length);
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                String s2 = arr_s[v1];
                Objects.requireNonNull(s2);
                if(!hashSet0.add(s2)) {
                    throw new IllegalArgumentException("duplicate element: " + s2);
                }
            }
            Set set0 = DesugarCollections.unmodifiableSet(hashSet0);
            zznu zznu0 = this.zzo();
            String s3 = zznu0.zzm().zzf(s);
            Uri.Builder uri$Builder0 = new Uri.Builder();
            uri$Builder0.scheme(zznu0.zze().zzd(s, zzbh.zzaz));
            if(TextUtils.isEmpty(s3)) {
                uri$Builder0.authority(zznu0.zze().zzd(s, zzbh.zzba));
            }
            else {
                uri$Builder0.authority(s3 + "." + zznu0.zze().zzd(s, zzbh.zzba));
            }
            uri$Builder0.path(zznu0.zze().zzd(s, zzbh.zzbb));
            zzoo.zza(uri$Builder0, "gmp_app_id", zzfy$zzk$zza0.zzx(), set0);
            zzoo.zza(uri$Builder0, "gmp_version", "106000", set0);
            boolean z = !this.zze().zze(s, zzbh.zzck) || !this.zzm().zzo(s);
            zzoo.zza(uri$Builder0, "app_instance_id", "", set0);
            zzoo.zza(uri$Builder0, "rdid", zzfy$zzk$zza0.zzz(), set0);
            zzoo.zza(uri$Builder0, "bundle_id", zzfy$zzk$zza0.zzt(), set0);
            TextUtils.isEmpty(zzji.zza(""));
            zzoo.zza(uri$Builder0, "app_event_name", "", set0);
            zzoo.zza(uri$Builder0, "app_version", String.valueOf(zzfy$zzk$zza0.zzb()), set0);
            String s4 = zzfy$zzk$zza0.zzy();
            if(this.zze().zze(s, zzbh.zzck) && this.zzm().zzs(s) && !TextUtils.isEmpty(s4)) {
                int v2 = s4.indexOf(".");
                if(v2 != -1) {
                    s4 = s4.substring(0, v2);
                }
            }
            zzoo.zza(uri$Builder0, "os_version", s4, set0);
            zzoo.zza(uri$Builder0, "timestamp", String.valueOf(zzfy$zzf$zza0.zzc()), set0);
            String s5 = "1";
            if(zzfy$zzk$zza0.zzad()) {
                zzoo.zza(uri$Builder0, "lat", "1", set0);
            }
            zzoo.zza(uri$Builder0, "privacy_sandbox_version", String.valueOf(zzfy$zzk$zza0.zza()), set0);
            zzoo.zza(uri$Builder0, "trigger_uri_source", "1", set0);
            zzoo.zza(uri$Builder0, "trigger_uri_timestamp", String.valueOf(v), set0);
            zzoo.zza(uri$Builder0, "request_uuid", s1, set0);
            List list0 = zzfy$zzf$zza0.zzf();
            Bundle bundle0 = new Bundle();
            for(Object object0: list0) {
                zzh zzfy$zzh0 = (zzh)object0;
                if(zzfy$zzh0.zzj()) {
                    bundle0.putString("", String.valueOf(zzfy$zzh0.zza()));
                }
                else if(zzfy$zzh0.zzk()) {
                    bundle0.putString("", String.valueOf(zzfy$zzh0.zzb()));
                }
                else if(zzfy$zzh0.zzn()) {
                    bundle0.putString("", "");
                }
                else if(zzfy$zzh0.zzl()) {
                    bundle0.putString("", String.valueOf(zzfy$zzh0.zzd()));
                }
            }
            zzoo.zza(uri$Builder0, this.zze().zzd(s, zzbh.zzbf).split("\\|"), bundle0, set0);
            List list1 = zzfy$zzk$zza0.zzab();
            Bundle bundle1 = new Bundle();
            for(Object object1: list1) {
                com.google.android.gms.internal.measurement.zzfy.zzo zzfy$zzo0 = (com.google.android.gms.internal.measurement.zzfy.zzo)object1;
                if(zzfy$zzo0.zzi()) {
                    bundle1.putString("", String.valueOf(zzfy$zzo0.zza()));
                }
                else if(zzfy$zzo0.zzj()) {
                    bundle1.putString("", String.valueOf(zzfy$zzo0.zzb()));
                }
                else if(zzfy$zzo0.zzm()) {
                    bundle1.putString("", "");
                }
                else if(zzfy$zzo0.zzk()) {
                    bundle1.putString("", String.valueOf(zzfy$zzo0.zzc()));
                }
            }
            zzoo.zza(uri$Builder0, this.zze().zzd(s, zzbh.zzbe).split("\\|"), bundle1, set0);
            if(!zzfy$zzk$zza0.zzac()) {
                s5 = "0";
            }
            zzoo.zza(uri$Builder0, "dma", s5, set0);
            if(!zzfy$zzk$zza0.zzw().isEmpty()) {
                zzoo.zza(uri$Builder0, "dma_cps", zzfy$zzk$zza0.zzw(), set0);
            }
            if(this.zze().zza(zzbh.zzcm) && zzfy$zzk$zza0.zzae()) {
                com.google.android.gms.internal.measurement.zzfy.zza zzfy$zza0 = zzfy$zzk$zza0.zzg();
                if(zzfy$zza0.zza() > 0L) {
                    zzoo.zza(uri$Builder0, "dl_ss_ts", String.valueOf(zzfy$zza0.zza()), set0);
                }
                if(zzfy$zza0.zzb() > 0L) {
                    zzoo.zza(uri$Builder0, "mr_click_ts", String.valueOf(zzfy$zza0.zzb()), set0);
                }
            }
            return new zzno(uri$Builder0.build().toString(), v, 1);
        }
        return null;
    }

    final String zza(zzb zzfo$zzb0) {
        if(zzfo$zzb0 == null) {
            return "null";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\nevent_filter {\n");
        if(zzfo$zzb0.zzl()) {
            zzoo.zza(stringBuilder0, 0, "filter_id", zzfo$zzb0.zzb());
        }
        zzoo.zza(stringBuilder0, 0, "event_name", this.zzi().zza(zzfo$zzb0.zzf()));
        String s = zzoo.zza(zzfo$zzb0.zzh(), zzfo$zzb0.zzi(), zzfo$zzb0.zzj());
        if(!s.isEmpty()) {
            zzoo.zza(stringBuilder0, 0, "filter_type", s);
        }
        if(zzfo$zzb0.zzk()) {
            zzoo.zza(stringBuilder0, 1, "event_count_filter", zzfo$zzb0.zze());
        }
        if(zzfo$zzb0.zza() > 0) {
            stringBuilder0.append("  filters {\n");
            for(Object object0: zzfo$zzb0.zzg()) {
                this.zza(stringBuilder0, 2, ((zzc)object0));
            }
        }
        zzoo.zza(stringBuilder0, 1);
        stringBuilder0.append("}\n}\n");
        return stringBuilder0.toString();
    }

    final String zza(com.google.android.gms.internal.measurement.zzfo.zze zzfo$zze0) {
        if(zzfo$zze0 == null) {
            return "null";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\nproperty_filter {\n");
        if(zzfo$zze0.zzi()) {
            zzoo.zza(stringBuilder0, 0, "filter_id", zzfo$zze0.zza());
        }
        zzoo.zza(stringBuilder0, 0, "property_name", this.zzi().zzc(zzfo$zze0.zze()));
        String s = zzoo.zza(zzfo$zze0.zzf(), zzfo$zze0.zzg(), zzfo$zze0.zzh());
        if(!s.isEmpty()) {
            zzoo.zza(stringBuilder0, 0, "filter_type", s);
        }
        this.zza(stringBuilder0, 1, zzfo$zze0.zzb());
        stringBuilder0.append("}\n");
        return stringBuilder0.toString();
    }

    final String zza(zzj zzfy$zzj0) {
        if(zzfy$zzj0 == null) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\nbatch {\n");
        if(zzpu.zza() && this.zze().zza(zzbh.zzbx) && zzfy$zzj0.zza() > 0) {
            this.zzq();
            if(zzos.zzf("")) {
                if(zzfy$zzj0.zzh()) {
                    zzoo.zza(stringBuilder0, 0, "upload_subdomain", "");
                }
                if(zzfy$zzj0.zzg()) {
                    zzoo.zza(stringBuilder0, 0, "sgtm_join_id", "");
                }
            }
        }
        for(Object object0: zzfy$zzj0.zzf()) {
            zzk zzfy$zzk0 = (zzk)object0;
            if(zzfy$zzk0 != null) {
                zzoo.zza(stringBuilder0, 1);
                stringBuilder0.append("bundle {\n");
                if(zzfy$zzk0.zzbp()) {
                    zzoo.zza(stringBuilder0, 1, "protocol_version", zzfy$zzk0.zzf());
                }
                if(zzpo.zza() && this.zze().zze("", zzbh.zzbw) && zzfy$zzk0.zzbs()) {
                    zzoo.zza(stringBuilder0, 1, "session_stitching_token", "");
                }
                zzoo.zza(stringBuilder0, 1, "platform", "");
                if(zzfy$zzk0.zzbk()) {
                    zzoo.zza(stringBuilder0, 1, "gmp_version", zzfy$zzk0.zzn());
                }
                if(zzfy$zzk0.zzbx()) {
                    zzoo.zza(stringBuilder0, 1, "uploading_gmp_version", zzfy$zzk0.zzt());
                }
                if(zzfy$zzk0.zzbi()) {
                    zzoo.zza(stringBuilder0, 1, "dynamite_version", zzfy$zzk0.zzl());
                }
                if(zzfy$zzk0.zzbb()) {
                    zzoo.zza(stringBuilder0, 1, "config_version", zzfy$zzk0.zzj());
                }
                zzoo.zza(stringBuilder0, 1, "gmp_app_id", "");
                zzoo.zza(stringBuilder0, 1, "admob_app_id", "");
                zzoo.zza(stringBuilder0, 1, "app_id", "");
                zzoo.zza(stringBuilder0, 1, "app_version", "");
                if(zzfy$zzk0.zzay()) {
                    zzoo.zza(stringBuilder0, 1, "app_version_major", zzfy$zzk0.zzb());
                }
                zzoo.zza(stringBuilder0, 1, "firebase_instance_id", "");
                if(zzfy$zzk0.zzbg()) {
                    zzoo.zza(stringBuilder0, 1, "dev_cert_hash", zzfy$zzk0.zzk());
                }
                zzoo.zza(stringBuilder0, 1, "app_store", "");
                if(zzfy$zzk0.zzbw()) {
                    zzoo.zza(stringBuilder0, 1, "upload_timestamp_millis", zzfy$zzk0.zzs());
                }
                if(zzfy$zzk0.zzbt()) {
                    zzoo.zza(stringBuilder0, 1, "start_timestamp_millis", zzfy$zzk0.zzq());
                }
                if(zzfy$zzk0.zzbj()) {
                    zzoo.zza(stringBuilder0, 1, "end_timestamp_millis", zzfy$zzk0.zzm());
                }
                if(zzfy$zzk0.zzbo()) {
                    zzoo.zza(stringBuilder0, 1, "previous_bundle_start_timestamp_millis", zzfy$zzk0.zzp());
                }
                if(zzfy$zzk0.zzbn()) {
                    zzoo.zza(stringBuilder0, 1, "previous_bundle_end_timestamp_millis", zzfy$zzk0.zzo());
                }
                zzoo.zza(stringBuilder0, 1, "app_instance_id", "");
                zzoo.zza(stringBuilder0, 1, "resettable_device_id", "");
                zzoo.zza(stringBuilder0, 1, "ds_id", "");
                if(zzfy$zzk0.zzbm()) {
                    zzoo.zza(stringBuilder0, 1, "limited_ad_tracking", Boolean.valueOf(zzfy$zzk0.zzav()));
                }
                zzoo.zza(stringBuilder0, 1, "os_version", "");
                zzoo.zza(stringBuilder0, 1, "device_model", "");
                zzoo.zza(stringBuilder0, 1, "user_default_language", "");
                if(zzfy$zzk0.zzbv()) {
                    zzoo.zza(stringBuilder0, 1, "time_zone_offset_minutes", zzfy$zzk0.zzh());
                }
                if(zzfy$zzk0.zzba()) {
                    zzoo.zza(stringBuilder0, 1, "bundle_sequential_index", zzfy$zzk0.zzc());
                }
                if(zzpu.zza()) {
                    this.zzq();
                    if(zzos.zzf("") && this.zze().zza(zzbh.zzbx) && zzfy$zzk0.zzbf()) {
                        zzoo.zza(stringBuilder0, 1, "delivery_index", zzfy$zzk0.zzd());
                    }
                }
                if(zzfy$zzk0.zzbr()) {
                    zzoo.zza(stringBuilder0, 1, "service_upload", Boolean.valueOf(zzfy$zzk0.zzaw()));
                }
                zzoo.zza(stringBuilder0, 1, "health_monitor", "");
                if(zzfy$zzk0.zzbq()) {
                    zzoo.zza(stringBuilder0, 1, "retry_counter", zzfy$zzk0.zzg());
                }
                if(zzfy$zzk0.zzbd()) {
                    zzoo.zza(stringBuilder0, 1, "consent_signals", "");
                }
                if(zzfy$zzk0.zzbl()) {
                    zzoo.zza(stringBuilder0, 1, "is_dma_region", Boolean.valueOf(zzfy$zzk0.zzau()));
                }
                if(zzfy$zzk0.zzbe()) {
                    zzoo.zza(stringBuilder0, 1, "core_platform_services", "");
                }
                if(zzfy$zzk0.zzbc()) {
                    zzoo.zza(stringBuilder0, 1, "consent_diagnostics", "");
                }
                if(zzfy$zzk0.zzbu()) {
                    zzoo.zza(stringBuilder0, 1, "target_os_version", zzfy$zzk0.zzr());
                }
                if(zzpn.zza() && this.zze().zze("", zzbh.zzch)) {
                    zzoo.zza(stringBuilder0, 1, "ad_services_version", zzfy$zzk0.zza());
                    if(zzfy$zzk0.zzaz()) {
                        com.google.android.gms.internal.measurement.zzfy.zzc zzfy$zzc0 = zzfy$zzk0.zzv();
                        if(zzfy$zzc0 != null) {
                            zzoo.zza(stringBuilder0, 2);
                            stringBuilder0.append("attribution_eligibility_status {\n");
                            zzoo.zza(stringBuilder0, 2, "eligible", Boolean.valueOf(zzfy$zzc0.zzf()));
                            zzoo.zza(stringBuilder0, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzfy$zzc0.zzh()));
                            zzoo.zza(stringBuilder0, 2, "pre_r", Boolean.valueOf(zzfy$zzc0.zzi()));
                            zzoo.zza(stringBuilder0, 2, "r_extensions_too_old", Boolean.valueOf(zzfy$zzc0.zzj()));
                            zzoo.zza(stringBuilder0, 2, "adservices_extension_too_old", Boolean.valueOf(zzfy$zzc0.zze()));
                            zzoo.zza(stringBuilder0, 2, "ad_storage_not_allowed", Boolean.valueOf(zzfy$zzc0.zzd()));
                            zzoo.zza(stringBuilder0, 2, "measurement_manager_disabled", Boolean.valueOf(zzfy$zzc0.zzg()));
                            zzoo.zza(stringBuilder0, 2);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                if(zzov.zza() && this.zze().zza(zzbh.zzcu) && zzfy$zzk0.zzax()) {
                    com.google.android.gms.internal.measurement.zzfy.zza zzfy$zza0 = zzfy$zzk0.zzu();
                    zzoo.zza(stringBuilder0, 2);
                    stringBuilder0.append("ad_campaign_info {\n");
                    if(zzfy$zza0.zzn()) {
                        zzoo.zza(stringBuilder0, 2, "deep_link_gclid", "");
                    }
                    if(zzfy$zza0.zzm()) {
                        zzoo.zza(stringBuilder0, 2, "deep_link_gbraid", "");
                    }
                    if(zzfy$zza0.zzl()) {
                        zzoo.zza(stringBuilder0, 2, "deep_link_gad_source", "");
                    }
                    if(zzfy$zza0.zzo()) {
                        zzoo.zza(stringBuilder0, 2, "deep_link_session_millis", zzfy$zza0.zza());
                    }
                    if(zzfy$zza0.zzs()) {
                        zzoo.zza(stringBuilder0, 2, "market_referrer_gclid", "");
                    }
                    if(zzfy$zza0.zzr()) {
                        zzoo.zza(stringBuilder0, 2, "market_referrer_gbraid", "");
                    }
                    if(zzfy$zza0.zzq()) {
                        zzoo.zza(stringBuilder0, 2, "market_referrer_gad_source", "");
                    }
                    if(zzfy$zza0.zzp()) {
                        zzoo.zza(stringBuilder0, 2, "market_referrer_click_millis", zzfy$zza0.zzb());
                    }
                    zzoo.zza(stringBuilder0, 2);
                    stringBuilder0.append("}\n");
                }
                List list0 = zzfy$zzk0.zzas();
                if(list0 != null) {
                    for(Object object1: list0) {
                        com.google.android.gms.internal.measurement.zzfy.zzo zzfy$zzo0 = (com.google.android.gms.internal.measurement.zzfy.zzo)object1;
                        if(zzfy$zzo0 != null) {
                            zzoo.zza(stringBuilder0, 2);
                            stringBuilder0.append("user_property {\n");
                            Double double0 = null;
                            zzoo.zza(stringBuilder0, 2, "set_timestamp_millis", (zzfy$zzo0.zzl() ? zzfy$zzo0.zzd() : null));
                            zzoo.zza(stringBuilder0, 2, "name", this.zzi().zzc(""));
                            zzoo.zza(stringBuilder0, 2, "string_value", "");
                            zzoo.zza(stringBuilder0, 2, "int_value", (zzfy$zzo0.zzk() ? zzfy$zzo0.zzc() : null));
                            if(zzfy$zzo0.zzi()) {
                                double0 = zzfy$zzo0.zza();
                            }
                            zzoo.zza(stringBuilder0, 2, "double_value", double0);
                            zzoo.zza(stringBuilder0, 2);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                List list1 = zzfy$zzk0.zzaq();
                if(list1 != null) {
                    for(Object object2: list1) {
                        com.google.android.gms.internal.measurement.zzfy.zzd zzfy$zzd0 = (com.google.android.gms.internal.measurement.zzfy.zzd)object2;
                        if(zzfy$zzd0 != null) {
                            zzoo.zza(stringBuilder0, 2);
                            stringBuilder0.append("audience_membership {\n");
                            if(zzfy$zzd0.zzg()) {
                                zzoo.zza(stringBuilder0, 2, "audience_id", zzfy$zzd0.zza());
                            }
                            if(zzfy$zzd0.zzh()) {
                                zzoo.zza(stringBuilder0, 2, "new_audience", Boolean.valueOf(zzfy$zzd0.zzf()));
                            }
                            zzoo.zza(stringBuilder0, 2, "current_data", zzfy$zzd0.zzd());
                            if(zzfy$zzd0.zzi()) {
                                zzoo.zza(stringBuilder0, 2, "previous_data", zzfy$zzd0.zze());
                            }
                            zzoo.zza(stringBuilder0, 2);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                List list2 = zzfy$zzk0.zzar();
                if(list2 != null) {
                    for(Object object3: list2) {
                        zzf zzfy$zzf0 = (zzf)object3;
                        if(zzfy$zzf0 != null) {
                            zzoo.zza(stringBuilder0, 2);
                            stringBuilder0.append("event {\n");
                            zzoo.zza(stringBuilder0, 2, "name", this.zzi().zza(""));
                            if(zzfy$zzf0.zzk()) {
                                zzoo.zza(stringBuilder0, 2, "timestamp_millis", zzfy$zzf0.zzd());
                            }
                            if(zzfy$zzf0.zzj()) {
                                zzoo.zza(stringBuilder0, 2, "previous_timestamp_millis", zzfy$zzf0.zzc());
                            }
                            if(zzfy$zzf0.zzi()) {
                                zzoo.zza(stringBuilder0, 2, "count", zzfy$zzf0.zza());
                            }
                            if(zzfy$zzf0.zzb() != 0) {
                                this.zza(stringBuilder0, 2, zzfy$zzf0.zzh());
                            }
                            zzoo.zza(stringBuilder0, 2);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                zzoo.zza(stringBuilder0, 1);
                stringBuilder0.append("}\n");
            }
        }
        stringBuilder0.append("} // End-of-batch\n");
        return stringBuilder0.toString();
    }

    final List zza(List list0, List list1) {
        int v3;
        ArrayList arrayList0 = new ArrayList(list0);
        for(Object object0: list1) {
            Integer integer0 = (Integer)object0;
            if(((int)integer0) < 0) {
                this.zzj().zzu().zza("Ignoring negative bit index to be cleared", integer0);
            }
            else {
                int v = ((int)integer0) / 0x40;
                if(v >= arrayList0.size()) {
                    this.zzj().zzu().zza("Ignoring bit index greater than bitSet size", integer0, arrayList0.size());
                }
                else {
                    arrayList0.set(v, ((long)(((long)(((Long)arrayList0.get(v)))) & ~(1L << ((int)integer0) % 0x40))));
                }
            }
        }
        int v1 = arrayList0.size();
        for(int v2 = arrayList0.size() - 1; true; v2 = v1 - 1) {
            v3 = v1;
            v1 = v2;
            if(v1 < 0 || ((long)(((Long)arrayList0.get(v1)))) != 0L) {
                break;
            }
        }
        return arrayList0.subList(0, v3);
    }

    final Map zza(Bundle bundle0, boolean z) {
        Map map0 = new HashMap();
        for(Object object0: bundle0.keySet()) {
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            boolean z1 = object1 instanceof Parcelable[];
            if(!z1 && !(object1 instanceof ArrayList) && !(object1 instanceof Bundle)) {
                if(object1 == null) {
                    continue;
                }
                map0.put(s, object1);
            }
            else if(z) {
                ArrayList arrayList0 = new ArrayList();
                if(z1) {
                    Parcelable[] arr_parcelable = (Parcelable[])object1;
                    for(int v = 0; v < arr_parcelable.length; ++v) {
                        Parcelable parcelable0 = arr_parcelable[v];
                        if(parcelable0 instanceof Bundle) {
                            arrayList0.add(this.zza(((Bundle)parcelable0), false));
                        }
                    }
                }
                else if(object1 instanceof ArrayList) {
                    ArrayList arrayList1 = (ArrayList)object1;
                    int v1 = arrayList1.size();
                    int v2 = 0;
                    while(v2 < v1) {
                        Object object2 = arrayList1.get(v2);
                        ++v2;
                        if(object2 instanceof Bundle) {
                            arrayList0.add(this.zza(((Bundle)object2), false));
                        }
                    }
                }
                else if(object1 instanceof Bundle) {
                    arrayList0.add(this.zza(((Bundle)object1), false));
                }
                map0.put(s, arrayList0);
            }
        }
        return map0;
    }

    final void zza(com.google.android.gms.internal.measurement.zzfy.zzh.zza zzfy$zzh$zza0, Object object0) {
        Preconditions.checkNotNull(object0);
        zzfy$zzh$zza0.zze().zzc().zzb().zzd();
        if(object0 instanceof String) {
            zzfy$zzh$zza0.zzb(((String)object0));
            return;
        }
        if(object0 instanceof Long) {
            zzfy$zzh$zza0.zza(((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof Double) {
            zzfy$zzh$zza0.zza(((double)(((Double)object0))));
            return;
        }
        if(object0 instanceof Bundle[]) {
            ArrayList arrayList0 = new ArrayList();
            int v = 0;
            while(v < ((Bundle[])object0).length) {
                Bundle bundle0 = ((Bundle[])object0)[v];
                if(bundle0 != null) {
                    com.google.android.gms.internal.measurement.zzfy.zzh.zza zzfy$zzh$zza1 = zzh.zze();
                    for(Object object1: bundle0.keySet()) {
                        com.google.android.gms.internal.measurement.zzfy.zzh.zza zzfy$zzh$zza2 = zzh.zze().zza(((String)object1));
                        Object object2 = bundle0.get(((String)object1));
                        if(object2 instanceof Long) {
                            zzfy$zzh$zza2.zza(((long)(((Long)object2))));
                        }
                        else if(object2 instanceof String) {
                            zzfy$zzh$zza2.zzb(((String)object2));
                        }
                        else {
                            if(!(object2 instanceof Double)) {
                                continue;
                            }
                            zzfy$zzh$zza2.zza(((double)(((Double)object2))));
                        }
                        zzfy$zzh$zza1.zza(zzfy$zzh$zza2);
                    }
                    if(zzfy$zzh$zza1.zza() > 0) {
                        arrayList0.add(((zzh)(((zzjt)zzfy$zzh$zza1.zzai()))));
                    }
                }
                ++v;
            }
            zzfy$zzh$zza0.zza(arrayList0);
            return;
        }
        this.zzj().zzg().zza("Ignoring invalid (type) event param value", object0);
    }

    final void zza(com.google.android.gms.internal.measurement.zzfy.zzo.zza zzfy$zzo$zza0, Object object0) {
        Preconditions.checkNotNull(object0);
        zzfy$zzo$zza0.zzc().zzb().zza();
        if(object0 instanceof String) {
            zzfy$zzo$zza0.zzb(((String)object0));
            return;
        }
        if(object0 instanceof Long) {
            zzfy$zzo$zza0.zza(((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof Double) {
            zzfy$zzo$zza0.zza(((double)(((Double)object0))));
            return;
        }
        this.zzj().zzg().zza("Ignoring invalid (type) user attribute value", object0);
    }

    final boolean zza(long v, long v1) {
        return v == 0L || v1 <= 0L || Math.abs(this.zzb().currentTimeMillis() - v) > v1;
    }

    static Object zzb(zzf zzfy$zzf0, String s) {
        zzh zzfy$zzh0 = zzoo.zza(zzfy$zzf0, s);
        if(zzfy$zzh0 != null) {
            if(zzfy$zzh0.zzn()) {
                return zzfy$zzh0.zzh();
            }
            if(zzfy$zzh0.zzl()) {
                return zzfy$zzh0.zzd();
            }
            if(zzfy$zzh0.zzj()) {
                return zzfy$zzh0.zza();
            }
            if(zzfy$zzh0.zzc() > 0) {
                return zzoo.zzb(zzfy$zzh0.zzi());
            }
        }
        return null;
    }

    static boolean zzb(String s) [...] // 潜在的解密器

    static Bundle[] zzb(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            zzh zzfy$zzh0 = (zzh)object0;
            if(zzfy$zzh0 != null) {
                Bundle bundle0 = new Bundle();
                for(Object object1: zzfy$zzh0.zzi()) {
                    zzh zzfy$zzh1 = (zzh)object1;
                    if(zzfy$zzh1.zzn()) {
                        bundle0.putString("", "");
                    }
                    else if(zzfy$zzh1.zzl()) {
                        bundle0.putLong("", zzfy$zzh1.zzd());
                    }
                    else if(zzfy$zzh1.zzj()) {
                        bundle0.putDouble("", zzfy$zzh1.zza());
                    }
                }
                if(!bundle0.isEmpty()) {
                    arrayList0.add(bundle0);
                }
            }
        }
        return (Bundle[])arrayList0.toArray(new Bundle[arrayList0.size()]);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    final byte[] zzb(byte[] arr_b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0);
            gZIPOutputStream0.write(arr_b);
            gZIPOutputStream0.close();
            byteArrayOutputStream0.close();
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            this.zzj().zzg().zza("Failed to gzip content", iOException0);
            throw iOException0;
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    final byte[] zzc(byte[] arr_b) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            GZIPInputStream gZIPInputStream0 = new GZIPInputStream(byteArrayInputStream0);
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byte[] arr_b1 = new byte[0x400];
            int v;
            while((v = gZIPInputStream0.read(arr_b1)) > 0) {
                byteArrayOutputStream0.write(arr_b1, 0, v);
            }
            gZIPInputStream0.close();
            byteArrayInputStream0.close();
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
        }
        this.zzj().zzg().zza("Failed to ungzip content", iOException0);
        throw iOException0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzab zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzag zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzaz zzf() {
        return super.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzt zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzal zzh() {
        return super.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgh zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzgo zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzha zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzhv zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzhl zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zzmw zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzns
    public final zznu zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzos zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzt() {
        super.zzt();
    }

    final List zzu() {
        Map map0 = zzbh.zza(this.zzg.zza());
        if(map0 != null && !map0.isEmpty()) {
            List list0 = new ArrayList();
            int v = (int)(((Integer)zzbh.zzar.zza(null)));
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((String)map$Entry0.getKey()).startsWith("measurement.id.")) {
                    try {
                        int v1 = Integer.parseInt(((String)map$Entry0.getValue()));
                        if(v1 == 0) {
                            continue;
                        }
                        list0.add(v1);
                        if(list0.size() < v) {
                            continue;
                        }
                        this.zzj().zzu().zza("Too many experiment IDs. Number of IDs", list0.size());
                        return list0.isEmpty() ? null : list0;
                    }
                    catch(NumberFormatException numberFormatException0) {
                        this.zzj().zzu().zza("Experiment ID NumberFormatException", numberFormatException0);
                    }
                }
            }
            return list0.isEmpty() ? null : list0;
        }
        return null;
    }
}

