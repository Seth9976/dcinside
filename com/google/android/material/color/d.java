package com.google.android.material.color;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.app.UiModeManager.ContrastChangeListener;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import java.util.LinkedHashSet;
import java.util.Set;

public class d {
    @RequiresApi(34)
    static class a implements Application.ActivityLifecycleCallbacks {
        private final Set a;
        private final e b;
        @Nullable
        private UiModeManager.ContrastChangeListener c;

        a(e e0) {
            this.a = new LinkedHashSet();
            this.b = e0;
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity0, @Nullable Bundle bundle0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity0) {
            this.a.remove(activity0);
            UiModeManager uiModeManager0 = (UiModeManager)activity0.getSystemService("uimode");
            if(uiModeManager0 != null && this.c != null && this.a.isEmpty()) {
                uiModeManager0.removeContrastChangeListener(this.c);
                this.c = null;
            }
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NonNull Activity activity0, @Nullable Bundle bundle0) {
            class com.google.android.material.color.d.a.a implements UiModeManager.ContrastChangeListener {
                final a a;

                @Override  // android.app.UiModeManager$ContrastChangeListener
                public void onContrastChanged(float f) {
                    for(Object object0: a.this.a) {
                        ((Activity)object0).recreate();
                    }
                }
            }

            UiModeManager uiModeManager0 = (UiModeManager)activity0.getSystemService("uimode");
            if(uiModeManager0 != null && this.a.isEmpty() && this.c == null) {
                this.c = new com.google.android.material.color.d.a.a(this);
                uiModeManager0.addContrastChangeListener(ContextCompat.getMainExecutor(activity0.getApplicationContext()), this.c);
            }
            this.a.add(activity0);
            if(uiModeManager0 != null) {
                d.b(activity0, this.b);
            }
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity0, @NonNull Bundle bundle0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity0) {
        }
    }

    private static final float a = 0.333333f;
    private static final float b = 0.666667f;

    // 去混淆评级： 低(30)
    public static void a(@NonNull Application application0, @NonNull e e0) {
    }

    // 去混淆评级： 低(30)
    public static void b(@NonNull Activity activity0, @NonNull e e0) {
    }

    private static int c(Context context0, e e0) {
        UiModeManager uiModeManager0 = (UiModeManager)context0.getSystemService("uimode");
        return 0;
    }

    @ChecksSdkIntAtLeast(api = 34)
    public static boolean d() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    @NonNull
    public static Context e(@NonNull Context context0, @NonNull e e0) {
        return context0;
    }
}

