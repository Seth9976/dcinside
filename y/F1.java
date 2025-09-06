package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class f1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ConstraintLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final ConstraintLayout f;

    private f1(@NonNull ConstraintLayout constraintLayout0, @NonNull ConstraintLayout constraintLayout1, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout2) {
        this.a = constraintLayout0;
        this.b = constraintLayout1;
        this.c = textView0;
        this.d = textView1;
        this.e = textView2;
        this.f = constraintLayout2;
    }

    @NonNull
    public static f1 a(@NonNull View view0) {
        int v = 0x7F0B0416;  // id:dialog_fix_recent_gallery_apply
        View view1 = ViewBindings.a(view0, 0x7F0B0416);  // id:dialog_fix_recent_gallery_apply
        if(((TextView)view1) != null) {
            v = 0x7F0B0417;  // id:dialog_fix_recent_gallery_cancel
            View view2 = ViewBindings.a(view0, 0x7F0B0417);  // id:dialog_fix_recent_gallery_cancel
            if(((TextView)view2) != null) {
                v = 0x7F0B0418;  // id:dialog_fix_recent_gallery_title
                View view3 = ViewBindings.a(view0, 0x7F0B0418);  // id:dialog_fix_recent_gallery_title
                if(((TextView)view3) != null) {
                    v = 0x7F0B0419;  // id:dialog_fix_recent_gallery_wrap
                    View view4 = ViewBindings.a(view0, 0x7F0B0419);  // id:dialog_fix_recent_gallery_wrap
                    if(((ConstraintLayout)view4) != null) {
                        return new f1(((ConstraintLayout)view0), ((ConstraintLayout)view0), ((TextView)view1), ((TextView)view2), ((TextView)view3), ((ConstraintLayout)view4));
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
    public static f1 c(@NonNull LayoutInflater layoutInflater0) {
        return f1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static f1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00C5, viewGroup0, false);  // layout:dialog_fix_recent_gallery
        if(z) {
            viewGroup0.addView(view0);
        }
        return f1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

