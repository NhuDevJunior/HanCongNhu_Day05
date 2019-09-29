package com.example.login;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.Viewhodoer> {
    List<Contact> contact;
    IonClickContact ionClickContact;
    public void setIonClickContact(IonClickContact ionClickContact) {
        this.ionClickContact = ionClickContact;
    }
    public  ContactAdapter(List<Contact> contact){
        this.contact=contact;

    }
    @NonNull
    @Override
    public Viewhodoer onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_list,parent,false);
        Viewhodoer viewhodoer=new Viewhodoer(view);
        return viewhodoer;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewhodoer holder, int position) {
        final Contact contacts=contact.get(position);

        holder.tvNameFood.setText(contacts.getNamefood());
        String sl=String.valueOf(contacts.soluong);
        holder.tvSoluong.setText(sl);

        holder.tvNameFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ionClickContact.onClickName(contacts);
            }

        });
    }

    @Override
    public int getItemCount() {
        return contact.size();
    }

    public static class Viewhodoer extends RecyclerView.ViewHolder {
        TextView tvNameFood;
        TextView tvSoluong;

        public Viewhodoer(@NonNull View itemView) {

            super(itemView);
            tvNameFood = itemView.findViewById(R.id.tvnamefood);
            tvSoluong=itemView.findViewById(R.id.tvsoluong);
        }

    }
}

