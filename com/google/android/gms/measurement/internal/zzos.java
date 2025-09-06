package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import w4.d;

public final class zzos extends zzjd {
    private static final String[] zza;
    private static final String[] zzb;
    private SecureRandom zzc;
    private final AtomicLong zzd;
    private int zze;
    private MeasurementManagerFutures zzf;
    private Boolean zzg;
    private Integer zzh;

    static {
        zzos.zza = new String[]{"firebase_", "google_", "ga_"};
        zzos.zzb = new String[]{"_err"};
    }

    zzos(zzhy zzhy0) {
        super(zzhy0);
        this.zzh = null;
        this.zzd = new AtomicLong(0L);
    }

    @WorkerThread
    private final int zza(String s, String s1, String s2, Object object0, Bundle bundle0, List list0, boolean z, boolean z1) {
        int v2;
        int v1;
        this.zzt();
        if(zzos.zza(object0)) {
            if(!z1) {
                return 21;
            }
            if(!zzos.zza(s2, zzjk.zzc)) {
                return 20;
            }
            if(!this.zzu.zzr().zzam()) {
                return 25;
            }
            if(object0 instanceof Parcelable[]) {
                v1 = ((Parcelable[])object0).length;
                goto label_13;
            }
            else if(object0 instanceof ArrayList) {
                v1 = ((ArrayList)object0).size();
            label_13:
                if(v1 > 200) {
                    this.zzj().zzv().zza("Parameter array is too long; discarded. Value kind, name, array length", "param", s2, v1);
                    if(!(object0 instanceof Parcelable[])) {
                        if(object0 instanceof ArrayList && ((ArrayList)object0).size() > 200) {
                            bundle0.putParcelableArrayList(s2, new ArrayList(((ArrayList)object0).subList(0, 200)));
                        }
                    }
                    else if(((Parcelable[])object0).length > 200) {
                        bundle0.putParcelableArray(s2, ((Parcelable[])Arrays.copyOf(((Parcelable[])object0), 200)));
                    }
                    v2 = 17;
                }
                else {
                    v2 = 0;
                }
            }
            else {
                v2 = 0;
            }
        }
        else {
            v2 = 0;
        }
        if(this.zza("param", s2, (zzos.zzg(s1) || zzos.zzg(s2) ? this.zze().zzb(null, false) : this.zze().zza(null, false)), object0)) {
            return v2;
        }
        if(z1) {
            if(object0 instanceof Bundle) {
                this.zza(s, s1, s2, ((Bundle)object0), list0, z);
                return v2;
            }
            if(object0 instanceof Parcelable[]) {
                for(int v3 = 0; v3 < ((Parcelable[])object0).length; ++v3) {
                    Parcelable parcelable0 = ((Parcelable[])object0)[v3];
                    if(!(parcelable0 instanceof Bundle)) {
                        this.zzj().zzv().zza("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable0.getClass(), s2);
                        return 4;
                    }
                    this.zza(s, s1, s2, ((Bundle)parcelable0), list0, z);
                }
                return v2;
            }
            if(object0 instanceof ArrayList) {
                int v4 = ((ArrayList)object0).size();
                for(int v = 0; v < v4; ++v) {
                    Object object1 = ((ArrayList)object0).get(v);
                    if(!(object1 instanceof Bundle)) {
                        zzgq zzgq0 = this.zzj().zzv();
                        Class class0 = object1 == null ? "null" : object1.getClass();
                        zzgq0.zza("All ArrayList elements must be of type Bundle. Value type, name", class0, s2);
                        return 4;
                    }
                    this.zza(s, s1, s2, ((Bundle)object1), list0, z);
                }
                return v2;
            }
        }
        return 4;
    }

    public static long zza(long v, long v1) {
        return (v + v1 * 60000L) / 86400000L;
    }

    public static long zza(zzbe zzbe0) {
        long v = 0L;
        if(zzbe0 == null) {
            return 0L;
        }
        for(Object object0: zzbe0) {
            Object object1 = zzbe0.zzc(((String)object0));
            if(object1 instanceof Parcelable[]) {
                v += (long)((Parcelable[])object1).length;
            }
        }
        return v;
    }

    @VisibleForTesting
    static long zza(byte[] arr_b) {
        Preconditions.checkNotNull(arr_b);
        int v = 0;
        Preconditions.checkState(arr_b.length > 0);
        int v1 = arr_b.length - 1;
        long v2 = 0L;
        while(v1 >= 0 && v1 >= arr_b.length - 8) {
            v2 += (((long)arr_b[v1]) & 0xFFL) << v;
            v += 8;
            --v1;
        }
        return v2;
    }

    public static Bundle zza(Bundle bundle0) {
        if(bundle0 == null) {
            return new Bundle();
        }
        Bundle bundle1 = new Bundle(bundle0);
        Iterator iterator0 = bundle1.keySet().iterator();
        while(iterator0.hasNext()) {
            int v = 0;
            Object object0 = iterator0.next();
            String s = (String)object0;
            Object object1 = bundle1.get(s);
            if(object1 instanceof Bundle) {
                bundle1.putBundle(s, new Bundle(((Bundle)object1)));
            }
            else if(object1 instanceof Parcelable[]) {
                Parcelable[] arr_parcelable = (Parcelable[])object1;
                while(v < arr_parcelable.length) {
                    if(arr_parcelable[v] instanceof Bundle) {
                        arr_parcelable[v] = new Bundle(((Bundle)arr_parcelable[v]));
                    }
                    ++v;
                }
            }
            else if(object1 instanceof List) {
                List list0 = (List)object1;
                while(v < list0.size()) {
                    Object object2 = list0.get(v);
                    if(object2 instanceof Bundle) {
                        list0.set(v, new Bundle(((Bundle)object2)));
                    }
                    ++v;
                }
            }
        }
        return bundle1;
    }

    public static Bundle zza(List list0) {
        Bundle bundle0 = new Bundle();
        if(list0 == null) {
            return bundle0;
        }
        for(Object object0: list0) {
            zzon zzon0 = (zzon)object0;
            String s = zzon0.zzd;
            if(s == null) {
                Long long0 = zzon0.zzc;
                if(long0 == null) {
                    Double double0 = zzon0.zzf;
                    if(double0 != null) {
                        bundle0.putDouble(zzon0.zza, ((double)double0));
                    }
                }
                else {
                    bundle0.putLong(zzon0.zza, ((long)long0));
                }
            }
            else {
                bundle0.putString(zzon0.zza, s);
            }
        }
        return bundle0;
    }

    private final Object zza(int v, Object object0, boolean z, boolean z1, String s) {
        if(object0 == null) {
            return null;
        }
        if(!(object0 instanceof Long) && !(object0 instanceof Double)) {
            if(object0 instanceof Integer) {
                return (long)(((int)(((Integer)object0))));
            }
            if(object0 instanceof Byte) {
                return (long)(((byte)(((Byte)object0))));
            }
            if(object0 instanceof Short) {
                return (long)(((short)(((Short)object0))));
            }
            if(object0 instanceof Boolean) {
                return ((Boolean)object0).booleanValue() ? 1L : 0L;
            }
            if(object0 instanceof Float) {
                return ((Float)object0).doubleValue();
            }
            if(!(object0 instanceof String) && !(object0 instanceof Character) && !(object0 instanceof CharSequence)) {
                if(z1 && (object0 instanceof Bundle[] || object0 instanceof Parcelable[])) {
                    ArrayList arrayList0 = new ArrayList();
                    for(int v1 = 0; v1 < ((Parcelable[])object0).length; ++v1) {
                        Parcelable parcelable0 = ((Parcelable[])object0)[v1];
                        if(parcelable0 instanceof Bundle) {
                            Bundle bundle0 = this.zza(((Bundle)parcelable0), null);
                            if(bundle0 != null && !bundle0.isEmpty()) {
                                arrayList0.add(bundle0);
                            }
                        }
                    }
                    return arrayList0.toArray(new Bundle[arrayList0.size()]);
                }
                return null;
            }
            return zzos.zza(String.valueOf(object0), v, z);
        }
        return object0;
    }

    public static String zza(String s, int v, boolean z) {
        if(s == null) {
            return null;
        }
        if(s.codePointCount(0, s.length()) > v) {
            return z ? s.substring(0, s.offsetByCodePoints(0, v)) + "..." : null;
        }
        return s;
    }

    private static void zza(Bundle bundle0, int v, String s, Object object0) {
        if(zzos.zzb(bundle0, v)) {
            bundle0.putString("_ev", zzos.zza(s, 40, true));
            if(object0 != null) {
                Preconditions.checkNotNull(bundle0);
                if(object0 instanceof String || object0 instanceof CharSequence) {
                    bundle0.putLong("_el", ((long)String.valueOf(object0).length()));
                }
            }
        }
    }

    @WorkerThread
    public static void zza(zzlk zzlk0, Bundle bundle0, boolean z) {
        if(bundle0 != null && zzlk0 != null && (!bundle0.containsKey("_sc") || z)) {
            String s = zzlk0.zza;
            if(s == null) {
                bundle0.remove("_sn");
            }
            else {
                bundle0.putString("_sn", s);
            }
            String s1 = zzlk0.zzb;
            if(s1 == null) {
                bundle0.remove("_sc");
            }
            else {
                bundle0.putString("_sc", s1);
            }
            bundle0.putLong("_si", zzlk0.zzc);
            return;
        }
        if(bundle0 != null && zzlk0 == null && z) {
            bundle0.remove("_sn");
            bundle0.remove("_sc");
            bundle0.remove("_si");
        }
    }

    public static void zza(zzor zzor0, int v, String s, String s1, int v1) {
        zzos.zza(zzor0, null, v, s, s1, v1);
    }

    static void zza(zzor zzor0, String s, int v, String s1, String s2, int v1) {
        Bundle bundle0 = new Bundle();
        zzos.zzb(bundle0, v);
        if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
            bundle0.putString(s1, s2);
        }
        if(v == 2 || v == 6 || v == 7) {
            bundle0.putLong("_el", ((long)v1));
        }
        zzor0.zza(s, "_err", bundle0);
    }

