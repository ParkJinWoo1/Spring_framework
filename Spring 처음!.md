# Spring Git 활성화 시키자 project!!



* 경로 : C:\GitHub\Spring_framework
* 항상 배우면 올리자 진우야...



*Jsp08_MVC02*

# Spring framework 란?

* EJB(Enterprise JavaBean) 기반 개발에서 POJO(Plain Old Java Object) 기반 개발로 바뀐 것이다.

*  POJO 
  * 순수한 옛날 자바 객체라고 할 수 있다. 
  * 자바의 기본, 아무것도 다른 기술이 추가되지 않은 순수한 자바로 객체를 만들어서 사용함.
  * EJB는 이것저것 다른 서버와 연결해야되는 모듈을 만들어야해서 많은 기술이 요구되어 할일이 많았음.
  * Spring은 자바 기본만 알면 사용할 수 있게 만들어줌 -> 경랑 컨테이너
  * `웹, 콘솔, 어플, 스윙 gui어플 등 어디에도 적용가능한 framework`







## 서블릿이라는 클래스에 오버라이드 된 메소드





* 메소드 하나를 url pattern 별로 나눠줘서 여러개의 메소드를 이용하여 경로를 정해줌

* 전에 했던 방식과 다른점은 메소드 별로 잘라줬음, 메소드안에 내용은 거의 같다고 봄.



* doGet()		읽기

+ doPost()		쓰기

- doPut()		수정

- doDelete()	삭제

  //doPut(), doDelete() 라는애는 서블릿에서 이미 만들어져 있다.
   //그래서 /delete를 쓰고 doDelete를 쓰면 안된다.

<hr/>





- URI : 유니파이드 리소스 아이덴티파이어  -> 자원식별자       

- URL : 로케이션 .. -> 주소(경로)

- URN : 자원이름

<hr/>



## Rest(full)



- 리소스에 맞게 제대로 구분해서 사용하자   json 형태로 많이 요청하고 응답한다.

//rest, restfull : 위의 애들을 리소스에 맞게 구분해서 사용하자.



<hr/>



# Single Page Application(SPA)

 

* 주소표시창은 그대로 있는데 put delete get post를 써서 하나의 페이지에서 값들을 변경 수정 삭제 가져오기한다.

<hr/>

## 우리는 Tools3 사용



Spring Tools 4 -> Spring boot 요기다가 View 연결해서 많이 사용함

Spring Tools 3 (Standalone)-> 이미 만들어진 프로젝트 유지보수를 위해 사용함



<hr/>



# framework

 반쯤 만들어진 프로그램(사용자가 코드를 적용시키면 프로그램이 완성된다)

공통된 부분들은 만들어짐, 필요한 기능은 사용자가 입력해서 프로그램을 만들어야함...



# Library

* 다른사람들이 만들어서 배포해준 소스(코드)

# Solution

* 사용자가 필요한것을 해결해주는것 



# Spring이 나오게 된 배경

- EJB (Enterprise JavaBean) 옛날 서버들은 해당 서버에 맞게 프로젝트 코드를 각각 맞											춰서 써야함, 

* POJO(Playing Old Java Object) 순수한 옛날 자바 객체(?) 아무것도 추가되지 않은 기												      술로 자바를 만들어 객체를 생성함

+++



***경량 컨테이너 ***

Spring 처음 나올 때는 경량이였다... 

지금은 무거운 편이고 node.js 나 python(django) 등이 경량 으로 침



# <<꼭 외워야함 (Spring 중요 특징!!) >>



* DI(Dependency Injection) 

*  객체간의 결합을 느슨하게 하는 스프링의 핵심 기술

  의존관계를 관리하는 방법

  1. Construction Injection
  2. Setter Injection
  3. Field Injection

  <img src="C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20200813143937177.png" alt="image-20200813143937177" style="zoom: 67%;" />

  * 클래스와 클래스끼리 : 강결합

  

  

  <img src="C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20200813144049035.png" alt="image-20200813144049035" style="zoom: 50%;" />

  

  <img src="C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20200813144118431.png" alt="image-20200813144118431" style="zoom:50%;" />

  

  * MTest -> MessageBeanInterface (en,ko)  : 약결합

  

  

  / IOC(Inversion of Control)

* <img src="C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20200813144143943.png" alt="image-20200813144143943" style="zoom:50%;" />

* IOC : 제어 역전(역전 제어/ 제어반전)

  -> 객체 생성(spring) != 사용(우리 java 코드) (원래는 같았음)

  dao 나 biz 만들 때 인터페이스 사용해야함(제대로 된 프록시 설정 가능)

* AOP
  * Aspect Oriented Programming [ Aspect 지향 프로그래밍 구현을 제공해 ]

* OCP
  * Open-Colsed Principle [ 객체지향프로그래밍의 특징 4개 중에서 캡슐화 ]
    개발자가 건들이지 말아야할 곳은 Closed가 되어있고, 확장이 가능한 곳은 Open되어있어.
     개발자가 원하는 부분은 확장해서 개발할 수 있지.





# dependency(jar) 관리

 파일들을 다운로드 받아준다(페이지 찾아가서 다운 안받아도 된다.)

버전 민감하니까 신경써야된다.



# maven 페이지 경로!



 https://search.maven.org/

https://mvnrepository.com/

+++



# Spring 에서 bean 이란?

 자바 클래스 및 자바 객체를 뜻한다









# Tip



폴더나 파일앞에 . 붙으면 숨김파일

ant, maven, gradle <- maven 대신 나머지 사용해서 공부 해보세요!!!



---









<img src="C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20200813142801764.png" alt="image-20200813142801764" style="zoom:50%;" />

