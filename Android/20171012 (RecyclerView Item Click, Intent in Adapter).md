# 20171012

## RecyclerView Item Click

```java
@Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        SearchDestItem searchDestItem = destItems.get(position);
        holder.destination.setText(searchDestItem.getDestination());
        holder.address.setText(searchDestItem.getAddress());
        holder.distance.setText(searchDestItem.getDistance().toString());

        holder.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //클릭 시 해야할 것
            }
        });
    }
```

Adapter 안 onBindViewHolder에 클릭리스너를 추가해준다.



## Intent in Adapter 

```java
Intent intent = new Intent(context,NextActivity.class);
intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
context.startActivity(intent);
```



