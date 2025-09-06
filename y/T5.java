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
import com.dcinside.app.view.TailTextView;

public final class t5 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final View c;
    @NonNull
    public final TextView d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final TailTextView f;

    private t5(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull View view0, @NonNull TextView textView0, @NonNull ImageView imageView1, @NonNull TailTextView tailTextView0) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = view0;
        this.d = textView0;
        this.e = imageView1;
        this.f = tailTextView0;
    }

    @NonNull
    public static t5 a(@NonNull View view0) {
        int v = 0x7F0B0726;  // id:live_best_fix_post
        View view1 = ViewBindings.a(view0, 0x7F0B0726);  // id:live_best_fix_post
        if(((ImageView)view1) != null) {
            v = 0x7F0B0727;  // id:live_best_gallery_divider
            View view2 = ViewBindings.a(view0, 0x7F0B0727);  // id:live_best_gallery_divider
            if(view2 != null) {
                v = 0x7F0B0728;  // id:live_best_gallery_name_date
                View view3 = ViewBindings.a(view0, 0x7F0B0728);  // id:live_best_gallery_name_date
                if(((TextView)view3) != null) {
                    v = 0x7F0B0732;  // id:live_best_thumbnail
                    View view4 = ViewBindings.a(view0, 0x7F0B0732);  // id:live_best_thumbnail
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B0733;  // id:live_best_title
                        View view5 = ViewBindings.a(view0, 0x7F0B0733);  // id:live_best_title
                        if(((TailTextView)view5) != null) {
                            return new t5(((ConstraintLayout)view0), ((ImageView)view1), view2, ((TextView)view3), ((ImageView)view4), ((TailTextView)view5));
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
    public static t5 c(@NonNull LayoutInflater layoutInflater0) {
        return t5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static t5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0203, viewGroup0, false);  // layout:view_live_best_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return t5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

