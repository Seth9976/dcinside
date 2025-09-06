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

public final class j2 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final CoordinatorLayout b;
    @NonNull
    public final D5 c;
    @NonNull
    public final StateAnnounceView d;
    @NonNull
    public final DcToolbar e;

    private j2(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull CoordinatorLayout coordinatorLayout1, @NonNull D5 d50, @NonNull StateAnnounceView stateAnnounceView0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = coordinatorLayout1;
        this.c = d50;
        this.d = stateAnnounceView0;
        this.e = dcToolbar0;
    }

    @NonNull
    public static j2 a(@NonNull View view0) {
        int v = 0x7F0B0765;  // id:main_search
        View view1 = ViewBindings.a(view0, 0x7F0B0765);  // id:main_search
        if(view1 != null) {
            D5 d50 = D5.a(view1);
            v = 0x7F0B0768;  // id:main_state_announce
            View view2 = ViewBindings.a(view0, 0x7F0B0768);  // id:main_state_announce
            if(((StateAnnounceView)view2) != null) {
                v = 0x7F0B0769;  // id:main_toolbar
                View view3 = ViewBindings.a(view0, 0x7F0B0769);  // id:main_toolbar
                if(((DcToolbar)view3) != null) {
                    return new j2(((CoordinatorLayout)view0), ((CoordinatorLayout)view0), d50, ((StateAnnounceView)view2), ((DcToolbar)view3));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static j2 c(@NonNull LayoutInflater layoutInflater0) {
        return j2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static j2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E010A, viewGroup0, false);  // layout:fragment_main_split
        if(z) {
            viewGroup0.addView(view0);
        }
        return j2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

