package com.miloshpetrov.sol2.menu;


import com.miloshpetrov.sol2.GameOptions;
import com.miloshpetrov.sol2.SolApplication;
import com.miloshpetrov.sol2.ui.SolInputManager;
import com.miloshpetrov.sol2.ui.SolUiControl;
import com.miloshpetrov.sol2.ui.UiDrawer;

import java.util.ArrayList;
import java.util.List;

public class InputMapControllerScreen implements InputMapOperations {
    private static final String HEADER_TEXT = "Controller Inputs";

    private final ArrayList<SolUiControl> controls;

    public InputMapControllerScreen(InputMapScreen inputMapScreen, GameOptions gameOptions) {
        controls = new ArrayList<SolUiControl>();
    }


    @Override
    public List<SolUiControl> getControls() {
        return controls;
    }

    @Override
    public void updateCustom(SolApplication cmp, SolInputManager.Ptr[] ptrs, boolean clickedOutside) {
    }

    @Override
    public void drawBg(UiDrawer uiDrawer, SolApplication cmp) {

    }

    @Override
    public void drawImgs(UiDrawer uiDrawer, SolApplication cmp) {

    }

    @Override
    public void drawText(UiDrawer uiDrawer, SolApplication cmp) {
    }

    @Override
    public boolean reactsToClickOutside() {
        return false;
    }

    @Override
    public boolean isCursorOnBg(SolInputManager.Ptr ptr) {
        return false;
    }

    @Override
    public void onAdd(SolApplication cmp) {

    }

    @Override
    public void blurCustom(SolApplication cmp) {

    }

    @Override
    public String getHeader() {
        return HEADER_TEXT;
    }

    @Override
    public List<InputConfigItem> getItems(GameOptions gameOptions) {
        List<InputConfigItem> items = new ArrayList<InputConfigItem>();

        InputConfigItem notImplemented = new InputConfigItem("Not Implemented", "NA");
        items.add(notImplemented);

        return items;
    }
}
