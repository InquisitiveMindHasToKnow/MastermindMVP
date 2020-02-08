package org.ohmstheresistance.mastermindmvp.activities.mainpage;

import android.view.View;

public interface MainPageContract {

    interface MainPageView {

        void showMastermindGame();

        void showMasterMindInstructions();
    }

    interface MainPagePresenter{

        void handleMainPagePlayNowClick(View view);

        void handleMainPageInstructionsClick(View view);
    }
}
