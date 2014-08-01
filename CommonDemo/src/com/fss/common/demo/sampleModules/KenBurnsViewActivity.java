package com.fss.common.demo.sampleModules;


import android.os.Bundle;

import android.widget.ViewSwitcher;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.fss.common.ui.HomeasUpActionbarActivity;
import com.fss.common.uiModule.kenburnsview.KenBurnsView;
import com.fss.common.uiModule.kenburnsview.RandomTransitionGenerator;
import com.fss.common.uiModule.kenburnsview.Transition;
import com.fss.common.demo.R;

public class KenBurnsViewActivity extends HomeasUpActionbarActivity {
    @InjectView(R.id.kenBurnsImageView)
    KenBurnsView kenBurnsView;
    @InjectView(R.id.kenBurnsViewSwitch)
    ViewSwitcher viewSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ken_burns_activity);
        ButterKnife.inject(this);
       // RandomTransitionGenerator generator = new RandomTransitionGenerator();
       // kenBurnsView.setTransitionGenerator(generator);
        kenBurnsView.resume();

        kenBurnsView.setTransitionListener(new KenBurnsView.TransitionListener() {
            @Override
            public void onTransitionStart(Transition transition) {

            }
            @Override
            public void onTransitionEnd(Transition transition) {
                viewSwitcher.showNext();
            }
        });
    }


}
