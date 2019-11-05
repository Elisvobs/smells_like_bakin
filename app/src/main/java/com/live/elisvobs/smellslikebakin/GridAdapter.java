package com.live.elisvobs.smellslikebakin;

public class GridAdapter extends RecyclerAdapter {
    private final GridFragment.OnRecipeSelectedInterface mListener;

    GridAdapter(GridFragment.OnRecipeSelectedInterface listener) {
        mListener = listener;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.grid_item;
    }

    @Override
    protected void onRecipeSelected(int index) {
        mListener.onGridRecipeSelected(index);
    }
}