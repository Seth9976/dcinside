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
import kr.better.widget.BetterTextView;

public final class y8 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ConstraintLayout c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final BetterTextView e;
    @NonNull
    public final TextView f;

    private y8(@NonNull FrameLayout frameLayout0, @NonNull TextView textView0, @NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull BetterTextView betterTextView0, @NonNull TextView textView1) {
        this.a = frameLayout0;
        this.b = textView0;
        this.c = constraintLayout0;
        this.d = imageView0;
        this.e = betterTextView0;
        this.f = textView1;
    }

    @NonNull
    public static y8 a(@NonNull View view0) {
        int v = 0x7F0B0F9D;  // id:total_gallery_section_count
        View view1 = ViewBindings.a(view0, 0x7F0B0F9D);  // id:total_gallery_section_count
        if(((TextView)view1) != null) {
            v = 0x7F0B0F9F;  // id:total_gallery_section_more
            View view2 = ViewBindings.a(view0, 0x7F0B0F9F);  // id:total_gallery_section_more
            if(((ConstraintLayout)view2) != null) {
                v = 0x7F0B0FA0;  // id:total_gallery_section_more_icon
                View view3 = ViewBindings.a(view0, 0x7F0B0FA0);  // id:total_gallery_section_more_icon
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0FA1;  // id:total_gallery_section_more_text
                    View view4 = ViewBindings.a(view0, 0x7F0B0FA1);  // id:total_gallery_section_more_text
                    if(((BetterTextView)view4) != null) {
                        v = 0x7F0B0FA2;  // id:total_gallery_section_name
                        View view5 = ViewBindings.a(view0, 0x7F0B0FA2);  // id:total_gallery_section_name
                        if(((TextView)view5) != null) {
                            return new y8(((FrameLayout)view0), ((TextView)view1), ((ConstraintLayout)view2), ((ImageView)view3), ((BetterTextView)view4), ((TextView)view5));
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
    public static y8 c(@NonNull LayoutInflater layoutInflater0) {
        return y8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static y8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E02A4, viewGroup0, false);  // layout:view_total_search_gallery_section
        if(z) {
            viewGroup0.addView(view0);
        }
        return y8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

