package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.dash.offline.a;

public class ProfileInstallReceiver extends BroadcastReceiver {
    class ResultDiagnostics implements DiagnosticsCallback {
        final ProfileInstallReceiver a;

        @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
        public void a(int v, @Nullable Object object0) {
            ProfileInstaller.h.a(v, object0);
            ProfileInstallReceiver.this.setResultCode(v);
        }

        @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
        public void b(int v, @Nullable Object object0) {
            ProfileInstaller.h.b(v, object0);
        }
    }

    @NonNull
    public static final String a = "androidx.profileinstaller.action.INSTALL_PROFILE";
    @NonNull
    public static final String b = "androidx.profileinstaller.action.SAVE_PROFILE";
    @NonNull
    public static final String c = "androidx.profileinstaller.action.SKIP_FILE";
    @NonNull
    public static final String d = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
    @NonNull
    private static final String e = "EXTRA_SKIP_FILE_OPERATION";
    @NonNull
    private static final String f = "WRITE_SKIP_FILE";
    @NonNull
    private static final String g = "DELETE_SKIP_FILE";
    @NonNull
    private static final String h = "EXTRA_BENCHMARK_OPERATION";
    @NonNull
    private static final String i = "DROP_SHADER_CACHE";

    static void a(@NonNull DiagnosticsCallback profileInstaller$DiagnosticsCallback0) {
        if(Build.VERSION.SDK_INT >= 24) {
            Process.sendSignal(Process.myPid(), 10);
            profileInstaller$DiagnosticsCallback0.a(12, null);
            return;
        }
        profileInstaller$DiagnosticsCallback0.a(13, null);
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context0, @Nullable Intent intent0) {
        if(intent0 == null) {
            return;
        }
        String s = intent0.getAction();
        if("androidx.profileinstaller.action.INSTALL_PROFILE".equals(s)) {
            ProfileInstaller.n(context0, new a(), new ResultDiagnostics(this), true);
            return;
        }
        if("androidx.profileinstaller.action.SKIP_FILE".equals(s)) {
            Bundle bundle0 = intent0.getExtras();
            if(bundle0 != null) {
                String s1 = bundle0.getString("EXTRA_SKIP_FILE_OPERATION");
                if("WRITE_SKIP_FILE".equals(s1)) {
                    ProfileInstaller.o(context0, new a(), new ResultDiagnostics(this));
                    return;
                }
                if("DELETE_SKIP_FILE".equals(s1)) {
                    ProfileInstaller.d(context0, new a(), new ResultDiagnostics(this));
                }
            }
        }
        else {
            if("androidx.profileinstaller.action.SAVE_PROFILE".equals(s)) {
                ProfileInstallReceiver.a(new ResultDiagnostics(this));
                return;
            }
            if("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(s)) {
                Bundle bundle1 = intent0.getExtras();
                if(bundle1 != null) {
                    String s2 = bundle1.getString("EXTRA_BENCHMARK_OPERATION");
                    ResultDiagnostics profileInstallReceiver$ResultDiagnostics0 = new ResultDiagnostics(this);
                    if("DROP_SHADER_CACHE".equals(s2)) {
                        BenchmarkOperation.b(context0, profileInstallReceiver$ResultDiagnostics0);
                        return;
                    }
                    profileInstallReceiver$ResultDiagnostics0.a(16, null);
                }
            }
        }
    }
}

