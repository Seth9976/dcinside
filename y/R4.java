package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class r4 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ProgressBar c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;

    private r4(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull ProgressBar progressBar0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = progressBar0;
        this.d = textView1;
        this.e = textView2;
        this.f = textView3;
    }

    @NonNull
    public static r4 a(@NonNull View view0) {
        int v = 0x7F0B0431;  // id:down_path
        View view1 = ViewBindings.a(view0, 0x7F0B0431);  // id:down_path
        if(((TextView)view1) != null) {
            v = 0x7F0B0432;  // id:down_progress
            View view2 = ViewBindings.a(view0, 0x7F0B0432);  // id:down_progress
            if(((ProgressBar)view2) != null) {
                v = 0x7F0B0433;  // id:down_retry
                View view3 = ViewBindings.a(view0, 0x7F0B0433);  // id:down_retry
                if(((TextView)view3) != null) {
                    v = 0x7F0B0436;  // id:down_subject
                    View view4 = ViewBindings.a(view0, 0x7F0B0436);  // id:down_subject
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0437;  // id:down_title
                        View view5 = ViewBindings.a(view0, 0x7F0B0437);  // id:down_title
                        if(((TextView)view5) != null) {
                            return new r4(((ConstraintLayout)view0), ((TextView)view1), ((ProgressBar)view2), ((TextView)view3), ((TextView)view4), ((TextView)view5));
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
    public static r4 c(@NonNull LayoutInflater layoutInflater0) {
        return r4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static r4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01CD, viewGroup0, false);  // layout:view_down
        if(z) {
            viewGroup0.addView(view0);
        }
        return r4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

