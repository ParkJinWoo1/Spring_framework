*Jsp08_MVC02*



메소드 하나를 url pattern 별로 나눠줘서 여러개의 메소드를 이용하여 경로를 정해줌

전에 했던 방식과 다른점은 메소드 별로 잘라줬음, 메소드안에 내용은 거의 같다고 봄.

//서블릿이라는 클래스에 오버라이드 된 메소드다

doGet()		읽기

doPost()		쓰기

doPut()		수정

doDelete()	삭제

  //doPut(), doDelete() 라는애는 서블릿에서 이미 만들어져 있다.
   //그래서 /delete를 쓰고 doDelete를 쓰면 안된다.





URI : 유니파이드 리소스 아이덴티파이어 자원식별자       

URL : 로케이션 .. 주소(경로)

URN : 자원이름



Rest(full) 리소스에 맞게 제대로 구분해서 사용하자   json 형태로 많이 요청하고 응답한다.

//rest, restfull : 위의 애들을 리소스에 맞게 구분해서 사용하자.





Single Page Application(SPA) 

//주소표시창은 그대로 있는데 put delete get post를 써서 하나의 페이지에서 값들을 변경 수정 삭제 가져오기한다.



Spring Tools 4 -> Spring boot 요기다가 View 연결해서 많이 사용함

Spring Tools 3 (Standalone)-> 이미 만들어진 프로젝트 유지보수를 위해 사용함





framework - 반쯤 만들어진 프로그램(사용자가 코드를 적용시키면 프로그램이 완성된다)

공통된 부분들은 만들어짐, 필요한 기능은 사용자가 입력해서 프로그램을 만들어야함...



Library - 다른사람들이 만들어서 배포해준 소스(코드)

Solution - 사용자가 필요한것을 해결해주는것 



Spring이 나오게 된 배경 -> EJB (Enterprise JavaBean) 옛날 서버들은 해당 서버에 맞게 프로젝트 코드를 각각 맞												춰서 써야함, 

​												POJO(Playing Old Java Object) 순수한 옛날 자바 객체(?) 아무것도 추가되지 않은 기												술로 자바를 만들어 객체를 생성함



'경량 컨테이너' Spring 처음 나올 때는 경량이였다... 지금은 무거운 편이고 node.js 나 python(django) 등이 경량 으로 침



<<꼭 외워야함 (Spring 중요 특징!!) >>



DI / IOC

AOP

OCP



dependency(jar) 관리 -> jar 파일들을 다운로드 받아준다(페이지 찾아가서 다운 안받아도 된다.)

버전 민감하니까 신경써야된다.

 https://search.maven.org/

https://mvnrepository.com/



bean : 자바 클래스 및 자바 객체를 뜻한다



클래스와 클래스끼리 : 강결합

MTest -> MessageBeanInterface (en,ko)  : 약결합



Mtest	-	ApplicationContext(IOC컨테이너)	-	MessageBeanInterface

​								(beans.xml)

IOC : 제어 역전(역전 제어/ 제어반전)

-> 객체 생성(spring) != 사용(우리 java 코드) (원래는 같았음)

dao 나 biz 만들 때 인터페이스 사용해야함(제대로 된 프록시 설정 가능)



폴더나 파일앞에 . 붙으면 숨김파일

ant, maven, gradle