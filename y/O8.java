package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class o8 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final ConstraintLayout e;
    @NonNull
    public final TextView f;
    @NonNull
    public final TextView g;

    private o8(@NonNull ConstraintLayout constraintLayout0, @NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull ImageView imageView0, @NonNull ConstraintLayout constraintLayout1, @NonNull TextView textView1, @NonNull TextView textView2) {
        this.a = constraintLayout0;
        this.b = linearLayout0;
        this.c = textView0;
        this.d = imageView0;
        this.e = constraintLayout1;
        this.f = textView1;
        this.g = textView2;
    }

    @NonNull
    public static o8 a(@NonNull View view0) {
        int v = 0x7F0B0F94;  // id:toolbar_gravity
        View view1 = ViewBindings.a(view0, 0x7F0B0F94);  // id:toolbar_gravity
        if(((LinearLayout)view1) != null) {
            v = 0x7F0B0F95;  // id:toolbar_info
            View view2 = ViewBindings.a(view0, 0x7F0B0F95);  // id:toolbar_info
            if(((TextView)view2) != null) {
                v = 0x7F0B0F96;  // id:toolbar_left_icon
                View view3 = ViewBindings.a(view0, 0x7F0B0F96);  // id:toolbar_left_icon
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0F98;  // id:toolbar_sub
                    View view4 = ViewBindings.a(view0, 0x7F0B0F98);  // id:toolbar_sub
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0F99;  // id:toolbar_title
                        View view5 = ViewBindings.a(view0, 0x7F0B0F99);  // id:toolbar_title
                        if(((TextView)view5) != null) {
                            return new o8(((ConstraintLayout)view0), ((LinearLayout)view1), ((TextView)view2), ((ImageView)view3), ((ConstraintLayout)view0), ((TextView)view4), ((TextView)view5));
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
    public static o8 c(@NonNull LayoutInflater layoutInflater0) {
        return o8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static o8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E029A, viewGroup0, false);  // layout:view_toolbar_overlay
        if(z) {
            viewGroup0.addView(view0);
        }
        return o8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

