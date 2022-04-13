package education.cccp.mobile.fragment;

import static education.cccp.mobile.fragment.R.layout.list_fragment;
import static education.cccp.mobile.fragment.controller.PersonDao.getAll;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import education.cccp.mobile.fragment.controller.PersonDao;

public class ListFragment extends Fragment {

    private PersonViewModel mViewModel;
    private PersonAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(PersonViewModel.class);
        Log.d(this.getClass().getSimpleName(),getAll().get(0).toString());
        View view = inflater.inflate(list_fragment,
                container,
                false);

        adapter = new PersonAdapter(getAll());
        RecyclerView recyclerView = view.findViewById(R.id.personListView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(getContext())
        );
        return view;
    }


}