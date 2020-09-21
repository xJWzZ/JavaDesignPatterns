package com.exercises.singleton;

import java.util.function.Supplier;

public class SingletonTester {
    public static boolean isSingleton(Supplier<Object> func)
    {
        // todo
        return (func.get() == func.get());
    }
}
