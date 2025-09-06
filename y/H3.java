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

public final class h3 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ConstraintLayout b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;

    private h3(@NonNull ConstraintLayout constraintLayout0, @NonNull ConstraintLayout constraintLayout1, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull TextView textView1) {
        this.a = constraintLayout0;
        this.b = constraintLayout1;
        this.c = imageView0;
        this.d = textView0;
        this.e = textView1;
    }

    @NonNull
    public static h3 a(@NonNull View view0) {
        int v = 0x7F0B062D;  // id:img_album
        View view1 = ViewBindings.a(view0, 0x7F0B062D);  // id:img_album
        if(((ImageView)view1) != null) {
            v = 0x7F0B0FEE;  // id:txt_album
            View view2 = ViewBindings.a(view0, 0x7F0B0FEE);  // id:txt_album
            if(((TextView)view2) != null) {
                v = 0x7F0B0FEF;  // id:txt_album_count
                View view3 = ViewBindings.a(view0, 0x7F0B0FEF);  // id:txt_album_count
                if(((TextView)view3) != null) {
                    return new h3(((ConstraintLayout)view0), ((ConstraintLayout)view0), ((ImageView)view1), ((TextView)view2), ((TextView)view3));
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
    public static h3 c(@NonNull LayoutInflater layoutInflater0) {
        return h3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static h3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E018F, viewGroup0, false);  // layout:view_album_item_grid
        if(z) {
            viewGroup0.addView(view0);
        }
        return h3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

