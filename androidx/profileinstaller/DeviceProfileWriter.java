package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

@RestrictTo({Scope.a})
public class DeviceProfileWriter {
    @NonNull
    private final AssetManager a;
    @NonNull
    private final Executor b;
    @NonNull
    private final DiagnosticsCallback c;
    @Nullable
    private final byte[] d;
    @NonNull
    private final File e;
    @NonNull
    private final String f;
    @NonNull
    private final String g;
    @NonNull
    private final String h;
    private boolean i;
    @Nullable
    private DexProfileData[] j;
    @Nullable
    private byte[] k;

    @RestrictTo({Scope.a})
    public DeviceProfileWriter(@NonNull AssetManager assetManager0, @NonNull Executor executor0, @NonNull DiagnosticsCallback profileInstaller$DiagnosticsCallback0, @NonNull String s, @NonNull String s1, @NonNull String s2, @NonNull File file0) {
        this.i = false;
        this.a = assetManager0;
        this.b = executor0;
        this.c = profileInstaller$DiagnosticsCallback0;
        this.f = s;
        this.g = s1;
        this.h = s2;
        this.e = file0;
        this.d = new byte[]{0x30, 49, 53, 0};
    }

    @Nullable
    private DeviceProfileWriter b(DexProfileData[] arr_dexProfileData, byte[] arr_b) {
        try(InputStream inputStream0 = this.h(this.a, this.h)) {
            if(inputStream0 != null) {
                this.j = ProfileTranscoder.r(inputStream0, ProfileTranscoder.p(inputStream0, ProfileTranscoder.i), arr_b, arr_dexProfileData);
                return this;
            }
        }
        catch(FileNotFoundException fileNotFoundException0) {
            this.c.a(9, fileNotFoundException0);
        }
        catch(IOException iOException0) {
            this.c.a(7, iOException0);
        }
        catch(IllegalStateException illegalStateException0) {
            this.j = null;
            this.c.a(8, illegalStateException0);
        }
        return null;
    }

    private void c() {
        if(!this.i) {
            throw new IllegalStateException("This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @Nullable
    private static byte[] d() [...] // 潜在的解密器

    @RestrictTo({Scope.a})
    public boolean e() {
        if(this.d == null) {
            this.l(3, Build.VERSION.SDK_INT);
            return false;
        }
        if(!this.e.exists()) {
            try {
                if(!this.e.createNewFile()) {
                    this.l(4, null);
                    return false;
                }
                this.i = true;
                return true;
            }
            catch(IOException unused_ex) {
            }
        }
        else if(!this.e.canWrite()) {
            this.l(4, null);
            return false;
        }
        else {
            this.i = true;
            return true;
        }
        this.l(4, null);
        return false;
    }

    @Nullable
    private InputStream f(AssetManager assetManager0) {
        try {
            return this.h(assetManager0, this.g);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            this.c.a(6, fileNotFoundException0);
            return null;
        }
        catch(IOException iOException0) {
            this.c.a(7, iOException0);
            return null;
        }
    }

    // 检测为 Lambda 实现
    private void g(int v, Object object0) [...]

    @Nullable
    private InputStream h(AssetManager assetManager0, String s) throws IOException {
        try {
            return assetManager0.openFd(s).createInputStream();
        }
        catch(FileNotFoundException fileNotFoundException0) {
            String s1 = fileNotFoundException0.getMessage();
            if(s1 != null && s1.contains("compressed")) {
                this.c.b(5, null);
            }
            return null;
        }
    }

    @NonNull
    @RestrictTo({Scope.a})
    public DeviceProfileWriter i() {
        this.c();
        if(this.d == null) {
            return this;
        }
        InputStream inputStream0 = this.f(this.a);
        if(inputStream0 != null) {
            this.j = this.j(inputStream0);
        }
        DexProfileData[] arr_dexProfileData = this.j;
        if(arr_dexProfileData != null) {
            DeviceProfileWriter deviceProfileWriter0 = this.b(arr_dexProfileData, this.d);
            return deviceProfileWriter0 == null ? this : deviceProfileWriter0;
        }
        return this;
    }

    @Nullable
    private DexProfileData[] j(InputStream inputStream0) {
        DexProfileData[] arr_dexProfileData;
        try {
            try {
                arr_dexProfileData = ProfileTranscoder.x(inputStream0, ProfileTranscoder.p(inputStream0, ProfileTranscoder.h), this.f);
                goto label_19;
            }
            catch(IOException iOException0) {
            }
            catch(IllegalStateException illegalStateException0) {
                goto label_7;
            }
            this.c.a(7, iOException0);
        }
        catch(Throwable throwable0) {
            goto label_14;
        }
        try {
            inputStream0.close();
        }
        catch(IOException iOException1) {
            this.c.a(7, iOException1);
        }
        return null;
        try {
        label_7:
            this.c.a(8, illegalStateException0);
        }
        catch(Throwable throwable0) {
            goto label_14;
        }
        try {
            inputStream0.close();
        }
        catch(IOException iOException1) {
            this.c.a(7, iOException1);
        }
        return null;
        try {
        label_14:
            inputStream0.close();
        }
        catch(IOException iOException2) {
            this.c.a(7, iOException2);
        }
        throw throwable0;
        try {
        label_19:
            inputStream0.close();
        }
        catch(IOException iOException3) {
            this.c.a(7, iOException3);
        }
        return arr_dexProfileData;
    }

    private static boolean k() [...] // 潜在的解密器

    private void l(int v, @Nullable Object object0) {
        b b0 = () -> this.c.a(v, object0);
        this.b.execute(b0);
    }

    @NonNull
    @RestrictTo({Scope.a})
    public DeviceProfileWriter m() {
        DexProfileData[] arr_dexProfileData = this.j;
        byte[] arr_b = this.d;
        if(arr_dexProfileData != null && arr_b != null) {
            this.c();
            try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
                ProfileTranscoder.F(byteArrayOutputStream0, arr_b);
                if(!ProfileTranscoder.C(byteArrayOutputStream0, arr_b, arr_dexProfileData)) {
                    this.c.a(5, null);
                    this.j = null;
                    return this;
                }
                this.k = byteArrayOutputStream0.toByteArray();
            }
            catch(IOException iOException0) {
                this.c.a(7, iOException0);
            }
            catch(IllegalStateException illegalStateException0) {
                this.c.a(8, illegalStateException0);
            }
            this.j = null;
        }
        return this;
    }

    @RestrictTo({Scope.a})
    public boolean n() {
        byte[] arr_b = this.k;
        if(arr_b == null) {
            return false;
        }
        this.c();
        try {
            try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b); FileOutputStream fileOutputStream0 = new FileOutputStream(this.e); FileChannel fileChannel0 = fileOutputStream0.getChannel(); FileLock fileLock0 = fileChannel0.tryLock()) {
                Encoding.l(byteArrayInputStream0, fileOutputStream0, fileLock0);
                this.l(1, null);
                this.k = null;
                this.j = null;
                return true;
            }
            catch(FileNotFoundException fileNotFoundException0) {
                this.l(6, fileNotFoundException0);
            }
            catch(IOException iOException0) {
                this.l(7, iOException0);
            }
            this.k = null;
            this.j = null;
            return false;
        }
        catch(Throwable throwable0) {
            this.k = null;
            this.j = null;
            throw throwable0;
        }
    }
}

