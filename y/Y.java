package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class y implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final FrameLayout c;
    @NonNull
    public final TextView d;
    @NonNull
    public final ProgressBar e;
    @NonNull
    public final ImageView f;
    @NonNull
    public final DcToolbar g;
    @NonNull
    public final ImageView h;

    private y(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FrameLayout frameLayout0, @NonNull FrameLayout frameLayout1, @NonNull TextView textView0, @NonNull ProgressBar progressBar0, @NonNull ImageView imageView0, @NonNull DcToolbar dcToolbar0, @NonNull ImageView imageView1) {
        this.a = coordinatorLayout0;
        this.b = frameLayout0;
        this.c = frameLayout1;
        this.d = textView0;
        this.e = progressBar0;
        this.f = imageView0;
        this.g = dcToolbar0;
        this.h = imageView1;
    }

    @NonNull
    public static y a(@NonNull View view0) {
        int v = 0x7F0B05A6;  // id:image_edit_filter_holder
        View view1 = ViewBindings.a(view0, 0x7F0B05A6);  // id:image_edit_filter_holder
        if(((FrameLayout)view1) != null) {
            v = 0x7F0B05AC;  // id:image_edit_fragment_container
            View view2 = ViewBindings.a(view0, 0x7F0B05AC);  // id:image_edit_fragment_container
            if(((FrameLayout)view2) != null) {
                v = 0x7F0B05B3;  // id:image_edit_positive
                View view3 = ViewBindings.a(view0, 0x7F0B05B3);  // id:image_edit_positive
                if(((TextView)view3) != null) {
                    v = 0x7F0B05B4;  // id:image_edit_progress
                    View view4 = ViewBindings.a(view0, 0x7F0B05B4);  // id:image_edit_progress
                    if(((ProgressBar)view4) != null) {
                        v = 0x7F0B05B5;  // id:image_edit_redo
                        View view5 = ViewBindings.a(view0, 0x7F0B05B5);  // id:image_edit_redo
                        if(((ImageView)view5) != null) {
                            v = 0x7F0B05D1;  // id:image_edit_toolbar
                            View view6 = ViewBindings.a(view0, 0x7F0B05D1);  // id:image_edit_toolbar
                            if(((DcToolbar)view6) != null) {
                                v = 0x7F0B05D2;  // id:image_edit_undo
                                View view7 = ViewBindings.a(view0, 0x7F0B05D2);  // id:image_edit_undo
                                if(((ImageView)view7) != null) {
                                    return new y(((CoordinatorLayout)view0), ((FrameLayout)view1), ((FrameLayout)view2), ((TextView)view3), ((ProgressBar)view4), ((ImageView)view5), ((DcToolbar)view6), ((ImageView)view7));
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
    public static y c(@NonNull LayoutInflater layoutInflater0) {
        return y.d(layoutInflater0, null, false);
    }

    @NonNull
    public static y d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0036, viewGroup0, false);  // layout:activity_image_edit
        if(z) {
            viewGroup0.addView(view0);
        }
        return y.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

