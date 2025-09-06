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

public final class s1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final ConstraintLayout d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final TextView g;
    @NonNull
    public final ConstraintLayout h;

    private s1(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ConstraintLayout constraintLayout1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ConstraintLayout constraintLayout2) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = constraintLayout1;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = constraintLayout2;
    }

    @NonNull
    public static s1 a(@NonNull View view0) {
        int v = 0x7F0B09FC;  // id:popup_keyword_apply
        View view1 = ViewBindings.a(view0, 0x7F0B09FC);  // id:popup_keyword_apply
        if(((TextView)view1) != null) {
            v = 0x7F0B09FD;  // id:popup_keyword_cancel
            View view2 = ViewBindings.a(view0, 0x7F0B09FD);  // id:popup_keyword_cancel
            if(((TextView)view2) != null) {
                v = 0x7F0B09FF;  // id:popup_keyword_desc1
                View view3 = ViewBindings.a(view0, 0x7F0B09FF);  // id:popup_keyword_desc1
                if(((TextView)view3) != null) {
                    v = 0x7F0B0A00;  // id:popup_keyword_desc2
                    View view4 = ViewBindings.a(view0, 0x7F0B0A00);  // id:popup_keyword_desc2
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0A01;  // id:popup_keyword_value
                        View view5 = ViewBindings.a(view0, 0x7F0B0A01);  // id:popup_keyword_value
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0A02;  // id:popup_keyword_wrap
                            View view6 = ViewBindings.a(view0, 0x7F0B0A02);  // id:popup_keyword_wrap
                            if(((ConstraintLayout)view6) != null) {
                                return new s1(((ConstraintLayout)view0), ((TextView)view1), ((TextView)view2), ((ConstraintLayout)view0), ((TextView)view3), ((TextView)view4), ((TextView)view5), ((ConstraintLayout)view6));
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
    public static s1 c(@NonNull LayoutInflater layoutInflater0) {
        return s1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static s1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00D2, viewGroup0, false);  // layout:dialog_fragment_search_keyword_popup
        if(z) {
            viewGroup0.addView(view0);
        }
        return s1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

