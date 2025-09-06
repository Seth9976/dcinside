package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class h6 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ConstraintLayout b;
    @NonNull
    public final Barrier c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;

    private h6(@NonNull ConstraintLayout constraintLayout0, @NonNull ConstraintLayout constraintLayout1, @NonNull Barrier barrier0, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull TextView textView1) {
        this.a = constraintLayout0;
        this.b = constraintLayout1;
        this.c = barrier0;
        this.d = imageView0;
        this.e = textView0;
        this.f = textView1;
    }

    @NonNull
    public static h6 a(@NonNull View view0) {
        int v = 0x7F0B06F3;  // id:list_block_gallery
        View view1 = ViewBindings.a(view0, 0x7F0B06F3);  // id:list_block_gallery
        if(((ConstraintLayout)view1) != null) {
            v = 0x7F0B06F4;  // id:list_block_gallery_barrier
            View view2 = ViewBindings.a(view0, 0x7F0B06F4);  // id:list_block_gallery_barrier
            if(((Barrier)view2) != null) {
                v = 0x7F0B06F5;  // id:list_block_gallery_icon
                View view3 = ViewBindings.a(view0, 0x7F0B06F5);  // id:list_block_gallery_icon
                if(((ImageView)view3) != null) {
                    v = 0x7F0B06F6;  // id:list_block_gallery_reason
                    View view4 = ViewBindings.a(view0, 0x7F0B06F6);  // id:list_block_gallery_reason
                    if(((TextView)view4) != null) {
                        v = 0x7F0B06F7;  // id:list_block_gallery_report
                        View view5 = ViewBindings.a(view0, 0x7F0B06F7);  // id:list_block_gallery_report
                        if(((TextView)view5) != null) {
                            return new h6(((ConstraintLayout)view0), ((ConstraintLayout)view1), ((Barrier)view2), ((ImageView)view3), ((TextView)view4), ((TextView)view5));
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
    public static h6 c(@NonNull LayoutInflater layoutInflater0) {
        return h6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static h6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E022B, viewGroup0, false);  // layout:view_post_list_block_gallery
        if(z) {
            viewGroup0.addView(view0);
        }
        return h6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

