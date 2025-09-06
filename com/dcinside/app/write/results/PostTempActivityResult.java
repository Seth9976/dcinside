package com.dcinside.app.write.results;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c;
import com.dcinside.app.write.temp.PostTempActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import y4.l;

public final class PostTempActivityResult implements DefaultLifecycleObserver {
    public interface a {
        void w(long arg1, boolean arg2);
    }

    private ActivityResultLauncher a;
    @l
    private final String b;
    @l
    private WeakReference c;

    public PostTempActivityResult(@l AppCompatActivity appCompatActivity0) {
        L.p(appCompatActivity0, "activity");
        super();
        this.b = "PostTempActivityResult";
        this.c = new WeakReference(appCompatActivity0);
        appCompatActivity0.getLifecycle().a(this);
    }

    public final void b(@l Context context0, boolean z) {
        L.p(context0, "context");
        Intent intent0 = new Intent(context0, PostTempActivity.class);
        intent0.putExtra("com.dcinside.app.extra.SHOULD_ALERT", z);
        ActivityResultLauncher activityResultLauncher0 = this.a;
        if(activityResultLauncher0 == null) {
            L.S("launcher");
            activityResultLauncher0 = null;
        }
        activityResultLauncher0.b(intent0);
    }

    // 检测为 Lambda 实现
    private static final void c(PostTempActivityResult postTempActivityResult0, ActivityResult activityResult0) [...]

    private final void d(Intent intent0) {
        if(intent0 != null) {
            long v = intent0.getLongExtra("com.dcinside.app.extra.TIME", 0L);
            boolean z = intent0.getBooleanExtra("com.dcinside.app.extra.AUTO_SAVE", false);
            AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.c.get();
            if(appCompatActivity0 != null) {
                ((a)appCompatActivity0).w(v, z);
            }
        }
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void m(LifecycleOwner lifecycleOwner0) {
        c.d(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void n(LifecycleOwner lifecycleOwner0) {
        c.c(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner0) {
        c.b(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner0) {
        c.e(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner0) {
        c.f(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void r(@l LifecycleOwner lifecycleOwner0) {
        L.p(lifecycleOwner0, "owner");
        AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.c.get();
        if(appCompatActivity0 != null) {
            ActivityResultRegistry activityResultRegistry0 = appCompatActivity0.getActivityResultRegistry();
            if(activityResultRegistry0 != null) {
                StartActivityForResult activityResultContracts$StartActivityForResult0 = new StartActivityForResult();
                o0.a a0 = (ActivityResult activityResult0) -> {
                    L.p(this, "this$0");
                    L.p(activityResult0, "result");
                    this.d(activityResult0.a());
                };
                this.a = activityResultRegistry0.m(this.b, lifecycleOwner0, activityResultContracts$StartActivityForResult0, a0);
            }
        }
    }
}

