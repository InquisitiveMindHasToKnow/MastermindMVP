package org.ohmstheresistance.mastermindmvp.activities.instructions;


import android.view.View;

public class MastermindInstructionsPresenter implements MastermindInstructionsContract.MastermindInstructionPresenter {

    private MastermindInstructionsContract.MastermindInstructionsView mastermindInstructionsView;

   MastermindInstructionsPresenter(MastermindInstructionsContract.MastermindInstructionsView view){
       mastermindInstructionsView = view;
   }

    @Override
    public void handleInstructionsPlayNowClick(View view) {
        mastermindInstructionsView.playNow();
    }

    @Override
    public void handleInstructionsGotItClick(View view) {
       mastermindInstructionsView.dismissDialog();
    }

}