    private final void zza(String s, String s1, String s2, Bundle bundle0, List list0, boolean z) {
        String s4;
        int v6;
        int v5;
        String s5;
        int v4;
        int v2;
        if(bundle0 == null) {
            return;
        }
        int v = this.zze().zzq().zza(231100000, true) ? 35 : 0;
        int v1 = 0;
        for(Object object0: new TreeSet(bundle0.keySet())) {
            String s3 = (String)object0;
            if(list0 == null || !list0.contains(s3)) {
                int v3 = z ? 0 : this.zzl(s3);
                v2 = v3 == 0 ? this.zzk(s3) : v3;
            }
            else {
                v2 = 0;
            }
            switch(v2) {
                case 0: {
                    if(zzos.zza(bundle0.get(s3))) {
                        this.zzj().zzv().zza("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", s1, s2, s3);
                        v4 = 22;
                        s5 = s3;
                        v5 = v;
                    }
                    else {
                        s5 = s3;
                        v5 = v;
                        v4 = this.zza(s, s1, s3, bundle0.get(s3), bundle0, list0, z, false);
                    }
                    if(v4 == 0 || "_ev".equals(s5)) {
                        if(!zzos.zzh(s5) || zzos.zza(s5, zzjk.zzd)) {
                            v6 = v5;
                        }
                        else {
                            if(this.zza(231100000, true)) {
                                v6 = v5;
                                if(v1 + 1 > v6) {
                                    this.zzj().zzm().zza("Item can\'t contain more than " + v6 + " item-scoped custom params", this.zzi().zza(s1), this.zzi().zza(bundle0));
                                    zzos.zzb(bundle0, 28);
                                    bundle0.remove(s5);
                                }
                            }
                            else {
                                this.zzj().zzm().zza("Item array not supported on client\'s version of Google Play Services (Android Only)", this.zzi().zza(s1), this.zzi().zza(bundle0));
                                zzos.zzb(bundle0, 23);
                                bundle0.remove(s5);
                                v6 = v5;
                            }
                            ++v1;
                        }
                        v = v6;
                        continue;
                    }
                    else {
                        zzos.zza(bundle0, v4, s5, bundle0.get(s5));
                        bundle0.remove(s5);
                        break;
                    }
                    goto label_46;
                }
                case 3: {
                label_46:
                    s4 = s3;
                    zzos.zza(bundle0, v2, s3, s4);
                    bundle0.remove(s3);
                    v5 = v;
                    break;
                }
                default: {
                    s4 = null;
                    zzos.zza(bundle0, v2, s3, s4);
                    bundle0.remove(s3);
                    v5 = v;
                    break;
                }
            }
            v = v5;
        }
    }

