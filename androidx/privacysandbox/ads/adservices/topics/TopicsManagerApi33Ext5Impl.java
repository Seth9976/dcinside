package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import y4.l;

@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RequiresExtension(extension = 1000000, version = 5)
@RestrictTo({Scope.a})
public final class TopicsManagerApi33Ext5Impl extends TopicsManagerImplCommon {
    public TopicsManagerApi33Ext5Impl(@l Context context0) {
        L.p(context0, "context");
        Object object0 = context0.getSystemService(TopicsManager.class);
        L.o(object0, "context.getSystemService…opicsManager::class.java)");
        super(((TopicsManager)object0));
    }

    @Override  // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    @l
    public GetTopicsRequest e(@l androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest getTopicsRequest0) {
        L.p(getTopicsRequest0, "request");
        GetTopicsRequest getTopicsRequest1 = f.a().setAdsSdkName("").setShouldRecordObservation(getTopicsRequest0.b()).build();
        L.o(getTopicsRequest1, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequest1;
    }
}

