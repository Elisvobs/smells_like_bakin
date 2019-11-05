package com.live.elisvobs.smellslikebakin;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GridFragment extends Fragment{

    public interface OnRecipeSelectedInterface {
        void onGridRecipeSelected(int index);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        OnRecipeSelectedInterface listener = (OnRecipeSelectedInterface) getActivity();
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        GridAdapter gridAdapter = new GridAdapter(listener);
        recyclerView.setAdapter(gridAdapter);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
        int numColumns = (int) (dpWidth / 200);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), numColumns);
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}