package org.ohmstheresistance.mastermindmvp.activities.mainpage;

import android.view.View;

public class MainPagePresenter implements MainPageContract.MastermindPresenter {

    private MainPageContract.MastermindView mastermindView;

    public MainPagePresenter(MainPageContract.MastermindView view){
        mastermindView = view;

    }

    @Override
    public void handleGoToMastermindGameClick(View view) {
        mastermindView.showMastermindGame();
    }

    @Override
    public void handleGoToMasterMindGameInstructionsClick(View view) {
        mastermindView.showMasterMindInstructions();
    }
}
