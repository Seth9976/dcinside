package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class w3 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final Barrier g;

    private w3(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull ImageView imageView0, @NonNull TextView textView1, @NonNull ImageView imageView1, @NonNull TextView textView2, @NonNull Barrier barrier0) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = imageView0;
        this.d = textView1;
        this.e = imageView1;
        this.f = textView2;
        this.g = barrier0;
    }

    @NonNull
    public static w3 a(@NonNull View view0) {
        int v = 0x7F0B01AA;  // id:best_pick_comment
        View view1 = ViewBindings.a(view0, 0x7F0B01AA);  // id:best_pick_comment
        if(((TextView)view1) != null) {
            v = 0x7F0B01AB;  // id:best_pick_fix_post
            View view2 = ViewBindings.a(view0, 0x7F0B01AB);  // id:best_pick_fix_post
            if(((ImageView)view2) != null) {
                v = 0x7F0B01AC;  // id:best_pick_gallery_name_date
                View view3 = ViewBindings.a(view0, 0x7F0B01AC);  // id:best_pick_gallery_name_date
                if(((TextView)view3) != null) {
                    v = 0x7F0B01AD;  // id:best_pick_thumbnail
                    View view4 = ViewBindings.a(view0, 0x7F0B01AD);  // id:best_pick_thumbnail
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B01AE;  // id:best_pick_title
                        View view5 = ViewBindings.a(view0, 0x7F0B01AE);  // id:best_pick_title
                        if(((TextView)view5) != null) {
                            v = 0x7F0B072B;  // id:live_best_pick_gallery_barrier
                            View view6 = ViewBindings.a(view0, 0x7F0B072B);  // id:live_best_pick_gallery_barrier
                            if(((Barrier)view6) != null) {
                                return new w3(((ConstraintLayout)view0), ((TextView)view1), ((ImageView)view2), ((TextView)view3), ((ImageView)view4), ((TextView)view5), ((Barrier)view6));
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
    public static w3 c(@NonNull LayoutInflater layoutInflater0) {
        return w3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static w3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E019E, viewGroup0, false);  // layout:view_best_pick_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return w3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

