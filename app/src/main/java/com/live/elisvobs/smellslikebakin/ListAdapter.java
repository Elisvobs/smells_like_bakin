package com.live.elisvobs.smellslikebakin;

public class ListAdapter extends RecyclerAdapter {
    private final ListFragment.OnRecipeSelectedInterface mListener;

     ListAdapter(ListFragment.OnRecipeSelectedInterface listener) {
        mListener = listener;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.list_item;
    }

    @Override
    protected void onRecipeSelected(int index) {
        mListener.onListRecipeSelected(index);
    }
}