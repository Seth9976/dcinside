package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle.State;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

@SuppressLint({"BanParcelableUsage"})
public final class NavBackStackEntryState implements Parcelable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    @f
    public static final Parcelable.Creator CREATOR;
    @l
    private final String a;
    private final int b;
    @m
    private final Bundle c;
    @l
    private final Bundle d;
    @l
    public static final Companion e;

    static {
        NavBackStackEntryState.e = new Companion(null);
        NavBackStackEntryState.CREATOR = new NavBackStackEntryState.Companion.CREATOR.1();
    }

    public NavBackStackEntryState(@l Parcel parcel0) {
        L.p(parcel0, "inParcel");
        super();
        String s = parcel0.readString();
        L.m(s);
        this.a = s;
        this.b = parcel0.readInt();
        this.c = parcel0.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle bundle0 = parcel0.readBundle(NavBackStackEntryState.class.getClassLoader());
        L.m(bundle0);
        this.d = bundle0;
    }

    public NavBackStackEntryState(@l NavBackStackEntry navBackStackEntry0) {
        L.p(navBackStackEntry0, "entry");
        super();
        this.a = navBackStackEntry0.g();
        this.b = navBackStackEntry0.f().q();
        this.c = navBackStackEntry0.d();
        Bundle bundle0 = new Bundle();
        this.d = bundle0;
        navBackStackEntry0.k(bundle0);
    }

    @m
    public final Bundle a() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    @l
    public final String d() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Bundle e() {
        return this.d;
    }

    @l
    public final NavBackStackEntry f(@l Context context0, @l NavDestination navDestination0, @l State lifecycle$State0, @m NavControllerViewModel navControllerViewModel0) {
        L.p(context0, "context");
        L.p(navDestination0, "destination");
        L.p(lifecycle$State0, "hostLifecycleState");
        Bundle bundle0 = this.c;
        if(bundle0 != null) {
            bundle0.setClassLoader(context0.getClassLoader());
            return NavBackStackEntry.n.a(context0, navDestination0, bundle0, lifecycle$State0, navControllerViewModel0, this.a, this.d);
        }
        return NavBackStackEntry.n.a(context0, navDestination0, null, lifecycle$State0, navControllerViewModel0, this.a, this.d);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel0, int v) {
        L.p(parcel0, "parcel");
        parcel0.writeString(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeBundle(this.c);
        parcel0.writeBundle(this.d);
    }
}

