package org.ohmstheresistance.mastermindmvp.activities.mainpage;

import android.view.View;

public interface MainPageContract {

    interface MastermindView {

        void showMastermindGame();

        void showMasterMindInstructions();
    }

    interface MastermindPresenter{

        void handleGoToMastermindGameClick(View view);

        void handleGoToMasterMindGameInstructionsClick(View view);
    }
}
