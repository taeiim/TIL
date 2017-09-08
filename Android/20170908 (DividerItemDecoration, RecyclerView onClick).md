# 20170908

### RecyclerView 에 구분선 넣기 (DividerItemDecoration) 

1. **JAVA 코드** (MainActivity.java)

   ```Java
   DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getApplicationContext(),LinearLayoutManager.VERTICAL);

   dividerItemDecoration.setDrawable(getApplicationContext().getResources().getDrawable(R.drawable.recycler_divider));
   ```

   ​

2. **Drawble** (recycler_divider.xml)

   ```
   <shape xmlns:android="http://schemas.android.com/apk/res/android"
       android:shape="rectangle">
       <size
           android:width="1dp"
           android:height="1dp" />
       <solid android:color="#D8D8D8" />
   </shape>
   ```

   ​

3. **JAVA** (MainActivity.java)

   ```java
   recyclerView.addItemDecoration(dividerItemDecoration);
   ```

   ​



### RecyclerView 클릭

RecyclerView에는 ListView처럼 onClickListener가 없다.

**1. class 생성해서 ClickListener 만들기 ** 

RecyclerView에는 ClickListener가 없지만 onItemTouchListener가 있다. 이걸 이용해서 clickListener를 만든다.

```
public class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {
    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    GestureDetector mGestureDetector;

    public RecyclerItemClickListener(Context context, final RecyclerView recyclerView, OnItemClickListener listener) {
        onItemClickListener = listener;
        mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }

        });
    }


    @Override
    public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
        View childView = view.findChildViewUnder(e.getX(), e.getY());
        if (childView != null && onItemClickListener != null && mGestureDetector.onTouchEvent(e)) {
            onItemClickListener.onItemClick(childView, view.getChildAdapterPosition(childView));
            return true;
        }

        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}

```



**2. MainActivity 코드 **

ClickListener를 사용해야할 Activity에 넣어준다. ( 여기서는 SettingActivity ) 

position을 받아서 item마다 액티비티를 전환해주는 코드이다. 

```java
recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if(position==0){
                    Intent intent1 = new Intent(SettingsActivity.this,AccountManageActivity.class);
                    startActivity(intent1);
                }else if(position == 1){
                    Intent intent2 = new Intent(SettingsActivity.this,MusicManageActivity.class);
                    startActivity(intent2);
                }
            }

        }));
```







### Fragment에서 Activity로 Intent화면전환

```
Intent intent = new Intent(getActivity(), SettingsActivity.class);
startActivity(intent);
```

getActivity() 를 이용한다.