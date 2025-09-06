package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;
import com.dcinside.app.view.StateAnnounceView;

public final class l0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final RecyclerView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final StateAnnounceView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final DcToolbar g;

    private l0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull TextView textView0, @NonNull RecyclerView recyclerView0, @NonNull TextView textView1, @NonNull StateAnnounceView stateAnnounceView0, @NonNull TextView textView2, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = textView0;
        this.c = recyclerView0;
        this.d = textView1;
        this.e = stateAnnounceView0;
        this.f = textView2;
        this.g = dcToolbar0;
    }

    @NonNull
    public static l0 a(@NonNull View view0) {
        int v = 0x7F0B0E52;  // id:setting_dccon_tag_guide
        View view1 = ViewBindings.a(view0, 0x7F0B0E52);  // id:setting_dccon_tag_guide
        if(((TextView)view1) != null) {
            v = 0x7F0B0E53;  // id:setting_dccon_tag_list
            View view2 = ViewBindings.a(view0, 0x7F0B0E53);  // id:setting_dccon_tag_list
            if(((RecyclerView)view2) != null) {
                v = 0x7F0B0E54;  // id:setting_dccon_tag_prefix
                View view3 = ViewBindings.a(view0, 0x7F0B0E54);  // id:setting_dccon_tag_prefix
                if(((TextView)view3) != null) {
                    v = 0x7F0B0E55;  // id:setting_dccon_tag_state
                    View view4 = ViewBindings.a(view0, 0x7F0B0E55);  // id:setting_dccon_tag_state
                    if(((StateAnnounceView)view4) != null) {
                        v = 0x7F0B0E56;  // id:setting_dccon_tag_suffix
                        View view5 = ViewBindings.a(view0, 0x7F0B0E56);  // id:setting_dccon_tag_suffix
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0E57;  // id:setting_dccon_tag_toolbar
                            View view6 = ViewBindings.a(view0, 0x7F0B0E57);  // id:setting_dccon_tag_toolbar
                            if(((DcToolbar)view6) != null) {
                                return new l0(((CoordinatorLayout)view0), ((TextView)view1), ((RecyclerView)view2), ((TextView)view3), ((StateAnnounceView)view4), ((TextView)view5), ((DcToolbar)view6));
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
    public static l0 c(@NonNull LayoutInflater layoutInflater0) {
        return l0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static l0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E005C, viewGroup0, false);  // layout:activity_setting_dccon_tag
        if(z) {
            viewGroup0.addView(view0);
        }
        return l0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

