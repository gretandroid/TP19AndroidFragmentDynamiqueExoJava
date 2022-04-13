package education.cccp.mobile.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonAdapter extends
        RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                               int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder,
                                 int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {
        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
