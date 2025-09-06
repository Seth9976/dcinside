package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import com.google.android.material.badge.d;
import com.google.android.material.internal.ParcelableSparseArray;

@RestrictTo({Scope.b})
public class NavigationBarPresenter implements MenuPresenter {
    static class SavedState implements Parcelable {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            @NonNull
            public SavedState a(@NonNull Parcel parcel0) {
                return new SavedState(parcel0);
            }

            @NonNull
            public SavedState[] b(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            @NonNull
            public Object createFromParcel(@NonNull Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            @NonNull
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        int a;
        @Nullable
        ParcelableSparseArray b;

        static {
            SavedState.CREATOR = new a();
        }

        SavedState() {
        }

        SavedState(@NonNull Parcel parcel0) {
            this.a = parcel0.readInt();
            this.b = (ParcelableSparseArray)parcel0.readParcelable(this.getClass().getClassLoader());
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            parcel0.writeInt(this.a);
            parcel0.writeParcelable(this.b, 0);
        }
    }

    private MenuBuilder a;
    private f b;
    private boolean c;
    private int d;

    public NavigationBarPresenter() {
        this.c = false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable a() {
        Parcelable parcelable0 = new SavedState();
        parcelable0.a = this.b.getSelectedItemId();
        parcelable0.b = d.h(this.b.getBadgeDrawables());
        return parcelable0;
    }

    public void b(int v) {
        this.d = v;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void c(@Nullable MenuBuilder menuBuilder0, boolean z) {
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void d(@NonNull Parcelable parcelable0) {
        if(parcelable0 instanceof SavedState) {
            this.b.r(((SavedState)parcelable0).a);
            SparseArray sparseArray0 = d.g(this.b.getContext(), ((SavedState)parcelable0).b);
            this.b.p(sparseArray0);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean e(@Nullable MenuBuilder menuBuilder0, @Nullable MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void f(boolean z) {
        if(this.c) {
            return;
        }
        if(z) {
            this.b.d();
            return;
        }
        this.b.s();
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean g() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.d;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean h(@Nullable MenuBuilder menuBuilder0, @Nullable MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void i(@NonNull Context context0, @NonNull MenuBuilder menuBuilder0) {
        this.a = menuBuilder0;
        this.b.a(menuBuilder0);
    }

    public void j(@NonNull f f0) {
        this.b = f0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void k(@Nullable Callback menuPresenter$Callback0) {
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean l(@Nullable SubMenuBuilder subMenuBuilder0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    @Nullable
    public MenuView m(@Nullable ViewGroup viewGroup0) {
        return this.b;
    }

    public void n(boolean z) {
        this.c = z;
    }
}

