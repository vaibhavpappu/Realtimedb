package com.pack.vaibhav.realtimedb;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {



    public static class PersonViewHolder extends RecyclerView.ViewHolder {



        CardView cv;

        TextView personName;




        PersonViewHolder(View itemView) {

            super(itemView);

            cv = itemView.findViewById(R.id.cv);

            personName = itemView.findViewById(R.id.person_name);


        }

    }



    List<Person> persons;



    RVAdapter(List<Person> persons){

        this.persons = persons;

    }



    @Override

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {

        super.onAttachedToRecyclerView(recyclerView);

    }



    @Override

    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);

        PersonViewHolder pvh = new PersonViewHolder(v);

        return pvh;

    }



    @Override

    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {

        personViewHolder.personName.setText(persons.get(i).messages);



    }


    @Override
    public int getItemCount() {

        return persons.size();

    }

}