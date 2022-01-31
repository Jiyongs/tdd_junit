# tdd_junit
### TDD (Test-Driven Development)
:x: as-is : 설계 > 구현 > 테스트   
:white_check_mark: to-be : 설계 > 테스트 > 구현
   
TDD가 필요한 이유?   
테스트를 먼저 작성하기 때문에 복잡한 기능을 하나의 함수에 구현하는 방식을 피할 수 있어 재사용성을 높임 (객체지향적 설계 가능)   
설계의 결함을 빨리 발견하여 설계 수정 시간을 단축시킴   
오류 발생 시 모듈단위 테스트가 가능하여 디버깅 시간을 단축시킴   
결론적으로, 초기에 테스트 작성시간은 오래 소요되지만 개발완료 후 코드/구조 수정 시 빠르게 대응할 수 있는 장점이 있다.



### JUnit Framework
TDD를 위한 Framework는 언어별로 다양하며, 이 중 JUnit은 java 전용 유닛 테스트에 사용한다.   
maven에서 아래와 같이 추가하여 사용
```
<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>
```



### TDD Pattern
테스트 코드를 작성할 때 'given-when-then' 패턴을 주로 쓴다. (LottoTest.java 참고)    
```
given(준비) : 테스트 시나리오에 필요한 값이 무엇인지 정의   
when(실행) : 시나리오의 진행 조건을 명시   
then(결과) : 시나리오로 인해 기대되는 결과
```



### Mock Object
테스트하려는 코드에서 실제 구현이 어려운 객체를 대신하여 동작하는 가짜 객체 (SimpleServiceMockTest.java 참고)      
maven에서 아래와 같이 추가하여 사용 
```
<!-- https://mvnrepository.com/artifact/org.mockito/mockito-all -->
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-all</artifactId>
    <version>1.10.19</version>
    <scope>test</scope>
</dependency>
```