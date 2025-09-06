package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({Scope.a})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel0) {
        RemoteActionCompat remoteActionCompat0 = new RemoteActionCompat();
        remoteActionCompat0.a = (IconCompat)versionedParcel0.h0(remoteActionCompat0.a, 1);
        remoteActionCompat0.b = versionedParcel0.w(remoteActionCompat0.b, 2);
        remoteActionCompat0.c = versionedParcel0.w(remoteActionCompat0.c, 3);
        remoteActionCompat0.d = (PendingIntent)versionedParcel0.W(remoteActionCompat0.d, 4);
        remoteActionCompat0.e = versionedParcel0.m(remoteActionCompat0.e, 5);
        remoteActionCompat0.f = versionedParcel0.m(remoteActionCompat0.f, 6);
        return remoteActionCompat0;
    }

    public static void write(RemoteActionCompat remoteActionCompat0, VersionedParcel versionedParcel0) {
        versionedParcel0.j0(false, false);
        versionedParcel0.m1(remoteActionCompat0.a, 1);
        versionedParcel0.z0(remoteActionCompat0.b, 2);
        versionedParcel0.z0(remoteActionCompat0.c, 3);
        versionedParcel0.X0(remoteActionCompat0.d, 4);
        versionedParcel0.n0(remoteActionCompat0.e, 5);
        versionedParcel0.n0(remoteActionCompat0.f, 6);
    }
}

