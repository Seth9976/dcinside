package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class g4 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final View b;
    @NonNull
    public final View c;
    @NonNull
    public final RecyclerView d;

    private g4(@NonNull ConstraintLayout constraintLayout0, @NonNull View view0, @NonNull View view1, @NonNull RecyclerView recyclerView0) {
        this.a = constraintLayout0;
        this.b = view0;
        this.c = view1;
        this.d = recyclerView0;
    }

    @NonNull
    public static g4 a(@NonNull View view0) {
        int v = 0x7F0B0365;  // id:dccon_recent_tag_div_bot
        View view1 = ViewBindings.a(view0, 0x7F0B0365);  // id:dccon_recent_tag_div_bot
        if(view1 != null) {
            v = 0x7F0B0366;  // id:dccon_recent_tag_div_top
            View view2 = ViewBindings.a(view0, 0x7F0B0366);  // id:dccon_recent_tag_div_top
            if(view2 != null) {
                v = 0x7F0B0367;  // id:dccon_recent_tag_view
                RecyclerView recyclerView0 = (RecyclerView)ViewBindings.a(view0, 0x7F0B0367);  // id:dccon_recent_tag_view
                if(recyclerView0 != null) {
                    return new g4(((ConstraintLayout)view0), view1, view2, recyclerView0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static g4 c(@NonNull LayoutInflater layoutInflater0) {
        return g4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static g4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01C2, viewGroup0, false);  // layout:view_dccon_tag_recent
        if(z) {
            viewGroup0.addView(view0);
        }
        return g4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

