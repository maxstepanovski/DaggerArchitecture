package maksimstepanov.com.main.presentation.presenter;

import android.util.Log;

import maksimstepanov.com.core.presentation.presenter.BasePresenter;
import maksimstepanov.com.somefeature.SomeFeatureInteractor;

/**
 * Main screen presenter
 */
public class MainPresenter extends BasePresenter {
    private SomeFeatureInteractor interactor;
    private String name;

    public MainPresenter(SomeFeatureInteractor interactor) {
        this.interactor = interactor;
        name = "I'm main screen presenter";
    }

    public void doSomeJobWithInteractor() {
        Log.d("TAG", "doing some job on main screen!");
        interactor.doSomeJob();
    }

    public String getName() {
        return name;
    }
}
