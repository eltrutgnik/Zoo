package com.example.arturo.zoo.utils;

import com.squareup.otto.Bus;

/**
 * Created by arturo on 7/19/15.
 */
public class EventBus extends Bus {
    private static final EventBus bus = new EventBus();

    public static Bus getInstance(){return bus;}

    private EventBus(){}
}
