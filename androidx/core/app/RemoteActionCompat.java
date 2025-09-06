package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.VersionedParcelable;

public final class RemoteActionCompat implements VersionedParcelable {
    @RequiresApi(26)
    static class Api26Impl {
        static RemoteAction a(Icon icon0, CharSequence charSequence0, CharSequence charSequence1, PendingIntent pendingIntent0) {
            return new RemoteAction(icon0, charSequence0, charSequence1, pendingIntent0);
        }

        static PendingIntent b(RemoteAction remoteAction0) {
            return remoteAction0.getActionIntent();
        }

        static CharSequence c(RemoteAction remoteAction0) {
            return remoteAction0.getContentDescription();
        }

        static Icon d(RemoteAction remoteAction0) {
            return remoteAction0.getIcon();
        }

        static CharSequence e(RemoteAction remoteAction0) {
            return remoteAction0.getTitle();
        }

        static boolean f(RemoteAction remoteAction0) {
            return remoteAction0.isEnabled();
        }

        static void g(RemoteAction remoteAction0, boolean z) {
            remoteAction0.setEnabled(z);
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static void a(RemoteAction remoteAction0, boolean z) {
            remoteAction0.setShouldShowIcon(z);
        }

        static boolean b(RemoteAction remoteAction0) {
            return remoteAction0.shouldShowIcon();
        }
    }

    @RestrictTo({Scope.b})
    public IconCompat a;
    @RestrictTo({Scope.b})
    public CharSequence b;
    @RestrictTo({Scope.b})
    public CharSequence c;
    @RestrictTo({Scope.b})
    public PendingIntent d;
    @RestrictTo({Scope.b})
    public boolean e;
    @RestrictTo({Scope.b})
    public boolean f;

    @RestrictTo({Scope.b})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(RemoteActionCompat remoteActionCompat0) {
        Preconditions.l(remoteActionCompat0);
        this.a = remoteActionCompat0.a;
        this.b = remoteActionCompat0.b;
        this.c = remoteActionCompat0.c;
        this.d = remoteActionCompat0.d;
        this.e = remoteActionCompat0.e;
        this.f = remoteActionCompat0.f;
    }

    public RemoteActionCompat(IconCompat iconCompat0, CharSequence charSequence0, CharSequence charSequence1, PendingIntent pendingIntent0) {
        this.a = (IconCompat)Preconditions.l(iconCompat0);
        this.b = (CharSequence)Preconditions.l(charSequence0);
        this.c = (CharSequence)Preconditions.l(charSequence1);
        this.d = (PendingIntent)Preconditions.l(pendingIntent0);
        this.e = true;
        this.f = true;
    }

    @RequiresApi(26)
    public static RemoteActionCompat a(RemoteAction remoteAction0) {
        Preconditions.l(remoteAction0);
        RemoteActionCompat remoteActionCompat0 = new RemoteActionCompat(IconCompat.h(Api26Impl.d(remoteAction0)), Api26Impl.e(remoteAction0), Api26Impl.c(remoteAction0), Api26Impl.b(remoteAction0));
        remoteActionCompat0.h(Api26Impl.f(remoteAction0));
        if(Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat0.i(Api28Impl.b(remoteAction0));
        }
        return remoteActionCompat0;
    }

    public PendingIntent b() {
        return this.d;
    }

    public CharSequence c() {
        return this.c;
    }

    public IconCompat e() {
        return this.a;
    }

    public CharSequence f() {
        return this.b;
    }

    public boolean g() {
        return this.e;
    }

    public void h(boolean z) {
        this.e = z;
    }

    public void i(boolean z) {
        this.f = z;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean j() {
        return this.f;
    }

    @RequiresApi(26)
    public RemoteAction k() {
        RemoteAction remoteAction0 = Api26Impl.a(this.a.H(), this.b, this.c, this.d);
        Api26Impl.g(remoteAction0, this.g());
        if(Build.VERSION.SDK_INT >= 28) {
            Api28Impl.a(remoteAction0, this.j());
        }
        return remoteAction0;
    }
}

