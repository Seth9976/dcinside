package io.realm.internal.android;

import android.os.Looper;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import o3.h;

public class a implements io.realm.internal.a {
    private final Looper a;
    private final boolean b;
    @SuppressFBWarnings({"MS_SHOULD_BE_FINAL", "MS_CANNOT_BE_FINAL"})
    public static boolean c = false;

    static {
    }

    public a() {
        this.a = Looper.myLooper();
        this.b = false;
    }

    @Override  // io.realm.internal.a
    public boolean a() {
        return this.a != null && (a.c || this.a == Looper.getMainLooper());
    }

    // 去混淆评级： 低(20)
    @Override  // io.realm.internal.a
    public boolean b() {
        return this.d() && !this.b;
    }

    @Override  // io.realm.internal.a
    public void c(@h String s) {
        String s1 = "";
        if(!this.d()) {
            if(s != null) {
                s1 = s + " " + "Realm cannot be automatically updated on a thread without a looper.";
            }
            throw new IllegalStateException(s1);
        }
        if(this.b) {
            if(s != null) {
                s1 = s + " " + "Realm cannot be automatically updated on an IntentService thread.";
            }
            throw new IllegalStateException(s1);
        }
    }

    private boolean d() {
        return this.a != null;
    }

    private static boolean e() [...] // 潜在的解密器
}

