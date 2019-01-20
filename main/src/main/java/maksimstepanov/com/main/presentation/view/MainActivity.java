package maksimstepanov.com.main.presentation.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import javax.inject.Inject;

import maksimstepanov.com.core.di.ScreenSubComponentProvider;
import maksimstepanov.com.core.presentation.view.BaseActivity;
import maksimstepanov.com.main.di.MainScreenSubComponent;
import maksimstepanov.com.main.presentation.presenter.MainPresenter;

public class MainActivity extends BaseActivity {
    private MainScreenSubComponent subComponent;
    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScreenSubComponentProvider provider = (ScreenSubComponentProvider) getApplication();
        subComponent = (MainScreenSubComponent) provider.getMainScreenSubComponent();
        subComponent.inject(this);

        Log.d("TAG", presenter.getName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        subComponent = null;
    }
}
