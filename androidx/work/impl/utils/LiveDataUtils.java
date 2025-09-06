package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo({Scope.b})
public class LiveDataUtils {
    @SuppressLint({"LambdaLast"})
    @NonNull
    public static LiveData a(@NonNull LiveData liveData0, @NonNull Function function0, @NonNull TaskExecutor taskExecutor0) {
        Object object0 = new Object();
        LiveData liveData1 = new MediatorLiveData();
        ((MediatorLiveData)liveData1).s(liveData0, new Observer() {
            Object a;

            {
                TaskExecutor taskExecutor0 = taskExecutor0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Object object0 = object0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function function0 = function0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                MediatorLiveData mediatorLiveData0 = (MediatorLiveData)liveData1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = null;
            }

            @Override  // androidx.lifecycle.Observer
            public void onChanged(@Nullable Object object0) {
                androidx.work.impl.utils.LiveDataUtils.1.1 liveDataUtils$1$10 = new Runnable() {
                    final androidx.work.impl.utils.LiveDataUtils.1 b;

                    @Override
                    public void run() {
                        synchronized(androidx.work.impl.utils.LiveDataUtils.1.this.c) {
                            Object object1 = androidx.work.impl.utils.LiveDataUtils.1.this.d.apply(object0);
                            androidx.work.impl.utils.LiveDataUtils.1 liveDataUtils$10 = androidx.work.impl.utils.LiveDataUtils.1.this;
                            Object object2 = liveDataUtils$10.a;
                            if(object2 == null && object1 != null) {
                                liveDataUtils$10.a = object1;
                                liveDataUtils$10.e.o(object1);
                            }
                            else if(object2 != null && !object2.equals(object1)) {
                                androidx.work.impl.utils.LiveDataUtils.1.this.a = object1;
                                androidx.work.impl.utils.LiveDataUtils.1.this.e.o(object1);
                            }
                        }
                    }
                };
                taskExecutor0.b(liveDataUtils$1$10);
            }
        });
        return liveData1;
    }
}

