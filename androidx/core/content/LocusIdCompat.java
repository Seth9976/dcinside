package androidx.core.content;

import android.content.LocusId;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

public final class LocusIdCompat {
    @RequiresApi(29)
    static class Api29Impl {
        static LocusId a(String s) {
            return new LocusId(s);
        }

        static String b(LocusId locusId0) {
            return locusId0.getId();
        }
    }

    private final String a;
    private final LocusId b;

    public LocusIdCompat(String s) {
        this.a = (String)Preconditions.q(s, "id cannot be empty");
        if(Build.VERSION.SDK_INT >= 29) {
            this.b = Api29Impl.a(s);
            return;
        }
        this.b = null;
    }

    public String a() {
        return this.a;
    }

    private String b() {
        return this.a.length() + "_chars";
    }

    @RequiresApi(29)
    public LocusId c() {
        return this.b;
    }

    @RequiresApi(29)
    public static LocusIdCompat d(LocusId locusId0) {
        Preconditions.m(locusId0, "locusId cannot be null");
        return new LocusIdCompat(((String)Preconditions.q(Api29Impl.b(locusId0), "id cannot be empty")));
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        if(LocusIdCompat.class != class0) {
            return false;
        }
        return this.a == null ? ((LocusIdCompat)object0).a == null : this.a.equals(((LocusIdCompat)object0).a);
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0x1F : this.a.hashCode() + 0x1F;
    }

    @Override
    public String toString() {
        return "LocusIdCompat[" + this.b() + "]";
    }
}

