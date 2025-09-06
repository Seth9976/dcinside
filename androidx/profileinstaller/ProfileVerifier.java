package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ProfileVerifier {
    @RequiresApi(33)
    static class Api33Impl {
        static PackageInfo a(PackageManager packageManager0, Context context0) throws PackageManager.NameNotFoundException {
            return packageManager0.getPackageInfo("com.dcinside.app.android", PackageManager.PackageInfoFlags.of(0L));
        }
    }

    @RestrictTo({Scope.a})
    static class Cache {
        final int a;
        final int b;
        final long c;
        final long d;
        private static final int e = 1;

        Cache(int v, int v1, long v2, long v3) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
        }

        static Cache a(@NonNull File file0) throws IOException {
            try(DataInputStream dataInputStream0 = new DataInputStream(new FileInputStream(file0))) {
                return new Cache(dataInputStream0.readInt(), dataInputStream0.readInt(), dataInputStream0.readLong(), dataInputStream0.readLong());
            }
        }

        void b(@NonNull File file0) throws IOException {
            file0.delete();
            try(DataOutputStream dataOutputStream0 = new DataOutputStream(new FileOutputStream(file0))) {
                dataOutputStream0.writeInt(this.a);
                dataOutputStream0.writeInt(this.b);
                dataOutputStream0.writeLong(this.c);
                dataOutputStream0.writeLong(this.d);
            }
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(Object object0) {
            return this == object0 ? true : object0 != null && object0 instanceof Cache && (this.b == ((Cache)object0).b && this.c == ((Cache)object0).c && this.a == ((Cache)object0).a && this.d == ((Cache)object0).d);
        }

        @Override
        public int hashCode() {
            return Objects.hash(new Object[]{this.b, this.c, this.a, this.d});
        }
    }

    public static class CompilationStatus {
        @RestrictTo({Scope.a})
        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        final int a;
        private final boolean b;
        private final boolean c;
        private final boolean d;
        private static final int e = 16;
        public static final int f = 0;
        @Deprecated
        public static final int g = 0;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 3;
        public static final int k = 0x10000;
        public static final int l = 0x20000;
        public static final int m = 0x30000;
        public static final int n = 0x40000;
        public static final int o = 0x50000;

        CompilationStatus(int v, boolean z, boolean z1, boolean z2) {
            this.a = v;
            this.c = z1;
            this.b = z;
            this.d = z2;
        }

        public boolean a() {
            return this.d;
        }

        public int b() {
            return this.a;
        }

        public boolean c() {
            return this.c;
        }

        public boolean d() {
            return this.b;
        }
    }

    private static final String a = "/data/misc/profiles/ref/";
    private static final String b = "/data/misc/profiles/cur/0/";
    private static final String c = "primary.prof";
    private static final String d = "profileInstalled";
    private static final ResolvableFuture e = null;
    private static final Object f = null;
    private static final String g = "ProfileVerifier";
    @Nullable
    private static CompilationStatus h;

    static {
        ProfileVerifier.e = ResolvableFuture.w();
        ProfileVerifier.f = new Object();
        ProfileVerifier.h = null;
    }

    @NonNull
    public static t0 a() {
        return ProfileVerifier.e;
    }

    private static long b(Context context0) throws PackageManager.NameNotFoundException {
        PackageManager packageManager0 = context0.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT < 33 ? packageManager0.getPackageInfo("com.dcinside.app.android", 0).lastUpdateTime : Api33Impl.a(packageManager0, context0).lastUpdateTime;
    }

    private static CompilationStatus c(int v, boolean z, boolean z1, boolean z2) {
        CompilationStatus profileVerifier$CompilationStatus0 = new CompilationStatus(v, z, z1, z2);
        ProfileVerifier.h = profileVerifier$CompilationStatus0;
        ProfileVerifier.e.r(profileVerifier$CompilationStatus0);
        return ProfileVerifier.h;
    }

    @NonNull
    @WorkerThread
    public static CompilationStatus d(@NonNull Context context0) {
        return ProfileVerifier.e(context0, false);
    }

    @NonNull
    @RestrictTo({Scope.a})
    @WorkerThread
    static CompilationStatus e(@NonNull Context context0, boolean z) {
        Cache profileVerifier$Cache0;
        long v4;
        boolean z1;
        int v1;
        if(!z) {
            CompilationStatus profileVerifier$CompilationStatus0 = ProfileVerifier.h;
            if(profileVerifier$CompilationStatus0 != null) {
                return profileVerifier$CompilationStatus0;
            }
        }
        synchronized(ProfileVerifier.f) {
            if(!z) {
                CompilationStatus profileVerifier$CompilationStatus1 = ProfileVerifier.h;
                if(profileVerifier$CompilationStatus1 != null) {
                    return profileVerifier$CompilationStatus1;
                }
            }
            try {
                v1 = 0;
                try(AssetFileDescriptor assetFileDescriptor0 = context0.getAssets().openFd("dexopt/baseline.prof")) {
                    z1 = assetFileDescriptor0.getLength() <= 0L ? false : true;
                }
            }
            catch(IOException unused_ex) {
                z1 = false;
            }
            if(Build.VERSION.SDK_INT >= 28 && Build.VERSION.SDK_INT != 30) {
                File file0 = new File(new File("/data/misc/profiles/ref/", "com.dcinside.app.android"), "primary.prof");
                long v2 = file0.length();
                boolean z2 = file0.exists() && v2 > 0L;
                File file1 = new File(new File("/data/misc/profiles/cur/0/", "com.dcinside.app.android"), "primary.prof");
                long v3 = file1.length();
                boolean z3 = file1.exists() && v3 > 0L;
                try {
                    v4 = ProfileVerifier.b(context0);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    return ProfileVerifier.c(0x10000, z2, z3, z1);
                }
                File file2 = new File(context0.getFilesDir(), "profileInstalled");
                if(file2.exists()) {
                    try {
                        profileVerifier$Cache0 = Cache.a(file2);
                    }
                    catch(IOException unused_ex) {
                        return ProfileVerifier.c(0x20000, z2, z3, z1);
                    }
                }
                else {
                    profileVerifier$Cache0 = null;
                }
                if(profileVerifier$Cache0 == null || profileVerifier$Cache0.c != v4) {
                label_47:
                    if(!z1) {
                        v1 = 0x50000;
                    }
                    else if(z2) {
                        v1 = 1;
                    }
                    else if(z3) {
                        v1 = 2;
                    }
                }
                else {
                    int v5 = profileVerifier$Cache0.b;
                    if(v5 != 2) {
                        v1 = v5;
                        goto label_55;
                    }
                    goto label_47;
                }
            label_55:
                if(z && z3 && v1 != 1) {
                    v1 = 2;
                }
                if(profileVerifier$Cache0 != null && profileVerifier$Cache0.b == 2 && v1 == 1 && v2 < profileVerifier$Cache0.d) {
                    v1 = 3;
                }
                Cache profileVerifier$Cache1 = new Cache(1, v1, v4, v3);
                if(profileVerifier$Cache0 == null || !profileVerifier$Cache0.equals(profileVerifier$Cache1)) {
                    try {
                        profileVerifier$Cache1.b(file2);
                    }
                    catch(IOException unused_ex) {
                        v1 = 0x30000;
                    }
                }
                return ProfileVerifier.c(v1, z2, z3, z1);
            }
        }
        return ProfileVerifier.c(0x40000, false, false, z1);
    }
}

