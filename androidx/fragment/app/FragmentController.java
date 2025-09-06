package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Preconditions;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FragmentController {
    private final FragmentHostCallback a;

    private FragmentController(FragmentHostCallback fragmentHostCallback0) {
        this.a = fragmentHostCallback0;
    }

    @Nullable
    public Fragment A(@NonNull String s) {
        return this.a.e.t0(s);
    }

    @NonNull
    public List B(@SuppressLint({"UnknownNullness"}) List list0) {
        return this.a.e.z0();
    }

    public int C() {
        return this.a.e.y0();
    }

    @NonNull
    public FragmentManager D() {
        return this.a.e;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public LoaderManager E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void F() {
        this.a.e.n1();
    }

    @Nullable
    public View G(@Nullable View view0, @NonNull String s, @NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        return this.a.e.K0().onCreateView(view0, s, context0, attributeSet0);
    }

    @Deprecated
    public void H() {
    }

    @Deprecated
    public void I(@Nullable Parcelable parcelable0, @Nullable FragmentManagerNonConfig fragmentManagerNonConfig0) {
        this.a.e.I1(parcelable0, fragmentManagerNonConfig0);
    }

    @Deprecated
    public void J(@Nullable Parcelable parcelable0, @Nullable List list0) {
        FragmentManagerNonConfig fragmentManagerNonConfig0 = new FragmentManagerNonConfig(list0, null, null);
        this.a.e.I1(parcelable0, fragmentManagerNonConfig0);
    }

    @Deprecated
    public void K(@SuppressLint({"UnknownNullness"}) SimpleArrayMap simpleArrayMap0) {
    }

    @Deprecated
    public void L(@Nullable Parcelable parcelable0) {
        FragmentHostCallback fragmentHostCallback0 = this.a;
        if(!(fragmentHostCallback0 instanceof ViewModelStoreOwner)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you\'re still using retainNestedNonConfig().");
        }
        fragmentHostCallback0.e.L1(parcelable0);
    }

    @Nullable
    @Deprecated
    public SimpleArrayMap M() {
        return null;
    }

    @Nullable
    @Deprecated
    public FragmentManagerNonConfig N() {
        return this.a.e.N1();
    }

    @Nullable
    @Deprecated
    public List O() {
        FragmentManagerNonConfig fragmentManagerNonConfig0 = this.a.e.N1();
        return fragmentManagerNonConfig0 != null && fragmentManagerNonConfig0.b() != null ? new ArrayList(fragmentManagerNonConfig0.b()) : null;
    }

    @Nullable
    @Deprecated
    public Parcelable P() {
        return this.a.e.P1();
    }

    public void a(@Nullable Fragment fragment0) {
        this.a.e.s(this.a, this.a, fragment0);
    }

    @NonNull
    public static FragmentController b(@NonNull FragmentHostCallback fragmentHostCallback0) {
        return new FragmentController(((FragmentHostCallback)Preconditions.m(fragmentHostCallback0, "callbacks == null")));
    }

    public void c() {
        this.a.e.F();
    }

    @Deprecated
    public void d(@NonNull Configuration configuration0) {
        this.a.e.H(configuration0, true);
    }

    public boolean e(@NonNull MenuItem menuItem0) {
        return this.a.e.I(menuItem0);
    }

    public void f() {
        this.a.e.J();
    }

    @Deprecated
    public boolean g(@NonNull Menu menu0, @NonNull MenuInflater menuInflater0) {
        return this.a.e.K(menu0, menuInflater0);
    }

    public void h() {
        this.a.e.L();
    }

    public void i() {
        this.a.e.M();
    }

    @Deprecated
    public void j() {
        this.a.e.N(true);
    }

    @Deprecated
    public void k(boolean z) {
        this.a.e.O(z, true);
    }

    @Deprecated
    public boolean l(@NonNull MenuItem menuItem0) {
        return this.a.e.R(menuItem0);
    }

    @Deprecated
    public void m(@NonNull Menu menu0) {
        this.a.e.S(menu0);
    }

    public void n() {
        this.a.e.U();
    }

    @Deprecated
    public void o(boolean z) {
        this.a.e.V(z, true);
    }

    @Deprecated
    public boolean p(@NonNull Menu menu0) {
        return this.a.e.W(menu0);
    }

    @Deprecated
    public void q() {
    }

    public void r() {
        this.a.e.Y();
    }

    public void s() {
        this.a.e.Z();
    }

    public void t() {
        this.a.e.b0();
    }

    @Deprecated
    public void u() {
    }

    @Deprecated
    public void v() {
    }

    @Deprecated
    public void w() {
    }

    @Deprecated
    public void x(boolean z) {
    }

    @Deprecated
    public void y(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
    }

    public boolean z() {
        return this.a.e.j0(true);
    }
}

