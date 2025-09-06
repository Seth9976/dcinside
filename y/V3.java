package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class v3 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final FrameLayout c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final View e;
    @NonNull
    public final TextView f;

    private v3(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull FrameLayout frameLayout0, @NonNull ImageView imageView0, @NonNull View view0, @NonNull TextView textView1) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = frameLayout0;
        this.d = imageView0;
        this.e = view0;
        this.f = textView1;
    }

    @NonNull
    public static v3 a(@NonNull View view0) {
        int v = 0x7F0B068D;  // id:item_article_contents
        View view1 = ViewBindings.a(view0, 0x7F0B068D);  // id:item_article_contents
        if(((TextView)view1) != null) {
            v = 0x7F0B068E;  // id:item_article_delete
            View view2 = ViewBindings.a(view0, 0x7F0B068E);  // id:item_article_delete
            if(((FrameLayout)view2) != null) {
                v = 0x7F0B068F;  // id:item_article_delete_icon
                View view3 = ViewBindings.a(view0, 0x7F0B068F);  // id:item_article_delete_icon
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0690;  // id:item_article_divider
                    View view4 = ViewBindings.a(view0, 0x7F0B0690);  // id:item_article_divider
                    if(view4 != null) {
                        v = 0x7F0B0691;  // id:item_article_subject
                        View view5 = ViewBindings.a(view0, 0x7F0B0691);  // id:item_article_subject
                        if(((TextView)view5) != null) {
                            return new v3(((ConstraintLayout)view0), ((TextView)view1), ((FrameLayout)view2), ((ImageView)view3), view4, ((TextView)view5));
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
    public static v3 c(@NonNull LayoutInflater layoutInflater0) {
        return v3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static v3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E019D, viewGroup0, false);  // layout:view_article_post_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return v3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

