# ViewPager

ViewPager 는 수평으로 View를 좌우로 스크롤 할때 사용하는 클래스이다.

화면을 옆으로 싸악~ 넘길때 사용한다.



### 사용법

-----------

1. 안드로이드 SDK에서 기본적으로 제공해주는 클래스가 아니기 때문에 "android-support-v4.jar"라는 라이브러리를 추가해서 사용해야 한다. 

   XML에 요렇게 ViewPager를 적용해준다.

   ```java
   <android.support.v4.view.ViewPager
       android:id="@+id/pager"
       android:layout_width="match_parent"
       android:layout_height="match_parent">
   ```

   ​

2. PagerAdapter 을 상속하는 커스텀 클래스 생성

   ```Java
   public class CustomAdapter extends PagerAdapter{
       LayoutInflater inflater;

       public CustomAdapter(LayoutInflater inflater){
           this.inflater = inflater;
       }

       @Override
       public int getCount(){
         	//ViewPager 몇개 생성 (.length 사용하는 것이 좋을듯)
           return 10;
       }


       @Override
       public Object instantiateItem(ViewGroup container, int position){
           View view = null;

           view = inflater.inflate(R.layout.viewpager_childview,null);

           container.addView(view);
           return  view;
       }

       @Override
       public void destroyItem(ViewGroup container,int position, Object object){
           container.removeView((View)object);
       }

       @Override
       public boolean isViewFromObject(View v, Object obj){
           return v==obj;
       }

   }
   ```



3. CustomAdapter를 ViewPager에 적용

   ```java
   pager = (ViewPager) findViewById(R.id.pager);
   CustomAdapter adapter = new CustomAdapter(getLayoutInflater());
   pager.setAdapter(adapter);
   ```

   ​

