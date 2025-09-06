package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class b implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ProgressBar c;
    @NonNull
    public final RecyclerView d;
    @NonNull
    public final DcToolbar e;

    private b(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull TextView textView0, @NonNull ProgressBar progressBar0, @NonNull RecyclerView recyclerView0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = textView0;
        this.c = progressBar0;
        this.d = recyclerView0;
        this.e = dcToolbar0;
    }

    @NonNull
    public static b a(@NonNull View view0) {
        int v = 0x7F0B00C9;  // id:ai_image_load_prompt_empty
        View view1 = ViewBindings.a(view0, 0x7F0B00C9);  // id:ai_image_load_prompt_empty
        if(((TextView)view1) != null) {
            v = 0x7F0B00CA;  // id:ai_image_load_prompt_progress
            View view2 = ViewBindings.a(view0, 0x7F0B00CA);  // id:ai_image_load_prompt_progress
            if(((ProgressBar)view2) != null) {
                v = 0x7F0B00CB;  // id:ai_image_load_prompt_recycler
                View view3 = ViewBindings.a(view0, 0x7F0B00CB);  // id:ai_image_load_prompt_recycler
                if(((RecyclerView)view3) != null) {
                    v = 0x7F0B00CC;  // id:ai_image_load_prompt_toolbar
                    View view4 = ViewBindings.a(view0, 0x7F0B00CC);  // id:ai_image_load_prompt_toolbar
                    if(((DcToolbar)view4) != null) {
                        return new b(((CoordinatorLayout)view0), ((TextView)view1), ((ProgressBar)view2), ((RecyclerView)view3), ((DcToolbar)view4));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater0) {
        return b.d(layoutInflater0, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E001D, viewGroup0, false);  // layout:activity_ai_image_load_prompt
        if(z) {
            viewGroup0.addView(view0);
        }
        return b.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

