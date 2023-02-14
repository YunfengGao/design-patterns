package com.github.yunfeng.demo.states;

import com.github.yunfeng.demo.Context;

public abstract class State {
    Context context;

    /**
     * Context passes itself through the state constructor. This may help a
     * state to fetch some useful context data if needed.
     */
    State(Context context) {
        this.context = context;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
