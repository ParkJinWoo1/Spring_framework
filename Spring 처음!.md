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



* **DI(Dependency Injection)**  -> *의존성 주입* ... spring이 객체를 만들면서 값을 전달(값을 주입)

*  객체간의 결합을 느슨하게 하는 스프링의 핵심 기술

  의존관계를 관리하는 방법

  1. Construction Injection	//<constructor-arg>
  2. Setter Injection                //<property>
  3. Field Injection

  <img src="C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20200813143937177.png" alt="image-20200813143937177" style="zoom: 67%;" />

  * 클래스와 클래스끼리 : 강결합

  

  

  <img src="C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20200813144049035.png" alt="image-20200813144049035" style="zoom: 50%;" />

  

  <img src="C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20200813144118431.png" alt="image-20200813144118431" style="zoom:50%;" />

  

  * MTest -> MessageBeanInterface (en,ko)  : 약결합

  

  

  / **IOC(Inversion of Control)** -> 제어 역전... 객체 생성을 spring이 해준다!

* <img src="C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20200813144143943.png" alt="image-20200813144143943" style="zoom:50%;" />

* IOC : 제어 역전(역전 제어/ 제어반전)

  -> 객체 생성(spring) != 사용(우리 java 코드) (원래는 같았음)

  dao 나 biz 만들 때 인터페이스 사용해야함(제대로 된 프록시 설정 가능)

* **AOP(Aspect Oriented Programming)**

  *  [ Aspect(관점) 지향 프로그래밍 구현을 제공해 ]

  * 관점기준으로 기능을 나눌거야 

  * **CCC(Cross Cutting Concern)** - 공통 관심사항 . Logging, Transaction 등 (공통적인 부분 추출)

  * **CC(Core Concern)** - 주 관심사항 (추출 후 남은 부분)

    * Join Point - 호출할 수 있는 부분(들어갈 수 있는 부분)
    * Point Cut - 어디에다가 CCC가 들어가야하는 부분을 알려주는것
    * Advice - CC랑 CCC랑 나눠놓고 CCC의 실제코드(CCC의 구현체)를 뜻함
    * Aspect(Advisor) - Advice 와 Point Cut이 합쳐진 것 -> 잘실행이 되야함!
    * Weaving - Aspect가 실제로 CC에 엮는 행동, 전체 역할을 진행 후 return 되는 행동

    

  * **proxy** - 가로채는 애, target을 호출하기전엔 before메소드 호출, target호출, target호출 후엔 after 메소드 호출

    * pointcut="execution(public * *(..))"	public에 return타입 상관없다(1이상) 메소드명 상관없음, 파라미터 0또는 그이상 ,,, 조건을 

    * ```xml
      <aop:config>
      		<aop:aspect ref="myAspect">
      			<aop:before method="before" pointcut="execution(public * com.test03.Man.classWork(..))"/>
      									<!--public 메소드고 return타입 상관없음, man의 classwork를 호출하여 파라미터가 0또는 1이상 이면 before 출력-->
      												
      			<aop:after method="after" pointcut="execution(public * com.test03.Woman.classWork(..))"/>
      									<!-- public에 리턴타입 상관없고, woman클래스가 가진 classwork메소드를 가진 파라미터 상관없고 after 출력 -->
      		</aop:aspect>
      	</aop:config>
      ```

      

    

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



# garbage collector

* 자바자체에서 사용하지 않는 데이터들을 정리해주는 애
* 개념을 쉽게 생각한다면 필요없는 쓰레기를 쓰레기통에 버린다! 라고 생각해보자





* factory-method 
  * 만들어주세요 라는 의미로 보자 어떤 메소드를 통해서 객체 생성

* getInstance
  *  다른이름으로 확인하는데 이 이름으로 객체를 생성할거고 이미 만들어져 있다면 만들어진 객체와 주소값이 동일



* bean
  *  태그 안에 생성자나 세터 태그 속성중 ref 는 참조하다라는 뜻을 가짐.



# (ApplicationContext.xml)namespaces탭

c : 생성자

```xml
<!-- c: constructor-arg -->
<bean id="lee" class="com.test05.Emp" c:name="이순신" c:salary="500만원"></bean>
<bean id="leess" class="com.test05.Engineer" c:emp-ref="lee" c:dept="기술팀"></bean>
```

p : property

