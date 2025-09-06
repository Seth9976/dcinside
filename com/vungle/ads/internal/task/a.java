package com.vungle.ads.internal.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.util.h;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import java.io.File;
import java.io.IOException;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class a implements c {
    public static final class com.vungle.ads.internal.task.a.a {
        private com.vungle.ads.internal.task.a.a() {
        }

        public com.vungle.ads.internal.task.a.a(w w0) {
        }

        @l
        public final e makeJobInfo(@m String s) {
            boolean z = false;
            e e0 = new e("CleanupJob").setPriority(0);
            Bundle bundle0 = new Bundle();
            if(s != null) {
                bundle0.putString("AD_ID_KEY", s);
            }
            e e1 = e0.setExtras(bundle0);
            if(s == null) {
                z = true;
            }
            return e1.setUpdateCurrent(z);
        }

        public static e makeJobInfo$default(com.vungle.ads.internal.task.a.a a$a0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = null;
            }
            return a$a0.makeJobInfo(s);
        }
    }

    @l
    private static final String AD_ID_KEY = "AD_ID_KEY";
    @l
    public static final com.vungle.ads.internal.task.a.a Companion = null;
    @l
    public static final String TAG = "CleanupJob";
    @l
    private final Context context;
    @l
    private final q pathProvider;

    static {
        a.Companion = new com.vungle.ads.internal.task.a.a(null);
    }

    public a(@l Context context0, @l q q0) {
        L.p(context0, "context");
        L.p(q0, "pathProvider");
        super();
        this.context = context0;
        this.pathProvider = q0;
    }

    private final void checkIfSdkUpgraded() {
        public static final class b extends N implements A3.a {
            final Context $context;

            public b(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.persistence.b.class);
            }
        }

        b a$b0 = new b(this.context);
        D d0 = E.c(H.a, a$b0);
        int v = a.checkIfSdkUpgraded$lambda-3(d0).getInt("VERSION_CODE", -1);
        if(v < 70403) {
            if(v < 70000) {
                this.dropV6Data();
            }
            if(v < 70100) {
                this.dropV700Data();
            }
            if(v < 70301) {
                this.dropV730TempData();
            }
            this.dropV742TpatData();
            a.checkIfSdkUpgraded$lambda-3(d0).put("VERSION_CODE", 70403).apply();
        }
    }

    private static final com.vungle.ads.internal.persistence.b checkIfSdkUpgraded$lambda-3(D d0) {
        return (com.vungle.ads.internal.persistence.b)d0.getValue();
    }

    private final void dropV6Data() {
        p.Companion.d("CleanupJob", "CleanupJob: drop old files data");
        int v = Build.VERSION.SDK_INT;
        File file0 = new File(this.context.getNoBackupFilesDir(), "vungle_db");
        if(file0.exists()) {
            h.delete(file0);
            h.delete(new File(file0.getPath() + "-journal"));
        }
        else {
            this.context.deleteDatabase("vungle_db");
        }
        SharedPreferences sharedPreferences0 = this.context.getSharedPreferences("com.vungle.sdk", 0);
        String s = sharedPreferences0.getString("cache_path", null);
        if(v >= 24) {
            this.context.deleteSharedPreferences("com.vungle.sdk");
        }
        else {
            sharedPreferences0.edit().clear().apply();
        }
        File file1 = this.context.getNoBackupFilesDir();
        L.o(file1, "{\n            context.noBackupFilesDir\n        }");
        h.delete(new File(file1, "vungle_settings"));
        if(s != null) {
            h.delete(new File(s));
        }
    }

    private final void dropV700Data() {
        h.delete(new File(this.context.getApplicationInfo().dataDir, "vungle"));
    }

    private final void dropV730TempData() {
        try {
            h.delete(new File(this.pathProvider.getSharedPrefsDir(), "vungleSettings"));
            h.delete(new File(this.pathProvider.getSharedPrefsDir(), "failedTpatSet"));
        }
        catch(Exception exception0) {
            p.Companion.e("CleanupJob", "Failed to delete temp data", exception0);
        }
    }

    private final void dropV742TpatData() {
        File file0 = this.context.getNoBackupFilesDir();
        try {
            h.delete(new File(file0, "failedTpats"));
            h.delete(new File(file0, "failedGenericTpats"));
        }
        catch(Exception exception0) {
            p.Companion.e("CleanupJob", "Failed to delete 742 tpat data", exception0);
        }
    }

    @l
    public final Context getContext() {
        return this.context;
    }

    @l
    public final q getPathProvider() {
        return this.pathProvider;
    }

    @Override  // com.vungle.ads.internal.task.c
    public int onRunJob(@l Bundle bundle0, @l g g0) {
        File file1;
        L.p(bundle0, "bundle");
        L.p(g0, "jobRunner");
        File file0 = this.pathProvider.getDownloadDir();
        String s = bundle0.getString("AD_ID_KEY");
        if(s == null) {
            file1 = file0;
        }
        else {
            file1 = this.pathProvider.getDownloadsDirForAd(s);
            if(file1 == null) {
                file1 = file0;
            }
        }
        p.Companion.d("CleanupJob", "CleanupJob: Current directory snapshot");
        try {
            if(L.g(file1, file0)) {
                this.checkIfSdkUpgraded();
                h.deleteContents(file1);
                return 0;
            }
            h.delete(file1);
            return 0;
        }
        catch(IOException unused_ex) {
            return 1;
        }
    }
}

