# 20171007

## XML

#### layout_gravity = "bottom" is not working

LinearLayout  의 orientation vertical 에서는 bottom이 적용되지 않는다. horizontal에서면 적용이 된다.

이럴땐 RelativeLayout으로 바꿔 **android:layout_alignParentBottom="true"** 이렇게 해결했다!

**자세한 설명 **

http://uljavajoe.blogspot.kr/2012/11/xml-layoutgravity.html



