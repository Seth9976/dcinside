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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class a1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ConstraintLayout b;
    @NonNull
    public final Barrier c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final ConstraintLayout e;
    @NonNull
    public final RecyclerView f;
    @NonNull
    public final TextView g;

    private a1(@NonNull ConstraintLayout constraintLayout0, @NonNull ConstraintLayout constraintLayout1, @NonNull Barrier barrier0, @NonNull ImageView imageView0, @NonNull ConstraintLayout constraintLayout2, @NonNull RecyclerView recyclerView0, @NonNull TextView textView0) {
        this.a = constraintLayout0;
        this.b = constraintLayout1;
        this.c = barrier0;
        this.d = imageView0;
        this.e = constraintLayout2;
        this.f = recyclerView0;
        this.g = textView0;
    }

    @NonNull
    public static a1 a(@NonNull View view0) {
        int v = 0x7F0B03E7;  // id:dialog_ai_image_model_all_barrier
        View view1 = ViewBindings.a(view0, 0x7F0B03E7);  // id:dialog_ai_image_model_all_barrier
        if(((Barrier)view1) != null) {
            v = 0x7F0B03E8;  // id:dialog_ai_image_model_all_close
            View view2 = ViewBindings.a(view0, 0x7F0B03E8);  // id:dialog_ai_image_model_all_close
            if(((ImageView)view2) != null) {
                v = 0x7F0B03E9;  // id:dialog_ai_image_model_all_wrap
                View view3 = ViewBindings.a(view0, 0x7F0B03E9);  // id:dialog_ai_image_model_all_wrap
                if(((ConstraintLayout)view3) != null) {
                    v = 0x7F0B07A8;  // id:make_ai_image_lola_all_list
                    View view4 = ViewBindings.a(view0, 0x7F0B07A8);  // id:make_ai_image_lola_all_list
                    if(((RecyclerView)view4) != null) {
                        v = 0x7F0B07A9;  // id:make_ai_image_lola_all_title
                        View view5 = ViewBindings.a(view0, 0x7F0B07A9);  // id:make_ai_image_lola_all_title
                        if(((TextView)view5) != null) {
                            return new a1(((ConstraintLayout)view0), ((ConstraintLayout)view0), ((Barrier)view1), ((ImageView)view2), ((ConstraintLayout)view3), ((RecyclerView)view4), ((TextView)view5));
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
    public static a1 c(@NonNull LayoutInflater layoutInflater0) {
        return a1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static a1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00BE, viewGroup0, false);  // layout:dialog_ai_image_model_all
        if(z) {
            viewGroup0.addView(view0);
        }
        return a1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

