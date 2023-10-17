package com.example.geekchat.models;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.geekchat.databinding.LayoutMessageBinding;
import com.example.geekchat.repository.Message;

import java.util.Date;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {
    @NonNull
    @Override
    public MessageAdapter.MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutMessageBinding binding = LayoutMessageBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);
        return new MessageViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        Message message = new ChatModel().getMessages().get(position);
        holder.binding.textView2.setText(message.from);
        holder.binding.textView3.setText(message.text);
        holder.binding.textView4.setText(new Date(message.time).toString());
    }

    @Override
    public int getItemCount() {
        return new ChatModel().getMessages().size();
    }

    static class MessageViewHolder extends RecyclerView.ViewHolder {
        LayoutMessageBinding binding;
        public MessageViewHolder(LayoutMessageBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
