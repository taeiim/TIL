# 20170707

## layout_weight / RecyclerView 

### layout_weight

쉽게 말해 비율이다.

전체 공간의 비중을 각각 나눠 갖는게 아니라 자신들의 공간은 다 계산하고 그 후 남는 공간을 weight에 맞게 가져감.

LinearLayout에게 배치공간을 알려준다.

만약 3개의 TextView가 있다 가정해보면

layout_weight을 쓰지 않으면 wrap_content로 최소한의 영역만 차지해서 나머지 공간은 남게된다. 그럴때 3개의 TextView에 모두 layout_weight="1" 이런식으로 지정해주면 공간이 남지않고 이쁘게 1:1:1씩 공간을 나눠가진다.

##### wrap_content가 아니면??

망한다. 

layout_weight과 match_parent를 같이 쓰면 안됨!!!!  (좌우 정렬일때 height에는 사용해도 상관없음, 수직 정렬일 때는 weidth에 사용해도 됨~)



### RecyclerView

ListView를 보완해서 나옴



##### Adapter 만들 때 이 3가지 인터페이스를 구현하지 않으면 빨간줄 뜸

```java
public class MyRecyclerAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
```



## 잡지식

### 안드로이드 스튜디오에서 getter/setter 메소드 자동완성

```Java
private String title;
private String writer;
private int image;
```

이런식으로 변수 선언 먼저 해주고

마우스로 싸악 해서 형광펜 색칠하듯이 싸악 하고

**Command+n** 누르면 된다. 물론 맥에서!!



