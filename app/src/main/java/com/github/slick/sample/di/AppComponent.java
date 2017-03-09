package com.github.slick.sample.di;


import com.github.slick.sample.activity.dagger.DaggerModule;
import com.github.slick.sample.activity.dagger.ExampleActivity;
import com.github.slick.sample.conductor.dagger.ExampleController;
import com.github.slick.sample.fragment.dagger.DaggerFragment;
import com.github.slick.sample.fragment.dagger.delegate.DelegateDaggerSlickFragment;
import com.github.slick.sample.fragmentsupport.dagger.DaggerFragmentSupport;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

/**
 * @author : Pedramrn@gmail.com
 *         Created on: 2016-11-01
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    DaggerComponent add(DaggerModule mainModule);

    @Subcomponent(modules = DaggerModule.class)
    interface DaggerComponent {
        void inject(ExampleActivity activity);

        void inject(ExampleController controller);

        void inject(DaggerFragment fragment);

        void inject(DelegateDaggerSlickFragment delegateDaggerSlickFragment);

        void inject(DaggerFragmentSupport daggerFragment);
    }

}
