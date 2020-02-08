package org.ohmstheresistance.mastermindmvp.activities.mainpage;

import android.view.View;

public class MainPagePresenter implements MainPageContract.MainPagePresenter {

    private MainPageContract.MainPageView mastermindView;

     MainPagePresenter(MainPageContract.MainPageView view){
        mastermindView = view;

    }

    @Override
    public void handleMainPagePlayNowClick(View view) {
        mastermindView.showMastermindGame();
    }

    @Override
    public void handleMainPageInstructionsClick(View view) {
        mastermindView.showMasterMindInstructions();
    }
}