    static boolean zza(Context context0) {
        Preconditions.checkNotNull(context0);
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return false;
            }
            ActivityInfo activityInfo0 = packageManager0.getReceiverInfo(new ComponentName(context0, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if(activityInfo0 != null) {
                return activityInfo0.enabled;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    static boolean zza(Context context0, boolean z) {
        Preconditions.checkNotNull(context0);
        return Build.VERSION.SDK_INT < 24 ? zzos.zzc(context0, "com.google.android.gms.measurement.AppMeasurementService") : zzos.zzc(context0, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    static boolean zza(Intent intent0) {
        String s = intent0.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(s) || "https://www.google.com".equals(s) || "android-app://com.google.appcrawler".equals(s);
    }

    static boolean zza(Bundle bundle0, int v) {
        int v1 = 0;
        if(bundle0.size() <= v) {
            return false;
        }
        for(Object object0: new TreeSet(bundle0.keySet())) {
            String s = (String)object0;
            ++v1;
            if(v1 > v) {
                bundle0.remove(s);
            }
        }
        return true;
    }

    // 去混淆评级： 低(30)
    static boolean zza(Object object0) {
        return object0 instanceof Parcelable[] || object0 instanceof ArrayList || object0 instanceof Bundle;
    }

    // 去混淆评级： 低(20)
    static boolean zza(String s, String s1, String s2, String s3) {
        boolean z = TextUtils.isEmpty(s);
        boolean z1 = TextUtils.isEmpty(s1);
        if(!z && !z1) {
            Preconditions.checkNotNull(s);
            return !s.equals(s1);
        }
        if(z && z1) {
            return TextUtils.isEmpty(s2) || TextUtils.isEmpty(s3) ? !TextUtils.isEmpty(s3) : !s2.equals(s3);
        }
        return z || !z1 || !TextUtils.isEmpty(s3) ? TextUtils.isEmpty(s2) || !s2.equals(s3) : false;
    }

    private static boolean zza(String s, String[] arr_s) {
        Preconditions.checkNotNull(arr_s);
        for(int v = 0; v < arr_s.length; ++v) {
            if(Objects.equals(s, arr_s[v])) {
                return true;
            }
        }
        return false;
    }

    static byte[] zza(Parcelable parcelable0) {
        if(parcelable0 == null) {
            return null;
        }
        Parcel parcel0 = Parcel.obtain();
        try {
            parcelable0.writeToParcel(parcel0, 0);
            return parcel0.marshall();
        }
        finally {
            parcel0.recycle();
        }
    }

    public final int zza(int v) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zza(), 12451000);
    }

    final int zza(String s) {
        if(!this.zzb("event", s)) {
            return 2;
        }
        if(!this.zza("event", zzji.zza, zzji.zzb, s)) {
            return 13;
        }
        return this.zza("event", 40, s) ? 0 : 2;
    }

    // 去混淆评级： 低(40)
    final int zza(String s, Object object0) {
        return ("_ldl".equals(s) ? this.zza("user property referrer", s, zzos.zzm(s), object0) : this.zza("user property", s, zzos.zzm(s), object0)) ? 0 : 7;
    }

    @WorkerThread
    final long zza(Context context0, String s) {
        this.zzt();
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotEmpty(s);
        PackageManager packageManager0 = context0.getPackageManager();
        MessageDigest messageDigest0 = zzos.zzu();
        if(messageDigest0 == null) {
            this.zzj().zzg().zza("Could not get MD5 instance");
            return -1L;
        }
        if(packageManager0 != null) {
            try {
                if(!this.zzb(context0, s)) {
                    Signature[] arr_signature = Wrappers.packageManager(context0).getPackageInfo("com.dcinside.app.android", 0x40).signatures;
                    if(arr_signature != null && arr_signature.length > 0) {
                        return zzos.zza(messageDigest0.digest(arr_signature[0].toByteArray()));
                    }
                    this.zzj().zzu().zza("Could not get signatures");
                    return -1L;
                }
                return 0L;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            }
            this.zzj().zzg().zza("Package name not found", packageManager$NameNotFoundException0);
        }
        return 0L;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final Context zza() {
        return super.zza();
    }

    final Bundle zza(Uri uri0, boolean z) {
        String s8;
        String s7;
        String s6;
        String s5;
        String s4;
        String s3;
        String s2;
        String s1;
        String s;
        if(uri0 == null) {
            return null;
        }
        try {
            if(uri0.isHierarchical()) {
                s = uri0.getQueryParameter("utm_campaign");
                s1 = uri0.getQueryParameter("utm_source");
                s2 = uri0.getQueryParameter("utm_medium");
                s3 = uri0.getQueryParameter("gclid");
                s4 = z ? uri0.getQueryParameter("gbraid") : null;
                s5 = uri0.getQueryParameter("utm_id");
                s6 = uri0.getQueryParameter("dclid");
                s7 = uri0.getQueryParameter("srsltid");
                s8 = uri0.getQueryParameter("sfmc_id");
            }
            else {
                s = null;
                s1 = null;
                s2 = null;
                s3 = null;
                s4 = null;
                s5 = null;
                s6 = null;
                s7 = null;
                s8 = null;
            }
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            this.zzj().zzu().zza("Install referrer url isn\'t a hierarchical URI", unsupportedOperationException0);
            return null;
        }
        if(TextUtils.isEmpty(s) && TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2) && TextUtils.isEmpty(s3) && (!z || TextUtils.isEmpty(s4)) && TextUtils.isEmpty(s5) && TextUtils.isEmpty(s6) && TextUtils.isEmpty(s7) && TextUtils.isEmpty(s8)) {
            return null;
        }
        Bundle bundle0 = new Bundle();
        if(!TextUtils.isEmpty(s)) {
            bundle0.putString("campaign", s);
        }
        if(!TextUtils.isEmpty(s1)) {
            bundle0.putString("source", s1);
        }
        if(!TextUtils.isEmpty(s2)) {
            bundle0.putString("medium", s2);
        }
        if(!TextUtils.isEmpty(s3)) {
            bundle0.putString("gclid", s3);
        }
        if(z && !TextUtils.isEmpty(s4)) {
            bundle0.putString("gbraid", s4);
        }
        String s9 = uri0.getQueryParameter("gad_source");
        if(z && !TextUtils.isEmpty(s9)) {
            bundle0.putString("gad_source", s9);
        }
        String s10 = uri0.getQueryParameter("utm_term");
        if(!TextUtils.isEmpty(s10)) {
            bundle0.putString("term", s10);
        }
        String s11 = uri0.getQueryParameter("utm_content");
        if(!TextUtils.isEmpty(s11)) {
            bundle0.putString("content", s11);
        }
        String s12 = uri0.getQueryParameter("aclid");
        if(!TextUtils.isEmpty(s12)) {
            bundle0.putString("aclid", s12);
        }
        String s13 = uri0.getQueryParameter("cp1");
        if(!TextUtils.isEmpty(s13)) {
            bundle0.putString("cp1", s13);
        }
        String s14 = uri0.getQueryParameter("anid");
        if(!TextUtils.isEmpty(s14)) {
            bundle0.putString("anid", s14);
        }
        if(!TextUtils.isEmpty(s5)) {
            bundle0.putString("campaign_id", s5);
        }
        if(!TextUtils.isEmpty(s6)) {
            bundle0.putString("dclid", s6);
        }
        String s15 = uri0.getQueryParameter("utm_source_platform");
        if(!TextUtils.isEmpty(s15)) {
            bundle0.putString("source_platform", s15);
        }
        String s16 = uri0.getQueryParameter("utm_creative_format");
        if(!TextUtils.isEmpty(s16)) {
            bundle0.putString("creative_format", s16);
        }
        String s17 = uri0.getQueryParameter("utm_marketing_tactic");
        if(!TextUtils.isEmpty(s17)) {
            bundle0.putString("marketing_tactic", s17);
        }
        if(!TextUtils.isEmpty(s7)) {
            bundle0.putString("srsltid", s7);
        }
        if(!TextUtils.isEmpty(s8)) {
            bundle0.putString("sfmc_id", s8);
        }
        return bundle0;
    }

    final Bundle zza(Bundle bundle0, String s) {
        Bundle bundle1 = new Bundle();
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                String s1 = (String)object0;
                Object object1 = this.zzb(s1, bundle0.get(s1));
                if(object1 == null) {
                    this.zzj().zzv().zza("Param value can\'t be null", this.zzi().zzb(s1));
                }
                else {
                    this.zza(bundle1, s1, object1);
                }
            }
        }
        return bundle1;
    }

    final Bundle zza(String s, String s1, Bundle bundle0, List list0, boolean z) {
        String s3;
        int v4;
        int v2;
        boolean z1 = zzos.zza(s1, zzji.zzd);
        if(bundle0 != null) {
            Bundle bundle1 = new Bundle(bundle0);
            int v = this.zze().zzc();
            int v1 = 0;
            for(Object object0: new TreeSet(bundle0.keySet())) {
                String s2 = (String)object0;
                if(list0 == null || !list0.contains(s2)) {
                    int v3 = z ? 0 : this.zzl(s2);
                    v2 = v3 == 0 ? this.zzk(s2) : v3;
                }
                else {
                    v2 = 0;
                }
                switch(v2) {
                    case 0: {
                        v4 = v;
                        int v5 = this.zza(s, s1, s2, bundle0.get(s2), bundle1, list0, z, z1);
                        if(v5 == 17) {
                            zzos.zza(bundle1, 17, s2, Boolean.FALSE);
                        }
                        else if(v5 != 0 && !"_ev".equals(s2)) {
                            zzos.zza(bundle1, v5, (v5 == 21 ? s1 : s2), bundle0.get(s2));
                            bundle1.remove(s2);
                            break;
                        }
                        if(zzos.zzh(s2)) {
                            if(v1 + 1 > v4) {
                                this.zzj().zzm().zza("Event can\'t contain more than " + v4 + " params", this.zzi().zza(s1), this.zzi().zza(bundle0));
                                zzos.zzb(bundle1, 5);
                                bundle1.remove(s2);
                            }
                            ++v1;
                        }
                        break;
                    }
                    case 3: {
                        s3 = s2;
                        zzos.zza(bundle1, v2, s2, s3);
                        bundle1.remove(s2);
                        v4 = v;
                        break;
                    }
                    default: {
                        s3 = null;
                        zzos.zza(bundle1, v2, s2, s3);
                        bundle1.remove(s2);
                        v4 = v;
                        break;
                    }
                }
                v = v4;
            }
            return bundle1;
        }
        return null;
    }

    final zzbf zza(String s, String s1, Bundle bundle0, String s2, long v, boolean z, boolean z1) {
        if(TextUtils.isEmpty(s1)) {
            return null;
        }
        if(this.zza(s1) == 0) {
            Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
            bundle1.putString("_o", s2);
            Bundle bundle2 = this.zza(s, s1, bundle1, CollectionUtils.listOf("_o"), true);
            if(z) {
                bundle2 = this.zza(bundle2, s);
            }
            Preconditions.checkNotNull(bundle2);
            return new zzbf(s1, new zzbe(bundle2), s2, v);
        }
        this.zzj().zzg().zza("Invalid conditional property event name", this.zzi().zzc(s1));
        throw new IllegalArgumentException();
    }

    public final URL zza(long v, String s, String s1, long v1, String s2) {
        try {
            Preconditions.checkNotEmpty(s1);
            Preconditions.checkNotEmpty(s);
            String s3 = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", v, this.zzg()), s1, s, v1);
            if(s.equals(this.zze().zzp())) {
                s3 = s3 + "&ddl_test=1";
            }
            if(!s2.isEmpty()) {
                if(s2.charAt(0) != 38) {
                    s3 = s3 + "&";
                }
                s3 = s3 + s2;
            }
            return new URL(s3);
        }
        catch(MalformedURLException | IllegalArgumentException malformedURLException0) {
        }
        this.zzj().zzg().zza("Failed to create BOW URL for Deferred Deep Link. exception", malformedURLException0.getMessage());
        return null;
    }

    @WorkerThread
    final void zza(Bundle bundle0, long v) {
        long v1 = bundle0.getLong("_et");
        if(v1 != 0L) {
            this.zzj().zzu().zza("Params already contained engagement", v1);
        }
        bundle0.putLong("_et", v + v1);
    }

    final void zza(Bundle bundle0, Bundle bundle1) {
        if(bundle1 == null) {
            return;
        }
        for(Object object0: bundle1.keySet()) {
            String s = (String)object0;
            if(!bundle0.containsKey(s)) {
                this.zzq().zza(bundle0, s, bundle1.get(s));
            }
        }
    }

    final void zza(Bundle bundle0, String s, Object object0) {
        if(bundle0 == null) {
            return;
        }
        if(object0 instanceof Long) {
            bundle0.putLong(s, ((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof String) {
            bundle0.putString(s, String.valueOf(object0));
            return;
        }
        if(object0 instanceof Double) {
            bundle0.putDouble(s, ((double)(((Double)object0))));
            return;
        }
        if(object0 instanceof Bundle[]) {
            bundle0.putParcelableArray(s, ((Bundle[])object0));
            return;
        }
        if(s != null) {
            String s1 = object0 == null ? null : object0.getClass().getSimpleName();
            this.zzj().zzv().zza("Not putting event parameter. Invalid value type. name, type", this.zzi().zzb(s), s1);
        }
    }

    public final void zza(zzdo zzdo0, int v) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("r", v);
        try {
            zzdo0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning int value to wrapper", remoteException0);
        }
    }

    public final void zza(zzdo zzdo0, long v) {
        Bundle bundle0 = new Bundle();
        bundle0.putLong("r", v);
        try {
            zzdo0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning long value to wrapper", remoteException0);
        }
    }

    public final void zza(zzdo zzdo0, Bundle bundle0) {
        try {
            zzdo0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning bundle value to wrapper", remoteException0);
        }
    }

    public final void zza(zzdo zzdo0, String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("r", s);
        try {
            zzdo0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning string value to wrapper", remoteException0);
        }
    }

    public final void zza(zzdo zzdo0, ArrayList arrayList0) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelableArrayList("r", arrayList0);
        try {
            zzdo0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning bundle list to wrapper", remoteException0);
        }
    }

    public final void zza(zzdo zzdo0, boolean z) {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("r", z);
        try {
            zzdo0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning boolean value to wrapper", remoteException0);
        }
    }

    public final void zza(zzdo zzdo0, byte[] arr_b) {
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("r", arr_b);
        try {
            zzdo0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzu.zzj().zzu().zza("Error returning byte array to wrapper", remoteException0);
        }
    }

    final void zza(zzgs zzgs0, int v) {
        int v1 = 0;
        for(Object object0: new TreeSet(zzgs0.zzc.keySet())) {
            String s = (String)object0;
            if(zzos.zzh(s)) {
                ++v1;
                if(v1 > v) {
                    this.zzj().zzm().zza("Event can\'t contain more than " + v + " params", this.zzi().zza(zzgs0.zza), this.zzi().zza(zzgs0.zzc));
                    zzos.zzb(zzgs0.zzc, 5);
                    zzgs0.zzc.remove(s);
                }
            }
        }
    }

    final void zza(Parcelable[] arr_parcelable, int v) {
        Preconditions.checkNotNull(arr_parcelable);
        for(int v1 = 0; v1 < arr_parcelable.length; ++v1) {
            Bundle bundle0 = (Bundle)arr_parcelable[v1];
            int v2 = 0;
            for(Object object0: new TreeSet(bundle0.keySet())) {
                String s = (String)object0;
                if(zzos.zzh(s) && !zzos.zza(s, zzjk.zzd)) {
                    ++v2;
                    if(v2 > v) {
                        this.zzj().zzm().zza("Param can\'t contain more than " + v + " item-scoped custom parameters", this.zzi().zzb(s), this.zzi().zza(bundle0));
                        zzos.zzb(bundle0, 28);
                        bundle0.remove(s);
                    }
                }
            }
        }
    }

    public final boolean zza(int v, boolean z) {
        Boolean boolean0 = this.zzu.zzr().zzab();
        return this.zzg() >= v / 1000 || boolean0 != null && !boolean0.booleanValue();
    }

    @SuppressLint({"ApplySharedPref"})
    final boolean zza(String s, double f) {
        try {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            sharedPreferences$Editor0.putString("deeplink", s);
            sharedPreferences$Editor0.putLong("timestamp", Double.doubleToRawLongBits(f));
            return sharedPreferences$Editor0.commit();
        }
        catch(RuntimeException runtimeException0) {
            this.zzj().zzg().zza("Failed to persist Deferred Deep Link. exception", runtimeException0);
            return false;
        }
    }

    final boolean zza(String s, int v, String s1) {
        if(s1 == null) {
            this.zzj().zzm().zza("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.codePointCount(0, s1.length()) > v) {
            this.zzj().zzm().zza("Name is too long. Type, maximum supported length, name", s, v, s1);
            return false;
        }
        return true;
    }

    final boolean zza(String s, String s1) {
        if(!TextUtils.isEmpty(s)) {
            if(zzos.zzn(s)) {
                return true;
            }
            if(this.zzu.zzae()) {
                this.zzj().zzm().zza("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzgo.zza(s));
            }
            return false;
        }
        if(!TextUtils.isEmpty(s1)) {
            if(!zzos.zzn(s1)) {
                this.zzj().zzm().zza("Invalid admob_app_id. Analytics disabled.", zzgo.zza(s1));
                return false;
            }
            return true;
        }
        if(this.zzu.zzae()) {
            this.zzj().zzm().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    final boolean zza(String s, String s1, int v, Object object0) {
        if(object0 == null) {
            return true;
        }
        if(!(object0 instanceof Long) && !(object0 instanceof Float) && !(object0 instanceof Integer) && !(object0 instanceof Byte) && !(object0 instanceof Short) && !(object0 instanceof Boolean) && !(object0 instanceof Double)) {
            if(!(object0 instanceof String) && !(object0 instanceof Character) && !(object0 instanceof CharSequence)) {
                return false;
            }
            String s2 = String.valueOf(object0);
            if(s2.codePointCount(0, s2.length()) > v) {
                this.zzj().zzv().zza("Value is too long; discarded. Value kind, name, value length", s, s1, s2.length());
                return false;
            }
        }
        return true;
    }

    final boolean zza(String s, String[] arr_s, String s1) {
        return this.zza(s, arr_s, null, s1);
    }

    final boolean zza(String s, String[] arr_s, String[] arr_s1, String s1) {
        if(s1 == null) {
            this.zzj().zzm().zza("Name is required and can\'t be null. Type", s);
            return false;
        }
        Preconditions.checkNotNull(s1);
        String[] arr_s2 = zzos.zza;
        for(int v = 0; v < arr_s2.length; ++v) {
            if(s1.startsWith(arr_s2[v])) {
                this.zzj().zzm().zza("Name starts with reserved prefix. Type, name", s, s1);
                return false;
            }
        }
        if(arr_s != null && zzos.zza(s1, arr_s) && (arr_s1 == null || !zzos.zza(s1, arr_s1))) {
            this.zzj().zzm().zza("Name is reserved. Type, name", s, s1);
            return false;
        }
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjd
    @WorkerThread
    protected final void zzaa() {
        this.zzt();
        SecureRandom secureRandom0 = new SecureRandom();
        long v = secureRandom0.nextLong();
        if(v == 0L) {
            v = secureRandom0.nextLong();
            if(v == 0L) {
                this.zzj().zzu().zza("Utils falling back to Random for random id");
            }
        }
        this.zzd.set(v);
    }

    public static ArrayList zzb(List list0) {
        if(list0 == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("app_id", ((zzae)object0).zza);
            bundle0.putString("origin", ((zzae)object0).zzb);
            bundle0.putLong("creation_timestamp", ((zzae)object0).zzd);
            bundle0.putString("name", ((zzae)object0).zzc.zza);
            zzjf.zza(bundle0, Preconditions.checkNotNull(((zzae)object0).zzc.zza()));
            bundle0.putBoolean("active", ((zzae)object0).zze);
            String s = ((zzae)object0).zzf;
            if(s != null) {
                bundle0.putString("trigger_event_name", s);
            }
            zzbf zzbf0 = ((zzae)object0).zzg;
            if(zzbf0 != null) {
                bundle0.putString("timed_out_event_name", zzbf0.zza);
                zzbe zzbe0 = zzbf0.zzb;
                if(zzbe0 != null) {
                    bundle0.putBundle("timed_out_event_params", zzbe0.zzb());
                }
            }
            bundle0.putLong("trigger_timeout", ((zzae)object0).zzh);
            zzbf zzbf1 = ((zzae)object0).zzi;
            if(zzbf1 != null) {
                bundle0.putString("triggered_event_name", zzbf1.zza);
                zzbe zzbe1 = zzbf1.zzb;
                if(zzbe1 != null) {
                    bundle0.putBundle("triggered_event_params", zzbe1.zzb());
                }
            }
            bundle0.putLong("triggered_timestamp", ((zzae)object0).zzc.zzb);
            bundle0.putLong("time_to_live", ((zzae)object0).zzj);
            zzbf zzbf2 = ((zzae)object0).zzk;
            if(zzbf2 != null) {
                bundle0.putString("expired_event_name", zzbf2.zza);
                zzbe zzbe2 = zzbf2.zzb;
                if(zzbe2 != null) {
                    bundle0.putBundle("expired_event_params", zzbe2.zzb());
                }
            }
            arrayList0.add(bundle0);
        }
        return arrayList0;
    }

    @VisibleForTesting
    private final boolean zzb(Context context0, String s) {
        X500Principal x500Principal0 = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(s, 0x40);
            if(packageInfo0 != null) {
                Signature[] arr_signature = packageInfo0.signatures;
                if(arr_signature != null && arr_signature.length > 0) {
                    Signature signature0 = arr_signature[0];
                    return ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature0.toByteArray()))).getSubjectX500Principal().equals(x500Principal0);
                }
            }
        }
        catch(CertificateException certificateException0) {
            this.zzj().zzg().zza("Error obtaining certificate", certificateException0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            this.zzj().zzg().zza("Package name not found", packageManager$NameNotFoundException0);
        }
        return true;
    }

    private static boolean zzb(Bundle bundle0, int v) {
        if(bundle0 == null) {
            return false;
        }
        if(bundle0.getLong("_err") == 0L) {
            bundle0.putLong("_err", ((long)v));
            return true;
        }
        return false;
    }

    static Bundle[] zzb(Object object0) {
        if(object0 instanceof Bundle) {
            return new Bundle[]{((Bundle)object0)};
        }
        if(object0 instanceof Parcelable[]) {
            return (Bundle[])Arrays.copyOf(((Parcelable[])object0), ((Parcelable[])object0).length, Bundle[].class);
        }
        return object0 instanceof ArrayList ? ((Bundle[])((ArrayList)object0).toArray(new Bundle[((ArrayList)object0).size()])) : null;
    }

    final int zzb(String s) {
        if(!this.zzb("user property", s)) {
            return 6;
        }
        if(!this.zza("user property", zzjj.zza, s)) {
            return 15;
        }
        return this.zza("user property", 24, s) ? 0 : 6;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    final Object zzb(String s, Object object0) {
        if("_ev".equals(s)) {
            return this.zza(this.zze().zzb(null, false), object0, true, true, null);
        }
        return zzos.zzg(s) ? this.zza(this.zze().zzb(null, false), object0, false, true, null) : this.zza(this.zze().zza(null, false), object0, false, true, null);
    }

    final boolean zzb(String s, String s1) {
        if(s1 == null) {
            this.zzj().zzm().zza("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.length() == 0) {
            this.zzj().zzm().zza("Name is required and can\'t be empty. Type", s);
            return false;
        }
        int v = s1.codePointAt(0);
        if(!Character.isLetter(v) && v != 0x5F) {
            this.zzj().zzm().zza("Name must start with a letter or _ (underscore). Type, name", s, s1);
            return false;
        }
        int v1 = s1.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s1.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                this.zzj().zzm().zza("Name must consist of letters, digits or _ (underscores). Type, name", s, s1);
                return false;
            }
        }
        return true;
    }

    static int zzc() {
        return Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3 ? 0 : SdkExtensions.getExtensionVersion(1000000);
    }

    private static boolean zzc(Context context0, String s) {
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return false;
            }
            ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, s), 0);
            if(serviceInfo0 != null) {
                return serviceInfo0.enabled;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    @WorkerThread
    final long zzc(String s) {
        if(this.zza().getPackageManager() == null) {
            return 0L;
        }
        try {
            if(Wrappers.packageManager(this.zza()).getApplicationInfo(s, 0) != null) {
                return 35L;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            this.zzj().zzo().zza("PackageManager failed to find running app: app_id", s);
        }
        return 0L;
    }

    // 去混淆评级： 低(20)
    final Object zzc(String s, Object object0) {
        return "_ldl".equals(s) ? this.zza(zzos.zzm(s), object0, true, false, null) : this.zza(zzos.zzm(s), object0, false, false, null);
    }

    final boolean zzc(String s, String s1) {
        if(s1 == null) {
            this.zzj().zzm().zza("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.length() == 0) {
            this.zzj().zzm().zza("Name is required and can\'t be empty. Type", s);
            return false;
        }
        int v = s1.codePointAt(0);
        if(!Character.isLetter(v)) {
            this.zzj().zzm().zza("Name must start with a letter. Type, name", s, s1);
            return false;
        }
        int v1 = s1.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s1.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                this.zzj().zzm().zza("Name must consist of letters, digits or _ (underscores). Type, name", s, s1);
                return false;
            }
        }
        return true;
    }

    // 去混淆评级： 低(20)
    static boolean zzd(String s) {
        return zzos.zze("com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword", s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzab zzd() {
        return super.zzd();
    }

    final boolean zzd(String s, String s1) {
        if(zzpu.zza() && this.zze().zza(zzbh.zzby) && !TextUtils.isEmpty(s1)) {
            return true;
        }
        return TextUtils.isEmpty(s) ? false : this.zze().zzo().equals(s);
    }

    // 去混淆评级： 低(20)
    private static boolean zze(String s, String s1) {
        return s.equals("*") || Arrays.asList(s.split(",")).contains(s1);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzag zze() {
        return super.zze();
    }

    @WorkerThread
    final boolean zze(String s) {
        this.zzt();
        if(Wrappers.packageManager(this.zza()).checkCallingOrSelfPermission(s) == 0) {
            return true;
        }
        this.zzj().zzc().zza("Permission not granted", s);
        return false;
    }

    // 去混淆评级： 低(20)
    static boolean zzf(String s) {
        return zzos.zze("de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda,com.thetrainline,com.simo.androidtest,de.aboutyou.mobile.app,com.hometogo,de.casamundo.casamundomobile,it.casevacanz,eu.coolblue.shop,com.stihl.app,com.indeed.android.jobsearch,com.homeretailgroup.argos.android,com.dylvian.mango.activities.pre,se.nansen.coop.qa", s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzaz zzf() {
        return super.zzf();
    }

    // 去混淆评级： 低(20)
    static boolean zzg(String s) {
        return !TextUtils.isEmpty(s) && s.startsWith("_");
    }

    @h4.d({"this.apkVersion"})
    public final int zzg() {
        if(this.zzh == null) {
            this.zzh = (int)(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zza()) / 1000);
        }
        return (int)this.zzh;
    }

    static boolean zzh(String s) {
        Preconditions.checkNotEmpty(s);
        return s.charAt(0) != 0x5F || s.equals("_ep");
    }

    @Override  // com.google.android.gms.measurement.internal.zzjd
    protected final boolean zzh() {
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgh zzi() {
        return super.zzi();
    }

    public final boolean zzi(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        List list0 = this.zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0);
        return list0 != null && !list0.isEmpty();
    }

    public static boolean zzj(String s) {
        String[] arr_s = zzos.zzb;
        for(int v = 0; v < arr_s.length; ++v) {
            if(arr_s[v].equals(s)) {
                return false;
            }
        }
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgo zzj() {
        return super.zzj();
    }

    private final int zzk(String s) {
        if(!this.zzb("event param", s)) {
            return 3;
        }
        if(!this.zza("event param", null, s)) {
            return 14;
        }
        return this.zza("event param", 40, s) ? 0 : 3;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzha zzk() {
        return super.zzk();
    }

    private final int zzl(String s) {
        if(!this.zzc("event param", s)) {
            return 3;
        }
        if(!this.zza("event param", null, s)) {
            return 14;
        }
        return this.zza("event param", 40, s) ? 0 : 3;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzhv zzl() {
        return super.zzl();
    }

    private static int zzm(String s) {
        if("_ldl".equals(s)) {
            return 0x800;
        }
        if("_id".equals(s)) {
            return 0x100;
        }
        return "_lgclid".equals(s) ? 100 : 36;
    }

    @WorkerThread
    final long zzm() {
        long v;
        this.zzt();
        if(!zzos.zzd(this.zzu.zzh().zzad())) {
            return 0L;
        }
        if(Build.VERSION.SDK_INT < 30) {
            v = 4L;
        }
        else if(SdkExtensions.getExtensionVersion(30) < 4) {
            v = 8L;
        }
        else {
            v = zzos.zzc() >= ((int)(((Integer)zzbh.zzax.zza(null)))) ? 0L : 16L;
        }
        if(!this.zze("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            v |= 2L;
        }
        if(v == 0L && !this.zzy()) {
            v = 0x40L;
        }
        return v == 0L ? 1L : v;
    }

    @VisibleForTesting
    private static boolean zzn(String s) {
        Preconditions.checkNotNull(s);
        return s.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public final long zzn() {
        int v2;
        long v1;
        if(this.zzd.get() == 0L) {
            synchronized(this.zzd) {
                v1 = new Random(System.nanoTime() ^ this.zzb().currentTimeMillis()).nextLong();
                v2 = this.zze + 1;
                this.zze = v2;
            }
            return v1 + ((long)v2);
        }
        synchronized(this.zzd) {
            this.zzd.compareAndSet(-1L, 1L);
        }
        return this.zzd.getAndIncrement();
    }

    final MeasurementManagerFutures zzo() {
        if(this.zzf == null) {
            this.zzf = MeasurementManagerFutures.b(this.zza());
        }
        return this.zzf;
    }

    final String zzp() {
        byte[] arr_b = new byte[16];
        this.zzv().nextBytes(arr_b);
        return String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
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

    static MessageDigest zzu() {
        for(int v = 0; v < 2; ++v) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                if(messageDigest0 != null) {
                    return messageDigest0;
                }
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
        }
        return null;
    }

    @WorkerThread
    @h4.d({"this.secureRandom"})
    final SecureRandom zzv() {
        this.zzt();
        if(this.zzc == null) {
            this.zzc = new SecureRandom();
        }
        return this.zzc;
    }

    @WorkerThread
    final boolean zzw() {
        this.zzt();
        return this.zzm() == 1L;
    }

    public final boolean zzx() {
        try {
            this.zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        }
        catch(ClassNotFoundException unused_ex) {
            return false;
        }
    }

    @TargetApi(30)
    @WorkerThread
    private final boolean zzy() {
        if(this.zzg == null) {
            MeasurementManagerFutures measurementManagerFutures0 = this.zzo();
            boolean z = false;
            if(measurementManagerFutures0 == null) {
                return false;
            }
            t0 t00 = measurementManagerFutures0.c();
            Integer integer0 = null;
            try {
                integer0 = (Integer)t00.get(10000L, TimeUnit.MILLISECONDS);
                if(integer0 != null && ((int)integer0) == 1) {
                    z = true;
                }
                this.zzg = Boolean.valueOf(z);
            }
            catch(CancellationException | ExecutionException | InterruptedException | TimeoutException cancellationException0) {
                this.zzj().zzu().zza("Measurement manager api exception", cancellationException0);
                this.zzg = Boolean.FALSE;
            }
            this.zzj().zzp().zza("Measurement manager api status result", integer0);
        }
        return this.zzg.booleanValue();
    }
}

