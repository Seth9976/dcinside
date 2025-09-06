package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import jeb.synthetic.TWR;

@KeepForSdk
public final class DynamiteModule {
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @NonNull
        public static ClassLoader sClassLoader;

    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        LoadingException(String s, zzo zzo0) {
            super(s);
        }

        LoadingException(String s, Throwable throwable0, zzo zzo0) {
            super(s, throwable0);
        }
    }

    public interface VersionPolicy {
        @KeepForSdk
        public interface IVersions {
            int zza(@NonNull Context arg1, @NonNull String arg2);

            int zzb(@NonNull Context arg1, @NonNull String arg2, boolean arg3) throws LoadingException;
        }

        @KeepForSdk
        public static class SelectionResult {
            @KeepForSdk
            public int localVersion;
            @KeepForSdk
            public int remoteVersion;
            @KeepForSdk
            public int selection;

            public SelectionResult() {
                this.localVersion = 0;
                this.remoteVersion = 0;
                this.selection = 0;
            }
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context arg1, @NonNull String arg2, @NonNull IVersions arg3) throws LoadingException;
    }

    @KeepForSdk
    public static final int LOCAL = -1;
    @KeepForSdk
    public static final int NONE = 0;
    @KeepForSdk
    public static final int NO_SELECTION = 0;
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = null;
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = null;
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = null;
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = null;
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = null;
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = null;
    @KeepForSdk
    public static final int REMOTE = 1;
    @NonNull
    public static final VersionPolicy zza = null;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static final ThreadLocal zzg;
    private static final ThreadLocal zzh;
    private static final IVersions zzi;
    private final Context zzj;
    private static zzp zzk;
    private static zzq zzl;

    static {
        DynamiteModule.zzg = new ThreadLocal();
        DynamiteModule.zzh = new zzd();
        DynamiteModule.zzi = new zze();
        DynamiteModule.PREFER_REMOTE = new zzf();
        DynamiteModule.PREFER_LOCAL = new zzg();
        DynamiteModule.PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
        DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
        DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
        DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
        DynamiteModule.zza = new zzl();
    }

    private DynamiteModule(Context context0) {
        Preconditions.checkNotNull(context0);
        this.zzj = context0;
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context0, @NonNull String s) {
        try {
            Class class0 = context0.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + s + ".ModuleDescriptor");
            Field field0 = class0.getDeclaredField("MODULE_ID");
            Field field1 = class0.getDeclaredField("MODULE_VERSION");
            if(!Objects.equal(field0.get(null), s)) {
                Log.e("DynamiteModule", "Module descriptor id \'" + field0.get(null) + "\' didn\'t match expected id \'" + s + "\'");
                return 0;
            }
            return field1.getInt(null);
        }
        catch(ClassNotFoundException unused_ex) {
        }
        catch(Exception exception0) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: " + exception0.getMessage());
            return 0;
        }
        Log.w("DynamiteModule", "Local module descriptor class for " + s + " not found.");
        return 0;
    }

    @NonNull
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context0, @NonNull String s) {
        return DynamiteModule.zza(context0, s, false);
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String s) throws LoadingException {
        try {
            return (IBinder)this.zzj.getClassLoader().loadClass(s).newInstance();
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException classNotFoundException0) {
            throw new LoadingException("Failed to instantiate module class: " + s, classNotFoundException0, null);
        }
    }

    @NonNull
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context0, @NonNull VersionPolicy dynamiteModule$VersionPolicy0, @NonNull String s) throws LoadingException {
        DynamiteModule dynamiteModule1;
        IObjectWrapper iObjectWrapper1;
        IObjectWrapper iObjectWrapper0;
        Cursor cursor0;
        Context context2;
        zzq zzq0;
        Class class1;
        Class class0;
        int v2;
        zzm zzm2;
        DynamiteModule dynamiteModule0;
        SelectionResult dynamiteModule$VersionPolicy$SelectionResult0;
        Context context1 = context0.getApplicationContext();
        if(context1 == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal0 = DynamiteModule.zzg;
        zzm zzm0 = (zzm)threadLocal0.get();
        zzm zzm1 = new zzm(null);
        threadLocal0.set(zzm1);
        Long long0 = (Long)DynamiteModule.zzh.get();
        long v = (long)long0;
        try {
            Long long1 = SystemClock.uptimeMillis();
            DynamiteModule.zzh.set(long1);
            dynamiteModule$VersionPolicy$SelectionResult0 = dynamiteModule$VersionPolicy0.selectModule(context0, s, DynamiteModule.zzi);
            Log.i("DynamiteModule", "Considering local module " + s + ":" + dynamiteModule$VersionPolicy$SelectionResult0.localVersion + " and remote module " + s + ":" + dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion);
            int v1 = dynamiteModule$VersionPolicy$SelectionResult0.selection;
            if(v1 == 0) {
                throw new LoadingException("No acceptable module " + s + " found. Local version is " + dynamiteModule$VersionPolicy$SelectionResult0.localVersion + " and remote version is " + dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion + ".", null);
            }
            if(v1 == -1) {
                if(dynamiteModule$VersionPolicy$SelectionResult0.localVersion == 0) {
                    throw new LoadingException("No acceptable module " + s + " found. Local version is " + dynamiteModule$VersionPolicy$SelectionResult0.localVersion + " and remote version is " + dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion + ".", null);
                }
                v1 = -1;
            }
            if(v1 == 1 && dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion == 0) {
                throw new LoadingException("No acceptable module " + s + " found. Local version is " + dynamiteModule$VersionPolicy$SelectionResult0.localVersion + " and remote version is " + dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion + ".", null);
            }
            if(v1 == -1) {
                dynamiteModule0 = DynamiteModule.zzc(context1, s);
                zzm2 = zzm0;
                goto label_131;
            }
            if(v1 != 1) {
                throw new LoadingException("VersionPolicy returned invalid code:" + v1, null);
            }
        }
        catch(Throwable throwable0) {
            goto label_143;
        }
        try {
            v2 = dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion;
            class0 = DynamiteModule.class;
            __monitor_enter(class0);
        }
        catch(RemoteException remoteException0) {
            zzm2 = zzm0;
            throw new LoadingException("Failed to load remote module.", remoteException0, null);
        }
        catch(LoadingException dynamiteModule$LoadingException0) {
            zzm2 = zzm0;
            throw dynamiteModule$LoadingException0;
        }
        catch(Throwable throwable1) {
            zzm2 = zzm0;
            goto label_122;
        }
        try {
            if(DynamiteModule.zzf(context0)) {
                Boolean boolean0 = DynamiteModule.zzb;
                __monitor_exit(class0);
                goto label_35;
            }
            zzm2 = zzm0;
            throw new LoadingException("Remote loading disabled", null);
        }
        catch(Throwable throwable2) {
            zzm2 = zzm0;
            goto label_113;
        }
    label_35:
        if(boolean0 != null) {
            try {
                if(boolean0.booleanValue()) {
                    Log.i("DynamiteModule", "Selected remote version of " + s + ", version >= " + v2);
                    class1 = DynamiteModule.class;
                    __monitor_enter(class1);
                    goto label_40;
                }
                else {
                    goto label_84;
                }
                dynamiteModule0 = dynamiteModule1;
                goto label_131;
            }
            catch(RemoteException remoteException0) {
                zzm2 = zzm0;
                throw new LoadingException("Failed to load remote module.", remoteException0, null);
            }
            catch(LoadingException dynamiteModule$LoadingException0) {
                zzm2 = zzm0;
                throw dynamiteModule$LoadingException0;
            }
            catch(Throwable throwable1) {
                zzm2 = zzm0;
                goto label_122;
            }
            try {
            label_40:
                zzq0 = DynamiteModule.zzl;
                __monitor_exit(class1);
            }
            catch(Throwable throwable3) {
                zzm2 = zzm0;
                while(true) {
                    try {
                        __monitor_exit(class1);
                        throw throwable3;
                    }
                    catch(Throwable throwable3) {
                        try {
                        }
                        catch(RemoteException remoteException0) {
                            throw new LoadingException("Failed to load remote module.", remoteException0, null);
                        }
                        catch(LoadingException dynamiteModule$LoadingException0) {
                            throw dynamiteModule$LoadingException0;
                        }
                        catch(Throwable throwable1) {
                            goto label_122;
                        }
                    }
                }
            }
            if(zzq0 != null) {
                try {
                    zzm zzm3 = (zzm)threadLocal0.get();
                    if(zzm3 != null && zzm3.zza != null) {
                        context2 = context0.getApplicationContext();
                        cursor0 = zzm3.zza;
                        ObjectWrapper.wrap(null);
                        __monitor_enter(DynamiteModule.class);
                        goto label_67;
                    }
                    zzm2 = zzm0;
                    throw new LoadingException("No result cursor", null);
                }
                catch(RemoteException remoteException0) {
                }
                catch(LoadingException dynamiteModule$LoadingException0) {
                    zzm2 = zzm0;
                    throw dynamiteModule$LoadingException0;
                }
                catch(Throwable throwable1) {
                    zzm2 = zzm0;
                    goto label_122;
                }
                try {
                    try {
                        zzm2 = zzm0;
                        throw new LoadingException("Failed to load remote module.", remoteException0, null);
                    label_67:
                        zzm2 = zzm0;
                        __monitor_exit(DynamiteModule.class);
                        if(DynamiteModule.zze >= 2) {
                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                            iObjectWrapper0 = zzq0.zzf(ObjectWrapper.wrap(context2), s, v2, ObjectWrapper.wrap(cursor0));
                        }
                        else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                            iObjectWrapper0 = zzq0.zze(ObjectWrapper.wrap(context2), s, v2, ObjectWrapper.wrap(cursor0));
                        }
                        Context context3 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
                        if(context3 == null) {
                            throw new LoadingException("Failed to get module context", null);
                        }
                        dynamiteModule1 = new DynamiteModule(context3);
                        dynamiteModule0 = dynamiteModule1;
                        goto label_131;
                    label_84:
                        zzm2 = zzm0;
                        Log.i("DynamiteModule", "Selected remote version of " + s + ", version >= " + v2);
                        zzp zzp0 = DynamiteModule.zzg(context0);
                        if(zzp0 == null) {
                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                        }
                        int v3 = zzp0.zze();
                        if(v3 >= 3) {
                            zzm zzm4 = (zzm)threadLocal0.get();
                            if(zzm4 == null) {
                                throw new LoadingException("No cached result cursor holder", null);
                            }
                            iObjectWrapper1 = zzp0.zzi(ObjectWrapper.wrap(context0), s, v2, ObjectWrapper.wrap(zzm4.zza));
                        }
                        else if(v3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            iObjectWrapper1 = zzp0.zzj(ObjectWrapper.wrap(context0), s, v2);
                        }
                        else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            iObjectWrapper1 = zzp0.zzh(ObjectWrapper.wrap(context0), s, v2);
                        }
                        Object object0 = ObjectWrapper.unwrap(iObjectWrapper1);
                        if(object0 == null) {
                            throw new LoadingException("Failed to load remote module.", null);
                        }
                        dynamiteModule1 = new DynamiteModule(((Context)object0));
                        dynamiteModule0 = dynamiteModule1;
                        goto label_131;
                    }
                    catch(RemoteException remoteException0) {
                        throw new LoadingException("Failed to load remote module.", remoteException0, null);
                    }
                    catch(LoadingException dynamiteModule$LoadingException0) {
                        throw dynamiteModule$LoadingException0;
                    }
                }
                catch(Throwable throwable1) {
                    goto label_122;
                }
            }
            zzm2 = zzm0;
            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
        }
        zzm2 = zzm0;
        throw new LoadingException("Failed to determine which loading route to use.", null);
        try {
            zzm2 = zzm0;
            throw new LoadingException("Remote loading disabled", null);
        label_113:
            __monitor_exit(class0);
        }
        catch(Throwable throwable2) {
            goto label_113;
        }
        try {
            throw throwable2;
        }
        catch(RemoteException remoteException0) {
        }
        catch(LoadingException dynamiteModule$LoadingException0) {
            throw dynamiteModule$LoadingException0;
        }
        catch(Throwable throwable1) {
            goto label_122;
        }
        try {
            try {
                throw new LoadingException("Failed to load remote module.", remoteException0, null);
            label_122:
                CrashUtils.addDynamiteErrorToDropBox(context0, throwable1);
                throw new LoadingException("Failed to load remote module.", throwable1, null);
            }
            catch(LoadingException dynamiteModule$LoadingException1) {
            }
            Log.w("DynamiteModule", "Failed to load remote module: " + dynamiteModule$LoadingException1.getMessage());
            if(dynamiteModule$VersionPolicy$SelectionResult0.localVersion != 0 && dynamiteModule$VersionPolicy0.selectModule(context0, s, new zzn(dynamiteModule$VersionPolicy$SelectionResult0.localVersion, 0)).selection == -1) {
                dynamiteModule0 = DynamiteModule.zzc(context1, s);
                goto label_131;
            }
            zzm0 = zzm2;
            throw new LoadingException("Remote load failed. No local fallback found.", dynamiteModule$LoadingException1, null);
        }
        catch(Throwable throwable0) {
            zzm0 = zzm2;
            goto label_143;
        }
    label_131:
        if(v == 0L) {
            DynamiteModule.zzh.remove();
        }
        else {
            DynamiteModule.zzh.set(long0);
        }
        Cursor cursor1 = zzm1.zza;
        if(cursor1 != null) {
            cursor1.close();
        }
        DynamiteModule.zzg.set(zzm2);
        return dynamiteModule0;
        try {
            zzm0 = zzm2;
            throw new LoadingException("Remote load failed. No local fallback found.", dynamiteModule$LoadingException1, null);
        }
        catch(Throwable throwable0) {
        }
    label_143:
        if(v == 0L) {
            DynamiteModule.zzh.remove();
        }
        else {
            DynamiteModule.zzh.set(long0);
        }
        Cursor cursor2 = zzm1.zza;
        if(cursor2 != null) {
            cursor2.close();
        }
        DynamiteModule.zzg.set(zzm0);
        throw throwable0;
    }

    public static int zza(@NonNull Context context0, @NonNull String s, boolean z) {
        int v4;
        RemoteException remoteException1;
        Cursor cursor2;
        zzp zzp0;
        int v2;
        Cursor cursor0;
        try {
            synchronized(DynamiteModule.class) {
                cursor0 = null;
                Boolean boolean0 = DynamiteModule.zzb;
                if(boolean0 == null) {
                    try {
                        Field field0 = context0.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader").getDeclaredField("sClassLoader");
                        Class class1 = field0.getDeclaringClass();
                        synchronized(class1) {
                            ClassLoader classLoader0 = (ClassLoader)field0.get(null);
                            if(classLoader0 == ClassLoader.getSystemClassLoader()) {
                                boolean0 = Boolean.FALSE;
                            }
                            else if(classLoader0 == null) {
                                if(!DynamiteModule.zzf(context0)) {
                                    return 0;
                                }
                                if(DynamiteModule.zzd || Boolean.TRUE.equals(null)) {
                                    field0.set(null, ClassLoader.getSystemClassLoader());
                                    boolean0 = Boolean.FALSE;
                                    goto label_52;
                                }
                                try {
                                    v2 = DynamiteModule.zzb(context0, s, z, true);
                                    if(DynamiteModule.zzc != null && !DynamiteModule.zzc.isEmpty()) {
                                        ClassLoader classLoader1 = zzb.zza();
                                        if(classLoader1 == null) {
                                            if(Build.VERSION.SDK_INT >= 29) {
                                                String s1 = DynamiteModule.zzc;
                                                Preconditions.checkNotNull(s1);
                                                classLoader1 = a.a(s1, ClassLoader.getSystemClassLoader());
                                            }
                                            else {
                                                String s2 = DynamiteModule.zzc;
                                                Preconditions.checkNotNull(s2);
                                                classLoader1 = new zzc(s2, ClassLoader.getSystemClassLoader());
                                            }
                                        }
                                        DynamiteModule.zzd(classLoader1);
                                        field0.set(null, classLoader1);
                                        DynamiteModule.zzb = Boolean.TRUE;
                                        return v2;
                                    }
                                    return v2;
                                }
                                catch(LoadingException unused_ex) {
                                    field0.set(null, ClassLoader.getSystemClassLoader());
                                    boolean0 = Boolean.FALSE;
                                    goto label_52;
                                }
                                return v2;
                            }
                            else {
                                try {
                                    DynamiteModule.zzd(classLoader0);
                                }
                                catch(LoadingException unused_ex) {
                                }
                                boolean0 = Boolean.TRUE;
                            }
                        }
                    }
                    catch(ClassNotFoundException | IllegalAccessException | NoSuchFieldException classNotFoundException0) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + classNotFoundException0.toString());
                        boolean0 = Boolean.FALSE;
                    }
                label_52:
                    DynamiteModule.zzb = boolean0;
                }
            }
            if(!boolean0.booleanValue()) {
                zzp0 = DynamiteModule.zzg(context0);
                if(zzp0 != null) {
                    goto label_64;
                }
                return 0;
            }
            return DynamiteModule.zzb(context0, s, z, false);
        }
        catch(Throwable throwable0) {
            CrashUtils.addDynamiteErrorToDropBox(context0, throwable0);
            throw throwable0;
        }
        try {
        label_64:
            int v3 = zzp0.zze();
            if(v3 < 3) {
                if(v3 == 2) {
                    Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                    return zzp0.zzg(ObjectWrapper.wrap(context0), s, z);
                }
                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                return zzp0.zzf(ObjectWrapper.wrap(context0), s, z);
            }
            zzm zzm0 = (zzm)DynamiteModule.zzg.get();
            if(zzm0 != null) {
                Cursor cursor1 = zzm0.zza;
                if(cursor1 != null) {
                    return cursor1.getInt(0);
                }
            }
            cursor2 = (Cursor)ObjectWrapper.unwrap(zzp0.zzk(ObjectWrapper.wrap(context0), s, z, ((long)(((Long)DynamiteModule.zzh.get())))));
            if(cursor2 != null) {
                goto label_82;
            }
            goto label_89;
        }
        catch(RemoteException remoteException0) {
            remoteException1 = remoteException0;
            goto label_93;
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            goto label_103;
        }
        try {
        label_82:
            if(cursor2.moveToFirst()) {
                v4 = cursor2.getInt(0);
                if(v4 <= 0 || !DynamiteModule.zze(cursor2)) {
                    goto label_85;
                }
                goto label_86;
            }
            goto label_89;
        }
        catch(RemoteException remoteException1) {
            goto label_92;
        }
        catch(Throwable throwable2) {
            goto label_102;
        }
    label_85:
        cursor0 = cursor2;
    label_86:
        if(cursor0 != null) {
            try {
                cursor0.close();
            }
            catch(Throwable throwable0) {
                CrashUtils.addDynamiteErrorToDropBox(context0, throwable0);
                throw throwable0;
            }
        }
        return v4;
        try {
        label_89:
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            goto label_106;
        }
        catch(RemoteException remoteException1) {
        }
        catch(Throwable throwable2) {
            goto label_102;
        }
    label_92:
        cursor0 = cursor2;
        try {
        label_93:
            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException1.getMessage());
            if(cursor0 != null) {
                goto label_99;
            }
            return 0;
        }
        catch(Throwable throwable1) {
            try {
                throwable2 = throwable1;
                goto label_103;
            label_99:
                cursor0.close();
                return 0;
            label_102:
                cursor0 = cursor2;
            label_103:
                if(cursor0 != null) {
                    cursor0.close();
                }
                throw throwable2;
            label_106:
                if(cursor2 != null) {
                    cursor2.close();
                    return 0;
                }
                return 0;
            }
            catch(Throwable throwable0) {
            }
        }
        CrashUtils.addDynamiteErrorToDropBox(context0, throwable0);
        throw throwable0;
    }

    private static int zzb(Context context0, String s, boolean z, boolean z1) throws LoadingException {
        int v6;
        Cursor cursor1;
        boolean z3;
        boolean z2;
        try {
            long v = (long)(((Long)DynamiteModule.zzh.get()));
            String s1 = "api_force_staging";
            z2 = true;
            if(!z) {
                s1 = "api";
            }
            z3 = false;
            Uri uri0 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(s1).appendPath(s).appendQueryParameter("requestStartUptime", String.valueOf(v)).build();
            ContentProviderClient contentProviderClient0 = context0.getContentResolver().acquireUnstableContentProviderClient(uri0);
            if(contentProviderClient0 != null) {
                try(Cursor cursor0 = contentProviderClient0.query(uri0, null, null, null, null)) {
                    if(cursor0 != null) {
                        int v2 = cursor0.getCount();
                        int v3 = cursor0.getColumnCount();
                        cursor1 = new MatrixCursor(cursor0.getColumnNames(), v2);
                        int v4 = 0;
                    alab1:
                        while(true) {
                            if(v4 >= v2) {
                                goto label_54;
                            }
                            if(!cursor0.moveToPosition(v4)) {
                                break;
                            }
                            Object[] arr_object = new Object[v3];
                            for(int v5 = 0; true; ++v5) {
                                if(v5 >= v3) {
                                    break;
                                }
                                switch(cursor0.getType(v5)) {
                                    case 0: {
                                        arr_object[v5] = null;
                                        break;
                                    }
                                    case 1: {
                                        arr_object[v5] = cursor0.getLong(v5);
                                        break;
                                    }
                                    case 2: {
                                        arr_object[v5] = cursor0.getDouble(v5);
                                        break;
                                    }
                                    case 3: {
                                        arr_object[v5] = cursor0.getString(v5);
                                        break;
                                    }
                                    case 4: {
                                        arr_object[v5] = cursor0.getBlob(v5);
                                        break;
                                    }
                                    default: {
                                        break alab1;
                                    }
                                }
                            }
                            ((MatrixCursor)cursor1).addRow(arr_object);
                            ++v4;
                        }
                        goto label_56;
                    label_54:
                        goto label_67;
                    }
                }
                catch(RemoteException unused_ex) {
                }
                finally {
                    contentProviderClient0.release();
                }
            }
        }
        catch(Exception exception0) {
            cursor1 = null;
            goto label_93;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
        }
    label_56:
        cursor1 = null;
        try {
            try {
            label_67:
                if(cursor1 == null || !cursor1.moveToFirst()) {
                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                    throw new LoadingException("Failed to connect to dynamite module ContentResolver.", null);
                }
                v6 = cursor1.getInt(0);
                if(v6 > 0) {
                    Class class0 = DynamiteModule.class;
                    synchronized(class0) {
                        DynamiteModule.zzc = cursor1.getString(2);
                        int v8 = cursor1.getColumnIndex("loaderVersion");
                        if(v8 >= 0) {
                            DynamiteModule.zze = cursor1.getInt(v8);
                        }
                        int v9 = cursor1.getColumnIndex("disableStandaloneDynamiteLoader2");
                        if(v9 >= 0) {
                            if(cursor1.getInt(v9) == 0) {
                                z2 = false;
                            }
                            DynamiteModule.zzd = z2;
                            z3 = z2;
                        }
                    }
                    if(DynamiteModule.zze(cursor1)) {
                        cursor1 = null;
                    }
                }
                if(z1 && z3) {
                    throw new LoadingException("forcing fallback to container DynamiteLoader impl", null);
                }
                goto label_99;
            }
            catch(Exception exception0) {
            }
        label_93:
            if(exception0 instanceof LoadingException) {
                throw exception0;
            }
            throw new LoadingException("V2 version check failed: " + exception0.getMessage(), exception0, null);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor1, throwable0);
            throw throwable0;
        }
    label_99:
        if(cursor1 != null) {
            cursor1.close();
        }
        return v6;
    }

    private static DynamiteModule zzc(Context context0, String s) {
        Log.i("DynamiteModule", "Selected local version of " + s);
        return new DynamiteModule(context0);
    }

    private static void zzd(ClassLoader classLoader0) throws LoadingException {
        zzq zzq0;
        try {
            IBinder iBinder0 = (IBinder)classLoader0.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if(iBinder0 == null) {
                zzq0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzq0 = iInterface0 instanceof zzq ? ((zzq)iInterface0) : new zzq(iBinder0);
            }
            DynamiteModule.zzl = zzq0;
            return;
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException classNotFoundException0) {
        }
        throw new LoadingException("Failed to instantiate dynamite loader", classNotFoundException0, null);
    }

    private static boolean zze(Cursor cursor0) {
        zzm zzm0 = (zzm)DynamiteModule.zzg.get();
        if(zzm0 != null && zzm0.zza == null) {
            zzm0.zza = cursor0;
            return true;
        }
        return false;
    }

    private static boolean zzf(Context context0) {
        boolean z = false;
        if(Boolean.TRUE.equals(null)) {
            return true;
        }
        if(Boolean.TRUE.equals(DynamiteModule.zzf)) {
            return true;
        }
        if(DynamiteModule.zzf == null) {
            ProviderInfo providerInfo0 = context0.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0x10000000);
            if(GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context0, 10000000) == 0 && providerInfo0 != null && "com.google.android.gms".equals(providerInfo0.packageName)) {
                z = true;
            }
            DynamiteModule.zzf = Boolean.valueOf(z);
            if(z && (providerInfo0.applicationInfo != null && (providerInfo0.applicationInfo.flags & 0x81) == 0)) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                DynamiteModule.zzd = true;
            }
        }
        if(!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static zzp zzg(Context context0) {
        zzp zzp1;
        synchronized(DynamiteModule.class) {
            zzp zzp0 = DynamiteModule.zzk;
            if(zzp0 != null) {
                return zzp0;
            }
            try {
                IBinder iBinder0 = (IBinder)context0.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if(iBinder0 == null) {
                    zzp1 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzp1 = iInterface0 instanceof zzp ? ((zzp)iInterface0) : new zzp(iBinder0);
                }
                if(zzp1 != null) {
                    DynamiteModule.zzk = zzp1;
                    return zzp1;
                }
            }
            catch(Exception exception0) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + exception0.getMessage());
            }
            return null;
        }
    }
}

