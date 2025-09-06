package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class ParcelUtils {
    private static final String a = "a";

    @RestrictTo({Scope.c})
    public static VersionedParcelable a(InputStream inputStream0) {
        return new VersionedParcelStream(inputStream0, null).g0();
    }

    @RestrictTo({Scope.c})
    public static VersionedParcelable b(Parcelable parcelable0) {
        if(!(parcelable0 instanceof ParcelImpl)) {
            throw new IllegalArgumentException("Invalid parcel");
        }
        return ((ParcelImpl)parcelable0).a();
    }

    @Nullable
    public static VersionedParcelable c(@NonNull Bundle bundle0, @NonNull String s) {
        try {
            Bundle bundle1 = (Bundle)bundle0.getParcelable(s);
            if(bundle1 == null) {
                return null;
            }
            bundle1.setClassLoader(ParcelUtils.class.getClassLoader());
            return ParcelUtils.b(bundle1.getParcelable("a"));
        }
        catch(RuntimeException unused_ex) {
            return null;
        }
    }

    @Nullable
    public static List d(Bundle bundle0, String s) {
        List list0 = new ArrayList();
        try {
            Bundle bundle1 = (Bundle)bundle0.getParcelable(s);
            bundle1.setClassLoader(ParcelUtils.class.getClassLoader());
            for(Object object0: bundle1.getParcelableArrayList("a")) {
                list0.add(ParcelUtils.b(((Parcelable)object0)));
            }
            return list0;
        }
        catch(RuntimeException unused_ex) {
            return null;
        }
    }

    public static void e(@NonNull Bundle bundle0, @NonNull String s, @Nullable VersionedParcelable versionedParcelable0) {
        if(versionedParcelable0 == null) {
            return;
        }
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("a", ParcelUtils.h(versionedParcelable0));
        bundle0.putParcelable(s, bundle1);
    }

    public static void f(@NonNull Bundle bundle0, @NonNull String s, @NonNull List list0) {
        Bundle bundle1 = new Bundle();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(ParcelUtils.h(((VersionedParcelable)object0)));
        }
        bundle1.putParcelableArrayList("a", arrayList0);
        bundle0.putParcelable(s, bundle1);
    }

    @RestrictTo({Scope.c})
    public static void g(VersionedParcelable versionedParcelable0, OutputStream outputStream0) {
        VersionedParcelStream versionedParcelStream0 = new VersionedParcelStream(null, outputStream0);
        versionedParcelStream0.l1(versionedParcelable0);
        versionedParcelStream0.a();
    }

    @RestrictTo({Scope.c})
    public static Parcelable h(VersionedParcelable versionedParcelable0) {
        return new ParcelImpl(versionedParcelable0);
    }
}

