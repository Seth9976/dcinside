package pl.droidsonroids.relinker;

import android.os.Build;

final class g implements b {
    @Override  // pl.droidsonroids.relinker.e$b
    public void a(String s) {
        System.loadLibrary(s);
    }

    @Override  // pl.droidsonroids.relinker.e$b
    public String b(String s) {
        return s.substring(3, s.length() - 3);
    }

    // 去混淆评级： 低(22)
    @Override  // pl.droidsonroids.relinker.e$b
    public String[] c() {
        String[] arr_s = Build.SUPPORTED_ABIS;
        if(arr_s.length > 0) {
            return arr_s;
        }
        return h.a("arm64-v8a") ? new String[]{"arm64-v8a"} : new String[]{"arm64-v8a", "arm64-v8a"};
    }

    @Override  // pl.droidsonroids.relinker.e$b
    public void d(String s) {
        System.load(s);
    }

    // 去混淆评级： 低(20)
    @Override  // pl.droidsonroids.relinker.e$b
    public String e(String s) {
        return !s.startsWith("lib") || !s.endsWith(".so") ? System.mapLibraryName(s) : s;
    }
}

