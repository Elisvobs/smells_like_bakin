package com.live.elisvobs.smellslikebakin;

public class DirectionsFragment extends CheckBoxesFragment {

    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}