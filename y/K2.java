package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class k2 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final EditText e;
    @NonNull
    public final ProgressBar f;
    @NonNull
    public final ConstraintLayout g;

    private k2(@NonNull FrameLayout frameLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull EditText editText0, @NonNull ProgressBar progressBar0, @NonNull ConstraintLayout constraintLayout0) {
        this.a = frameLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = textView2;
        this.e = editText0;
        this.f = progressBar0;
        this.g = constraintLayout0;
    }

    @NonNull
    public static k2 a(@NonNull View view0) {
        int v = 0x7F0B0771;  // id:major_entrust_desc
        View view1 = ViewBindings.a(view0, 0x7F0B0771);  // id:major_entrust_desc
        if(((TextView)view1) != null) {
            v = 0x7F0B0772;  // id:major_entrust_input_count
            View view2 = ViewBindings.a(view0, 0x7F0B0772);  // id:major_entrust_input_count
            if(((TextView)view2) != null) {
                v = 0x7F0B0773;  // id:major_entrust_input_title
                View view3 = ViewBindings.a(view0, 0x7F0B0773);  // id:major_entrust_input_title
                if(((TextView)view3) != null) {
                    v = 0x7F0B0774;  // id:major_entrust_input_value
                    View view4 = ViewBindings.a(view0, 0x7F0B0774);  // id:major_entrust_input_value
                    if(((EditText)view4) != null) {
                        v = 0x7F0B0775;  // id:major_entrust_progress
                        View view5 = ViewBindings.a(view0, 0x7F0B0775);  // id:major_entrust_progress
                        if(((ProgressBar)view5) != null) {
                            v = 0x7F0B0776;  // id:major_entrust_views
                            View view6 = ViewBindings.a(view0, 0x7F0B0776);  // id:major_entrust_views
                            if(((ConstraintLayout)view6) != null) {
                                return new k2(((FrameLayout)view0), ((TextView)view1), ((TextView)view2), ((TextView)view3), ((EditText)view4), ((ProgressBar)view5), ((ConstraintLayout)view6));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static k2 c(@NonNull LayoutInflater layoutInflater0) {
        return k2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static k2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E010B, viewGroup0, false);  // layout:fragment_major_entrust
        if(z) {
            viewGroup0.addView(view0);
        }
        return k2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

