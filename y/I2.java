package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;
import com.dcinside.app.view.StateAnnounceView;

public final class i2 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final CoordinatorLayout b;
    @NonNull
    public final StateAnnounceView c;
    @NonNull
    public final DcToolbar d;

    private i2(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull CoordinatorLayout coordinatorLayout1, @NonNull StateAnnounceView stateAnnounceView0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = coordinatorLayout1;
        this.c = stateAnnounceView0;
        this.d = dcToolbar0;
    }

    @NonNull
    public static i2 a(@NonNull View view0) {
        int v = 0x7F0B0768;  // id:main_state_announce
        StateAnnounceView stateAnnounceView0 = (StateAnnounceView)ViewBindings.a(view0, 0x7F0B0768);  // id:main_state_announce
        if(stateAnnounceView0 != null) {
            v = 0x7F0B0769;  // id:main_toolbar
            DcToolbar dcToolbar0 = (DcToolbar)ViewBindings.a(view0, 0x7F0B0769);  // id:main_toolbar
            if(dcToolbar0 != null) {
                return new i2(((CoordinatorLayout)view0), ((CoordinatorLayout)view0), stateAnnounceView0, dcToolbar0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static i2 c(@NonNull LayoutInflater layoutInflater0) {
        return i2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static i2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0109, viewGroup0, false);  // layout:fragment_main_basic
        if(z) {
            viewGroup0.addView(view0);
        }
        return i2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

