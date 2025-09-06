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

public final class t1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final LinearLayout c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final LinearLayout f;
    @NonNull
    public final TextView g;

    private t1(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull LinearLayout linearLayout0, @NonNull ImageView imageView1, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout1, @NonNull TextView textView0) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = linearLayout0;
        this.d = imageView1;
        this.e = imageView2;
        this.f = linearLayout1;
        this.g = textView0;
    }

    @NonNull
    public static t1 a(@NonNull View view0) {
        int v = 0x7F0B027D;  // id:capture_all_img
        View view1 = ViewBindings.a(view0, 0x7F0B027D);  // id:capture_all_img
        if(((ImageView)view1) != null) {
            v = 0x7F0B027E;  // id:capture_all_wrap
            View view2 = ViewBindings.a(view0, 0x7F0B027E);  // id:capture_all_wrap
            if(((LinearLayout)view2) != null) {
                v = 0x7F0B027F;  // id:capture_close
                View view3 = ViewBindings.a(view0, 0x7F0B027F);  // id:capture_close
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0280;  // id:capture_read_img
                    View view4 = ViewBindings.a(view0, 0x7F0B0280);  // id:capture_read_img
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B0281;  // id:capture_read_wrap
                        View view5 = ViewBindings.a(view0, 0x7F0B0281);  // id:capture_read_wrap
                        if(((LinearLayout)view5) != null) {
                            v = 0x7F0B0282;  // id:capture_title
                            View view6 = ViewBindings.a(view0, 0x7F0B0282);  // id:capture_title
                            if(((TextView)view6) != null) {
                                return new t1(((ConstraintLayout)view0), ((ImageView)view1), ((LinearLayout)view2), ((ImageView)view3), ((ImageView)view4), ((LinearLayout)view5), ((TextView)view6));
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
    public static t1 c(@NonNull LayoutInflater layoutInflater0) {
        return t1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static t1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00D3, viewGroup0, false);  // layout:dialog_fragment_select_capture_mode
        if(z) {
            viewGroup0.addView(view0);
        }
        return t1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

