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

public final class b1 implements ViewBinding {
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
    @NonNull
    public final TextView g;
    @NonNull
    public final ConstraintLayout h;

    private b1(@NonNull ConstraintLayout constraintLayout0, @NonNull ConstraintLayout constraintLayout1, @NonNull Barrier barrier0, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout2) {
        this.a = constraintLayout0;
        this.b = constraintLayout1;
        this.c = barrier0;
        this.d = imageView0;
        this.e = textView0;
        this.f = textView1;
        this.g = textView2;
        this.h = constraintLayout2;
    }

    @NonNull
    public static b1 a(@NonNull View view0) {
        int v = 0x7F0B03EB;  // id:dialog_ai_prompt_detail_barrier
        View view1 = ViewBindings.a(view0, 0x7F0B03EB);  // id:dialog_ai_prompt_detail_barrier
        if(((Barrier)view1) != null) {
            v = 0x7F0B03EC;  // id:dialog_ai_prompt_detail_close
            View view2 = ViewBindings.a(view0, 0x7F0B03EC);  // id:dialog_ai_prompt_detail_close
            if(((ImageView)view2) != null) {
                v = 0x7F0B03ED;  // id:dialog_ai_prompt_detail_negative_prompt
                View view3 = ViewBindings.a(view0, 0x7F0B03ED);  // id:dialog_ai_prompt_detail_negative_prompt
                if(((TextView)view3) != null) {
                    v = 0x7F0B03EE;  // id:dialog_ai_prompt_detail_prompt
                    View view4 = ViewBindings.a(view0, 0x7F0B03EE);  // id:dialog_ai_prompt_detail_prompt
                    if(((TextView)view4) != null) {
                        v = 0x7F0B03EF;  // id:dialog_ai_prompt_detail_title
                        View view5 = ViewBindings.a(view0, 0x7F0B03EF);  // id:dialog_ai_prompt_detail_title
                        if(((TextView)view5) != null) {
                            v = 0x7F0B03F0;  // id:dialog_ai_prompt_detail_wrap
                            View view6 = ViewBindings.a(view0, 0x7F0B03F0);  // id:dialog_ai_prompt_detail_wrap
                            if(((ConstraintLayout)view6) != null) {
                                return new b1(((ConstraintLayout)view0), ((ConstraintLayout)view0), ((Barrier)view1), ((ImageView)view2), ((TextView)view3), ((TextView)view4), ((TextView)view5), ((ConstraintLayout)view6));
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
    public static b1 c(@NonNull LayoutInflater layoutInflater0) {
        return b1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static b1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00BF, viewGroup0, false);  // layout:dialog_ai_prompt_detail
        if(z) {
            viewGroup0.addView(view0);
        }
        return b1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

