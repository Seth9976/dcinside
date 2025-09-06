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

public final class v5 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final View b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final ImageView f;
    @NonNull
    public final TailTextView g;

    private v5(@NonNull ConstraintLayout constraintLayout0, @NonNull View view0, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ImageView imageView1, @NonNull TailTextView tailTextView0) {
        this.a = constraintLayout0;
        this.b = view0;
        this.c = imageView0;
        this.d = textView0;
        this.e = textView1;
        this.f = imageView1;
        this.g = tailTextView0;
    }

    @NonNull
    public static v5 a(@NonNull View view0) {
        int v = 0x7F0B072C;  // id:live_best_ranking_divider
        View view1 = ViewBindings.a(view0, 0x7F0B072C);  // id:live_best_ranking_divider
        if(view1 != null) {
            v = 0x7F0B072D;  // id:live_best_ranking_fix_post
            View view2 = ViewBindings.a(view0, 0x7F0B072D);  // id:live_best_ranking_fix_post
            if(((ImageView)view2) != null) {
                v = 0x7F0B072E;  // id:live_best_ranking_gallery_name_date
                View view3 = ViewBindings.a(view0, 0x7F0B072E);  // id:live_best_ranking_gallery_name_date
                if(((TextView)view3) != null) {
                    v = 0x7F0B072F;  // id:live_best_ranking_rank
                    View view4 = ViewBindings.a(view0, 0x7F0B072F);  // id:live_best_ranking_rank
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0730;  // id:live_best_ranking_thumbnail
                        View view5 = ViewBindings.a(view0, 0x7F0B0730);  // id:live_best_ranking_thumbnail
                        if(((ImageView)view5) != null) {
                            v = 0x7F0B0731;  // id:live_best_ranking_title
                            View view6 = ViewBindings.a(view0, 0x7F0B0731);  // id:live_best_ranking_title
                            if(((TailTextView)view6) != null) {
                                return new v5(((ConstraintLayout)view0), view1, ((ImageView)view2), ((TextView)view3), ((TextView)view4), ((ImageView)view5), ((TailTextView)view6));
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
    public static v5 c(@NonNull LayoutInflater layoutInflater0) {
        return v5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static v5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0205, viewGroup0, false);  // layout:view_live_best_ranking_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return v5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

