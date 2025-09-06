package androidx.window.embedding;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.embedding.ActivityRule.Builder;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitPairRule.Builder;
import androidx.window.extensions.embedding.SplitPlaceholderRule.Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

@ExperimentalWindowApi
public final class EmbeddingAdapter {
    private final Object f(Pair pair0) {
        L.p(pair0, "<this>");
        return pair0.first;
    }

    private final Object g(Pair pair0) {
        L.p(pair0, "<this>");
        return pair0.second;
    }

    private final SplitInfo h(androidx.window.extensions.embedding.SplitInfo splitInfo0) {
        boolean z1;
        ActivityStack activityStack0 = splitInfo0.getPrimaryActivityStack();
        L.o(activityStack0, "splitInfo.primaryActivityStack");
        boolean z = false;
        try {
            z1 = false;
            z1 = activityStack0.isEmpty();
        }
        catch(NoSuchMethodError unused_ex) {
        }
        List list0 = activityStack0.getActivities();
        L.o(list0, "primaryActivityStack.activities");
        androidx.window.embedding.ActivityStack activityStack1 = new androidx.window.embedding.ActivityStack(list0, z1);
        ActivityStack activityStack2 = splitInfo0.getSecondaryActivityStack();
        L.o(activityStack2, "splitInfo.secondaryActivityStack");
        try {
            z = activityStack2.isEmpty();
        }
        catch(NoSuchMethodError unused_ex) {
        }
        List list1 = activityStack2.getActivities();
        L.o(list1, "secondaryActivityStack.activities");
        return new SplitInfo(activityStack1, new androidx.window.embedding.ActivityStack(list1, z), splitInfo0.getSplitRatio());
    }

    @l
    public final List i(@l List list0) {
        L.p(list0, "splitInfoList");
        List list1 = new ArrayList(u.b0(list0, 10));
        for(Object object0: list0) {
            list1.add(this.h(((androidx.window.extensions.embedding.SplitInfo)object0)));
        }
        return list1;
    }

    @l
    public final Set j(@l Set set0) {
        EmbeddingRule embeddingRule1;
        L.p(set0, "rules");
        ArrayList arrayList0 = new ArrayList(u.b0(set0, 10));
        for(Object object0: set0) {
            androidx.window.embedding.EmbeddingRule embeddingRule0 = (androidx.window.embedding.EmbeddingRule)object0;
            if(embeddingRule0 instanceof SplitPairRule) {
                androidx.window.extensions.embedding.SplitPairRule splitPairRule0 = new SplitPairRule.Builder(this.m(((SplitPairRule)embeddingRule0).g()), this.k(((SplitPairRule)embeddingRule0).g()), this.s(((SplitRule)embeddingRule0))).setSplitRatio(((SplitPairRule)embeddingRule0).e()).setLayoutDirection(((SplitPairRule)embeddingRule0).b()).setShouldFinishPrimaryWithSecondary(((SplitPairRule)embeddingRule0).h()).setShouldFinishSecondaryWithPrimary(((SplitPairRule)embeddingRule0).i()).setShouldClearTop(((SplitPairRule)embeddingRule0).f()).build();
                L.o(splitPairRule0, "SplitPairRuleBuilder(\n  …                 .build()");
                embeddingRule1 = (EmbeddingRule)splitPairRule0;
            }
            else if(embeddingRule0 instanceof SplitPlaceholderRule) {
                androidx.window.extensions.embedding.SplitPlaceholderRule splitPlaceholderRule0 = new SplitPlaceholderRule.Builder(((SplitPlaceholderRule)embeddingRule0).g(), this.o(((SplitPlaceholderRule)embeddingRule0).f()), this.q(((SplitPlaceholderRule)embeddingRule0).f()), this.s(((SplitRule)embeddingRule0))).setSplitRatio(((SplitPlaceholderRule)embeddingRule0).e()).setLayoutDirection(((SplitPlaceholderRule)embeddingRule0).b()).build();
                L.o(splitPlaceholderRule0, "SplitPlaceholderRuleBuil…                 .build()");
                embeddingRule1 = (EmbeddingRule)splitPlaceholderRule0;
            }
            else {
                if(!(embeddingRule0 instanceof ActivityRule)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                androidx.window.extensions.embedding.ActivityRule activityRule0 = new ActivityRule.Builder(this.o(((ActivityRule)embeddingRule0).b()), this.q(((ActivityRule)embeddingRule0).b())).setShouldAlwaysExpand(((ActivityRule)embeddingRule0).a()).build();
                L.o(activityRule0, "ActivityRuleBuilder(\n   …                 .build()");
                embeddingRule1 = (EmbeddingRule)activityRule0;
            }
            arrayList0.add(embeddingRule1);
        }
        return u.a6(arrayList0);
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @l
    public final Predicate k(@l Set set0) {
        L.p(set0, "splitPairFilters");
        return (Pair pair0) -> {
            L.p(this, "this$0");
            L.p(set0, "$splitPairFilters");
            L.o(pair0, "(first, second)");
            Activity activity0 = (Activity)this.f(pair0);
            Intent intent0 = (Intent)this.g(pair0);
            if(!(set0 instanceof Collection) || !set0.isEmpty()) {
                for(Object object0: set0) {
                    if(((SplitPairFilter)object0).d(activity0, intent0)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        };
    }

    // 检测为 Lambda 实现
    private static final boolean l(EmbeddingAdapter embeddingAdapter0, Set set0, Pair pair0) [...]

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @l
    public final Predicate m(@l Set set0) {
        L.p(set0, "splitPairFilters");
        return (Pair pair0) -> {
            L.p(this, "this$0");
            L.p(set0, "$splitPairFilters");
            L.o(pair0, "(first, second)");
            Activity activity0 = (Activity)this.f(pair0);
            Activity activity1 = (Activity)this.g(pair0);
            if(!(set0 instanceof Collection) || !set0.isEmpty()) {
                for(Object object0: set0) {
                    if(((SplitPairFilter)object0).e(activity0, activity1)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        };
    }

    // 检测为 Lambda 实现
    private static final boolean n(EmbeddingAdapter embeddingAdapter0, Set set0, Pair pair0) [...]

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @l
    public final Predicate o(@l Set set0) {
        L.p(set0, "activityFilters");
        return (Activity activity0) -> {
            L.p(set0, "$activityFilters");
            if(!(set0 instanceof Collection) || !set0.isEmpty()) {
                for(Object object0: set0) {
                    L.o(activity0, "activity");
                    if(((ActivityFilter)object0).c(activity0)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        };
    }

    // 检测为 Lambda 实现
    private static final boolean p(Set set0, Activity activity0) [...]

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @l
    public final Predicate q(@l Set set0) {
        L.p(set0, "activityFilters");
        return (Intent intent0) -> {
            L.p(set0, "$activityFilters");
            if(!(set0 instanceof Collection) || !set0.isEmpty()) {
                for(Object object0: set0) {
                    L.o(intent0, "intent");
                    if(((ActivityFilter)object0).d(intent0)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        };
    }

    // 检测为 Lambda 实现
    private static final boolean r(Set set0, Intent intent0) [...]

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @l
    public final Predicate s(@l SplitRule splitRule0) {
        L.p(splitRule0, "splitRule");
        return (WindowMetrics windowMetrics0) -> {
            L.p(splitRule0, "$splitRule");
            L.o(windowMetrics0, "windowMetrics");
            return splitRule0.a(windowMetrics0);
        };
    }

    // 检测为 Lambda 实现
    private static final boolean t(SplitRule splitRule0, WindowMetrics windowMetrics0) [...]
}

