package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class FragmentHostCallback extends FragmentContainer {
    @Nullable
    private final Activity a;
    @NonNull
    private final Context b;
    @NonNull
    private final Handler c;
    private final int d;
    final FragmentManager e;

    FragmentHostCallback(@Nullable Activity activity0, @NonNull Context context0, @NonNull Handler handler0, int v) {
        this.e = new FragmentManagerImpl();
        this.a = activity0;
        this.b = (Context)Preconditions.m(context0, "context == null");
        this.c = (Handler)Preconditions.m(handler0, "handler == null");
        this.d = v;
    }

    public FragmentHostCallback(@NonNull Context context0, @NonNull Handler handler0, int v) {
        this((context0 instanceof Activity ? ((Activity)context0) : null), context0, handler0, v);
    }

    FragmentHostCallback(@NonNull FragmentActivity fragmentActivity0) {
        this(fragmentActivity0, fragmentActivity0, new Handler(), 0);
    }

    @Override  // androidx.fragment.app.FragmentContainer
    @Nullable
    public View c(int v) {
        return null;
    }

    @Override  // androidx.fragment.app.FragmentContainer
    public boolean d() {
        return true;
    }

    @Nullable
    Activity e() {
        return this.a;
    }

    @NonNull
    Context f() {
        return this.b;
    }

    @NonNull
    @RestrictTo({Scope.a})
    public Handler g() {
        return this.c;
    }

    public void h(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
    }

    @Nullable
    public abstract Object i();

    @NonNull
    public LayoutInflater j() {
        return LayoutInflater.from(this.b);
    }

    public int k() {
        return this.d;
    }

    public boolean l() {
        return true;
    }

    @Deprecated
    public void m(@NonNull Fragment fragment0, @NonNull String[] arr_s, int v) {
    }

    public boolean n(@NonNull Fragment fragment0) {
        return true;
    }

    public boolean o(@NonNull String s) {
        return false;
    }

    public void p(@NonNull Fragment fragment0, @SuppressLint({"UnknownNullness"}) Intent intent0, int v) {
        this.q(fragment0, intent0, v, null);
    }

    public void q(@NonNull Fragment fragment0, @SuppressLint({"UnknownNullness"}) Intent intent0, int v, @Nullable Bundle bundle0) {
        if(v != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ContextCompat.startActivity(this.b, intent0, bundle0);
    }

    @Deprecated
    public void r(@NonNull Fragment fragment0, @SuppressLint({"UnknownNullness"}) IntentSender intentSender0, int v, @Nullable Intent intent0, int v1, int v2, int v3, @Nullable Bundle bundle0) throws IntentSender.SendIntentException {
        if(v != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        ActivityCompat.u(this.a, intentSender0, -1, intent0, v1, v2, v3, bundle0);
    }

    public void s() {
    }
}

