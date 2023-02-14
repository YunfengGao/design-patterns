package com.github.yunfeng.demo.states;

import com.github.yunfeng.demo.Context;

public class ReadyState extends State {
    public ReadyState(Context context) {
        super(context);
    }

    @Override
    public String onLock() {
        context.changeState(new LockedState(context));
        return "Locked...";
    }

    @Override
    public String onPlay() {
        String action = context.startPlayback();
        context.changeState(new PlayingState(context));
        return action;
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
