package maksimstepanov.com.main.presentation.presenter;

import maksimstepanov.com.core.presentation.presenter.BasePresenter;

/**
 * Main screen presenter
 */
public class MainPresenter extends BasePresenter {
    private String name;

    public MainPresenter() {
        name = "I'm main screen presenter";
    }

    public String getName() {
        return name;
    }
}
