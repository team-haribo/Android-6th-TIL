# Lazy Lists란?
정해지지 않은 많은양의 데이터를 화면에 띄울때 사용가능한 레이아웃
xml에서의 ListView RecyclerView와 비슷하다.
LazyRow(가로),LazyColumn(세로)

## LazyListScope
Lazy Composable은 다른 레이웃과 약간 다른 점이 존재하는데,<br>
그것은 @Composable 인스턴스가 아닌 LazyListScope으로 부터 DSL 블록을 제공한다는 점이다.
```kotlin
@Composable

```