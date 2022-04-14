package education.cccp.mobile.fragment;

import static android.view.LayoutInflater.from;
import static education.cccp.mobile.fragment.R.layout.person_row;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import education.cccp.mobile.fragment.model.PersonEntity;

public class PersonAdapter extends
        RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private List<PersonEntity> persons;

    public PersonAdapter(List<PersonEntity> persons) {
        this.persons = persons;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                               int viewType) {
        LayoutInflater inflater = from(parent.getContext());
        View view = inflater.inflate(person_row,
                parent,
                false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder,
                                 int position) {
        holder.firstNameRow.setText(persons.get(position).getFirstName());
        holder.lastNameRow.setText(persons.get(position).getLastName());
        holder.dobRow.setText(persons.get(position).getDob().toString());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {

       interface OnItemEvent{
           public Long getItemId();
       }

        private TextView firstNameRow;
        private TextView lastNameRow;
        private TextView dobRow;


        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            firstNameRow = itemView.findViewById(R.id.firstNameTextViewRow);
            lastNameRow = itemView.findViewById(R.id.lastNameTextViewRow);
            dobRow = itemView.findViewById(R.id.dobTextViewRow);
        }

        public TextView getFirstNameRow() {
            return firstNameRow;
        }

        public TextView getLastNameRow() {
            return lastNameRow;
        }

        public TextView getDobRow() {
            return dobRow;
        }
    }
}
