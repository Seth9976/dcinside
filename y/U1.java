package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class u1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final RecyclerView b;
    @NonNull
    public final ConstraintLayout c;

    private u1(@NonNull ConstraintLayout constraintLayout0, @NonNull RecyclerView recyclerView0, @NonNull ConstraintLayout constraintLayout1) {
        this.a = constraintLayout0;
        this.b = recyclerView0;
        this.c = constraintLayout1;
    }

    @NonNull
    public static u1 a(@NonNull View view0) {
        RecyclerView recyclerView0 = (RecyclerView)ViewBindings.a(view0, 0x7F0B0424);  // id:dialog_select_year_list
        if(recyclerView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0424));  // id:dialog_select_year_list
        }
        return new u1(((ConstraintLayout)view0), recyclerView0, ((ConstraintLayout)view0));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static u1 c(@NonNull LayoutInflater layoutInflater0) {
        return u1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static u1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00D4, viewGroup0, false);  // layout:dialog_fragment_select_year
        if(z) {
            viewGroup0.addView(view0);
        }
        return u1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

