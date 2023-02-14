package com.github.yunfeng.demo.states;

import com.github.yunfeng.demo.Context;

public class LockedState extends State {
    LockedState(Context context) {
        super(context);
        context.setPlaying(false);
    }

    @Override
    public String onLock() {
        if (context.isPlaying()) {
            context.changeState(new ReadyState(context));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }

    @Override
    public String onPlay() {
        context.changeState(new ReadyState(context));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
