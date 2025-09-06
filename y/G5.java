package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class g5 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final ImageView f;
    @NonNull
    public final ConstraintLayout g;
    @NonNull
    public final TextView h;

    private g5(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull ImageView imageView1, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout1, @NonNull TextView textView2) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = imageView1;
        this.d = textView0;
        this.e = textView1;
        this.f = imageView2;
        this.g = constraintLayout1;
        this.h = textView2;
    }

    @NonNull
    public static g5 a(@NonNull View view0) {
        int v = 0x7F0B07CC;  // id:managed_icon
        View view1 = ViewBindings.a(view0, 0x7F0B07CC);  // id:managed_icon
        if(((ImageView)view1) != null) {
            v = 0x7F0B07CD;  // id:managed_mini_private
            View view2 = ViewBindings.a(view0, 0x7F0B07CD);  // id:managed_mini_private
            if(((ImageView)view2) != null) {
                v = 0x7F0B07CE;  // id:managed_name
                View view3 = ViewBindings.a(view0, 0x7F0B07CE);  // id:managed_name
                if(((TextView)view3) != null) {
                    v = 0x7F0B07CF;  // id:managed_rank_status_text
                    View view4 = ViewBindings.a(view0, 0x7F0B07CF);  // id:managed_rank_status_text
                    if(((TextView)view4) != null) {
                        v = 0x7F0B07D0;  // id:managed_rank_status_transfer_icon
                        View view5 = ViewBindings.a(view0, 0x7F0B07D0);  // id:managed_rank_status_transfer_icon
                        if(((ImageView)view5) != null) {
                            v = 0x7F0B07D1;  // id:managed_rank_status_wrap
                            View view6 = ViewBindings.a(view0, 0x7F0B07D1);  // id:managed_rank_status_wrap
                            if(((ConstraintLayout)view6) != null) {
                                v = 0x7F0B07D2;  // id:managed_status
                                View view7 = ViewBindings.a(view0, 0x7F0B07D2);  // id:managed_status
                                if(((TextView)view7) != null) {
                                    return new g5(((ConstraintLayout)view0), ((ImageView)view1), ((ImageView)view2), ((TextView)view3), ((TextView)view4), ((ImageView)view5), ((ConstraintLayout)view6), ((TextView)view7));
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
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static g5 c(@NonNull LayoutInflater layoutInflater0) {
        return g5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static g5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01F6, viewGroup0, false);  // layout:view_item_managed_gallery
        if(z) {
            viewGroup0.addView(view0);
        }
        return g5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

