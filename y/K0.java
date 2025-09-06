package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;
import com.dcinside.app.view.StateAnnounceView;

public final class k0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final RecyclerView d;
    @NonNull
    public final StateAnnounceView e;
    @NonNull
    public final DcToolbar f;
    @NonNull
    public final ConstraintLayout g;
    @NonNull
    public final TextView h;

    private k0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull RecyclerView recyclerView0, @NonNull StateAnnounceView stateAnnounceView0, @NonNull DcToolbar dcToolbar0, @NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView2) {
        this.a = coordinatorLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = recyclerView0;
        this.e = stateAnnounceView0;
        this.f = dcToolbar0;
        this.g = constraintLayout0;
        this.h = textView2;
    }

    @NonNull
    public static k0 a(@NonNull View view0) {
        int v = 0x7F0B0E4B;  // id:setting_dccon_add
        View view1 = ViewBindings.a(view0, 0x7F0B0E4B);  // id:setting_dccon_add
        if(((TextView)view1) != null) {
            v = 0x7F0B0E4C;  // id:setting_dccon_list_guide
            View view2 = ViewBindings.a(view0, 0x7F0B0E4C);  // id:setting_dccon_list_guide
            if(((TextView)view2) != null) {
                v = 0x7F0B0E4D;  // id:setting_dccon_list_recycler
                View view3 = ViewBindings.a(view0, 0x7F0B0E4D);  // id:setting_dccon_list_recycler
                if(((RecyclerView)view3) != null) {
                    v = 0x7F0B0E4E;  // id:setting_dccon_list_state
                    View view4 = ViewBindings.a(view0, 0x7F0B0E4E);  // id:setting_dccon_list_state
                    if(((StateAnnounceView)view4) != null) {
                        v = 0x7F0B0E4F;  // id:setting_dccon_list_toolbar
                        View view5 = ViewBindings.a(view0, 0x7F0B0E4F);  // id:setting_dccon_list_toolbar
                        if(((DcToolbar)view5) != null) {
                            v = 0x7F0B0E50;  // id:setting_dccon_shop
                            View view6 = ViewBindings.a(view0, 0x7F0B0E50);  // id:setting_dccon_shop
                            if(((ConstraintLayout)view6) != null) {
                                v = 0x7F0B0E51;  // id:setting_dccon_shop_text
                                View view7 = ViewBindings.a(view0, 0x7F0B0E51);  // id:setting_dccon_shop_text
                                if(((TextView)view7) != null) {
                                    return new k0(((CoordinatorLayout)view0), ((TextView)view1), ((TextView)view2), ((RecyclerView)view3), ((StateAnnounceView)view4), ((DcToolbar)view5), ((ConstraintLayout)view6), ((TextView)view7));
                                }
                            }
                        }
                    }
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
    public static k0 c(@NonNull LayoutInflater layoutInflater0) {
        return k0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static k0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E005B, viewGroup0, false);  // layout:activity_setting_dccon_list
        if(z) {
            viewGroup0.addView(view0);
        }
        return k0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

