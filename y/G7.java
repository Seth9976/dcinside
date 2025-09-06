package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class g7 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final View c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;

    private g7(@NonNull ConstraintLayout constraintLayout0, @NonNull LinearLayout linearLayout0, @NonNull View view0, @NonNull TextView textView0, @NonNull TextView textView1) {
        this.a = constraintLayout0;
        this.b = linearLayout0;
        this.c = view0;
        this.d = textView0;
        this.e = textView1;
    }

    @NonNull
    public static g7 a(@NonNull View view0) {
        int v = 0x7F0B0CDD;  // id:recommend_galleries_container
        View view1 = ViewBindings.a(view0, 0x7F0B0CDD);  // id:recommend_galleries_container
        if(((LinearLayout)view1) != null) {
            v = 0x7F0B0CDE;  // id:recommend_galleries_divider
            View view2 = ViewBindings.a(view0, 0x7F0B0CDE);  // id:recommend_galleries_divider
            if(view2 != null) {
                v = 0x7F0B0CDF;  // id:recommend_galleries_title
                View view3 = ViewBindings.a(view0, 0x7F0B0CDF);  // id:recommend_galleries_title
                if(((TextView)view3) != null) {
                    v = 0x7F0B0CE0;  // id:recommend_galleries_topic_name
                    View view4 = ViewBindings.a(view0, 0x7F0B0CE0);  // id:recommend_galleries_topic_name
                    if(((TextView)view4) != null) {
                        return new g7(((ConstraintLayout)view0), ((LinearLayout)view1), view2, ((TextView)view3), ((TextView)view4));
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
    public static g7 c(@NonNull LayoutInflater layoutInflater0) {
        return g7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static g7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E025E, viewGroup0, false);  // layout:view_recommend_galleries
        if(z) {
            viewGroup0.addView(view0);
        }
        return g7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

