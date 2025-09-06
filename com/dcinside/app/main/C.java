package com.dcinside.app.main;

public final class c implements Runnable {
    public final HomeActivity a;

    public c(HomeActivity homeActivity0) {
        this.a = homeActivity0;
    }

    @Override
    public final void run() {
        HomeActivity.E3(this.a);
    }
}

