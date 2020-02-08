package org.ohmstheresistance.mastermindmvp.activities.instructions;


public class MastermindInstructionsPresenter implements MastermindInstructionsContract.MastermindInstructionPresenter {

    private MastermindInstructionsContract.MastermindInstructionsView mastermindInstructionsView;

   MastermindInstructionsPresenter(MastermindInstructionsContract.MastermindInstructionsView view){
       mastermindInstructionsView = view;
   }

    @Override
    public void handleInstructionsPlayNowClick() {
        mastermindInstructionsView.playNow();
    }

    @Override
    public void handleInstructionsGotItClick() {
       mastermindInstructionsView.dismissDialog();
    }
}
