# 20170916

### Error

```
Error:(88, 90) error: illegal character: '\u2028'
```

안드로이드 스튜디오에서 어플을 실행시키니 이런 오류가 떴다.

안드로이드 스튜디오에서는 보이지 않는 '|' 문자가 있어서 생긴 오류였다.

#### 해결

1. TextWrangler 을 설치한다.
2. 오류 코드 전체를 TextWrangler에 복사 붙여넣기 한다.
3.  TextWrangler View -> Text  Display -> Show Invisibles 을 누른다.
4. '|' 문자를 삭제한다.

