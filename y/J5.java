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

public final class j5 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final ImageView e;

    private j5(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ImageView imageView0, @NonNull ImageView imageView1) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = imageView0;
        this.e = imageView1;
    }

    @NonNull
    public static j5 a(@NonNull View view0) {
        int v = 0x7F0B0838;  // id:mini_name
        View view1 = ViewBindings.a(view0, 0x7F0B0838);  // id:mini_name
        if(((TextView)view1) != null) {
            v = 0x7F0B083E;  // id:mini_status
            View view2 = ViewBindings.a(view0, 0x7F0B083E);  // id:mini_status
            if(((TextView)view2) != null) {
                v = 0x7F0B083F;  // id:mini_status_favor_icon
                View view3 = ViewBindings.a(view0, 0x7F0B083F);  // id:mini_status_favor_icon
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0840;  // id:mini_status_private
                    View view4 = ViewBindings.a(view0, 0x7F0B0840);  // id:mini_status_private
                    if(((ImageView)view4) != null) {
                        return new j5(((ConstraintLayout)view0), ((TextView)view1), ((TextView)view2), ((ImageView)view3), ((ImageView)view4));
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
    public static j5 c(@NonNull LayoutInflater layoutInflater0) {
        return j5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static j5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01F9, viewGroup0, false);  // layout:view_item_my_mini
        if(z) {
            viewGroup0.addView(view0);
        }
        return j5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

