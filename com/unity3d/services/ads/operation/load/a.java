package com.unity3d.services.ads.operation.load;

public final class a implements Runnable {
    public final LoadOperationState a;

    public a(LoadOperationState loadOperationState0) {
        this.a = loadOperationState0;
    }

    @Override
    public final void run() {
        LoadModuleDecoratorTimeout.lambda$onOperationTimeout$0(this.a);
    }
}

