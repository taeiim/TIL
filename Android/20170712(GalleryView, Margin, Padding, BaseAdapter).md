# 20170712

## GalleryView

안드로이드에서 Gallery를 사용하면 취소선이 뜨면서 **'android.widget.Gallery' is deprecated**라고 뜬다.

안드로이드 4.1(16) 젤리빈 이상에서는 갤러리 객체를 사용할 수 없다. 

대신에 **HorizontalScrollView** 와 **ViewPager** 객체를 사용하도록 권장하고 있다.



## Margin / Padding

마진은 뷰와 부모 사이에 적용되며 

패딩은 뷰와 내용물 사이에 적용된다.

뷰의 입장에서 볼때 마진은 바깥 여백이고 패딩은 안쪽 여백이다. 패딩은 뷰의 내부이므로 크기에 포함되고 마진은 그렇지 않다. 

패딩은 뷰 자체의 속성이지만 마진은 레이아웃의 속성이다.



## BaseAdapter의 추상 메소드

BaseAdapter를 상속받은 후 4가지의 추상메소드가 없으면 빨간줄이 뜨며 에러가 난다.

생성한 Adapter클래스 안에 커서를 두고 **Ctrl + I** 를 누르면 자동완성된다.

```Java

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }

```

자동완성된 추상메소드 4개이다.





