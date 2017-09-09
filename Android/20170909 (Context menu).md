# 20170909

## RecyclerView LongClick 하면 Context menu 

```java
public class ViewHolder extends RealmViewHolder implements View.OnCreateContextMenuListener,MenuItem.OnMenuItemClickListener{

    public CardView cardView;
    public TextView titleTextView;
    public TextView descTextView;

    public ViewHolder(CardView container) {
        super(container);
        this.cardView = (CardView) container.findViewById(R.id.wordBookCardView);
        this.titleTextView = (TextView) container.findViewById(R.id.titleTextView);
        this.descTextView = (TextView) container.findViewById(R.id.describeTextView);
        container.setOnCreateContextMenuListener(this);
    }
}
```

1. Adaptet 클래스 안 ViewHolder에 **View.onCreateContextMenuListener**과 **MenuItem.OnMenuItemClickListener**를 implements 해준다.
2. ViewHolder안에 **container.setOnCreateContextMenuListener(this);** 를 추가한다.



3. 빨간줄이 뜨면 자동완성으로(alt+enter) onCreateContextMenu, onMenuItemClick Override 해준다.

```java
@Override
public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
    MenuItem menuItem = contextMenu.add("삭제");
    menuItem.setOnMenuItemClickListener(this);
}
@Override
public boolean onMenuItemClick(MenuItem menuItem) {
    return true;
}
```