```xml
<!-- p: property -->
<bean id="park" class="com.test05.Emp" p:name="박진우" p:salary="500만원"></bean>
<bean id="parks" class="com.test05.Developer" p:emp-ref="park" p:dept="개발팀"></bean>
```

---



* lazy-init 속성
  * 늦게 초기화
  * 해당 빈이 호출 될 때까지 해당빈을 만들지 않는다.
  * lazy-init을 안걸어주고 객체 생성 코드를 주석을 달아줘도 객체는 생성이 됨.

```xml
<bean id="ip" class="com.test07.ipTV"/>
		
	<bean id="samsong" class="com.test07.SamsongTV" lazy-init="true"></bean>
```

---



# inner bean , ref 속성태그란?

```xml
<!-- 9.setScore(List<Score> list) 호출 : 2개는 inner bean, 1개는 ref -->
		<property name="score">
		<list>
			<bean class="com.test01.Score">
				<property name="name" value="박진우"></property>
				<property name="kor" value="100"></property>
				<property name="eng" value="70"></property>
				<property name="math" value="80"></property>
			</bean>
			
			<bean class="com.test01.Score">
				<property name="name" value="병신"></property>
				<property name="kor" value="100"></property>
				<property name="eng" value="90"></property>
				<property name="math" value="80"></property>
			</bean>
			<ref bean="kim"/>
		</list>
		</property>

		<bean id="kim" class="com.test01.Score">
			<constructor-arg name="name" value="김선달"></constructor-arg>
			<constructor-arg name="kor" value="100"></constructor-arg>
			<constructor-arg name="eng" value="75"></constructor-arg>
			<constructor-arg name="math" value="34"></constructor-arg>
		</bean>
```

세터 안에 bean태그를 쓰고, 그안에 맞는 세터 각각 name, value 값을 넣어 list로 뽑아주는 예제

* inner bean은 생성자 인젝션, 세터 인젝션안에 사용할 수 있다.

---

@Annotation -> JVM이 일을 하기에 도와주는 기능





# Bean에서 autowire 속성

* autowire = "constructor"
  * Bean으로 등록된 Bean class의 인스턴스시 콜백되는 생성자에 선언된 파라미터 타입과
  * 일치하는 설정파일에 등록된 빈이 존재하면 해당빈의 인스턴스를 생성자에 주입한다.

* autowire ="byName"
  * Bean으로 등록된 Bean class의 인스턴스 직후 설정파일에 선언된 다른 빈의 인스턴스를 주입될 
  * 메서드 선언으로 취득 활용.(**메서드 선언시의 메서드 명 기준**)
  * public void set + '주입을 받으려하는 자원의 빈등록시 id 또는 name 속성값'(주입 대상 타입 선언)

* autowire ="byType"

  * Bean으로 등록된 Bean class의 인스턴스 직후 설정파일에 선언된 다른 빈의 인스턴스를 주입될 메서드 선언으로 취득 활용.(**메서드 선언시의 메서드 타입 기준**)

    public void set + '주입을 받으려하는 자원의 빈등록시 id 또는 name 속성값'(주입대상 타입 선언)

* autowire ="no"
  
* Bean을 자동연결하지 않습니다. 직접 ref를 이용하여 명시적으로 연결해주어야 합니다.
  
* autowire ="default"

  * ```
    기본 'autowire'값. 'bean'요소의 'autowire'속성에 대한 문서를 참조하십시오. 기본값은 "default"이며 중첩의 경우 외부 'beans'섹션에서 상속을 나타내며, 그렇지 않으면 "no"(즉, 외부 구동 자동 연결 없음)로 대체됩니다.
    ```

* 쌤 정리

  ```xml
  <!-- 
  		autowire 속성   byType 찾고 byName 찾음
  		1.default : 생성자의 할당할 type이 있는지 확인 후 (constructor) -> 없으면, setter에					서 type이 있는지 확인하여 할당 (byType)
  				**만일 기본생성자가 있으면, 기본생성자 호출
  				**@Autowired 라는 어노테이션이 이 방식으로 동작
  		2.byName : setter와 같은 이름(id/name)의 bean을 찾아서 자동 할당
  		3.byType : setter와 같은 type의 bean을 찾아서 자동할당
  		4.constructor : 생성자의 parameter와 같은 이름(type)의 bean을 찾아서 자동 할당
  						매치가 하나라도 안된다면 나머지 null 뜸.
  	 -->
  ```

  +++

  