package com.github.slick.sample;

import android.support.annotation.IdRes;

import com.github.slick.sample.activity.ExampleActivity;
import com.github.slick.sample.activity.ExampleActivityPresenter_Slick;
import com.github.slick.sample.activity.dagger.ExampleActivityPresenter;
import com.github.slick.sample.conductor.ConductorPresenter_Slick;
import com.github.slick.sample.conductor.HomeController;

/**
 * @author : Pedramrn@gmail.com
 *         Created on: 2017-02-12
 */

public class Slick {
    public static void bind(ExampleActivity activity, @IdRes int id, String s) {
        ExampleActivityPresenter_Slick.bind(activity, id, s);
    }

    public static void bind(com.github.slick.sample.activity.dagger.ExampleActivity activity,
                            ExampleActivityPresenter presenter) {
        com.github.slick.sample.activity.dagger.ExampleActivityPresenter_Slick.bind(activity, presenter);
    }

    public static void bind(HomeController homeController) {
        ConductorPresenter_Slick.bind(homeController);
    }
}
