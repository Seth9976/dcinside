package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.DcToolbar;

public final class e0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final ClearableEditText e;
    @NonNull
    public final RecyclerView f;
    @NonNull
    public final DcToolbar g;

    private e0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FrameLayout frameLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ClearableEditText clearableEditText0, @NonNull RecyclerView recyclerView0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = frameLayout0;
        this.c = textView0;
        this.d = textView1;
        this.e = clearableEditText0;
        this.f = recyclerView0;
        this.g = dcToolbar0;
    }

    @NonNull
    public static e0 a(@NonNull View view0) {
        int v = 0x7F0B02A8;  // id:chara_prompt_progress
        View view1 = ViewBindings.a(view0, 0x7F0B02A8);  // id:chara_prompt_progress
        if(((FrameLayout)view1) != null) {
            v = 0x7F0B02A9;  // id:chara_prompt_search_about_desc
            View view2 = ViewBindings.a(view0, 0x7F0B02A9);  // id:chara_prompt_search_about_desc
            if(((TextView)view2) != null) {
                v = 0x7F0B02AA;  // id:chara_prompt_search_about_title
                View view3 = ViewBindings.a(view0, 0x7F0B02AA);  // id:chara_prompt_search_about_title
                if(((TextView)view3) != null) {
                    v = 0x7F0B02AB;  // id:chara_prompt_search_input
                    View view4 = ViewBindings.a(view0, 0x7F0B02AB);  // id:chara_prompt_search_input
                    if(((ClearableEditText)view4) != null) {
                        v = 0x7F0B02AC;  // id:chara_prompt_search_list
                        View view5 = ViewBindings.a(view0, 0x7F0B02AC);  // id:chara_prompt_search_list
                        if(((RecyclerView)view5) != null) {
                            v = 0x7F0B02AD;  // id:chara_prompt_search_toolbar
                            View view6 = ViewBindings.a(view0, 0x7F0B02AD);  // id:chara_prompt_search_toolbar
                            if(((DcToolbar)view6) != null) {
                                return new e0(((CoordinatorLayout)view0), ((FrameLayout)view1), ((TextView)view2), ((TextView)view3), ((ClearableEditText)view4), ((RecyclerView)view5), ((DcToolbar)view6));
                            }
                        }
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
    public static e0 c(@NonNull LayoutInflater layoutInflater0) {
        return e0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static e0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0055, viewGroup0, false);  // layout:activity_search_chara_prompt
        if(z) {
            viewGroup0.addView(view0);
        }
        return e0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

